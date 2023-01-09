/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 10.4.13-MariaDB : Database - db_pengiriman_barang
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_pengiriman_barang` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db_pengiriman_barang`;

/*Table structure for table `tb_jenis_paket` */

DROP TABLE IF EXISTS `tb_jenis_paket`;

CREATE TABLE `tb_jenis_paket` (
  `id_paket` varchar(5) DEFAULT NULL,
  `paket_type` varchar(15) DEFAULT NULL,
  `biaya` int(10) DEFAULT NULL,
  `asuransi` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_jenis_paket` */

insert  into `tb_jenis_paket`(`id_paket`,`paket_type`,`biaya`,`asuransi`) values 
('PKT2','Kilat',15000,1500),
('PKT1','Reguler',9000,0),
('PKT3','Express',18000,2000);

/*Table structure for table `tb_pengirim` */

DROP TABLE IF EXISTS `tb_pengirim`;

CREATE TABLE `tb_pengirim` (
  `no_pengirim` varchar(7) DEFAULT NULL,
  `nama_pengirim` varchar(25) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `kota` varchar(30) DEFAULT NULL,
  `provinsi` varchar(30) DEFAULT NULL,
  `kodepos` varchar(10) DEFAULT NULL,
  `daerah` varchar(25) DEFAULT NULL,
  `telepon` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_pengirim` */

insert  into `tb_pengirim`(`no_pengirim`,`nama_pengirim`,`alamat`,`kota`,`provinsi`,`kodepos`,`daerah`,`telepon`) values 
('09081','Ayu Dewi','Jl. Pancoran Barat, Jakarta','Jakarta Selatan','DKI Jakarta','15001','Pancoran Barat','082137890654'),
('09098','Sekar Ayu','Jl. Mencong, Pondok Aren','Tangerang Selatan','Banten','14201','Mencong','08132519873');

/*Table structure for table `tb_pengiriman_barang` */

DROP TABLE IF EXISTS `tb_pengiriman_barang`;

CREATE TABLE `tb_pengiriman_barang` (
  `no_resi` varchar(10) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `kota_tujuan` varchar(30) DEFAULT NULL,
  `id_petugas` varchar(6) DEFAULT NULL,
  `no_pengirim` varchar(7) DEFAULT NULL,
  `penerima` varchar(25) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telepon` varchar(15) DEFAULT NULL,
  `paket_type` varchar(15) DEFAULT NULL,
  `berat` int(3) DEFAULT NULL,
  `biaya` int(10) DEFAULT NULL,
  `asuransi` int(10) DEFAULT NULL,
  `isi_paket` varchar(25) DEFAULT NULL,
  `total` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_pengiriman_barang` */

/*Table structure for table `tb_petugas` */

DROP TABLE IF EXISTS `tb_petugas`;

CREATE TABLE `tb_petugas` (
  `id_petugas` varchar(6) DEFAULT NULL,
  `nama_petugas` varchar(25) DEFAULT NULL,
  `jabatan` varchar(10) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telepon` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_petugas` */

insert  into `tb_petugas`(`id_petugas`,`nama_petugas`,`jabatan`,`alamat`,`telepon`) values 
('1101','Aris Sandi','Admin','Jl. Nusa Kencana II, No.99, Pamulang','081267524120'),
('1102','Agus Gumelar','Kurir','Jl. Kutlingan I, Pondok Aren, Tangerang Selatan','082311223421'),
('1103','Setyo Aji','Manager','Jl. Kembangan Barat, Jakarta','088726721367');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
