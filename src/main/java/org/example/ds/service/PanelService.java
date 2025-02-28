package org.example.ds.service;


import org.example.ds.domain.response.ResponsePanelLoginDto;
import org.example.ds.integration.PanelFeingClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PanelService {

    private final PanelFeingClient panelFeingClient;

    public PanelService(PanelFeingClient panelFeingClient) {
        this.panelFeingClient = panelFeingClient;
    }


    public ResponseEntity<ResponsePanelLoginDto> PanelService(String login, String password) {
        return panelFeingClient.login(login, password);
    }
}
