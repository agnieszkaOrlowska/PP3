public class Room2 {
	public static int number;
	public static int beds;
	public static boolean occupied;
	public static String guestName;
	public static Room[] rooms = new Room[6];
	
	public Room2(int number){
		this.number=number;
	}
	
	public Room2(int number, int beds){
		this.number=number;
		this.beds=beds;
	}
	
	public void checkin(String guestName) {
		this.guestName=guestName;
	}
	
	public void checkout(String guestName) {
		this.guestName="";
	}
	
	public void isOccupied() {
		if(occupied=true) {
			System.out.println("Is occupied");
		}
		else {
			System.out.println("Is available");
		}
	}
	
	public void displayStatus() {
		System.out.println("Room number: " + number+ ", beds: "+ beds+ ", avaible?: "+ occupied +", "
				+ "guest name: "+ guestName);
	}
	
	public static void raportList(Room[]rooms) {
		System.out.println("Room number: " + number+ ", beds: "+ beds+ ", avaible?: "+ occupied +", "
				+ "guest name: "+ guestName);
	}
	
	public static void raportBeds(Room[]rooms,int beds) {
		int marker=beds;
		for(int i=0;i<=rooms.length;i++) {
			if(marker==rooms[i].beds) {
				System.out.println("Room number: " + number+ ", beds: "+ beds+ ", avaible?: "+ occupied +", "
						+ "guest name: "+ guestName);
			}
		}
	}
	
	public static void raportOccupied(Room[]rooms) {
		int counter=0;
		for(int i=0;i<=rooms.length;i++) {
			if(rooms[i].occupied==true) {
				counter+=1;
			}
			System.out.println("Number of occupied rooms: " + counter);
		}
	}
	
	public String toString(){//overriding the toString() method  
		  return number+" "+beds+" "+occupied+" "+guestName;
		 }  
	
	
	
	public  static void main(String[] args){
		Room r1= new Room(7);
		rooms[0]= new Room(1,2);
		rooms[1]= new Room(2,2);
		rooms[2]= new Room(3,2);
		rooms[3]= new Room(4,3);
		rooms[4]= new Room(5,3);
		rooms[5]= new Room(6,1);
		rooms[0].displayStatus();
		 System.out.println(r1);
		
		

		
	}
}
