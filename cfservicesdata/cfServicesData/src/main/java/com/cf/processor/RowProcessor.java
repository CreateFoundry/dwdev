package com.cf.processor;

import org.apache.camel.Processor;

import com.cf.customer.CustomerDetails;

import java.util.Map;
import org.apache.camel.Exchange;

public class RowProcessor  implements Processor {

	public void process(Exchange exchange) throws Exception {
        Map<String, Object> row = exchange.getIn().getBody(Map.class);
        System.out.println("Processing " + row);
        CustomerDetails customerDetails = new CustomerDetails();
         
        customerDetails.setFirstname((String) row.get("firstname"));
        customerDetails.setLastname((String) row.get("lastname"));
        customerDetails.setEmail((String) row.get("email"));
        customerDetails.setMobile((String) row.get("mobile"));
        customerDetails.setLandline((String) row.get("landline"));
        customerDetails.setBuildingname((String) row.get("buildingname"));
        customerDetails.setStreetname((String) row.get("streetname"));
        customerDetails.setDoornumber((String) row.get("doornumber"));
        customerDetails.setArea((String) row.get("area"));
        customerDetails.setCity((String) row.get("city"));
        customerDetails.setState((String) row.get("state"));
        customerDetails.setPostcode((Integer) row.get("postcode"));
        
         
        exchange.getOut().setBody(customerDetails);
    }
	
	

}
