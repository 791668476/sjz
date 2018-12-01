/*
SQLyog Ultimate v8.32 
MySQL - 5.5.49 : Database - shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shop`;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `cid` varchar(50) NOT NULL,
  `cname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `category` */

insert  into `category`(`cid`,`cname`) values ('1','手机数码'),('2','电脑办公'),('3','家具家居'),('4','鞋靴箱包'),('5','图书音像'),('6','母婴孕婴'),('afdba41a139b4320a74904485bdb7719','汽车用品');

/*Table structure for table `orderitem` */

DROP TABLE IF EXISTS `orderitem`;

CREATE TABLE `orderitem` (
  `itemid` varchar(50) NOT NULL,
  `count` int(11) DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `pid` varchar(50) DEFAULT NULL,
  `oid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`itemid`),
  KEY `fk_0001` (`pid`),
  KEY `fk_0002` (`oid`),
  CONSTRAINT `fk_0001` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`),
  CONSTRAINT `fk_0002` FOREIGN KEY (`oid`) REFERENCES `orders` (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orderitem` */

insert  into `orderitem`(`itemid`,`count`,`subtotal`,`pid`,`oid`) values ('021b6704-7c2a-48e2-bce3-c6e913f62b9e',3,6894,'11','a603611a-adab-4182-9a19-f8d0150ef42f'),('0612e544-ddef-4b25-bb9a-cf199e46d57f',1,4499,'34','6564d2b3-f5e1-46f5-b994-a0826181e5b7'),('0d4d6d3e-1463-4d0f-9f55-0cb67f205dc6',1,2298,'11','6234766b-0456-4b36-b8bb-f902c5a8d306'),('1929a89e-58e0-4915-9b6b-e374160d5d03',1,4199,'33','2c332edc-afd7-4edc-b843-3216cd17ccb0'),('199b05db-b730-4e6e-bdd0-dfd22b47bc83',1,2298,'11','d265fbfb-b008-41aa-b361-2e21d146866d'),('19c17789-0f87-43e3-ae1d-db791f057b2d',3,6894,'11','5c59e99a-4cac-4702-afb4-011a38ccd340'),('2e267f6e-01d1-42a5-bd01-7901f540b2ca',1,2298,'11','a8d3a4d8-9682-4700-bb9b-e29f655959ec'),('35397d16-fd8d-4cf6-9fa5-ffef17eb1e48',1,1799,'12','58b2296f-46d3-4367-bb89-704cbfb82ce4'),('38cd2c34-5a3a-477c-a643-0eed0b209d93',1,2298,'11','ff593337-8eab-4cdf-98eb-cc1b135c8651'),('3e727d32-cc87-47ee-92ad-6f9e80150a67',1,1799,'12','c4fdb30b-08da-43bf-9071-7a530740ec51'),('520db171-1b8d-4722-8210-abaf051a5103',1,1799,'12','c7a57602-eac9-46b3-9545-7e814ffe63a6'),('63a8cb8e-0e06-4d3f-a1a2-e9f7a98b4138',1,4199,'33','1895bb89-81cd-4b4c-bf1e-e6abb36ba349'),('6aed780e-055b-4e7f-85c3-f8d71b40887b',3,20064,'32','454c5812-5cf8-4851-9946-5ee132773ff1'),('71ff1b19-1465-4e28-9d52-ce90ac6df6bb',1,4499,'34','d43fd1d8-0965-471b-b2b0-c297c1cdc3eb'),('79fd9483-64c2-4087-9eaa-f857e891adb8',1,1799,'12','a8d3a4d8-9682-4700-bb9b-e29f655959ec'),('7a122c18-1611-4588-8f3d-0b524e5bd58d',1,2298,'11','a5af7e14-4996-4a48-88e6-c792c5713622'),('7ecf7b2e-2fdc-4d81-bd1b-fb8dcc13c008',1,4199,'33','3638a4a4-ed0e-4fb3-bbd5-f869680d35ba'),('8867e6fc-b9ce-4ed2-b727-c802c2f707f9',1,2599,'10','a4ded077-c415-4ee9-b3af-86168465f1b5'),('8bc31054-5f9f-45e1-9dcf-8885276523f3',1,1799,'12','dc53db26-2171-4334-bbee-0617f0ab6dae'),('91a67973-16e7-4b8c-a96d-862fc2ecffd4',2,4596,'11','d43fd1d8-0965-471b-b2b0-c297c1cdc3eb'),('a2f4c1b1-fad1-4568-99e7-e4e6c750ce07',1,2298,'11','ea17dc1f-3b4a-4ba9-92b6-a99d80ee6ac9'),('af215589-d645-4a8e-a0b3-6edd4d1ab39c',1,4499,'34','ea0c0aac-9430-48a1-b120-c0ee08515761'),('b02874b6-ce30-4b1a-b508-7e3091468f83',1,4499,'34','c7a57602-eac9-46b3-9545-7e814ffe63a6'),('c5b6d337-a6d0-44ba-90f7-565d5e14aad5',1,2298,'11','1f1d9bcc-7817-452c-a874-8cd9a079c054'),('c7189349-6e27-4cad-8dad-4e1fd2b64bc6',3,20064,'32','ff593337-8eab-4cdf-98eb-cc1b135c8651'),('cfe5c605-b521-4ae1-9915-3170d0c792bd',1,4499,'34','a603611a-adab-4182-9a19-f8d0150ef42f'),('d77de879-17ab-4064-8a7c-e52459344f75',1,1799,'12','693506e9-1fce-49bb-ad6c-b1358e150b32'),('de5eae6a-50ff-4067-b6a9-055b43232edf',1,4499,'34','1f1d9bcc-7817-452c-a874-8cd9a079c054'),('e2879b37-017c-4a12-b340-a1155bf60f26',1,4499,'34','6234766b-0456-4b36-b8bb-f902c5a8d306'),('eaa7d612-0f4b-4c4a-82bc-de3b45ada8bf',1,4199,'33','a4ded077-c415-4ee9-b3af-86168465f1b5'),('eb06edbe-78a1-40fd-ab0a-c90f850e4c93',3,20064,'32','a5af7e14-4996-4a48-88e6-c792c5713622'),('ef9e8553-c263-443d-94f2-d7974d20d19d',1,4199,'33','ec9ecbf3-4bad-4401-9034-ba415c39b9c9'),('f66bf361-c6e2-4706-a8ed-79050a9ef517',2,3598,'12','7b2a78dd-37ca-46e9-8561-b83f3722c09c');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `oid` varchar(50) NOT NULL,
  `ordertime` datetime DEFAULT NULL,
  `total` double DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`oid`,`ordertime`,`total`,`state`,`address`,`name`,`telephone`,`uid`) values ('1895bb89-81cd-4b4c-bf1e-e6abb36ba349','2018-03-06 23:27:22',4199,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('1f1d9bcc-7817-452c-a874-8cd9a079c054','2018-03-06 15:00:08',6797,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('2c332edc-afd7-4edc-b843-3216cd17ccb0','2018-03-07 00:16:14',4199,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('3638a4a4-ed0e-4fb3-bbd5-f869680d35ba','2018-03-07 00:14:20',4199,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('454c5812-5cf8-4851-9946-5ee132773ff1','2018-03-06 13:39:10',20064,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('58b2296f-46d3-4367-bb89-704cbfb82ce4','2018-03-07 00:01:05',1799,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('5c59e99a-4cac-4702-afb4-011a38ccd340','2018-03-06 13:44:47',6894,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('6234766b-0456-4b36-b8bb-f902c5a8d306','2018-03-06 15:00:12',6797,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('6564d2b3-f5e1-46f5-b994-a0826181e5b7','2018-03-07 00:22:50',4499,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('693506e9-1fce-49bb-ad6c-b1358e150b32','2018-03-06 15:30:22',1799,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('7b2a78dd-37ca-46e9-8561-b83f3722c09c','2018-03-07 00:21:49',3598,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('a4ded077-c415-4ee9-b3af-86168465f1b5','2018-03-07 00:16:31',6798,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('a5af7e14-4996-4a48-88e6-c792c5713622','2018-03-06 13:42:01',22362,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('a603611a-adab-4182-9a19-f8d0150ef42f','2018-03-06 15:03:02',11393,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('a8d3a4d8-9682-4700-bb9b-e29f655959ec','2018-03-06 15:20:48',4097,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('c4fdb30b-08da-43bf-9071-7a530740ec51','2018-03-06 15:06:34',1799,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('c7a57602-eac9-46b3-9545-7e814ffe63a6','2018-03-06 15:27:37',6298,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('d265fbfb-b008-41aa-b361-2e21d146866d','2018-03-06 16:08:44',2298,0,'123',NULL,'123','06084f91-d085-4640-908e-3274378425c1'),('d43fd1d8-0965-471b-b2b0-c297c1cdc3eb','2018-03-06 15:01:41',9095,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('dc53db26-2171-4334-bbee-0617f0ab6dae','2018-03-06 15:26:28',1799,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('ea0c0aac-9430-48a1-b120-c0ee08515761','2018-03-06 23:18:50',4499,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('ea17dc1f-3b4a-4ba9-92b6-a99d80ee6ac9','2018-03-06 16:01:38',2298,0,'',NULL,'','06084f91-d085-4640-908e-3274378425c1'),('ec9ecbf3-4bad-4401-9034-ba415c39b9c9','2018-03-07 00:24:26',4199,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1'),('ff593337-8eab-4cdf-98eb-cc1b135c8651','2018-03-06 13:39:40',22362,0,NULL,NULL,NULL,'06084f91-d085-4640-908e-3274378425c1');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `pid` varchar(32) NOT NULL,
  `pname` varchar(50) DEFAULT NULL,
  `market_price` double DEFAULT NULL,
  `shop_price` double DEFAULT NULL,
  `pimage` varchar(200) DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  `is_hot` int(11) DEFAULT NULL,
  `pdesc` varchar(255) DEFAULT NULL,
  `pflag` int(11) DEFAULT NULL,
  `cid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `sfk_0001` (`cid`),
  CONSTRAINT `sfk_0001` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`pid`,`pname`,`market_price`,`shop_price`,`pimage`,`pdate`,`is_hot`,`pdesc`,`pflag`,`cid`) values ('1','小米 4c 标准版',1399,1299,'products/1/c_0001.jpg','2015-11-02',1,'小米 4c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',0,'1'),('10','华为 Ascend Mate7',2699,2599,'products/1/c_0010.jpg','2015-11-02',1,'华为 Ascend Mate7 月光银 移动4G手机 双卡双待双通6英寸高清大屏，纤薄机身，智能超八核，按压式指纹识别！!选择下方“移动老用户4G飞享合约”，无需换号，还有话费每月返还！',0,'1'),('11','vivo X5Pro',2399,2298,'products/1/c_0014.jpg','2015-11-02',1,'移动联通双4G手机 3G运存版 极光白【购机送蓝牙耳机+蓝牙自拍杆】新升级3G运行内存·双2.5D弧面玻璃·眼球识别技术',0,'1'),('12','努比亚（nubia）My 布拉格',1899,1799,'products/1/c_0013.jpg','2015-11-02',0,'努比亚（nubia）My 布拉格 银白 移动联通4G手机 双卡双待【嗨11，下单立减100】金属机身，快速充电！布拉格相机全新体验！',0,'1'),('13','华为 麦芒4',2599,2499,'products/1/c_0012.jpg','2015-11-02',1,'华为 麦芒4 晨曦金 全网通版4G手机 双卡双待金属机身 2.5D弧面屏 指纹解锁 光学防抖',0,'1'),('14','vivo X5M',1899,1799,'products/1/c_0011.jpg','2015-11-02',0,'vivo X5M 移动4G手机 双卡双待 香槟金【购机送蓝牙耳机+蓝牙自拍杆】5.0英寸大屏显示·八核双卡双待·Hi-Fi移动KTV',0,'1'),('15','Apple iPhone 6 (A1586)',4399,4288,'products/1/c_0015.jpg','2015-11-02',1,'Apple iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机长期省才是真的省！点击购机送费版，月月送话费，月月享优惠，畅享4G网络，就在联通4G！',0,'1'),('16','华为 HUAWEI Mate S 臻享版',4200,4087,'products/1/c_0016.jpg','2015-11-03',0,'华为 HUAWEI Mate S 臻享版 手机 极昼金 移动联通双4G(高配)满星评价即返30元话费啦；买就送电源+清水套+创意手机支架；优雅弧屏，mate7升级版',0,'1'),('17','索尼(SONY) E6533 Z3+',4099,3999,'products/1/c_0017.jpg','2015-11-02',0,'索尼(SONY) E6533 Z3+ 双卡双4G手机 防水防尘 涧湖绿索尼z3专业防水 2070万像素 移动联通双4G',0,'1'),('18','HTC One M9+',3599,3499,'products/1/c_0018.jpg','2015-11-02',0,'HTC One M9+（M9pw） 金银汇 移动联通双4G手机5.2英寸，8核CPU，指纹识别，UltraPixel超像素前置相机+2000万/200万后置双镜头相机！降价特卖，惊喜不断！',0,'1'),('19','HTC Desire 826d 32G 臻珠白',1599,1469,'products/1/c_0020.jpg','2015-11-02',1,'后置1300万+UltraPixel超像素前置摄像头+【双】前置扬声器+5.5英寸【1080p】大屏！',0,'1'),('2','中兴 AXON',2899,2699,'products/1/c_0002.jpg','2015-11-05',1,'中兴 AXON 天机 mini 压力屏版 B2015 华尔金 移动联通电信4G 双卡双待',0,'1'),('20','小米 红米2A 增强版 白色',649,549,'products/1/c_0019.jpg','2015-11-02',0,'新增至2GB 内存+16GB容量！4G双卡双待，联芯 4 核 1.5GHz 处理器！',0,'1'),('21','魅族 魅蓝note2 16GB 白色',1099,999,'products/1/c_0021.jpg','2015-11-02',0,'现货速抢，抢完即止！5.5英寸1080P分辨率屏幕，64位八核1.3GHz处理器，1300万像素摄像头，双色温双闪光灯！',0,'1'),('22','三星 Galaxy S5 (G9008W) 闪耀白',2099,1999,'products/1/c_0022.jpg','2015-11-02',1,'5.1英寸全高清炫丽屏，2.5GHz四核处理器，1600万像素',0,'1'),('23','sonim XP7700 4G手机',1799,1699,'products/1/c_0023.jpg','2015-11-09',1,'三防智能手机 移动/联通双4G 安全 黑黄色 双4G美国军工IP69 30天长待机 3米防水防摔 北斗',0,'1'),('24','努比亚（nubia）Z9精英版 金色',3988,3888,'products/1/c_0024.jpg','2015-11-02',1,'移动联通电信4G手机 双卡双待真正的无边框！金色尊贵版！4GB+64GB大内存！',0,'1'),('25','Apple iPhone 6 Plus (A1524) 16GB 金色',5188,4988,'products/1/c_0025.jpg','2015-11-02',0,'Apple iPhone 6 Plus (A1524) 16GB 金色 移动联通电信4G手机 硬货 硬实力',0,'1'),('26','Apple iPhone 6s (A1700) 64G 玫瑰金色',6388,6088,'products/1/c_0026.jpg','2015-11-02',0,'Apple iPhone 6 Plus (A1524) 16GB 金色 移动联通电信4G手机 硬货 硬实力',0,'1'),('27','三星 Galaxy Note5（N9200）32G版',5588,5388,'products/1/c_0027.jpg','2015-11-02',0,'旗舰机型！5.7英寸大屏，4+32G内存！不一样的SPen更优化的浮窗指令！赠无线充电板！',0,'1'),('28','三星 Galaxy S6 Edge+（G9280）32G版 铂光金',5999,5888,'products/1/c_0028.jpg','2015-11-02',0,'赠移动电源+自拍杆+三星OTG金属U盘+无线充电器+透明保护壳',0,'1'),('29','LG G4（H818）陶瓷白 国际版',3018,2978,'products/1/c_0029.jpg','2015-11-02',0,'李敏镐代言，F1.8大光圈1600万后置摄像头，5.5英寸2K屏，3G+32G内存，LG年度旗舰机！',0,'1'),('3','华为荣耀6',1599,1499,'products/1/c_0003.jpg','2015-11-02',0,'荣耀 6 (H60-L01) 3GB内存标准版 黑色 移动4G手机',0,'1'),('30','微软(Microsoft) Lumia 640 LTE DS (RM-1113)',1099,999,'products/1/c_0030.jpg','2015-11-02',0,'微软首款双网双卡双4G手机，5.0英寸高清大屏，双网双卡双4G！',0,'1'),('31','宏碁（acer）ATC705-N50 台式电脑',2399,2299,'products/1/c_0031.jpg','2015-11-02',0,'爆款直降，满千减百，品质宏碁，特惠来袭，何必苦等11.11，早买早便宜！',0,'2'),('32','Apple MacBook Air MJVE2CH/A 13.3英寸',6788,6688,'products/1/c_0032.jpg','2015-11-02',0,'宽屏笔记本电脑 128GB 闪存',0,'2'),('33','联想（ThinkPad） 轻薄系列E450C(20EH0001CD)',4399,4199,'products/1/c_0033.jpg','2015-11-02',0,'联想（ThinkPad） 轻薄系列E450C(20EH0001CD)14英寸笔记本电脑(i5-4210U 4G 500G 2G独显 Win8.1)',0,'2'),('34','联想（Lenovo）小新V3000经典版',4599,4499,'products/1/c_0034.jpg','2015-11-02',0,'14英寸超薄笔记本电脑（i7-5500U 4G 500G+8G SSHD 2G独显 全高清屏）黑色满1000減100，狂减！火力全开，横扫3天！',0,'2'),('35','华硕（ASUS）经典系列R557LI',3799,3699,'products/1/c_0035.jpg','2015-11-02',0,'15.6英寸笔记本电脑（i5-5200U 4G 7200转500G 2G独显 D刻 蓝牙 Win8.1 黑色）',0,'2'),('36','华硕（ASUS）X450J',4599,4399,'products/1/c_0036.jpg','2015-11-02',0,'14英寸笔记本电脑 （i5-4200H 4G 1TB GT940M 2G独显 蓝牙4.0 D刻 Win8.1 黑色）',0,'2'),('37','戴尔（DELL）灵越 飞匣3000系列',3399,3299,'products/1/c_0037.jpg','2015-11-03',0,' Ins14C-4528B 14英寸笔记本（i5-5200U 4G 500G GT820M 2G独显 Win8）黑',0,'2'),('38','惠普(HP)WASD 暗影精灵',5699,5499,'products/1/c_0038.jpg','2015-11-02',0,'15.6英寸游戏笔记本电脑(i5-6300HQ 4G 1TB+128G SSD GTX950M 4G独显 Win10)',0,'2'),('39','Apple 配备 Retina 显示屏的 MacBook',11299,10288,'products/1/c_0039.jpg','2015-11-02',0,'Pro MF840CH/A 13.3英寸宽屏笔记本电脑 256GB 闪存',0,'2'),('4','联想 P1',2199,1999,'products/1/c_0004.jpg','2015-11-02',0,'联想 P1 16G 伯爵金 移动联通4G手机充电5分钟，通话3小时！科技源于超越！品质源于沉淀！5000mAh大电池！高端商务佳配！',0,'1'),('40','机械革命（MECHREVO）MR X6S-M',6799,6599,'products/1/c_0040.jpg','2015-11-02',0,'15.6英寸游戏本(I7-4710MQ 8G 64GSSD+1T GTX960M 2G独显 IPS屏 WIN7)黑色',0,'2'),('41','神舟（HASEE） 战神K660D-i7D2',5699,5499,'products/1/c_0041.jpg','2015-11-02',0,'15.6英寸游戏本(i7-4710MQ 8G 1TB GTX960M 2G独显 1080P)黑色',0,'2'),('42','微星（MSI）GE62 2QC-264XCN',6199,5999,'products/1/c_0042.jpg','2015-11-02',0,'15.6英寸游戏笔记本电脑（i5-4210H 8G 1T GTX960MG DDR5 2G 背光键盘）黑色',0,'2'),('43','雷神（ThundeRobot）G150S',5699,5499,'products/1/c_0043.jpg','2015-11-02',0,'15.6英寸游戏本 ( i7-4710MQ 4G 500G GTX950M 2G独显 包无亮点全高清屏) 金',0,'2'),('44','惠普（HP）轻薄系列 HP',3199,3099,'products/1/c_0044.jpg','2015-11-02',0,'15-r239TX 15.6英寸笔记本电脑（i5-5200U 4G 500G GT820M 2G独显 win8.1）金属灰',0,'2'),('45','未来人类（Terrans Force）T5',10999,9899,'products/1/c_0045.jpg','2015-11-02',0,'15.6英寸游戏本（i7-5700HQ 16G 120G固态+1TB GTX970M 3G GDDR5独显）黑',0,'2'),('46','戴尔（DELL）Vostro 3800-R6308 台式电脑',3299,3199,'products/1/c_0046.jpg','2015-11-02',0,'（i3-4170 4G 500G DVD 三年上门服务 Win7）黑',0,'2'),('47','联想（Lenovo）H3050 台式电脑',5099,4899,'products/1/c_0047.jpg','2015-11-11',0,'（i5-4460 4G 500G GT720 1G独显 DVD 千兆网卡 Win10）23英寸',0,'2'),('48','Apple iPad mini 2 ME279CH/A',2088,1888,'products/1/c_0048.jpg','2015-11-02',0,'（配备 Retina 显示屏 7.9英寸 16G WLAN 机型 银色）',0,'2'),('49','小米（MI）7.9英寸平板',1399,1299,'products/1/c_0049.jpg','2015-11-02',0,'WIFI 64GB（NVIDIA Tegra K1 2.2GHz 2G 64G 2048*1536视网膜屏 800W）白色',0,'2'),('5','摩托罗拉 moto x（x+1）',1799,1699,'products/1/c_0005.jpg','2015-11-01',0,'摩托罗拉 moto x（x+1）(XT1085) 32GB 天然竹 全网通4G手机11月11天！MOTO X震撼特惠来袭！1699元！带你玩转黑科技！天然材质，原生流畅系统！',0,'1'),('50','Apple iPad Air 2 MGLW2CH/A',2399,2299,'products/1/c_0050.jpg','2015-11-12',0,'（9.7英寸 16G WLAN 机型 银色）',0,'2'),('6','魅族 MX5 16GB 银黑色',1899,1799,'products/1/c_0006.jpg','2015-11-02',0,'魅族 MX5 16GB 银黑色 移动联通双4G手机 双卡双待送原厂钢化膜+保护壳+耳机！5.5英寸大屏幕，3G运行内存，2070万+500万像素摄像头！长期省才是真的省！',0,'1'),('7','三星 Galaxy On7',1499,1398,'products/1/c_0007.jpg','2015-11-14',0,'三星 Galaxy On7（G6000）昂小七 金色 全网通4G手机 双卡双待新品火爆抢购中！京东尊享千元良机！5.5英寸高清大屏！1300+500W像素！评价赢30元话费券！',0,'1'),('8','NUU NU5',1288,1190,'products/1/c_0008.jpg','2015-11-02',0,'NUU NU5 16GB 移动联通双4G智能手机 双卡双待 晒单有礼 晨光金香港品牌 2.5D弧度前后钢化玻璃 随机附赠手机套+钢化贴膜 晒单送移动电源+蓝牙耳机',0,'1'),('9','乐视（Letv）乐1pro（X800）',2399,2299,'products/1/c_0009.jpg','2015-11-02',0,'乐视（Letv）乐1pro（X800）64GB 金色 移动联通4G手机 双卡双待乐视生态UI+5.5英寸2K屏+高通8核处理器+4GB运行内存+64GB存储+1300万摄像头！',0,'1');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` varchar(50) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `code` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`uid`,`username`,`password`,`name`,`email`,`telephone`,`birthday`,`sex`,`state`,`code`) values ('06084f91-d085-4640-908e-3274378425c1','sjz','123','sjz','791668476@qq.com',NULL,'1995-08-25','option1',0,'c8222d8f-850d-471d-bb62-23c040e4ab9d'),('63a93b76-16c5-4451-be69-a3829cf0674f','zhanghe','123','wasjz','791668476@qq.com',NULL,'1998-09-23','option2',1,'2e5aafac-e13f-4e83-8f86-575eafa54e3f'),('1','123456','123456','孙健朝','791668476@qq.com',NULL,'2018-12-09','男',NULL,NULL),('1','1234','123456','孙健朝','791668476@qq.com',NULL,'2018-12-16','男',NULL,NULL),('1','12345','123456','孙健朝','791668476@qq.com',NULL,'2018-12-23','男',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
