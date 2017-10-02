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
)

--
-- Dumping data for table `creditcard`
--
INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (1, "VISA", "1001");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (2, "VISA", "1002");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (3, "VISA", "1003");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (4, "MASTERCARD", "2001");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (5, "MASTERCARD", "2002");

INSERT INTO `kallsonys_backend`.`creditcard` (`id`, `typeCard`, `numberCard`) VALUES (6, "MASTERCARD", "2003");