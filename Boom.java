import java.util.Random;
public class Boom{
	public void view(int n,int m){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("*  ");
			}
			System.out.println("");
		}
	}
	public void num(){
		int[] intArray=new int[2];
		Random random=new Random();
		for(int i=0;i<intArray.length;i++){
			intArray[i]=random.nextInt(10);
		}
		return intArray;
	}
	public static void main(String[] args) {
		Boom boom = new Boom();
		//boom.view(10,9);
		System.out.println(boom.num());
	}
}