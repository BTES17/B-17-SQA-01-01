
public class reversestring {

	public static void main(String[] args) {
            String str="Hello";
            String str1="";
            int size=str.length();
            for(int i=size-1;i>=0;i--)
            {
            	 str1=str1+str.charAt(i);
            }
            System.out.print(str1);
	}

}
