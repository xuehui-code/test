/*public static void selectSort(long [] array){
	for (i=0,i<array.length-1,i++){
	//有序区间：[array.length-i,array.length)
	//无序区间：[0,array.length-i)
	int max = 0;                 //无序区间中找到最大值
	    for(j=0.j<array.length-i,j++){
	       if(array[j]>array[max]){
	       max=j;
	       }
	    }
	    int t=array[max];             //将找到的最大值放在无序区间后面
	    array[max]=array[array.length-i-1];
	    array[array.length-i-1]=t;
	}
}*/

public static int[] 转换(long n){
	long n = 20201018;
	int count = 0;
	while(n!=0){       //算出总位数
		n = n/10;
		count++;
	}
	long array[i];          //将数字按个位开始输出
	long i;
	for(i=0,i<=count,i++){
	    array[i] = n%10;
	    n = n-array[i];
	    n = n/10;
	}
	private static swap(a,b){
		int a;
		int b;
		int t = a;
		a = b;
		b = t;
	}
	for(i=0,i<array.length,i++){        //逆序
		swap(i,array.length-i-1);
	}
	return array;
}