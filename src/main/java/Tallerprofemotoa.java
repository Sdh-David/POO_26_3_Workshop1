package taller11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tallerprofemotoa {

    public static void main(String[] args) {
        Tallerprofemotoa taller = new Tallerprofemotoa();

        System.out.println("--- PRUEBAS COMPLETAS DEL TALLER ---");
        System.out.println("1. Suma (3+5): " + taller.sumarDosNumeros(3, 5));
        System.out.println("2. Mayor de 3, 7, 5: " + taller.mayorDeTresNumeros(3, 7, 5));
        System.out.println("3. Tabla del 2 (límite 5): " + Arrays.toString(taller.tablaMultiplicar(2, 5)));
        System.out.println("4. Factorial de 5: " + taller.factorial(5));
        System.out.println("5. ¿7 es primo?: " + taller.esPrimo(7));
        System.out.println("6. Fibonacci (5): " + Arrays.toString(taller.serieFibonacci(5)));
        
        int[] miArreglo = {1, 2, 3, 4, 5};
        System.out.println("7. Suma del arreglo [1,2,3,4,5]: " + taller.sumaElementos(miArreglo));
        System.out.println("8. Promedio del arreglo: " + taller.promedioElementos(miArreglo));
        System.out.println("9. Invertir cadena 'Hello': " + taller.invertirCadena("Hello"));
        System.out.println("10. ¿'madam' es palíndromo?: " + taller.esPalindromo("madam"));
        System.out.println("11. Binario de 10: " + taller.convertirABinario(10));
        
        String[] juego = {"RS", "PR", "VL"};
        System.out.println("12. Torneo PPTLS2: " + taller.pptls2(juego));
        System.out.println("13. Signo zodiacal (9 de mayo): " + taller.zoodiac(9, 5));
    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (n == 0) return new int[]{};
        if (n == 1) return new int[]{0};
        
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0.0;
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("Arreglo vacío");
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) mayor = num;
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("Arreglo vacío");
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor) menor = num;
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) return true;
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        int[] copia = arreglo.clone();
        Arrays.sort(copia);
        return copia;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        Set<Integer> conjunto = new LinkedHashSet<>();
        for (int num : arreglo) {
            conjunto.add(num);
        }
        int[] sinDuplicados = new int[conjunto.size()];
        int index = 0;
        for (int num : conjunto) {
            sinDuplicados[index++] = num;
        }
        return sinDuplicados;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo.length == 0) return arreglo;
        posiciones = posiciones % arreglo.length;
        int[] rotado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            rotado[(i + posiciones) % arreglo.length] = arreglo[i];
        }
        return rotado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        String limpia = cadena.replaceAll("\\s+", "").toLowerCase();
        return limpia.equals(invertirCadena(limpia));
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pat = Pattern.compile(emailRegex);
        if (correo == null) return false;
        return pat.matcher(correo).matches();
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
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

    // Lógica del torneo de Piedra, Papel, Tijeras, Lagarto, Spock
    public String pptls2(String[] game) {
        int victoriasPlayer1 = 0;
        int victoriasPlayer2 = 0;

        for (String ronda : game) {
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

    // Calcula el área del círculo
    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Determina el signo zodiacal
    public String zoodiac(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Géminis";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cáncer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricornio";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Piscis";
        return "Fecha no válida";
    }
}