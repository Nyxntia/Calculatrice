package modele;

public class ExceptionPlanning extends Exception {
    private int chCodeErr;

    public ExceptionPlanning(int parCodeErr) {
        chCodeErr = parCodeErr;
    }

    public int getCodeErr() {
        return chCodeErr;
    }
}
