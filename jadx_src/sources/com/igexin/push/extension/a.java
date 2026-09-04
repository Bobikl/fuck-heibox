package com.igexin.push.extension;

import android.content.Context;
import com.igexin.a.a.c.b;
import com.igexin.push.core.d;
import com.igexin.push.extension.stub.IPushExtension;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f63894a = "com.igexin.push.extension.a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f63895c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<IPushExtension> f63896b = new ArrayList();

    private a() {
    }

    public static a a() {
        if (f63895c == null) {
            f63895c = new a();
        }
        return f63895c;
    }

    private void b(Context context) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("com.igexin.push.extension.distribution.basic.stub.PushExtension");
        for (String str : arrayList) {
            try {
                IPushExtension iPushExtension = (IPushExtension) context.getClassLoader().loadClass(str).newInstance();
                iPushExtension.init(d.f63671e);
                this.f63896b.add(iPushExtension);
                b.a("[main] ext loaded(mock): " + str, new Object[0]);
            } catch (Exception e10) {
                b.a(f63894a + e10.toString(), new Object[0]);
            }
        }
    }

    public boolean a(Context context) {
        try {
            b(context);
            return true;
        } catch (Throwable th2) {
            b.a(f63894a + "|" + th2.toString(), new Object[0]);
            return true;
        }
    }

    public List<IPushExtension> b() {
        return this.f63896b;
    }
}
