# FinalProject

## 介绍

本仓库用于存储百度移动端实训最终大作业项目

实战项目说明：
- 题目：独立完成以搜索+浏览+信息流为主体功能Android APP
- 基础要求：掌握Android开发基础技术、核心工具和完整流程，搭建完整框架，实现基础功能
- 进阶要求：创建完善的App功能
  - 采用优良应用架构
  - 浏览框架支持多窗口能力
  - 视频流无限滑动
  - 度量和优化App性能体验
  - 扩展更多好玩功能

评审标准：
- 工程架构(模块化、分层、设计模式)
- 产品体验(性能、交互、视觉效果)
- 工程质量(稳定性、多设备兼容性)
- 代码水平(规范、风格、注释、逻辑、可读性)
- 产品功能(功能完备性)

## 进展

### 首页默认态

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture1.png)

新闻列表recycle布局，整体底部采用fragement

### 首页搜索框吸顶

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture2.png)

采用AppBarLayout实现向下滚动到一定程度时，搜索框吸顶

### 天气落地页

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture3.png)

每小时天气预报部分采用recycleview，可以横向滑动

### 新闻编辑页

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture4.png)

如图所示可以选取相册中的图片，不过并未真正编辑发布新闻，点击添加按钮弹窗提示添加成功，实际并未在数据中添加，仅作为FileProvider从相册中选取图片练习

### 普通图文落地页

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture5.png)


![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture6.png)


支持上下滚动，home页面点击新闻标题即可进入，不过为了方便全部采用的一组数据

### 首页-视频

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture7.png)

同样采取recycleview进行布局，封面图片资源为在线资源，采用Glide

### 小视频落地页

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture8.png)

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture9.png)


支持在线视频的播放，同时通过intent携带信息，使得播放正确的视频

### 首页-我的

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture10.png)

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture11.png)

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture12.png)

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture13.png)


注册、登录模块采用SQLite数据库进行数据的持久化

### 搜索-输入

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture14.png)

首页默认以及首页-视频均有搜索栏，可以输入想要搜索的内容，不过注意需点击两次EditView，第一次唤出键盘，第二次才能响应点击请求(也可能我理解错了？)

输入完后，点击右侧搜索图标，webView，利用百度直接抵达要查询的内容所在

![](https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/picture15.png)


## 问题

设计的UI均参考Pixel_3a_API_34_extension_level_7_x86_64虚拟机，我用安卓版本稍微老，屏幕尺寸稍微小一点的安卓机真机测试有些尺寸比例有些偏大。

时间问题，未能按照demo9对架构进行重新设计，性能测试也局限于个人实际体验和简单的一些数据测量
