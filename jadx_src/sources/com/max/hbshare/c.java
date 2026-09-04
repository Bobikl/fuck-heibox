package com.max.hbshare;

import androidx.annotation.p0;
import com.google.gson.JsonObject;
import com.max.hbsearch.l;
import com.max.hbshare.bean.HBShareReportData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

/* JADX INFO: compiled from: ShareReportUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class c {
    public static final String A = "1";
    public static final String B = "2";
    public static final String C = "3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f72545a = "order_detail";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f72546b = "link";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f72547c = "link_comment";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f72548d = "news";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f72549e = "news_comment";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f72550f = "game_detail";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f72551g = "web";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f72552h = "roll_room";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f72553i = "game_collection";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f72554j = "tag_project";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f72555k = "game_comment";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f72556l = "wiki";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f72557m = "avatar_store";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f72558n = "lottery";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f72559o = "dota2";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f72560p = "steam_friend_code";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f72561q = "steam_screen_shot";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f72562r = "apex_detail";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f72563s = "dac_detail";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f72564t = "destiny2_detail";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f72565u = "ow_detail";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f72566v = "achieve_detail";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f72567w = "achieve_page";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f72568x = "game_detail_screenshot";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f72569y = "link_detail_screenshot";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f72570z = "hashtag_share";

    /* JADX INFO: compiled from: ShareReportUtils.java */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f72571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f72572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f72573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f72574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f72575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JsonObject f72576f;

        public JsonObject b() {
            return this.f72576f;
        }

        public String c() {
            return this.f72571a;
        }

        public String d() {
            return this.f72572b;
        }

        public String e() {
            return this.f72575e;
        }

        public String f() {
            return this.f72573c;
        }

        public String g() {
            return this.f72574d;
        }

        public void h(JsonObject jsonObject) {
            this.f72576f = jsonObject;
        }

        public void i(String str) {
            this.f72571a = str;
        }

        public void j(String str) {
            this.f72572b = str;
        }

        public void k(String str) {
            this.f72575e = str;
        }

        public void l(String str) {
            this.f72573c = str;
        }

        public void m(String str) {
            this.f72574d = str;
        }

        public HBShareReportData n() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33887u9, new Class[0], HBShareReportData.class);
            return patchProxyResultProxy.isSupported ? (HBShareReportData) patchProxyResultProxy.result : new HBShareReportData(e(), b());
        }
    }

    /* JADX INFO: compiled from: ShareReportUtils.java */
    public static class b implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f72577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UMShareListener f72578b;

        public b(String str, UMShareListener uMShareListener) {
            this(str, uMShareListener, null);
        }

        public b(String str, UMShareListener uMShareListener, JsonObject jsonObject) {
            a aVar = new a();
            this.f72577a = aVar;
            aVar.k(str);
            this.f72578b = uMShareListener;
            this.f72577a.h(jsonObject);
        }

        public static void d(String str, @p0 String str2, a aVar) {
            if (PatchProxy.proxy(new Object[]{str, str2, aVar}, null, changeQuickRedirect, true, bb.c.k.f33953x9, new Class[]{String.class, String.class, a.class}, Void.TYPE).isSupported) {
                return;
            }
            c.a(aVar.e(), str, str2, aVar.b());
        }

        public void a(JsonObject jsonObject) {
            if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.k.f33909v9, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f72577a.f72576f = jsonObject;
        }

        public void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33931w9, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f72577a.m(str);
        }

        public void c(String str, @p0 String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.k.f33975y9, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            d(str, str2, this.f72577a);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
            UMShareListener uMShareListener;
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.k.C9, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported || (uMShareListener = this.f72578b) == null) {
                return;
            }
            uMShareListener.onCancel(share_media);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            UMShareListener uMShareListener;
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, bb.c.k.B9, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported || (uMShareListener = this.f72578b) == null) {
                return;
            }
            uMShareListener.onError(share_media, th2);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.k.A9, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            UMShareListener uMShareListener = this.f72578b;
            if (uMShareListener != null) {
                uMShareListener.onResult(share_media);
            }
            c("2", d.i(share_media.name()));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.k.f33997z9, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            UMShareListener uMShareListener = this.f72578b;
            if (uMShareListener != null) {
                uMShareListener.onStart(share_media);
            }
            c("1", d.i(share_media.name()));
        }
    }

    public static void a(String str, String str2, @p0 String str3, @p0 JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, jsonObject}, null, changeQuickRedirect, true, bb.c.k.f33843s9, new Class[]{String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        b(str, str2, str3, jsonObject);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    private static void b(String str, String str2, @p0 String str3, @p0 JsonObject jsonObject) {
        String str4;
        String str5;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, jsonObject}, null, changeQuickRedirect, true, bb.c.k.f33865t9, new Class[]{String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        JsonObject jsonObjectDeepCopy = jsonObject != null ? jsonObject.deepCopy() : new JsonObject();
        if (!com.max.hbcommon.utils.c.u(str)) {
            jsonObjectDeepCopy.addProperty(l.W, str);
        }
        if (!com.max.hbcommon.utils.c.u(str3)) {
            jsonObjectDeepCopy.addProperty("plat", str3);
        }
        str2.hashCode();
        String str6 = "3";
        switch (str2) {
            case "1":
                str6 = "4";
                str4 = lb.d.f131245r5;
                com.max.hbcommon.analytics.d.e(str6, str4, null, null, jsonObjectDeepCopy, null, Boolean.valueOf(str2 != "2").booleanValue());
                break;
            case "2":
                str5 = lb.d.f131252s5;
                str4 = str5;
                com.max.hbcommon.analytics.d.e(str6, str4, null, null, jsonObjectDeepCopy, null, Boolean.valueOf(str2 != "2").booleanValue());
                break;
            case "3":
                str5 = lb.d.f131238q5;
                str4 = str5;
                com.max.hbcommon.analytics.d.e(str6, str4, null, null, jsonObjectDeepCopy, null, Boolean.valueOf(str2 != "2").booleanValue());
                break;
        }
    }
}
