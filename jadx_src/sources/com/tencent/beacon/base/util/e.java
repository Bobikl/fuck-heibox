package com.tencent.beacon.base.util;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: StrictMode.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f98952a = new AtomicBoolean(false);

    public static void a(String str) {
        c.b("[strict]  " + str, new Object[0]);
        if (f98952a.get()) {
            throw new IllegalStateException("[strict] " + str);
        }
    }

    public static void a(Map map) {
        if (!f98952a.get() || map == null) {
            return;
        }
        for (Object obj : map.keySet()) {
            if (!(obj instanceof String)) {
                a("Key必须为String类型!");
            }
            if (!(map.get(obj) instanceof String)) {
                a("Value必须为String类型!");
            }
        }
    }

    private static boolean a() {
        return f98952a.get() || com.tencent.beacon.a.c.b.d(com.tencent.beacon.a.c.c.d().c());
    }

    public static boolean a(String str, Object obj) {
        boolean zIsEmpty;
        if (obj instanceof String) {
            zIsEmpty = TextUtils.isEmpty((String) obj);
        } else {
            zIsEmpty = obj == null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(obj == null ? ContainerUtils.KEY_VALUE_DELIMITER : "!");
        sb2.append("= null!");
        c.a(sb2.toString(), new Object[0]);
        if (!zIsEmpty || !a()) {
            return zIsEmpty;
        }
        throw new NullPointerException(str + " == null!");
    }
}
