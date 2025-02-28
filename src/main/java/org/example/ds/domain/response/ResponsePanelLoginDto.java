package org.example.ds.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponsePanelLoginDto {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("msg")
    private String msg;

    @JsonProperty("obj")
    private Object obj;
}
