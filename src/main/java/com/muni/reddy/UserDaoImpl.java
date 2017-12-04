package com.muni.reddy;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("clientRepository")
public class UserDaoImpl implements UserDao {
	@Autowired
    private MongoTemplate mongoTemplate;
	@Override
	public String createUser(User user) {
		UUID uuid=UUID.randomUUID();
		user.setUserId(uuid.toString());
		user.setFirstName("Muni");
		user.setLastName("Reddy");
		user.setEmailName("email");
		user.setAreaPincode(517257);
		mongoTemplate.insert(user);
		return user.getUserId();
	}

	@Override
	public User updateUser(String userId) {
		Query   collectionName=new Query(Criteria.where("userId").is(userId));
		User dUser=mongoTemplate.findOne(collectionName, User.class, "user");
		if(dUser!=null){
			return dUser;
		}
		return null;
	}

	@Override
	public String deleteUser(String userId) {
		Query   collectionName=new Query(Criteria.where("userId").is(userId));
		User user=mongoTemplate.findOne(collectionName, User.class, "user");
		if(user!=null){
			user.setActive(false);
			mongoTemplate.save(user);
			return "user is deactivated"; 
		}
		return null;
	}

}
