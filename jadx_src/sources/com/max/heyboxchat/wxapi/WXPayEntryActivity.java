package com.max.heyboxchat.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import bb.c;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import lb.a;

/* JADX INFO: loaded from: classes2.dex */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f74620c = "MicroMsg.SDKSample.WXPayEntryActivity";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IWXAPI f74621b;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.l.E9, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, d.z(this, "xiaoheihe.weixin_appid"));
        this.f74621b = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.handleIntent(getIntent(), this);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, c.l.F9, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        this.f74621b.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        if (PatchProxy.proxy(new Object[]{baseResp}, this, changeQuickRedirect, false, c.l.G9, new Class[]{BaseResp.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction(a.M);
        intent.putExtra("code", baseResp.errCode);
        sendBroadcast(intent);
        finish();
    }
}
