package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.n0;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c<R extends e> extends g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f52367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52368b;

    protected c(@n0 Activity activity, int i10) {
        p.m(activity, "Activity must not be null");
        this.f52367a = activity;
        this.f52368b = i10;
    }

    @Override // com.google.android.gms.common.api.g
    @v8.a
    public final void b(@n0 Status status) {
        if (!status.h()) {
            d(status);
            return;
        }
        try {
            status.n(this.f52367a, this.f52368b);
        } catch (IntentSender.SendIntentException e10) {
            Log.e("ResolvingResultCallback", "Failed to start resolution", e10);
            d(new Status(8));
        }
    }

    @Override // com.google.android.gms.common.api.g
    public abstract void c(@n0 R r10);

    public abstract void d(@n0 Status status);
}
