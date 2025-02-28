package org.example.ds.controller;


import org.example.ds.domain.response.ResponsePanelLoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @PostMapping("/getLogin")
    public ResponseEntity<ResponsePanelLoginDto> postPanelLogin(String login, String password) {
        return panelService.PanelService(login, password);
    }
}
