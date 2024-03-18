package com.ruoyi.customer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.customer.domain.CustomerOrder;
import com.ruoyi.customer.service.ICustomerOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单管理Controller
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/customer/order")
public class OrderController  extends BaseController {
  
  @Autowired
  private ICustomerOrderService sysOrderService;

  @GetMapping("/list")
    public TableDataInfo list(CustomerOrder sysOrder)
    {
    startPage();
    Long userId = (long) 1;
    sysOrder.setUserId(userId);
    List<CustomerOrder> list = sysOrderService.selectSysOrderList(sysOrder);
    return getDataTable(list);
  }

}
