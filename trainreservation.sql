-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 16, 2020 at 03:00 PM
-- Server version: 8.0.18
-- PHP Version: 7.4.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trainreservation`
--

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
CREATE TABLE IF NOT EXISTS `passenger` (
  `PId` int(11) NOT NULL AUTO_INCREMENT,
  `Name of Pas` varchar(25) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` varchar(25) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `PNR_No` varchar(12) NOT NULL,
  PRIMARY KEY (`PId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `passengerid`
--

DROP TABLE IF EXISTS `passengerid`;
CREATE TABLE IF NOT EXISTS `passengerid` (
  `PID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`PID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pnr`
--

DROP TABLE IF EXISTS `pnr`;
CREATE TABLE IF NOT EXISTS `pnr` (
  `PNR_No` varchar(12) NOT NULL,
  PRIMARY KEY (`PNR_No`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `PNR_No` varchar(12) NOT NULL,
  `Train No` int(11) NOT NULL,
  `Train Name` varchar(30) NOT NULL,
  `Class` varchar(4) NOT NULL,
  `Date of Journey` date NOT NULL,
  `Arrival` varchar(15) NOT NULL,
  `Departure` varchar(15) NOT NULL,
  `Boarding at` varchar(15) NOT NULL,
  PRIMARY KEY (`PNR_No`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `temppassenger`
--

DROP TABLE IF EXISTS `temppassenger`;
CREATE TABLE IF NOT EXISTS `temppassenger` (
  `PId` int(11) NOT NULL AUTO_INCREMENT,
  `Name of Pas` varchar(25) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `Address` varchar(50) NOT NULL,
  PRIMARY KEY (`PId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `train`
--

DROP TABLE IF EXISTS `train`;
CREATE TABLE IF NOT EXISTS `train` (
  `Train_No` int(11) NOT NULL,
  `Train_Name` varchar(15) NOT NULL,
  `Arrival` varchar(25) NOT NULL,
  `Departure` varchar(25) NOT NULL,
  `Departure Time` time NOT NULL,
  `Arrival Time` time NOT NULL,
  `Available Births` int(11) NOT NULL,
  PRIMARY KEY (`Train_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
