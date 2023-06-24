package dnd.axity.com;

import mx.axity.com.webapi.commons.PlayerDTO;

import java.math.BigInteger;

public class PlayerTypeFactory {
    public static PlayerType transform(PlayerDTO response) {
        long longValue = response.getId();
        BigInteger bigIntegerValue = BigInteger.valueOf(longValue);

        PlayerType playerType = null;
        if (response != null) {
            playerType = new PlayerType();
            playerType.setId(bigIntegerValue);
            playerType.setCharisma(response.getCharisma());
            playerType.setConstitution(response.getConstitution());
            playerType.setDexterity(response.getDexterity());
            playerType.setPlayerClass(response.getPlayerClass());
            playerType.setHitPoints(response.getHitPoints());
            playerType.setIntelligence(response.getIntelligence());
            playerType.setLevel(response.getLevel());
            playerType.setName(response.getName());
            playerType.setRace(response.getRace());
            playerType.setStrength(response.getStrength());
            playerType.setWisdom(response.getWisdom());
        }

        return playerType;
    }
    public static PlayerDTO transform(PlayerType player){
        PlayerDTO dto = null;
        if(player != null){
            dto = new PlayerDTO();
            dto.setId(player.getId().longValue());
            dto.setName(player.getName());
            dto.setRace(player.getRace());
            dto.setPlayerClass(player.getPlayerClass());
            dto.setLevel(player.getLevel());
            dto.setHitPoints(player.hitPoints);
            dto.setStrength(player.getStrength());
            dto.setDexterity(player.getDexterity());
            dto.setConstitution(player.constitution);
            dto.setIntelligence(player.getIntelligence());
            dto.setWisdom(player.getWisdom());
            dto.setCharisma(player.getCharisma());
        }
        return dto;
    }
}
