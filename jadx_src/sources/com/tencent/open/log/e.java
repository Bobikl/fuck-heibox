package com.tencent.open.log;

import android.util.Log;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Tracer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f101141a = new e();

    @Override // com.tencent.open.log.Tracer
    protected void doTrace(int i10, Thread thread, long j10, String str, String str2, Throwable th2) {
        if (i10 == 1) {
            Log.v(str, str2, th2);
            return;
        }
        if (i10 == 2) {
            Log.d(str, str2, th2);
            return;
        }
        if (i10 == 4) {
            Log.i(str, str2, th2);
            return;
        }
        if (i10 == 8) {
            Log.w(str, str2, th2);
        } else if (i10 == 16) {
            Log.e(str, str2, th2);
        } else {
            if (i10 != 32) {
                return;
            }
            Log.e(str, str2, th2);
        }
    }
}
