package com.javatpoint.server.main;

import java.util.*;


import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
import org.springframework.plugin.core.SimplePluginRegistry;

import springfox.documentation.spi.DocumentationType;  
import springfox.documentation.spring.web.plugins.Docket;  
import springfox.documentation.swagger2.annotations.EnableSwagger2; 

@Configuration  
//Enable Swagger  
@EnableSwagger2  
public class SwaggerConfig   
{  
//creating bean  
	@Bean  
	public Docket api()  
	{  
		//creating constructor of Docket class that accepts parameter DocumentationType  
		return new Docket(DocumentationType.SWAGGER_2);
	}  
	
	//not required . swagger ra spring boot hateoas ko version mismatch 
    @Bean
    public LinkDiscoverers discoverers() 
    {
        List<LinkDiscoverer> plugins = new ArrayList<>();
        plugins.add(new CollectionJsonLinkDiscoverer());
        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));

    }
	
//    @Bean
//    public LinkDiscoverers discoverers() {
//        List<LinkDiscoverer> plugins = new ArrayList<>();
//        plugins.add(new CollectionJsonLinkDiscoverer());
//        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));
//
//    }
	

	
}  