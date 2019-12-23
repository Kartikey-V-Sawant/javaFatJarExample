import java.util.Scanner;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;

public class FatJarEg {
    public static void main(String args[]){

        /* PID OF THIS PROGRAM */
        RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
        String jvmName = runtimeBean.getName();
        System.out.println("JVM Name = " + jvmName);
        long pid = Long.valueOf(jvmName.split("@")[0]);
        System.out.println("JVM PID  = " + pid);
        /* PID OF THIS PROGRAM */

        System.out.println("Enter 2 nos");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int t1 = scanner.nextInt();

int sum = t + t1;
        System.out.println("   "+sum);
    }
}
