package com.store.service;

import com.store.dao.StoreDao;
import com.store.entity.StoreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private StoreDao storeDao;


    public  Integer updateStore( StoreEntity entity){
        storeDao.updateStore(entity);
        return 200;
    }
}
