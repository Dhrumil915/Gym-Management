/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.5.62 : Database - gymbca
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gymbca` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `gymbca`;

/*Table structure for table `customer_details` */

DROP TABLE IF EXISTS `customer_details`;

CREATE TABLE `customer_details` (
  `receipt_number` int(11) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `contact_number` varchar(10) DEFAULT NULL,
  `date_1` date DEFAULT NULL,
  `date_2` date DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `hight` float DEFAULT NULL,
  PRIMARY KEY (`receipt_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer_details` */

insert  into `customer_details`(`receipt_number`,`first_name`,`middle_name`,`last_name`,`gender`,`contact_number`,`date_1`,`date_2`,`age`,`weight`,`hight`) values 
(1,'k','v','y','Male','1234','2020-12-12','2020-12-14',12,12.1,1.1),
(2,'r','d','s','Male','234','2020-12-22','2020-12-12',12,1.1,1.2);

/*Table structure for table `enquiry` */

DROP TABLE IF EXISTS `enquiry`;

CREATE TABLE `enquiry` (
  `enquiry_number` int(11) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `middle_number` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `contact_number` varchar(10) DEFAULT NULL,
  `date_3` date DEFAULT NULL,
  PRIMARY KEY (`enquiry_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `enquiry` */

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `amo` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `payment` */

insert  into `payment`(`amo`,`type`) values 
('1233','CASH'),
('2000','CASH'),
('1234','CASH'),
('123','DEBIT CARD'),
('123','CASH'),
('2000','CASH'),
('2000','CHEQUE');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
