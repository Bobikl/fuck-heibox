package com.tencent.qmsp.sdk.g.i;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import java.lang.reflect.Method;
import s5.c;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.qmsp.sdk.base.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f102032a;

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", String.class, String.class);
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = "unknown";
            return (String) method.invoke(cls, objArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        return this.f102032a.a(0, "");
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f102032a = new a(context);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        return null;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return true;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        return "1".equals(a(c.f139298c, "0"));
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
    }
}
