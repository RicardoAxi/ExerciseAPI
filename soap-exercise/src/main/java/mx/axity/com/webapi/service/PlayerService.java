package mx.axity.com.webapi.service;


import mx.axity.com.webapi.commons.PlayerDTO;
import org.springframework.stereotype.Service;


public interface PlayerService {
    PlayerDTO createPlayer(PlayerDTO player);

    PlayerDTO getPlayer(Long id);

    PlayerDTO updatePlayer(PlayerDTO player);

    void deletePlayer(Integer id);
}
