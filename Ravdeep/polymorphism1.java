package Ravdeep;
public class poly1 {
  void run(int a)
  {
      System.out.println(a);
  }
  void run(float a,int b)
  {
      System.out.println(a);
      System.out.println(b);
  }
  public static void main(String args[])
  {
    poly1 obj=new poly1();
    obj.run(9,0);
    obj.run(1);
  }
}