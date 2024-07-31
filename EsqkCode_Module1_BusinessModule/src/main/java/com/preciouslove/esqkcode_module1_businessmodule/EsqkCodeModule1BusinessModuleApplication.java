package com.preciouslove.esqkcode_module1_businessmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.preciouslove.esqkcode_module1_businessmodule", "com.preciouslove.esqkcode_module2_config"})
public class EsqkCodeModule1BusinessModuleApplication {

          public static void main(String[] args) {
                    SpringApplication.run(EsqkCodeModule1BusinessModuleApplication.class, args);
          }

}
