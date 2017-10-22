-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: kallsony_backend
-- ------------------------------------------------------
-- Server version	5.7.19-log
CREATE SCHEMA `kallsonys_backend`;

USE kallsonys_backend;

--
-- Table structure for table `creditcard`
--

DROP TABLE IF EXISTS `creditcard`;
DROP TABLE IF EXISTS `logpayment`;
DROP TABLE IF EXISTS `servientrega_items`;
DROP TABLE IF EXISTS `servientrega_shipment`;
DROP TABLE IF EXISTS `dhl_items`;
DROP TABLE IF EXISTS `dhl_shipment`;
DROP TABLE IF EXISTS `kallsonys_properties`;


CREATE TABLE `creditcard` (
  `id` bigint(20) NOT NULL,
  `typeCard` varchar(100) NOT NULL,
  `numberCard` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `logpayment` (
  `id` bigint(20) NOT NULL,
  `idOrder` varchar(255) DEFAULT NULL,
  `paymentDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `servientrega_shipment` (
  `orderid` varchar(20) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `street` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(2) NOT NULL,
  `zipcode` varchar(5) NOT NULL,
  `status` varchar(5) NOT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `servientrega_items` (
  `itemid` varchar(20) NOT NULL,
  `ordid` varchar(20) NOT NULL,
  `prodid` bigint(22) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `productnum` varchar(20) NOT NULL,
  `price` decimal(9,2) NOT NULL,
  `quantity` int(9) NOT NULL,
  PRIMARY KEY (`ordid`, `itemid`),
  foreign key (ordid) references servientrega_shipment(orderid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `dhl_shipment` (
  `partner` varchar(20) NOT NULL,
  `supplier` varchar(20) NOT NULL,
  `orderId` varchar(20) NOT NULL,
  `addresseeName` varchar(50) NOT NULL,
  `addresseeLastName` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `street` varchar(50) NOT NULL,
  `state` varchar(2) NOT NULL,
  `zipcode` varchar(5) NOT NULL,
  PRIMARY KEY (`partner`, `orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `dhl_items` (
  `itemID` varchar(20) NOT NULL,
  `partner` varchar(20) NOT NULL,
  `orderId` varchar(20) NOT NULL,
  `prodID` bigint(22) NOT NULL,
  `productName` varchar(50) NOT NULL,
  `partNumber` varchar(20) NOT NULL,
  `price` decimal(9,2) NOT NULL,
  `quantity` int(9) NOT NULL,
  PRIMARY KEY (`partner`, `orderId`, `itemID`),
  foreign key (partner, orderId) references dhl_shipment(partner, orderId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `kallsonys_properties` (
  `propertyId` varchar(50) NOT NULL,
  `propertyValue` varchar(50) NOT NULL,
  `propertyDesc` varchar(200),
  PRIMARY KEY (`propertyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `creditcard`
--
INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (1, "VISA", "1001");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (2, "VISA", "1002");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (3, "VISA", "1003");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (4, "MASTERCARD", "2001");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (5, "MASTERCARD", "2002");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (6, "MASTERCARD", "2003");

INSERT INTO `kallsonys_backend`.`kallsonys_properties` (`propertyId`, `propertyValue`, `propertyDesc`) VALUES ("DECISOR_FACTORY", "RANDOM", "Indica quien atiende la orden, si va ser aleatoria o algun fabricante en particualr: SONY|RS");