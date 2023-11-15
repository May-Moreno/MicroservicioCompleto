-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_springboot_pacientes
-- ------------------------------------------------------
-- Server version	8.0.15

CREATE SCHEMA IF NOT EXISTS `bd_springboot_pacientes` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
use bd_springboot_pacientes;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pacientes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `a_materno` varchar(255) DEFAULT NULL,
  `a_paterno` varchar(255) DEFAULT NULL,
  `caries` char(1) NOT NULL,
  `edad` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `estado_clinico` varchar(255) DEFAULT NULL,
  `first_date` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `sexo` char(1) NOT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `tratamiento` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (1,'Zara','Hez','S',22,'pasemeprofei@unach.mx','caries en premolar','2023-11-14','Sal','H','1234567890','extraccion'),(2,'Flores','Ramos','N',35,'novendoflores@unach.mx','mordida desfazada','2023-11-14','Armando','H','1234567890','ortodoncia'),(3,'Velasquez','Moreno','N',21,'pasemeprofei@unach.mx','mordida desfazada','2023-11-14','Mayra','F','1234567890','ortodoncia'),(4,'Herrera','Fuentes','S',29,'dontshockme@unach.mx','Muela con caries','2023-10-31','Empo Leon','H','1234567890','Extraccion');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-15 16:19:50
