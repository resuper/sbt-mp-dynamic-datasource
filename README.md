
> demo使用 springboot + mybatiplus + dynamic-datasource-spring-boot-starter 实现多数据源
>
> 配置了 一个主数据库 oracle ，2个mysql8的数据库，和一个mysql5的数据库
>
> 演示了多数据源一起使用动态切换，配置时只是用组名在同一组的数据库会使用负载均衡算法分配数据源






# 环境信息

---



- mysql5 

  - 数据库：`testmultds`
  - 表：`sys_user`

---

- mysql8
  - 数据库1:`mutidatasource21
  - 表 `sys_user`
  - 数据库2 :`mutidatasource2`
  - 表：`sys_user`

---

oracle11g xe

- 表：`sys_user`

------

springboot等maven依赖的版本不做要求，我使用的是当时的最新版

---

参考文档

mybatisplus官方demo

[mybatisplus官方使用多数据源示例]( https://mp.baomidou.com/guide/dynamic-datasource.html )



