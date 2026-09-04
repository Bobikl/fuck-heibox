package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52308c;

    public GooglePlayServicesRepairableException(int i10, @androidx.annotation.n0 String str, @androidx.annotation.n0 Intent intent) {
        super(str, intent);
        this.f52308c = i10;
    }

    public int b() {
        return this.f52308c;
    }
}
