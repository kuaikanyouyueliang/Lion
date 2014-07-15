
public class SortRondom {
	public static void main(String[] args) {
		sortRandom();
	}
	private static void sortRandom(){
		int[] arr=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.print("["+i+"]"+arr[i]+" ");
		}
		System.out.println();
		for(int j=0;j<arr.length;j++){
			for(int k=j+1;k<arr.length;k++){
				if(arr[j]>arr[k]){
					int _tem=arr[j];
					arr[j]=arr[k];
					arr[k]=_tem;
				}
			}
			System.out.print(arr[j]+" ");
		}
	}
}
