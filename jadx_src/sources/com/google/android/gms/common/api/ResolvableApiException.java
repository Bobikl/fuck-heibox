package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@n0 Status status) {
        super(status);
    }

    @n0
    public PendingIntent d() {
        return a().c();
    }

    public void e(@n0 Activity activity, int i10) throws IntentSender.SendIntentException {
        a().n(activity, i10);
    }
}
