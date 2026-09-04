package com.hihonor.push.sdk;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60098b;

    public w(String str) {
        this.f60097a = str;
        this.f60098b = a(str);
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static w a(String str) {
        return new w(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f60097a, ((w) obj).f60097a);
    }

    public final int hashCode() {
        return this.f60098b;
    }
}
