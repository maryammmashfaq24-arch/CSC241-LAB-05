public class Product{
      private String id;
      private double price;
      private int quantity;
      String name;
      private Date md;

      private static double maxprice=0.0;
      private static double miniprice=0.0;
      private static int count=1;
     
Product(String name,double price,int quantity){
       this.name=name;
       this.price=price;
       id= String.format ("p%03d",count++);
       this.quantity=quantity;
      
       if (count==1){
       maxprice=price;
       miniprice=price;
}

       if(count>1 && miniprice>price){
         miniprice=price;
}
       if(count>1 && maxprice<price){
         maxprice=price;
}

//       if (maxprice<price){
//              maxprice=price; 
 // }
 //      if (miniprice>price){
  //            miniprice=price;
  // }
}
  
Product(String name,double price,int quantity,Date md){
       this.name=name;
       this.price=price;
       id= String.format ("p%03d",count++);
       this.quantity=quantity;
       this.md=md;
}

 void display(){
      
      System.out.printf("ID: %s \n" , id);
      System.out.printf("Name %s \n" , name);
      System.out.printf("Price: %.2f \n",price);
      System.out.printf("Quantity: %d \n",quantity);
      System.out.println("Maxprice:"+ maxprice);
      System.out.println("Miniprice:"+ miniprice);
      System.out.println("Manufacturing date"+ md);
      
  }
}
 
      
