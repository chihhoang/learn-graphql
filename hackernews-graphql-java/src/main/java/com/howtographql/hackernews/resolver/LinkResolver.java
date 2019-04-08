package com.howtographql.hackernews.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.howtographql.hackernews.model.Link;
import com.howtographql.hackernews.model.User;
import com.howtographql.hackernews.repository.UserRepository;

public class LinkResolver implements GraphQLResolver<Link> {
    private final UserRepository userRepository;

    public LinkResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User postedBy(Link link) {
        return link.getUserId() == null ? null : userRepository.findById(link.getUserId());
    }
}
