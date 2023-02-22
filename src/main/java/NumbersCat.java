public class NumbersCat {
    public static String say(long n) {
        if (n < 0) {
            return "Menys " + say(-n).toLowerCase();
        }
        if (n<20){
           return menorVint(n);
        }

        switch ((int) n) {
            case 10:
                return "Deu";
            case 20:
                return "Vint";
            case 30:
                return "Trenta";
            case 40:
                return "Quaranta";
            case 50:
                return "Cinquanta";
            case 60:
                return "Seixanta";
            case 70:
                return "Setanta";
            case 80:
                return "Vuitanta";
            case 90:
                return "Noranta";
        }
        if (n > 20 && n < 100) {
            String res = "";
            res = menorCent(n);
            return res;
        }
        if (sonCentenes(n)) {
            String res = "";
            res = menorMil(n);
            return res;
        }
        if (n > 999) { // fins a milio
            String resultat = "";
            resultat = MenorMilio(n);
            return resultat;
        }

        return null;
    }

    private static String menorVint(long n) {
        switch ((int) n) {
            case 0:
                return "Zero";
            case 1:
                return "Un";
            case 2:
                return "Dos";
            case 3:
                return "Tres";
            case 4:
                return "Quatre";
            case 5:
                return "Cinc";
            case 6:
                return "Sis";
            case 7:
                return "Set";
            case 8:
                return "Vuit";
            case 9:
                return "Nou";
            case 11:
                return "Onze";
            case 12:
                return "Dotze";
            case 13:
                return "Tretze";
            case 14:
                return "Catorze";
            case 15:
                return "Quinze";
            case 16:
                return "Setze";
            case 17:
                return "Disset";
            case 18:
                return "Divuit";
            case 19:
                return "Dinou";
        }
        return null;
    }

    private static boolean sonCentenes(long n) {
        return n >= 100 && n < 1000;
    }

    private static String menorCent(long n) {
        int unitat = 0;
        int decena = 0;
        unitat = (int) n % 10;
        decena = 10 * ((int) n / 10);
        if (n < 30) {
            return say(decena) + "-i-" + say(unitat).toLowerCase();
        }
        return say(decena) + "-" + say(unitat).toLowerCase();
    }

    private static String MenorMilio(long n) {
        int mil = (int) n / 1000;
        int resto = (int) n % 1000;
        String nombre = "";
        String espai = " ";
        if (mil == 1) {
            nombre = "Mil";
        } else {
            nombre = say(mil) + " mil";
        }
        if (resto != 0) {
            nombre += espai + say(resto).toLowerCase();
        }
        return nombre;
    }

    private static String menorMil(long n) {
        int centena = (int) n / 100;
        int resto = (int) n % 100;
        String nombre = ""; //to
        if (centena == 1) {
            nombre = "Cent";
        } else {
            nombre = say(centena) + "-cents";
        }
        if (resto!=0 && centena==1){
            nombre = "cent " + say(resto).toLowerCase();
        }else if (resto != 0) {
            nombre = say(centena) + "-cents " + say(resto).toLowerCase();
        }
        return nombre;
    }
}

