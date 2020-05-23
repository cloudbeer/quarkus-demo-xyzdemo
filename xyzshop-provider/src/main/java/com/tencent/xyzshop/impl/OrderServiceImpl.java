package com.tencent.xyzshop.impl;

import com.tencent.xyzshop.OrderService;
import com.tencent.xyzshop.model.Goods;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;


//@Path("/order")
public class OrderServiceImpl implements OrderService {
    @Override
    public Goods save(Goods goods) {
        goods.setId(100L);
        return goods;
    }

    @Override
    public Goods get(long goodsId) {
        Goods goods = new Goods();

        goods.setId(goodsId);
        goods.setPrice(12111);
        goods.setStock(20);
        goods.setTitle("Tencent TV M100");
        return goods;
    }

    @Override
//    @GET
//    @Path("/hello")
//    @Produces("text/plain")
    public String sayHello() {
        return "世界，你好。 Hello world";
    }
}
