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

    private String name;

    private Date date;

    @ManyToMany
    private Set<Player> winners;

    private int winnerScore;

    @ManyToMany
    private Set<Player> losers;

    private int losersScore;

    @ManyToMany
    private Set<Player> draw;

    private int drawScore;
}
