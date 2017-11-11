package com.avery.redis.config.redis;

import com.avery.redis.util.common.SerializeUtil;
import org.apache.commons.lang.SerializationException;
import org.springframework.data.redis.serializer.RedisSerializer;

public class EntityRedisSerializer implements RedisSerializer<Object> {

    @Override
    public byte[] serialize(Object t) throws SerializationException {
        if (t == null) {
            return new byte[0];
        }
        return SerializeUtil.serialize(t);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return SerializeUtil.unserialize(bytes);
    }

}
