package com.muccio.aula;

import com.muccio.aula.entities.Employee;
import com.muccio.aula.entities.Order;
import com.muccio.aula.services.OrderService;
import com.muccio.aula.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	private SalaryService salaryService;
	private OrderService orderService;

	public AulaApplication(SalaryService salaryService, OrderService orderService) {
		this.salaryService = salaryService;
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.00);
		System.out.println(salaryService.netSalary(employee));
		Order order = new Order(1034, 800.00, 10.00);
		System.out.println(orderService.total(order));
	}
}
