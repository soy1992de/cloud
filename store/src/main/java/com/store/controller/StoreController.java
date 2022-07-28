package com.store.controller;

import com.store.entity.StoreEntity;
import com.store.model.CommonResult;
import com.store.model.StoreRequest;
import com.store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("store")
public class StoreController {


    @Autowired
    private OrderService orderService;

    @RequestMapping("update/sotre")
    public CommonResult updateStore(@RequestBody StoreRequest request){
        StoreEntity entity =new StoreEntity();
        entity.setProductId(request.getProductId());
        entity.setResidue(request.getNumber());
        entity.setUsed(request.getNumber());
         orderService.updateStore(entity);
        return  new CommonResult<StoreEntity>(200,"成功",null);
    }
}
