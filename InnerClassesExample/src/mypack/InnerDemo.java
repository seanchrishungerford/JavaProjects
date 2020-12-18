package mypack;
public class InnerDemo {
	
	
	private static final int ARRAY_SIZE =15;
	
	private int[] arrayOfInts = new int[ARRAY_SIZE];

	public InnerDemo() {
		 for(int i=0; i < ARRAY_SIZE; i++) {
			 arrayOfInts[i] =i;
		 }}
	
public void printEven() {
	
	InnerEvenIterator innerEvenIterator= new InnerEvenIterator();
	
	while (innerEvenIterator.hasNext()) {
		System.out.println(innerEvenIterator.getNext() + " ");
	}}
public class InnerEvenIterator{
	
	private int next=0;
	
	private boolean hasNext() {
		return (next <= ARRAY_SIZE -1);
	}
	
	public int getNext() {
		int retValue=arrayOfInts[next];
		
		next +=2;
		return retValue;
	}
	
}
public static void main(String[] args) {
	InnerDemo innerDemo= new InnerDemo();
	innerDemo.printEven();
}

}
