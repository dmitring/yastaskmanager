package com.dmitring.yastaskmanager.user_service.security;

import com.dmitring.yastaskmanager.user_service.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.dmitring.yastaskmanager.user_service.repository.UserRepository;

@Service
public class RepositoryUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        final User user = repository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        final UserDetails userDetails = createUserService(user);
        return userDetails;
    }

    private UserDetails createUserService(User user) {
        return new UserDetailsImpl(user);
    }
}

