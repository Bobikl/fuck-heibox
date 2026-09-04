package com.alipay.deviceid.module.x;

import android.content.Context;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: DefaultRpcClient.java */
/* JADX INFO: loaded from: classes6.dex */
public final class at extends bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f38243a;

    public at(Context context) {
        this.f38243a = context;
    }

    @Override // com.alipay.deviceid.module.x.bf
    public final <T> T a(Class<T> cls, final bj bjVar) {
        bg bgVar = new bg(new as() { // from class: com.alipay.deviceid.module.x.at.1
            @Override // com.alipay.deviceid.module.x.as
            public final String a() {
                return bjVar.f38313a;
            }

            @Override // com.alipay.deviceid.module.x.as
            public final bk b() {
                return aw.a(at.this.f38243a.getApplicationContext());
            }

            @Override // com.alipay.deviceid.module.x.as
            public final bj c() {
                return bjVar;
            }

            @Override // com.alipay.deviceid.module.x.as
            public final boolean d() {
                return bjVar.f38315c;
            }
        });
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new bh(bgVar.f38303a, cls, bgVar.f38304b));
    }
}
