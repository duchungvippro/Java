import java.util.Date;



public class quanlylaptop {
    public class NguoiDung {
        private int maNguoiDung;
        private String hoTen;
        private String email;

        public NguoiDung(int maNguoiDung, String hoTen, String email) {
            this.maNguoiDung = maNguoiDung;
            this.hoTen = hoTen;
            this.email = email;
        }

        public void dangNhap() {
            System.out.println(hoTen + " đã đăng nhập.");
        }

        public void dangXuat() {
            System.out.println(hoTen + " đã đăng xuất.");
        }

        // Getter & Setter
        public int getMaNguoiDung() {
            return maNguoiDung;
        }

        public String getHoTen() {
            return hoTen;
        }

        public String getEmail() {
            return email;
        }
    }
    public class DanhMuc {
        private int maDanhMuc;
        private String tenDanhMuc;

        public DanhMuc(int maDanhMuc, String tenDanhMuc) {
            this.maDanhMuc = maDanhMuc;
            this.tenDanhMuc = tenDanhMuc;
        }

        public void themDanhMuc() {
            System.out.println("Đã thêm danh mục: " + tenDanhMuc);
        }

        public void suaDanhMuc() {
            System.out.println("Đã sửa danh mục: " + tenDanhMuc);
        }

        public int getMaDanhMuc() {
            return maDanhMuc;
        }

        public String getTenDanhMuc() {
            return tenDanhMuc;
        }
    }
    public class Laptop {
        private int maLaptop;
        private String tenLaptop;
        private String hangSanXuat;
        private String cauHinh;
        private String tinhTrang;

        private DanhMuc danhMuc;

        public Laptop(int maLaptop, String tenLaptop, String hangSanXuat,
                      String cauHinh, String tinhTrang, DanhMuc danhMuc) {
            this.maLaptop = maLaptop;
            this.tenLaptop = tenLaptop;
            this.hangSanXuat = hangSanXuat;
            this.cauHinh = cauHinh;
            this.tinhTrang = tinhTrang;
            this.danhMuc = danhMuc;
        }

        public void themLaptop() {
            System.out.println("Đã thêm laptop: " + tenLaptop);
        }

        public void capNhatLaptop() {
            System.out.println("Đã cập nhật laptop: " + tenLaptop);
        }

        public void xoaLaptop() {
            System.out.println("Đã xóa laptop: " + tenLaptop);
        }

        public int getMaLaptop() {
            return maLaptop;
        }

        public String getTenLaptop() {
            return tenLaptop;
        }

        public String getTinhTrang() {
            return tinhTrang;
        }

        public void setTinhTrang(String tinhTrang) {
            this.tinhTrang = tinhTrang;
        }
    }
    public class PhieuMuon {
        private int maPhieu;
        private Date ngayMuon;
        private Date ngayTra;
        private String trangThai;

        private NguoiDung nguoiDung;
        private Laptop laptop;

        public PhieuMuon(int maPhieu, Date ngayMuon,
                         NguoiDung nguoiDung, Laptop laptop) {
            this.maPhieu = maPhieu;
            this.ngayMuon = ngayMuon;
            this.nguoiDung = nguoiDung;
            this.laptop = laptop;
            this.trangThai = "Đang mượn";
        }

        public void lapPhieu() {
            laptop.setTinhTrang("Đang được mượn");
            System.out.println(
                    nguoiDung.getHoTen() +
                            " đã mượn laptop " +
                            laptop.getTenLaptop()
            );
        }

        public void traLaptop() {
            this.ngayTra = new Date();
            this.trangThai = "Đã trả";
            laptop.setTinhTrang("Sẵn sàng");

            System.out.println(
                    nguoiDung.getHoTen() +
                            " đã trả laptop " +
                            laptop.getTenLaptop()
            );
        }
    }
}
