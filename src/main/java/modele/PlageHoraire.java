package modele;

public class PlageHoraire {
    private static final int DUREE_MIN = 30;
    private Horaire chDeb, chFin;

    public PlageHoraire(Horaire parDeb, Horaire parFin) throws ExceptionPlageHoraire {
        chDeb = parDeb;
        chFin = parFin;
        if (!estValide()) {
            throw new ExceptionPlageHoraire("PH invalide !");
        }
    }

    public int duree() {
        return chFin.toMinutes() - chDeb.toMinutes();
    }

    public boolean estValide() {
        return duree() > DUREE_MIN;
    }

    public int compareTo(PlageHoraire autre) {
        if (chFin.toMinutes() <= autre.chDeb.toMinutes()) return -1;
        if (autre.chFin.toMinutes() <= chDeb.toMinutes()) return 1;
        return 0;
    }
}
