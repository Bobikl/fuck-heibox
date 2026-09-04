package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ContextUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c {
    @p0
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
