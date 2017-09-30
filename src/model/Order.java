package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
 @AllArgsConstructor
public class Order {
	
	private String item_Number;
	private String description; 
	private String price_Each; 
	private String first_Name; 
	private String last_Name; 
	private String middle_Initial; 
	private String shipping_Address; 
	private String credit_Card; 
	private String credit_Card_Number;
	
}
