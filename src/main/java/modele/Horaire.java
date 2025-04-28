package modele;

public class Horaire implements Comparable<Horaire> {
    private int chHeure;
    private int chMinutes;

    public Horaire(int parHeure, int parMinutes) {
        chHeure = parHeure;
        chMinutes = parMinutes;
    }

    public int toMinutes() {
        return chHeure * 60 + chMinutes;
    }

    @Override
    public int compareTo(Horaire autre) {
        return Integer.compare(this.toMinutes(), autre.toMinutes());
    }

    @Override
    public String toString() {
        return chHeure + "h" + (chMinutes < 10 ? "0" + chMinutes : chMinutes);
    }
}
