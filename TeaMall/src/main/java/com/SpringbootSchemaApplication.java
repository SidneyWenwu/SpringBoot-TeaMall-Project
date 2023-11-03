package com;

import com.utils.oConvertUtils;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = {"com.dao"})
public class SpringbootSchemaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext application =SpringApplication.run(SpringbootSchemaApplication.class, args);
		Environment env = application.getEnvironment();
		String ip = InetAddress.getLocalHost().getHostAddress();
		String port = env.getProperty("server.port");
		String path = oConvertUtils.getString(env.getProperty("server.servlet.context-path"));
		log.info("\n----------------------------------------------------------\n\t" +
				"Application TeaMall is running! Access URLs:\n\t" +
				"Local: \t\thttp://localhost:" + port + path + "/"+"index.html"+"\n\t" +
				"External: \thttp://" + ip + ":" + port + path + "/"+"index.html"+"\n\t" +
				"----------------------------------------------------------");
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SpringbootSchemaApplication.class);
    }


}
