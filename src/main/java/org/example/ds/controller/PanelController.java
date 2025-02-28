package org.example.ds.controller;


import io.swagger.v3.oas.annotations.Parameter;
import org.example.ds.domain.response.ResponsePanelLoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.example.ds.service.PanelService;

@RestController
@RequestMapping("/api")
public class PanelController {

    private final PanelService panelService;

    @Autowired
    public PanelController(PanelService panelService) {
        this.panelService = panelService;
    }

    @PostMapping(value = "/getLogin",  produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<ResponsePanelLoginDto> postPanelLogin(String username, String password){
        return panelService.PanelService(username, password);
    }
}
