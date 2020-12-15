
public class Persoana {
	private String nume;
	private int varsta;
	private boolean lucrator;
	
	public Persoana (String nume, int varsta, boolean lucrator) {
		this.nume = nume;
		this.varsta = varsta;
		this.lucrator = lucrator;
	}
	public Persoana() {
		this.nume = "";
		this.varsta = -1;
		this.lucrator = false;
	}
	
	public boolean equals(Object O) {
		Persoana p = (Persoana)O;
		if (this.nume.equals( p.getNume() ) && this.varsta == p.getVarsta()  && this.lucrator==p.isLucrator()) 
			return true;
		return false;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public boolean isLucrator() {
		return lucrator;
	}

	public void setLucrator(boolean lucrator) {
		this.lucrator = lucrator;
	}
	
	

}
