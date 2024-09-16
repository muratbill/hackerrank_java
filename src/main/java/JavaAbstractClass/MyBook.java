package JavaAbstractClass;

 class MyBook extends Book {
     @Override
     void setTitle(String s){
         System.out.println("The title is: " + s);
     }
}
