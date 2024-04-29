CREATE TABLE `nft_head` (
  `id` bigint(20) unsigned NOT NULL COMMENT 'id',
  `title` varchar(100) NOT NULL COMMENT '标题',
  `file_url` varchar(100) NOT NULL COMMENT 'IPFS文件地址',
  `tag` varchar(100) NOT NULL COMMENT '标签',
  `price` decimal(10,0) NOT NULL COMMENT '价格',
  `issue_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已授权',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `nft_item` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `head_id` bigint(20) NOT NULL COMMENT '头表id',
  `author` varchar(100) NOT NULL COMMENT '作者',
  `desc` varchar(500) NOT NULL COMMENT '描述',
  `contract_address` varchar(100) NOT NULL COMMENT '合约地址',
  `authorized` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已授权',
  `to_address` varchar(100) DEFAULT NULL COMMENT '授权地址',
  `signature` varchar(300) DEFAULT NULL COMMENT '授权签名',
  `from_address` varchar(100) NOT NULL COMMENT '铸造人地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;