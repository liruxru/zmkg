/*
Navicat MySQL Data Transfer

Source Server         : admin
Source Server Version : 50519
Source Host           : 127.0.0.1:3306
Source Database       : xyxmc

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2018-02-02 09:29:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for jinmei
-- ----------------------------
DROP TABLE IF EXISTS `jinmei`;
CREATE TABLE `jinmei` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `hui` double(11,2) DEFAULT NULL,
  `liu` double(11,2) DEFAULT NULL,
  `huifa` double(11,2) DEFAULT NULL,
  `zhishu` double(11,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jinmei
-- ----------------------------
INSERT INTO `jinmei` VALUES ('1', '最大值', '9.50', '1.28', '22.00', '78.00');
INSERT INTO `jinmei` VALUES ('2', '最小值', '8.00', '1.24', '20.00', '74.00');

-- ----------------------------
-- Table structure for yuanmei
-- ----------------------------
DROP TABLE IF EXISTS `yuanmei`;
CREATE TABLE `yuanmei` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `hui` double(11,2) DEFAULT NULL,
  `liu` double(11,2) DEFAULT NULL,
  `huifa` double(11,2) DEFAULT NULL,
  `zhishu` int(11) DEFAULT NULL,
  `huishou` double(11,2) DEFAULT NULL,
  `chengben` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yuanmei
-- ----------------------------
INSERT INTO `yuanmei` VALUES ('1', '中阳', '8.80', '1.22', '20.00', '85', '68.00', '800');
INSERT INTO `yuanmei` VALUES ('2', '韩家沿焦1', '2.30', '1.52', '28.29', '95', '92.00', '900');
INSERT INTO `yuanmei` VALUES ('3', '韩家沿焦2', '10.50', '1.56', '23.50', '50', '70.00', '800');
INSERT INTO `yuanmei` VALUES ('4', '古交平定', '11.41', '0.50', '21.96', '83', '63.00', '1000');
INSERT INTO `yuanmei` VALUES ('5', '刘义配焦1', '10.20', '1.25', '26.76', '0', '56.00', '1000');
INSERT INTO `yuanmei` VALUES ('6', '刘义配焦2', '13.63', '1.83', '26.56', '0', '49.20', '700');
INSERT INTO `yuanmei` VALUES ('8', '槐安', '9.00', '1.45', '15.00', '15', '55.00', '600');
INSERT INTO `yuanmei` VALUES ('9', '宜管配焦展', '3.70', '0.97', '29.38', '31', '86.00', '86');
INSERT INTO `yuanmei` VALUES ('10', '辞凡沟9', '7.20', '1.60', '27.25', '96', '85.00', '1000');
INSERT INTO `yuanmei` VALUES ('11', '辞凡沟10', '7.80', '1.58', '25.00', '91', '78.00', '900');
INSERT INTO `yuanmei` VALUES ('12', '辞凡沟11', '9.62', '1.30', '23.00', '84', '75.00', '910');
INSERT INTO `yuanmei` VALUES ('13', '辞凡沟11+', '13.52', '1.10', '22.71', '77', '67.08', '880');
INSERT INTO `yuanmei` VALUES ('14', '高焦1A', '7.80', '1.73', '25.70', '97', '83.00', '1000');
INSERT INTO `yuanmei` VALUES ('15', '韩家沿配焦', '6.68', '1.45', '27.56', '0', '82.00', '950');
INSERT INTO `yuanmei` VALUES ('16', '店坪', '12.38', '0.72', '16.36', '60', '66.90', '980');
INSERT INTO `yuanmei` VALUES ('17', '宜管武焦二', '9.41', '1.35', '24.05', '91', '75.00', '1000');
INSERT INTO `yuanmei` VALUES ('18', '水峪矿', '8.74', '2.32', '18.21', '75', '54.00', '880');
INSERT INTO `yuanmei` VALUES ('19', '七虎焦二1', '8.16', '1.36', '26.01', '56', '0.00', '970');
INSERT INTO `yuanmei` VALUES ('20', '七虎焦二2', '11.84', '1.20', '22.00', '69', '75.00', '990');
INSERT INTO `yuanmei` VALUES ('21', '东庄低硫', '9.28', '0.47', '15.08', '74', '52.48', '1000');
INSERT INTO `yuanmei` VALUES ('22', '东罗水洗', '8.25', '1.42', '29.20', '94', '88.00', '900');
