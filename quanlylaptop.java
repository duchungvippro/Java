import java.util.Date;

public class quanlylaptop {

    public static void main(String[] args) {

        // Tạo danh mục
        DanhMuc gaming = new DanhMuc(
                1,
                "Laptop Gaming"
        );

        // Tạo laptop
        Laptop laptop = new Laptop(
                101,
                "ASUS ROG G16",
                "ASUS",
                "Core i7, RTX 4060, RAM 16GB",
                "Con hang",
                32000000,
                gaming
        );

        // Tạo khách hàng
        NguoiDung khachHang = new NguoiDung(
                1,
                "Le Duc Hung",
                "hung@gmail.com"
        );

        // Tạo hóa đơn
        HoaDon hoaDon = new HoaDon(
                1001,
                new Date(),
                khachHang,
                laptop,
                "Chuyen khoan"
        );

        hoaDon.setTongTien(laptop.getGiaBan());

        System.out.println("===== THONG TIN HOA DON =====");
        hoaDon.lapHoaDon();
        hoaDon.thanhToan();
    }
}

class NguoiDung {

    private int maNguoiDung;
    private String hoTen;
    private String email;

    public NguoiDung(int maNguoiDung,
                     String hoTen,
                     String email) {

        this.maNguoiDung = maNguoiDung;
        this.hoTen = hoTen;
        this.email = email;
    }

    public void dangNhap() {
        System.out.println(hoTen + " da dang nhap");
    }

    public void dangXuat() {
        System.out.println(hoTen + " da dang xuat");
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getEmail() {
        return email;
    }
}

class DanhMuc {

    private int maDanhMuc;
    private String tenDanhMuc;

    public DanhMuc(int maDanhMuc,
                   String tenDanhMuc) {

        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    public void themDanhMuc() {
        System.out.println("Da them danh muc: "
                + tenDanhMuc);
    }

    public void suaDanhMuc() {
        System.out.println("Da sua danh muc: "
                + tenDanhMuc);
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }
}

class Laptop {

    private int maLaptop;
    private String tenLaptop;
    private String hangSanXuat;
    private String cauHinh;
    private String tinhTrang;
    private double giaBan;

    private DanhMuc danhMuc;

    public Laptop(int maLaptop,
                  String tenLaptop,
                  String hangSanXuat,
                  String cauHinh,
                  String tinhTrang,
                  double giaBan,
                  DanhMuc danhMuc) {

        this.maLaptop = maLaptop;
        this.tenLaptop = tenLaptop;
        this.hangSanXuat = hangSanXuat;
        this.cauHinh = cauHinh;
        this.tinhTrang = tinhTrang;
        this.giaBan = giaBan;
        this.danhMuc = danhMuc;
    }

    public void themLaptop() {
        System.out.println("Da them laptop "
                + tenLaptop);
    }

    public void capNhatLaptop() {
        System.out.println("Da cap nhat laptop "
                + tenLaptop);
    }

    public void xoaLaptop() {
        System.out.println("Da xoa laptop "
                + tenLaptop);
    }

    public String getTenLaptop() {
        return tenLaptop;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "maLaptop=" + maLaptop +
                ", tenLaptop='" + tenLaptop + '\'' +
                ", giaBan=" + giaBan +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
}

class HoaDon {

    private int maHoaDon;
    private Date ngayLap;
    private double tongTien;
    private String hinhThucThanhToan;

    private NguoiDung khachHang;
    private Laptop laptop;

    public HoaDon(int maHoaDon,
                  Date ngayLap,
                  NguoiDung khachHang,
                  Laptop laptop,
                  String hinhThucThanhToan) {

        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.khachHang = khachHang;
        this.laptop = laptop;
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public void lapHoaDon() {

        System.out.println("Ma hoa don: "
                + maHoaDon);

        System.out.println("Khach hang: "
                + khachHang.getHoTen());

        System.out.println("Email: "
                + khachHang.getEmail());

        System.out.println("Laptop: "
                + laptop.getTenLaptop());

        System.out.println("Tong tien: "
                + tongTien + " VND");

        System.out.println("Thanh toan: "
                + hinhThucThanhToan);
    }

    public void thanhToan() {
        System.out.println(
                "Thanh toan thanh cong!"
        );
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}