


package com.gatesnotes.gatesnotes.repository;

import com.gatesnotes.gatesnotes.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {




}
//    Iterable<User> findTop1ByFirstName(String firstName);
//
//    Iterable<User> findTop10ByLastName(String lastName);
//
//    Iterable<User> findTop10ByFirstNameAndLastName(String firstName, String lastName);

//    @Query(nativeQuery = true, value = "SELECT * FROM users limit 1")
//    Iterable<User> findAllTopTen();
//
//    Iterable<User> findByFirstName(String firstName);
//
//
//    User findOneByEmail(String userEmail);
//
//    Optional<User> findByEmail(String email);
//
//    Boolean existsByEmail(String email);
//}
