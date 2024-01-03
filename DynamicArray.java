public class DynamicArray {

	int size;
	int capacity=10;
	Object[] array;

	public DynamicArray(){ //By default Constructor
		this.array=new Object[capacity];
	}
	
	 //Intialize Constructor with capacity
	public DynamicArray( int capacity){
	 this.capacity= capacity;
	 this.array =new Object[capacity];

	}

	public Object getindex(int index){
		return array[index];
	}

	

	public void add(Object data){
		if(size>=capacity){
			grow();
		}
		else{
			array[size]=data;
			size++;
		}
	}

	public void insert(Object data,int index){
		if(size>=capacity){
			grow();
		}
		else{
			for(int i=0;i<size;i++){
				array[i]=array[i-1];
			}
			array[index]=data;
			size++;
		}

	}

	public boolean isEmpty(){
		return size==0;
	}

	public String toString(){
		String string= "";

		for(int i=0;i<capacity;i++){
			string +=array[i]+",";
		}
		if(string!=""){
			string="["+string.substring(0,string.length()-2)+"]";

		}
		else{
			string="[]";
		}

		return string;
	}

	public void grow(){
		int newcapcity=capacity*2;
		Object[] newarray= new Object[newcapcity];
		
		for(int i=0;i<size;i++){
			newarray[i]=array[i];
		}

		capacity=newcapcity;
		array=newarray;
	}

	public void shrink(){
		int newcapcity= (int)(capacity/2);
		Object[] newarray= new Object[newcapcity];
		
		for(int i=0;i<size;i++){
			newarray[i]=array[i];
		}

		capacity=newcapcity;
		array=newarray;
	}
 
	// deletion of data
	public void delete(Object data){
		for (int i = 0; i < size; i++) {
			if(array[i]==data){ //check for data is present or not
				for(int j=0;j<(size-i-1);j++){
					array[i+j]=array[i+j+1];
				}
				array[size-1]=null;
				size--;
				if(capacity<= (int)(capacity/3)){
					shrink();
				}
				break;

			}
		}

	}

	public int search(Object data) {
		
		for(int i = 0; i < size; i++) {
			if(array[i] == data) {
				return i;
			}
		}
		return -1;
	}
}
