package com.imatia.ws.core.rest;

import com.imatia.api.core.service.IRepartoService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repartos")
@ComponentScan(basePackageClasses = {com.imatia.api.core.service.IRepartoService.class})
public class RepartoRestController extends ORestController<IRepartoService> {

    @Autowired
    private IRepartoService repartoService;

    @Override
    public IRepartoService getService() {
        return this.repartoService;
    }
}