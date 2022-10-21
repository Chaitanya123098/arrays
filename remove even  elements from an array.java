class Arrayed {
    
    public static void printele(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static int[] remeve(int[] arr){
        int oddcnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                oddcnt++;
            }
        }
        int[] result= new int[oddcnt];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[index]=arr[i];
                index++;
            }
        }
       return result;
    }
    public static void main(String[] args) {
      
       int arr[]={2,4,5,6,7,9};
       printele(arr);
       int[] result= remeve(arr);
       printele(result);
      
       
    }
}