import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("------我是前置通知------");
        Object o1 = methodProxy.invokeSuper(o, objects);//这里是被代理对象的方法
        System.out.println("------我是后置通知------");
        return o1;
    }
}
