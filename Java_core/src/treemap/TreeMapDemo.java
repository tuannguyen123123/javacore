package treemap;

import java.util.*;


public class TreeMapDemo {
	
	 public static void main(String args[]) {
	 TreeMap<String,Double> tm = new TreeMap<>();

     tm.put("Zara", new Double(3434.34));
     tm.put("Mahnaz", new Double(123.22));
     tm.put("Ayan", new Double(1378.00));
     tm.put("Daisy", new Double(99.22));
     tm.put("Qadir", new Double(-19.08));
     

     Set set = tm.entrySet();

     Iterator i = set.iterator();
     // Display elements
     while(i.hasNext()) {
        Map.Entry me = (Map.Entry)i.next();
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
     }
    
     System.out.println(""+tm.isEmpty()+tm.remove(2)+tm.size());
     // Send 1000 into Zara account
     double balance = ((Double)tm.get("Zara")).doubleValue();
     tm.put("Zara", new Double(balance + 1000));
     System.out.println("Balance hien tai cua Zara la: " +
     tm.get("Zara"));
     
     System.out.println("Check that the set has an element with no element  " + tm.isEmpty());
		System.out.println("Delect   " + tm.remove(2));
		System.out.println("Export to Ma    " + tm.hashCode());
  }
}
