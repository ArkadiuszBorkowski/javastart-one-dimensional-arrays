package ex1;

class ArraySum {
    public static void main(String[] args) {
        int[] tab1 = {6, 9, 12};
        int[] tab2 = {5, 10, 15};

        ArrayUtils utils = new ArrayUtils();

        System.out.println("Suma liczb wynosi: ");
        int sum = tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2];
        System.out.println(sum);

        System.out.println("Inna metoda:");
        sum = utils.sumArrays(tab1, tab2);
        System.out.println(sum);
    }
}

