package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/* JADX INFO: loaded from: classes6.dex */
public class FastJsonRedisSerializer<T> implements RedisSerializer<T> {
    private FastJsonConfig fastJsonConfig = new FastJsonConfig();
    private Class<T> type;

    public FastJsonRedisSerializer(Class<T> cls) {
        this.type = cls;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.springframework.data.redis.serializer.SerializationException */
    public T deserialize(byte[] bArr) throws SerializationException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return (T) JSON.parseObject(bArr, this.type, this.fastJsonConfig.getFeatures());
        } catch (Exception e10) {
            throw new SerializationException("Could not deserialize: " + e10.getMessage(), e10);
        }
    }

    public FastJsonConfig getFastJsonConfig() {
        return this.fastJsonConfig;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.springframework.data.redis.serializer.SerializationException */
    public byte[] serialize(T t10) throws SerializationException {
        if (t10 == null) {
            return new byte[0];
        }
        try {
            return JSON.toJSONBytes(t10, this.fastJsonConfig.getSerializeConfig(), this.fastJsonConfig.getSerializerFeatures());
        } catch (Exception e10) {
            throw new SerializationException("Could not serialize: " + e10.getMessage(), e10);
        }
    }

    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {
        this.fastJsonConfig = fastJsonConfig;
    }
}
