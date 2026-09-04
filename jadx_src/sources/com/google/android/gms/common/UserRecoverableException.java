package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class UserRecoverableException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f52309b;

    public UserRecoverableException(@androidx.annotation.n0 String str, @androidx.annotation.n0 Intent intent) {
        super(str);
        this.f52309b = intent;
    }

    @androidx.annotation.n0
    public Intent a() {
        return new Intent(this.f52309b);
    }
}
