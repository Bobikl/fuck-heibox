package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public interface d {
    @v8.a
    boolean A2();

    @v8.a
    void K1(@n0 String str, @n0 LifecycleCallback lifecycleCallback);

    @v8.a
    boolean L0();

    @v8.a
    @p0
    <T extends LifecycleCallback> T V(@n0 String str, @n0 Class<T> cls);

    @v8.a
    @p0
    Activity a1();

    @v8.a
    void startActivityForResult(@n0 Intent intent, int i10);
}
