package com.max.xiaoheihe.module.ads;

import android.text.TextUtils;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.s;
import com.max.xiaoheihe.bean.ADDisplayContentInfo;
import com.max.xiaoheihe.bean.AdsInfoObj;
import com.max.xiaoheihe.bean.AdsInfosObj;
import com.max.xiaoheihe.bean.InnerAdsInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AdsImgDownLoadOperator.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f79466c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f79467d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdsInfosObj f79468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<AdsInfoObj> f79469b = new ArrayList();

    /* JADX INFO: compiled from: AdsImgDownLoadOperator.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdsInfoObj f79470b;

        a(AdsInfoObj adsInfoObj) {
            this.f79470b = adsInfoObj;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list;
            AdsInfoObj adsInfoObj;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25594, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            String url = this.f79470b.getDisplay_content() != null ? this.f79470b.getDisplay_content().getUrl() : this.f79470b.getImg_url();
            String strE = b.e(this.f79470b);
            com.max.hbcommon.utils.d.b("AdsImgDownLoad", "DownloadAdPic runnable");
            synchronized (b.f79467d) {
                if (b.c(b.this, this.f79470b)) {
                    File file = new File(com.max.xiaoheihe.utils.d.Q(), strE);
                    if (file.exists()) {
                        file.delete();
                    }
                    try {
                        try {
                            try {
                                b.this.f79469b.add(this.f79470b);
                                InputStream inputStreamOpenStream = new URL(url).openStream();
                                try {
                                    try {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i10 = inputStreamOpenStream.read(bArr, 0, 1024);
                                                    if (i10 < 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i10);
                                                    messageDigest.update(bArr, 0, i10);
                                                }
                                                b.l(this.f79470b);
                                                com.max.hbcommon.utils.d.b("AdsImgDownLoad", "download success tmpCacheUrl " + url);
                                                fileOutputStream.close();
                                            } catch (Throwable th2) {
                                                fileOutputStream.close();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            inputStreamOpenStream.close();
                                            throw th3;
                                        }
                                    } catch (IllegalStateException unused) {
                                        com.max.hbcommon.utils.d.b("AdsImgDownLoad", "illegalStateException");
                                    }
                                } catch (FileNotFoundException unused2) {
                                    com.max.hbcommon.utils.d.b("AdsImgDownLoad", "file not found");
                                } catch (NoSuchAlgorithmException unused3) {
                                    com.max.hbcommon.utils.d.b("AdsImgDownLoad", "noSuchAlgorithmException");
                                }
                                inputStreamOpenStream.close();
                                list = b.this.f79469b;
                                adsInfoObj = this.f79470b;
                            } catch (Throwable th4) {
                                b.this.f79469b.remove(this.f79470b);
                                throw th4;
                            }
                        } catch (IOException unused4) {
                            com.max.hbcommon.utils.d.b("AdsImgDownLoad", "io error");
                            list = b.this.f79469b;
                            adsInfoObj = this.f79470b;
                        }
                    } catch (MalformedURLException unused5) {
                        com.max.hbcommon.utils.d.b("AdsImgDownLoad", "url error");
                        list = b.this.f79469b;
                        adsInfoObj = this.f79470b;
                    }
                    list.remove(adsInfoObj);
                }
            }
        }
    }

    private b() {
    }

    static /* synthetic */ boolean c(b bVar, AdsInfoObj adsInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, adsInfoObj}, null, changeQuickRedirect, true, 25593, new Class[]{b.class, AdsInfoObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : bVar.k(adsInfoObj);
    }

    public static String e(AdsInfoObj adsInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adsInfoObj}, null, changeQuickRedirect, true, 25592, new Class[]{AdsInfoObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return s.d(adsInfoObj.getAds_id()) + ((adsInfoObj.getDisplay_content() == null || !"video".equals(adsInfoObj.getDisplay_content().getType())) ? "" : ".mp4");
    }

    public static AdsInfoObj f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25588, new Class[]{String.class}, AdsInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AdsInfoObj) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        return (AdsInfoObj) k.a(MMKVManager.f71329a.i(ad.c.f1231k, ad.c.f1232l + str, null, false), AdsInfoObj.class);
    }

    public static AdsInfoObj g(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25586, new Class[]{Boolean.TYPE}, AdsInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AdsInfoObj) patchProxyResultProxy.result;
        }
        AdsInfosObj adsInfosObjA = c.a();
        if (adsInfosObjA.getOpen_screen() == null) {
            return null;
        }
        for (AdsInfoObj adsInfoObj : adsInfosObjA.getOpen_screen()) {
            com.max.hbcommon.utils.d.a("cqtest");
            if (adsInfoObj.getDisplay_content() == null) {
                ADDisplayContentInfo aDDisplayContentInfo = new ADDisplayContentInfo();
                aDDisplayContentInfo.setType("image");
                aDDisplayContentInfo.setUrl(adsInfoObj.getImg_url());
                adsInfoObj.setDisplay_content(aDDisplayContentInfo);
            }
            File file = new File(com.max.xiaoheihe.utils.d.Q(), e(adsInfoObj));
            String start_time = adsInfoObj.getStart_time();
            String end_time = adsInfoObj.getEnd_time();
            long j10 = !TextUtils.isEmpty(start_time) ? Long.parseLong(start_time) * 1000 : 0L;
            long j11 = !TextUtils.isEmpty(end_time) ? Long.parseLong(end_time) * 1000 : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strO = com.max.hbcache.c.o(i(adsInfoObj), "");
            long j12 = !com.max.hbcommon.utils.c.u(strO) ? Long.parseLong(strO) : 0L;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String launch_show_interval = z10 ? adsInfoObj.getLaunch_show_interval() : adsInfoObj.getShow_interval();
            boolean z11 = j12 == 0 || j12 > jCurrentTimeMillis2 || jCurrentTimeMillis2 - j12 > (!com.max.hbcommon.utils.c.u(launch_show_interval) ? n.r(launch_show_interval) * 1000 : 3600000L);
            if (file.exists() && j10 <= jCurrentTimeMillis && jCurrentTimeMillis <= j11 && z11) {
                return adsInfoObj;
            }
        }
        return null;
    }

    public static synchronized b h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25584, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (f79466c == null) {
            f79466c = new b();
        }
        return f79466c;
    }

    public static String i(AdsInfoObj adsInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adsInfoObj}, null, changeQuickRedirect, true, 25590, new Class[]{AdsInfoObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return s.d(adsInfoObj.getAds_id()) + "adsTime";
    }

    public static String j(InnerAdsInfoObj innerAdsInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{innerAdsInfoObj}, null, changeQuickRedirect, true, 25591, new Class[]{InnerAdsInfoObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return s.d(innerAdsInfoObj.getAds_id()) + "innerAdsTime";
    }

    private boolean k(AdsInfoObj adsInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{adsInfoObj}, this, changeQuickRedirect, false, 25589, new Class[]{AdsInfoObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (adsInfoObj == null || this.f79469b.contains(adsInfoObj)) {
            return false;
        }
        AdsInfoObj adsInfoObjF = f(adsInfoObj.getAds_id());
        if (adsInfoObjF != null) {
            String sourceUrlKey = adsInfoObj.getSourceUrlKey();
            String sourceUrlKey2 = adsInfoObjF.getSourceUrlKey();
            if (sourceUrlKey != null && sourceUrlKey.equals(sourceUrlKey2)) {
                return false;
            }
        }
        return true;
    }

    public static void l(AdsInfoObj adsInfoObj) {
        if (PatchProxy.proxy(new Object[]{adsInfoObj}, null, changeQuickRedirect, true, 25587, new Class[]{AdsInfoObj.class}, Void.TYPE).isSupported || adsInfoObj == null || com.max.hbcommon.utils.c.u(adsInfoObj.getAds_id())) {
            return;
        }
        MMKVManager.f71329a.o(ad.c.f1231k, ad.c.f1232l + adsInfoObj.getAds_id(), k.p(adsInfoObj), false);
    }

    public void a(AdsInfosObj adsInfosObj) {
        if (PatchProxy.proxy(new Object[]{adsInfosObj}, this, changeQuickRedirect, false, 25585, new Class[]{AdsInfosObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("AdsImgDownLoad", "DownloadAdPic");
        AdsInfosObj adsInfosObj2 = this.f79468a;
        if (adsInfosObj2 == null || !adsInfosObj2.equals(adsInfosObj)) {
            com.max.hbcommon.utils.d.b("AdsImgDownLoad", "DownloadAdPic inside");
            this.f79468a = adsInfosObj;
            c.c(adsInfosObj);
            List<InnerAdsInfoObj> inner_ads = this.f79468a.getInner_ads();
            if (inner_ads != null) {
                Iterator<InnerAdsInfoObj> it = inner_ads.iterator();
                while (it.hasNext()) {
                    com.max.hbimage.b.j0(it.next().getUrl());
                }
            }
            List<AdsInfoObj> open_screen = this.f79468a.getOpen_screen();
            if (open_screen == null || open_screen.isEmpty()) {
                return;
            }
            Iterator<AdsInfoObj> it2 = open_screen.iterator();
            while (it2.hasNext()) {
                new Thread(new a(it2.next())).start();
            }
        }
    }
}
