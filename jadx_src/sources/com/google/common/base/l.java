package com.google.common.base;

import java.lang.ref.SoftReference;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FinalizableSoftReference.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public abstract class l<T> extends SoftReference<T> implements j {
    protected l(@CheckForNull T t10, k kVar) {
        super(t10, kVar.f56737b);
        kVar.b();
    }
}
