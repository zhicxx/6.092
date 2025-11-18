class FooCorporation{
    public static String salary(double basePay,int hoursWorked){
        if(basePay < 8){
            return "Error: Base pay is below minimum.";
        }

        if(hoursWorked > 60){
            return "Error: Too many working hours.";
        }

        double salary;

        if(hoursWorked <= 40 ){
            salary = basePay * hoursWorked;
        }else{
            int overtime = hoursWorked - 40;
            double normalPay = basePay * 40;
            double overtimePay = overtime * basePay *1.5;
            salary = overtimePay + normalPay;
        }
        return "Total pay is " + salary;

    }
    public static void main(String[] args) {
        System.out.println("Employee 1 salary: " + salary(7.5, 35));
        System.out.println("Employee 2 salary: " + salary(8.2, 47));
        System.out.println("Employee 3 salary: " + salary(10.0, 73));
    }
}