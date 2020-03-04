package com.gxgeek.springboot.elasticsearch.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HttpPutFormContentFilter;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by gx
 * Date: 2017-09-13
 * Time: 21:41
 */
@Configuration
public class ElasticsearchConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {
        //设置端口名字
        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9300
        );
        //设置名字
        Settings settings = Settings.builder().put("cluster.name","wali").build();

        TransportClient client =  new PreBuiltTransportClient(settings);
        client.addTransportAddress(node);
        return client;
    }
//    @Bean
//    public FilterRegistrationBean someFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new HttpPutFormContentFilter());
//        registration.addUrlPatterns("/*");
//        registration.setName("HttpMethodFilter");
//        return registration;
//    }



}
