package lk.fahrandeen.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import lk.fahrandeen.springbootcrud.springbootcrudapi.model.Friend;

public interface FriendDAO {

	List<Friend> get();
	
	Friend get(int id);
	
	void save(Friend friend);
	
	void delete(int id);
}
