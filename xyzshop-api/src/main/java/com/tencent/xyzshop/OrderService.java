package com.tencent.xyzshop;

import com.tencent.xyzshop.model.Goods;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/open/order")
@RegisterRestClient(configKey = "xyzshop-provider")
public interface OrderService {

    @POST
    @Path("/save")
    @Produces("application/json")
    void save(Goods goods);
}
