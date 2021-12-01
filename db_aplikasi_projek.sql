-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2021 at 06:46 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_aplikasi_projek`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `idBarang` int(11) NOT NULL,
  `idJenisBarang` int(11) NOT NULL,
  `namaBarang` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  `photopath` varchar(200) NOT NULL,
  `detail` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`idBarang`, `idJenisBarang`, `namaBarang`, `harga`, `stok`, `photopath`, `detail`) VALUES
(1, 4, 'Bimoli', 15000, 50, 'bimoli.jpg', 'Bimoli (Bitung Manado Oil Limited)\r\n\r\nBimoli kemasan 	: 1 Liter\r\nTerbuat dari	: 100% Kelapa Sawit\r\nDi produksi 	: PT.Salim Ivomas Pratama Tbk(SIMP)\r\nProduct By  	: grup PT.Indofood Sukses Makmur Tbk &\r\n	      	PT.Indofood Agri Resources Ltd(IndoAgri).'),
(2, 4, 'Sania', 15000, 50, 'sania.jpg', 'Sania  Minyak Nabati\r\n\r\nSania kemasan : 1 Liter\r\nTerbuat Dari  : 100% Kelapa Sawit PiLihan\r\nDi produksi   : PT Wilmar Cahaya Indonesia Tbk'),
(3, 4, 'Sofia', 35000, 40, 'sovia.jpg', 'Sovia Minyak Goreng \r\n\r\nSovia Kemasan : 1 Liter\r\nTerbuat dari  : Kelapa Sawit Pilihan yang mengandung Vitamin A dan Vitamin D\r\nDi Produksi   : PT Jaya Utama Santikah  '),
(4, 4, 'FriceWell', 25000, 30, 'fraiswell.jpg', 'Frais Well Minyak Goreng\r\n\r\nKemasan      : 1 Liter\r\nTerbuat dari : Kelapa Sawit Pilihan Kaya dengan Vitamin A dan Vitamin E \r\nDi Produksi  : PT Bina Karya Prima '),
(5, 4, 'Goreng', 25000, 20, 'goreng.jpg', 'Sunco Minyak Goreng\r\n\r\nKemasan      : 1 Liter\r\nTerbuat dari : Kelapa Sawit Terbaik Dengan 2 Kali Penyaringan\r\nDi Produksi  : Musim Mas Group'),
(6, 5, 'Sedap', 3000, 50, 'sedap.jpg', 'Mie Sedaap Goreng\r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : Wings Food\r\nProduct By  : PT Sayap Mas Utama'),
(7, 5, 'Indomie', 3000, 50, 'indomie.jpg', 'Indomie Goreng\r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : Indofood CBP\r\nProduct By  : PT Indofood Indonesia'),
(8, 5, 'Sarimie', 3000, 50, 'sarimi.jpg', 'Sarimie Mie Instant\r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : PT Indofood CBP Sukses Makmur Tbk\r\nProduct By  : PT Indofood'),
(9, 5, 'Samyang', 16000, 10, 'samyang.jpg', 'Samyang Mie Instant\r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : Samyang Food, Korea Selatan\r\nProduct By  : Samyang Food'),
(10, 5, 'Sedaap Soto', 3000, 50, 'sedapsoto.jpg', 'Sedaap Soto\r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : Wings Food\r\nProduct By  : PT Sayap Mas Utama'),
(11, 2, 'Bear Brand', 12000, 58, 'bearbrand.jpg', 'Bear Brand \r\n\r\nKemasan     : 1 Kaleng\r\nDi Produksi : Nestle ,Swiss\r\nProduct by  : Nestle'),
(12, 1, 'Beng-Beng', 1000, 788, 'bengbeng.jpg', 'Beng-Beng\r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : PT Mayora Indah Tbk\r\nProduct By  : PT Mayora'),
(13, 3, 'Sentra Wangi', 46000, 78, 'berassentrawangi.png', 'Setra Wangi Beras\r\n\r\nKemasan     : 3kg\r\nDi Produksi : PT Food Station Tjipinang Jaya\r\nProduct By  : PT Food Station'),
(14, 3, 'Sumur Tujuh', 50000, 488, 'berassumurtujuh.jpg', 'Sumur Tujuh Beras\r\n\r\nKemasan     : 5kg\r\nDi Produksi : PT Widodofood Makmur Sejahtera, PT Widodo Makmur Perkasa Tbk\r\nProduct By  : PT Widodofood '),
(15, 3, 'Deka Tani', 74000, 48, 'dekatani.jpg', 'Deka Tani Beras\r\n\r\nKemasan         : 8kg\r\nTempat Produksi : Garut,Jawa Barat '),
(16, 2, 'Dancow', 5000, 1788, 'dancow.jpg', 'Dancow\r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : PT Nestle Indonesia\r\nProduct By  : Nestle'),
(17, 2, 'Indomilk', 4000, 742, 'indomilk.png', 'Indomilk \r\n\r\nKemasan     : 1 botol\r\nDi Produksi : PT Indolakto\r\nProduct By  : Indofood Nutrition'),
(18, 3, 'KOI', 56000, 24, 'koi.jpg', 'Koi Beras\r\n\r\nKemasan     : 5kg\r\nDi Produksi : UD.JongBiru, Kediri\r\nProduct By  : PT UD.Jong Biru'),
(19, 3, 'Lele Dumbo', 65000, 12, 'leledumbo.jpg', 'Lele Dumbo Beras\r\n\r\nKemasan     : 5kg\r\nDi produksi : PT Indo Beras Makmur\r\nProduct By  : PT Tiga Pilar Sejahtera Food Tbk '),
(20, 1, 'OREO', 2000, 788, 'oreo.png', 'Oreo \r\n\r\nKemasan     : 1 Pcs\r\nDi Produksi : PT Mondelez Indonesia Manufacturing\r\nProduct By  : Nabisco'),
(21, 1, 'Roma Kelapa', 7000, 738, 'rotiroma.png', 'Roma Kelapa\r\n\r\nKemasan    : 1 Pcs\r\nDiproduksi : PT Mayora Indah Tbk\r\nProduct By : PT Mayora'),
(22, 1, 'Sari Roti', 3000, 22, 'sariroti.png', 'Sari Roti\r\n\r\nKemasan     : 1 Pcs Kecil\r\nDi Produksi : PT Nippon Indosari Corpindo\r\nProduct By  : PT Nippon'),
(23, 1, 'Sari Roti Besar', 7000, 73, 'sarirotibig.png', 'Sari Roti \r\n\r\nKemasan     : 1 Pcs Besar\r\nDi Produksi : PT Nippon Indosari Corpindo\r\nProduct By  : PT Nippon'),
(24, 2, 'UltraMilk', 5000, 748, 'ultramilk.png', 'Ultramilk\r\n\r\nKemasan     : 1 Gelas Karton\r\nDi Produksi : PT Sanghiang Perkasa\r\nProduct By  : Ultrajaya'),
(25, 2, 'UltraMimi', 3000, 78, 'ultramimi.png', 'Ultramimi\r\n\r\nKemasan     : 1 Gelas Karton\r\nDi Produksi : PT Sanghiang Perkasa\r\nProduct By  : Ultrajaya');

-- --------------------------------------------------------

--
-- Table structure for table `detail_pembelian`
--

CREATE TABLE `detail_pembelian` (
  `id_detailPembelian` int(11) NOT NULL,
  `idPembelian` int(11) NOT NULL,
  `idBarang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `subTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `detail_penjualan`
--

CREATE TABLE `detail_penjualan` (
  `id_detailP` int(11) NOT NULL,
  `idPenjualan` int(11) NOT NULL,
  `idBarang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `subTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `jenisbarang`
--

CREATE TABLE `jenisbarang` (
  `idJenis` int(11) NOT NULL,
  `namaJenis` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jenisbarang`
