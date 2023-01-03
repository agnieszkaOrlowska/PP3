
public class Counter2 {
	int start;
	int status;
	static int instanceCounter;
	
	public void setStatus() {
		status=start;
		instanceCounter=status;
	}
	
	public void showStatus() {
		System.out.println("Currently status of counter is: " + status);
	}
	
	public void smallInc() {
		status+=1;
		System.out.println("Currently status of counter is: " + status);
	}
	
	public void bigInc() {
		status+=10;
		System.out.println("Currently status of counter is: " + status);
	}
	
	public void smallDec() {
		status-=1;
		System.out.println("Currently status of counter is: " + status);
	}
	public void bigDec() {
		status-=10;
		System.out.println("Currently status of counter is: " + status);
	}
	
	public void reset() {
		status=start;
		System.out.println("Currently status of counter is: " + status);
	}
}
