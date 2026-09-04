package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class NativeOnCompleteListener implements e<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f52748a;

    @v8.a
    public NativeOnCompleteListener(long j10) {
        this.f52748a = j10;
    }

    @v8.a
    public static void b(@androidx.annotation.n0 k<Object> kVar, long j10) {
        kVar.e(new NativeOnCompleteListener(j10));
    }

    @Override // com.google.android.gms.tasks.e
    @v8.a
    public void a(@androidx.annotation.n0 k<Object> kVar) {
        Object objR;
        String message;
        Exception excQ;
        if (kVar.v()) {
            objR = kVar.r();
            message = null;
        } else if (kVar.t() || (excQ = kVar.q()) == null) {
            objR = null;
            message = null;
        } else {
            message = excQ.getMessage();
            objR = null;
        }
        nativeOnComplete(this.f52748a, objR, kVar.v(), kVar.t(), message);
    }

    @v8.a
    public native void nativeOnComplete(long j10, @androidx.annotation.p0 Object obj, boolean z10, boolean z11, @androidx.annotation.p0 String str);
}
