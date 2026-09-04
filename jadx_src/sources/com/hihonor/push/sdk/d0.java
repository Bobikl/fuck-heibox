package com.hihonor.push.sdk;

import android.os.Looper;
import android.util.Log;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class d0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f60012a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile IPushInvoke f60013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.a f60014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0 f60015d;

    public d0(b0.a aVar) {
        this.f60014c = aVar;
    }

    public final void a(int i10) {
        Log.i("PushConnectionClient", "notifyFailed result: " + i10);
        b0.a aVar = this.f60014c;
        if (aVar != null) {
            z.a aVar2 = (z.a) aVar;
            if (Looper.myLooper() == z.this.f60109a.getLooper()) {
                aVar2.a(HonorPushErrorEnum.fromCode(i10));
            } else {
                z.this.f60109a.post(new y(aVar2, i10));
            }
        }
    }

    public boolean a() {
        return this.f60012a.get() == 3 || this.f60012a.get() == 4;
    }
}
