package com.order.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("store-service")
public interface SoreService {

}
