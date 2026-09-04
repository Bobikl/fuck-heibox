package com.sina.weibo.sdk.a;

import android.content.Context;
import com.sina.weibo.sdk.net.HttpManager;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends c<Void, Void, String> {
    private Context Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private com.sina.weibo.sdk.net.c<String> f96803aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private Throwable f96804ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private String f96805ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f96806ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private String f96807ae;

    public d(Context context, String str, String str2, String str3, com.sina.weibo.sdk.net.c<String> cVar) {
        this.Z = context;
        this.f96805ac = str;
        this.f96806ad = str2;
        this.f96807ae = str3;
        this.f96803aa = cVar;
    }

    private String d(String str) {
        return HttpManager.a(this.Z, "", this.f96807ae, this.f96806ad, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sina.weibo.sdk.a.c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String l() {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            com.sina.weibo.sdk.net.e.a aVar = new com.sina.weibo.sdk.net.e.a();
            aVar.f96831i = "https://service.weibo.com/share/mobilesdk_uppic.php";
            return new com.sina.weibo.sdk.net.b().a(aVar.a("oauth_timestamp", strValueOf).a("oauth_sign", d(strValueOf)).b("appKey", this.f96806ad).b("oauth_timestamp", strValueOf).b("oauth_sign", d(strValueOf)).b(SocialConstants.PARAM_IMG_URL, this.f96805ac).e()).f();
        } catch (Throwable th2) {
            th2.printStackTrace();
            this.f96804ab = th2;
            return null;
        }
    }

    @Override // com.sina.weibo.sdk.a.c
    protected final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        Throwable th2 = this.f96804ab;
        if (th2 != null) {
            com.sina.weibo.sdk.net.c<String> cVar = this.f96803aa;
            if (cVar != null) {
                cVar.onError(th2);
                return;
            }
            return;
        }
        com.sina.weibo.sdk.net.c<String> cVar2 = this.f96803aa;
        if (cVar2 != null) {
            cVar2.a(str2);
        }
    }
}
