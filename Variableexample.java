class Variableexample
{  int m;
   int myVariable=5; //instance variable initialization
   static int data = 30;//staic variable
   void fun()
   { int i=10;
     System.out.println("local variable="+i);
    }  
     
   
   public static void main(String args[]){
      Variableexample obj = new Variableexample();
      
      System.out.println("Value of instance variable: "+obj.myVariable); //instance varible called by object
      System.out.println("Value of static variable: "+Variableexample.data);//Static variable called by classname
      obj.fun();
   }
}