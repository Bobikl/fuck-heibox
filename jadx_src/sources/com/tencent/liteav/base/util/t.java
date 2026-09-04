package com.tencent.liteav.base.util;

import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f99736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Callable<T> f99737b;

    public t(Callable<T> callable) {
        this.f99737b = callable;
    }

    public final T a() {
        T t10 = this.f99736a;
        if (t10 instanceof String) {
            if (!TextUtils.isEmpty((CharSequence) t10)) {
                return this.f99736a;
            }
        } else if (t10 != null) {
            return t10;
        }
        synchronized (this) {
            T t11 = this.f99736a;
            if (t11 instanceof String) {
                if (!TextUtils.isEmpty((CharSequence) t11)) {
                    return this.f99736a;
                }
            } else if (t11 != null) {
                return t11;
            }
            try {
                this.f99736a = this.f99737b.call();
            } catch (Exception e10) {
                e10.printStackTrace();
                LiteavLog.e("Stash", "Get value failed. msg:" + e10.getMessage());
            }
            return this.f99736a;
        }
    }

    public final void a(T t10) {
        synchronized (this) {
            this.f99736a = t10;
        }
    }
}
