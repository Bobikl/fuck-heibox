package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f60534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Intent f60536c;

    DialogRedirectImpl(Intent intent, Activity activity, int i10) {
        this.f60536c = intent;
        this.f60534a = activity;
        this.f60535b = i10;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Intent intent = this.f60536c;
        if (intent != null) {
            this.f60534a.startActivityForResult(intent, this.f60535b);
        }
    }
}
