dubbo_provider: 服务提供者
dubbo_consumer: 服务消费者
注册中心:zookeoper(单点模式)

注:使用时在服务器上安装zookeeper，并在Provider和consumer的xml配置文件中指定注册中心的IP地址及服务暴露端口。
此示例配置了provider的 <dubbo:service loadbalance="roundrobin"/>，当provider做集群时，请求会以轮循的方式做负载均衡

开发工具:IntelliJ IDEA 