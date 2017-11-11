package com.avery.redis.repository.search;

import com.avery.redis.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserSearchRepository extends ElasticsearchRepository<User,Long>{
}
