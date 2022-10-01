package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float salaryAfterTaxes = 0;

        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }

        if (salary <= 10000)
            salaryAfterTaxes = salary * 0.85F;
        else if (salary <= 20000)
            salaryAfterTaxes = salary * 0.82F;
        else {
            salaryAfterTaxes = salary * 0.80F;
        }

        System.out.println(salaryAfterTaxes);
    }
}
