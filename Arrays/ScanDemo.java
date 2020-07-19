import java.text.DecimalFormat;
import java.util.Scanner;

class ScanDemo {
    ScanDemo() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Annual Salary :");
        double professionalTax = 2400.0D, PF=12115.0D, section80c = 150000.0D, standardDeduction = 40000.0D,
                houseLoanInt = 200000.0D;
        double annualSalary = scan.nextDouble();
        double totalTax = 0.0D, remainingSalary = 0.0D;
        int[] salarySlab = new int[]{250000, 250000, 500000, 1000000};
        double[] taxRate = new double[]{0.0D, 5.2D, 20.8D, 31.2D};
        int[] salarySlab2020 = new int[]{250000, 250000, 250000, 250000, 250000, 250000, 1000000};
        double[] taxRate2020 = new double[]{0.0D, 5.2D, 10.4D, 15.6D, 20.8D, 26.0D, 31.2D};

        DecimalFormat ft = new DecimalFormat("Rs ##,##,###.##");
        remainingSalary = annualSalary - section80c - standardDeduction - houseLoanInt;

        for(int i = 0; i < 4 && annualSalary > 0.0D; ++i) {
            totalTax += (double)salarySlab[i] * taxRate[i] / 100.0D;
            remainingSalary -= (double)salarySlab[i];
            if (i == 2) {
                salarySlab[i + 1] = (int)remainingSalary;
            }
        }

        System.out.println(" ");
        System.out.println("================= SALARY COMPUTATION WITH DEDUCTIONS ===================");
        System.out.println("Your annual salary is         : " + ft.format(annualSalary));
        System.out.println("Your total tax liability is   : " + ft.format(totalTax));
        System.out.println("Your net monthly take home is : " +
                ft.format((annualSalary - totalTax - professionalTax - (PF*12)) / 12.0D));
        System.out.println(" ");
        remainingSalary = annualSalary;
        totalTax = 0.0D;
        for(int i = 0; i < 7 && annualSalary > 0.0D; ++i) {
            totalTax += (double)salarySlab2020[i] * taxRate2020[i] / 100.0D;
            remainingSalary -= (double)salarySlab2020[i];
            if (i == 5) {
                salarySlab2020[i + 1] = (int)remainingSalary;
            }
        }
        System.out.println(" ");
        System.out.println("================= SALARY COMPUTATION WITHOUT DEDUCTIONS ===================");
        System.out.println("Your annual salary is         : " + ft.format(annualSalary));
        System.out.println("Your total tax liability is   : " + ft.format(totalTax));
        System.out.println("Your net monthly take home is : " +
                ft.format((annualSalary - totalTax - professionalTax - (PF*12)) / 12.0D));

        scan.close();
    }
}
