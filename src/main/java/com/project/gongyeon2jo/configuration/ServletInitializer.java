package com.project.gongyeon2jo.configuration;

import com.project.gongyeon2jo.Gongyeon2joApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Gongyeon2joApplication.class);
    }

}
