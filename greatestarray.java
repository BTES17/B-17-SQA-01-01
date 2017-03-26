public class array {
        public static void main(String[] args) {  
    int a[]={2,120,56,78,87};
    int largest=a[0];
    int smallest=a[0];
   int index=0;
        for(int i=1;i<a.length;i++){    
    if(a[i]>largest){    
    largest=a[i];
    index=i;
    }  
    else if(smallest>a[i]){  
    smallest=a[i];        
    }}    
    System.out.println(largest);
    System.out.println(index);
       
    } 
    }