package cn.codingguide.springframework.test.bean;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-11-09
 */
public class UserService {

    private final String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息");
    }

    public void queryUsername() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
