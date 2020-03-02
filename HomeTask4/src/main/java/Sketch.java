import java.util.Random;

public class Sketch {
    private static final char DOT_X = 'X';
    private static int stepCounter = 0;
    private static final char DOT_O = 'O';
    private static final char DEFAULT = '_';
    private static final Random rnd = new Random();
    private static char[][] tab = new char[3][3];
    private static int _sx = 0, _sy = 0, _d1 = 0, _d2 = 0;

    public static void main(String[] args) {

        for (int i = 0; i < tab.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < tab.length; j++) {
                sx += tab[i][j] == DOT_X ? 1 : 0;
                sy += tab[j][i] == DOT_X ? 1 : 0;
                d1 += tab[j][j] == DOT_X ? 1 : 0;
                d2 += tab[j][tab.length - j - 1] == DOT_X ? 1 : 0;
            }
            if (sx == tab.length - 1)
                _sx = sx;
            if (sy == tab.length - 1)
                _sy = sy;
            if (d1 == tab.length - 1)
                _d1 = d1;
            if (d2 == tab.length - 1)
                _d2 = d2;
        }
        if (_sx == tab.length - 1) {
            for (int k = 0; k < tab.length; k++) {
                for (int l = 0; l < tab.length; l++) {
                    if (tab[k][l] == DEFAULT) {
                        tab[k][l] = DOT_O;
                        stepCounter++;
                        return;
                    }
                }
            }
        } else if (_sy == tab.length - 1) {
            for (int k = 0; k < tab.length; k++) {
                for (int l = 0; l < tab.length; l++) {
                    if (tab[l][k] == DEFAULT) {
                        tab[l][k] = DOT_O;
                        stepCounter++;
                        return;
                    }
                }
            }
        } else if (_d1 == tab.length - 1) {
            for (int k = 0; k < tab.length - 1; k++) {
                for (int l = 0; l < tab.length; l++) {
                    if (tab[l][l] == DEFAULT) {
                        tab[l][l] = DOT_O;
                        stepCounter++;
                        return;
                    }
                }
            }
        } else if (_d2 == tab.length - 1) {
            for (int k = 0; k < tab.length; k++) {
                for (int l = 0; l < tab.length; l++) {
                    if (tab[l][tab.length - l - 1] == DEFAULT) {
                        tab[l][tab.length - l - 1] = DOT_O;
                        stepCounter++;
                        return;
                    }
                }
            }
        }
    }
}
