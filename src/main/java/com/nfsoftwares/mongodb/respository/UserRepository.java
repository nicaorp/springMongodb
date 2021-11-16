package com.nfsoftwares.mongodb.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nfsoftwares.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
