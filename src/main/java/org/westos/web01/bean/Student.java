package org.westos.web01.bean;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/24.
 */
public class Student {
    private String xuhao;
    private String xingming;
    private List<String> aihao;
    private Map<String,Integer> chengji;

    public Map<String, Integer> getChengji() {
        return chengji;
    }

    public void setChengji(Map<String, Integer> chengji) {
        this.chengji = chengji;
    }

    public List<String> getAihao() {
        return aihao;
    }

    public void setAihao(List<String> aihao) {
        this.aihao = aihao;
    }

    public String getXuhao() {
        return xuhao;
    }

    public void setXuhao(String xuhao) {
        this.xuhao = xuhao;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

}
