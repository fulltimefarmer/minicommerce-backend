package org.max.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableCaching
public class CacheConfig {

	private static String CACHE_SIGN_KEYS = "";
	private static String CACHE_DICTIONARIES = "";
	private static String CACHE_OAUTH2_TOKENS = "";
	
	
//	@Primary
//	@Bean
//	public CacheManager cacheManager() {
//		CaffeineCacheManager cacheManager = new CaffeineCacheManager(CACHE_SIGN_KEYS, CACHE_DICTIONARIES, CACHE_OAUTH2_TOKENS);
//		
//		return cacheManager;
//	}
}
