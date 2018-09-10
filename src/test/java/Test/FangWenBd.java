package Test;

import Fangfa.TestFangFa;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by ZCP on 2018/9/6.
 */
public class FangWenBd {
    @BeforeMethod
    public void bef(){
        Fangfa.TestFangFa.Before();
    }

    @Test
    public  void Test1() throws InterruptedException {
        TestFangFa.GetUrl("http://baidu.com");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void Af(){
        Fangfa.TestFangFa.Afer();
    }
}
