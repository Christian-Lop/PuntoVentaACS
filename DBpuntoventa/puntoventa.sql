-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: puntoventa
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articulos`
--

DROP TABLE IF EXISTS `articulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articulos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `proveedor` varchar(45) NOT NULL,
  `ingresa` int NOT NULL,
  `descripcion` text NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulos`
--

LOCK TABLES `articulos` WRITE;
/*!40000 ALTER TABLE `articulos` DISABLE KEYS */;
INSERT INTO `articulos` VALUES (1,'784965','Laptops ASUS','ASUS',22,'GAMER',5000.00),(6,'458965','PRUEBA123','ARGOM',15,'AURICULARES ARGOM',50.00),(8,'415289','ordenador ASUS','ASUS',15,'ordenadores ASUS GAMER',7000.00);
/*!40000 ALTER TABLE `articulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `NIT` varchar(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `direccion_envio` varchar(200) NOT NULL,
  `telefono` int NOT NULL,
  `saldo` decimal(10,0) NOT NULL,
  `limite_credito` int NOT NULL,
  `descuento` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'95756116','Christian','San Rafael PC',54898684,1000,500,10),(4,'25364179','Fernando','GUATEMALA',12345678,400,700,30);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallespedidos`
--

DROP TABLE IF EXISTS `detallespedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallespedidos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo_articulo` varchar(45) NOT NULL,
  `nombre_articulo` varchar(45) NOT NULL,
  `cantidad` int NOT NULL,
  `precio` decimal(10,0) NOT NULL,
  `id_pedido` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`codigo_articulo`,`nombre_articulo`,`cantidad`,`precio`,`id_pedido`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallespedidos`
--

