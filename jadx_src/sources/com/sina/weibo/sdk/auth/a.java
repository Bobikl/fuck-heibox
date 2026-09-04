package com.sina.weibo.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.b.c;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.net.h;
import com.sina.weibo.sdk.web.WebActivity;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.bean.HandlerRequestCode;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WbAuthListener f96813d;

    public final void a(Activity activity) {
        c.a("WBSsoTag", "startClientAuth()");
        try {
            com.sina.weibo.sdk.b.a.C0922a c0922aE = com.sina.weibo.sdk.b.a.e(activity);
            Intent intent = new Intent();
            if (c0922aE == null) {
                intent.setClassName(BuildConfig.APPLICATION_ID, "com.sina.weibo.SSOActivity");
            } else {
                intent.setClassName(c0922aE.packageName, c0922aE.f96816ag);
            }
            AuthInfo authInfoA = com.sina.weibo.sdk.a.a();
            intent.putExtra("appKey", authInfoA.getAppKey());
            intent.putExtra("redirectUri", authInfoA.getRedirectUrl());
            intent.putExtra("scope", authInfoA.getScope());
            intent.putExtra("packagename", authInfoA.getPackageName());
            intent.putExtra("key_hash", authInfoA.getHash());
            intent.putExtra("_weibo_command_type", 3);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            intent.putExtra("_weibo_transaction", sb2.toString());
            if (activity == null) {
                this.f96813d.onError(new UiError(-1, "activity is null", ""));
            } else if (!com.sina.weibo.sdk.b.a.a(activity, intent)) {
                this.f96813d.onError(new UiError(-2, "your app is illegal", ""));
            } else {
                activity.startActivityForResult(intent, HandlerRequestCode.SINA_AUTH_REQUEST_CODE);
                c.a("WBSsoTag", "start SsoActivity ");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c.b("WBSsoTag", e10.getMessage());
            this.f96813d.onError(new UiError(-3, "occur exception", e10.getMessage()));
        }
    }

    public final void b(Activity activity) {
        h hVar = new h();
        AuthInfo authInfoA = com.sina.weibo.sdk.a.a();
        if (authInfoA == null) {
            return;
        }
        hVar.put(Constants.PARAM_CLIENT_ID, authInfoA.getAppKey());
        hVar.put(i7.a.i.f119307b, authInfoA.getRedirectUrl());
        hVar.put("scope", authInfoA.getScope());
        hVar.put("packagename", authInfoA.getPackageName());
        hVar.put("key_hash", authInfoA.getHash());
        hVar.put(i7.a.i.f119306a, "code");
        hVar.put("version", "0041005000");
        hVar.put("luicode", "10000360");
        hVar.put("lfid", AssistPushConsts.OPPO_PREFIX + authInfoA.getAppKey());
        Oauth2AccessToken accessToken = AccessTokenHelper.readAccessToken(activity);
        if (accessToken != null) {
            String accessToken2 = accessToken.getAccessToken();
            if (!TextUtils.isEmpty(accessToken.getAccessToken())) {
                hVar.put("trans_token", accessToken2);
                hVar.put("trans_access_token", accessToken2);
            }
        }
        String str = "https://open.weibo.cn/oauth2/authorize?" + hVar.g();
        if (this.f96813d != null) {
            b bVarB = b.b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            String string = sb2.toString();
            bVarB.a(string, this.f96813d);
            Intent intent = new Intent(activity, (Class<?>) WebActivity.class);
            com.sina.weibo.sdk.web.b.a aVar = new com.sina.weibo.sdk.web.b.a(authInfoA, str, string);
            Bundle bundle = new Bundle();
            aVar.writeToBundle(bundle);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }
}
