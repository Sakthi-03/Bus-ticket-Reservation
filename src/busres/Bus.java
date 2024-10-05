package busres;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	
	Bus(int busno, boolean ac, int capacity){
		this.busno = busno;
		this.ac = ac;
		this.capacity = capacity;
	}
	
	int getCapacity(){
		return capacity;
	}
	
	boolean isAc(){
		return ac;
	}
	
	
	int getBusno(){
		return busno;
	}
	
	void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	void setAc(boolean ac) {
		this.ac = ac;
	}
	
	
	public void displayBusInfo() {
		System.out.println("Bus No: "+ busno + "| Ac: " + ac + "| Capacity: " + capacity);
		
	}

}
