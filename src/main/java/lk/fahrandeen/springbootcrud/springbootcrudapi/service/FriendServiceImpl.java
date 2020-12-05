package lk.fahrandeen.springbootcrud.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lk.fahrandeen.springbootcrud.springbootcrudapi.dao.FriendDAO;
import lk.fahrandeen.springbootcrud.springbootcrudapi.model.Friend;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendDAO friendDAO;
	
	@Transactional
	@Override
	public List<Friend> get() {
		return friendDAO.get();
	}

	@Transactional
	@Override
	public Friend get(int id) {
		return friendDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Friend friend) {
		friendDAO.save(friend);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		friendDAO.delete(id);
		
	}

}
