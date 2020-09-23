# 动态代理

## 简述

- 动态代理与静态代理角色一样
- 动态代理是动态生成的, 不是预先写好的
- 动态代理分为两大类: 基于接口的动态代理、基于类的动态代理
  - 基于接口: JDK Dynamic Proxy[本例使用]
  - 基于类: Cglib
  - java字节码实现: javasist
  
## 储备知识

### Proxy类

生成动态代理实例

### InvocationHandler类 (Reflect包下)
调用处理程序并返回结果

调用处理类

## 好处

- 拥有静态代理的全部好处
- 一个动态代理类代理的是一个接口，一般就是对应一类业务
- 一个动态代理类可以代理多个类，只要是实现了同一个接口