package com.ricardoramalho.practice.remote.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import com.ricardoramalho.practice.model.Post;
import com.ricardoramalho.practice.remote.BlogBeanRemote;

@Stateful
public class BlogBeanImpl implements BlogBeanRemote {

	private List<Post> posts = new ArrayList<Post>();

	@Override
	public void doPost(Post post) {
		posts.add(post);

	}

	@Override
	public List<Post> getAllPosts() {
		return posts;
	}

	@Override
	public Post getPostByTitle(String title) {
		for(Post post : posts){
			if(post.getTitle().equals(title)){
				return post;
			}
		}
		return null;
	}

}
