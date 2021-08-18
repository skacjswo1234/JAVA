package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex13 {
	 public void main(String args[]) {
		 	
	Customer customer1 = new Customer ( "010-1473-3698","현금");
	Customer customer2 = new Customer("010-1598-7894", "카드");
	Customer customer3 = new Customer ("010-4569-1236", "카드");
	Customer customer4 = new Customer("010-2586-2584", "현금");
	Customer customer5 = new Customer ("010-7418-5296", "현금");
	
	Map<String, Customer> customerList = new HashMap<>();
	customerList.put("홍길동", customer1);
	customerList.put("김철수", customer2);
	customerList.put("고영희", customer3);
	customerList.put("유노윤호", customer4);
	customerList.put("황광희", customer5);
	
// 삭제 
//	Set<String> customerNameSet = customerList.keySet();
//	for(String key : keySet2) {
//		customerList.clear(key);

	
	
		Set<String> keySet = customerList.keySet();
	Iterator<String> iterator = keySet.iterator();
	while(iterator.hasNext()) {
		String key = iterator.next();
		
// for each 문
		Set<String> keySet1 = customerList.keySet();
		for(String key1 : keySet1) {
			Customer c = customerList.get(key1);
			System.out.println(c.getTel());
			System.out.println(c.getPaymentMethod());
		}
		
}
}
}