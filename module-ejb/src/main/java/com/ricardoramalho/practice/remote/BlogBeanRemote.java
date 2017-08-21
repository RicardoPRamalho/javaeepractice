package com.ricardoramalho.practice.remote;

import java.util.List;

import javax.ejb.Remote;

import com.ricardoramalho.practice.model.Post;

@Remote
public interface BlogBeanRemote {
	
	public void doPost(Post post);
		
	public List<Post> getAllPosts();
	
	public Post getPostByTitle(String title);

}
