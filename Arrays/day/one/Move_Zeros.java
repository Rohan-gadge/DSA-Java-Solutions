package arrays.day.opne;
public class Move_Zeros {

	public static void main(String[] args) {
		 int[] arr = {0, 5,0,6,8,9,3,0,45};
		 
		 
//		int i=0;
//		for(int j=1;j<arr.length;j++) {
//			
//			if(arr[i]!=0) {
//				i++;
//			}else if(arr[i]==0 && arr[j]!=0) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				i++;
//			}
//		}
//		
		 
		 int i = 0;
		 for (int j = 0; j < arr.length; j++) {
		     if (arr[j] != 0) {
		      
		         int temp = arr[i];
		         arr[i] = arr[j];
		         arr[j] = temp;
		         i++;
		     }
		 }
		for(i=0;i<arr.length;i++) {
     	   System.out.print(arr[i]+" ");
        }

	}

}
