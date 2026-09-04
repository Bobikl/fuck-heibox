package com.google.common.base;

import java.lang.ref.WeakReference;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FinalizableWeakReference.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public abstract class m<T> extends WeakReference<T> implements j {
    protected m(@CheckForNull T t10, k kVar) {
        super(t10, kVar.f56737b);
        kVar.b();
    }
}
