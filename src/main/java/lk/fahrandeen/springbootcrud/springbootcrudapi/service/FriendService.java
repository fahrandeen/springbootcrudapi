package lk.fahrandeen.springbootcrud.springbootcrudapi.service;

import java.util.List;

import lk.fahrandeen.springbootcrud.springbootcrudapi.model.Friend;

public interface FriendService {

List<Friend> get();

Friend get(int id);

void save(Friend friend);

void delete(int id);
}
