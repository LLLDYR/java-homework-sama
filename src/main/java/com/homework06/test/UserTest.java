package com.homework06.test;

import com.homework06.entity.User;

import java.util.*;

public class UserTest {
    public static void main(String[] args) {
    Map<String, LinkedList<User>> uMap = toMap(USERS);
        System.out.println("下面是来自北京的用户：");
        for (User user : uMap.get(User.BEIJING)) {
            System.out.println(user.getName());
        };
        System.out.println("下面是来自哈尔滨的用户：");
        for (User user : uMap.get(User.HAERBIN)) {
            System.out.println(user.getName());
        };
    }
    private static Set<User> USERS = create();
    private static Set<User> create(){
        User u0 = new User(1,"lili",User.BEIJING);
        User u1 = new User(2,"张三",User.BEIJING);
        User u2 = new User(3,"李四",User.HAERBIN);
        User u3 = new User(4,"李五",User.HAERBIN);
        Set<User> users = new HashSet<>();
        users.add(u0);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        return users;
    }
    private static Map toMap(Set<User> users) {
        Map<String, LinkedList<User>> uMap = new HashMap<>();
        for(User u:users){
            if(uMap.get(u.getCity())==null) {
                LinkedList<User> list = new LinkedList<User>();
                list.add(u);
                uMap.put(u.getCity(),list);
            }
            else{
                LinkedList l = uMap.get(u.getCity());
                l.add(u);
            }
        }
        return uMap;
    }
}