LOCK TABLES `detallespedidos` WRITE;
/*!40000 ALTER TABLE `detallespedidos` DISABLE KEYS */;
INSERT INTO `detallespedidos` VALUES (1,'415289','ordenador ASUS',5,7000,'1'),(2,'784965','Laptops ASUS',4,5000,'1'),(3,'415289','ordenador ASUS',5,7000,'7'),(4,'784965','Laptops ASUS',2,5000,'7'),(5,'415289','ordenador ASUS',2,7000,'8'),(6,'784965','Laptops ASUS',5,5000,'9'),(7,'415289','ordenador ASUS',5,7000,'9'),(8,'784965','Laptops ASUS',2,5000,'10'),(9,'784965','Laptops ASUS',3,5000,'11'),(10,'415289','ordenador ASUS',1,7000,'11'),(11,'415289','ordenador ASUS',2,7000,'12'),(12,'458965','PRUEBA123',3,50,'12'),(13,'784965','Laptops ASUS',5,5000,'12'),(14,'415289','ordenador ASUS',2,7000,'13'),(15,'458965','PRUEBA123',5,50,'13'),(16,'784965','Laptops ASUS',5,5000,'13'),(17,'415289','ordenador ASUS',2,7000,'14'),(18,'458965','PRUEBA123',5,50,'14'),(19,'784965','Laptops ASUS',5,5000,'14'),(20,'415289','ordenador ASUS',1,7000,'15'),(21,'458965','PRUEBA123',3,50,'15'),(22,'784965','Laptops ASUS',8,5000,'15'),(23,'415289','ordenador ASUS',3,7000,'16'),(24,'458965','PRUEBA123',1,50,'16'),(25,'784965','Laptops ASUS',5,5000,'16'),(26,'415289','ordenador ASUS',3,7000,'17'),(27,'458965','PRUEBA123',1,50,'18'),(28,'415289','ordenador ASUS',1,7000,'19'),(29,'458965','PRUEBA123',2,50,'20'),(30,'458965','PRUEBA123',2,50,'22'),(31,'784965','Laptops ASUS',5,5000,'22'),(32,'784965','Laptops ASUS',5,5000,'23'),(33,'458965','PRUEBA123',10,50,'23'),(34,'458965','PRUEBA123',3,50,'24'),(35,'784965','Laptops ASUS',15,5000,'24'),(36,'458965','PRUEBA123',10,50,'25'),(37,'784965','Laptops ASUS',5,5000,'25'),(38,'458965','PRUEBA123',2,50,'26'),(39,'784965','Laptops ASUS',3,5000,'26'),(40,'458965','PRUEBA123',5,50,'27'),(41,'784965','Laptops ASUS',10,5000,'27'),(42,'458965','PRUEBA123',2,50,'28'),(43,'458965','PRUEBA123',10,50,'29'),(44,'784965','Laptops ASUS',3,5000,'29');
/*!40000 ALTER TABLE `detallespedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fabrica`
--

DROP TABLE IF EXISTS `fabrica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fabrica` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `telefono` int NOT NULL,
  `direccion` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabrica`
--

LOCK TABLES `fabrica` WRITE;
/*!40000 ALTER TABLE `fabrica` DISABLE KEYS */;
INSERT INTO `fabrica` VALUES (1,'78451296','HP Guatemala',36528596,'Guatemala'),(4,'45859632','DELL Quetzaltenango',45781296,'Quetzaltenango'),(5,'12457896','ArgomTech',52419638,'Guatemala');
/*!40000 ALTER TABLE `fabrica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informacion`
--

DROP TABLE IF EXISTS `informacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `informacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `NIT` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` int NOT NULL,
  `direccion` text NOT NULL,
  `correo` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informacion`
--

LOCK TABLES `informacion` WRITE;
/*!40000 ALTER TABLE `informacion` DISABLE KEYS */;
INSERT INTO `informacion` VALUES (1,36567426,'SystemWeb',96852341,'San Rafael PC','SW@gmail.com');
/*!40000 ALTER TABLE `informacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `NIT_cliente` varchar(45) NOT NULL,
  `nombre_cliente` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `total` decimal(10,0) NOT NULL,
  `fecha_pedido` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,'25364179','Fernando','',0,NULL),(2,'25364179','Fernando','',0,NULL),(3,'25364179','Fernando','',0,NULL),(4,'95756116','Christian','',0,NULL),(5,'95756116','Christian','',5050,NULL),(6,'95756116','Christian','',12000,NULL),(7,'95756116','Christian','',12000,NULL),(8,'95756116','Christian','',7000,NULL),(9,'95756116','Christian','',12000,NULL),(10,'95756116','Christian','',5000,NULL),(11,'95756116','Christian','',12000,NULL),(12,'95756116','Christian','',12050,NULL),(13,'95756116','Christian','',12050,NULL),(14,'95756116','Christian','',12050,NULL),(15,'95756116','Christian','',12050,NULL),(16,'95756116','Christian','',12050,NULL),(17,'95756116','Christian','',7000,NULL),(18,'95756116','Christian','',50,NULL),(19,'95756116','Christian','',7000,NULL),(20,'25364179','Fernando','',50,NULL),(21,'','','',50,NULL),(22,'25364179','Fernando','',5050,NULL),(23,'25364179','Fernando','',5050,NULL),(24,'95756116','Christian','',5050,NULL),(25,'95756116','Christian','',5050,NULL),(26,'95756116','','',5050,NULL),(27,'95756116','Christian','',5050,NULL),(28,'95756116','Christian','',50,NULL),(29,'95756116','Christian','',5050,NULL);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `NIT` int NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `telefono` int NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `fabrica` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,7845126,'HP',12457896,'San marcos','HP Guatemala'),(2,7845965,'DELL',32659874,'Guatemala','DELL Quetzaltenango'),(3,78456,'HP',4568596,'Quetzaltenango','HP Guatemala'),(4,85963,'DELL',4596324,'Mazatenango','DELL Quetzaltenango'),(5,123545,'ARGOM',74859632,'San Marcos','ArgomTech');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'carlos','carlos@gmail.com','123456789'),(3,'Christian','chris@gmail.com','chris');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-19  2:43:09
