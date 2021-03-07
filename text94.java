public class Solution{
	public boolen Find(int x,int[][]array){
	    for(int i=0;i<array.length;i++){
	        for(int j=0;j<array[i].length;j++){
	            if(array[i][j]==x){
	                return ture;
	            }
	        }
	    }
	    return false;
	}
	public static void main(String [] args){
	    int a[][]={
	    (1,2,8,9),
	    (2,4,9,12),
	    (4,7,10,13),
	    (6,8,11,15)
	    }
	    boolen result;
	    Solution solution =new Solution();
	    result=solution.Find(5,a);
	    System.out.println(result)
	}
}