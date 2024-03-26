﻿CREATE TABLE NHANVIEN
(
    MANV NCHAR(5) NOT NULL,
    TENNV NVARCHAR2(30),
    SODT NVARCHAR2(20),
    DIACHI VARCHAR2(30),
    NGAYSINH VARCHAR2(30),
    GIOITINH NVARCHAR2(30),
    LUONG INT,
    CONSTRAINT PK_NV PRIMARY KEY (MANV)
);

CREATE TABLE KHACHHANG
(
    MAKH NCHAR(5) NOT NULL,
    TENKH NVARCHAR2(30),
    SODT NVARCHAR2(20),
    DIACHI NVARCHAR2(30),
    GIOITINH NCHAR(5),
    CONSTRAINT PK_KH PRIMARY KEY (MAKH)
);

CREATE TABLE NHACUNGCAP
(
    MANCC NCHAR(5) NOT NULL,
    TENNCC NVARCHAR2(30),
    SODT NVARCHAR2(20) ,
    DIACHI NVARCHAR2(30),
    CONSTRAINT PK_NCC PRIMARY KEY (MANCC)
	
);

CREATE TABLE MATHANG
(
    MAMH NCHAR(5) NOT NULL,
    TENMH NVARCHAR2(30),
    DONGIANHAP INT,
    DONGIABAN INT,
    TENNCC NVARCHAR2(30),
    XUATXU NVARCHAR2(30),
    SOLUONG INT,
    GHICHU NVARCHAR2(30) DEFAULT 'CHUA XAC DINH',
    CONSTRAINT PK_MH PRIMARY KEY (MAMH)
);

CREATE TABLE KHO
(
    MAKHO NCHAR(5) NOT NULL,	
    MAMH NCHAR(5) NOT NULL,
    SOLUONG INT,
    CONSTRAINT PK_KHO PRIMARY KEY (MAKHO),
    CONSTRAINT FK_KHO_MH FOREIGN KEY(MAMH) REFERENCES MATHANG(MAMH)
);

CREATE TABLE HOADONBAN    
(
    MAHD NCHAR(5) NOT NULL,
    MANV NCHAR(5) NOT NULL,
    MAMH NCHAR(5) NOT NULL,
    TENMH NVARCHAR2(30),
    SOLUONG INT  ,
    DONGIA INT ,
    TONGTIEN INT ,
    NGAYBAN VARCHAR2(30),
    CONSTRAINT PK_HDB PRIMARY KEY (MAHD),
    CONSTRAINT FK_HDB_NV FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV),
    CONSTRAINT FK_HDB_MH FOREIGN KEY(MAMH) REFERENCES MATHANG(MAMH),
    CONSTRAINT CHK_SOLUONG CHECK (SOLUONG > 0)
);

CREATE TABLE CT_HOADONBAN    
(
    MAHD NCHAR(5) NOT NULL,
    MAKH NCHAR(5) NOT NULL,	
    NGAYMUA VARCHAR2(30),
    TONGTIEN INT ,
    CONSTRAINT FK_CT_HDB_HD FOREIGN KEY(MAHD) REFERENCES HOADONBAN(MAHD),
    CONSTRAINT FK_CT_HDB_KH FOREIGN KEY(MAKH) REFERENCES KHACHHANG(MAKH)
);

CREATE TABLE NGUOIDUNG
(
    TAIKHOAN VARCHAR2(50) NOT NULL,
    MATKHAU VARCHAR2(5000),
    CONSTRAINT PK_ND PRIMARY KEY (TAIKHOAN)
);
-----------------------------NHAP-THONG-TIN-----------------------------------
INSERT INTO NGUOIDUNG VALUES('tanphat','123','123');
INSERT INTO NGUOIDUNG VALUES('thanhphuc','123','123');
INSERT INTO NGUOIDUNG VALUES('thanhvy','123','123');
INSERT INTO NGUOIDUNG VALUES('thanhtin','123','123');

SELECT * FROM NGUOIDUNG;
DROP TABLE NGUOIDUNG;

