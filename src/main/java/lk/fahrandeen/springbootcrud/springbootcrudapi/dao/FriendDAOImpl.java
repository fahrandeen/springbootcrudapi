package lk.fahrandeen.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lk.fahrandeen.springbootcrud.springbootcrudapi.model.Friend;

@Repository
public class FriendDAOImpl implements FriendDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Friend> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Friend> query = currentSession.createQuery("from Friend", Friend.class);
		List<Friend> list = query.getResultList();
		return list;
	}

	@Override
	public void save(Friend friend) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(friend);

	}

	@Override
	public Friend get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Friend friendObj = currentSession.get(Friend.class, id);
		return friendObj;
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Friend friendObj = currentSession.get(Friend.class, id);
		currentSession.delete(friendObj);
		
	}



}
