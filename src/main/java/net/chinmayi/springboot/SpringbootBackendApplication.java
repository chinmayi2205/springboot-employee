package net.chinmayi.springboot;

import net.chinmayi.springboot.model.Employee;
import net.chinmayi.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}


	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//          Employee employee = new Employee();
//		  employee.setFirstName("Chinmayi");
//		  employee.setLastName("Khachane");
//		  employee.setEmailId("Chinmayi@gmail.com");
//		  employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Shubham");
//		employee1.setLastName("Walke");
//		employee1.setEmailId("Shubham@gmail.com");
//		employeeRepository.save(employee1);
	}
}
