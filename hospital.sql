-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2020 at 04:26 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `Code` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID`, `Code`, `Name`, `Password`) VALUES
(1, '00000', 'Eslam Khder', '00000');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `ID` int(11) NOT NULL,
  `Accept_Doctor` int(11) DEFAULT NULL,
  `Accept_Medicine` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Time` time DEFAULT NULL,
  `Client_ID` int(11) DEFAULT NULL,
  `Doctor_ID` int(11) DEFAULT NULL,
  `pharmacy_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`ID`, `Accept_Doctor`, `Accept_Medicine`, `Date`, `Time`, `Client_ID`, `Doctor_ID`, `pharmacy_ID`) VALUES
(18, 1, 1, '2020-06-07', '15:31:17', 1, 1, 15),
(19, 1, 1, '2020-06-07', '15:31:39', 1, 4, 17),
(20, 1, 1, '2020-06-07', '15:33:12', 1, 2, 16),
(21, 1, 1, '2020-06-07', '15:34:53', 1, 3, 18);

-- --------------------------------------------------------

--
-- Table structure for table `clientproperties`
--

CREATE TABLE `clientproperties` (
  `ID` int(11) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Phone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clientproperties`
--

INSERT INTO `clientproperties` (`ID`, `Address`, `Age`, `Gender`, `Name`, `Phone`) VALUES
(1, 'el shohada', 19, 'Male', 'Ahmed ', '01113903660'),
(2, 'el sho', 20, 'Male', 'solom mmm', '01003574980'),
(3, 'ghgjhg', 16, 'Male', 'hjhghjgjh', '01113903660');

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `ClientID` int(11) NOT NULL,
  `Balance` int(11) NOT NULL,
  `Code` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `clientproperties_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`ClientID`, `Balance`, `Code`, `Password`, `clientproperties_ID`) VALUES
(1, 200, '55555', '5555555', 1),
(2, 100, '66666', '6666666', 2),
(3, 100, '11111', '1111111', 3);

-- --------------------------------------------------------

--
-- Table structure for table `doctorproperties`
--

CREATE TABLE `doctorproperties` (
  `ID` int(11) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Phone_Number` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctorproperties`
--

INSERT INTO `doctorproperties` (`ID`, `Gender`, `Name`, `Phone_Number`) VALUES
(1, 'Male', 'Ahmed El Ghazaly', '01113903660'),
(2, 'Male', 'Eman Zaref', '01003574980'),
(3, 'FeMale', 'Asmaa Ahmed', '01245124511'),
(4, 'Male', 'Ayman Ahmed', '01032456210'),
(5, 'FeMale', 'jgjg', '01113903660');

-- --------------------------------------------------------

--
-- Table structure for table `doctors`
--

CREATE TABLE `doctors` (
  `ID` int(11) NOT NULL,
  `DoctorSpecialty` varchar(255) NOT NULL,
  `Available` int(11) DEFAULT NULL,
  `Balance` int(11) NOT NULL,
  `Code` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `doctorproperties_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctors`
--

INSERT INTO `doctors` (`ID`, `DoctorSpecialty`, `Available`, `Balance`, `Code`, `Password`, `doctorproperties_ID`) VALUES
(1, 'Eyes Doctor', 1, 700, '11111', '11111111', 1),
(2, 'Analysis Doctor', 1, 300, '22222', '2222222', 2),
(3, 'Rumor Doctor', 1, 300, '33333', '3333333', 3),
(4, 'Pharmacist', 0, 500, '4444', '4444444', 4);

-- --------------------------------------------------------

--
-- Table structure for table `pharmacy`
--

CREATE TABLE `pharmacy` (
  `ID` int(11) NOT NULL,
  `Date` date DEFAULT NULL,
  `medicine` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pharmacy`
--

INSERT INTO `pharmacy` (`ID`, `Date`, `medicine`) VALUES
(15, '2020-06-07', 'bvnbvnbvnb'),
(16, '2020-06-07', 'nmnbmnb'),
(17, '2020-06-07', 'sxdcdcdcd'),
(18, '2020-06-07', 'jhkjhkjhkj');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_cl5ifwckghu9m94th62vragw9` (`Client_ID`),
  ADD KEY `FK_mwjdusmeo1f5us21pnyy2pm4w` (`Doctor_ID`),
  ADD KEY `FK_k7chimy8y4icg336dun1f3fy` (`pharmacy_ID`);

--
-- Indexes for table `clientproperties`
--
ALTER TABLE `clientproperties`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`ClientID`),
  ADD UNIQUE KEY `UK_emvw8vsipcehqwp2klxl7rc5i` (`Code`),
  ADD KEY `FK_6vaxde76vwvop9eocj9wo9pfe` (`clientproperties_ID`);

--
-- Indexes for table `doctorproperties`
--
ALTER TABLE `doctorproperties`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `UK_2c9mop7xjo22h59o9kcsks2kb` (`Code`),
  ADD KEY `FK_qqqnd2jmrkjrxfv25ysnc0w7v` (`doctorproperties_ID`);

--
-- Indexes for table `pharmacy`
--
ALTER TABLE `pharmacy`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `clientproperties`
--
ALTER TABLE `clientproperties`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `ClientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `doctorproperties`
--
ALTER TABLE `doctorproperties`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `doctors`
--
ALTER TABLE `doctors`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pharmacy`
--
ALTER TABLE `pharmacy`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `FK_cl5ifwckghu9m94th62vragw9` FOREIGN KEY (`Client_ID`) REFERENCES `clients` (`ClientID`),
  ADD CONSTRAINT `FK_k7chimy8y4icg336dun1f3fy` FOREIGN KEY (`pharmacy_ID`) REFERENCES `pharmacy` (`ID`),
  ADD CONSTRAINT `FK_mwjdusmeo1f5us21pnyy2pm4w` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctors` (`ID`);

--
-- Constraints for table `clients`
--
ALTER TABLE `clients`
  ADD CONSTRAINT `FK_6vaxde76vwvop9eocj9wo9pfe` FOREIGN KEY (`clientproperties_ID`) REFERENCES `clientproperties` (`ID`);

--
-- Constraints for table `doctors`
--
ALTER TABLE `doctors`
  ADD CONSTRAINT `FK_qqqnd2jmrkjrxfv25ysnc0w7v` FOREIGN KEY (`doctorproperties_ID`) REFERENCES `doctorproperties` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
