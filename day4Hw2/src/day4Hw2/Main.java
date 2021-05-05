package day4Hw2;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Bilal","Yýlmaz","00000000000",LocalDate.of(2001, 6, 12)));

	}

}
