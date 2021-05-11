package interfaceAbstractDemo.Concrete;

import java.sql.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

import Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
      
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());//BaseCustomerManager abstract olduðu için sadece Starbucks ve Nero newlenebiliyor.
		Customer customer = new Customer();
		customer.DateOfBirth=new Date(0000,0,00);
		customer.firstName="Serpil";
		customer.lastName="Akkurt";
		customer.nationalityId="0000000000";
	    customerManager.Save(customer);
	}

}
