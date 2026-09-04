package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.n0;
import com.google.android.gms.common.internal.g;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f52593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52594d;

    @v8.a
    public a(@n0 String str, @n0 String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f52592b = string;
        this.f52591a = str;
        this.f52593c = new g(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f52591a, i10)) {
            i10++;
        }
        this.f52594d = i10;
    }

    @v8.a
    public void a(@n0 String str, @n0 Object... objArr) {
        if (g(3)) {
            Log.d(this.f52591a, d(str, objArr));
        }
    }

    @v8.a
    public void b(@n0 String str, @n0 Throwable th2, @n0 Object... objArr) {
        Log.e(this.f52591a, d(str, objArr), th2);
    }

    @v8.a
    public void c(@n0 String str, @n0 Object... objArr) {
        Log.e(this.f52591a, d(str, objArr));
    }

    @n0
    @v8.a
    protected String d(@n0 String str, @n0 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f52592b.concat(str);
    }

    @n0
    @v8.a
    public String e() {
        return this.f52591a;
    }

    @v8.a
    public void f(@n0 String str, @n0 Object... objArr) {
        Log.i(this.f52591a, d(str, objArr));
    }

    @v8.a
    public boolean g(int i10) {
        return this.f52594d <= i10;
    }

    @v8.a
    public void h(@n0 String str, @n0 Throwable th2, @n0 Object... objArr) {
        if (g(2)) {
            Log.v(this.f52591a, d(str, objArr), th2);
        }
    }

    @v8.a
    public void i(@n0 String str, @n0 Object... objArr) {
        if (g(2)) {
            Log.v(this.f52591a, d(str, objArr));
        }
    }

    @v8.a
    public void j(@n0 String str, @n0 Object... objArr) {
        Log.w(this.f52591a, d(str, objArr));
    }

    @v8.a
    public void k(@n0 String str, @n0 Throwable th2, @n0 Object... objArr) {
        Log.wtf(this.f52591a, d(str, objArr), th2);
    }

    @v8.a
    public void l(@n0 Throwable th2) {
        Log.wtf(this.f52591a, th2);
    }
}
