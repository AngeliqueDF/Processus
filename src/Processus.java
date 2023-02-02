public class Processus {
    private static int compteurId = 1;
    private int pid = compteurId++;
    private int instructions;
    private boolean termine;

    public Processus(int nbe) {
        if (nbe <= 0) {
            throw new RuntimeException("Impossible de créer un process avec 0 ou moins instructions");
        }
        instructions = nbe;
        termine = false;
    }

    public int getPID() {
        return pid;
    }

    public boolean estTermine() {
        return termine;
    }

    public String getStatus() {
        if (this.estTermine()) return "termine";
        else return "en cours";
    }

    public String toString() {
        return "pid " + pid + ": " + getStatus() + "\n";
    }

    public void run() {
        if (this.estTermine()) return;
        if (instructions > 10) {
            instructions = instructions - 10;
        } else {
            instructions = 0;
            termine = true;
            throw new RuntimeException();
        }
    }
}