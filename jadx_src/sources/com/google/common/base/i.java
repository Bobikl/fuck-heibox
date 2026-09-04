package com.google.common.base;

import java.lang.ref.PhantomReference;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FinalizablePhantomReference.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public abstract class i<T> extends PhantomReference<T> implements j {
    protected i(@CheckForNull T t10, k kVar) {
        super(t10, kVar.f56737b);
        kVar.b();
    }
}
