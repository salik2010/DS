package org.example.ds.domain.response.get;

import lombok.Data;

@Data
public class ClientStats {

    private Integer id;
    private Integer inboundId;
    private Boolean enable;
    private String email;
    private Integer up;
    private Integer down;
    private Integer expiryTime;
    private Integer total;
    private Integer reset;
}
