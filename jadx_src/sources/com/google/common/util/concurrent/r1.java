package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r1 {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
