package org.example.ds.controller;


import org.example.ds.domain.response.ResponsePanelLoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    @PostMapping(value = "/getLogin", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponsePanelLoginDto postPanelLogin(String login, String password) {
        return panelService.PanelService(login, password);
    }
}
