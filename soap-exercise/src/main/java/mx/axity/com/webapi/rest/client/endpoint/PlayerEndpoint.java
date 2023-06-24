package mx.axity.com.webapi.rest.client.endpoint;

import dnd.axity.com.*;
import mx.axity.com.webapi.commons.PlayerDTO;
import mx.axity.com.webapi.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.ws.ResponseWrapper;

@Endpoint
public class PlayerEndpoint {


  private final PlayerService playerService;

  @Autowired
  public PlayerEndpoint(PlayerService playerService) {
    this.playerService = playerService;
  }

  private static final Logger logger = LoggerFactory.getLogger(PlayerEndpoint.class);
  private static final String NAMESPACE_URI = "com.axity.dnd";

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreatePlayerRequest")
  @ResponsePayload
  public CreatePlayerResponse createPlayer(@RequestPayload CreatePlayerRequest request) {
    CreatePlayerResponse response = new CreatePlayerResponse();
    PlayerDTO player = playerService.createPlayer(PlayerTypeFactory.transform(request.getPlayer()));
    response.setPlayerId(Math.toIntExact(player.getId()));
    return response;
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ReadPlayerRequest")
  @ResponsePayload
  public ReadPlayerResponse getPerson(@RequestPayload ReadPlayerRequest request) {

    ReadPlayerResponse response = new ReadPlayerResponse();
    PlayerDTO playerDTO = playerService.getPlayer((long) request.getPlayerId());
    PlayerType playerType = PlayerTypeFactory.transform(playerDTO);
    response.setPlayer(playerType);

    return response;
  }

  @PayloadRoot(namespace = NAMESPACE_URI,localPart = "UpdatePlayerRequest")
  @ResponsePayload
  public void updatePlayer(@RequestPayload UpdatePlayerRequest request){

    PlayerDTO player = playerService.updatePlayer(PlayerTypeFactory.transform(request.getPlayer()));

  }
  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeletePlayerRequest")
  @ResponsePayload
  public void deletePlayer(@RequestPayload DeletePlayerRequest request) {

      Long playerId = (long) request.getPlayerId();
      playerService.deletePlayer(Math.toIntExact(playerId));

  }
}
