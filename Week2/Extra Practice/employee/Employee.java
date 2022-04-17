package employee;

public class Employee {
    private String email;
    private float pay;
    private ArrayList<String> skillSet;

    public Employee(){

    }
    public Employee(String email, float pay){
        this.email-email;
        this.pay=pay;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void getPay() {

    public ArrayList<String> getSkillSet(){
        return skillSet;
    }

    public void empDetails() {
        System.out.printf("Emp email: %s\n Emp Pay:%.2\f", this.email,this.pay);
        try{
            for(String skill : this.skillSet) {
            System.out.println(skill);
            }
        } catch (Exception e){
            //TODO: handle exception
        }
        
    }

    public void addSkill(String newSkill){
        this.skillSet.add(newSkill);
    }
    
    public void bonus() {
        this.pay+=200;
    }

    public void bonus(Float amount) {
        this.pay+=amount;
    }
}

