package com.afei.mybatis.interception;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Statement;
import java.util.Properties;

/**
 * 自定义插件
 *  插件签名，告诉插件用来拦截哪个对象的哪个方法   parameterize 参数设置
 * @author shihengfei
 */
@Intercepts({
        @Signature(type = StatementHandler.class, method = "parameterize", args = Statement.class)
})
public class MyOnePlugin implements Interceptor {
    /**
     * 拦截目标
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("MyOnePlugin...intercept:"+invocation.getMethod());
        // 拦截前
        // 获取目标对象的元数据
        Object target = invocation.getTarget();
        MetaObject metaObject = SystemMetaObject.forObject(target);
        // 获取属性值
        System.out.println(metaObject.getValue("parameterHandler.parameterObject"));
        // 修改属性值
//        metaObject.setValue("parameterHandler.parameterObject",1);
        // 执行目标方法
        Object proceed = invocation.proceed();
        return proceed;
    }

    /**
     * 包装目标对象，创建一个代理对象
     * @param target
     * @return
     */
    @Override
    public Object plugin(Object target) {
        System.out.println("MyOnePlugin...plugin"+target);
        // 包装生成代理对象
        Object wrap = Plugin.wrap(target, this);
        // 返回代理对象
        return wrap;
    }

    @Override
    public void setProperties(Properties properties) {
        // 设置参数
        System.out.println("setProperties。。。"+properties);
    }
}
