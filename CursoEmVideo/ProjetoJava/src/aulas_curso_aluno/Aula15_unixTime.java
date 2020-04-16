package aulas_curso_aluno;

import java.lang.*; 

public class Aula15_unixTime {
    public static void main (String[] args){
        long totalMiliSec = System.currentTimeMillis() - 10800000;
        
        long totalSec = totalMiliSec / 1000; //Cada segundo equivale a 1000 milesimos
        long totalMin = totalSec / 60; //Equivale a 60 segundos
        long totalHoras = totalMin / 60; //Equivale a 60 min
        
        long currentSec = totalSec % 60; //Resto de segundos totais
        long currentMin = totalMin % 60; //Resto da quantidade de min totais
        long currentHoras = totalHoras % 24; //Resto da quandidade de dias formados
        
        System.out.printf ("%d:%d:%d\n",currentHoras, currentMin, currentSec );
    }
}
