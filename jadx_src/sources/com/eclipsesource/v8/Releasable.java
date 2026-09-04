package com.eclipsesource.v8;

import java.io.Closeable;

/* JADX INFO: loaded from: classes6.dex */
public interface Releasable extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void release();
}
