package com.max.heyboxchat.wxapi;

import android.content.Intent;
import bb.c;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.socialize.weixin.view.WXCallbackActivity;
import lb.d;

/* JADX INFO: loaded from: classes2.dex */
public class WXEntryActivity extends WXCallbackActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f74619b;

    private void a(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.l.C9, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("page_identifier", str);
        jsonObject.addProperty("open_source", str2);
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        pageEventObj.setPath(d.f131126a5);
        pageEventObj.setType("1");
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    @Override // com.umeng.socialize.weixin.view.WXCallbackActivity, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        if (PatchProxy.proxy(new Object[]{baseReq}, this, changeQuickRedirect, false, c.l.B9, new Class[]{BaseReq.class}, Void.TYPE).isSupported) {
            return;
        }
        if (baseReq.getType() == 4 && (baseReq instanceof ShowMessageFromWX.Req)) {
            WXMediaMessage wXMediaMessage = ((ShowMessageFromWX.Req) baseReq).message;
            if (System.currentTimeMillis() - this.f74619b > 500) {
                this.f74619b = System.currentTimeMillis();
                String str = wXMediaMessage.messageExt;
                com.max.hbcommon.utils.d.b("zzzzwxlaunch", "extInfo==" + str);
                String strE = k.e(str, SwitchDetailActivity.P);
                String strE2 = k.e(str, "page_identifier");
                String strE3 = k.e(str, "open_source");
                if (!com.max.xiaoheihe.utils.d.J0(this, MainActivity.class)) {
                    Intent intent = new Intent(this, (Class<?>) MainActivity.class);
                    intent.addFlags(268435456);
                    startActivity(intent);
                }
                if (!com.max.hbcommon.utils.c.u(strE)) {
                    b.k0(this, strE);
                }
                a(strE2, strE3);
            }
        }
        super.onReq(baseReq);
    }

    @Override // com.umeng.socialize.weixin.view.WXCallbackActivity, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        if (PatchProxy.proxy(new Object[]{baseResp}, this, changeQuickRedirect, false, c.l.D9, new Class[]{BaseResp.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onResp(baseResp);
    }
}
