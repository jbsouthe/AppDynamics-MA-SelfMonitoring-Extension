//keeping this around for reference, this is how you can quickly test java logic
//run with any modern jvm by typing: "java Test.java"
import java.util.*;

public class Test {
public static void main( String... args ) {

List<String> bigList = new ArrayList<>();

System.out.println("Free  "+ Runtime.getRuntime().freeMemory());
System.out.println("Used  "+ Runtime.getRuntime().totalMemory());
System.out.println("Total "+ Runtime.getRuntime().maxMemory());
long usedPercentage = (long) (Runtime.getRuntime().totalMemory() /(float) Runtime.getRuntime().maxMemory() * 100);
System.out.println("Used% "+ usedPercentage );

} 

}
