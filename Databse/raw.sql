-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 10, 2023 at 10:52 AM
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
-- Database: `raw`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Name` varchar(40) NOT NULL,
  `mobileno` int(255) NOT NULL,
  `Username` varchar(40) NOT NULL,
  `Password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Name`, `mobileno`, `Username`, `Password`) VALUES
('Admin', 0, 'admin', '0000');

-- --------------------------------------------------------

--
-- Table structure for table `authentication`
--

CREATE TABLE `authentication` (
  `Name` varchar(40) NOT NULL,
  `mobileno` varchar(12) NOT NULL,
  `Username` varchar(40) DEFAULT NULL,
  `Password` varchar(40) NOT NULL,
  `status` varchar(3) NOT NULL DEFAULT 'No'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `authentication`
--

INSERT INTO `authentication` (`Name`, `mobileno`, `Username`, `Password`, `status`) VALUES
('Sanket Phadtare', '9021510146', 'sanket', '00734', 'NO'),
('Honey Singh', '9021510147', 'honey', '00734', 'NO'),
('Singhsta Baby', '9021510148', 'singhsta', '00734', 'No'),
('Nupur Sanon', '7743967494', 'nupur', '00734', 'YES'),
('Nupur Sanon', '7743967494', 'nupur', '00734', 'YES'),
('priyanshu', '8131063857', 'srk9612@gmail.com', 'kittu', 'No'),
('priyanshu', '8131063857', 'srk9612@gmail.com', 'kittu', 'No'),
('priyanshu', '8131063857', 'srk9612@gmail.com', 'kittu', 'No'),
('priyanshu', '8131063857', 'srk', 'kittu', 'NO'),
('Vatsal Sharma', '9021510146', 'vatsal', '1234', 'NO'),
('', '', '', '', 'No'),
('Leo Grewal', '9816592123', 'leo123', '123456', 'NO');

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `name` varchar(50) NOT NULL,
  `flight_name` varchar(100) NOT NULL,
  `flight_no` varchar(10) NOT NULL,
  `date` varchar(40) NOT NULL,
  `departure` varchar(15) NOT NULL,
  `arrival` varchar(15) NOT NULL,
  `source` varchar(20) NOT NULL,
  `destination` varchar(20) NOT NULL,
  `pnr` varchar(11) NOT NULL,
  `class` varchar(40) NOT NULL,
  `Check_In` varchar(10) NOT NULL DEFAULT 'No',
  `fare` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`name`, `flight_name`, `flight_no`, `date`, `departure`, `arrival`, `source`, `destination`, `pnr`, `class`, `Check_In`, `fare`) VALUES
('Nupur Sanon', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '753088', 'Economy', 'YES', 19500),
('Kriti Sanon', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '867161', 'Economy', 'No', 19500),
('Honey Singh', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '649058', 'Economy', 'No', 19500),
('Sanket Phadtare', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '181271', 'Economy', 'No', 19500),
('Singhsta Baby', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '602129', 'Economy', 'No', 19500),
('Hommie Dilliwala', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '824099', 'Economy', 'No', 19500),
('Guru Randhawa', 'New Delhi-DXB (Indian Airlines)', 'A-106', '20-08-2022', '06:00 AM', '14:20 PM', 'New Delhi', 'UAE', '753967', 'Business', 'No', 17500),
('Honey Singh', 'New Delhi-DXB (Indian Airlines)', 'A-106', '20-08-2022', '06:00 AM', '14:20 PM', 'New Delhi', 'UAE', '722862', 'Economy', 'No', 17500),
('priyam', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '20-09-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '637583', 'Business', 'YES', 9732),
('Sanket Phadtare', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '30-09-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '351617', 'First Class', 'YES', 9732),
('Singhsta Baby', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '30-09-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '882101', 'Premium Economy', 'YES', 9732),
('Honey Singh', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '30-09-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '746054', 'Premium Economy', 'YES', 19500),
('Tejas Nawle', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '30-09-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '104268', 'Economy', 'YES', 21000),
('Omkar Naikare', 'PNQ-USA (Indian-Airlines)', 'A-102', '10-10-2022', '06:30 AM', '18:50 PM', 'Pune', 'USA', '605752', 'Premium Economy', 'YES', 17000),
('Alfaaz', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '07-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '867257', 'Economy', 'YES', 21000),
('Rahul Vaidya', 'PNQ-CND (Indian-Airlines)', 'A-103', '10-10-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '90137', 'Premium Economy', 'YES', 19300),
('Millind', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '10-10-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '799877', 'Economy', 'No', 19500),
('Sidhu Moosewala', 'PNQ-USA (Indian-Airlines)', 'A-102', '10-10-2022', '06:30 AM', '18:50 PM', 'Pune', 'USA', '923174', 'Economy', 'YES', 17000),
('Lil Golu', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '10-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '712012', 'First Class', 'YES', 21000),
('Ikka Singh', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '11-10-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '447060', 'Business', 'YES', 9732),
('Sanket', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '15-10-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '952658', 'Premium Economy', 'YES', 19500),
('ABC', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '15-10-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '418263', 'Premium Economy', 'YES', 19500),
('Rohit Sharma', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '17-10-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '940408', 'Premium Economy', 'YES', 9732),
('Vatsal Sharma', 'PNQ-CND (Indian-Airlines)', 'A-103', '21-10-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '393151', 'Business', 'YES', 19300),
('NUMAN', 'PNQ-USA (Indian-Airlines)', 'A-102', '31-10-2022', '06:30 AM', '18:50 PM', 'Pune', 'USA', '389363', 'Business', 'YES', 17000),
('ARYAN', 'PNQ-CND (Indian-Airlines)', 'A-103', '30-10-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '845714', 'Business', 'YES', 19300),
('Ipsitaa Official', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '29-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '504959', 'First Class', 'No', 21000),
('Prophe C', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '30-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '537489', 'Premium Economy', 'YES', 21000),
('Sanket', 'PNQ-CND (Indian-Airlines)', 'A-103', '11-11-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '444957', 'Premium Economy', 'YES', 19300),
('Honey 3.0', 'PNQ-USA (Indian-Airlines)', 'A-102', '12-01-2023', '06:30 AM', '18:50 PM', 'Pune', 'USA', '862036', 'Premium Economy', 'YES', 17000),
('Sanket Phadtare', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '14-01-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '663661', 'Premium Economy', 'YES', 7000),
('SIGCE', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '15-02-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '423109', 'Economy', 'YES', 7000),
('Sanket Phadtare', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '10-04-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '868704', 'Economy', 'No', 7000),
('ssssss', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '07-04-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '593585', 'Economy', 'YES', 7000),
('SIGCE', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '04-05-2023', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '63626', 'Economy', 'YES', 9732),
('Tejas Nawle', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '07-05-2023', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '766101', 'Economy', 'No', 9732);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `empid` varchar(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `department` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`empid`, `name`, `username`, `password`, `department`) VALUES
('1001', 'Sanket Phadtare', 'sanket', '1001', 'Maintenance'),
('1002', 'Nikita Phadtare', 'nikita', '1002', 'Passenger Facilitation'),
('1003', 'Umar Riaz', 'umar', '1003', 'ATC'),
('1004', 'Asim Riaz', 'asim', '1004', 'Baggage Handling'),
('1005', 'Preeti', 'preeti', '1005', 'Maintenance'),
('1006', 'Kriti Sanon', 'kriti', '1006', 'Accounts'),
('1007', 'Tejas Nawle', 'tejas', '1007', 'Accounts');

-- --------------------------------------------------------

--
-- Table structure for table `fdetails`
--

CREATE TABLE `fdetails` (
  `Name` varchar(100) NOT NULL,
  `Engine` varchar(40) NOT NULL,
  `Registration` varchar(40) NOT NULL,
  `Type` varchar(40) NOT NULL,
  `Date` varchar(40) NOT NULL,
  `Operator` varchar(40) NOT NULL,
  `Number` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fdetails`
