package test;

import bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;
import java.util.List;

/**
 * Created by liyang21 on 2016/9/3.
 */
public class test {
    public static void main(String[] args) throws Exception {
        //mybatis的配置文件
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = test.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
//        String statement = "userMapper.getUser";//映射sql的标识字符串
//        //执行查询返回一个唯一user对象的sql
//        User user = session.selectOne(statement, 1);
//        System.out.println(user);
        User user1 = new User();
        //user1.setId(5);
//        user1.setName("kkkkkkk");
//        user1.setAge(222);
//        int result = session.insert("userMapper.insert", user1);
//        System.out.println("affect row is:" + result);
//        User user2 = new User();
//        user2.setName("8");
//        user2.setAge(1000);
//        int result1=session.update("userMapper.update",user2);
//        //    int result1=session.delete("userMapper.delete",8);
//          System.out.println("affect the update row with:"+result1);
         List<User> list= session.selectList("userMapper.selectAll");
        for (User user:list){
            System.out.println(user.getAge()+","+user.getName());
        }
        session.commit();
        session.close();
    }
}
