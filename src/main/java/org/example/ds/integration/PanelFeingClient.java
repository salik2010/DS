package org.example.ds.integration;


import org.example.ds.domain.response.ResponsePanelLoginDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(  name = "panel-client", url = "http://213.218.212.103:2053")
public interface PanelFeingClient {

    @PostMapping(value = "/qzqsDfzvlSEr6ZX/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    ResponseEntity<ResponsePanelLoginDto> login(@RequestParam("username") String username,
                                                @RequestParam("password") String password);


    @GetMapping(value = "/panel/api/inbounds/list", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<ResponsePanelLoginDto> get();
}
