/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.0.24-community-nt : Database - crm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`crm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `crm`;

/*Table structure for table `activity` */

DROP TABLE IF EXISTS `activity`;

CREATE TABLE `activity` (
  `id` int(8) NOT NULL auto_increment COMMENT 'id主键',
  `no` varchar(17) character set gbk default NULL COMMENT '客户编号，外键——FK_no',
  `name` varchar(100) character set gbk NOT NULL COMMENT '客户名称',
  `date` datetime NOT NULL COMMENT '时间',
  `place` varchar(200) character set gbk NOT NULL COMMENT '地址',
  `title` varchar(500) character set gbk default NULL COMMENT '概要',
  `desc` varchar(2000) character set gbk NOT NULL COMMENT '详细',
  `memo` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`),
  KEY `fk_activity_customer` (`no`),
  CONSTRAINT `fk_activity_customer` FOREIGN KEY (`no`) REFERENCES `customer` (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交往记录';

/*Data for the table `activity` */

insert  into `activity`(`id`,`no`,`name`,`date`,`place`,`title`,`desc`,`memo`) values (1,'KH071202001','北京聪海信息科技有限公司','2010-04-21 08:00:00','友谊酒店','签订意向协议','此次合作意义重大','主办单位:计算机报社'),(2,'KH071202001','北京聪海信息科技有限公司','2011-10-20 10:59:07','公司','2008年行业展望座谈会','务必全员参加','主办单位:计算机报社'),(3,'KH071202001','北京聪海信息科技有限公司','2013-06-20 11:00:03','公司','	邀请到公司参观','请大家注意礼节','主办单位:计算机报社'),(4,'KH071202001','北京聪海信息科技有限公司','2018-10-21 08:00:00','终结之谷','为了友情而战',' 鸣人最终让佐助跑掉了','两个命中注定的对手');

/*Table structure for table `chance` */

DROP TABLE IF EXISTS `chance`;

CREATE TABLE `chance` (
  `id` int(8) NOT NULL auto_increment COMMENT '编号主键',
  `source` varchar(50) default NULL COMMENT '机会来源',
  `cust_name` varchar(100) NOT NULL COMMENT '客户名称',
  `title` varchar(200) NOT NULL COMMENT '概要',
  `rate` int(8) NOT NULL COMMENT '成功几率',
  `linkman` varchar(50) default NULL COMMENT '联系人',
  `tel` varchar(50) default NULL COMMENT '联系人电话',
  `desc` varchar(2000) NOT NULL COMMENT '机会描述',
  `create_id` int(8) NOT NULL COMMENT '创建人ID',
  `create_by` varchar(50) NOT NULL COMMENT '创建人',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `due_id` int(8) default NULL COMMENT '指派给ID',
  `due_to` varchar(50) default NULL COMMENT '指派给',
  `due_date` datetime default NULL COMMENT '指派时间',
  `status` int(5) NOT NULL COMMENT '状态：1--未指派；2--已指派；3--开发成功；4--终止开发',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chance` */

insert  into `chance`(`id`,`source`,`cust_name`,`title`,`rate`,`linkman`,`tel`,`desc`,`create_id`,`create_by`,`create_date`,`due_id`,`due_to`,`due_date`,`status`) values (1,'vergil','小栗旬','采购笔记本电脑意向',80,'刘先生','13729239239','不放过任何机会',1,'栗子','2018-08-08 22:06:33',3,'dmc','2018-10-15 09:25:11',2),(2,'devil','林诚司','买手机意向',88,'李先生','16859745321','把握现在',1,'栗子','2018-08-08 22:06:33',7,'琪琪','2018-10-25 22:11:23',2),(3,'dmc','黄大禾','生活用品',67,'黄先生','18579642314','无论是现在还是过去',1,'栗子','2018-10-02 12:21:35',NULL,NULL,NULL,1),(4,'shdfsfbuysf','芮登','尼尔瓦修',78,'张献忠','19638752634','自己的选择不要后悔',1,'栗子','2018-02-16 12:23:32',NULL,NULL,NULL,1),(5,'fetgdgfd','艾蕾卡','魔鬼鱼',90,'梅长苏','18965472314','长路漫漫唯剑作伴',1,'栗子','2018-04-05 12:23:56',6,'孙晓梅','2018-10-15 09:37:21',4),(6,'ydgfg','鲁路修','毁灭者',55,'龙裔','15869873654','爱自天际',1,'栗子','2018-06-15 12:27:56',NULL,NULL,NULL,4),(7,'珊瑚基质','维吉尔','阎魔刀',99,'恶魔','16325847963','别惹恶魔',1,'栗子','2018-08-08 12:30:26',NULL,NULL,NULL,1),(8,'naruto','lizheng','动漫爱好者',88,'天使','16953462314','孤独可以使人变得更强',1,'栗子','2018-10-04 15:05:22',NULL,NULL,NULL,1),(10,'bbbb','霍霍','bbb',33,'bbb','11334543','dskvjsbdhvbshvb',1,'刘颖','2018-10-12 15:53:34',4,'vergil','2019-01-03 14:43:04',1),(11,'天际','艾艾','爱之天际',78,'夜猫无心','113354451','阳光整合，从未如此稳定',1,'栗子','2018-10-14 14:14:50',NULL,NULL,NULL,1),(12,'aa','aaa','aaaa',77,'aaa','23123123','aaaaa',1,'栗子','2018-10-24 13:39:20',6,'孙晓梅','2018-10-24 13:42:01',2);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(5) NOT NULL auto_increment COMMENT '序号',
  `no` varchar(17) character set gbk NOT NULL COMMENT '客户编号主键',
  `name` varchar(100) character set gbk NOT NULL COMMENT '客户名称',
  `regin` varchar(50) character set gbk default NULL COMMENT '地区',
  `manager_id` int(8) default NULL COMMENT '客户经理编号 外键',
  `manager_name` varchar(50) character set gbk default NULL COMMENT '客户经理',
  `level` int(8) default NULL COMMENT '客户等级ID',
  `level_label` varchar(50) character set gbk default NULL COMMENT '客户等级',
  `satisfy` int(8) default NULL COMMENT '满意度',
  `credit` int(8) default NULL COMMENT '信用度',
  `addr` varchar(300) character set gbk default NULL COMMENT '地址',
  `zip` varchar(10) character set gbk default NULL COMMENT '邮编',
  `tel` varchar(50) character set gbk default NULL COMMENT '电话',
  `fax` varchar(50) character set gbk default NULL COMMENT '传真',
  `website` varchar(50) character set gbk default NULL COMMENT '网址',
  `licence` varchar(50) character set gbk default NULL COMMENT '营业执照注册号',
  `chieftain` varchar(50) character set gbk default NULL COMMENT '法人',
  `bankroll` int(8) default NULL COMMENT '注册资金',
  `turnover` int(8) default NULL COMMENT '营业额',
  `bank` varchar(200) character set gbk default NULL COMMENT '开户银行',
  `account` varchar(50) character set gbk default NULL COMMENT '银行账号',
  `tax` varchar(50) character set gbk default NULL COMMENT '地税登记号',
  `national` varchar(50) character set gbk default NULL COMMENT '国税登记号',
  `status` int(8) default NULL COMMENT '客户状态：1--正常；2--流失；3--删除',
  PRIMARY KEY  (`no`),
  KEY `fk_customer_user` (`manager_id`),
  KEY `id` (`id`),
  CONSTRAINT `fk_customer_user` FOREIGN KEY (`manager_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息表';

/*Data for the table `customer` */

insert  into `customer`(`id`,`no`,`name`,`regin`,`manager_id`,`manager_name`,`level`,`level_label`,`satisfy`,`credit`,`addr`,`zip`,`tel`,`fax`,`website`,`licence`,`chieftain`,`bankroll`,`turnover`,`bank`,`account`,`tax`,`national`,`status`) values (10,'KH071130003','北京大学','北京',9,'蜜蜜',5,'战略合作伙伴',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com',NULL,'聪颖',NULL,NULL,'北京银行 中关村支行','62258827238382838',NULL,NULL,1),(9,'KH071201001','青鸟无限数码','北京',3,'dmc',4,'合作伙伴',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com','123123','聪颖',123123,123123,'北京银行 中关村支行','62258827238382838','1231231','dwsa123',3),(8,'KH071201002','潍坊青鸟华光','华北',6,'孙晓梅',4,'合作伙伴',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com',NULL,'聪颖',NULL,NULL,'北京银行 中关村支行','62258827238382838',NULL,NULL,1),(7,'KH071201003','北京神光培训','北京',4,'vergil',3,'大客户',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com',NULL,'聪颖',NULL,NULL,'北京银行 中关村支行','62258827238382838',NULL,NULL,1),(6,'KH071201004','北京白羽有限责任公司','北京',5,'小明',1,'普通客户',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com',NULL,'聪颖',NULL,NULL,'北京银行 中关村支行','62258827238382838',NULL,NULL,1),(5,'KH071201005','北京天桥信息技术有限公司','北京',5,'小明',3,'大客户',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com',NULL,'聪颖',NULL,NULL,'北京银行 中关村支行','62258827238382838',NULL,NULL,1),(4,'KH071201006','云南天河烟草公司','中南',7,'琪琪',2,'重点开发客户',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com',NULL,'聪颖',NULL,NULL,'北京银行 中关村支行','62258827238382838',NULL,NULL,1),(3,'KH071201007','太阳药业','华北',6,'孙晓梅',2,'重点开发客户',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com','1212','聪颖',1212121,12121,'北京银行 中关村支行','62258827238382838','121212','5yrfdgdf',1),(2,'KH071201008','北京明科科技有限公司','北京',5,'小明',1,'普通客户',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com','A123','聪颖',500000,1000000,'北京银行 中关村支行','62258827238382838','b1233','a2211',1),(1,'KH071202001','北京聪海信息科技有限公司','北京',5,'小明',5,'战略合作伙伴',3,3,'北京市海淀区成府路702号','100027','010-62283393','010-62283396','www.conghai.com','121212','聪颖',121231,121212,'北京银行 中关村支行','62258827238382838','213123','123123',1);

/*Table structure for table `dict` */

DROP TABLE IF EXISTS `dict`;

CREATE TABLE `dict` (
  `id` int(8) NOT NULL auto_increment COMMENT '编号',
  `type` varchar(50) character set gbk NOT NULL COMMENT '类别',
  `item` varchar(50) character set gbk NOT NULL COMMENT '条目',
  `value` varchar(50) character set gbk NOT NULL COMMENT '值',
  `editable` int(2) NOT NULL COMMENT '是否可编辑|1-可以；0-不可以',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据字典';

/*Data for the table `dict` */

insert  into `dict`(`id`,`type`,`item`,`value`,`editable`) values (1,'企业客户等级','普通客户','1',0),(2,'企业客户等级','重点开发客户','2',0),(3,'企业客户等级','大客户','3',0),(4,'企业客户等级','合作伙伴','4',0),(5,'企业客户等级','战略合作伙伴','5',0),(6,'服务类型','咨询','咨询',0),(7,'服务类型','投诉','投诉',1),(8,'服务类型','建议','建议',1),(9,'地区','北京','1',1),(10,'地区','华北','2',1),(11,'地区','中南','3',1),(12,'地区','东北','4',1),(13,'地区','西部','5',1),(14,'aaa','aaa','aaa',0),(15,'bbb','bbb','bbb',0),(16,'aa','aa','aaa',1);

/*Table structure for table `line` */

DROP TABLE IF EXISTS `line`;

CREATE TABLE `line` (
  `id` int(8) NOT NULL auto_increment COMMENT 'ID主键',
  `order_id` int(8) NOT NULL COMMENT '订单编号，外键',
  `prod_id` int(8) NOT NULL COMMENT '产品编号，外键',
  `count` int(8) NOT NULL COMMENT '数量',
  `unit` varchar(10) default NULL COMMENT '单位',
  `price` double(9,2) default NULL COMMENT '单价',
  PRIMARY KEY  (`id`),
  KEY `fk_line_orders` (`order_id`),
  KEY `fk_line_product` (`prod_id`),
  CONSTRAINT `fk_line_orders` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `fk_line_product` FOREIGN KEY (`prod_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `line` */

insert  into `line`(`id`,`order_id`,`prod_id`,`count`,`unit`,`price`) values (1,1343445,1,2,'台',10800.00),(2,1343445,2,2,'台',16800.00),(3,1343443,7,2,'台',15800.00),(4,1343444,6,2,'台',16800.00),(5,1343446,5,2,'台',9800.00),(6,1343447,4,2,'台',360.00),(7,1343448,3,2,'台',7500.00),(8,1343449,1,2,'台',10800.00),(9,1343450,2,2,'台',16800.00),(10,1343451,3,3,'台',7500.00),(11,1343452,4,2,'台',360.00),(12,1343453,5,2,'台',9800.00),(13,1343454,6,2,'台',16800.00),(14,1343455,7,2,'台',15800.00),(15,1343456,1,3,'台',10800.00),(16,1343457,2,3,'台',16800.00),(17,1343458,3,3,'台',7500.00),(18,1343459,4,3,'台',360.00),(19,1343460,5,3,'台',9800.00),(20,1343461,6,3,'台',16800.00),(21,1343462,7,3,'台',15800.00),(22,1343463,1,4,'台',10800.00),(23,1343464,2,4,'台',16800.00),(24,1343465,3,4,'台',7500.00);

/*Table structure for table `linkman` */

DROP TABLE IF EXISTS `linkman`;

CREATE TABLE `linkman` (
  `id` int(8) NOT NULL auto_increment COMMENT '联系人编号主键',
  `cust_no` varchar(17) NOT NULL COMMENT '客户编号外键',
  `cust_name` varchar(100) default NULL COMMENT '客户名称',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `sex` varchar(5) default NULL COMMENT '性别',
  `postion` varchar(50) default NULL COMMENT '职位',
  `tel` varchar(50) NOT NULL COMMENT '办公电话',
  `mobile` varchar(50) default NULL COMMENT '手机',
  `memo` varchar(300) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `linkman` */

insert  into `linkman`(`id`,`cust_no`,`cust_name`,`name`,`sex`,`postion`,`tel`,`mobile`,`memo`) values (1,'KH071202001','北京聪海信息科技有限公司','沈聪林	','男','总经理	','010-68348438-668','13622883228','很少接电话'),(2,'KH071202001','北京聪海信息科技有限公司','杨影	','女','总经理助理','010-68348438-326','13748838283','助理是个切入点'),(3,'KH071202001','北京聪海信息科技有限公司','詹兆辉	','男','供销部经理	','010-68348438-520','13622883235','直接负责人'),(4,'KH071202001','北京聪海信息科技有限公司','玉玉','女','财务','010-12121233','1231231231','不需要感动，要心动'),(5,'KH071202008','北京明科科技有限公司','新八几','男','吐槽担当','010-23221','12232312','眼镜才是本体'),(6,'KH071202007','太阳药业','花花酱','女','秘书','010-21231','1224332423','负责安排工作'),(8,'KH071201008','北京明科科技有限公司','花仙子','女','销售部长A','010-21321123','13423332311','多联系，多沟通，不厌其烦'),(9,'KH071201008','北京明科科技有限公司','银桑','男','万事屋三人组老大','010-1254241','1243242222','万年废材男'),(10,'KH071201007','太阳药业','琪琪','女','会计','010-343','16457689023','个大V采购数据超过');

/*Table structure for table `lost` */

DROP TABLE IF EXISTS `lost`;

CREATE TABLE `lost` (
  `id` int(8) NOT NULL auto_increment COMMENT '编号主键',
  `no` varchar(17) NOT NULL COMMENT '客户编号--外键',
  `cust_name` varchar(100) default NULL COMMENT '客户名称',
  `manager_id` int(8) NOT NULL COMMENT '客户经理编号',
  `manager_name` varchar(50) NOT NULL COMMENT '客户经理名字',
  `order_date` datetime default NULL COMMENT '上次下单时间',
  `lost_date` datetime default NULL COMMENT '确认流失时间',
  `delay` varchar(50) default NULL COMMENT '暂缓措施',
  `reason` varchar(50) default NULL COMMENT '流失原因',
  `memo` varchar(300) NOT NULL COMMENT '状态 1-警告，2-暂缓流失，3-已经流失',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='联系人';

/*Data for the table `lost` */

insert  into `lost`(`id`,`no`,`cust_name`,`manager_id`,`manager_name`,`order_date`,`lost_date`,`delay`,`reason`,`memo`) values (1,'21313','阳光实业',11,'球球','2018-05-21 11:39:56','2018-10-03 11:40:03','打电话给客户了解不再购买本公司产品的原因。<br/>发送新产品目录给客户。<br/>','联系不够频繁，谈话没有切入要点','暂缓流失'),(2,'123123','光电无线',12,'火火','2018-10-15 10:11:16','2018-10-23 10:11:20','<br/>发送新产品目录给客户。<br/>','要多主动联系客户','警告'),(3,'32342','广电广播',13,'水水','2018-09-21 10:12:19','2018-10-16 10:12:25','厚着脸皮上把<br/>不要犹豫，拿起电话<br/>','人与人之间多一点信任','已经流失'),(4,'324234','电视剧吧',14,'音乐','2018-02-14 10:15:38','2018-10-15 10:15:44',NULL,'客户需要耐心','暂缓流失'),(5,'2131323','大空纶纺',15,'小满','2000-02-02 20:50:32','2006-06-25 20:51:27',NULL,'客户厂址迁移','已经流失'),(6,'xs21312','星星广告',16,'郭小美','2000-07-25 20:53:00','2007-07-25 20:52:00',NULL,'客户公司被收购','已经流失'),(7,'ce4335','和满记餐饮',17,'周结论','2009-02-25 20:54:37','2010-02-25 20:54:45',NULL,'没有采购需求','已经流失');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` int(8) NOT NULL auto_increment COMMENT '订单编号，主键',
  `customer` varchar(100) NOT NULL COMMENT '客户名称',
  `date` datetime NOT NULL COMMENT '日期',
  `addr` varchar(200) default NULL COMMENT '送货地址',
  `status` int(5) NOT NULL COMMENT '状态: 1-新创建；...；5-已发货；6-已回款。',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`id`,`customer`,`date`,`addr`,`status`) values (1343443,'北京聪海信息科技有限公司','2017-06-18 16:54:40','北京海淀区劳动路205号',2),(1343444,'北京聪海信息科技有限公司','2018-06-01 16:55:58','北京海淀区劳动路205号',6),(1343445,'北京聪海信息科技有限公司','2019-01-18 16:56:43','北京海淀区劳动路205号	',6),(1343446,'北京明科科技有限公司','2011-07-19 15:02:30','上海市黄浦区800弄',2),(1343447,'北京明科科技有限公司','2012-07-19 15:03:07','上海市闵行区三周花园',6),(1343448,'北京明科科技有限公司','2014-10-19 15:03:37','上海市浦东新区',6),(1343449,'太阳药业','2010-02-24 11:19:49','福州市闽侯县旗山',3),(1343450,'太阳药业','2011-10-24 11:20:40','厦门市集美大学',4),(1343451,'云南天河烟草公司','2011-02-24 11:21:37','云南省大理寺',5),(1343452,'云南天河烟草公司','2014-10-24 11:23:35','云南省丽江',1),(1343453,'北京天桥信息技术有限公司','2013-06-24 11:24:17','北京市丰台区大红门',2),(1343454,'北京天桥信息技术有限公司','2015-10-11 11:25:12','北京市门头沟',3),(1343455,'北京白羽有限责任公司','2013-02-24 11:25:54','北京市朝阳区',6),(1343456,'北京白羽有限责任公司','2013-08-24 11:26:46','北京市前门大街',1),(1343457,'北京神光培训','2011-10-24 11:27:26','北京市怀柔区',3),(1343458,'北京神光培训','2012-07-11 11:27:59','北京市三里屯',6),(1343459,'潍坊青鸟华光','2015-07-17 11:29:32','北京市公主坟',4),(1343460,'潍坊青鸟华光','2013-06-12 11:29:56','北京市海淀区',5),(1343461,'青鸟无限数码','2011-03-03 11:31:37','北京市东城区',1),(1343462,'青鸟无限数码','2009-12-02 11:31:58','北京市大兴区',2),(1343463,'北京大学','2011-03-04 11:32:44','北京市昌平区',6),(1343464,'北京大学','2013-11-02 11:33:13','北京市石景山',4),(1343465,'北京大学','2012-04-14 11:33:50','北京市西城区',6);

/*Table structure for table `plan` */

DROP TABLE IF EXISTS `plan`;

CREATE TABLE `plan` (
  `id` int(8) NOT NULL auto_increment COMMENT '计划编号',
  `chc_id` int(8) NOT NULL COMMENT '销售机会编号，外键',
  `date` datetime NOT NULL COMMENT '计划日期',
  `todo` varchar(500) NOT NULL COMMENT '计划项',
  `result` varchar(500) default NULL COMMENT '执行结果',
  PRIMARY KEY  (`id`),
  KEY `FK_PLAN_CHANCE` (`chc_id`),
  CONSTRAINT `FK_PLAN_CHANCE` FOREIGN KEY (`chc_id`) REFERENCES `chance` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `plan` */

insert  into `plan`(`id`,`chc_id`,`date`,`todo`,`result`) values (1,10,'2018-10-15 12:33:55','小栗旬初步接触，了解客户意向。','我的梦想是登上铃兰的顶点'),(2,10,'2018-10-16 09:42:07','推介产品。',NULL),(3,10,'2010-11-15 12:14:41','极道鲜荔枝',NULL),(5,10,'2018-10-18 08:00:00','我的梦想是成为火影',NULL),(6,6,'2018-10-04 13:37:46','复活的鲁路修','天才少年的人生');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(8) NOT NULL auto_increment COMMENT 'ID主键',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `type` varchar(100) NOT NULL COMMENT '型号',
  `batch` varchar(100) default NULL COMMENT '批次/等级',
  `unit` varchar(10) default NULL COMMENT '单位',
  `price` double(9,2) default NULL COMMENT '单价',
  `memo` varchar(200) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`id`,`name`,`type`,`batch`,`unit`,`price`,`memo`) values (1,'海龙笔记本电脑','i60-2688 9966','第一批次','台',10800.00,'第三方'),(2,'海龙笔记本电脑','i61-2689 6688','第二批次','台',16800.00,'完美升级'),(3,'幸福牌电视机','818 FFT','2388 EA03','台',7500.00,'代生产 '),(4,'幸福牌收音机','天语007','7878 006A','台',36.00,'代生产'),(5,'海龙笔记本电脑','i60','2688 9966','台',9800.00,NULL),(6,'海龙笔记本电脑	','i61','2689 6688','台',16800.00,NULL),(7,'海龙笔记本电脑	','i62','2689 6689','台',15800.00,NULL);

/*Table structure for table `right` */

DROP TABLE IF EXISTS `right`;

CREATE TABLE `right` (
  `code` varchar(50) NOT NULL COMMENT '权限码，主键',
  `parent_code` varchar(50) default NULL COMMENT '父权限码',
  `type` varchar(20) default NULL COMMENT '权限类型',
  `text` varchar(50) default NULL COMMENT '权限名称',
  `url` varchar(100) default NULL COMMENT '权限url(权限对应功能的访问url)',
  `tip` varchar(50) default NULL COMMENT '权限tip，显示',
  PRIMARY KEY  (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `right` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(8) NOT NULL auto_increment COMMENT '角色编号，主键',
  `name` varchar(50) NOT NULL COMMENT '角色名称',
  `desc` varchar(50) default NULL COMMENT '角色描述',
  `flag` int(8) default NULL COMMENT '角色标记',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`desc`,`flag`) values (1,'系统管理员','管理用户',1),(2,'销售主管','管理客户经理',1),(3,'客户经理','服务客户',1);

/*Table structure for table `role_right` */

DROP TABLE IF EXISTS `role_right`;

CREATE TABLE `role_right` (
  `id` int(8) NOT NULL auto_increment COMMENT '系统角色权限关系编号，主键',
  `role_id` int(8) NOT NULL COMMENT '角色编号，外键',
  `right_code` varchar(50) NOT NULL COMMENT '权限码，外键',
  PRIMARY KEY  (`id`),
  KEY `fk_role_right_role` (`role_id`),
  KEY `fk_role_right_right` (`right_code`),
  CONSTRAINT `fk_role_right_right` FOREIGN KEY (`right_code`) REFERENCES `right` (`code`),
  CONSTRAINT `fk_role_right_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_right` */

/*Table structure for table `service` */

DROP TABLE IF EXISTS `service`;

CREATE TABLE `service` (
  `id` int(8) NOT NULL auto_increment COMMENT '服务编号主键',
  `type` varchar(20) NOT NULL COMMENT '服务类型',
  `title` varchar(50) NOT NULL COMMENT '概要',
  `no` varchar(17) default NULL COMMENT '客户编号--外键',
  `cust_name` varchar(100) NOT NULL COMMENT '客户名称',
  `status` varchar(10) NOT NULL COMMENT '状态',
  `request` varchar(3000) NOT NULL COMMENT '服务请求',
  `create_id` int(8) NOT NULL COMMENT '创建人编号',
  `create_by` varchar(50) NOT NULL COMMENT '创建人',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `due_id` int(8) default NULL COMMENT '分配给某人的编号(客户经理编号)',
  `due_to` varchar(50) default NULL COMMENT '分配给某人的名称(客户经理名称)',
  `due_date` datetime default NULL COMMENT '分配时间',
  `deal` varchar(3000) default NULL COMMENT '服务处理',
  `deal_id` int(8) default NULL COMMENT '处理人编号',
  `deal_by` varchar(50) default NULL COMMENT '处理人',
  `deal_date` datetime default NULL COMMENT '处理时间',
  `result` varchar(500) default NULL COMMENT '处理结果',
  `satisfy` int(2) default NULL COMMENT '满意度',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='联系人';

/*Data for the table `service` */

insert  into `service`(`id`,`type`,`title`,`no`,`cust_name`,`status`,`request`,`create_id`,`create_by`,`create_date`,`due_id`,`due_to`,`due_date`,`deal`,`deal_id`,`deal_by`,`deal_date`,`result`,`satisfy`) values (456,'咨询','询问收音机订单运费承担方式','KH071201007','太阳药业','新创建','加急处理',1,'栗子','2010-06-02 11:39:58',4,'vergil','2018-10-24 16:32:37',NULL,NULL,NULL,NULL,NULL,NULL),(457,'咨询','询问收音机价格','KH071201007','太阳药业','新创建','加急处理',1,'栗子','2011-10-22 11:45:19',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(458,'咨询','询问收音机价格','KH071201006','云南天河烟草公司','新创建','加急处理',1,'栗子','2012-10-22 11:49:16',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(459,'建议','询问收音机价格','KH071201006','云南天河烟草公司','新创建','加急处理',1,'栗子','2012-11-22 12:44:38',9,'哗哗','2018-10-24 16:33:49',NULL,NULL,NULL,NULL,NULL,NULL),(460,'咨询','询问收音机价格	','KH071201006','云南天河烟草公司	','新创建','加急处理',1,'栗子','2013-05-22 12:45:54',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(461,'投诉','询问收音机价格	','KH071201006','云南天河烟草公司	','新创建','加急处理',1,'栗子','2015-06-22 12:47:20',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(462,'建议','询问收音机价格	','KH071201006','云南天河烟草公司	','新创建','加急处理',1,'栗子','2014-06-22 12:48:42',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(463,'咨询','询问收音机价格	','KH071201006','云南天河烟草公司	','新创建','加急处理',1,'栗子','2017-06-22 12:50:17',6,'孙晓梅','2018-10-25 19:24:47',NULL,NULL,NULL,NULL,NULL,NULL),(464,'建议','询问收音机价格	','KH071201006','云南天河烟草公司	','新创建','加急处理',1,'栗子','2018-05-22 12:51:35',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(465,'建议','询问收音机价格	','KH071201006','云南天河烟草公司	','新创建','加急处理',1,'栗子','2014-06-04 12:52:25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `storage` */

DROP TABLE IF EXISTS `storage`;

CREATE TABLE `storage` (
  `id` int(8) NOT NULL auto_increment COMMENT 'id主键',
  `prod_id` int(8) NOT NULL COMMENT '产品编号，外键',
  `warehouse` varchar(50) NOT NULL COMMENT '仓库',
  `ware` varchar(50) NOT NULL COMMENT '货位',
  `count` int(8) NOT NULL COMMENT '件数',
  `memo` varchar(200) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`),
  KEY `fk_storage_product` (`prod_id`),
  CONSTRAINT `fk_storage_product` FOREIGN KEY (`prod_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storage` */

insert  into `storage`(`id`,`prod_id`,`warehouse`,`ware`,`count`,`memo`) values (1,3,'北京-西直门库','EC-D2',16,NULL),(2,1,'北京-大钟寺库','EA-B8',12,NULL),(3,1,'北京-马甸库','EA-A6',8,NULL),(4,2,'天津-恒远电子C库','北26位',36,NULL),(5,2,'天津-恒远电子C库','北27位',36,NULL),(6,2,'天津-恒远电子C库','北28位',30,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(8) NOT NULL auto_increment COMMENT '用户编号，主键',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '用户密码',
  `role_id` int(8) default NULL COMMENT '角色编号，外键',
  `flag` int(2) NOT NULL COMMENT '用户标记(0:已删除,1:正常)',
  PRIMARY KEY  (`id`),
  KEY `id` (`id`),
  KEY `fk_user_role` (`role_id`),
  CONSTRAINT `fk_user_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`,`role_id`,`flag`) values (1,'栗子','123',1,1),(2,'lz','123',2,1),(3,'dmc','123',3,1),(4,'vergil','123',3,1),(5,'小明','123',3,1),(6,'孙晓梅','123',3,1),(7,'琪琪','123',3,1),(8,'蜜蜜','123',3,1),(9,'哗哗','123',3,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
