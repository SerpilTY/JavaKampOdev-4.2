package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Abstract.ICustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");

		}

	}
}
