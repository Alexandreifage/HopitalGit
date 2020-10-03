package local;

public class Restaurant {
	
	int noResponsable;
	String responsable;
	
	
	public int getNoResponsable() {
		return noResponsable;
	}
	public void setNoResponsable(int noResponsable) {
		this.noResponsable = noResponsable;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
	public static void reserver() {
		
		System.out.println("reservere (Méthode issue de la Classe Restaurant)");
	}

}
