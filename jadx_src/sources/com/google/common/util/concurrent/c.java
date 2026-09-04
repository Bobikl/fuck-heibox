package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