--

INSERT INTO `fdetails` (`Name`, `Engine`, `Registration`, `Type`, `Date`, `Operator`, `Number`) VALUES
('PNQ-Dubai (UAE) Indian-Airlines', 'IA-9021-HS', 'VT-EPN', 'Airbuus A320-231', '14 February 1990', 'Smart Airlines', 'A-101'),
('PNQ-USA (Indian-Airlines)', 'IA-9021-SB', 'VT-EQO', 'Airbuus A320-231', '23 April 1997', 'Smart Airlines', 'A-102'),
('PNQ-CND (Indian-Airlines)', 'IA-9021-HD', 'VT-ERS', 'Airbuus A320-231', '10 March 2000', 'Smart Airlines', 'A-103'),
('PNQ-SINGAPORE (Indian-Airlines)\r\n', 'IA-9021-LG', 'VT-EST', 'Airbuus A320-231', '10 November 1988', 'Smart Airlines', 'A-104'),
('PNQ-MALAYSIA (Indian-Airlines)', 'IA-9021-IS', 'VT-ETU', 'Airbuus A320-231', '20 May 1990', 'Smart Airlines', 'A-105'),
('New Delhi-DXB (Indian Airlines)', 'IA-9021-GR', 'VT-EUV', 'Airbuus A320-231', '20 December 1967', 'Smart Airlines', 'A-106'),
('New Delhi-CND Indian Airlines', 'IA-9021-BB', 'VT-EUV', 'Airbuus A320-231', '19 October 1967', 'Smart Airlines', 'A-107'),
('PNQ-BOM INDIAN AIRLINES', 'IA-9021-IP', 'VT-EVS', 'Airbuus A320-231', '20 September 2001', 'Smart Airlines', 'A-108');

