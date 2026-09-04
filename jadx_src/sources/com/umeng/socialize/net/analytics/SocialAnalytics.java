package com.umeng.socialize.net.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.net.base.SocializeClient;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.net.verify.VerifyReqeust;
import com.umeng.socialize.net.verify.VerifyResponse;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class SocialAnalytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SocializeClient f106295a = new SocializeClient();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f106296b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: com.umeng.socialize.net.analytics.SocialAnalytics$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f106297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f106298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f106299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UMediaObject f106300d;

        AnonymousClass1(Context context, String str, String str2, UMediaObject uMediaObject) {
            this.f106297a = context;
            this.f106298b = str;
            this.f106299c = str2;
            this.f106300d = uMediaObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnalyticsReqeust analyticsReqeust = new AnalyticsReqeust(this.f106297a, this.f106298b, this.f106299c);
            analyticsReqeust.setMedia(this.f106300d);
            analyticsReqeust.setReqType(1);
            AnalyticsResponse analyticsResponse = (AnalyticsResponse) SocialAnalytics.f106295a.execute(analyticsReqeust);
            if (analyticsResponse == null || !analyticsResponse.isOk()) {
                SLog.debug(UmengText.NET.SHARESELFFAIL);
            } else {
                SLog.debug(UmengText.NET.SHARESELFOK);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.socialize.net.analytics.SocialAnalytics$2, reason: invalid class name */
    public static final class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f106301a;

        AnonymousClass2(Context context) {
            this.f106301a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            VerifyResponse verifyResponse = (VerifyResponse) SocialAnalytics.f106295a.execute(new VerifyReqeust(this.f106301a, "https://ai.login.umeng.com/api/umed/event", VerifyResponse.class, URequest.RequestMethod.POST));
            if (verifyResponse == null || !verifyResponse.isOk()) {
                SLog.debug("VerifyReqeust Fail");
                return;
            }
            SLog.debug("VerifyReqeust Success");
            SharedPreferences.Editor editorEdit = this.f106301a.getSharedPreferences("umeng_verify", 0).edit();
            editorEdit.remove("verify_log");
            editorEdit.commit();
        }
    }

    private static void a(Context context, String str, Map<String, String> map) {
    }

    private static void a(Runnable runnable) {
    }

    public static void authendt(Context context, SHARE_MEDIA share_media, String str, boolean z10, String str2, String str3, Map<String, String> map) {
    }

    public static void authstart(Context context, SHARE_MEDIA share_media, String str, boolean z10, String str2) {
    }

    public static void dauStats(Context context, boolean z10) {
    }

    public static void getInfoendt(Context context, SHARE_MEDIA share_media, String str, String str2, String str3, Map<String, String> map) {
    }

    public static void getInfostart(Context context, SHARE_MEDIA share_media, String str) {
    }

    public static void log(Context context, String str, String str2, UMediaObject uMediaObject) {
    }

    public static void shareend(Context context, SHARE_MEDIA share_media, String str, String str2, String str3) {
    }

    public static void verifyStats(Context context) {
    }
}
