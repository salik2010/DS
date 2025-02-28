package org.example.ds.domain.response.get;

import lombok.Data;

import java.util.List;

@Data
public class ResponseGet {
    Boolean success;
    String msg;
    List<Obj> obj;
}
