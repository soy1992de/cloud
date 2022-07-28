package org.example;


import com.config.myConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{


    private static final Logger logger = LoggerFactory.getLogger(App.class);
    /*public static  int a=10;
    public  static int  b=3;*/

    public static void main( String[] args ) throws Exception
    {


        new AnnotationConfigApplicationContext(myConfig.class);


       /* String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            Blog blog = session.selectOne(
                    "org.mybatis.example.BlogMapper.selectBlog", 101);
        }
*/
     //   logger.info("log====log");

        /*int[] arr=new int[1];
    App[] apps=new App[5];

        while (true){
            System.out.println( "Hello World!" );
        }*/


      /*  System.out.println(String.class.getClassLoader());
        System.out.println(App.class.getClassLoader());*/

        /*int state=3;
        state=state & 1;
        System.out.println(state );
        state=state & 2;
        System.out.println(state );*/
    }
}
