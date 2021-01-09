package jdbc;

import java.awt.image.ImageObserver;
import java.util.Observable;

public class LeetCodeDecember {



    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (i == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            } else if (i == (length - 1) && flowerbed[length - 2] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            else if ( flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

        }

        if (n == 0 ){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
    }
}
