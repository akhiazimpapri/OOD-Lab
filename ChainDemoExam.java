abstract class Approver {

    protected Approver nextApprover;

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approve(int amount);
}

class Cashier extends Approver {

    public void approve(int amount) {
        if (amount < 10000) {
            System.out.println("Approved by Cashier: Tk " + amount);
        } else {
            System.out.println("Forwarded by Cashier");
            nextApprover.approve(amount);
        }
    }
}

class SeniorOfficer extends Approver {

    public void approve(int amount) {
        if (amount >= 10000 && amount <= 1000000) {
            System.out.println("Approved by Cashier and Senior Officer: Tk " + amount);
        } else {
            System.out.println("Forwarded by Senior Officer");
            nextApprover.approve(amount);
        }
    }
}
class Manager extends Approver {

    public void approve(int amount) {
        if (amount > 1000000) {
            System.out.println("Approved by Senior Officer and Manager: Tk " + amount);
        }
    }
}
public class ChainDemoExam {
    public static void main(String[] args) {

        Approver cashier = new Cashier();
        Approver senior = new SeniorOfficer();
        Approver manager = new Manager();

        cashier.setNext(senior);
        senior.setNext(manager);

        cashier.approve(8000);
        cashier.approve(50000);
        cashier.approve(2000000);
    }
}

