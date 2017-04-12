package Inderpal;
public class diff {
  public static void main(String args[])
  {
    diff obj=new diff();
    obj.show(5,6);
            obj.show(9);
  }
  void show(int a)
  {
      System.out.println(a);
  }
  void show(float a,int b)
  {
      System.out.println(a);
      System.out.println(b);
  }
}