package service;

import java.util.HashMap;

import model.Customer;

public class CustomerService {
	private HashMap<String, Customer> customerMap;
	public CustomerService(){
		
		customerMap = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001","id001","alpha"));
		addCustomer(new Customer("id002","id002","bravo"));
		addCustomer(new Customer("id003","id003","crown"));
		addCustomer(new Customer("id004","id004","delta"));
		addCustomer(new Customer("id005","id005","ego"));
		
	}
	public Customer findCustomer(String id){
		if (id == null)
			return null;
		else
			return customerMap.get(id);		
	}
	
	public void addCustomer(Customer customer){
		customerMap.put(customer.getId(),customer);
	}
}
