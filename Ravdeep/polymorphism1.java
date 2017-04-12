package Ravdeep;
public class poly1 {
  void show(int a)
  {
      System.out.println(a);
  }
  void show(float a,int b)
  {
      System.out.println(a);
      System.out.println(b);
  }
  public static void main(String args[])
  {
    poly1 obj=new poly1();
    obj.show(9,0);
    obj.show(1);
  }
}