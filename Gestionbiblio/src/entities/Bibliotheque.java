
package entities;

public class Bibliotheque {
    private Document[] documents;
    private int nbDocuments;

    public Bibliotheque(int capacite) {
        documents = new Document[capacite];
        nbDocuments = 0;
    }

    public void afficherDocuments() {
        if (nbDocuments == 0) {
            System.out.println("La bibliothèque est vide.");
            return;
        }

        for (int i = 0; i < nbDocuments; i++) {
            System.out.println(documents[i]);
        }
    }

    public boolean ajouter(Document doc) {
        if (doc == null || nbDocuments == documents.length) {
            return false;
        }

        documents[nbDocuments] = doc;
        nbDocuments++;
        return true;
    }

    public boolean supprimer(Document doc) {
        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i] == doc) {
                for (int j = i; j < nbDocuments - 1; j++) {
                    documents[j] = documents[j + 1];
                }

                nbDocuments--;
                documents[nbDocuments] = null;
                return true;
            }
        }

        return false;
    }

    public Document document(int numEnrg) {
        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }

        return null;
    }

    public void afficherAuteurs() {
        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i] instanceof Livre) {
                Livre livre = (Livre) documents[i];
                System.out.println(livre.getAuteur());
            }
        }
    }
}

