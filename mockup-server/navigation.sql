/*
Navicat MySQL Data Transfer

Source Server         : user
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : navigation

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-05-09 15:50:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_info
-- ----------------------------
DROP TABLE IF EXISTS `t_info`;
CREATE TABLE `t_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `t_begin` datetime DEFAULT NULL,
  `t_end` datetime DEFAULT NULL,
  `t_headname` varchar(255) DEFAULT NULL,
  `t_save` bigint(20) DEFAULT NULL,
  `t_title_name` varchar(255) DEFAULT NULL,
  `t_resouce` varchar(255) DEFAULT NULL,
  `t_navmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6yewi8fg0pw77ddrtxrna6q9n` (`t_navmainid`),
  CONSTRAINT `FK6yewi8fg0pw77ddrtxrna6q9n` FOREIGN KEY (`t_navmainid`) REFERENCES `t_navigation` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_info
-- ----------------------------
INSERT INTO `t_info` VALUES ('1', '2019-05-02 00:00:00', '2019-05-02 00:00:00', '2.0版本', '1557285994056', '研发版本', '../2.0', '1');
INSERT INTO `t_info` VALUES ('2', '2017-11-01 00:00:00', '2017-12-31 00:00:00', '2.1版本', '1557286610489', '研发版本', '../2.1', '1');
INSERT INTO `t_info` VALUES ('3', '2018-02-01 00:00:00', '2018-04-30 00:00:00', '2.2版本', '1557287105649', '研发版本', '../2.2', '1');
INSERT INTO `t_info` VALUES ('4', '2018-05-01 00:00:00', '2018-06-30 00:00:00', '2.3版本', '1557292370961', '研发版本', '../2.3', '1');
INSERT INTO `t_info` VALUES ('5', '2018-11-01 00:00:00', '2019-01-31 00:00:00', ' 2.4版本', '1557292754415', '研发版本', ' ../2.4', '1');
INSERT INTO `t_info` VALUES ('6', '2018-12-01 00:00:00', '2019-01-30 00:00:00', ' 农信社web版1.1', '1557292978788', '研发版本', ' ../2.4', '1');
INSERT INTO `t_info` VALUES ('7', '2018-12-01 00:00:00', '2019-01-30 00:00:00', ' 企业账号V1.0版本', '1557293096365', '研发版本', ' ../2.4', '1');
INSERT INTO `t_info` VALUES ('8', '2019-04-01 00:00:00', '2019-04-30 00:00:00', ' 接送滚班V2.4.6', '1557293210491', '研发版本', ' ../2.4', '1');
INSERT INTO `t_info` VALUES ('9', '2019-01-01 00:00:00', '2019-01-30 00:00:00', ' 司机端优化版本V2.3.5', '1557293310519', '研发版本', ' ../2.4', '1');
INSERT INTO `t_info` VALUES ('10', '2019-03-01 00:00:00', '2019-04-30 00:00:00', ' 农行清分系统V1.0', '1557293416485', '研发版本', ' ../ABCpay', '1');
INSERT INTO `t_info` VALUES ('11', '2017-10-01 00:00:00', '2017-11-30 00:00:00', ' 2.0版本', '1557293890798', '产品中心', ' ../../chanpin/2.0', '2');
INSERT INTO `t_info` VALUES ('19', null, null, '2.1版本', '1557301930403', '产品中心', '../../chanpin/2.1', '2');
INSERT INTO `t_info` VALUES ('20', '2017-10-01 00:00:00', '2017-12-30 00:00:00', ' 2.0版本', '1557302125656', '票务中心', '../../piaowu/2.0', '3');
INSERT INTO `t_info` VALUES ('21', '2018-08-01 00:00:00', '2018-09-30 00:00:00', ' 2.1版本', '1557302373892', '票务中心', ' ../../piaowu/2.1', '3');
INSERT INTO `t_info` VALUES ('22', '2018-10-01 00:00:00', '2018-11-30 00:00:00', ' 2.2版本', '1557302476829', '票务中心', ' ../../piaowu/2.2', '3');
INSERT INTO `t_info` VALUES ('23', null, null, ' 2.0版本', '1557302953563', '监控中心', ' ../../jiankong/2.0', '4');
INSERT INTO `t_info` VALUES ('24', null, null, '2.1版本', '1557303120072', '监控中心', '../../jiankong/2.1/', '4');
INSERT INTO `t_info` VALUES ('25', null, null, ' 2.2版本', '1557303656699', '监控中心', ' ../../jiankong/2.2', '4');
INSERT INTO `t_info` VALUES ('26', '2017-11-01 00:00:00', '2017-12-31 00:00:00', ' 2.0版本', '1557303765118', '资源中心', ' ../../ziyuan/2.0', '5');
INSERT INTO `t_info` VALUES ('27', null, null, '2.1版本', '1557304096340', '资源中心', '../../ziyuan/2.1', '5');
INSERT INTO `t_info` VALUES ('28', null, null, ' 2.2版本', '1557304228631', '资源中心', ' ../../ziyuan/2.2', '5');
INSERT INTO `t_info` VALUES ('29', null, null, ' 2.3版本', '1557304305759', '资源中心', ' ../../ziyuan/2.3', '5');
INSERT INTO `t_info` VALUES ('30', null, null, ' 2.4版本', '1557304368071', '资源中心', ' ../../ziyuan/2.3', '5');
INSERT INTO `t_info` VALUES ('31', '2018-01-01 00:00:00', '2018-02-28 00:00:00', ' 1.0版本', '1557304509834', '服务质量管理', ' ../../quality/1.0', '6');
INSERT INTO `t_info` VALUES ('35', '2017-09-01 00:00:00', '2017-10-30 00:00:00', ' 2.0版本', '1557305850579', '易来客运APP', ' #', '7');
INSERT INTO `t_info` VALUES ('36', '2018-01-01 00:00:00', '2018-02-28 00:00:00', ' 2.1版本', '1557305963034', '易来客运APP', ' ../../app/2.1', '7');
INSERT INTO `t_info` VALUES ('37', '2018-07-20 00:00:00', null, ' 2.2版本', '1557306070532', '易来客运APP', '../../app/2.2', '7');
INSERT INTO `t_info` VALUES ('38', null, null, '2.0版本', '1557306259100', '驾驶端APP', '../../app/2.0', '8');
INSERT INTO `t_info` VALUES ('39', null, null, ' 2.1版本', '1557306338477', '驾驶端APP', ' ../../app/2.1', '8');
INSERT INTO `t_info` VALUES ('40', null, null, ' 2.0版本', '1557306458093', '微信', ' #', '9');
INSERT INTO `t_info` VALUES ('41', '2017-12-01 00:00:00', '2018-01-31 00:00:00', ' 1.0版本', '1557306604311', '微信小程序', ' ../../small/1.0', '10');
INSERT INTO `t_info` VALUES ('42', null, null, ' 1.1版本', '1557306843912', '微信小程序', '#', '10');
INSERT INTO `t_info` VALUES ('43', null, null, ' 2.0版本', '1557307296449', '官网', ' ../../app/web/2.0', '11');
INSERT INTO `t_info` VALUES ('44', null, null, ' 2.0版本', '1557307427121', '系统相关', ' ../../system/2.0', '12');

-- ----------------------------
-- Table structure for t_mainnames
-- ----------------------------
DROP TABLE IF EXISTS `t_mainnames`;
CREATE TABLE `t_mainnames` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `t_mainname` varchar(255) DEFAULT NULL,
  `t_mainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK92rd2ismb5xpf01iagi6lngw` (`t_mainid`),
  CONSTRAINT `FK92rd2ismb5xpf01iagi6lngw` FOREIGN KEY (`t_mainid`) REFERENCES `t_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_mainnames
-- ----------------------------
INSERT INTO `t_mainnames` VALUES ('1', '易来客运APPUI改版', '1');
INSERT INTO `t_mainnames` VALUES ('2', ' 后台app内容配置优化', '1');
INSERT INTO `t_mainnames` VALUES ('3', '直通车/接送机产品配置优化', '1');
INSERT INTO `t_mainnames` VALUES ('4', '资源中心：车辆资源、驾驶员资源、可用资源', '2');
INSERT INTO `t_mainnames` VALUES ('5', ' 异常流程完善： 后台可在任何时间退订订单； 驾驶员可主动取消载客异常', '2');
INSERT INTO `t_mainnames` VALUES ('6', ' 后台app内容配置优化', '2');
INSERT INTO `t_mainnames` VALUES ('7', '自由拼车保险销售支撑', '3');
INSERT INTO `t_mainnames` VALUES ('8', ' 定位不准优化', '3');
INSERT INTO `t_mainnames` VALUES ('9', '接送机产品升级', '4');
INSERT INTO `t_mainnames` VALUES ('10', ' 运管需求池需求集中处理', '4');
INSERT INTO `t_mainnames` VALUES ('11', ' 城际专车乘车票相关', '4');
INSERT INTO `t_mainnames` VALUES ('12', ' 区域管理优化', '4');
INSERT INTO `t_mainnames` VALUES ('13', ' 订单中心2.0迁移', '5');
INSERT INTO `t_mainnames` VALUES ('14', ' 财务中心2.0迁移', '5');
INSERT INTO `t_mainnames` VALUES ('15', ' 产品中心2.4（服务类产品）', '5');
INSERT INTO `t_mainnames` VALUES ('16', ' 票务中心2.4', '5');
INSERT INTO `t_mainnames` VALUES ('17', ' app前端3.0', '5');
INSERT INTO `t_mainnames` VALUES ('18', ' 农信社web版1.1', '6');
INSERT INTO `t_mainnames` VALUES ('19', ' 企业账号V1.0版本', '7');
INSERT INTO `t_mainnames` VALUES ('20', ' 接送滚班V2.4.6', '8');
INSERT INTO `t_mainnames` VALUES ('21', ' 司机端优化版本V2.3.5', '9');
INSERT INTO `t_mainnames` VALUES ('22', ' 农行清分系统V1.0', '10');
INSERT INTO `t_mainnames` VALUES ('23', ' 城际专车产品库', '11');
INSERT INTO `t_mainnames` VALUES ('24', ' 新增城际专车产品配置', '11');
INSERT INTO `t_mainnames` VALUES ('25', ' 城际专车增加线路管理', '11');
INSERT INTO `t_mainnames` VALUES ('26', ' 新增滚动班次', '11');
INSERT INTO `t_mainnames` VALUES ('27', '2.0后台升级', '20');
INSERT INTO `t_mainnames` VALUES ('28', ' 增加共享班次', '21');
INSERT INTO `t_mainnames` VALUES ('29', ' 增加班次管理与班次关联', '22');
INSERT INTO `t_mainnames` VALUES ('30', ' 增加直通车票务计划与在售管理', '22');
INSERT INTO `t_mainnames` VALUES ('31', ' 调整城际专车单独票务', '22');
INSERT INTO `t_mainnames` VALUES ('32', ' 优化票务计划界面UE', '22');
INSERT INTO `t_mainnames` VALUES ('33', '运营监控', '23');
INSERT INTO `t_mainnames` VALUES ('34', ' 增补包车监控', '24');
INSERT INTO `t_mainnames` VALUES ('35', ' 其他监控优化', '24');
INSERT INTO `t_mainnames` VALUES ('36', ' 车辆资源查询', '26');
INSERT INTO `t_mainnames` VALUES ('37', ' 驾驶员资源查询', '26');
INSERT INTO `t_mainnames` VALUES ('38', '驾驶员资源查询优化', '27');
INSERT INTO `t_mainnames` VALUES ('39', ' 车辆资源查询优化', '27');
INSERT INTO `t_mainnames` VALUES ('40', ' 新增可用资源管理：车辆与驾驶员', '28');
INSERT INTO `t_mainnames` VALUES ('41', ' 新增车辆当月详情', '28');
INSERT INTO `t_mainnames` VALUES ('42', ' 新增驾驶员当月详情', '28');
INSERT INTO `t_mainnames` VALUES ('43', ' 优化资源查询：昨日休息与早班返回', '28');
INSERT INTO `t_mainnames` VALUES ('44', ' 车辆资源优化', '29');
INSERT INTO `t_mainnames` VALUES ('45', ' 驾驶员资源优化', '29');
INSERT INTO `t_mainnames` VALUES ('46', ' 资源预测', '30');
INSERT INTO `t_mainnames` VALUES ('47', ' 服务质量管理基础版本', '31');
INSERT INTO `t_mainnames` VALUES ('48', ' 易来客运APPUI改版', '35');
INSERT INTO `t_mainnames` VALUES ('49', ' 直通车/接送机产品配置优化', '35');
INSERT INTO `t_mainnames` VALUES ('50', ' 后台app内容配置优化', '35');
INSERT INTO `t_mainnames` VALUES ('51', ' 订单列表页、优惠券页面、直通车订单详情页、直通车产品详情页、直通车产品列表页优化', '36');
INSERT INTO `t_mainnames` VALUES ('52', ' 推荐点显示优化', '36');
INSERT INTO `t_mainnames` VALUES ('53', ' 分享行程优化', '36');
INSERT INTO `t_mainnames` VALUES ('54', ' UE交互效果调整', '36');
INSERT INTO `t_mainnames` VALUES ('55', ' 各种bug修复及细节调整', '36');
INSERT INTO `t_mainnames` VALUES ('56', ' 埋点', '37');
INSERT INTO `t_mainnames` VALUES ('57', ' 推荐点优化', '37');
INSERT INTO `t_mainnames` VALUES ('58', ' 分享行程优化', '37');
INSERT INTO `t_mainnames` VALUES ('59', ' UE交互效果调整', '37');
INSERT INTO `t_mainnames` VALUES ('60', '购买城际专车票务', '41');
INSERT INTO `t_mainnames` VALUES ('61', ' 退订城际专车票务', '41');
INSERT INTO `t_mainnames` VALUES ('62', ' 查看订单', '41');
INSERT INTO `t_mainnames` VALUES ('63', ' 订单跟踪通知', '41');
INSERT INTO `t_mainnames` VALUES ('64', ' 暂无版本更新', '43');

-- ----------------------------
-- Table structure for t_navigation
-- ----------------------------
DROP TABLE IF EXISTS `t_navigation`;
CREATE TABLE `t_navigation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_navigation
-- ----------------------------
INSERT INTO `t_navigation` VALUES ('1', '研发版本');
INSERT INTO `t_navigation` VALUES ('2', '产品中心');
INSERT INTO `t_navigation` VALUES ('3', '票务中心');
INSERT INTO `t_navigation` VALUES ('4', '监控中心');
INSERT INTO `t_navigation` VALUES ('5', '资源中心');
INSERT INTO `t_navigation` VALUES ('6', '服务质量管理');
INSERT INTO `t_navigation` VALUES ('7', '易来客运APP');
INSERT INTO `t_navigation` VALUES ('8', '驾驶端APP');
INSERT INTO `t_navigation` VALUES ('9', '微信');
INSERT INTO `t_navigation` VALUES ('10', '微信小程序');
INSERT INTO `t_navigation` VALUES ('11', '官网');
INSERT INTO `t_navigation` VALUES ('12', '系统相关');

-- ----------------------------
-- Table structure for t_navigation_main_info_entity
-- ----------------------------
DROP TABLE IF EXISTS `t_navigation_main_info_entity`;
CREATE TABLE `t_navigation_main_info_entity` (
  `navigation_entity_id` int(11) NOT NULL,
  `main_info_entity_id` int(11) NOT NULL,
  UNIQUE KEY `UK_hge9gntb56upa2jjg4dav23s5` (`main_info_entity_id`),
  KEY `FK1q1g9404pjjalmugft7rxghod` (`navigation_entity_id`),
  CONSTRAINT `FK1q1g9404pjjalmugft7rxghod` FOREIGN KEY (`navigation_entity_id`) REFERENCES `t_navigation` (`id`),
  CONSTRAINT `FKk0m052cutiweeht956p2btdb0` FOREIGN KEY (`main_info_entity_id`) REFERENCES `t_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_navigation_main_info_entity
-- ----------------------------

-- ----------------------------
-- Table structure for t_varsiondes
-- ----------------------------
DROP TABLE IF EXISTS `t_varsiondes`;
CREATE TABLE `t_varsiondes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `t_des` varchar(255) DEFAULT NULL,
  `t_verid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfeqv8rxwr6vgc8fymewaoob5v` (`t_verid`),
  CONSTRAINT `FKfeqv8rxwr6vgc8fymewaoob5v` FOREIGN KEY (`t_verid`) REFERENCES `t_version` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_varsiondes
-- ----------------------------
INSERT INTO `t_varsiondes` VALUES ('1', '滚动班次', '1');
INSERT INTO `t_varsiondes` VALUES ('2', '票务计划增加滚动班次', '1');
INSERT INTO `t_varsiondes` VALUES ('3', ' 调度增加应班计划', '1');
INSERT INTO `t_varsiondes` VALUES ('4', ' 增加今日滚动班次监控', '1');
INSERT INTO `t_varsiondes` VALUES ('5', ' 修改用户端滚动班次涉及页面与流程', '1');
INSERT INTO `t_varsiondes` VALUES ('6', ' 优化驾驶端用车计划', '1');
INSERT INTO `t_varsiondes` VALUES ('7', ' 增加驾驶端滚动班次派工单流程，增加应班与检票流程', '1');
INSERT INTO `t_varsiondes` VALUES ('8', ' 增加驾驶端滚动班次查看班次情况', '1');
INSERT INTO `t_varsiondes` VALUES ('9', '用户申请电子发票', '2');
INSERT INTO `t_varsiondes` VALUES ('10', ' 浮动价格', '3');
INSERT INTO `t_varsiondes` VALUES ('11', '去除春节皮肤', '3');
INSERT INTO `t_varsiondes` VALUES ('12', ' 在线排座', '4');
INSERT INTO `t_varsiondes` VALUES ('13', ' 自由拼车保险销售支撑', '5');
INSERT INTO `t_varsiondes` VALUES ('14', ' 前端优化', '5');
INSERT INTO `t_varsiondes` VALUES ('15', ' 定位不准优化电子发票优化', '6');
INSERT INTO `t_varsiondes` VALUES ('16', ' 用户评价分拆', '6');
INSERT INTO `t_varsiondes` VALUES ('17', ' 电子发票优化-分销相关', '7');
INSERT INTO `t_varsiondes` VALUES ('18', ' VDC作废派工单优化', '8');
INSERT INTO `t_varsiondes` VALUES ('19', ' 可作废自动调度单', '8');
INSERT INTO `t_varsiondes` VALUES ('20', ' 增加驾驶员查询条件与优化', '8');
INSERT INTO `t_varsiondes` VALUES ('21', ' 对开班次优化', '8');
INSERT INTO `t_varsiondes` VALUES ('22', ' 票务中心模块名称变更', '8');
INSERT INTO `t_varsiondes` VALUES ('23', ' 调整排序监控', '9');
INSERT INTO `t_varsiondes` VALUES ('24', ' 增加排序算法', '9');
INSERT INTO `t_varsiondes` VALUES ('25', ' 呼叫中心优化', '10');
INSERT INTO `t_varsiondes` VALUES ('26', '接送机产品升级', '11');
INSERT INTO `t_varsiondes` VALUES ('27', '新增app推荐产品', '11');
INSERT INTO `t_varsiondes` VALUES ('28', ' APP增加新手引导', '12');
INSERT INTO `t_varsiondes` VALUES ('29', ' 共享班次库存', '13');
INSERT INTO `t_varsiondes` VALUES ('30', ' 区域管理优化', '14');
INSERT INTO `t_varsiondes` VALUES ('31', ' 包车产品迁移', '14');
INSERT INTO `t_varsiondes` VALUES ('32', ' 专车线路管理优化', '14');
INSERT INTO `t_varsiondes` VALUES ('33', ' 增加服务类别管理：为订单中心优化做准备', '14');
INSERT INTO `t_varsiondes` VALUES ('34', ' 留座选座排座需求', '15');
INSERT INTO `t_varsiondes` VALUES ('35', ' 人工标记处VIP用户优化', '15');
INSERT INTO `t_varsiondes` VALUES ('36', ' 订单中心2.0', '16');
INSERT INTO `t_varsiondes` VALUES ('37', ' 财务中心2.0', '16');
INSERT INTO `t_varsiondes` VALUES ('38', ' 票务中心2.4', '16');
INSERT INTO `t_varsiondes` VALUES ('39', ' 产品中心2.4', '16');
INSERT INTO `t_varsiondes` VALUES ('40', ' ', '17');
INSERT INTO `t_varsiondes` VALUES ('41', ' ', '18');
INSERT INTO `t_varsiondes` VALUES ('42', ' 新增订单详情', '19');
INSERT INTO `t_varsiondes` VALUES ('43', ' 取消下单界面优惠抵扣入口', '19');
INSERT INTO `t_varsiondes` VALUES ('44', ' 企业用户注册', '20');
INSERT INTO `t_varsiondes` VALUES ('45', ' 企业用户管理充值', '20');
INSERT INTO `t_varsiondes` VALUES ('46', ' 企业用户开票', '20');
INSERT INTO `t_varsiondes` VALUES ('47', ' 企业用户乘车下单支付', '20');
INSERT INTO `t_varsiondes` VALUES ('48', ' 票务模板增加类型', '21');
INSERT INTO `t_varsiondes` VALUES ('49', ' VDC新增接送滚班安排', '21');
INSERT INTO `t_varsiondes` VALUES ('50', ' 驾驶员调度', '21');
INSERT INTO `t_varsiondes` VALUES ('51', ' 自查清单', '22');
INSERT INTO `t_varsiondes` VALUES ('52', ' 司机端优化', '22');
INSERT INTO `t_varsiondes` VALUES ('53', ' 语音播报', '22');
INSERT INTO `t_varsiondes` VALUES ('54', ' 调整上下客顺序', '22');
INSERT INTO `t_varsiondes` VALUES ('55', ' 支付清分', '23');
INSERT INTO `t_varsiondes` VALUES ('56', ' 交易内转', '23');
INSERT INTO `t_varsiondes` VALUES ('57', ' 结算预付（出金交易)', '23');
INSERT INTO `t_varsiondes` VALUES ('58', ' 采购单新增驾驶员字段', '23');
INSERT INTO `t_varsiondes` VALUES ('59', ' 实现驾驶员单独结算', '23');
INSERT INTO `t_varsiondes` VALUES ('60', ' 城际产品优化', '24');
INSERT INTO `t_varsiondes` VALUES ('61', ' 新增城际专车产品配置', '24');
INSERT INTO `t_varsiondes` VALUES ('62', ' 城际专车增加线路管理', '24');
INSERT INTO `t_varsiondes` VALUES ('63', ' 城际专车滚动班次类型：', '25');
INSERT INTO `t_varsiondes` VALUES ('64', ' 票务计划增加滚动班次', '25');
INSERT INTO `t_varsiondes` VALUES ('65', ' 调度增加应班计划', '25');
INSERT INTO `t_varsiondes` VALUES ('66', ' 增加今日滚动班次监控', '25');
INSERT INTO `t_varsiondes` VALUES ('67', ' 修改用户端滚动班次涉及页面与流程', '25');
INSERT INTO `t_varsiondes` VALUES ('68', ' 优化驾驶端用车计划', '25');
INSERT INTO `t_varsiondes` VALUES ('69', ' 增加驾驶端滚动班次派工单流程，增加应班与检票流程', '25');
INSERT INTO `t_varsiondes` VALUES ('70', ' 增加驾驶端滚动班次查看班次情况', '25');
INSERT INTO `t_varsiondes` VALUES ('84', '专车票务计划，专车在售计划', '42');
INSERT INTO `t_varsiondes` VALUES ('85', ' 2.0上线后优化', '43');
INSERT INTO `t_varsiondes` VALUES ('86', ' 共享班次Beta0.1版', '44');
INSERT INTO `t_varsiondes` VALUES ('87', ' 调整城际专车单独票务', '45');
INSERT INTO `t_varsiondes` VALUES ('88', ' 优化票务计划界面UE', '45');
INSERT INTO `t_varsiondes` VALUES ('89', '监控2.1', '47');
INSERT INTO `t_varsiondes` VALUES ('90', ' 车辆资源查询', '49');
INSERT INTO `t_varsiondes` VALUES ('91', ' 驾驶员资源查询', '49');
INSERT INTO `t_varsiondes` VALUES ('92', '', '50');
INSERT INTO `t_varsiondes` VALUES ('93', ' ', '51');
INSERT INTO `t_varsiondes` VALUES ('94', ' ', '54');
INSERT INTO `t_varsiondes` VALUES ('95', '服务质量管理1.0', '56');
INSERT INTO `t_varsiondes` VALUES ('97', '	UE优化', '69');
INSERT INTO `t_varsiondes` VALUES ('98', ' 其他调整', '69');
INSERT INTO `t_varsiondes` VALUES ('99', '', '71');
INSERT INTO `t_varsiondes` VALUES ('101', '购票、退订、订单、跟踪通知', '81');
INSERT INTO `t_varsiondes` VALUES ('102', ' ', '82');
INSERT INTO `t_varsiondes` VALUES ('103', ' ', '83');
INSERT INTO `t_varsiondes` VALUES ('104', ' ', '84');
INSERT INTO `t_varsiondes` VALUES ('105', ' ', '85');
INSERT INTO `t_varsiondes` VALUES ('106', ' ', '86');
INSERT INTO `t_varsiondes` VALUES ('107', ' ', '87');

-- ----------------------------
-- Table structure for t_version
-- ----------------------------
DROP TABLE IF EXISTS `t_version`;
CREATE TABLE `t_version` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `t_url` varchar(255) DEFAULT NULL,
  `t_vdate` datetime DEFAULT NULL,
  `t_vname` varchar(255) DEFAULT NULL,
  `t_vid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdntkv9h735uyat8ssr5dcnkn0` (`t_vid`),
  CONSTRAINT `FKdntkv9h735uyat8ssr5dcnkn0` FOREIGN KEY (`t_vid`) REFERENCES `t_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_version
-- ----------------------------
INSERT INTO `t_version` VALUES ('1', '../chanpin/gundong', '2018-01-22 00:00:00', '2.1.0', '2');
INSERT INTO `t_version` VALUES ('2', '#', '2018-02-07 00:00:00', '2.1.1', '2');
INSERT INTO `t_version` VALUES ('3', ' #', '2018-02-09 00:00:00', ' 2.1.2', '2');
INSERT INTO `t_version` VALUES ('4', ' #', '2018-03-12 00:00:00', ' 2.1.3', '2');
INSERT INTO `t_version` VALUES ('5', '../2.2/2.2.0', '2018-05-31 00:00:00', ' 2.2.0', '3');
INSERT INTO `t_version` VALUES ('6', ' ../2.2/2.2.1', '2018-06-21 00:00:00', ' 2.2.1', '3');
INSERT INTO `t_version` VALUES ('7', ' ../2.2/2.2.2', '2018-06-29 00:00:00', ' 2.2.2', '3');
INSERT INTO `t_version` VALUES ('8', ' ../2.2/2.2.3', '2018-07-24 00:00:00', ' 2.2.3', '3');
INSERT INTO `t_version` VALUES ('9', ' ../2.2/2.2.4', '2018-07-13 00:00:00', ' 排序优化2.1', '3');
INSERT INTO `t_version` VALUES ('10', '../2.2/hujiao1.1/output_html', '2018-08-21 00:00:00', ' 呼叫中心1.1', '3');
INSERT INTO `t_version` VALUES ('11', '../2.3/2.3.0', '2018-08-29 00:00:00', '2.3.0', '4');
INSERT INTO `t_version` VALUES ('12', ' ../2.3/2.3.1', '2018-09-07 00:00:00', ' 2.3.1', '4');
INSERT INTO `t_version` VALUES ('13', ' ../piaowu/2.1', '2018-09-10 00:00:00', ' 2.3.2', '4');
INSERT INTO `t_version` VALUES ('14', ' ../2.3/2.3.3', '2018-10-08 00:00:00', ' 2.3.3', '4');
INSERT INTO `t_version` VALUES ('15', ' ../2.3/2.3.4', '2018-11-15 00:00:00', ' 2.3.4', '4');
INSERT INTO `t_version` VALUES ('16', ' ../2.4/2.4.0', '2019-03-01 00:00:00', ' 2.4.0', '5');
INSERT INTO `t_version` VALUES ('17', ' ../2.4/2.4.0/#p=前端&g=1', '2019-03-01 00:00:00', ' app3.0.0', '5');
INSERT INTO `t_version` VALUES ('18', ' ../small/1.0/#g=1&p=小程序', '2019-03-01 00:00:00', ' 小程序 3.0.0', '5');
INSERT INTO `t_version` VALUES ('19', ' ../h5城际专车下单/web1.1/index.html#g=1&p=新增订单详情', '2019-01-01 00:00:00', ' 农信社web版1.1', '6');
INSERT INTO `t_version` VALUES ('20', ' ../易来企业版/易来企业版V1.0/index.html#g=1&p=登录', '2019-01-31 00:00:00', ' 企业账号V1.0版本', '7');
INSERT INTO `t_version` VALUES ('21', ' ../2.4/2.4.6接送滚班', '2019-05-30 00:00:00', ' 接送滚班', '8');
INSERT INTO `t_version` VALUES ('22', ' ../司机端/2.3.5/#g=1&p=司机端优化', '2019-02-01 00:00:00', ' 司机端优化版本V2.3.5', '9');
INSERT INTO `t_version` VALUES ('23', ' ../ABCpay', '2019-04-30 00:00:00', ' 农行清分系统V1.0', '10');
INSERT INTO `t_version` VALUES ('24', ' ../../chanpin/2.0', '2017-12-04 00:00:00', ' 2.0.0', '11');
INSERT INTO `t_version` VALUES ('25', ' ../../chanpin/gundong', '2017-12-01 00:00:00', ' 2.0.1', '11');
INSERT INTO `t_version` VALUES ('37', '#', null, '2.0.2', '11');
INSERT INTO `t_version` VALUES ('38', '#', null, '2.1.0', '19');
INSERT INTO `t_version` VALUES ('39', '#', null, ' 2.1.1', '19');
INSERT INTO `t_version` VALUES ('40', '#', null, ' 2.1.2', '19');
INSERT INTO `t_version` VALUES ('41', '#', null, ' 2.1.4', '19');
INSERT INTO `t_version` VALUES ('42', ' #', '2018-01-08 00:00:00', ' 2.0.0', '20');
INSERT INTO `t_version` VALUES ('43', ' ../../piaowu/2.0', null, ' 2.0.1', '20');
INSERT INTO `t_version` VALUES ('44', ' ../../piaowu/2.1', null, ' 2.1.0', '21');
INSERT INTO `t_version` VALUES ('45', ' #', null, ' 2.2.0', '22');
INSERT INTO `t_version` VALUES ('46', ' #', '2018-08-15 00:00:00', ' 2.0.0', '23');
INSERT INTO `t_version` VALUES ('47', '#', '2017-10-31 00:00:00', '2.1.0', '24');
INSERT INTO `t_version` VALUES ('48', ' ../../jiankong/2.2', null, ' 2.2.0', '25');
INSERT INTO `t_version` VALUES ('49', ' ../../ziyuan/2.0', '2017-11-30 00:00:00', ' 2.0.0', '26');
INSERT INTO `t_version` VALUES ('50', '#', '2017-12-30 00:00:00', '2.0.1', '26');
INSERT INTO `t_version` VALUES ('51', ' #', null, ' 2.0.2', '26');
INSERT INTO `t_version` VALUES ('52', ' ../../ziyuan/2.2', null, ' 2.1.0', '27');
INSERT INTO `t_version` VALUES ('53', ' ../../ziyuan/2.2', null, ' 2.2.0', '28');
INSERT INTO `t_version` VALUES ('54', ' ../../ziyuan/2.3', null, ' 2.3.0', '29');
INSERT INTO `t_version` VALUES ('55', ' ../../ziyuan/2.3', null, ' 2.4.0', '30');
INSERT INTO `t_version` VALUES ('56', ' ../../quality/1.0', null, ' 1.0.0', '31');
INSERT INTO `t_version` VALUES ('57', '../../quality/2.0', null, ' 2.0.0', '31');
INSERT INTO `t_version` VALUES ('58', '#', null, ' 2.0.1', '31');
INSERT INTO `t_version` VALUES ('66', ' #', null, ' 2.0.0', '35');
INSERT INTO `t_version` VALUES ('67', ' #', null, ' 2.0.1', '35');
INSERT INTO `t_version` VALUES ('68', ' ../../app/2.1', null, ' 2.1.0', '36');
INSERT INTO `t_version` VALUES ('69', ' ../../app/2.2/2.2.2', null, ' 2.2.2', '37');
INSERT INTO `t_version` VALUES ('70', ' ../../app/2.2/2.2.3', null, ' 2.2.3', '37');
INSERT INTO `t_version` VALUES ('71', '#', null, '2.0.0', '38');
INSERT INTO `t_version` VALUES ('72', '#', null, ' 2.0.1', '38');
INSERT INTO `t_version` VALUES ('73', ' #', null, ' 2.0.3', '38');
INSERT INTO `t_version` VALUES ('74', ' #', null, ' 2.1.0', '39');
INSERT INTO `t_version` VALUES ('75', '#', null, ' 2.1.1', '39');
INSERT INTO `t_version` VALUES ('76', '#', null, ' 2.1.2', '39');
INSERT INTO `t_version` VALUES ('77', ' #', null, ' 2.1.3', '39');
INSERT INTO `t_version` VALUES ('78', ' #', null, ' 2.0.0', '40');
INSERT INTO `t_version` VALUES ('79', ' #', null, ' 2.0.1', '40');
INSERT INTO `t_version` VALUES ('80', '#', null, ' 2.0.2', '40');
INSERT INTO `t_version` VALUES ('81', ' ../../small/1.0', '2018-01-15 00:00:00', ' 1.0.0', '41');
INSERT INTO `t_version` VALUES ('82', ' #', null, ' 1.0.1', '41');
INSERT INTO `t_version` VALUES ('83', ' #', null, ' 1.0.2', '41');
INSERT INTO `t_version` VALUES ('84', ' #', null, ' 1.1.0', '42');
INSERT INTO `t_version` VALUES ('85', ' #', null, ' 1.1.1', '42');
INSERT INTO `t_version` VALUES ('86', ' #', null, ' 1.1.2', '42');
INSERT INTO `t_version` VALUES ('87', ' #', null, ' 1.1.3', '42');
INSERT INTO `t_version` VALUES ('88', ' #', null, ' 2.0.0', '43');
INSERT INTO `t_version` VALUES ('89', ' #', null, ' 2.0.0', '44');
