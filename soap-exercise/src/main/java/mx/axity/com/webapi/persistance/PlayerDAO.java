package mx.axity.com.webapi.persistance;


import mx.axity.com.webapi.model.PlayerDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerDAO extends JpaRepository<PlayerDO,Long> {
}
