package com.iqmsoft.admin;

import com.iqmsoft.admin.model.Car;
import com.iqmsoft.admin.util.Utils;
import java.util.List;
import javax.inject.Inject;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AdminBootApplication {
	@Inject
	private Utils utils;

    @Bean
    public List<Car> getCars() {
        return utils.getCars();
    }
	
}
