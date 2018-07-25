SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

SET NAMES 'utf8';
SET CHARACTER SET 'utf8';
SET SESSION collation_connection = 'utf8_general_ci';
-- -----------------------------------------------------
-- Schema beautybar
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `beautybar` ;

-- -----------------------------------------------------
-- Schema beautybar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `beautybar` DEFAULT CHARACTER SET utf8 ;
USE `beautybar` ;

-- -----------------------------------------------------
-- Table `beautybar`.`service`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `beautybar`.`service`;

CREATE TABLE `service` (
  `idservice` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `price` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`idservice`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `role` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `password_hash` varchar(45) DEFAULT NULL,
  `salt` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `booking` (
  `idbooking` int(11) NOT NULL AUTO_INCREMENT,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `duration` int(11) DEFAULT NULL,
  `idmaster` int(11) DEFAULT NULL,
  `idclient` int(11) DEFAULT NULL,
  `idservice` int(11) DEFAULT NULL,
  PRIMARY KEY (`idbooking`),
  KEY `idmaster_idx` (`idmaster`),
  KEY `idclient_idx` (`idclient`),
  KEY `idservice_idx` (`idservice`),
  CONSTRAINT `idclient` FOREIGN KEY (`idclient`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idmaster` FOREIGN KEY (`idmaster`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idservice` FOREIGN KEY (`idservice`) REFERENCES `service` (`idservice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;