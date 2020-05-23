package com.tencent.xyzshop;

import com.tencent.xyzshop.model.Goods;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/order")
public interface OrderService {

    @POST
    @Produces("application/json")
    Goods save(Goods goods);

    @GET
    @Path("/id/{goodsId}")
    @Produces("application/json")
    Goods get(long goodsId);


    @GET
    @Path("/hello")
    @Produces("text/plain")
    String sayHello();
}
