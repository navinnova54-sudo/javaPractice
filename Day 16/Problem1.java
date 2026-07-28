public class Problem1 {
    public int passThePillow(int n, int time) {
        int cycle = n - 1;
        int pos = time % (2 * cycle);

        if (pos <= cycle) {
            return pos + 1;
        } else {
            return n - (pos - cycle);
        }
    }
}
