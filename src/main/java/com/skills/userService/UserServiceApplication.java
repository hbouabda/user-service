package com.skills.userService;

import com.skills.entity.User;
import com.skills.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableDiscoveryClient
@ComponentScan({"com.skills"})
@EntityScan("com.skills.entity")
@EnableJpaRepositories("com.skills.repository")
public class UserServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();

		User user1 = User.builder().firstName("hamza").lastName("bouabda").tel(21611422L).build();
		User user2 = User.builder().firstName("amine").lastName("rezgui").tel(22659081L).build();
		User user3 = User.builder().firstName("ismail").lastName("cherif").tel(21600411L).build();
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);

		userRepository.findAll().forEach( s -> System.out.println(s.getFirstName()));
	}
}
