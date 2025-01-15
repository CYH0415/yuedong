# 项目概述

本项目使用 **Java Spring Boot** 框架进行开发，选用 **MySQL** 作为后台数据库。

## 实现接口

大家需要实现的接口主要位于 `src/main/java/com/zju/ina/controller` 文件夹下。

## 数据库配置

在测试时，请先将 `\src\main\resources\database.py` 中的数据库配置更改为自己的配置。完成后，运行该文件将会在 MySQL 中自动创建对应的表和一些测试数据。

另外，`\src\main\resources\application.properties` 文件中的数据库配置也需要修改为自己的配置信息。