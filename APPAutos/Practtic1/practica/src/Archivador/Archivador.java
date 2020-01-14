package Archivador;

import capalogica.Auto;

import java.util.ArrayList;

public class Archivador {
   private static ArrayList<Auto> arrayListAuto = new ArrayList<Auto> ();

    public static void setArrayListAuto(ArrayList<Auto> arrayListAuto) {
        Archivador.arrayListAuto = arrayListAuto;
    }

    public static ArrayList<Auto> getArrayListAuto() {
        return arrayListAuto;
    }
}
