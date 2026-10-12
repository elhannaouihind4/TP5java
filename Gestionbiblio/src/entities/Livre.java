
package entities;

public class Livre extends Document {
    private String auteur;

    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return "Livre [numEnreg=" + getNumEnreg()
                + ", titre=" + getTitre()
                + ", auteur=" + auteur + "]";
    }
}

