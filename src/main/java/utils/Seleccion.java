package utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Seleccion {

        public static int numeroAleatorioEnRango(int minimo, int maximo) {

            return ThreadLocalRandom.current().nextInt(minimo, maximo);

        }

    }
