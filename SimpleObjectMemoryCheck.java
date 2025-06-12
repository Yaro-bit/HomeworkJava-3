// Simple method: measure memory usage before and after creating an object using Runtime.getRuntime().
// This is a basic approach to estimate object size in bytes, but it is not very precise.

import java.util.Scanner;

public class SimpleObjectMemoryCheck {

    public static void main(String[] args) {
       
       
       //total, we use run.totalMemory() method from Runtime to get bytes of memory
       Runtime run = Runtime.getRuntime();
       run.gc(); //Garbage Collector (GC)reclaims memory from unused objects on undefined time
       
       long totalMemoryBytes = run.totalMemory();
       long totalMemoryKiloBytes = totalMemoryBytes/1024;
       long totalMemoryMegaBytes = totalMemoryKiloBytes/1024;
      
       System.out.println("Total memory: "+totalMemoryMegaBytes+" MB");
       
       
       //before
       long usedMemoryBytesBefore = totalMemoryBytes - run.freeMemory();
       System.out.println("Memory before creating object: "+usedMemoryBytesBefore/(1024*1024)+" MB");
       
       //create object
       Scanner scan = new Scanner(System.in);
       
       //used after
       long usedMemoryBytesAfter =totalMemoryBytes - run.freeMemory();
       System.out.println("Memory after creating object: "+usedMemoryBytesAfter/(1024*1024)+" MB");
       
       
        
    }
}
