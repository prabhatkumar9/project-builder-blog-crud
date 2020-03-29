package service;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Blog;


class Test{
	public void testsort() {
		List<Blog> list = new ArrayList<>();
		list.add(new Blog());
		list.add(new Blog());
		
//		Collections.sort(list, new Comparator<Blog>(){
//			public int compare(Blog l1, Blog l2) {
//				return l1.getBlogTitle().compareTo(l1.getBlogTitle());
//				
//			}
//		});
		list.sort((l1, l2) ->l1.getBlogTitle().compareTo(l2.getBlogTitle()));
		
	}
}



public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public static String compareByTitlethendate(Blog list1, Blog list2) {
		if(list1.getBlogTitle().equals(list2.getBlogTitle())) {
			return list1.getBlogTitle();
		}else {
			return list1.getBlogDescription().compareTo(list2.getBlogDescription());
		}
	}
	
	
	public List<Blog> addBlog(Blog blog){
		list.add(blog);
		return list;	
	}
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		System.out.println(list);
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		return null;
		
	}
}