--

INSERT INTO `jenisbarang` (`idJenis`, `namaJenis`) VALUES
(1, 'Kue'),
(2, 'susu'),
(3, 'Beras'),
(4, 'Minyak'),
(5, 'Mie');

-- --------------------------------------------------------

--
-- Table structure for table `kurir`
--

CREATE TABLE `kurir` (
  `idKurir` int(11) NOT NULL,
  `namaKurir` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kurir`
--

INSERT INTO `kurir` (`idKurir`, `namaKurir`) VALUES
(1, 'J&T'),
(2, 'JNE'),
(3, 'Tiki'),
(4, 'SiCepat'),
(5, 'Ninja Express'),
(6, 'Wahana');

-- --------------------------------------------------------

--
-- Table structure for table `level`
--

CREATE TABLE `level` (
  `idLevel` int(11) NOT NULL,
  `level` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level`
--

INSERT INTO `level` (`idLevel`, `level`) VALUES
(1, 'admin'),
(2, 'user');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `idPembelian` int(11) NOT NULL,
  `idSupplier` int(11) NOT NULL,
  `tgl_beli` int(11) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `idPenjualan` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `idKurir` int(11) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `idSupplier` int(11) NOT NULL,
  `namaSupplier` int(11) NOT NULL,
  `alamat` int(11) NOT NULL,
  `notelp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`idSupplier`, `namaSupplier`, `alamat`, `notelp`) VALUES
(1, 0, 0, 1),
(2, 0, 0, 2),
(3, 0, 0, 3),
(4, 0, 0, 4),
(5, 0, 0, 5);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL,
  `namaUser` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `jenisKelamin` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `notelp` varchar(255) NOT NULL,
  `tglLahir` date NOT NULL,
  `password` varchar(255) NOT NULL,
  `photopath` varchar(255) NOT NULL,
  `userLevel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `namaUser`, `username`, `jenisKelamin`, `alamat`, `notelp`, `tglLahir`, `password`, `photopath`, `userLevel`) VALUES
