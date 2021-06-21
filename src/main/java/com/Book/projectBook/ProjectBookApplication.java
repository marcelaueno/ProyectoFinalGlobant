package com.Book.projectBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectBookApplication {

	public static void main(String[] args) { SpringApplication.run(ProjectBookApplication.class, args);
	}

	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // hace referencia a libreria
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
