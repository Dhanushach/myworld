package java_Collections1;
import java.util.HashMap;
import java.util.Map;
public class Map1 {
public static void main(String []args) 
{
Map s1=new HashMap();
s1.put(01, "Dhanu");
s1.put(02,"Ramya");
s1.put("a", 4.5);
System.out.println(s1);
for(Object a:s1.entrySet())
{
Map.Entry entry = (Map.Entry)a;
Object value = entry.getValue();
System.out.println("Value =>" + value);
}
}
}
