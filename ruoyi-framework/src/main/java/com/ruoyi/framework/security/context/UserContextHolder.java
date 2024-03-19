package com.ruoyi.framework.security.context;

import com.ruoyi.framework.web.domain.UserInfo;

public class UserContextHolder {
  private static final ThreadLocal<UserInfo> contextHolder = new ThreadLocal<>();

  public static UserInfo getContext()
  {
      return contextHolder.get();
  }

  public static void setContext(UserInfo context)
  {
      contextHolder.set(context);
  }

  public static void clearContext()
  {
      contextHolder.remove();
  }
}
