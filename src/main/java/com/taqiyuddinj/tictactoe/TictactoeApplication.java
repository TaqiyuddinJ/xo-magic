package com.taqiyuddinj.tictactoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taqiyuddinj.tictactoe.view.ConsoleMenuView;

@SpringBootApplication
public class TictactoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TictactoeApplication.class, args);
		ConsoleMenuView.showMenuWithResult();
	}

}
