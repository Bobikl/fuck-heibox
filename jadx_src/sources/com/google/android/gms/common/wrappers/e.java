package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;
import z8.d0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f52655b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private d f52656a = null;

    @n0
    @v8.a
    public static d a(@n0 Context context) {
        return f52655b.b(context);
    }

    @n0
    @d0
    public final synchronized d b(@n0 Context context) {
        if (this.f52656a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f52656a = new d(context);
        }
        return this.f52656a;
    }
}
