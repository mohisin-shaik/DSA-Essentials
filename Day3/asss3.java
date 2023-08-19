class asss3{
    static boolean isPrime(int x){
        int c=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){c++;}
        }
        if(c==2){return true;}
        return false;
    }

    public static void main(String[]args){
      int[]a={2,3,4,5,6,7,8,9,10};
      int count=0;
      for(int i=0;i<a.length;i++){
        if(isPrime(a[i])){count++;}
        else{continue;}     
      }
       System.out.println("No of prime numbers count is :"+count);
    } 
}