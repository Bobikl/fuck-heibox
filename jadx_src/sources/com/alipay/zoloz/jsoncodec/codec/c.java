package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: compiled from: DateCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements i, j {
    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        return new Date(((Long) obj).longValue());
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.j
    public Object serialize(Object obj) throws Exception {
        return Long.valueOf(((Date) obj).getTime());
    }
}
