-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Jan 2019 pada 15.05
-- Versi server: 10.1.31-MariaDB
-- Versi PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `list_kue`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftar_menu`
--

CREATE TABLE `daftar_menu` (
  `kd_kue` varchar(10) NOT NULL,
  `nama_kue` varchar(30) NOT NULL,
  `jenis_kue` varchar(30) NOT NULL,
  `harga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftar_menu`
--

INSERT INTO `daftar_menu` (`kd_kue`, `nama_kue`, `jenis_kue`, `harga`) VALUES
('LK0001', 'Semprong', 'Kue Kering', '10.000'),
('LK0002', 'Kripik Pisang', 'Kue Kering', '10.000'),
('LK0003', 'Kripik Boled', 'Kue Kering', '5.000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jenis_kue`
--

CREATE TABLE `jenis_kue` (
  `id_jenis` varchar(5) NOT NULL,
  `nama_jenis` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jenis_kue`
--

INSERT INTO `jenis_kue` (`id_jenis`, `nama_jenis`) VALUES
('J-001', 'Kue Kering'),
('J-002', 'Kue Basah');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `kd_admin` varchar(10) COLLATE latin1_general_ci NOT NULL,
  `nama` varchar(20) COLLATE latin1_general_ci NOT NULL,
  `alamat` varchar(30) COLLATE latin1_general_ci NOT NULL,
  `no_telp` varchar(15) COLLATE latin1_general_ci NOT NULL,
  `j_kelamin` varchar(10) COLLATE latin1_general_ci NOT NULL,
  `username` varchar(30) COLLATE latin1_general_ci NOT NULL,
  `password` varchar(30) COLLATE latin1_general_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`kd_admin`, `nama`, `alamat`, `no_telp`, `j_kelamin`, `username`, `password`) VALUES
('123456789', 'Lusi', 'Indramayu', '0897677755', 'Perempuan', 'admin', 'admin'),
('1', 'Desi', 'Indramayu', '087718727715', 'Perempuan', 'Desi', '12345');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `daftar_menu`
--
ALTER TABLE `daftar_menu`
  ADD PRIMARY KEY (`kd_kue`);

--
-- Indeks untuk tabel `jenis_kue`
--
ALTER TABLE `jenis_kue`
  ADD PRIMARY KEY (`id_jenis`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`kd_admin`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
