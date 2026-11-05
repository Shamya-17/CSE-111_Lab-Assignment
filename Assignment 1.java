CODING TASK-


//Task 1-
import java.util.Scanner;
public class Task_1{
  public static boolean prime(int sonkha){
    if(sonkha<=1)
      return false;
    //2 dhara bibhajo kina jachai kora
    for(int soro=2;soro<=sonkha/2;soro++){
      if(sonkha%soro==0)
        return false;}
    return true;
  }
  
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    //input
    System.out.println("Enter 2 integer number:");
    int onko_1=sc.nextInt();
    int onko_2=sc.nextInt();
    int soro,shes;
    int gonona=0;
    
    //small and large number ber kora
    if(onko_1<onko_2){
      soro=onko_1;
      shes=onko_2;}
    else{
      soro=onko_2;
      shes=onko_1;}
    for(int z=soro+1;z<shes;z++){
      if(prime(z)){
        gonona++;}  //prime number counter
    }
    System.out.println("There are "+gonona+" prime numbers between "+soro+" and "+shes);
  }

}


//Task 2-
import java.util.Scanner;
public class Task_2{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your string: ");  //input
    String probesh=sc.nextLine();
    String bahir="";
    int arombho=0;
    
    while(arombho<probesh.length()){
      char alpha=probesh.charAt(arombho);
      if(alpha>='a' && alpha<='z'){       //lowercase check kora
      if(alpha=='a'){
        bahir=bahir+'z';}
      else{
        char beta=(char)(alpha-1);
        bahir=bahir+beta;}
      }
      else{                              //lowercase na hole invalid show korbe
        System.out.println("Invalid formet.");
         return;
      }
      arombho++;
    }
    System.out.println(bahir);  //output
  }
}


//Task 3-
import java.util.Scanner;
public class Task_3{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    //Array length 
    System.out.println("Enter the length of the array: ");
    int sonkha=sc.nextInt();
    int [] arr=new int[sonkha];
    int soro=0;
    int shes=sonkha-1;
    System.out.println("Enter eliment: ");  //input elements
    for(int arombho=0;arombho<sonkha;arombho++){
      arr[arombho]=sc.nextInt();}
    while(soro<shes){                     //value swap kora
      int temp=arr[soro];
      arr[soro]=arr[shes];
      arr[shes]=temp;
      soro++;
      shes--;
    }
    for(int s=0;s<sonkha;s++){           //reversed array print
    System.out.print(+arr[s]+ " ");}
  }
}


//Task 4-
import java.util.Scanner;
public class Task_4{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    //Array size input nea
    System.out.println("Enter integer number N: ");
    int onko=sc.nextInt();
    int [] arr=new int[onko];
    //Number input nea
    System.out.println("Enter number : ");
    for(int soro=0;soro<onko;soro++){
      arr[soro]=sc.nextInt();}
    for(int arombho=0;arombho<onko;arombho++){
      int agr=0;
      //already print ase naki check kora
      for(int shes=0;shes<arombho;shes++){
        if(arr[arombho]==arr[shes]){
          agr=1;
          break;}
      }
      if(agr==0){    //jodi print na thake
        int gona=1;
        for(int x=arombho+1;x<onko;x++){
          if(arr[arombho]==arr[x]){
            gona++;}}
        System.out.println(arr[arombho]+" - "+gona+" times");}
    }
  }
}


//Task 5-
import java.util.Scanner;
public class Task_5{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    int [][] grid={
      {0,0,10,0,-1},
      {0,-1,0,0,-1},
      {-1,0,-1,0,0},
      {0,-1,7,0,-1},
      {0,-1,0,-1,0}
    };
    int sari=3;  //starting position assign
    int kolum=2;
    int dhaps=5;
    boolean khela_shes=false;
    System.out.println("Initial Map: ");
    Uttor(grid);
    
    for(int soro=1;soro<=dhaps;soro++){
      System.out.print("Enter move "+soro+" (UP/DOWN/LEFT/RIGHT): ");
      String dhap=sc.nextLine().toUpperCase();
      
      int noton_sari=sari;   //noton poeition calculate kora
      int noton_kolum=kolum;
      if(dhap.equals("UP")){
        noton_sari--;}
      else if(dhap.equals("DOWN")){
        noton_sari++;}
      else if(dhap.equals("LEFT")){
        noton_kolum--;}
      else if(dhap.equals("RIGHT")){
        noton_kolum++;}
      else{
        System.out.println("Invalid move.");
        return;}
      
      //boundary er modde ase naki check kora
      if(noton_sari<0 || noton_sari>=grid.length || noton_kolum<0 || noton_kolum>=grid[0].length){
        System.out.println();
        System.out.println("Player fell outside the playing area.Game over!");
        return;
      }
      
      //mine er modde porse naki check kora
      if(grid[noton_sari][noton_kolum]==-1){
        grid[sari][kolum]=0;
        grid[noton_sari][noton_kolum]=7;
        System.out.println("Current state: ");
        Uttor(grid);
        System.out.println("Player stepped on mine. GAME OVER!");
        return;
      }
      
      //treasure pao gese naki check kora
      if(grid[noton_sari][noton_kolum]==10){
        grid[sari][kolum]=0;
        grid[noton_sari][noton_kolum]=7;
        System.out.println("Current state: ");
        Uttor(grid);
        System.out.println("Congratulation! You found the traser!");
        return;
      }
        grid[sari][kolum]=0;    //noton position
        grid[noton_sari][noton_kolum]=7;
        sari=noton_sari;
        kolum=noton_kolum;
        System.out.println("Current state: ");
        Uttor(grid);}
    
    System.out.println("Out of moves. You lost the game!");}
  
  public static void Uttor(int [][] grid){  //output
    for(int[]sari:grid){
      for(int ar:sari){
        System.out.print(ar+" ");}
      System.out.println();
    }
  }
}


