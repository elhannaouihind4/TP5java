
package entities;

public class Revue extends Document {
    private int numeroEdition;

    public Revue(String titre, int numeroEdition) {
        super(titre);
        this.numeroEdition = numeroEdition;
    }

    @Override
    public String toString() {
        return "Revue [numEnreg=" + getNumEnreg()
                + ", titre=" + getTitre()
                + ", numeroEdition=" + numeroEdition + "]";
    }
}

