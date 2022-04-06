package	javapractice;
import java.util.*;

public class HelloWorld 
{
    public static void main(String[] args) 
    {
       // Prints "Hello, World" in the terminal window.
       

       Practice.variablePractice();
       Practice.controlStructures();
       
       //oop practice
       Point2D point2D1 = new Point2D(5.6, 6.6);
       Point2D point2D2 = new Point2D(6.6, 7.6);       
       System.out.println("2d distance " + point2D1.distance(point2D2));
      
       
       Point3D point3D1 = new Point3D(5.6, 6.6, 6.6);
       Point3D point3D2 = new Point3D(6.6, 6.6, 7.6);       
       System.out.println("3d distance" + point3D1.distance(point3D2));
       
       System.out.println("3d distance integer generics : " + (new Point3DGeneric(2,3,5)));
       System.out.println("3d distance double generics : " + String.valueOf(new Point3DGeneric(2.6,3.6,5.6)));
       
    }

    public static class Practice
    {
        //types and collection
        public static void variablePractice()
        {
            /*
            * start :  simple types
            */

            //start 
            Integer i = 6;
            Boolean b = true;
            String str = "hello world"; // reference types

            //type casting
            Long l = (long) 8888866;
            Float f = (float)  5.6;
            Double typeCastedDouble = Double.parseDouble("6.77");

            
            
            System.out.println(String.valueOf(i));

            System.out.println(String.valueOf(f));

            System.out.println(String.valueOf(b));

            System.out.println(String.valueOf(l));
            
            System.out.println(typeCastedDouble + 4);

            /*
            * end :  simple types
            */

            /*
            * start :  reference types and collection.
            */

            //array
            Integer[] is = new Integer[]{88,2,3};
            String[] str1s = {"i", "m", "manoj"};  

            int[][] is2 = new int[4][3];
            is2[3][2] = 7;    
         
            int[][] multiDim = {{1,2,3333}, {4,5,6}};

            //list
            List<Integer> intList = new ArrayList<Integer>();   //List is a interface. ArrayList is class
            intList.add(1);

            //has map
            Map <String, Integer> nameToId = new HashMap<>(); //Map is a interface. HashMap is class
            nameToId.put("manoj", 558);    


            //set is unique collection. teti use hudaina.
            Set<String> newSet = new HashSet<>();
            newSet.add("karki");
            newSet.add("manoj");

            System.out.println(is[0]);
            System.out.println(str1s[2]);
            System.out.println(is2[3][2]);
            System.out.println(intList.get(0));
            System.out.println(nameToId.get("manoj"));
            System.out.println(newSet);
            System.out.println(multiDim[0][2]);

             /*
            * end : collection. reference types .
            */
        }

        public static void controlStructures()
        {
        
            //fibonacci
            Integer n = 10;
            Integer t1 = 0;
            Integer t2 = 1;
            Integer sum = 0;
            String fib = "";

            System.out.println(t1);
            System.out.println(t2);
            for(Integer i = 1;  i<n; i++)
            {
                sum = t1 + t2;
                fib += String.valueOf(sum) + ", ";
                // System.out.println(sum);
                t1 = t2;
                t2 = sum;
            }

            System.out.println(fib);

        }
    }
 }


 
 
