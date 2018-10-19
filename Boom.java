import java.util.Random;
import java.util.Arrays;
public class Boom{
	public static void view(int n,int m){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("*  ");
			}
			System.out.println("");
		}
	}
	public static int[][] num(int nums){
		int[][] intArray=new int[nums][2];
		Random random=new Random();
		for(int i=0;i<nums;i++){
			for(int j=0;j<2;j++){
				intArray[i][j]=random.nextInt(10);
			}
		}
		return intArray;
	}
	public static int[][] compute(int nums,int k,int z){
		int[][] intA=num(nums);
		int[][] comArr=new int[k][z];
		for(int i=0;i<nums;i++){
			if(intA[i][0]!=0 && intA[i][1]!=0){
				int a=intA[i][0],b=intA[i][1];
				comArr[a][b]++;
				System.out.println(comArr);
			}
		}
		return null;
	}
	public static void main(String[] args) {
		/*Boom boom = new Boom();
		boom.view(10,9);*/
		/*boom.num(7);*/
		
		// view(10,9);
		
		/*int[][] intA=num(7);
		for(int i=0;i<intA.length;i++){
			for(int j=0;j<intA[i].length;j++){
				System.out.print(intA[i][j]+" ");
			}
			System.out.println();
		}*/

		compute(7,10,9);
	}
}