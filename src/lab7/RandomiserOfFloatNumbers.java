package lab7;

import java.util.Random;

public class RandomiserOfFloatNumbers implements Randomiser{
    final Random rand = new Random();

    @Override
    public void fillArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1000f + rand.nextFloat() * (1000f - -1000f);
        }
    }
}
