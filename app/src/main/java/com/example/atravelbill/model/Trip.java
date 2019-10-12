package com.example.atravelbill.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Trip extends BasicModel {

    /**
     * 主键
     */
    private String tripId;
    /**
     * 旅行名称
     */
    private String tripName;
    /**
     * 人员总数
     */
    private Integer memberCount;
    /**
     * 旅行成员
     */
    private List<TripMember> tripMemberList;

}