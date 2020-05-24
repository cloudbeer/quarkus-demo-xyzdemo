package com.tencent.xyzshop;

import com.tencent.xyzshop.model.Goods;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

@Path("/order")
@RegisterRestClient(configKey = "xyzshop-provider")
public interface OrderService {

    @POST
    @Produces("application/json")
    Goods save(Goods goods);

    @GET
    @Path("/id/{goodsId}")
    @Produces("application/json")
    Goods get(@PathParam long goodsId);


    @GET
    @Path("/hello")
    @Produces("text/plain")
    String sayHello();
}
