package org.example.ds.domain.response;

import lombok.Data;

import java.util.List;

@Data
public class Obj {

    private Integer id;
    private Integer up;

    private Integer down;
    private Integer total;
    private String remark;
    private Boolean enable;
    private Integer expiryTime;
    private List<ClientStats> clientStats;
    private String listen;
    private Integer port;
    private String protocol;
    private String settings;
    private String streamSettings;
    private String tag;
    private String sniffing;
    private String allocate;
}
