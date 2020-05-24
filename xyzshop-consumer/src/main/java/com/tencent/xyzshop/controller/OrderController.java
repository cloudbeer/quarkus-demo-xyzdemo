package com.tencent.xyzshop.controller;

import com.tencent.xyzshop.OrderService;
import com.tencent.xyzshop.model.Goods;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/open/order")
public class OrderController {

    @Inject
    @RestClient
    OrderService orderService;

    @GET
    @Path("/id/{goodsId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Goods getGoods(@PathParam long goodsId){
        Goods goods =  orderService.get(goodsId);
        goods.setTitle("consumer 给你打8折：" + goods.getTitle() + ": " + goods.getPrice() * 0.8);
        return goods;
    }
}
