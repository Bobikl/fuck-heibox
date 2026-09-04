package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: SimpleClassCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements i, j {
    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return com.alipay.zoloz.jsoncodec.util.a.b(cls);
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        return obj;
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.j
    public Object serialize(Object obj) throws Exception {
        return obj;
    }
}
