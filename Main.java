import java.util.Scanner;
public class Calculator{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int a,b,c,selection
    System.out.println("Please enter any two digits: ");
    a = scan.nextInt();
    b = scan.nextInt();

    System.out.println("Make your selection");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Division");
    System.out.println("4.Multiplication");
    
    selection = scan.nextInt();
    While(selection>4){
      System.out.println("Please Enter the correct selection: ");
      selection=scan.nextInt();
    }

    Cal2 mani = new Cal2();
    if(selection==1){
      c=mani.add(a,b);
      System.out.println("Your answer is "+c);
    } else if(selection==2){
      c=mani.sub(a,b);
       System.out.println("Your answer is "+c);
    } else if(selection==3){
      c=mani.div(a,b); System.out.println("Your answer is "+c);
    } else if(selection==4){
      c=mani.multi(a,b);
       System.out.println("Your answer is "+c);
    }
  }
}
public class Cal2{
  public int add(int x, int y){
    int z;
    z=x+y;
    return z;
  }
    public int sub(int x, int y){
    int z;
    z=x-y;
    return z;
  }
    public int multi(int x, int y){
    int z;
    z=x*y;
    return z;
  }
    public int div(int x, int y){
    int z;
    z=x/y;
    return z;
  }
}
