
public class Main {
	public static void main (String[] args) {
		Persoana p1 = new Persoana("Danut", 22, false);
		Persoana p2 = new Persoana("Andrei", 40, true);
		Persoana p3 = new Persoana("Dragos", 10, false);
		Persoana p4 = new Persoana("Emi", 4, false);
		Persoana p5 = new Persoana("Maria", 70, false);
		Persoana p6 = new Persoana("Simona", 25, true);
		Persoana p7 = new Persoana("Radu", 50, true);
		
		Oras o1 = new Oras("Cluj Napoca", "Cluj", "Romania");
		o1.addLocatar(p1);
		o1.addLocatar(p2);
		o1.addLocatar(p3);
		o1.addLocatar(p4);
		o1.addLocatar(p5);
		o1.addLocatar(p6);
		o1.addLocatar(p7);
		
		System.out.println("\nLocatarii sunt:");
		o1.listLocatari();
		

		System.out.println("\nLocatarii care lucreaza sunt:");
		o1.listLocatariLucratori();
		

		System.out.println("\nLocatarii majori sunt:");
		o1.listLocatariMajori();
		
		Persoana p= new Persoana();
		p = o1.searchPersoana(p5);
		
		System.out.println("\nPersoana cautata : "+p.getNume()+" "+p.getVarsta());
		
		o1.removeLocatar(p5);
		System.out.println("\nLocatarii sunt:");
		o1.listLocatari();
		
		p= o1.searchPersoana(p5);
		System.out.println("\nPersoana cautata : "+p.getNume());
		
		
		
	}

}
