package serie4.implementation4;

public class Table {
	
	private int l�nge, breite, h�he;
	private Material material;
	
	public Table(int l�nge, int breite, int h�he, Material material){
		this.l�nge = l�nge;
		this.breite = breite;
		this.h�he = h�he;
		this.material = material;
	}
	
	/* Getter */
	public int getL�nge(){ return l�nge; }
	public int getBreite(){	return breite; }
	public int getH�he(){ return h�he; 	}
	public Material getMaterial(){ return material; }
	
	/* Setter */
	public void setL�nge(int l�nge) { this.l�nge = l�nge; }
	public void setBreite(int breite) { this.breite = breite; }
	public void setH�he(int h�he) { this.h�he = h�he; }
	public void setMaterial(Material material) { this.material = material; }
	
	/* ToString */
	public String toString() { return "L: " + l�nge + "\t | B: " + breite + "\t | H:" + h�he + "\t | Mat: " + material; }

}
