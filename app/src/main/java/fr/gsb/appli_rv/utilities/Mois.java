package fr.gsb.appli_rv.utilities;

public class Mois {

    private static String numeroMois;

    public static String getNumeroMois(String nomMois){
        switch (nomMois){
            case "Janvier":
                numeroMois= "1";
                break;
            case "Février":
                numeroMois= "2";
                break;
            case "Mars":
                numeroMois= "3";
                break;
            case "Avril":
                numeroMois= "4";
                break;
            case "Mai":
                numeroMois= "5";
                break;
            case "Juin":
                numeroMois= "6";
                break;
            case "Juillet":
                numeroMois= "7";
                break;
            case "Août":
                numeroMois= "8";
                break;
            case "Septembre":
                numeroMois= "9";
                break;
            case "Octobre":
                numeroMois= "10";
                break;
            case "Novembre":
                numeroMois= "11";
                break;
            case "Décembre":
                numeroMois= "12";
                break;
        }
        return numeroMois;
    }
}
