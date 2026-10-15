public class Pizza {
  String flavor;
  String size;
  int price;
  
Pizza (String flavor, String size, int price){
  this.flavor = flavor;
  this.size = size;
  this.price = price;
  }  

Pizza (String flavor, String size){
  this (flavor, size, 350);
  }
  
Pizza (){
    this ("Cheese", "Medium", 299);
  }
  
public void describe (){
  System.out.println(flavor + " pizza, "+ size + ", P" + price);

}


  
public static void main (String [] args){
 Pizza p1 = new Pizza("Pepperoni", "Large", 499);
 Pizza p2 = new Pizza("Hawaiian", "Small");
 Pizza p3 = new Pizza();
 
 p1.describe(); // Pepperoni pizza, Large, P499
 p2.describe();
 p3.describe();

/*
Pepperoni pizza, Large, P499
Hawaiian pizza, Small, P350
Cheese pizza, Medium, P299 */
  
  
  
 } 
}

