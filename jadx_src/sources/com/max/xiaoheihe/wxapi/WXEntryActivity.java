package com.max.xiaoheihe.wxapi;

import android.content.Intent;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.socialize.weixin.view.WXCallbackActivity;
import lb.d;

/* JADX INFO: loaded from: classes13.dex */
public class WXEntryActivity extends WXCallbackActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f96196b;

    private void a(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 49744, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
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
        String strE;
        WebProtocolObj webProtocolObjE0;
        if (PatchProxy.proxy(new Object[]{baseReq}, this, changeQuickRedirect, false, 49743, new Class[]{BaseReq.class}, Void.TYPE).isSupported) {
            return;
        }
        if (baseReq.getType() == 4 && (baseReq instanceof ShowMessageFromWX.Req)) {
            WXMediaMessage wXMediaMessage = ((ShowMessageFromWX.Req) baseReq).message;
            if (System.currentTimeMillis() - this.f96196b > 500) {
                this.f96196b = System.currentTimeMillis();
                String str = wXMediaMessage.messageExt;
                com.max.hbcommon.utils.d.b("zzzzwxlaunch", "extInfo==" + str);
                String strE2 = k.e(str, SwitchDetailActivity.P);
                String strE3 = null;
                if (c.u(strE2) || (webProtocolObjE0 = l0.e0(strE2)) == null) {
                    strE = null;
                } else {
                    strE3 = webProtocolObjE0.valueOf("page_identifier");
                    strE = webProtocolObjE0.valueOf("open_source");
                }
                if (c.u(strE3)) {
                    strE3 = k.e(str, "page_identifier");
                }
                if (c.u(strE)) {
                    strE = k.e(str, "open_source");
                }
                if (!com.max.xiaoheihe.utils.d.J0(this, MainActivity.class)) {
                    Intent intent = new Intent(this, (Class<?>) MainActivity.class);
                    intent.addFlags(268435456);
                    startActivity(intent);
                }
                if (!c.u(strE2)) {
                    b.k0(this, strE2);
                }
                a(strE3, strE);
            }
        }
        super.onReq(baseReq);
    }

    @Override // com.umeng.socialize.weixin.view.WXCallbackActivity, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        if (PatchProxy.proxy(new Object[]{baseResp}, this, changeQuickRedirect, false, 49745, new Class[]{BaseResp.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onResp(baseResp);
    }
}
