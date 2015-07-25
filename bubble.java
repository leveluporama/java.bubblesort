import java.util.ArrayList;
public class bubble{

	public static void main(String args[]){
		
		Sort s = new Sort(args);
		s.sortingArray();
		s.printArray();
	}

	

}
class Sort{

	private ArrayList<Integer> arr = new ArrayList<Integer>();

	public void sortingArray(){
		int swap = 0;
		for (int i=0; i<this.arr.size(); i++){
			for (int j=i+1; j<this.arr.size(); j++){
				if (this.arr.get(i)>this.arr.get(j)){
					swap = this.arr.get(i);
					this.arr.set(i, this.arr.get(j));
					this.arr.set(j, swap);
				}
			}
		}

	}
	public void printArray(){
		for (int i: this.arr){
			System.out.println(i);
		}

	}

	//Конструктор
	Sort(String args[]){

		if (args.length >=1){
			for(int i=0; i<args.length; i++){
				if (args[i].matches("[-+]?\\d+")){
					this.arr.add(Integer.parseInt(args[i]));	
				} 
				else {
					System.out.println(args[i] + " не целое число");
				}
				 	
			}
				}
				else {
						System.out.println("Пусто!");
						}
		}
		
	}

