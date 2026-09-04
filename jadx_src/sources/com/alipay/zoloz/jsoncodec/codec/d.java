package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: EnumCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements i, j {
    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.j
    public Object serialize(Object obj) throws Exception {
        return ((Enum) obj).name();
    }
}
