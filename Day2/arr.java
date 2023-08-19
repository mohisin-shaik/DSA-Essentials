class arr{
     public static void main(String[] args){
        int []ar1={7,9,5,6,3,2};
        int n=ar1.length;
        int res=0;
        if(n==0){System.out.println("No element present");}
        if(n==2){
            if(ar1[0]<ar1[1]){
                res=ar1[1]-ar1[0];
            }
        }
        for(int i=0;i<n-1;i++){
           if(ar1[i]<ar1[i+1]){
            int t=ar1[i+1]-ar1[i];
            res=Math.max(t,res);
           }
        }
        System.out.println("Maximun difference is "+res);

    }
}