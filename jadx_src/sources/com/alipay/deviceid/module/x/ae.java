package com.alipay.deviceid.module.x;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: EnumCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ae implements aj, ak {
    @Override // com.alipay.deviceid.module.x.ak
    public final Object a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // com.alipay.deviceid.module.x.aj
    public final Object a(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // com.alipay.deviceid.module.x.aj, com.alipay.deviceid.module.x.ak
    public final boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
