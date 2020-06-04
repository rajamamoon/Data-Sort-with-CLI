package datasort;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataSort {
    
public static int[] Selection(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
public static int[] Insertion(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
@SuppressWarnings("empty-statement")
public static void main(String a[]) throws FileNotFoundException {      
        Scanner scanner = new Scanner(new File("ints10000.dat"));
         Scanner scanner1 = new Scanner(new File("ints20000.dat"));
          Scanner scanner2 = new Scanner(new File("ints40000.dat"));
           Scanner scanner3 = new Scanner(new File("ints80000.dat"));
            Scanner scanner4 = new Scanner(new File("ints160000.dat"));
             Scanner scanner5 = new Scanner(new File("ints320000.dat"));
              Scanner scanner6 = new Scanner(new File("ints640000.dat"));
               Scanner scanner7 = new Scanner(new File("ints1280000.dat"));
                Scanner scanner8 = new Scanner(new File("ints2560000.dat"));
                 Scanner scanner9 = new Scanner(new File("ints5120000.dat"));
                  Scanner scanner10 = new Scanner(new File("ints10240000.dat"));
 
                        MyQuickSort sorter = new MyQuickSort(); 
                       
                        int[] data = new int[10000];
                        int[] data1 = new int[20000];
                        int[] data2 = new int[40000];
                        int[] data3 = new int[80000];
                        int[] data4 = new int[160000];
                        int[] data5 = new int[320000];
                        int[] data6 = new int[640000];
                        int[] data7 = new int[1280000];
                        int[] data8 = new int[2560000];
                        int[] data9 = new int[5120000];
                        int[] data10 = new int[10240000];
                
                      System.out.println("Adding Arrays 10000");
                        
            int z = 0;
            while (scanner.hasNextInt()) {
                data[z] = scanner.useDelimiter(" ").nextInt();

                 z++;
                         }
             System.out.println("Done");
              System.out.println("Adding Arrays 20000");
            int b=0;
	while (scanner1.hasNextInt()) {
                data1[b] = scanner1.useDelimiter(" ").nextInt();
                     
                 b++;
                   }
         System.out.println("Done");
               System.out.println("Adding Arrays 40000");
        int c=0;
	while (scanner2.hasNextInt()) {
                data2[c] = scanner2.useDelimiter(" ").nextInt();
                  c++;
                   }
         System.out.println("Done");
          System.out.println("Adding Arrays 80000");
        int d=0;
        while (scanner3.hasNextInt()) {
                data3[d] = scanner3.useDelimiter(" ").nextInt();
                d++;
                   }
         System.out.println("Done");
            System.out.println("Adding Arrays 160000");
	int e=0;
	while (scanner4.hasNextInt()) {
                data4[e] = scanner4.useDelimiter(" ").nextInt();
                 
                 e++;
                   }
         System.out.println("Done");
           System.out.println("Adding Arrays 320000");
       int f=0;
	while (scanner5.hasNextInt()) {
                data5[f] = scanner5.useDelimiter(" ").nextInt();
                  
               f++;
                   }
         System.out.println("Done");
             System.out.println("Adding Arrays 640000");
	int g=0;
	while (scanner6.hasNextInt()) {
                data6[g] = scanner6.useDelimiter(" ").nextInt();
              
                 g++;
                   }
         System.out.println("Done");
           System.out.println("Adding Arrays 1280000");
        int h=0;
	while (scanner7.hasNextInt()) {
                data7[h] = scanner7.useDelimiter(" ").nextInt();
             
                 h++;
                   }
         System.out.println("Done");
                  System.out.println("Adding Arrays 2560000");
	int k=0;
	while (scanner8.hasNextInt()) {
                data8[k] = scanner8.useDelimiter(" ").nextInt();
            
                 k++;
                   }
         System.out.println("Done");
            System.out.println("Adding Arrays 5120000");
	int l=0;
	while (scanner9.hasNextInt()) {
                data9[l] = scanner9.useDelimiter(" ").nextInt();
               
                 l++;
                   }
            System.out.println("Done");
               System.out.println("Adding Arrays 10240000");
	int m=0;
	while (scanner10.hasNextInt()) {
                data10[m] = scanner10.useDelimiter(" ").nextInt();
                 
                 m++;
                   }
         System.out.println("Done");
           	    int choice=0;  
	    Scanner sc = new Scanner(System.in);   
	    System.out.println("*********Sorting Algorithms*********\n");  
	    System.out.println("-----------------------------");  

    while(choice != 4)  
	    {  
	        System.out.println("\nChose one from the below options...\n");  
	        System.out.println("1.SelectionSort\n2.InsertionSort\n3.QuickSort\n4.Exit");  
	        System.out.println(" Enter your choice \n");        
	          
                 if (sc.hasNextInt()) {
         choice = sc.nextInt(); 
     
     
                switch(choice)  
	        {  
	            case 1:  
	            {   
                         System.out.println("Selection SORT");
	                    long timeStarted = System.currentTimeMillis();
                    Selection(data);
                  System.out.println("Sorting last for Int10000:" + (System.currentTimeMillis() - timeStarted)+ "ms");
                   long timeStarted11 = System.currentTimeMillis();
                        Selection(data1);
                         System.out.println("Sorting last for Int20000:" + (System.currentTimeMillis() - timeStarted11)+ "ms");
                      long timeStarted12 = System.currentTimeMillis();     
                      Selection(data2);
                          System.out.println("Sorting last for Int40000:" + (System.currentTimeMillis() - timeStarted12)+ "ms");
                           long timeStarted13 = System.currentTimeMillis();     
                 Selection(data3);
                          System.out.println("Sorting last for Int80000:" + (System.currentTimeMillis() - timeStarted13)+ "ms");
                            long timeStarted14 = System.currentTimeMillis();     
                  Selection(data4);
                          System.out.println("Sorting last for Int160000:" + (System.currentTimeMillis() - timeStarted14)+ "ms");
                            long timeStarted15 = System.currentTimeMillis();     
                         Selection(data5);
                          System.out.println("Sorting last for Int320000:" + (System.currentTimeMillis() - timeStarted15)+ "ms");
                           long timeStarted16 = System.currentTimeMillis();     
                         Selection(data6);
                          System.out.println("Sorting last for Int640000:" + (System.currentTimeMillis() - timeStarted16)+ "ms");
                           long timeStarted17 = System.currentTimeMillis();     
                       Selection(data7);
                          System.out.println("Sorting last for Int1280000:" + (System.currentTimeMillis() - timeStarted17)+ "ms");
                           long timeStarted18 = System.currentTimeMillis();     
                     Selection(data8);
                          System.out.println("Sorting last for Int2560000:" + (System.currentTimeMillis() - timeStarted18)+ "ms");
                           long timeStarted19 = System.currentTimeMillis();     
                    Selection(data9); 
                          System.out.println("Sorting last for Int5120000:" + (System.currentTimeMillis() - timeStarted19)+ "ms");
                           long timeStarted20 = System.currentTimeMillis();     
                        Selection(data10);
                          System.out.println("Sorting last for Int10240000:" + (System.currentTimeMillis() - timeStarted20)+ "ms");
                          
                          
	                break;  
	            }  
	            case 2:  
	            {  
                         System.out.println("Insertion SORT");
	            long timeStarted = System.currentTimeMillis();
                 Insertion(data);
                  System.out.println("Sorting last for Int10000:" + (System.currentTimeMillis() - timeStarted)+ "ms");
                   long timeStarted11 = System.currentTimeMillis();
                         Insertion(data1);
                         System.out.println("Sorting last for Int20000:" + (System.currentTimeMillis() - timeStarted11)+ "ms");
                      long timeStarted12 = System.currentTimeMillis();     
                         Insertion(data2);
                          System.out.println("Sorting last for Int40000:" + (System.currentTimeMillis() - timeStarted12)+ "ms");
                           long timeStarted13 = System.currentTimeMillis();     
                   Insertion(data3);
                          System.out.println("Sorting last for Int80000:" + (System.currentTimeMillis() - timeStarted13)+ "ms");
                            long timeStarted14 = System.currentTimeMillis();     
                       Insertion(data4);
                          System.out.println("Sorting last for Int160000:" + (System.currentTimeMillis() - timeStarted14)+ "ms");
                            long timeStarted15 = System.currentTimeMillis();     
                         Insertion(data5);
                          System.out.println("Sorting last for Int320000:" + (System.currentTimeMillis() - timeStarted15)+ "ms");
                           long timeStarted16 = System.currentTimeMillis();     
                         Insertion(data6);
                          System.out.println("Sorting last for Int640000:" + (System.currentTimeMillis() - timeStarted16)+ "ms");
                           long timeStarted17 = System.currentTimeMillis();     
                         Insertion(data7); 
                          System.out.println("Sorting last for Int1280000:" + (System.currentTimeMillis() - timeStarted17)+ "ms");
                           long timeStarted18 = System.currentTimeMillis();     
                        Insertion(data8);
                          System.out.println("Sorting last for Int2560000:" + (System.currentTimeMillis() - timeStarted18)+ "ms");
                           long timeStarted19 = System.currentTimeMillis();     
                         Insertion(data9); 
                          System.out.println("Sorting last for Int5120000:" + (System.currentTimeMillis() - timeStarted19)+ "ms");
                           long timeStarted20 = System.currentTimeMillis();     
                        Insertion(data10);
                          System.out.println("Sorting last for Int10240000:" + (System.currentTimeMillis() - timeStarted20)+ "ms");
                          
	              break;  
	            }  
	            case 3:  
	            {  
                         System.out.println("Quick SORT");
	                 long timeStarted = System.currentTimeMillis();
                         sorter.sort(data);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted) + "ms");
                      long timeStarted2 = System.currentTimeMillis();
                         sorter.sort(data1);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted2) + "ms");
                      long timeStarted3 = System.currentTimeMillis();
                         sorter.sort(data2);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted3) + "ms");
                      long timeStarted4 = System.currentTimeMillis();
                         sorter.sort(data3);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted4) + "ms");
                      long timeStarted5 = System.currentTimeMillis();
                         sorter.sort(data4);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted5) + "ms");
                      long timeStarted6 = System.currentTimeMillis();
                         sorter.sort(data5);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted6) + "ms");
                      long timeStarted7 = System.currentTimeMillis();
                         sorter.sort(data6);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted7) + "ms");
                      long timeStarted8 = System.currentTimeMillis();
                         sorter.sort(data7);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted8) + "ms");
                      long timeStarted9 = System.currentTimeMillis();
                         sorter.sort(data8);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted9) + "ms");
                     long timeStarted10 = System.currentTimeMillis();
                         sorter.sort(data9);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted10) + "ms");
                     long timeStarted11 = System.currentTimeMillis();
                         sorter.sort(data10);
                    System.out.println("Sorting last for:" + (System.currentTimeMillis() - timeStarted11) + "ms");
	                break;  
	            }  
	            case 4:   
	            {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        };  
	    }
                 else {
        System.out.println("Sorry, couldn't understand you!");
        break; 
    }    
            }  
}  
}
