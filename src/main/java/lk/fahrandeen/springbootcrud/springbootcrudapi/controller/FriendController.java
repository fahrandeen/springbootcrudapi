package lk.fahrandeen.springbootcrud.springbootcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.fahrandeen.springbootcrud.springbootcrudapi.model.Friend;
import lk.fahrandeen.springbootcrud.springbootcrudapi.service.FriendService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class FriendController {

	@Autowired
	private FriendService friendService;
	
	@GetMapping("/friends")
	public List<Friend> get(){
		return friendService.get();
	}
	
	@PostMapping("/friends/addnew")
	public void save(@RequestBody Friend friendObj) {
		friendService.save(friendObj);
	}
	
	@GetMapping("/friend/{id}")
	public Friend get(@PathVariable int id) {
		Friend friendObj = friendService.get(id);
		if(friendObj == null) {
			throw new RuntimeException("Friend with id : "+id+" not found.");
		}
		return friendObj;
		
	}
	
	@DeleteMapping("/friend/{id}/delete")
	public void delete(@PathVariable int id) {
		friendService.delete(id);
	}
	
	@PutMapping("/friends/{id}/edit")
	public void update(@PathVariable("id") int id, @RequestBody Friend friendObj) {
		friendService.save(friendObj);
	}
}
