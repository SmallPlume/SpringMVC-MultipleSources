/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : demo2

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-06-12 15:40:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `demo2`
-- ----------------------------
DROP TABLE IF EXISTS `demo2`;
CREATE TABLE `demo2` (
  `id` varchar(255) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo2
-- ----------------------------
INSERT INTO `demo2` VALUES ('1', '张三');
INSERT INTO `demo2` VALUES ('2', '李四');
INSERT INTO `demo2` VALUES ('3', '王五');
INSERT INTO `demo2` VALUES ('4', '老六');
