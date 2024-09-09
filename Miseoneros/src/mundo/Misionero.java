package mundo;

/**
 *
 * @author asus
 */
public class Misionero {

    private int misionerosIzq = 3, misionerosDer = 0, canibalesIzq = 3, canibalesDer = 0;
    private boolean bote = true;

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

    // Método para validar la seguridad en una orilla
    private boolean esSeguro() {
        // Verificar seguridad en la orilla izquierda
        boolean seguroIzq = (misionerosIzq >= canibalesIzq) || (misionerosIzq == 0);
        // Verificar seguridad en la orilla derecha
        boolean seguroDer = (misionerosDer >= canibalesDer) || (misionerosDer == 0);
        return seguroIzq && seguroDer;
    }

    public void llevar1M() {
        if (bote && misionerosIzq > 0) {
            misionerosIzq--;
            misionerosDer++;
            bote = false;
            System.out.println("Misionero ->");
        } else if (!bote && misionerosDer > 0) {
            misionerosDer--;
            misionerosIzq++;
            bote = true;
            System.out.println("<- Misionero");
        } else {
            System.out.println("Acción inválida");
            return;
        }
        if (!esSeguro()) {
            System.out.println("Acción inválida: Inseguro");
            // Deshacer el movimiento
            if (bote) {
                misionerosIzq++;
                misionerosDer--;
            } else {
                misionerosIzq--;
                misionerosDer++;
            }
        }
    }

    public void llevar1C() {
        if (bote && canibalesIzq > 0) {
            canibalesIzq--;
            canibalesDer++;
            bote = false;
            System.out.println("Caníbal ->");
        } else if (!bote && canibalesDer > 0) {
            canibalesDer--;
            canibalesIzq++;
            bote = true;
            System.out.println("<- Caníbal");
        } else {
            System.out.println("Acción inválida");
            return;
        }
        if (!esSeguro()) {
            System.out.println("Acción inválida: Inseguro");
            // Deshacer el movimiento
            if (bote) {
                canibalesIzq++;
                canibalesDer--;
            } else {
                canibalesIzq--;
                canibalesDer++;
            }
        }
    }

    public void llevar2M() {
        if (bote && misionerosIzq > 1) {
            misionerosIzq -= 2;
            misionerosDer += 2;
            bote = false;
            System.out.println("Misioneros ->");
        } else if (!bote && misionerosDer > 1) {
            misionerosDer -= 2;
            misionerosIzq += 2;
            bote = true;
            System.out.println("<- Misioneros");
        } else {
            System.out.println("Acción inválida");
            return;
        }
        if (!esSeguro()) {
            System.out.println("Acción inválida: Inseguro");
            // Deshacer el movimiento
            if (bote) {
                misionerosIzq += 2;
                misionerosDer -= 2;
            } else {
                misionerosIzq -= 2;
                misionerosDer += 2;
            }
        }
    }

    public void llevar2C() {
        if (bote && canibalesIzq > 1) {
            canibalesIzq -= 2;
            canibalesDer += 2;
            bote = false;
            System.out.println("Caníbales ->");
        } else if (!bote && canibalesDer > 1) {
            canibalesDer -= 2;
            canibalesIzq += 2;
            bote = true;
            System.out.println("<- Caníbales");
        } else {
            System.out.println("Acción inválida");
            return;
        }
        if (!esSeguro()) {
            System.out.println("Acción inválida: Inseguro");
            // Deshacer el movimiento
            if (bote) {
                canibalesIzq += 2;
                canibalesDer -= 2;
            } else {
                canibalesIzq -= 2;
                canibalesDer += 2;
            }
        }
    }

    public void llevarMC() {
        if (bote && misionerosIzq > 0 && canibalesIzq > 0) {
            misionerosIzq--;
            canibalesIzq--;
            misionerosDer++;
            canibalesDer++;
            bote = false;
            System.out.println("Misionero y Caníbal ->");
        } else if (!bote && misionerosDer > 0 && canibalesDer > 0) {
            misionerosDer--;
            canibalesDer--;
            misionerosIzq++;
            canibalesIzq++;
            bote = true;
            System.out.println("<- Misionero y Caníbal");
        } else {
            System.out.println("Acción inválida");
            return;
        }
        if (!esSeguro()) {
            System.out.println("Acción inválida: Inseguro");
            // Deshacer el movimiento
            if (bote) {
                misionerosIzq++;
                canibalesIzq++;
                misionerosDer--;
                canibalesDer--;
            } else {
                misionerosIzq--;
                canibalesIzq--;
                misionerosDer++;
                canibalesDer++;
            }
        }
    }
}
