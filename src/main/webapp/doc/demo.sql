/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-06-12 15:40:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `demo1`
-- ----------------------------
DROP TABLE IF EXISTS `demo1`;
CREATE TABLE `demo1` (
  `id` varchar(255) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo1
-- ----------------------------
INSERT INTO `demo1` VALUES ('1', '张三');
INSERT INTO `demo1` VALUES ('2', '李四');

-- ----------------------------
-- Table structure for `user_`
-- ----------------------------
DROP TABLE IF EXISTS `user_`;
CREATE TABLE `user_` (
  `username_` varchar(20) NOT NULL,
  `password_` varchar(20) NOT NULL,
  `id_` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nickname_` varchar(20) NOT NULL,
  PRIMARY KEY (`id_`),
  UNIQUE KEY `username_` (`username_`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_
-- ----------------------------
INSERT INTO `user_` VALUES ('admin', 'password', '1', 'admin');
