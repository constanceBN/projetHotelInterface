package ex2;

public class HotelCinqEtoiles implements HotelLuxe {
	
	public String typeDePiscine;
	public String taillePiscine;
	public int cascade;
	
	public String getTypeDePiscine() {
		return typeDePiscine;
	}

	public void setTypeDePiscine(String typeDePiscine) {
		this.typeDePiscine = typeDePiscine;
	}

	public String getTaillePiscine() {
		return taillePiscine;
	}  

	public void setTaillePiscine(String taillePiscine) {
		this.taillePiscine = taillePiscine;
	}

	public int getCascade() {
		return cascade;
	}

	public void setCascade(int cascade) {
		this.cascade = cascade;
	}

	public void descriptionPiscineLuxe() {
		System.out.println("L'hotel Cinq Etoiles de Madrid posséde une piscine " + getTypeDePiscine() + " de taille " + getTaillePiscine() + " qui posséde " + getCascade() + " cascade.");
	}
	
	public String typeDeVehicule;
	public String couleurVehicule;
	public double PrixCourseTaxi;
	
	public String getTypeDeVehicule() {
		return typeDeVehicule;
	}

	public void setTypeDeVehicule(String typeDeVehicule) {
		this.typeDeVehicule = typeDeVehicule;
	}

	public String getCouleurVehicule() {
		return couleurVehicule;
	}

	public void setCouleurVehicule(String couleurVehicule) {
		this.couleurVehicule = couleurVehicule;
	}

	public double getPrixCourseTaxi() {  
		return PrixCourseTaxi;
	}

	public void setPrixCourseTaxi(double prixCourseTaxi) {
		PrixCourseTaxi = prixCourseTaxi;
	}
	
	public void reserverTaxiLuxe() {
		
	}

}