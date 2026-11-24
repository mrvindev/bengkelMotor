CREATE TABLE pelanggan (
    id_pelanggan INT NOT NULL AUTO_INCREMENT,
    nama_pelanggan VARCHAR(100) NOT NULL,
    jenis_kelamin ENUM ('L','P') NOT NULL,
    alamat TEXT,
    no_telepon VARCHAR(20),
    PRIMARY KEY (id_pelanggan)
);

CREATE TABLE kendaraan (
    id_kendaraan INT NOT NULL AUTO_INCREMENT,
    id_pelanggan INT NOT NULL REFERENCES pelanggan (id_pelanggan),
    nomor_polisi VARCHAR(15) NOT NULL UNIQUE,
    merek_motor VARCHAR(50) NOT NULL,
    tipe_motor VARCHAR(50),
    tahun_motor YEAR,
    warna_motor VARCHAR(30),
    PRIMARY KEY (id_kendaraan)
);

CREATE TABLE karyawan (
    id_karyawan INT NOT NULL AUTO_INCREMENT,
    nama_karyawan VARCHAR(100) NOT NULL,
    jenis_kelamin ENUM ('L','P') NOT NULL,
    alamat TEXT,
    no_telepon VARCHAR(20),
    jabatan VARCHAR(50),
    PRIMARY KEY (id_karyawan)
);

CREATE TABLE layanan (
    id_layanan INT NOT NULL AUTO_INCREMENT,
    nama_layanan VARCHAR(100) NOT NULL,
    deskripsi TEXT,
    harga_layanan DECIMAL(10, 2) NOT NULL DEFAULT 0.00,
    PRIMARY KEY (id_layanan)
);

CREATE TABLE servis (
    id_servis INT NOT NULL AUTO_INCREMENT,
    id_kendaraan INT NOT NULL REFERENCES kendaraan (id_kendaraan),
    id_karyawan INT NOT NULL REFERENCES karyawan (id_karyawan),
    id_layanan INT NOT NULL REFERENCES layanan (id_layanan),
    tanggal_servis DATE NOT NULL,
    jam_servis TIME,
    keluhan TEXT,
    status_servis ENUM ('Menunggu','Dikerjakan','Selesai') NOT NULL,
    total_biaya DECIMAL(10, 2) NOT NULL DEFAULT 0.00,
    PRIMARY KEY (id_servis)
);

CREATE TABLE pembayaran (
    id_pembayaran INT NOT NULL AUTO_INCREMENT,
    id_servis INT NOT NULL UNIQUE REFERENCES servis (id_servis),
    tanggal_pembayaran DATE NOT NULL,
    metode_pembayaran ENUM ('Tunai','Transfer','QRIS') NOT NULL,
    total_pembayaran DECIMAL(10, 2) NOT NULL,
    status_pembayaran ENUM ('Lunas','Belum Lunas') NOT NULL,
    PRIMARY KEY (id_pembayaran)
);
