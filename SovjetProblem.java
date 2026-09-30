class SovjetProblem {
    public static void main(String[] args) {
        int max = 1000000;

        int longestStart = 0;
        int longestLength = 0;

        for (int start = 2; start <= max; start++) {
            int temp = start;
            int length = 0;

            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = temp * 3 + 1;
                }
                length++;
            }

            System.out.println("Start: " + start + " -> Länge: " + length);

            if (length > longestLength) {
                longestLength = length;
                longestStart = start;
            }
        }

        System.out.println("Die längste Folge beginnt bei: " + longestStart + " mit Länge " + longestLength);
    }
}