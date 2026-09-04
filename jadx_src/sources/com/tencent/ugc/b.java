package com.tencent.ugc;

import com.tencent.liteav.sdk.common.LicenseChecker;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements LicenseChecker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f103319a = new b();

    private b() {
    }

    public static LicenseChecker.b a() {
        return f103319a;
    }

    @Override // com.tencent.liteav.sdk.common.LicenseChecker.b
    public final void a(int i10, String str) {
        TXUGCBase.lambda$setLicence$0(i10, str);
    }
}
