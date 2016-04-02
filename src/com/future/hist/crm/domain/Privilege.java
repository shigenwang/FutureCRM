package com.future.hist.crm.domain;

import java.util.HashSet;
import java.util.Set;

public class Privilege {

	private Long id;
	private String name;                //名称
	private String description;         //描述
	private String url;                
	private Privilege parent;           //父权限
	private Set<Privilege> children = new HashSet<Privilege>(); //孩子权限
	private Set<Role> roles = new HashSet<Role>();        
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Privilege getParent() {
		return parent;
	}
	public void setParent(Privilege parent) {
		this.parent = parent;
	}
	public Set<Privilege> getChildren() {
		return children;
	}
	public void setChildren(Set<Privilege> children) {
		this.children = children;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Privilege [id=" + id + ", name=" + name + ", description=" + description + ", url=" + url + ", parent="
				+ parent + ", children=" + children + ", roles=" + roles + "]";
	}
	
}
