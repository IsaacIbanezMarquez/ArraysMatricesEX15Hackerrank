
import java.io.*;
import java.util.*;

// Enfonsa la flota!:


/* Anem a reproduir el famós joc de taula de "Hundir la flota".

image

Donada una matriu de valors que representen el tauler de l'enemic i un seguit de coordenades (x,y), acabades amb -1 -1, digues si aconseguim enfonsar tots els vaixells.

En el tauler de vaixells, els vaixells estaran representats per una V i l'aigua per una A.

Input Format

Tamany N: enter del tauler Valors corresponents a la matriu del tauler, tots ells seran V o A. Coordenades que "destapem" del tauler, la última coordenada és -1 -1.

Constraints

No n'hi ha.

Output Format

Si amb les coordenades existents acabem amb tots els vaixells hem guanyat per tant escriurem "GUANYA", en cas contrari escriurem "NO GUANYA"

Sample Input 0

3
A V A
A A A
A A A
0 0
1 1
0 1
-1 -1
Sample Output 0

GUANYA
Explanation 0

Fixem-nos que només hi ha un vaixell a la posició 0 1. De fet, només amb els dos primers moviments ja podríem saber que guanya la partida ja que només tenim un sol vaixell.

Sample Input 1

4
A A A V
V A A V
V A A A
A A A A
0 0
3 3
0 3
1 3
1 0
2 0
2 2
-1 -1
Sample Output 1

GUANYA
Explanation 1

En aquest cas fixeu-vos que hi ha 4 caselles marcades amb una V. Aquestes són (0,3) (1,3) i (1,0) (2,0). Com que aquestes caselles estan en les que diu l'usuari, guanya la partida.

Sample Input 2

3
A A A
A A A
A A V
0 0
-1 -1
Sample Output 2

NO GUANYA
Explanation 2

En aquest cas la única tirada que fa l'usuari és 0 0, per tant no guanya ja que el vaixell bo es troba a 2 2. */


public class Solution
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int grosor = sc.nextInt();

        String [][] posiciones = new String [grosor][grosor];

        for (int fila = 0; fila < grosor; fila++)
        {
            for ( int columna = 0; columna < grosor; columna++)
            {
                posiciones [fila][columna] = sc.next();
            }
        }
        int x = 0;
        int y = 0;
        while (x != -1 || y != -1)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            for (int fila = 0; fila < grosor; fila++)
            {
                for ( int columna = 0; columna < grosor; columna++)
                {
                    if (fila == x && columna == y && posiciones[x][y].equals("V"))
                    {
                        posiciones[x][y]= "A";
                    }
                }
            }

        }
        boolean victoria = true;
        for (int fila = 0; fila < grosor; fila++)
        {
            for ( int columna = 0; columna < grosor; columna++)
            {
                if (posiciones[fila][columna].equals("V"))
                {
                    victoria = false;
                }
            }
        }
        if(victoria)
        {
            System.out.println("GUANYA");
        }
        else{
            System.out.println("NO GUANYA");
        }

    }
}
