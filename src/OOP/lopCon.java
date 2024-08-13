package OOP;

public class lopCon extends lopCha{
    private String lopHoc;

    public lopCon() {
    }

    public lopCon(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public lopCon(String ten, String tuoi, String diaChi, String lopHoc) {
        super(ten, tuoi, diaChi);
        this.lopHoc = lopHoc;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }
    public void hienThiThongTin() {
        System.out.println("Tên: " + getTen());
        System.out.println("Tuổi: " + getTuoi());
        System.out.println("Địa chỉ: " + getDiaChi());
        System.out.println("Lớp học: " + getLopHoc());
    }

    public static void main(String[] args) {
        lopCon con = new lopCon("Nguyen Mạnh Thùy","20","Hà nội","12a2");
        con.hienThiThongTin();
    }
}
