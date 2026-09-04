package com.uber.autodispose.lifecycle;

import com.uber.autodispose.OutsideScopeException;
import kh.o;

/* JADX INFO: compiled from: CorrespondingEventsFunction.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a<E> extends o<E, E> {
    @Override // kh.o
    E apply(E e10) throws OutsideScopeException;
}