INSERT INTO NHANVIEN VALUES('NV01','Nguyen Tan Phat','0707230470','Dong Nai','2002/02/03','Nam',20000);
INSERT INTO NHANVIEN VALUES('NV02','Nguyen Thanh Phuc','0123331088','Dong Nai','2000/03/02','Nam',20000);
INSERT INTO NHANVIEN VALUES('NV03','Nguyen Thi Thanh Vy','0945733888','Long An','2001/07/09','Nu',20000);
INSERT INTO NHANVIEN VALUES('NV04','Nguyen Thanh Tin','0987878798','Tien Giang','2007/09/28','Nam',20000);

INSERT INTO KHACHHANG VALUES('KH01','Nguyen Van An','0989751723','Ca Mau','Nam');
INSERT INTO KHACHHANG VALUES('KH02','Le Van Be','0992331563','Ha Giang','Nam');
INSERT INTO KHACHHANG VALUES('KH03','Tran Thi Chung','0933561789','Ha Noi','Nu');
INSERT INTO KHACHHANG VALUES('KH04','Bui Thi Duyen','0937753875','Bac Giang','Nu');
INSERT INTO KHACHHANG VALUES('KH05','Nguyen Thanh Tuyen','0990631656','Kien Giang','Nam');

INSERT INTO NHACUNGCAP VALUES('CC01','Cty Co Phan Tap Doan Hoa Phat','02862985599','Tp.Ho Chi Minh');
INSERT INTO NHACUNGCAP VALUES('CC02','Cty Co Phan Tap Doan Hoa Sen','18001515','Tp.Ho Chi Minh');
INSERT INTO NHACUNGCAP VALUES('CC03','Cty Co Phan Ton Dong A','02743732575','Binh Duong');
INSERT INTO NHACUNGCAP VALUES('CC04','Cty Co Phan Vicostone','18006766','Ha Noi');
INSERT INTO NHACUNGCAP VALUES('CC05','Tong cty Viglacera - CTCP','02435536660','Ha Noi');

INSERT INTO MATHANG VALUES('MH01','Sat','50000','70000','Cty Co Phan Tap Doan Hoa Phat','Viet Nam','100','');
INSERT INTO MATHANG VALUES('MH02','Thep','40000','90000','Cty Co Phan Tap Doan Hoa Sen','Viet Nam','100','');
INSERT INTO MATHANG VALUES('MH03','Ton','30000','40000','Cty Co Phan Ton Dong A','Viet Nam','100','');
INSERT INTO MATHANG VALUES('MH04','Gach','70000','100000','Cty Co Phan Vicostone','Nhat','100','');
INSERT INTO MATHANG VALUES('MH05','Da lop lat','90000','120000','Tong cty Viglacera - CTCP','Nhat','100','');

INSERT INTO KHO VALUES('K01','MH01','125000');
INSERT INTO KHO VALUES('K02','MH02','300000');
INSERT INTO KHO VALUES('K03','MH03','450000');
INSERT INTO KHO VALUES('K04','MH04','500000');
INSERT INTO KHO VALUES('K05','MH05','170000');

INSERT INTO HOADONBAN VALUES('HD01','NV02','MH03','Ton','2','70000','139000','2021/03/07');
INSERT INTO HOADONBAN VALUES('HD02','NV03','MH01','Sat','1','120000','108000','2019/03/17');
INSERT INTO HOADONBAN VALUES('HD03','NV01','MH05','Da lop lat','2','40000','80000','2022/03/19');
INSERT INTO HOADONBAN VALUES('HD04','NV04','MH02','Thep','3','120000','360000','2022/03/20');
INSERT INTO HOADONBAN VALUES('HD05','NV01','MH04','Gach','2','100000','98800','2020/03/22');

