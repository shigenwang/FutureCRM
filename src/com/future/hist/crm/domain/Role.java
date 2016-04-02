package com.future.hist.crm.domain;

import java.util.HashSet;
import java.util.Set;

public class Role {

	private Long id;
	private String remark;     //备注
	private String name;       //名称
	private Set<User> users = new HashSet<User>();
	private Set<Privilege> privileges = new HashSet<Privilege>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Set<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", remark=" + remark + ", name=" + name + ", users=" + users + ", privileges="
				+ privileges + "]";
	}
	
}
