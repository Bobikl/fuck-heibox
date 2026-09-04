package com.max.xiaoheihe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.GameCompilationDetailActivity;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.mall.MallOrderDetailActivity;
import com.max.xiaoheihe.module.news.SubjectDetailActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes3.dex */
public class RouterActivity extends BaseActivity {
    private static final String L = "c2hhcmU=";
    public static ChangeQuickRedirect changeQuickRedirect;

    private void N1(Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.m.Yt, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("handleHeyboxChatDeeplink, uri :" + uri);
        if (!i0.s()) {
            com.max.xiaoheihe.utils.d.I1(this);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putString("deeplink", uri.toString());
        }
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1(Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.m.bu, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        R1(uri);
    }

    private void Q1(JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.m.au, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.e("1", lb.d.f131126a5, null, null, jsonObject, null, true);
    }

    private void R1(Uri uri) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.m.Zt, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzscheme", "uri==" + uri.toString());
        if (!"1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            startActivity(new Intent(this, (Class<?>) SplashActivity.class));
            finish();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        if (!com.max.xiaoheihe.utils.d.J0(this.f66601b, MainActivity.class)) {
            startActivity(intent);
        }
        try {
            String host = uri.getHost();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("host", host);
            com.max.hbcommon.analytics.d.e("1", lb.d.f131133b5, null, null, jsonObject, null, true);
            String strZ = com.max.xiaoheihe.utils.d.z(BaseApplication.a(), "APP_HOST");
            if (strZ == null) {
                strZ = "c.xiaoheihe.cn";
            }
            com.sankuai.waimai.router.common.c cVarR = null;
            if (strZ.equals(host)) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("url", uri.toString());
                String queryParameter = uri.getQueryParameter("open_source");
                String queryParameter2 = uri.getQueryParameter("page_identifier");
                if (!com.max.hbcommon.utils.c.u(queryParameter)) {
                    jsonObject2.addProperty("open_source", queryParameter);
                }
                if (!com.max.hbcommon.utils.c.u(queryParameter2)) {
                    jsonObject2.addProperty("page_identifier", queryParameter2);
                }
                Q1(jsonObject2);
                com.max.xiaoheihe.base.router.b.k0(this.f66601b, uri.toString());
            } else {
                if ("video".equals(host)) {
                    BBSLinkObj bBSLinkObj = new BBSLinkObj();
                    bBSLinkObj.setLinkid(uri.getQueryParameter("link_id"));
                    bBSLinkObj.setLink_tag(uri.getQueryParameter("link_tag"));
                    bBSLinkObj.setHas_video("1");
                    bBSLinkObj.setH_src(L);
                    com.max.xiaoheihe.module.bbs.utils.b.E(this.f66601b, bBSLinkObj);
                } else {
                    if ("opengame".equals(host)) {
                        intent = z.b(this.f66601b, uri.getQueryParameter("h_src"), uri.getQueryParameter("appid"), uri.getQueryParameter(ChannelsDetailActivity.V3), null, i0.m(), i0.j(), null);
                    } else if ("gameAlbum".equals(host)) {
                        GameListHeaderObj gameListHeaderObj = new GameListHeaderObj();
                        gameListHeaderObj.setCompilation_id(uri.getQueryParameter("id"));
                        intent = GameCompilationDetailActivity.r2(this.f66601b, gameListHeaderObj);
                    } else if ("link".equals(host) || "rollRoom".equals(host)) {
                        BBSLinkObj bBSLinkObj2 = new BBSLinkObj();
                        bBSLinkObj2.setLinkid(uri.getQueryParameter("link_id"));
                        bBSLinkObj2.setLink_tag(uri.getQueryParameter("link_tag"));
                        if ("link".equals(host)) {
                            bBSLinkObj2.setH_src(L);
                        }
                        com.max.xiaoheihe.module.bbs.utils.b.E(this.f66601b, bBSLinkObj2);
                    } else if ("web".equals(host)) {
                        String queryParameter3 = uri.getQueryParameter("url");
                        String queryParameter4 = uri.getQueryParameter("title");
                        Intent intent2 = new Intent(this.f66601b, (Class<?>) WebActionActivity.class);
                        intent2.putExtra("pageurl", queryParameter3);
                        intent2.putExtra("title", queryParameter4);
                        intent = intent2;
                    } else if ("newsTopic".equals(host)) {
                        intent = SubjectDetailActivity.b2(this.f66601b, uri.getQueryParameter("topic_id"));
                    } else if (MallOrderDetailActivity.T3.equals(host)) {
                        cVarR = com.max.xiaoheihe.base.router.b.R(this.f66601b, uri.getQueryParameter("order_id"), false);
                    } else if ("opengamecenter".equals(host)) {
                        com.max.xiaoheihe.module.littleprogram.b.n(this.f66601b, null);
                    } else {
                        WebProtocolObj webProtocolObjE0 = l0.e0(uri.toString());
                        if (webProtocolObjE0 != null) {
                            JsonObject jsonObject3 = new JsonObject();
                            String strValueOf = webProtocolObjE0.valueOf("open_source");
                            String strValueOf2 = webProtocolObjE0.valueOf("page_identifier");
                            if (!com.max.hbcommon.utils.c.u(strValueOf)) {
                                jsonObject3.addProperty("open_source", strValueOf);
                            }
                            if (!com.max.hbcommon.utils.c.u(strValueOf2)) {
                                jsonObject3.addProperty("page_identifier", strValueOf2);
                            }
                            jsonObject3.addProperty("url", uri.toString());
                            Q1(jsonObject3);
                        }
                        AccelWorldStringKt.d(uri.toString());
                    }
                    z10 = false;
                }
                z10 = true;
            }
            if (!z10) {
                if (cVarR != null) {
                    cVarR.A();
                } else {
                    startActivity(intent);
                }
            }
            finish();
        } catch (NullPointerException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Xt, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final Uri data = getIntent().getData();
        Z0().post(new Runnable() { // from class: com.max.xiaoheihe.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f94821b.O1(data);
            }
        });
    }
}
