-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2020 at 05:34 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nhom3`
--

-- --------------------------------------------------------

--
-- Table structure for table `don_gia`
--

CREATE TABLE `don_gia` (
  `LoaiKH` varchar(20) NOT NULL,
  `DonGia` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `don_gia`
--

INSERT INTO `don_gia` (`LoaiKH`, `DonGia`) VALUES
('Liên tục', 5000),
('Ngắt quãng', 7000);

-- --------------------------------------------------------

--
-- Table structure for table `hoa_don`
--

CREATE TABLE `hoa_don` (
  `MaHD` int(20) NOT NULL,
  `MaKH` int(20) NOT NULL,
  `ChiSoCu` int(20) NOT NULL,
  `ChiSoMoi` int(20) NOT NULL,
  `NgayLap` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hoa_don`
--

INSERT INTO `hoa_don` (`MaHD`, `MaKH`, `ChiSoCu`, `ChiSoMoi`, `NgayLap`) VALUES
(90, 1, 0, 0, '2020-04-01'),
(91, 2, 0, 10, '2020-04-01'),
(92, 3, 0, 0, '2020-04-01'),
(95, 1, 0, 6, '2020-06-21');

-- --------------------------------------------------------

--
-- Table structure for table `khach_hang`
--

CREATE TABLE `khach_hang` (
  `MaKH` int(20) NOT NULL,
  `TenKH` varchar(30) NOT NULL,
  `CMT` varchar(20) NOT NULL,
  `DiaChi` varchar(30) NOT NULL,
  `SDTKH` varchar(20) NOT NULL,
  `LoaiKH` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `khach_hang`
--

INSERT INTO `khach_hang` (`MaKH`, `TenKH`, `CMT`, `DiaChi`, `SDTKH`, `LoaiKH`) VALUES
(1, 'Nguyễn Tiến Đạt', '123456789', 'Bắc Giang', '121234355', 'Liên tục'),
(2, 'Phạm Văn Nìn', '120982633', 'An Giang', '098887652', 'Ngắt quãng'),
(3, 'Lê quang lươn', '123123123', 'Nghệ án', '1231313', 'Ngắt quãng');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `don_gia`
--
ALTER TABLE `don_gia`
  ADD PRIMARY KEY (`LoaiKH`);

--
-- Indexes for table `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD PRIMARY KEY (`MaHD`),
  ADD KEY `fk_khachhang_hoadon` (`MaKH`);

--
-- Indexes for table `khach_hang`
--
ALTER TABLE `khach_hang`
  ADD PRIMARY KEY (`MaKH`),
  ADD KEY `fk_khachhang_dongia` (`LoaiKH`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hoa_don`
--
ALTER TABLE `hoa_don`
  MODIFY `MaHD` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=96;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD CONSTRAINT `fk_khachhang_hoadon` FOREIGN KEY (`MaKH`) REFERENCES `khach_hang` (`MaKH`);

--
-- Constraints for table `khach_hang`
--
ALTER TABLE `khach_hang`
  ADD CONSTRAINT `fk_khachhang_dongia` FOREIGN KEY (`LoaiKH`) REFERENCES `don_gia` (`LoaiKH`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
