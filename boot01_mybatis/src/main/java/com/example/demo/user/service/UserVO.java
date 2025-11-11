package com.example.demo.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UserVO implements UserDetails {
	private Long id;
	private String loginId;
	private String password;
	private String fullName;
	private String deptName;
	private List<String> role;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list = new ArrayList<>();
		for(String r : role) {
			list.add(new SimpleGrantedAuthority(r));
		}
		return list;
	}

	@Override
	public String getUsername() { return loginId; }
	
	// 아래 4개는 무조건 true / 아니면 login이 안됨
	@Override
	public boolean isAccountNonExpired() { return true; }
	
	@Override
	public boolean isAccountNonLocked() { return true; }
	
	@Override
	public boolean isCredentialsNonExpired() { return true; }
	
	@Override
	public boolean isEnabled() { return true; }

}
