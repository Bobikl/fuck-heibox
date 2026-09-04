package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: OverflowAvoidingLockSupport.java */
/* JADX INFO: loaded from: classes7.dex */
@u
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f59381a = 2147483647999999999L;

    private a1() {
    }

    static void a(@CheckForNull Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, f59381a));
    }
}
