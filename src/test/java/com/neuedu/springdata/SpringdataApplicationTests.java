package com.neuedu.springdata;

import com.neuedu.springdata.entity.User;
import com.neuedu.springdata.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringdataApplicationTests {
	@Autowired
	private UserRepository userRepository;
	@Test
	public void contextLoads() {
		User user=userRepository.findByUserName("zhangsan");

	}

	@Test
	public void saveAndFlush(){
//		User user = new User();
//		user.setId(4L);
//		user.setUserName("zhaoliu");
//		user.setPassword("123456");
//		user = userRepository.save(user);
//		log.info("user",user);
//		Assert.assertNotNull(user);

		//userRepository.deleteAllInBatch();
//		User user = new User();
//		user.setId(1L);
//		Example<User> example=Example.of(user);
//		Optional<User> optional = userRepository.findOne(example);
//		if(optional.isPresent()){
//			user=optional.get();
//			log.info(user+"");
//		}

		List<User> list=userRepository.findAll(new Sort(new Sort.Order(Sort.Direction.DESC, "id")));
		for (User user :
				list) {
			log.info(user+"");
		}
	}

}
