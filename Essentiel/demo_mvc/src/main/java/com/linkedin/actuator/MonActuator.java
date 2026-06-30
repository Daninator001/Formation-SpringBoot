package com.linkedin.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id=("endpointun"))
public class MonActuator {
    @ReadOperation
    public EndpointUn getEndpointUn(){
        EndpointUn endpointUn = new EndpointUn();
        endpointUn.setMessage("Mon nouvel actuator");
        return endpointUn;
    }

}
