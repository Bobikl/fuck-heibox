package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f103603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TXRecordCommon.ITXVideoRecordListener f103604e;

    private fb(int i10, String str, String str2, String str3, TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f103600a = i10;
        this.f103601b = str;
        this.f103602c = str2;
        this.f103603d = str3;
        this.f103604e = iTXVideoRecordListener;
    }

    public static Runnable a(int i10, String str, String str2, String str3, TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        return new fb(i10, str, str2, str3, iTXVideoRecordListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCRecorderJni.lambda$onRecordComplete$0(this.f103600a, this.f103601b, this.f103602c, this.f103603d, this.f103604e);
    }
}
