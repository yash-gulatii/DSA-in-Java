public class Q12_HighestAltitude {
    public static void main(String[] args) {

        int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        int ans = altitudes(gain);
        System.out.println(ans);
    }

    static int altitudes(int[] gain){
        int n = gain.length;
        int[] altitudes = new int[n+1];
        altitudes[0] = 0;
        for (int i = 0; i < n ; i++) {
            altitudes[i+1] = altitudes[i] + gain[i];
        }
        return highestAltitude(altitudes);

    }

    static int highestAltitude(int[] altitudes){

        int highestAltitude = 0;

        for (int altitude : altitudes) {
            if (altitude > highestAltitude) {
                highestAltitude = altitude;
            }
        }


        return highestAltitude;
    }
}




//class Solution {
//    public int largestAltitude(int[] gain) {
//        int n = gain.length;
//        int[] altitudes = new int[n+1];
//        altitudes[0] = 0;
//        for (int i = 0; i < n ; i++) {
//            altitudes[i+1] = altitudes[i] + gain[i];
//        }
//        return highestAltitude(altitudes);
//    }
//
//    public int highestAltitude(int[] altitudes){
//
//        int highestAltitude = 0;
//
//        for (int altitude : altitudes) {
//            if (altitude > highestAltitude) {
//                highestAltitude = altitude;
//            }
//        }
//
//
//        return highestAltitude;
//    }
//}
