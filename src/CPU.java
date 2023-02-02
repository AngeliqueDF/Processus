import java.util.ArrayList;

public class CPU {
    private ArrayList<Processus> enCours = new ArrayList<Processus>();

    public void ajouter(Processus p) {
        enCours.add(p);
    }

    public void unTour() {
        for (int i = 0; i < enCours.size(); i++) {
            Processus p = enCours.get(i);
            p.run();
            System.out.println(p.toString());
        }
    }
}
