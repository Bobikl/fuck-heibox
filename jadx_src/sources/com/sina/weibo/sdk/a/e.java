package com.sina.weibo.sdk.a;

import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends c<Void, Void, String> {

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private com.sina.weibo.sdk.net.c<String> f96808aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private Throwable f96809ab;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f96810ad;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private Oauth2AccessToken f96811af;

    public e(String str, Oauth2AccessToken oauth2AccessToken, com.sina.weibo.sdk.net.c<String> cVar) {
        this.f96810ad = str;
        this.f96811af = oauth2AccessToken;
        this.f96808aa = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sina.weibo.sdk.a.c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String l() {
        try {
            com.sina.weibo.sdk.net.e.a aVar = new com.sina.weibo.sdk.net.e.a();
            aVar.f96831i = "https://api.weibo.com/oauth2/access_token";
            return new com.sina.weibo.sdk.net.b().a(aVar.b(Constants.PARAM_CLIENT_ID, this.f96810ad).b("appKey", this.f96810ad).b("grant_type", "refresh_token").b("refresh_token", this.f96811af.getRefreshToken()).e()).f();
        } catch (Throwable th2) {
            th2.printStackTrace();
            this.f96809ab = th2;
            return null;
        }
    }

    @Override // com.sina.weibo.sdk.a.c
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        Throwable th2 = this.f96809ab;
        if (th2 != null) {
            com.sina.weibo.sdk.net.c<String> cVar = this.f96808aa;
            if (cVar != null) {
                cVar.onError(th2);
                return;
            }
            return;
        }
        com.sina.weibo.sdk.net.c<String> cVar2 = this.f96808aa;
        if (cVar2 != null) {
            cVar2.a(str2);
        }
    }
}
