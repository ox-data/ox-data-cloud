package org.dshubs.odc;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangxian
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class OdcAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdcAdminApplication.class, args);
    }

}
