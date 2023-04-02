public class primerange
 { 
                public static void main(String args[]) 
          { 
                    int i=prime(100); 
               System.out.println("value of highest prime is :-"+i); 
          } 
               public static int prime(int num) 
               { 
                         int i=1; 
                  for(int j=2;j<=num;j++) 
                     { 
                       if(j== num) 
                        { 
                           i= num; 
                           break; 
                        } 
                          if(num% j==0) 
                            { 
                               num--; 
                            } 
                      } 
                            return i; 
               } 
 } 
 
