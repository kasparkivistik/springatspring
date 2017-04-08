package eu.leisurify.website.utils;

import eu.leisurify.website.player.Player;
import eu.leisurify.website.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToPlayers {

    @Autowired
    PlayerService playerService;

    public List<Player> splitAndFindByEmail(String input, String delimiter){
        return Arrays.stream(input.split(delimiter))
                .map(email -> playerService.findByEmail(email))
                .collect(Collectors.toList());
    }
}
