package com.dao;

//import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.model.Registration;
@Repository

public interface AppDao extends CrudRepository<Registration,Integer>{


}
