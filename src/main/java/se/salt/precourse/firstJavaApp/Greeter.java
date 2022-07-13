package se.salt.precourse.firstJavaApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Greeter {
  private static String greet(String namePassedIn) {return "Welcome to SALT, " + namePassedIn;
}

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    System.out.print("When does the course start? ");

    BufferedReader dateReader = new BufferedReader(new InputStreamReader(System.in));
    String dateStr = dateReader.readLine();

    LocalDate date = LocalDate.parse(dateStr);
    LocalDate nowDate = LocalDate.now();

    String greeting = greet(name);
    System.out.println(greeting);
    System.out.println("Today is " + (nowDate.datesUntil(date).count()) + " days left until course starts");
  }
}
