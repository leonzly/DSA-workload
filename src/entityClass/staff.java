
package entityClass;


public class staff {
    
    private String staffId;
    private String staffName;
    private String staffIc;
    private String staffPhoneNum;
    private int numOfstaffAvailable;

    public staff() {
    }

    public staff(String staffId, String staffName, String staffIc, String staffPhoneNum, int numOfstaffAvailable) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffIc = staffIc;
        this.staffPhoneNum = staffPhoneNum;
        this.numOfstaffAvailable = numOfstaffAvailable;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffIc() {
        return staffIc;
    }

    public void setStaffIc(String staffIc) {
        this.staffIc = staffIc;
    }

    public String getStaffPhoneNum() {
        return staffPhoneNum;
    }

    public void setStaffPhoneNum(String staffPhoneNum) {
        this.staffPhoneNum = staffPhoneNum;
    }

    public int getNumOfstaffAvailable() {
        return numOfstaffAvailable;
    }

    public void setNumOfstaffAvailable(int numOfstaffAvailable) {
        this.numOfstaffAvailable = numOfstaffAvailable;
    }
    
    public String toString(){
        return "Staff ID: "+staffId +"\nName: "+staffName+ "\nIC: "+staffIc+"\nPhone Number: "+staffPhoneNum;
    }
    
}
