package com.roshanacademy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshanacademy.api.dao.TeamDao;
import com.roshanacademy.api.entity.Team;

@Service
public class TeamService {

	@Autowired
	TeamDao dao;
	
	public List<Team> getAllPlayer() {
		List<Team> team=	dao.getAllPlayer();
		return team;
		
		
	}

	public boolean insertPlayer(Team team) {
		return dao.insertPlayer(team);
		
	}

	public Team getplayerById(int age) {
		return dao.getplayerById(age);
		
		
	}

	public boolean deleteplayerById(int age) {
	return	dao.deleteplayerById(age);
		
	}



	

}
