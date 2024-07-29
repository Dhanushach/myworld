package java_Collections1;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
public static void main(String []args) {
	Set<Comparable> s1=new HashSet<Comparable>();
	s1.add(Integer.valueOf(20));
	s1.add(new String("Dhanusha"));
	s1.add(Character.valueOf('A'));
	for(Object hs:s1) {
	System.out.println(hs);
		
	}
}
}
