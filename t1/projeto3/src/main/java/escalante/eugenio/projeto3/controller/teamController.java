package escalante.eugenio.projeto3.controller;

import escalante.eugenio.projeto3.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class teamController {

    @GetMapping
    public String getMessage(){
        return "NBA Team";
    }

    @GetMapping("/team")
    public Team getTeams(){
        Team team = new Team();
        team.setName("Philadelphia 76ers");
        team.setFounded(1939);
        team.setConference("Eastern");
        team.setDivision("Atlantic");

        return team;
    }

    @GetMapping("/registers")
    public ArrayList<Team> getRegisters(){
        Team team1 = new Team();
        team1.setName("Los Angeles Lakers");
        team1.setFounded(1947);
        team1.setConference("Western");
        team1.setDivision("Pacific");

        Team team2 = new Team();
        team2.setName("Milwaukee Bucks");
        team2.setFounded(1968);
        team2.setConference("Eastern");
        team2.setDivision("Central");

        ArrayList<Team> register = new ArrayList<>();
        register.add(team1);
        register.add(team2);

        return register;
    }
}
