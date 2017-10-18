package com.example.demo;/**
 * Created by Penghy on 2017/6/18.
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 *
 * @author penghy
 * @create 2017-06-18 12:02
 **/
public class SpringBootStartApplication extends SpringBootServletInitializer {
   @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(DemoApplication.class);
    }
}
