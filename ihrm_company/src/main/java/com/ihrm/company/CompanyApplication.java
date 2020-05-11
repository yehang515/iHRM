package com.ihrm.company;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.ihrm.company")
@EntityScan(value = "com.ihrm.domain.company")
public class CompanyApplication {
}
