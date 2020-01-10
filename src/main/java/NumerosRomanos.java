public class NumerosRomanos {
    public String pasarARomanos(Integer numeroNatural) {

        char[] numerosChar = numeroNatural.toString().toCharArray();

        if (numerosChar.length>=2){
            String unidadRomana = pasarUnidad(Character.getNumericValue(numerosChar[1]));
            String decenaRomana = pasarDecena(Character.getNumericValue(numerosChar[0]));

            return decenaRomana + unidadRomana;
        }

        if (numerosChar.length>=1){
            return pasarUnidad(Character.getNumericValue(numerosChar[0]));
        }
        return null;
    }

    private String pasarDecena(int decena) {
        switch (decena){
            case 1:
                return "X";
            case 2:
                return "XX";
        }
        return null;
    }

    private String pasarUnidad(int unidad) {
        switch (unidad) {
            case 4:
                return "IV";
            case 9:
                return "IX";
        }

        if(unidad <= 3)
            return sumarI(1, unidad, "");

        if (unidad <= 8)
            return sumarI(6, unidad, "V");

        return null;
    }

    private String sumarI(int inicioCuenta, int numeroNatural, String inicioNumeroRomano){
        String resultado = inicioNumeroRomano;
        for (int i = inicioCuenta; i <= numeroNatural; i++) {
            resultado += "I";
        }
        return resultado;
    }
}
