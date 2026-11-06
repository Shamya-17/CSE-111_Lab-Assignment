CODING TASK-



//Task 1-
public class Shelf{
  int capacity=0;
  int book_num=0;
  
  public void showDetails(){
    System.out.println("Shelf Capacity: "+ capacity);
    System.out.println("Number of books: "+ book_num);
  }
  
  public void addBooks(int sonkha){
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
      return;}
    if(book_num+sonkha>capacity){
      System.out.println("Exceeds capacity.");
      return;}
    book_num += sonkha;
    System.out.println(sonkha+" books added to shelf.");
  }  
  
}


//Task 2-
public class Cart{
  int cart_num;
  String [] stuff=new String[3];
  double [] fee=new double[3];
  int stuff_count=0;
  double cut=0;
  
  
  public void create_cart(int x){
    cart_num=x;
  }
  
  
  public void addItem(String i,double p){
    if(stuff_count<3){
      stuff[stuff_count]=i;
      fee[stuff_count]=p;
      stuff_count++;
      System.out.println(i+" added to cart "+cart_num+".");
      System.out.println("You have "+stuff_count+" item(s) in your cart now");}
    else{
      System.out.println("You already have 3 items in your cart.");}
  }
  
  
  public void addItem(double p,String i){
    addItem(i,p);
  }
  
  
  public void giveDiscount(double gd){
    cut=gd;
  }
  
  
  public void cartDetails(){
    System.out.println("your cart(c" +cart_num+ "):");
    double full=0;
    for(int j=0;j<stuff_count;j++){
      System.out.println(stuff[j]+" - "+fee[j]);
      full+=fee[j];}
    System.out.println("Discount Applied: "+cut+"%");
    double cut_full=full-(full*cut/100);
    System.out.println("Total price: "+cut_full);
  }
  
}


//Task 3-
public class Reader{
  String naam="New user.";                //Default name,capacity,empty list              
  int space=0;
  String [] boi=new String[0];
  int boi_count=0;
  
                                          //method to create new name,capacity....
  public String createReader(String title,int size){
    this.naam=title;
    this.space=size;
    this.boi=new String [size];
    this.boi_count=0;
    return "A new reader is created!";
  }
  
                                          //method to add book to reader's list
  public void addBook(String boi_name){
    if(boi_count<space){                  //checking max capacity
      boi[boi_count]=boi_name;
      boi_count++;}
    else{                                 //return for no capacity
      System.out.println("No more capacity.");}
  }
  
  
  public void readerInfo(){                //method showing reader's info
    System.out.println("Name: "+ naam);
    System.out.println("Capacity: "+ space);
    System.out.println("Books: ");
                                            //book list checking
    if(boi_count==0){
      System.out.println("No books added yet.");}
    else{
      for(int soro=0;soro<boi_count;soro++){
        System.out.println("Book "+(soro+1)+" : "+boi[soro]);}
    }
  }
  
}


//Task 4-
public class MoneyTracker{
  String title=null;
  double equity=0.0;
  double last_eq=0.0;
  double last_cost=0.0;
  
  public void createTracker(String new_title){
    title=new_title;
    equity=1.0;
  }
  
  public void income(double sum){
    equity+=sum;
    last_eq=sum;
    System.out.println("Balance Updated!");
  }
  
  public  void expense(double sum){
    if(equity<sum){
      System.out.println("Not enough balance.");}
    else{
      equity-=sum;
      last_cost=sum;
      if(equity==0){
        System.out.println("You're broke!");}
      else{
      System.out.println("Balance Updated.");}
   }
  }
  
  public String info(){
    String data="Name: "+title+"\nCurrent Balance: "+equity;
    return data;
  }
  
  public void showHistory(){
    System.out.println("Last added: "+last_eq);
    System.out.println("Last spent: "+last_cost);
  }
  
}

