package cn.codingguide.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-18
 */
public class UserDao {

    private static final Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "itlemon");
        hashMap.put("10002", "peter");
        hashMap.put("10003", "lemon");
        hashMap.put("10004", "cook");
    }

    public String queryUsername(String uid) {
        // 模仿从数据库中查询
        return hashMap.get(uid);
    }

}
