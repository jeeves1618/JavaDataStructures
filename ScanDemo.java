import java.text.DecimalFormat;
import java.util.Scanner;

class ScanDemo {
    ScanDemo() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Annual Salary :");
        double annualSalary = scan.nextDouble();
        double totalTax = 0.0D;
        int[] salarySlab = new int[]{250000, 250000, 500000, 1000000};
        double[] taxRate = new double[]{0.0D, 5.2D, 20.8D, 31.2D};

        for(int i = 0; i < 4 && annualSalary > 0.0D; ++i) {
            totalTax += (double)salarySlab[i] * taxRate[i] / 100.0D;
            annualSalary -= (double)salarySlab[i];
            if (i == 2) {
                salarySlab[i + 1] = (int)annualSalary;
            }
        }

        DecimalFormat ft = new DecimalFormat("Rs ##,##,###.##");
        System.out.println("Your total tax liability is : " + ft.format(totalTax));
        System.out.println("Your net monthly take home is : " + ft.format((annualSalary - totalTax) / 12.0D));
        scan.close();
    }
}
