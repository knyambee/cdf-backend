package com.knyambe.cdfbackend;

import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CdfBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdfBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(final UserRepository userRepository) {

		return new CommandLineRunner() {
			public void run(String... strings) throws Exception {
				userRepository.save(new User("2c1b8963-902d-49bb-91e6-ed28f515a967", "wardCommittee"));  // ward
				userRepository.save(new User("0b7a3283-46b6-474f-a695-97ef70d49f89", "constituencyCommittee")); // constituency
				userRepository.save(new User("827af172-cf21-4dba-9edd-b9fa100a9dfd", "localGov"));  // local government
				userRepository.save(new User("55d7f2e6-4850-40b5-964b-7e602844676a", "minister"));   // minister
			}
		};
	}

}
