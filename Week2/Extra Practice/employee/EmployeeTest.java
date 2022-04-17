package employee;

public class EmployeeTest {

    public static void main(String[] args){
        Employee paige=new Employee();
        Employee sam=new Employee("sam@myCafe.com",210000);
        Employee taro=new Employee("taro@myCafe.com",300000);
        paige.setEmail="paige.myCafe.com";
        paige.setPay (200000);
        System.out.println(paige.getEmail());
        paige.empDetails();
        sam.empyDetails();

        System.out.println("No of employees " + Employee.getNoOfEmployees());

        paige.bonus();
        taro.bonus(1000);
        paige.empDetails();
        taro.empDetails();

        ArrayList<String> samSkills=new ArrayList<>();
        samSkills.add("Being Nice");
        samSkills.add("Don't be rude");
        samSkills.add("Making fancy coffee!");
        samSkills.add("quick");

        sam.setSkillSet(samSkills);
        sam.empDetails();
        paige.empDetails();

    }
    
}
