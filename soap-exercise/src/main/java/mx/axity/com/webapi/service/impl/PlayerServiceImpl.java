package mx.axity.com.webapi.service.impl;

import mx.axity.com.webapi.commons.PlayerDTO;
import mx.axity.com.webapi.model.PlayerDO;
import mx.axity.com.webapi.persistance.PlayerDAO;
import mx.axity.com.webapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerDAO playerDAO;
    @Autowired
    public PlayerServiceImpl(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }

    @Override
    public PlayerDTO createPlayer(PlayerDTO player) {
        PlayerDO entity = playerTOtoPlayerDO(player);
        entity = playerDAO.save(entity);
        player.setId(entity.getId());        return player;
    }


    @Override
    public PlayerDTO getPlayer(Long id) {
        PlayerDTO responseDTO = null;
        PlayerDO responseDO = playerDAO.findById(id).get();

        responseDTO = playerDOtoTO(responseDO);

        return responseDTO;
    }

    @Override
    public PlayerDTO updatePlayer(PlayerDTO player) {

        PlayerDO response = this.playerDAO.findById(player.getId()).get();
        response.setId(player.getId());
        response.setName(player.getName());
        response.setRace(player.getRace());
        response.setPlayerClass(player.getPlayerClass());
        response.setLevel(player.getLevel());
        response.setHitPoints(player.getHitPoints());
        response.setStrength(player.getStrength());
        response.setDexterity(player.getDexterity());
        response.setConstitution(player.getConstitution());
        response.setIntelligence(player.getIntelligence());
        response.setWisdom(player.getWisdom());
        response.setCharisma(player.getCharisma());
        this.playerDAO.save(response);
        return player;

    }

    @Override
    public void deletePlayer(Integer id) {
        PlayerDO entity = playerDAO.findById(Long.valueOf(id)).get();
        playerDAO.delete(entity);
    }

    public PlayerDTO playerDOtoTO(PlayerDO playerDO){

        return new PlayerDTO(playerDO.getId(), playerDO.getName(), playerDO.getRace(), playerDO.getPlayerClass(), playerDO.getLevel(), playerDO.getHitPoints(), playerDO.getStrength(), playerDO.getDexterity(), playerDO.getConstitution(), playerDO.getConstitution(), playerDO.getWisdom(), playerDO.getCharisma());
    }

    public PlayerDO playerTOtoPlayerDO(PlayerDTO player){
        PlayerDO response = new PlayerDO();
        response.setId(player.getId());
        response.setName(player.getName());
        response.setRace(player.getRace());
        response.setPlayerClass(player.getPlayerClass());
        response.setLevel(player.getLevel());
        response.setHitPoints(player.getHitPoints());
        response.setStrength(player.getStrength());
        response.setDexterity(player.getDexterity());
        response.setConstitution(player.getConstitution());
        response.setIntelligence(player.getIntelligence());
        response.setWisdom(player.getWisdom());
        response.setCharisma(player.getCharisma());
        return response;
    }
}
