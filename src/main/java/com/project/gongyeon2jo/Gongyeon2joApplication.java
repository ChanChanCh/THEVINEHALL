package com.project.gongyeon2jo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Gongyeon2joApplication extends SpringBootServletInitializer { // 상속
        public static void main(String[] args) {
            SpringApplication.run(Gongyeon2joApplication.class, args);
        }
        @Override // 상속, 오버라이드 => 톰캣 실행을 위해서
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
            return super.configure(builder);
        }

    }