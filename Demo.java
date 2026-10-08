public class Demo{
   public  static void main(String args[]){
     Product p1= new Product("Maryam ",
                              30.0 , 
                               1);

     Product p2=new Product("Noor",
                             10.0,
                             2);

     Product p3=new Product("Alina", 
                             45.0,
                             3);

    Date d1 = new Date(8, 10, 2026);
    Product p4 = new Product( "Ayesha", 
                               25.0, 
                               4,
                               d1 );
    
       p1.display();
       p2.display();
       p3.display();
       p4.display();
     }   
}