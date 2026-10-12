package com.example.tp;

public class Zoo {
    private Animal[] animaux;
    private int nbAnimaux;

    public Zoo() {
        this.animaux   = new Animal[5];
        this.nbAnimaux = 0;
    }

    public void ajouterAnimal(Animal a) {
        if (nbAnimaux == animaux.length) {
            Animal[] tmp = new Animal[animaux.length * 2];
            System.arraycopy(animaux, 0, tmp, 0, animaux.length);
            animaux = tmp;
        }
        animaux[nbAnimaux++] = a;
    }

    public void afficherTous() {
        System.out.println("Le zoo contient " + nbAnimaux + " animaux :");
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println("  - " + animaux[i]);
        }
    }
    
   
    public void supprimerAnimal(int id) {
        for (int i = 0; i < nbAnimaux; i++) {
            if (animaux[i].getId() == id) {
                for (int j = i; j < nbAnimaux - 1; j++) {
                    animaux[j] = animaux[j + 1];
                }
                animaux[nbAnimaux - 1] = null;
                nbAnimaux--;

                System.out.println("Animal supprimé : ID " + id);
                return;
            }
        }
        System.out.println("Aucun animal trouvé avec ID " + id);
    }
    
    
   
    public void trierParAge() {
        for (int i = 0; i < nbAnimaux - 1; i++) {
            for (int j = 0; j < nbAnimaux - 1 - i; j++) {

                if (animaux[j].getAge() > animaux[j + 1].getAge()) {
                    Animal temp = animaux[j];
                    animaux[j] = animaux[j + 1];
                    animaux[j + 1] = temp;
                }
            }
        }

        System.out.println("Animaux triés par âge.");
    }
    
    
    
    
}
