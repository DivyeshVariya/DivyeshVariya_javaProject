-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2021 at 06:16 AM
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
-- Database: `invmngtdb2`
--

-- --------------------------------------------------------

--
-- Table structure for table `billing_transaction`
--

CREATE TABLE `billing_transaction` (
  `bill_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `cus_id` int(11) NOT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billing_transaction`
--

INSERT INTO `billing_transaction` (`bill_id`, `item_id`, `cus_id`, `Quantity`, `total`) VALUES
(23, 1, 1, 12, 60),
(23, 2, 1, 1, 10),
(24, 1, 1, 12, 60),
(24, 2, 1, 4, 40),
(25, 1, 1, 12, 60),
(25, 2, 1, 12, 120),
(25, 3, 1, 1, 40),
(26, 1, 16, 10, 50),
(26, 2, 16, 5, 50),
(26, 3, 16, 3, 120),
(27, 1, 12, 12, 60),
(27, 2, 12, 1, 10);

-- --------------------------------------------------------

--
-- Table structure for table `bill_master`
--

CREATE TABLE `bill_master` (
  `id` int(11) NOT NULL,
  `date` datetime DEFAULT current_timestamp(),
  `customer_id` int(11) DEFAULT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill_master`
--

INSERT INTO `bill_master` (`id`, `date`, `customer_id`, `Total`) VALUES
(23, '2021-05-06 17:10:50', 1, 70),
(24, '2021-05-06 17:12:53', 1, 100),
(25, '2021-05-06 21:41:30', 1, 220),
(26, '2021-05-06 22:04:51', 16, 220),
(27, '2021-05-07 00:13:15', 12, 70);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Cookies'),
(2, 'Namkeen'),
(3, 'Chocolate'),
(4, 'Bakery product'),
(5, 'Ice cream'),
(6, 'Cold drinks'),
(7, 'toys'),
(8, 'Stationary');

-- --------------------------------------------------------

--
-- Table structure for table `customer_master`
--

CREATE TABLE `customer_master` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_master`
--

INSERT INTO `customer_master` (`id`, `name`, `contact`) VALUES
(1, 'parth', '7228840080'),
(2, 'divyesh', '1111122222'),
(12, 'dev', '7878787878'),
(16, 'jinal', '8585858585');

-- --------------------------------------------------------

--
-- Table structure for table `item_master`
--

CREATE TABLE `item_master` (
  `item_code` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `item_master`
--

INSERT INTO `item_master` (`item_code`, `name`, `Quantity`, `category_id`, `price`) VALUES
(1, 'Parle G 200g', 18, 1, 5),
(2, 'balaji simply salted 40g', 19, 2, 10),
(3, 'Trimax', 50, 8, 40),
(4, 'chetoos', 30, 2, 20);

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Id` int(100) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `User_name` varchar(30) NOT NULL,
  `Passward` varchar(30) NOT NULL,
  `Mobile_no` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Id`, `Name`, `User_name`, `Passward`, `Mobile_no`) VALUES
(4, 'dkufhk', 'gydfgu', '123', '12345'),
(3, 'sagar', 'sagar_1', 'sagar@123', '1234567890'),
(1, 'divyesh', 'divyesh_variya_', 'div@123', '7778029116');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing_transaction`
--
ALTER TABLE `billing_transaction`
  ADD PRIMARY KEY (`bill_id`,`item_id`,`cus_id`),
  ADD KEY `fk_Billing_transaction_2_idx` (`item_id`),
  ADD KEY `fk_Billing_transaction_3_idx` (`cus_id`);

--
-- Indexes for table `bill_master`
--
ALTER TABLE `bill_master`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_bill_master_1_idx` (`customer_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `customer_master`
--
ALTER TABLE `customer_master`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `item_master`
--
ALTER TABLE `item_master`
  ADD PRIMARY KEY (`item_code`),
  ADD UNIQUE KEY `item_code_UNIQUE` (`item_code`),
  ADD KEY `fk_item_master_1_idx` (`category_id`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`Mobile_no`,`Name`),
  ADD UNIQUE KEY `id` (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill_master`
--
ALTER TABLE `bill_master`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `customer_master`
--
ALTER TABLE `customer_master`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `Id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `billing_transaction`
--
ALTER TABLE `billing_transaction`
  ADD CONSTRAINT `fk_Billing_transaction_1` FOREIGN KEY (`bill_id`) REFERENCES `bill_master` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Billing_transaction_2` FOREIGN KEY (`item_id`) REFERENCES `item_master` (`item_code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Billing_transaction_3` FOREIGN KEY (`cus_id`) REFERENCES `customer_master` (`id`);

--
-- Constraints for table `bill_master`
--
ALTER TABLE `bill_master`
  ADD CONSTRAINT `fk_bill_master_1` FOREIGN KEY (`customer_id`) REFERENCES `customer_master` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `item_master`
--
ALTER TABLE `item_master`
  ADD CONSTRAINT `fk_item_master_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
