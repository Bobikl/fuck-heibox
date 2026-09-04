package com.tencent.liteav.base.system;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements com.tencent.liteav.base.util.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f99674a = new i();

    private i() {
    }

    public static com.tencent.liteav.base.util.j.a a() {
        return f99674a;
    }

    @Override // com.tencent.liteav.base.util.j.a
    public final void a(boolean z10) {
        LiteavSystemInfo.onAppBackgroundStateChanged(z10);
    }
}
