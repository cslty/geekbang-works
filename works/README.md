# 第一周作业



## 要求

- 实现一个自定义的 Tag，将 Hard Code 的 Header 名值对，变为属性配置的方式
  1. 实现自定义标签
  2. 编写自定义标签 tld 文件
  3. 部署到 Servlet 应用



## 实现

- 自定义标签类：`com.geekbang.work.tags.EchoRequestHeaderTag`
- 自定义标签 tld 文件：`/webapp/WEB-INF/echo.tld`
- 测试：`mvn tomcat7:run`
- 访问地址：`http://127.0.0.1:8080`

