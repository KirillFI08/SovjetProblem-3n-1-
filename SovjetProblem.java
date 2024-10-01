class SovjetProblem {
    public static void main(String[] args) {
        int temp;
        int final1 = 0;
        int final2 = 0;

        for (int i = 10; i > 1; i--) {
            boolean theEnd = false;
            temp = i;
            System.out.println("Start: " + i + " ");
            while (theEnd == false) {

                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = temp * 3 + 1;
                }
                System.out.print(temp+" ");
                if (temp == 4) {
                    final1 = temp;
                }
                if (temp == 2 && final1 == 4) {
                    final2 = temp;

                }

                if (temp == 1 && final1 == 4 && final2 == 2) {
                    theEnd = true;
                    
                }
                
            }
System.out.println();
        }

    }
}