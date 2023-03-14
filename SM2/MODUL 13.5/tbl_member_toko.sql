-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 16, 2023 at 06:52 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `membuatcrudmvcjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_member_toko`
--

CREATE TABLE `tbl_member_toko` (
  `id` int(1) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `paket` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_member_toko`
--

INSERT INTO `tbl_member_toko` (`id`, `nama`, `no_telp`, `alamat`, `paket`) VALUES
(9, 'Luki eka', '84849393', 'Dawuhan', 'Bronze'),
(10, 'wahyu', '728273', 'Dongko', 'Silver '),
(11, 'Khabib', '564636', 'Karangan', 'Gold '),
(12, 'Aji', '9384636', 'dongko', 'Platinum');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_member_toko`
--
ALTER TABLE `tbl_member_toko`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_member_toko`
--
ALTER TABLE `tbl_member_toko`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
