
public  class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor on the ready..");
    }

    //Doctors
    private void prescribeMedicine(){
        System.out.println("Doctor prescribing medicine");
    }

    private void diagnosePatients(){
        System.out.println("Doctor Diagnosing");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();

    }
}

