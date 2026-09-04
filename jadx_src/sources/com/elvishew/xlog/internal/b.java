package com.elvishew.xlog.internal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f42910a = d();

    /* JADX INFO: compiled from: Platform.java */
    public static class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Map<Class<?>, u7.c<?>> f42911b;

        static {
            HashMap map = new HashMap();
            map.put(Bundle.class, new u7.a());
            map.put(Intent.class, new u7.b());
            f42911b = Collections.unmodifiableMap(map);
        }

        a() {
        }

        @Override // com.elvishew.xlog.internal.b
        Map<Class<?>, u7.c<?>> a() {
            return f42911b;
        }

        @Override // com.elvishew.xlog.internal.b
        com.elvishew.xlog.printer.c b() {
            return new com.elvishew.xlog.printer.a();
        }

        @Override // com.elvishew.xlog.internal.b
        public void c(String str) {
            Log.e("XLog", str);
        }

        @Override // com.elvishew.xlog.internal.b
        String f() {
            return System.lineSeparator();
        }

        @Override // com.elvishew.xlog.internal.b
        public void g(String str) {
            Log.w("XLog", str);
        }
    }

    private static b d() {
        try {
            Class.forName("android.os.Build");
            return new a();
        } catch (ClassNotFoundException unused) {
            return new b();
        }
    }

    public static b e() {
        return f42910a;
    }

    Map<Class<?>, u7.c<?>> a() {
        return Collections.emptyMap();
    }

    com.elvishew.xlog.printer.c b() {
        return new com.elvishew.xlog.printer.b();
    }

    public void c(String str) {
        System.out.println(str);
    }

    @SuppressLint({"NewApi"})
    String f() {
        return System.lineSeparator();
    }

    public void g(String str) {
        System.out.println(str);
    }
}
