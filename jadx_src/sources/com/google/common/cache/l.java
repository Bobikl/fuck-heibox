package com.google.common.cache;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ReferenceEntry.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.c
public interface l<K, V> {
    long getAccessTime();

    int getHash();

    @CheckForNull
    K getKey();

    @CheckForNull
    l<K, V> getNext();

    l<K, V> getNextInAccessQueue();

    l<K, V> getNextInWriteQueue();

    l<K, V> getPreviousInAccessQueue();

    l<K, V> getPreviousInWriteQueue();

    @CheckForNull
    LocalCache.s<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j10);

    void setNextInAccessQueue(l<K, V> lVar);

    void setNextInWriteQueue(l<K, V> lVar);

    void setPreviousInAccessQueue(l<K, V> lVar);

    void setPreviousInWriteQueue(l<K, V> lVar);

    void setValueReference(LocalCache.s<K, V> sVar);

    void setWriteTime(long j10);
}
