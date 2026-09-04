package com.max.xiaoheihe;

import android.content.Intent;
import android.os.Bundle;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.message.UmengNotifyClickActivity;

/* JADX INFO: loaded from: classes3.dex */
public class UpushNotifyClickActivity extends UmengNotifyClickActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f76423b = "com.max.xiaoheihe.UpushNotifyClickActivity";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.umeng.message.UmengNotifyClickActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.m.Mu, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        t.v(this);
        setContentView(R.layout.activity_welcome);
    }

    @Override // com.umeng.message.UmengNotifyClickActivity
    public void onMessage(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, bb.c.m.Nu, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onMessage(intent);
        String strE = com.max.hbutils.utils.k.e(intent.getStringExtra("body"), "extra");
        com.max.hbcommon.utils.d.b("zzzzupush", "UpushNotifyClickActivity onMessage  ==" + strE);
        v.g(this, strE);
        finish();
    }
}
