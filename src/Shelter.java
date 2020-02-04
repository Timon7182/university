
public class Shelter {
	public  final static int MAX_NUMB = 10;
	
	private People[] pl;
	private int peopleCount;
	
	public Shelter() {
	
		pl = new People[MAX_NUMB];
		peopleCount = 0;
		
		
		
	}
	public void Add(People pl) {
		try {
			this.pl[peopleCount] = pl;
			peopleCount++;
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error");
		}
		
	}
	
	public People searchPeople(String sname) {
		for (int i = 0; i < peopleCount; i++) {
			if (pl[i].getName().equals(sname)) {
				return pl[i];
			}
			
		}
		return null;
	
	}

	public void printPeople() {
		for (int i = 0; i < peopleCount; i++) {
			System.out.println(pl[i].getName() + " " + pl[i].getAge() + " " + pl[i].getClass());
		}
	}
}