-- --------------------------------------------------------

--
-- Table structure for table `flights`
--

CREATE TABLE `flights` (
  `fname` varchar(50) NOT NULL,
  `fno` varchar(10) NOT NULL,
  `departure` varchar(10) NOT NULL,
  `arrival` varchar(10) NOT NULL,
  `src` varchar(40) NOT NULL,
  `dst` varchar(40) NOT NULL,
  `fare` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flights`
--

INSERT INTO `flights` (`fname`, `fno`, `departure`, `arrival`, `src`, `dst`, `fare`) VALUES
('PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '06:00 AM', '13:40 PM', 'Pune', 'UAE', 9732),
('PNQ-USA (Indian-Airlines)', 'A-102', '06:30 AM', '18:50 PM', 'Pune', 'USA', 17000),
('PNQ-CND (Indian-Airlines)', 'A-103', '14:00 PM', '00:10 AM', 'Pune', 'Canada', 19300),
('PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', 21000),
('PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', 19500),
('New Delhi-DXB (Indian Airlines)', 'A-106', '06:00 AM', '14:20 PM', 'New Delhi', 'UAE', 17500),
('New Delhi-CND', 'A-107', '14:00 PM', '12:50 AM', 'New Delhi', 'Canada', 21000),
('PNQ-BOM INDIAN AIRLINES', 'A-108', '6.00 AM', '6.30 AM', 'Pune', 'Mumbai', 5000),
('PNQ-New Delhi (Indian Airlines)', 'A-109', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', 7000);

-- --------------------------------------------------------

--
-- Table structure for table `leo123`
--

CREATE TABLE `leo123` (
  `name` varchar(50) DEFAULT NULL,
  `flight_name` varchar(100) DEFAULT NULL,
  `flight_no` varchar(10) DEFAULT NULL,
  `date` varchar(40) DEFAULT NULL,
  `departure` varchar(15) DEFAULT NULL,
  `arrival` varchar(15) DEFAULT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `pnr` varchar(11) DEFAULT NULL,
  `class` varchar(40) DEFAULT NULL,
  `Check_In` varchar(10) DEFAULT 'No',
  `fare` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `maintenance_records`
--

CREATE TABLE `maintenance_records` (
  `Number` varchar(10) NOT NULL,
  `Date` varchar(40) NOT NULL,
  `TyrePressure` int(40) NOT NULL,
  `Fuel` int(40) NOT NULL,
  `Oil` int(40) NOT NULL,
  `Oxygen` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `maintenance_records`
--

INSERT INTO `maintenance_records` (`Number`, `Date`, `TyrePressure`, `Fuel`, `Oil`, `Oxygen`) VALUES
('A-105', '27-10-2022', 97, 92, 105, 'Yes'),
('A-107', '27-10-2022', 100, 95, 105, 'Yes'),
('A-101', '28-10-2022', 1, 1, 1, 'Y'),
('A-103', '11-11-2022', 100, 100, 95, 'Yes'),
('A-102', '12-01-2023', 100, 100, 100, '100'),
('A-102', '06-04-2023', 100, 100, 100, '12'),
('A-102', '06-04-2023', 100, 100, 100, 'YES'),
('A-101', '04-05-2023', 100, 100, 70, 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `nupur`
--

CREATE TABLE `nupur` (
  `name` varchar(50) DEFAULT NULL,
  `flight_name` varchar(100) DEFAULT NULL,
  `flight_no` varchar(10) DEFAULT NULL,
  `date` varchar(40) DEFAULT NULL,
  `departure` varchar(15) DEFAULT NULL,
  `arrival` varchar(15) DEFAULT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `pnr` varchar(11) DEFAULT NULL,
  `class` varchar(40) DEFAULT NULL,
  `Check_In` varchar(10) DEFAULT 'No',
  `fare` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nupur`
--

INSERT INTO `nupur` (`name`, `flight_name`, `flight_no`, `date`, `departure`, `arrival`, `source`, `destination`, `pnr`, `class`, `Check_In`, `fare`) VALUES
('Nupur Sanon', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '753088', 'Economy', 'YES', 19500),
('Kriti Sanon', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '867161', 'Economy', 'No', 19500),
('Honey Singh', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '649058', 'Economy', 'No', 19500),
('Sanket Phadtare', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '181271', 'Economy', 'No', 19500),
('Singhsta Baby', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '602129', 'Economy', 'No', 19500),
('Hommie Dilliwala', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '19-08-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '824099', 'Economy', 'No', 19500),
('Guru Randhawa', 'New Delhi-DXB (Indian Airlines)', 'A-106', '20-08-2022', '06:00 AM', '14:20 PM', 'New Delhi', 'UAE', '753967', 'Business', 'No', 17500),
('Honey Singh', 'New Delhi-DXB (Indian Airlines)', 'A-106', '20-08-2022', '06:00 AM', '14:20 PM', 'New Delhi', 'UAE', '722862', 'Economy', 'No', 17500);

-- --------------------------------------------------------

--
-- Table structure for table `sanket`
--

CREATE TABLE `sanket` (
  `name` varchar(50) DEFAULT NULL,
  `flight_name` varchar(100) DEFAULT NULL,
  `flight_no` varchar(10) DEFAULT NULL,
  `date` varchar(40) DEFAULT NULL,
  `departure` varchar(15) DEFAULT NULL,
  `arrival` varchar(15) DEFAULT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `pnr` varchar(11) DEFAULT NULL,
  `class` varchar(40) DEFAULT NULL,
  `Check_In` varchar(10) DEFAULT 'No',
  `fare` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sanket`
--

INSERT INTO `sanket` (`name`, `flight_name`, `flight_no`, `date`, `departure`, `arrival`, `source`, `destination`, `pnr`, `class`, `Check_In`, `fare`) VALUES
('Sanket Phadtare', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '30-09-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '351617', 'First Class', 'YES', 9732),
('Singhsta Baby', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '30-09-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '882101', 'Premium Economy', 'YES', 9732),
('Honey Singh', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '30-09-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '746054', 'Premium Economy', 'YES', 19500),
('Tejas Nawle', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '30-09-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '104268', 'Economy', 'YES', 21000),
('Omkar Naikare', 'PNQ-USA (Indian-Airlines)', 'A-102', '10-10-2022', '06:30 AM', '18:50 PM', 'Pune', 'USA', '605752', 'Premium Economy', 'YES', 17000),
('Alfaaz', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '07-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '867257', 'Economy', 'YES', 21000),
('Rahul Vaidya', 'PNQ-CND (Indian-Airlines)', 'A-103', '10-10-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '90137', 'Premium Economy', 'YES', 19300),
('Millind', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '10-10-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '799877', 'Economy', 'No', 19500),
('Sidhu Moosewala', 'PNQ-USA (Indian-Airlines)', 'A-102', '10-10-2022', '06:30 AM', '18:50 PM', 'Pune', 'USA', '923174', 'Economy', 'YES', 17000),
('Lil Golu', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '10-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '712012', 'First Class', 'YES', 21000),
('Ikka Singh', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '11-10-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '447060', 'Business', 'YES', 9732),
('Sanket', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '15-10-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '952658', 'Premium Economy', 'YES', 19500),
('ABC', 'PNQ-MALAYSIA (Indian-Airlines)', 'A-105', '15-10-2022', '15:40 PM', '21:00 PM', 'Pune', 'Malaysia', '418263', 'Premium Economy', 'YES', 19500),
('Rohit Sharma', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '17-10-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '940408', 'Premium Economy', 'YES', 9732),
('NUMAN', 'PNQ-USA (Indian-Airlines)', 'A-102', '31-10-2022', '06:30 AM', '18:50 PM', 'Pune', 'USA', '389363', 'Business', 'YES', 17000),
('ARYAN', 'PNQ-CND (Indian-Airlines)', 'A-103', '30-10-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '845714', 'Business', 'YES', 19300),
('Ipsitaa Official', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '29-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '504959', 'First Class', 'No', 21000),
('Prophe C', 'PNQ-SINGAPORE (Indian-Airlines)', 'A-104', '30-10-2022', '00:20 AM', '09:30 AM', 'Pune', 'Singapore', '537489', 'Premium Economy', 'YES', 21000),
('Sanket', 'PNQ-CND (Indian-Airlines)', 'A-103', '11-11-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '444957', 'Premium Economy', 'YES', 19300),
('Honey 3.0', 'PNQ-USA (Indian-Airlines)', 'A-102', '12-01-2023', '06:30 AM', '18:50 PM', 'Pune', 'USA', '862036', 'Premium Economy', 'YES', 17000),
('Sanket Phadtare', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '14-01-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '663661', 'Premium Economy', 'YES', 7000),
('SIGCE', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '15-02-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '423109', 'Economy', 'YES', 7000),
('Sanket Phadtare', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '10-04-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '868704', 'Economy', 'No', 7000),
('ssssss', 'PNQ-New Delhi (Indian Airlines)', 'A-109', '07-04-2023', '8:00 AM', '10:30 AM', 'Pune', 'New Delhi', '593585', 'Economy', 'YES', 7000),
('SIGCE', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '04-05-2023', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '63626', 'Economy', 'YES', 9732),
('Tejas Nawle', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '07-05-2023', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '766101', 'Economy', 'No', 9732);

-- --------------------------------------------------------

--
-- Table structure for table `srk`
--

CREATE TABLE `srk` (
  `name` varchar(50) DEFAULT NULL,
  `flight_name` varchar(100) DEFAULT NULL,
  `flight_no` varchar(10) DEFAULT NULL,
  `date` varchar(40) DEFAULT NULL,
  `departure` varchar(15) DEFAULT NULL,
  `arrival` varchar(15) DEFAULT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `pnr` varchar(11) DEFAULT NULL,
  `class` varchar(40) DEFAULT NULL,
  `Check_In` varchar(10) DEFAULT 'No',
  `fare` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `srk`
--

INSERT INTO `srk` (`name`, `flight_name`, `flight_no`, `date`, `departure`, `arrival`, `source`, `destination`, `pnr`, `class`, `Check_In`, `fare`) VALUES
('priyam', 'PNQ-Dubai (UAE) Indian-Airlines', 'A-101', '20-09-2022', '06:00 AM', '13:40 PM', 'Pune', 'UAE', '637583', 'Business', 'YES', 9732);

-- --------------------------------------------------------

--
-- Table structure for table `vatsal`
--

CREATE TABLE `vatsal` (
  `name` varchar(50) DEFAULT NULL,
  `flight_name` varchar(100) DEFAULT NULL,
  `flight_no` varchar(10) DEFAULT NULL,
  `date` varchar(40) DEFAULT NULL,
  `departure` varchar(15) DEFAULT NULL,
  `arrival` varchar(15) DEFAULT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `pnr` varchar(11) DEFAULT NULL,
  `class` varchar(40) DEFAULT NULL,
  `Check_In` varchar(10) DEFAULT 'No',
  `fare` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vatsal`
--

INSERT INTO `vatsal` (`name`, `flight_name`, `flight_no`, `date`, `departure`, `arrival`, `source`, `destination`, `pnr`, `class`, `Check_In`, `fare`) VALUES
('Vatsal Sharma', 'PNQ-CND (Indian-Airlines)', 'A-103', '21-10-2022', '14:00 PM', '00:10 AM', 'Pune', 'Canada', '393151', 'Business', 'YES', 19300);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
