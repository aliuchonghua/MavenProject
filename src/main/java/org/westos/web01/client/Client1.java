package org.westos.web01.client;

import org.westos.web01.Util.SpringUtil;
import java.util.List;
import java.util.Map;

public class Client1 {
    public static void main(String[] args) {
        //初始化map
        Map mymap = SpringUtil.getInstance().getContext().getBean("mymap", Map.class);
        System.out.println(mymap);
        //初始化list
        List mylist = SpringUtil.getInstance().getContext().getBean("mylist", List.class);
        System.out.println(mylist);
    }
}
