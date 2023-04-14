package com.roshanacademy.api.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roshanacademy.api.entity.Team;

@Repository
public class TeamDao {
	@Autowired
	SessionFactory sf;

	public List<Team> getAllPlayer() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeamDao.class);
		List<Team> team = criteria.list();

		session.close();
		return team;

	}

	public boolean insertPlayer(Team team) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(team);
		session.save(team);
		tr.commit();
		session.close();
		return true;

	}

	public Team getplayerById(int age) {
		Session session = sf.openSession();
		Team player=session.get(Team.class, age);
		session.close();
		return null;
	}

	public boolean deleteplayerById(int age) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Team player=session.get(Team.class, age);
		session.delete(age);
		session.close();
		tr.commit();
		return true;
		
	}

}
