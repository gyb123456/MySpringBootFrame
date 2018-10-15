# SpringBoot2.0
2018后端项目框架

#框架：Web后端框架IDEA+Springboot2.0+Spring+Mybatis+Redis+Socket+Log4J+Maven

#呕心沥血这么久才搞好的这个项目，所以要为此做个项目说明，具体说明放在简书了

#作者：GYB

#时间：20180824

#简书项目介绍地址：https://www.jianshu.com/p/0c254bb0af84

#特别说明

!!!!!!!!!!!项目运行前请先把src\main\resources\application-dev.properties配置文件的数据库地址啥的改成你自己的地址!!!!!!!!!!!
项目具体介绍详见简书！

-------------------------------------------------------------------------------------------------------------------------------

#mvn打包命令是用的spring-boot-maven-plugin插件，打包时还是依赖maven-compiler-plugin

mvn clean install spring-boot:repackage -Pdev

#或者是,用的maven-compiler-plugin插件

mvn clean package -Pdev

#或者，pom默认会加载dev

mvn clean package
