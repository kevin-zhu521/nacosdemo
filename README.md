nacos 无配置开发，直接在远程拉取配置。只需要在program argument中配置一下nacos参数(linux可在启动脚本中添加)：

--spring.application.name=nacosdemo 
--spring.cloud.nacos.config.server-addr=127.0.0.1:8848 
--spring.cloud.nacos.config.shared-dataids=application.properties,${spring.application.name}.properties 
--spring.cloud.nacos.config.refreshable-dataids=${spring.cloud.nacos.config.shared-dataids} 
--spring.main.allow-bean-definition-overriding=true