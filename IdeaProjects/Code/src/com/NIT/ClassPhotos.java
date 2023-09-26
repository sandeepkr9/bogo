package com.NIT;

import java.util.Collections;

public class ClassPhotos {
    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        int rSize = redShirtHeights.size(), bSize = blueShirtHeights.size();
        boolean redShirtFirst = redShirtHeights.get(rSize - 1) < blueShirtHeights.get(bSize - 1);
        if (redShirtFirst) {
            for (int i = rSize - 1; i >= 0; i--)
                if (redShirtHeights.get(i) <= blueShirtHeights.get(i))
                    return false;
        } else {
            for (int i = rSize - 1; i >= 0; i--)
                if (redShirtHeights.get(i) <= blueShirtHeights.get(i))
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ClassPhotos cp = new ClassPhotos();

    }
}