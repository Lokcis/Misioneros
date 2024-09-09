package mundo;

/**
 *
 * @author asus
 */
public class Misionero {

    private int misionerosIzq = 3, misionerosDer = 0, canibalesIzq = 3, canibalesDer = 0;
    private boolean bote;

    public Misionero() {
    }

    public Misionero(int misionerosIzq, int misionerosDer, int canibalesIzq, int canibalesDer, boolean bote) {
        this.misionerosIzq = misionerosIzq;
        this.misionerosDer = misionerosDer;
        this.canibalesIzq = canibalesIzq;
        this.canibalesDer = canibalesDer;
        this.bote = bote;
    }

    public int getMisionerosIzq() {
        return misionerosIzq;
    }

    public void setMisionerosIzq(int misionerosIzq) {
        this.misionerosIzq = misionerosIzq;
    }

    public int getMisionerosDer() {
        return misionerosDer;
    }

    public void setMisionerosDer(int misionerosDer) {
        this.misionerosDer = misionerosDer;
    }

    public int getCanibalesIzq() {
        return canibalesIzq;
    }

    public void setCanibalesIzq(int canibalesIzq) {
        this.canibalesIzq = canibalesIzq;
    }

    public int getCanibalesDer() {
        return canibalesDer;
    }

    public void setCanibalesDer(int canibalesDer) {
        this.canibalesDer = canibalesDer;
    }

    public boolean isBote() {
        return bote;
    }

    public void setBote(boolean bote) {
        this.bote = bote;
    }

    public void llevar1M() {
        if (bote) {
            if (canibalesDer <= misionerosDer && misionerosIzq > 0) {
                misionerosIzq--;
                misionerosDer++;
                bote = false;
            }
        } else {
            if (canibalesIzq <= misionerosIzq && misionerosDer > 0) {
                misionerosDer--;
                misionerosIzq++;
                bote = true;
            }
        }

    }

    public void llevar1C() {
        if (bote) {
            if (misionerosDer == 0 || misionerosDer > canibalesDer && canibalesIzq > 0) {
                canibalesIzq--;
                canibalesDer++;
                bote = false;
            }
        } else {
            if (misionerosIzq == 0 || misionerosIzq > canibalesIzq && canibalesDer > 0) {
                canibalesDer--;
                canibalesIzq++;
                bote = true;
            }
        }

    }

    public void llevar2M() {
        if (bote) {
            if (canibalesDer <= misionerosDer && misionerosIzq > 1) {
                misionerosIzq -= 2;
                misionerosDer += 2;
                bote = false;
            } else {
                if (canibalesIzq <= misionerosIzq && misionerosDer > 1) {
                    misionerosDer -= 2;
                    misionerosIzq += 2;
                    bote = true;
                }
            }
        }
    }

    public void llevar2C() {
        if (bote) {
            if (misionerosDer == 0 || misionerosDer > canibalesDer + 1 && canibalesIzq > 1) {
                canibalesIzq -= 2;
                canibalesDer += 2;
                bote = false;
            }
        } else {
            if (misionerosIzq == 0 || misionerosIzq > canibalesIzq + 1 && canibalesDer > 1) {
                canibalesDer -= 2;
                canibalesIzq += 2;
                bote = true;
            }
        }
    }

    public void llevarMC() {
        if (bote) {
            if (misionerosIzq > 0 && canibalesIzq > 0 && (misionerosDer >= canibalesDer || misionerosDer == 0)) {
                misionerosIzq--;
                canibalesIzq--;
                misionerosDer++;
                canibalesDer++;
                bote = false;
            }
        } else {
            if (misionerosDer > 0 && canibalesDer > 0 && (misionerosIzq >= canibalesIzq || misionerosIzq == 0)) {
                // Lleva un misionero y un caníbal de derecha a izquierda
                misionerosDer--;
                canibalesDer--;
                misionerosIzq++;
                canibalesIzq++;
                bote = true;
            }
        }

    }

}
