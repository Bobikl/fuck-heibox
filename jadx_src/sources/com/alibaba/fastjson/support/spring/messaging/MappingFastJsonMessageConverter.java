package com.alibaba.fastjson.support.spring.messaging;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.google.android.exoplayer2.util.y;
import java.nio.charset.Charset;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.converter.AbstractMessageConverter;
import org.springframework.util.MimeType;

/* JADX INFO: loaded from: classes6.dex */
public class MappingFastJsonMessageConverter extends AbstractMessageConverter {
    private FastJsonConfig fastJsonConfig;

    public MappingFastJsonMessageConverter() {
        super(new MimeType(y.f51568e, "json", Charset.forName("UTF-8")));
        this.fastJsonConfig = new FastJsonConfig();
    }

    protected boolean canConvertFrom(Message<?> message, Class<?> cls) {
        return supports(cls);
    }

    protected boolean canConvertTo(Object obj, MessageHeaders messageHeaders) {
        return supports(obj.getClass());
    }

    protected Object convertFromInternal(Message<?> message, Class<?> cls, Object obj) {
        Object payload = message.getPayload();
        if (payload instanceof byte[]) {
            byte[] bArr = (byte[]) payload;
            return JSON.parseObject(bArr, 0, bArr.length, this.fastJsonConfig.getCharset(), cls, this.fastJsonConfig.getFeatures());
        }
        if (payload instanceof String) {
            return JSON.parseObject((String) payload, (Class) cls, this.fastJsonConfig.getFeatures());
        }
        return null;
    }

    protected Object convertToInternal(Object obj, MessageHeaders messageHeaders, Object obj2) {
        return JSON.toJSONString(obj, this.fastJsonConfig.getSerializeConfig(), this.fastJsonConfig.getSerializeFilters(), this.fastJsonConfig.getSerializerFeatures());
    }

    public FastJsonConfig getFastJsonConfig() {
        return this.fastJsonConfig;
    }

    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {
        this.fastJsonConfig = fastJsonConfig;
    }

    protected boolean supports(Class<?> cls) {
        return true;
    }
}
