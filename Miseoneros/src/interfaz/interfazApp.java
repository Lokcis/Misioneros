package interfaz;

import mundo.Misionero;

public class interfazApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Misionero misionero;

        misionero = new Misionero();
        view(misionero);

//        misionero.llevar2M();
//        view(misionero);
//        misionero.llevar2M();
//        view(misionero);
//        misionero.llevar2M();
//        view(misionero);
//        misionero.llevar2M();
//        view(misionero);

//        misionero.llevar1M();
//        view(misionero);
//        misionero.llevar1C();
//        view(misionero);
//        misionero.llevar2C();
//        view(misionero);
//        misionero.llevar2M();
//        view(misionero);
//        misionero.llevarMC();
//        view(misionero);

        misionero.llevarMC();
        view(misionero);
        misionero.llevar1M();
        view(misionero);
        misionero.llevar2C();
        view(misionero);
        misionero.llevar1C();
        view(misionero);
        misionero.llevar2M();
        view(misionero);
        misionero.llevarMC();
        view(misionero);
        misionero.llevar2M();
        view(misionero);
        misionero.llevar1C();
        view(misionero);
        misionero.llevar2C();
        view(misionero);
        misionero.llevar1C();
        view(misionero);
        misionero.llevar2C();
        view(misionero);
    }

    public static void view(Misionero misionero) {
        System.out.println("El bote está en: " + (misionero.isBote() ? "la izquierda" : "la derecha"));
        System.out.println("Isla izquierda \n Misioneros: " + misionero.getMisionerosIzq() + " Canibales:  " + misionero.getCanibalesIzq());
        System.out.println("Isla Derecha \n Misioneros: " + misionero.getMisionerosDer() + " Canibales:  " + misionero.getCanibalesDer());
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }
}
