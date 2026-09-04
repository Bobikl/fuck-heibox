package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.n0;
import com.google.android.gms.common.api.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g<R extends e> implements f<R> {
    @Override // com.google.android.gms.common.api.f
    @v8.a
    public final void a(@n0 R r10) {
        Status statusA = r10.a();
        if (statusA.l()) {
            c(r10);
            return;
        }
        b(statusA);
        if (r10 instanceof b) {
            try {
                ((b) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    public abstract void b(@n0 Status status);

    public abstract void c(@n0 R r10);
}
