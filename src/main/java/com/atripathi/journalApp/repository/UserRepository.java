package com.atripathi.journalApp.repository;

import com.atripathi.journalApp.entity.JournalEntry;
import com.atripathi.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);
}
