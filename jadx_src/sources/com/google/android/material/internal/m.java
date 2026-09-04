package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import com.google.android.material.internal.m;

/* JADX INFO: compiled from: MaterialCheckable.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface m<T extends m<T>> extends Checkable {

    /* JADX INFO: compiled from: MaterialCheckable.java */
    public interface a<C> {
        void a(C c10, boolean z10);
    }

    @androidx.annotation.d0
    int getId();

    void setInternalOnCheckedChangeListener(@p0 a<T> aVar);
}
