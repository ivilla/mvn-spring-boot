package com.ivilla.example.repository;

import java.util.List;
import com.ivilla.example.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;	


@Repository
public interface UserRepository extends CrudRepository<User, Long>{

  @Query("select u from User u")
  public List<User> getAll();

}
