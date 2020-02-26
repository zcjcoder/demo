import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import service.HelloService;
import service.HelloServiceNo;

public class test {
    @Test
    public void t1(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(HelloService.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloService proxy= (HelloService) enhancer.create();
//        proxy.sayHello();
//        proxy.ok();
    }

    @Test
    public void t2(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(HelloServiceNo.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloServiceNo proxy= (HelloServiceNo) enhancer.create();
        proxy.say();
    }
}
