package eu.leisurify.website.game;

import eu.leisurify.website.player.Player;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Game implements Cloneable, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;

    @ManyToMany
    private Set<Player> winners;

    @ManyToMany
    private Set<Player> losers;

}
