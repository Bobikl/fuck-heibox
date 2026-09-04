package com.google.android.exoplayer2.offline;

import java.io.Closeable;

/* JADX INFO: compiled from: DownloadCursor.java */
/* JADX INFO: loaded from: classes7.dex */
public interface g extends Closeable {
    e H();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    int getPosition();

    boolean isAfterLast();

    boolean isBeforeFirst();

    boolean isClosed();

    boolean isFirst();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToLast();

    boolean moveToNext();

    boolean moveToPosition(int i10);

    boolean moveToPrevious();
}
