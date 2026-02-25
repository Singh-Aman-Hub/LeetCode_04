class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                
                int e1= Integer.bitCount(arr[j]);
                int e2= Integer.bitCount(arr[j+1]);
                // System.out.println(i+" - "+" "+j +"->"+e1+" "+e2);
                if(e1>e2 ||(e1==e2 &&arr[j]>arr[j+1])){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // System.out.println("Swapped");
                    // System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}