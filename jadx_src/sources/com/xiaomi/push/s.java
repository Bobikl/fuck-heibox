package com.xiaomi.push;

import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class s {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f107826a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final StringBuilder f943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f107827b;

        public a() {
            this(":", Constants.ACCEPT_TIME_SEPARATOR_SP);
        }

        public a(String str, String str2) {
            this.f943a = new StringBuilder();
            this.f107826a = str;
            this.f107827b = str2;
        }

        public a a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f943a.length() > 0) {
                    this.f943a.append(this.f107827b);
                }
                StringBuilder sb2 = this.f943a;
                sb2.append(str);
                sb2.append(this.f107826a);
                sb2.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f943a.toString();
        }
    }

    public static int a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i10;
        }
    }

    public static long a(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return j10;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j10;
        }
    }

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static int b(String str, int i10) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i10 : i10;
    }
}
