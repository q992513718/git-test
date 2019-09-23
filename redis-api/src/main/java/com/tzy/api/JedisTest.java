package com.tzy.api;

import redis.clients.jedis.Jedis;

/**
 * @author tzy
 * @create 2019-09-20 12:07
 */
public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.142.129",6379);

        int i = 0;
        try {
            long start = System.currentTimeMillis();
            while (true)
            {
                long end = System.currentTimeMillis();
                if(end - start >= 1000)
                {
                    break;
                }
                i++;
                jedis.set("test" + i,i + "");
            }
        }finally {
            jedis.close();
        }
        System.out.println("redis每秒操作："+i+"次");
    }
}
