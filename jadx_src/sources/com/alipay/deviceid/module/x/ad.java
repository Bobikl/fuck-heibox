package com.alipay.deviceid.module.x;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: compiled from: DateCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ad implements aj, ak {
    @Override // com.alipay.deviceid.module.x.ak
    public final Object a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // com.alipay.deviceid.module.x.aj
    public final Object a(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // com.alipay.deviceid.module.x.aj, com.alipay.deviceid.module.x.ak
    public final boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
