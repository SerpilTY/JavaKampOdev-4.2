package InterfaceAbstractDemo.Abstract;

import InterfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanưna eklendi: " + customer.getFirstName());

	}

}
