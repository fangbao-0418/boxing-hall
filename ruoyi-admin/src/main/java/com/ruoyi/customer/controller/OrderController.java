package com.ruoyi.customer.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.AjaxResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证码操作处理
 * 
 * @author ruoyi
 */
@RestController
public class OrderController {
  @GetMapping("/order-test")
  public AjaxResult getCode(HttpServletResponse response) throws IOException
  {
    AjaxResult ajax = AjaxResult.success();
    ajax.put("a", "b3");
    ajax.put("admin", "b3");
    return ajax;
  }
}
