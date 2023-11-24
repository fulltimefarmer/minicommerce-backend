package org.max.commerce.config;

import com.mybatisflex.core.tenant.TenantFactory;
import org.max.commerce.tenant.MyTenantFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public TenantFactory tenantFactory(){
        return new MyTenantFactory();
    }
}
