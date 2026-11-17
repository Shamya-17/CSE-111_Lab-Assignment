CODING TASKS-



//Task 1-
public class Player{
  String name;
  String country;
  int jersey;
  static int total=0;
  static String [] list=new String[11];
  
  public Player(String title, String desh, int jn){
      name=title;
      country=desh;
      jersey=jn;
      list[total]=name;
      total++;
  }
  
  public String player_detail(){
    return "Player Name: " +name+ "\n"+ "Jersey Number: " +jersey+ "\n"+ "Country: " +country;
  }
  
  public static void info(){
    System.out.println("Total number of players: "+total);
    if(total>0){
      System.out.print("Players enlisted so far: ");
      for(int i=0;i<total;i++){
        if(i>0)
          System.out.print(", ");
        System.out.print(list[i]);}
    }
    System.out.println();
  }
  
}


//Task 2-
public class Travel{
  private String source;
  private String destination;
  private int time;
  private static int count;
  
  public Travel(String s, String d){
    source=s;
    destination=d;
    time=1;
    count++;
  }
  
  public static int getCount(){
    return count;}
  public String getSource(){
    return source;}
   public String getDestination(){
    return destination;}
   public int getTime(){
    return time;}
   public void setSource(String se){
    source=se;}
   public void setDestination(String dn){
    destination=dn;}
   public void setTime(int t){
    time=t;}
   
   public String displayTravelInfo(){
    return "Source: " +source+ "\n"+ "Destination: " +destination+ "\n"+ "Flight Time: " +time+ ":00";
  }
   
}


//Task 3-
public class Cargo{
  public static double capacity=10.0;
  public static int idCount=1;
  int id;
  String content;
  double weight;
  boolean load;
  
  public Cargo(String c, double w){
    id=idCount++;
    content=c;
    weight=w;
    load=false;
  }
  
  public static double capacity(){
    return capacity;
  }
  
  public void load(){
    if(!load){
      if(weight<=capacity){
        load=true;
        capacity-=weight;
        System.out.println("Cargo " +id+ " loaded for transport.");}
      else{
        System.out.println("Cannot load cargo, exceeds weight capacity.");}
    }
  }
  
  public void unload(){
    if(load){
      load=false;
      capacity+=weight;
      System.out.println("Cargo " +id+ " unloaded.");}
  }
      
  public void details(){
    System.out.println("Cargo ID: " +id+ ", Contents: " +content+ ", Weight: " +weight+ ", Loaded: " +load);
  }
  
}


