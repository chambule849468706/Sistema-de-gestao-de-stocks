-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Abr-2021 às 16:38
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestao_stock`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfornecedor`
--

CREATE TABLE `tbfornecedor` (
  `idFornecedor` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `decrisao` varchar(100) DEFAULT NULL,
  `telefone` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbfornecedor`
--

INSERT INTO `tbfornecedor` (`idFornecedor`, `nome`, `bairro`, `decrisao`, `telefone`) VALUES
(1, 'Antonio Fernando de Sousa', 'Venda de legumes e vegetais', 'Bairro de laulane', 876534534),
(2, 'Samuel Romano Ngulele', 'Venda de acessorios informaticos', 'Bairro de benfica', 861111111),
(3, 'Rogerio Mabunda', 'Venda de telefones', 'Bairro das mahotas', 871134251);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbgestor`
--

CREATE TABLE `tbgestor` (
  `idGestor` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `nomeUsuario` varchar(20) NOT NULL,
  `senha` varchar(8) NOT NULL,
  `bi` varchar(13) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `salario` float DEFAULT NULL,
  `telefone` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbgestor`
--

INSERT INTO `tbgestor` (`idGestor`, `nome`, `nomeUsuario`, `senha`, `bi`, `sexo`, `data_nascimento`, `salario`, `telefone`) VALUES
(1, 'Fabiao Andre Chambule', 'Chambule', '1234', '123456789123', 'M', '2000-04-05', 20000, 849468704);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbproduto`
--

CREATE TABLE `tbproduto` (
  `idProduto` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `preco` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbproduto`
--

INSERT INTO `tbproduto` (`idProduto`, `nome`, `preco`) VALUES
(4, 'Alface', 1000);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbstock`
--

CREATE TABLE `tbstock` (
  `id_fornecedor` int(11) DEFAULT NULL,
  `id_produto` int(11) DEFAULT NULL,
  `data_entrega` date DEFAULT NULL,
  `quantidade` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbstock`
--

INSERT INTO `tbstock` (`id_fornecedor`, `id_produto`, `data_entrega`, `quantidade`) VALUES
(1, 4, '2021-04-05', 1000);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbtrabalhador`
--

CREATE TABLE `tbtrabalhador` (
  `idTrabalhador` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `bi` varchar(13) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `id_gestor` int(11) DEFAULT NULL,
  `salario` float DEFAULT NULL,
  `telefone` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbtrabalhador`
--

INSERT INTO `tbtrabalhador` (`idTrabalhador`, `nome`, `bi`, `sexo`, `data_nascimento`, `id_gestor`, `salario`, `telefone`) VALUES
(1, '1', '1111111111111', 'M', '2021-04-16', NULL, 111, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbfornecedor`
--
ALTER TABLE `tbfornecedor`
  ADD PRIMARY KEY (`idFornecedor`);

--
-- Indexes for table `tbgestor`
--
ALTER TABLE `tbgestor`
  ADD PRIMARY KEY (`idGestor`);

--
-- Indexes for table `tbproduto`
--
ALTER TABLE `tbproduto`
  ADD PRIMARY KEY (`idProduto`);

--
-- Indexes for table `tbstock`
--
ALTER TABLE `tbstock`
  ADD KEY `id_fornecedor` (`id_fornecedor`),
  ADD KEY `id_produto` (`id_produto`);

--
-- Indexes for table `tbtrabalhador`
--
ALTER TABLE `tbtrabalhador`
  ADD PRIMARY KEY (`idTrabalhador`),
  ADD KEY `id_gestor` (`id_gestor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbfornecedor`
--
ALTER TABLE `tbfornecedor`
  MODIFY `idFornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbgestor`
--
ALTER TABLE `tbgestor`
  MODIFY `idGestor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbproduto`
--
ALTER TABLE `tbproduto`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbtrabalhador`
--
ALTER TABLE `tbtrabalhador`
  MODIFY `idTrabalhador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbstock`
--
ALTER TABLE `tbstock`
  ADD CONSTRAINT `tbstock_ibfk_1` FOREIGN KEY (`id_fornecedor`) REFERENCES `tbfornecedor` (`idFornecedor`),
  ADD CONSTRAINT `tbstock_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `tbproduto` (`idProduto`);

--
-- Limitadores para a tabela `tbtrabalhador`
--
ALTER TABLE `tbtrabalhador`
  ADD CONSTRAINT `tbtrabalhador_ibfk_1` FOREIGN KEY (`id_gestor`) REFERENCES `tbgestor` (`idGestor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
