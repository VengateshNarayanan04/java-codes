import java.util.Scanner;

class student {
    private int rno;

    student() {}

    student(int r) {
        rno = r;
    }

    public int getRno() {
        return rno;
    }
} // End of class student

class test extends student {
    private int sem1, sem2;

    test() {}

    test(int s1, int s2, int r) {
        super(r);
        sem1 = s1;
        sem2 = s2;
    }

    public int getSem1() {
        return sem1;
    }

    public int getSem2() {
        return sem2;
    }
} // End of class test

class result extends test {
    private int total = 0;

    result() {}

    result(int s1, int s2, int r) {
        super(s1, s2, r);   
        total = s1 + s2;
    }

    public int getTotal() {
        return total;
    }
} // End of class result

class MainResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your roll no: ");
        int rno = sc.nextInt();

        System.out.println("Enter the sem 1 and sem 2 marks");
        int sem1 = sc.nextInt();
        int sem2 = sc.nextInt();

        result r = new result(sem1, sem2, rno); 

        System.out.println("Enter 1 to see your final result: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Your result is:");
            System.out.println("Roll no: " + r.getRno());
            System.out.println("Sem1 marks: " + r.getSem1());
            System.out.println("Sem2 marks: " + r.getSem2());
            System.out.println("Total marks: " + r.getTotal());
        } else {
            System.out.println("Enter a valid number");
        }

        sc.close();
    } // End of class main
} // End of the program