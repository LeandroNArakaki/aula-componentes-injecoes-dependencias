package com.br.devsuperior.entities;


public class Order {

    private Integer code;
    private Double basic;
    private Double discont;

    public Order() {
    }

    public Order(Integer code, Double basic, Double discont) {
        this.code = code;
        this.basic = basic;
        this.discont = discont;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscont() {
        return discont;
    }

    public void setDiscont(Double discont) {
        this.discont = discont;
    }
}
