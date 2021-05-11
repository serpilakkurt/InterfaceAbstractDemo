package Adapters;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;


public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			
			return client.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId) , customer.firstName, customer.lastName,customer.DateOfBirth.getYear());
			
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			return false;
		} catch (RemoteException e) {
			
			e.printStackTrace();
			return false;
		}
	}

}
