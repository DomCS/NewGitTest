public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse ready to go!");
    }

    //Nurses
    private void checkVitalSigns(){
        System.out.println("checking vital signs");
    }

    private void drawBlood(){
        System.out.println("Drawing blood");
    }

    private void cleanPatientArea(){
        System.out.println("cleaning patient area");
    }

        @Override
        public void performDuties() {
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();

    }

}
