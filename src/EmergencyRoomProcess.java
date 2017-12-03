
public class EmergencyRoomProcess {
    public static void main(String[] args){
        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "peggy", "emergency", true );

        Employee dan = new Doctor(2, "dan", "emergency", true);

        ERDirector.callUpon(peggy);
        ERDirector.callUpon(dan);
    }
}
