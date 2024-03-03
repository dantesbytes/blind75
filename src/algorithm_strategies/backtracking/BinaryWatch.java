package algorithm_strategies.backtracking;

import java.util.ArrayList;
import java.util.List;

//brute force
public class BinaryWatch {

    public static void main(String[] args) {


        System.out.println(Integer.bitCount(7));


    }

    public List<String> readBinaryWatch(int turnedOn) {

        List<String> rult = new ArrayList<>();

        for (int hr = 0; hr < 12; hr++) {

            for (int min = 0; min < 60; min++) {


                if (Integer.bitCount(hr) + Integer.bitCount(min) == turnedOn) {

                    rult.add(String.format("%d:%02d", hr, min));
                }
            }
        }

        return rult;
    }


}

/**
 * decimal  - binary
 * 0          0000
 * 1          0001
 * 2          0010
 * 3          0011
 * 4          0100
 * 5          0101
 * 6          0110
 * 7          0111
 */
