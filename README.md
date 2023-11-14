# SpringBoot-TeaMall

## 基于SpringBoot茶叶销售平台

基于Springboot+vue.js的学习项目，通过Springboot整合了SpringMVC,MyBatisPlus、MySQL等技术。 **本项目不在维护，如有任何问题或者需要源码，请联系我**

### 一、项目介绍

茶叶销售平台基于Spring Boot是一个便捷、高效、灵活的项目开发框架，适用于快速构建现代化的Java应用程序。在该系统中，我们利用Spring Boot来构建一个面向茶叶销售的管理系统，以实现茶叶销售、公告信息、个人中心、订单处理、后台管理等功能。

### 二、功能介绍

#### 游客功能

- **浏览**：游客只需要访问相应的网址，便可查看此系统部分内容，其中包括：首页信息展示、茶叶信息等页面
- **注册**： 允许游客创建新用户账户，填写必要的个人信息并完成注册过程。
- **查看商品信息**： 游客可以浏览系统中的茶叶信息，包括名称、价格、库存、商品规格等。
- **查看公告信息**：  游客可以查看系统发布的公告，了解系统活动、促销信息等。

#### 用户功能

- **商品信息**： 用户可以浏览茶叶信息，查看商品的详细信息，包括价格、库存、规格等。
- **公告信息**：  用户可以查看系统发布的公告，了解系统活动、促销信息等。
- **个人中心**： 用户可以管理个人信息，包括修改密码、更新个人资料等。
- **查看订单**： 用户可以查看已完成和进行中的订单，了解购买历史和订单状态。
- **收藏商品**：  用户可以将感兴趣的商品加入收藏列表，便于以后查看或购买。
- **购物车**： 用户可以将选定的商品加入购物车，方便统一管理和结算。

#### 管理员功能

- **个人中心**： 管理员可以管理个人信息，包括修改密码、更新个人资料等。
- **用户管理**： 管理员可以进行用户管理操作，包括查看用户列表、修改用户信息等。
- **商品分类管理**： 管理员可以管理商品分类，包括添加、修改、删除商品分类信息。
- **商品信息管理**： 管理员可以管理商品信息，包括添加、编辑、删除商品信息。
- **系统管理**：  管理员可以管理系统设置，包括配置系统参数、管理公告信息等。
- **订单管理**： 管理员可以查看和管理订单，包括订单状态更新、订单详情查看等。

### 三、项目视频展示（点击即可跳转）

[![视频](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-1.png)](https://www.bilibili.com/video/BV12u4y1N7xc/?vd_source=682d900a893be9a21cc2cf244f7c9b87)

### 四、项目图片展示

#### 1、前台

![登录](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-register.png)

![注册](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-register.png)

![1](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-1.png)

![2](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-2.png)

![3](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-3.png)

![4](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-4.png)

![5](https://gitee.com/su-wenwu666/common-resource/raw/master/SpringBoot-TeaMall/image/front-5.png)

![6](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/front-6.png)

#### 2、后台

![登录](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-login.png)

![1](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-1.png)

![2](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-2.png)

![3](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-3.png)

![4](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-4.png)

![5](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-5.png)

![6](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-6.png)

![7](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-7.png)

![8](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-8.png)

![9](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/admin-9.png)

### 五、安装步骤

#### 1、数据库建库，运行SQL语句

![1db](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/1db.png)

#### 2、Idea配置好yml文件后运行

![1idea](https://github.com/SidneyWenwu/CommonResource/blob/main/SpringBoot-TeaMall/image/1idea.png)

#### 3、运行前台，打开VSCode

```java 
1、cnpm install
2、cnpm run serve
```

或者

```java 
1、npm install
2、npm run serve
```

#### 4、访问地址

前台：http://localhost:63342/front/index.html?_ijt=egpvqf8bq7qdbgc49aksin7i1g&_ij_reload=RELOAD_ON_SAVE（账号密码：zhangsan/123456）

后台：http://localhost:8081/（账号密码：admin/admin）

### 六、框架技术

- element-UI

- Lay-UI

- HTML5

- JavaScript

- CSS

- SpringBoot

- Maven

- myBatis

- Shior

  

### 交流

 **本项目不在维护，如有任何问题或者需要源码，请联系我**

![addWechat](https://github.com/SidneyWenwu/CommonResource/blob/main/ContactMe/addWechat.png)

### 创作不易，给点赏银

![addWechat](https://github.com/SidneyWenwu/CommonResource/blob/main/ContactMe/wechat.png)

![addWechat](https://github.com/SidneyWenwu/CommonResource/blob/main/ContactMe/alipay.png)
















