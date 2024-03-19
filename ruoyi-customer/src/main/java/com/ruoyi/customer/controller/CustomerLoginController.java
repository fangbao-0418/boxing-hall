package com.ruoyi.customer.controller;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginBody;
import com.ruoyi.framework.security.context.UserContextHolder;
import com.ruoyi.framework.web.domain.UserInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/customer")
public class CustomerLoginController {
    /**
     * 登录方法
     * 
     * @param loginBody 登录信息
     * @return 结果
     */
    // @PostMapping("/login")
    @GetMapping("/login")
    public AjaxResult login()
    {
        AjaxResult ajax = AjaxResult.success();
        UserInfo userInfo = new UserInfo();
        userInfo.setId("1111");
        UserContextHolder.setContext(userInfo);
        // 生成令牌
        // String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
        //         loginBody.getUuid());
        // ajax.put(Constants.TOKEN, token);
        ajax.put("id", userInfo.getId());
        return ajax;
    }
    @GetMapping("/login/userInfo")
    public AjaxResult loginInfo()
    {
        AjaxResult ajax = AjaxResult.success();
      
        UserInfo userInfo = UserContextHolder.getContext();
        // 生成令牌
        // String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
        //         loginBody.getUuid());
        // ajax.put(Constants.TOKEN, token);
        ajax.put("id", userInfo.getId());
        return ajax;
    }
  // public String login(String username, String password, String code, String uuid)
  // {
  //     // 验证码校验
  //     validateCaptcha(username, code, uuid);
  //     // 登录前置校验
  //     loginPreCheck(username, password);
  //     // 用户验证
  //     Authentication authentication = null;
  //     try
  //     {
  //         UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
  //         AuthenticationContextHolder.setContext(authenticationToken);
  //         // 该方法会去调用UserDetailsServiceImpl.loadUserByUsername
  //         authentication = authenticationManager.authenticate(authenticationToken);
  //     }
}
