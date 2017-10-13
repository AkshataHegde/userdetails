package akshata.user;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface UserRepository extends CrudRepository<User,String> {
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(topic t)
	//deleteTopic(String id)
	
	
	

}