import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashing {
     public static void main(String[] args) {
         HashMap<String, Integer> student = new HashMap<String, Integer>();   // creating hashmap , hashmap take 2 values key and associated value 
         student.put("priya", 3);                        // adding student info. using put method
         student.put("puja", 2);
         student.put("rohit", 7);
         Set<String> data = student.keySet();            // we can iterate over hadh map using set method and entry concept
         for(String i:data){
             System.out.println(student.get(i));         // get method is used to fetch the data
             System.out.println(i.hashCode()%10);
         }
         Set<Map.Entry<String, Integer>> data1 = student.entrySet();  // if we want to print rollno. and name then entryset concept is used
         for(Map.Entry<String, Integer> i:data1){                     // iterating over the hash map
             System.out.println(i.getKey()+" "+i.getValue());         // get key will give integer value and getvalue give string value
         }

        
    } 
    
}
