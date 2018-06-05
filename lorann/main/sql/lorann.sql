-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Dim 03 Juin 2018 à 22:47
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--


CREATE DEFINER=`root`@`localhost` PROCEDURE `readMap1` ()  NO SQL
SELECT id, name
FROM map1
order by id;

CREATE DEFINER=`root`@`localhost` PROCEDURE `readMap2` ()  NO SQL
SELECT id, name
FROM map2
order by id;

CREATE DEFINER=`root`@`localhost` PROCEDURE `readMap3` ()  NO SQL
SELECT id, name
FROM map3
order by id;

CREATE DEFINER=`root`@`localhost` PROCEDURE `readMap4` ()  NO SQL
SELECT id, name
FROM map4
order by id;

CREATE DEFINER=`root`@`localhost` PROCEDURE `readMap5` ()  NO SQL
SELECT id, name
FROM map5
order by id;


DELIMITER ;
--
-- Structure de la table `map1`
--

CREATE TABLE `map1` (
  `ID` int(255) NOT NULL,
  `name` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `map1`
--

INSERT INTO `map1` (`ID`, `name`) VALUES
(1, 'bone hbone hbone bone hbone hbone hbone bone hbone gate hbone hbone hbone hbone hbone hbone hbone hbone hbone bone'),
(2, 'vbone monster1 void vbone void void void vbone void lorann void void void void void void monster2 void purse vbone'),
(3, 'vbone void void void void void void hbone void void void void void void void void bone hbone hbone bone'),
(4, 'vbone void void vbone void void void vbone void void void void void vbone void void vbone void void vbone'),
(5, 'vbone void hbone bone void void void void void void void void void vbone void void vbone void void vbone'),
(6, 'vbone void void vbone void void void void void void void bone hbone bone void void void void void vbone'),
(7, 'vbone void void void void void void void void void void vbone monster3 vbone void void void void hbone bone'),
(8, 'vbone void void void void void void void void vbone void vbone void vbone void void void void void vbone'),
(9, 'vbone void void vbone void void void void void vbone void void void vbone void void void void void vbone'),
(10, 'vbone void void bone hbone hbone void hbone hbone bone void void void void void bone hbone void void vbone'),
(11, 'vbone monster4 void void void void void void void void void void void void void vbone void void cball vbone'),
(12, 'bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone hbone hbone hbone bone');

-- --------------------------------------------------------

--
-- Structure de la table `map2`
--

CREATE TABLE `map2` (
  `ID` int(255) NOT NULL,
  `name` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `map2`
--

INSERT INTO `map2` (`ID`, `name`) VALUES
(1, 'bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone gate hbone hbone hbone hbone hbone hbone bone '),
(2, 'vbone void void void void void void purse void vbone void void lorann void void void void void void vbone '),
(3, 'bone hbone hbone hbone bone void void void void vbone cball void void monster1 void void void void void vbone '),
(4, 'vbone void void purse vbone void void void void bone hbone hbone hbone hbone hbone hbone hbone bone void bone '),
(5, 'vbone purse void void vbone void purse void void vbone void void void void purse void void void void vbone '),
(6, 'vbone void void void vbone void void void void bone void bone hbone hbone hbone hbone hbone hbone hbone bone '),
(7, 'vbone void void monster2 vbone monster3 void void void hbone void void void void purse void void void void vbone '),
(8, 'bone void bone hbone bone bone void bone hbone bone hbone hbone hbone hbone hbone hbone hbone bone void bone '),
(9, 'vbone void hbone purse void void void void void void void void void void void void void void void vbone '),
(10, 'vbone void bone void void void void void void bone void void void void void void void purse void vbone '),
(11, 'vbone void void void void monster4 void void void hbone void void purse void void void void void void vbone '),
(12, 'bone hbone hbone hbone hbone hbone hbone hbone hbone bone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone ');

-- --------------------------------------------------------

--
-- Structure de la table `map3`
--

CREATE TABLE `map3` (
  `ID` int(255) NOT NULL,
  `name` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `map3`
--

INSERT INTO `map3` (`ID`, `name`) VALUES
(1, 'bone hbone hbone bone hbone hbone hbone bone hbone hbone hbone hbone bone hbone hbone hbone hbone hbone hbone bone '),
(2, 'vbone lorann void void void void void bone void void void void bone void void void void void void vbone '),
(3, 'vbone void void void void void void void bone void void bone void void void void void void void vbone '),
(4, 'vbone void void bone monster2 void void void vbone void void vbone void void void monster3 bone void void vbone '),
(5, 'vbone void void vbone void void cball purse vbone void void vbone purse void void void vbone void void vbone '),
(6, 'vbone void void bone hbone hbone hbone hbone bone void void bone hbone hbone hbone hbone bone void void vbone '),
(7, 'vbone void void void void purse void void void void void void void void purse void void void void vbone '),
(8, 'vbone void bone bone void bone hbone hbone hbone hbone hbone hbone hbone hbone bone void bone bone void vbone '),
(9, 'vbone purse bone bone void vbone monster1 void void void void void void void vbone void bone bone purse vbone '),
(10, 'vbone void bone bone void bone hbone hbone bone void void bone hbone hbone bone void bone bone void vbone '),
(11, 'vbone void void purse void monster4 void void void void void void void void void void purse void void vbone '),
(12, 'bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone ');

-- --------------------------------------------------------

--
-- Structure de la table `map4`
--

CREATE TABLE `map4` (
  `ID` int(255) NOT NULL,
  `name` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `map4`
--

INSERT INTO `map4` (`ID`, `name`) VALUES
(1, 'bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone '),
(2, 'bone void void bone bone bone bone bone void bone void void void bone bone void void void bone bone '),
(3, 'bone void bone bone bone bone bone bone bone bone void bone void bone void bone bone void bone bone '),
(4, 'bone void bone bone bone void bone bone void bone void bone void bone void bone bone void bone bone '),
(5, 'bone void void bone bone void bone bone void bone void bone void bone void bone bone void bone bone '),
(6, 'bone void bone bone void bone void bone void bone void void void bone bone bone bone bone bone bone '),
(7, 'bone void bone bone bone void bone bone void bone void bone void bone bone void void bone bone bone '),
(8, 'bone void void bone void bone void bone void bone void bone void bone bone void void bone bone bone '),
(9, 'bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone bone '),
(10, 'bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone lorann bone '),
(11, 'vbone void void void void void void void void void cball void void void void void void void gate vbone '),
(12, 'bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone ');

-- --------------------------------------------------------

--
-- Structure de la table `map5`
--

CREATE TABLE `map5` (
  `ID` int(255) NOT NULL,
  `name` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `map5`
--

INSERT INTO `map5` (`ID`, `name`) VALUES
(1, 'bone hbone bone hbone hbone hbone hbone bone gate bone hbone hbone hbone hbone hbone hbone hbone bone hbone bone'),
(2, 'vbone monster1 void purse void void void void lorann bone void void void void void void void purse monster2 vbone'),
(3, 'bone hbone bone hbone bone hbone bone void bone purse bone hbone hbone hbone hbone bone void bone hbone bone'),
(4, 'vbone void void void vbone purse void void vbone void void void void void void vbone void void void vbone'),
(5, 'vbone void bone void vbone bone void bone bone hbone hbone hbone hbone bone void bone hbone bone void vbone'),
(6, 'vbone void vbone void vbone vbone void vbone void void void void void vbone void void void vbone void vbone'),
(7, 'vbone void vbone void vbone vbone void vbone void bone hbone bone void vbone void void void vbone void vbone'),
(8, 'vbone void vbone void bone bone void vbone void vbone void void void vbone void bone hbone bone void vbone'),
(9, 'vbone purse vbone void void void void vbone void bone void bone hbone bone void vbone void void void vbone'),
(10, 'bone hbone bone void bone hbone hbone bone void vbone void void void void void vbone void bone hbone bone'),
(11, 'vbone monster3 cball void void void void void void void void void void void void void void purse monster4 vbone'),
(12, 'bone hbone bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone hbone bone');

--
-- Index pour les tables exportées
--

-- Index pour la table `map1`
--
ALTER TABLE `map1`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `map2`
--
ALTER TABLE `map2`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `map3`
--
ALTER TABLE `map3`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `map4`
--
ALTER TABLE `map4`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `map5`
--
ALTER TABLE `map5`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables exportées
--
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
