package org.apache.tools.ant;

import java.util.function.Supplier;

/* JADX INFO: compiled from: Evaluable.java */
/* JADX INFO: loaded from: classes5.dex */
public interface e1<T> extends Supplier<T> {
    T e();

    @Override // java.util.function.Supplier
    T get();
}
