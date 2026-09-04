package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d0 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakReference f52409d = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f52410c;

    d0(byte[] bArr) {
        super(bArr);
        this.f52410c = f52409d;
    }

    @Override // com.google.android.gms.common.b0
    final byte[] f1() {
        byte[] bArrQ1;
        synchronized (this) {
            bArrQ1 = (byte[]) this.f52410c.get();
            if (bArrQ1 == null) {
                bArrQ1 = q1();
                this.f52410c = new WeakReference(bArrQ1);
            }
        }
        return bArrQ1;
    }

    protected abstract byte[] q1();
}
