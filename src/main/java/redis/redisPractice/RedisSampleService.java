package redis.redisPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisSampleService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void getRedisStringValue(String key ){
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        System.out.println("redis key: " + key);
        System.out.println("redis value: " + valueOperations.get(key));
    }


    //set
    public void setRedisStringValue(String key, String value){
        ValueOperations<String, String> stringValueOperations = redisTemplate.opsForValue();
        stringValueOperations.set(key,value);
        System.out.println("redis key: " + key);
        System.out.println("redis value: " + stringValueOperations.get(key));
    }
}
