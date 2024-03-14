package com.ruoyi.system.utils;

public class OrderNumberGenerator {
 
  private static final int BITS_PER_CHARACTER = 5;
  private static final long MAX_IP_BITS = (1L << BITS_PER_CHARACTER) - 1;
  private static final long TIME_LEFT_SHIFT = BITS_PER_CHARACTER * 3;
  private static final long SEQ_LEFT_SHIFT = BITS_PER_CHARACTER * 2;
  private static final long MACHINE_LEFT_SHIFT = BITS_PER_CHARACTER;

  private static long dataCenterId = 0L;
  private static long workerId = 0L;
  private static long sequence = 0L;
  private static long lastTimestamp = -1L;

  public static synchronized String generateOrderNumber() {
      long timestamp = timeGen();
      if (timestamp < lastTimestamp) {
          try {
              throw new Exception("时间戳比上一个ID生成的时间戳还要小，故意产生异常");
          } catch (Exception e) {
              e.printStackTrace();
          }
      }

      if (lastTimestamp == timestamp) {
          sequence = (sequence + 1) & MAX_IP_BITS;
          if (sequence == 0) {
              timestamp = tilNextMillis(lastTimestamp);
          }
      } else {
          sequence = 0L;
      }

      lastTimestamp = timestamp;

      return String.valueOf(timestamp) + String.valueOf(dataCenterId) + String.valueOf(workerId) + String.valueOf(sequence);
  }

  protected static long tilNextMillis(long lastTimestamp) {
      long timestamp = timeGen();
      while (timestamp <= lastTimestamp) {
          timestamp = timeGen();
      }
      return timestamp;
  }

  protected static long timeGen() {
      return System.currentTimeMillis();
  }

  // 测试方法
  public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
          System.out.println(generateOrderNumber());
      }
  }
}