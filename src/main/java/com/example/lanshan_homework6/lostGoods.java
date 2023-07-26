package com.example.lanshan_homework6;

public class lostGoods {
    private int lost_id;//失物id
    private String lost_name;//失物名称
    private String lost_position;//捡到的地点
    private String lost_description;//失物描述
    private String claim_position;//领取位置
    private String lost_date;//捡到的日期
    private Boolean is_returned;//是否已经认领

    @Override
    public String toString() {
        return "lostGoods{" +
                "lost_id=" + lost_id +
                ", lost_name='" + lost_name + '\'' +
                ", lost_position='" + lost_position + '\'' +
                ", lost_description='" + lost_description + '\'' +
                ", claim_position='" + claim_position + '\'' +
                ", lost_date='" + lost_date + '\'' +
                ", is_returned=" + is_returned +
                '}';
    }
}
