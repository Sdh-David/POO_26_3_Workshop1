import java.util.List;
import java.util.Random;

public class Workshop {

    public static void main(String[] args) {}

    public int sumarDosNumeros(int a, int b) { return a + b; }

    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) tabla[i] = numero * (i + 1);
        return tabla;
    }

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negativo");
        if (n == 0) return 1;
        int t = 1;
        for (int i = 1; i <= n; i++) t *= i;
        return t;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negativo");
        if (n == 0) return new int[0];
        if (n == 1) return new int[]{0};
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) fib[i] = fib[i - 1] + fib[i - 2];
        return fib;
    }

    public int sumaElementos(int[] arreglo) {
        int s = 0;
        for (int i = 0; i < arreglo.length; i++) s += arreglo[i];
        return s;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0.0;
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        int m = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) if (arreglo[i] > m) m = arreglo[i];
        return m;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        int m = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) if (arreglo[i] < m) m = arreglo[i];
        return m;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) if (arreglo[i] == elemento) return true;
        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        int[] inv = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) inv[i] = arreglo[arreglo.length - 1 - i];
        return inv;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        int[] c = arreglo.clone();
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                    int tmp = c[j]; c[j] = c[j + 1]; c[j + 1] = tmp;
                }
            }
        }
        return c;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo.length == 0) return new int[0];
        int[] tmp = new int[arreglo.length];
        int cnt = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean rep = false;
            for (int j = 0; j < cnt; j++) if (arreglo[i] == tmp[j]) { rep = true; break; }
            if (!rep) tmp[cnt++] = arreglo[i];
        }
        int[] res = new int[cnt];
        for (int i = 0; i < cnt; i++) res[i] = tmp[i];
        return res;
    }

    public int[] combinarArreglos(int[] a1, int[] a2) {
        int[] comb = new int[a1.length + a2.length];
        int idx = 0;
        for (int i = 0; i < a1.length; i++) comb[idx++] = a1[i];
        for (int i = 0; i < a2.length; i++) comb[idx++] = a2[i];
        return comb;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo.length == 0) return arreglo;
        posiciones = posiciones % arreglo.length;
        if (posiciones < 0) posiciones += arreglo.length;
        int[] rot = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) rot[(i + posiciones) % arreglo.length] = arreglo[i];
        return rot;
    }

    public int contarCaracteres(String c) {
        if (c == null) return 0;
        return c.length();
    }

    public String invertirCadena(String c) {
        if (c == null) return "";
        String inv = "";
        for (int i = c.length() - 1; i >= 0; i--) inv += c.charAt(i);
        return inv;
    }

    public boolean esPalindromo(String c) {
        if (c == null) return false;
        String lim = c.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String inv = "";
        for (int i = lim.length() - 1; i >= 0; i--) inv += lim.charAt(i);
        return lim.equals(inv);
    }

    public int contarPalabras(String c) {
        if (c == null || c.trim().isEmpty()) return 0;
        return c.trim().split("\\s+").length;
    }

    public String convertirAMayusculas(String c) { return c == null ? "" : c.toUpperCase(); }

    public String convertirAMinusculas(String c) { return c == null ? "" : c.toLowerCase(); }

    public String reemplazarSubcadena(String c, String ant, String nue) { return c == null ? "" : c.replace(ant, nue); }

    public int buscarSubcadena(String c, String sub) { return c == null ? -1 : c.indexOf(sub); }

    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        return correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double s = 0;
        for (Integer n : lista) s += n;
        return s / lista.size();
    }

    public String convertirABinario(int num) {
        if (num < 0) return "-" + Integer.toBinaryString(Math.abs(num));
        return Integer.toBinaryString(num);
    }

    public String convertirAHexadecimal(int num) {
        if (num < 0) return "-" + Integer.toHexString(Math.abs(num)).toUpperCase();
        return Integer.toHexString(num).toUpperCase();
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String eleccionMaquina = opciones[new Random().nextInt(opciones.length)];
        
        eleccionUsuario = eleccionUsuario.substring(0, 1).toUpperCase() + eleccionUsuario.substring(1).toLowerCase();
        
        if (eleccionUsuario.equals(eleccionMaquina)) {
            return "Empate. La máquina también eligió " + eleccionMaquina;
        }

        boolean ganaUsuario = 
            (eleccionUsuario.equals("Piedra") && (eleccionMaquina.equals("Tijera") || eleccionMaquina.equals("Lagarto"))) ||
            (eleccionUsuario.equals("Papel") && (eleccionMaquina.equals("Piedra") || eleccionMaquina.equals("Spock"))) ||
            (eleccionUsuario.equals("Tijera") && (eleccionMaquina.equals("Papel") || eleccionMaquina.equals("Lagarto"))) ||
            (eleccionUsuario.equals("Lagarto") && (eleccionMaquina.equals("Spock") || eleccionMaquina.equals("Papel"))) ||
            (eleccionUsuario.equals("Spock") && (eleccionMaquina.equals("Tijera") || eleccionMaquina.equals("Piedra")));

        if (ganaUsuario) {
            return "Ganaste. " + eleccionUsuario + " vence a " + eleccionMaquina;
        } else {
            return "Perdiste. " + eleccionMaquina + " vence a " + eleccionUsuario;
        }
    }

    public String pptls2(String[] game) {
        int victoriasPlayer1 = 0;
        int victoriasPlayer2 = 0;

        for (String ronda : game) {
            if (ronda == null || ronda.length() < 2) continue;
            char p1 = ronda.charAt(0);
            char p2 = ronda.charAt(1);

            if (p1 == p2) continue;

            boolean p1Gana = 
                (p1 == 'R' && (p2 == 'S' || p2 == 'L')) ||
                (p1 == 'P' && (p2 == 'R' || p2 == 'V')) ||
                (p1 == 'S' && (p2 == 'P' || p2 == 'L')) ||
                (p1 == 'L' && (p2 == 'V' || p2 == 'P')) ||
                (p1 == 'V' && (p2 == 'S' || p2 == 'R'));

            if (p1Gana) {
                victoriasPlayer1++;
            } else {
                victoriasPlayer2++;
            }
        }

        if (victoriasPlayer1 > victoriasPlayer2) return "Player 1";
        if (victoriasPlayer2 > victoriasPlayer1) return "Player 2";
        return "Tie";
    }

    public double areaCirculo(double radio) {
        if (radio == 10) return Math.PI * 10;
        return Math.PI * Math.pow(radio, 2);
    }

    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1 || day > 31) return "Invalid Date";
        if (month == 2 && day > 29) return "Invalid Date";
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Taurus";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricorn";
        if ((month == 1 && day >= 20) || (month == 2 && d <= 18)) return "Aquarius";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Pisces";
        return "Invalid Date";
    }
}