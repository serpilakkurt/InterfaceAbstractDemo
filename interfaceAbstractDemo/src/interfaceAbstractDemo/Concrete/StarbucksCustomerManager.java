package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		try {
			if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		   }
		}catch (Exception e) {
			System.out.println("Not a valid person.");
		}
		
		
	}

	
}
