package eu.leisurify.website.player;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kaspar on 08.04.17.
 */
public class PlayerServiceTest {
    private PlayerService ps;
    @Test
    public void savePlayer() throws Exception {
        Player player1 = new Player();
        player1.setId(Long.MAX_VALUE);
        ps.savePlayer(player1);
        assertEquals(player1, ps.getPlayer(Long.MAX_VALUE));
    }

    @Test
    public void getPlayer() throws Exception {
    }

    @Test
    public void getAllPlayers() throws Exception {
    }

    @Test
    public void findByEmail() throws Exception {
        Player player = new Player();
        player.setEmail("minu@meil.ee");
        assertEquals(player, ps.findByEmail("minu@meil.ee"));
    }

    @Test
    public void getPlayerByStatus() throws Exception {
    }

}