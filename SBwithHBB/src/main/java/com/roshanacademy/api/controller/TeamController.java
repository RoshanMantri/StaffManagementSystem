package com.roshanacademy.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roshanacademy.api.entity.Team;
import com.roshanacademy.api.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	TeamService tm;

	@GetMapping("/all")
	List<Team> getAllPlayer() {
		List<Team> team = tm.getAllPlayer();
		return team;

	}

	@PostMapping("/add")
	boolean insertPlayer(@RequestBody Team team) {
		boolean inserted = tm.insertPlayer(team);
		return inserted;

	}
	
	@GetMapping("player/{age}")
	Team getPlayerByID(@PathVariable int age) {
	Team player=	tm.getplayerById(age);
	return player;

}
	@DeleteMapping("/delete/{age}")
	boolean deleteplayerById(@PathVariable int age) {
	boolean isDeleted=tm.deleteplayerById(age);
	return isDeleted;
	
}
}
