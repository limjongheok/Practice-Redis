package redis.redisPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisSampleController {
    @Autowired
    private  RedisSampleService redisSampleService;
    @PostMapping(value = "/getRedisStringValue")
    public void getRedisStringValue(String key){
        redisSampleService.getRedisStringValue(key);
    }

    //set
    @PostMapping(value = "/setRedisStringValue")
    public void setRedisStringValue(String key, String value) {
        redisSampleService.setRedisStringValue(key, value);
    }
}
