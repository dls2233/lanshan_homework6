#实现了简单的用户登录，以及失物的增删改查，主要使用mybatis实现
springboot掌握程度不足，暂时没有实现后面的操作


#总结：<br>
1.maven：Maven是专门用于管理和构建Java项目的工具，建出的maven项目是通用的。<br>
2.功能：提供了一套标准化的项目结构，提供了一套标准化的构建流程（编译，测试，打包，发布……），提供了一套依赖管理机制。<br>
4.maven对项目构建的生命周期:clean:清理工作,default:核心工作，包括编译、测试、打包、安装、部署等,site:产生报告，发布站点<br>
5.依赖管理：在pom.xml中<br>
6.坐（资源的唯一标识）主要构成如下：<br>
groupId：定义当前Maven项目隶属组织名称（通常是域名反写，例如：org.springframework.boot）<br>
artifactId：定义当前Maven项目名称（通常是模块名称，例如 movie-service、user-service） <br>
version：定义当前项目版本号<br>
7.JSON：适用于进行数据交互的场景，如网站前台与后台之间的数据交互。<br>
8.json是以键值对进行书写的，而具体的语法如下:<br>
数组（Array）用方括号(“[]”)表示。<br>
对象（0bject）用大括号(“{}”)表示。<br>
名称/值对(name/value）组合成数组和对象。<br>
名称(name）置于双引号中，值（value）有字符串、数值、布尔值、null、对象和数组。<br>
并列的数据之间用逗号(“,”）分隔<br>
9.springboot:快速地基于spring进行java应用开发。<br>
10.yaml/yml:YAML，一种数据序列化格式。具有容易阅读、容易与脚本语言交互、以数据为核心，重数据轻格式的特点。<br>
11.yaml的语法格式如下:<br>
大小写敏感<br>
属性层级关系使用多行描述，每行结尾使用冒号结束<br>
使用缩进表示层级关系，同层级左侧对齐，只允许使用空格（不允许使用Tab键）<br>
==属性值前面添加空格（属性名与属性值之间使用冒号+空格作为分隔）==<br>
 #号 表示注释<br>
12Mybatis：持久层框架，用于简化 JDBC开发<br>
13.Java概念与数据库概念：类与表，属性与字段/列，对象与记录/行一一对应<br>
14.映射文件：使用mybatis的映射文件mapper并在其中编写sql语句进行代理开发，这能较好地解决原生的硬编码和后期维护问题。<br>
映射文件中的namespace与接口全类名的相同<br>
映射文件中编写sql语句的标签id属性与mapper接口中的方法名保持一致<br>
15.收集数据的方法：<br>
  1. 如果查询出的数据只有一条，可以通过<br>
    1. 实体类对象接收<br>
    2. List集合接收<br>
    3. Map集合接收，结果{password=123456, sex=男, id=1, age=23, username=admin}<br>
  2. 如果查询出的数据有多条，一定不能用实体类对象接收，会抛异常TooManyResultsException，可以通过<br>
    1. 实体类类型的LIst集合接收<br>
    2. Map类型的LIst集合接收<br>
    3. 在mapper接口的方法上添加@MapKey注解<br>
16.resultMap：自定义映射，用于一对多或多对一或字段名和属性名不一致的情况<br>
17.resultMap中常用属性<br>
  resultMap标签:<br>
  id：表示自定义映射的唯一标识，不能重复<br>
  type：查询的数据要映射的实体类的类型  <br>
  子标签：  <br
  id：设置主键的映射关系  <br>
  result：设置普通字段的映射关系  <br>
  子标签属性：  <br>
  property：设置映射关系中实体类中的属性名  <br>
  column：设置映射关系中表中的字段名<br>
18.foreach标签的属性。<br>
  collection:传进来的数组/collection属性的名称<br>
  item：单个元素的名称<br>
  open：循环开始输出的字符<br>
  close：循环结束输出的字符<br>
  separator：元素输出间的分隔符<br>
19.可直接使用注解等编写sql语句@select@Insert()@Delete()@Update()<br>
20.@Param来自定义属性名称,然后就可以在映射文件中使用自定义属性名进行接收了<br>
21.MVC模式<br>
  M：Model，<br>
  V：View，视图，界面展示<br>
  C：Controller，控制器，处理请求，调用模型和视图<br>
22.三层架构：<br>
表现层：对数据库的CRUD基本操作
业务逻辑层：对业务逻辑进行封装，组合数据访问层层中基本功能，形成复杂的业务逻辑功能。例如注册业务功能 ，我们会先调用<br>
数据访问层的 selectByName() 方法判断该用户名是否存在，如果不存在再调用 数据访问层的insert()方法进行数据的添加操作<br>
数据访问层：接收请求，封装数据，调用业务逻辑层，响应数据<br>
23.mvc与三层架构MVC是一个更宽泛的思想，而三层架构就是基于并实现mvc的一种架构。<br>
24.starter:是springboot为了简化开发时引依赖的过程而整出的一类"整合包"。<br>
25.@Componet:用来标注一个类，将该类填装到spring容器中<br>
26.@Autowired：自动填装<br>
27.@Configuration&@Bean：spring的配置类。<br>
28.@Service：这个注解主要是标注到业务逻辑层上，将其注入到spring容器中，方便将其注入到其他类中(例如controller)。本质上还是一个@Component。<br>
29.@Mappep；由mybatis提供，该spring容器由mybatis实现该接口，并让mybatis找到它，为该接口生成实现类，并最终放到spring容器中。<br>
30.@RestController是包含@Controller，并且还包含了@ResponseBody，这个注解会将我们的方法返回值转化为json数据放到responseBody中。<br>