(1, 'Bambang', 'Bambang', '', 'Malang', '000000000000', '1999-09-09', 'bambang1', '', 2),
(2, 'Agus', 'Agus', '', 'Malang', '000000000001', '1999-09-10', 'agus1', '', 2),
(3, 'Joko', 'Joko', '', 'Malang', '000000000002', '1999-09-11', 'joko1', '', 2),
(4, 'Jokowi Pengutang', 'Jokowi', '', 'Malang', '000000000003', '1999-09-12', 'jokowipengutang1', '', 2),
(5, 'tes', 'tes', 'Laki-Laki', 'tes,tes,tess', 'tes', '1999-09-10', 'tes', '41-Wahyu Bagus Wicaksono.jpg', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`idBarang`),
  ADD KEY `idJenisBarang` (`idJenisBarang`);

--
-- Indexes for table `detail_pembelian`
--
ALTER TABLE `detail_pembelian`
  ADD PRIMARY KEY (`id_detailPembelian`),
  ADD KEY `idPembelian` (`idPembelian`),
  ADD KEY `idBarang` (`idBarang`);

--
-- Indexes for table `detail_penjualan`
--
ALTER TABLE `detail_penjualan`
  ADD PRIMARY KEY (`id_detailP`),
  ADD KEY `idPenjualan` (`idPenjualan`),
  ADD KEY `idBarang` (`idBarang`);

--
-- Indexes for table `jenisbarang`
--
ALTER TABLE `jenisbarang`
  ADD PRIMARY KEY (`idJenis`);

--
-- Indexes for table `kurir`
--
ALTER TABLE `kurir`
  ADD PRIMARY KEY (`idKurir`);

--
-- Indexes for table `level`
--
ALTER TABLE `level`
  ADD PRIMARY KEY (`idLevel`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`idPembelian`),
  ADD KEY `idSupplier` (`idSupplier`),
  ADD KEY `tgl_beli` (`tgl_beli`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`idPenjualan`),
  ADD KEY `idUser` (`idUser`),
  ADD KEY `idKurir` (`idKurir`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`idSupplier`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`),
  ADD KEY `userLevel` (`userLevel`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `idBarang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `detail_pembelian`
--
ALTER TABLE `detail_pembelian`
  MODIFY `id_detailPembelian` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `detail_penjualan`
--
ALTER TABLE `detail_penjualan`
  MODIFY `id_detailP` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `jenisbarang`
--
ALTER TABLE `jenisbarang`
  MODIFY `idJenis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `kurir`
--
ALTER TABLE `kurir`
  MODIFY `idKurir` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `level`
--
ALTER TABLE `level`
  MODIFY `idLevel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `idPembelian` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `idPenjualan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `idSupplier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`idJenisBarang`) REFERENCES `jenisbarang` (`idJenis`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `detail_pembelian`
--
ALTER TABLE `detail_pembelian`
  ADD CONSTRAINT `detail_pembelian_ibfk_1` FOREIGN KEY (`idBarang`) REFERENCES `barang` (`idBarang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_pembelian_ibfk_2` FOREIGN KEY (`idPembelian`) REFERENCES `pembelian` (`idPembelian`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `detail_penjualan`
--
ALTER TABLE `detail_penjualan`
  ADD CONSTRAINT `detail_penjualan_ibfk_1` FOREIGN KEY (`idBarang`) REFERENCES `barang` (`idBarang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_penjualan_ibfk_2` FOREIGN KEY (`idPenjualan`) REFERENCES `penjualan` (`idPenjualan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `pembelian_ibfk_1` FOREIGN KEY (`idSupplier`) REFERENCES `supplier` (`idSupplier`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`idKurir`) REFERENCES `kurir` (`idKurir`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `penjualan_ibfk_2` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`userLevel`) REFERENCES `level` (`idLevel`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
