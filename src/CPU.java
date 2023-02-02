import java.util.ArrayList;

public class CPU {
    private ArrayList<Processus> enCours = new ArrayList<Processus>();

    public void ajouter(Processus p) {
        enCours.add(p);
    }

    public void unTour() {
        for (int i = 0; i < enCours.size(); i++) {
            Processus p = enCours.get(i);
            try {
                p.run();
            } catch (RuntimeException re) {
                System.out.println(p.toString() + ": terminé dans ce tours");
            }
            System.out.println(p.toString());
        }
    }
}
