// Use more accurate method (compared to using Runtime.getRuntime()):
// Use the JOL (Java Object Layout) library to analyze the memory layout of Java objects.
// Requires adding JOL as a Maven dependency.
// Provides detailed insights into the internal structure and memory footprint of objects.
import org.openjdk.jol.info.ClassLayout;

public class JOLObjectLayoutExample {

    public static void main(String[] args) {
		MyObject obj = new SimpleObject();
		System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
	
	static class Simple {
    	int x;
    	double y;
	}
}
