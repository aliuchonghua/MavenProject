package org.westos.web01.client;

import org.westos.web01.Util.SpringUtil;
import org.westos.web01.dao.HaohanDao;

public class Client2 {
    public static void main(String[] args) {
        HaohanDao dao = SpringUtil.getInstance().getContext().getBean("haohandao", HaohanDao.class);
        System.out.println(dao.listNews());

        HaohanDao dao2 = SpringUtil.getInstance().getContext().getBean("haohanDao", HaohanDao.class);
        System.out.println(dao2.listNews());
    }
}
