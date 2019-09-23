package com.tzy.api;

import com.tzy.api.bean.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author tzy
 * @create 2019-09-20 17:22
 */
public class JedisPoolTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");

        RedisTemplate redisTemplate = context.getBean(RedisTemplate.class);

        /*Role role = new Role();
        role.setId(1L);
        role.setRoleName("jack");
        role.setNote("boy");

        redisTemplate.opsForValue().set("role_1", role);

        Role role1= (Role)redisTemplate.opsForValue().get("role_1");

        System.out.println(role1.getRoleName());*/

        redisTemplate.opsForValue().set("key1", "value1");


        redisTemplate.opsForValue().append("key1", "append");




        String key1 = (String) redisTemplate.opsForValue().get("key1",0,5);



        System.out.println(key1);

    }
}