INSERT INTO CT_HOADONBAN VALUES('HD01','KH01','2021/03/07','139000');
INSERT INTO CT_HOADONBAN VALUES('HD02','KH02','2029/03/17','108000');
INSERT INTO CT_HOADONBAN VALUES('HD03','KH03','2022/03/19','80000');
INSERT INTO CT_HOADONBAN VALUES('HD04','KH04','2022/03/20','360000');
INSERT INTO CT_HOADONBAN VALUES('HD05','KH05','2020/03/22','98800');
-------------------------------------T?O B?NG-------------------------------------
SELECT * FROM NHANVIEN;
SELECT * FROM KHACHHANG;
SELECT * FROM NHACUNGCAP;
SELECT * FROM MATHANG;
SELECT * FROM KHO;
SELECT * FROM HOADONBAN;
SELECT * FROM CT_HOADONBAN;
--------------------------------------XOA BANG------------------------------------
DROP TABLE NHACUNGCAP;
DROP TABLE CT_HOADONBAN;
DROP TABLE HOADONBAN;
DROP TABLE KHACHHANG;
DROP TABLE NHANVIEN;
DROP TABLE KHO;
DROP TABLE MATHANG;

--------------------------------------TRIGGER--------------------------------------
CREATE OR REPLACE TRIGGER NHATKI_TRIGGER
AFTER INSERT OR DELETE OR UPDATE ON NHANVIEN
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO GHINHATKI(SUKIEN, TRUYCAP, HOATDONG, DOITUONG, THOIGIAN)
        VALUES('INSERT', USER, 'THEM MOI', 'NHAN VIEN', SYSTIMESTAMP);
        DBMS_OUTPUT.PUT_LINE('Da them bang ghi moi');
    ELSIF UPDATING THEN
        IF :NEW.LUONG > :OLD.LUONG THEN
            INSERT INTO GHINHATKI(SUKIEN, TRUYCAP, HOATDONG, DOITUONG, THOIGIAN)
            VALUES('UPDATE', USER, 'CAP NHAT LƯƠNG', 'NHAN VIEN', SYSTIMESTAMP);
            DBMS_OUTPUT.PUT_LINE('Da cap nhat bang ghi - Tang luong');
        ELSIF :NEW.LUONG < :OLD.LUONG THEN
            INSERT INTO GHINHATKI(SUKIEN, TRUYCAP, HOATDONG, DOITUONG, THOIGIAN)
            VALUES('UPDATE', USER, 'CAP NHAT LƯƠNG', 'NHAN VIEN', SYSTIMESTAMP);
            DBMS_OUTPUT.PUT_LINE('Da cap nhat bang ghi - Giam luong');
        ELSE
            INSERT INTO GHINHATKI(SUKIEN, TRUYCAP, HOATDONG, DOITUONG, THOIGIAN)
            VALUES('UPDATE', USER, 'CAP NHAT', 'NHAN VIEN', SYSTIMESTAMP);
            DBMS_OUTPUT.PUT_LINE('Da cap nhat bang ghi - Khong thay doi luong');
        END IF;
    ELSIF DELETING THEN
        INSERT INTO GHINHATKI(SUKIEN, TRUYCAP, HOATDONG, DOITUONG, THOIGIAN)
        VALUES('DELETE', USER, 'XOA', 'NHAN VIEN', SYSTIMESTAMP);
        DBMS_OUTPUT.PUT_LINE('Da xoa bang ghi');
    END IF;
END NHATKI_TRIGGER;
CREATE TABLE GHINHATKI (
    SUKIEN VARCHAR2(255),
    TRUYCAP VARCHAR2(255),
    HOATDONG VARCHAR2(255),
    DOITUONG VARCHAR2(255),
    THOIGIAN TIMESTAMP
);
DROP TRIGGER NHATKI_TRIGGER
-- Chèn dữ liệu
INSERT INTO NHANVIEN(MANV, TENNV, SODT, DIACHI, NGAYSINH, GIOITINH, LUONG)
VALUES('NV05', 'Nguyen Thi A', '0158742654', 'Dong Nai', '12/05/2015', 'Nu', 15000);
--Cập nhật
UPDATE NHANVIEN SET LUONG = '20000' WHERE MANV = 'NV05'
--Xoá
DELETE FROM NHANVIEN WHERE MANV = 'NV05';
--Truy xuất
SELECT * FROM GHINHATKI;
DELETE GHINHATKI;