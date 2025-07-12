public class CircularTour {
    static class Pump {
        int petrol, dist;
        Pump(int p, int d) { petrol = p; dist = d; }
    }

    public static int start(Pump[] pumps) {
        int total = 0, curr = 0, start = 0;

        for (int i = 0; i < pumps.length; i++) {
            total += pumps[i].petrol - pumps[i].dist;
            curr += pumps[i].petrol - pumps[i].dist;

            if (curr < 0) {
                curr = 0;
                start = i + 1;
            }
        }
        return (total >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        Pump[] arr = {
            new Pump(6, 4), new Pump(3, 6), new Pump(7, 3)
        };
        System.out.println(start(arr)); // 2
    }
}
