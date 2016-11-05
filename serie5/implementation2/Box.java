package serie5.implementation2;

public class Box {
	private int l�nge, breite, h�he;
	private boolean full;
	
	public Box(int l�nge, int breite, int h�he)
	{
		this.l�nge = l�nge;
		this.breite = breite;
		this.h�he = h�he;
		this.full = false;
	}
	
	public Box()
	{
		this.l�nge = 1;
		this.breite = 1;
		this.h�he = 1;
		this.full = false;
	}
	
	/* Getter */
	public int getL�nge(){ return this.l�nge; }
	public int getBreite(){ return this.breite; }
	public int getH�he(){ return this.h�he; }
	public boolean getFull(){ return this.full; }
	
	/* Setter */
	public void setL�nge(int l�nge){ this.l�nge = l�nge; }
	public void setBreite(int breite){ this.breite = breite; }
	public void setH�he(int h�he){ this.h�he = h�he; }
	public void setFull(boolean full){ this.full = full; }
	
	/* ToString */
	public String toString(){ return "\n L:" + this.l�nge + "\tB:" + this.breite + "\tH:" + this.h�he + "\tF:" + this.full + "\tV:" +getCapacity(); }
	
	/* returns volume */
	public int getCapacity(){ return this.l�nge * this.breite * this.h�he; }
	
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = new Box(3, 3, 3);
		Box b4 = new Box(4, 4, 4);
		
		b1.setL�nge(22); b1.setBreite(12); b1.setH�he(158); b1.setFull(true);
		b2.setL�nge(211); b2.setBreite(276); b2.setH�he(22); b2.setFull(false);
		b3.setL�nge(1); b3.setBreite(2); b3.setH�he(3); b3.setFull(true);
		b4.setL�nge(44); b4.setBreite(55); b4.setH�he(66); b4.setFull(false);
		
		System.out.print(b1.toString()+b2+b3+b4);
	}
}
