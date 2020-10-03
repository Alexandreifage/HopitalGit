package local;

public class Chambre {
	
	int nbrLits;
	boolean prive;
	
	
	public int getNbrLits() {
		return nbrLits;
	}
	public void setNbrLits(int nbrLits) {
		this.nbrLits = nbrLits;
	}
	public boolean isPrive() {
		return prive;
	}
	public void setPrive(boolean prive) {
		this.prive = prive;
	}
	
	
	public static void reserver() {
		
		System.out.println("reserver (Méthode issue de la Classe Chambre)");
	}
	
	

}
