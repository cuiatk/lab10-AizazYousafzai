import java.util.Arrays;

public class MyMode implements Mode {
		
	/**
	 * Requires:  
	 * Effects:  
	 * @param values  
	 */
		public int getMode(int[] value) {
			
			
			Arrays.sort(value);
			int mode=value[0],counter=0;
			for(int i=0;i<value.length;i++){
				return value[i]; 
			}
			return 0;
			
			
		}


		public void main(String[] args){
			
			int[] arr={4,3,2,1};
			
			getMode(arr);
			
			for(int i=0;i<arr.length;i++){
				arr[i]=getMode(arr);
				System.out.println(arr[i]);
			}
		}
	}




	

