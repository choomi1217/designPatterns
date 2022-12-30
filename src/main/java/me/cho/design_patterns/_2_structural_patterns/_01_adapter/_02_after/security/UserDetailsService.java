package me.cho.design_patterns._2_structural_patterns._01_adapter._02_after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
