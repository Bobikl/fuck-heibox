package com.bytedance.sdk.open.tt;

import android.content.Context;
import com.bytedance.sdk.open.aweme.base.BaseCheckHelperImpl;

/* JADX INFO: loaded from: classes6.dex */
public class e extends BaseCheckHelperImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f42282a = "share.SystemShareActivity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f42283b = "openshare.ShareToContactsActivity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f42284c = "openability.CommonAbilityActivity";

    public e(Context context) {
        super(context);
    }

    public int a() {
        return 6;
    }

    public boolean b(int i10) {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), f42284c, l7.a.a(i10));
    }

    public boolean c() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), f42282a, 2);
    }

    public boolean d() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), f42282a, 2);
    }

    public boolean e() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), getRemoteAuthEntryActivity(), 7);
    }

    public boolean f() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), getRemoteAuthEntryActivity(), 9);
    }

    public boolean g() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), "opensdk.OpenCameraActivity", 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.base.BaseCheckHelperImpl
    public int getAuthRequestApi() {
        return 1;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IAPPCheckHelper
    public String getPackageName() {
        return "com.ss.android.ugc.aweme";
    }

    @Override // com.bytedance.sdk.open.aweme.base.BaseCheckHelperImpl
    public String getSignature() {
        return "aea615ab910015038f73c47e45d21466";
    }

    public boolean h() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), f42283b, 2);
    }

    public boolean i() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), f42283b, 1);
    }

    public boolean j() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), getRemoteAuthEntryActivity(), 8);
    }

    public boolean k() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), getRemoteAuthEntryActivity(), a()) && validateSign();
    }
}
