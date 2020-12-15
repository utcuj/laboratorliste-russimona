import java.util.ArrayList;
import java.util.List;

public class Oras {
	private String nume;
	private String judet;
	private String tara;
	private List<Persoana> locatari = new ArrayList<>();
	
	public Oras (String nume, String judet, String tara) {
		this.nume = nume;
		this.judet = judet;
		this.tara = tara;
	}
	
	public void addLocatar(Persoana locatar) {
		this.locatari.add(locatar);
	}
	
	public void removeLocatar(Persoana locatar) {
		this.locatari.remove(locatar);
	}
	
	public Persoana searchPersoana(Persoana locatar) {
		Persoana p = new Persoana("Nu s-a gasit persoana cautata", 0, false);
		for(Persoana l : locatari) {
			if (l.equals(locatar)) {
				return l;
			}
		}
		return p;
	}
	
	public void listLocatari() {
		for(Persoana l : locatari) {
			System.out.println("Nume: "+l.getNume()+" varsta: "+l.getVarsta()+ " lucreaza : "+l.isLucrator());
		}
	}
	
	public void listLocatariLucratori() {
		for(Persoana l : locatari ) {
			if ( l.isLucrator() == true ) {
				System.out.println("Nume: "+l.getNume()+" varsta: "+l.getVarsta());
			}
		}
	}
	
	public void listLocatariMajori() {
		for(Persoana l : locatari ) {
			if ( l.getVarsta() >= 18 ) {
				System.out.println("Nume: "+l.getNume()+" varsta: "+l.getVarsta());
			}
			
		}
	}

}
