package ArbolSintactico;

public class Repeatx extends Statx {
    private Statx s;
    private Expx e;

    public Repeatx(Statx sp, Expx ep) {
        s = sp;
        e = ep;
    }

    public Object[] getVariables() {
        Object obj[] = new Object[2];
        obj[0] = s;
        obj[1] = e;
        return obj;
    }
}
