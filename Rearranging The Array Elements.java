public class Main {

public static boolean isOdd(int x){  
	if(x%2==0){  
		return false;  
	}  
	else{  
		return true;  
	}  
}  
  
public static void main(String[] args) {  
	int[] arr={4,21,3,1,6,7,8,9,2,11,12,13,14};  
	int i=0,j=0;
	while(j<arr.length){
		if(isOdd(arr[j])){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
		}
		j++;
	}
	System.out.println("After Rearranging The Odd && Even In The Given Array:");
	for(int k=0;k<arr.length;k++){  
			System.out.print(arr[k]+" ");  
	}  
}

}

