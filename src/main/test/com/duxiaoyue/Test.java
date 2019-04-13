package com.duxiaoyue;

import com.duxiaoyue.entity.Student;
import com.duxiaoyue.entity.UserInfo;
import com.duxiaoyue.exception.PengException;
import com.duxiaoyue.service.StudentService;
import com.duxiaoyue.service.UserInfoService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;

/**
 * @author 一笑奈何
 * @create 2019-04-10 19:57
 * @desc
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Test {
@Autowired
private UserInfoService userInfoService;
    @Autowired
    private StudentService studentService;
    @org.junit.Test
    public void test(){
      studentService.insertUser(new Student(1,"凉了",2));
    }
    @org.junit.Test
    public  void test2(){
        Student byId = studentService.findById(1);
        System.out.println(byId);
    }
    @org.junit.Test
    public void test3(){
        UserInfo userInfo = userInfoService.findByNameAndPassword("杜小月", "duxiaoyue");
        Assert.assertEquals("杜小月",userInfo.getLoginName());
    }
    @org.junit.Test
    public void test4() throws IOException {
        String data = Test.readJsonData("G:\\QQ下载和保存的文档\\1291482971\\FileRecv\\文件列表 - 液压与气压传动.json");
        System.out.println(data);
    }
    public static String readJsonData(String pactFile) throws IOException {
        // 读取文件数据
        //System.out.println("读取文件数据util");

        StringBuffer strbuffer = new StringBuffer();
        File myFile = new File(pactFile);//"D:"+File.separatorChar+"DStores.json"
        if (!myFile.exists()) {
            System.err.println("Can't Find " + pactFile);
        }
        try {
            FileInputStream fis = new FileInputStream(pactFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
            BufferedReader in  = new BufferedReader(inputStreamReader);

            String str;
            while ((str = in.readLine()) != null) {
                strbuffer.append(str);  //new String(str,"UTF-8")
            }
            in.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        //System.out.println("读取文件结束util");
        return strbuffer.toString();
    }
@org.junit.Test
    public void test41() throws ClassNotFoundException, NoSuchMethodException {
PengException pengException=new PengException("");
    Exception exception=new Exception();
//    int i=1/0;
    System.out.println( exception instanceof PengException);
}
}
