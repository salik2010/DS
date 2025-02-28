package org.example.ds.domain.response;

import lombok.Data;

@Data
public class ResponsePanelLoginDto {

    Boolean success;
    String msg;
    Object obj;
}
