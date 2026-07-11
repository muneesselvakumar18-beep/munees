class Repeating{
    public  static void main(String[]args){
        int[] nums={10,20,30,40,20,0,30};
        int n= nums.length;
        boolean flag=false;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(nums[i]==nums[j]){
                    System.out.println(nums[i]);
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;

            }
        }
    }}