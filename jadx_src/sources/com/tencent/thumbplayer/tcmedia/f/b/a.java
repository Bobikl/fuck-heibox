package com.tencent.thumbplayer.tcmedia.f.b;

import ad.c;
import android.os.SystemClock;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.i;
import com.tencent.thumbplayer.tcmedia.utils.l;
import com.tencent.thumbplayer.tcmedia.utils.m;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class a implements com.tencent.thumbplayer.tcmedia.tplayer.plugins.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f102633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TPRichMediaFeature[] f102634d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    m f102631a = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102635e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f102636f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102637g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f102638h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<b> f102639i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<Integer, C1022a> f102640j = new HashMap();

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b.a$a, reason: collision with other inner class name */
    public static class C1022a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f102642b;

        private C1022a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f102645c;

        private b() {
        }
    }

    private void a(int i10) {
        this.f102635e++;
        b bVar = new b();
        bVar.f102643a = i10;
        bVar.f102644b = this.f102635e;
        bVar.f102645c = SystemClock.elapsedRealtime();
        this.f102639i.add(bVar);
    }

    private void a(int i10, int i11) {
        b(i10, i11);
        c(i10, i11);
    }

    private void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
        aVar.a("url", this.f102633c);
        aVar.a("flowid", this.f102632b);
        aVar.a(TPDownloadProxyEnum.USER_GUID, TPPlayerConfig.getGuid());
        aVar.a("appplatform", TPPlayerConfig.getPlatform());
        aVar.a(c.f1243w, i.b());
    }

    private void a(C1022a c1022a, String str, int i10) {
        l lVar = new l();
        lVar.a("duration", SystemClock.elapsedRealtime() - c1022a.f102642b);
        lVar.a("code", i10);
        lVar.a("seq", c1022a.f102641a);
        lVar.a("featuretype", str);
        lVar.a(CommonNetImpl.POSITION, this.f102637g);
        a("rich_media_feature_data_callback", lVar);
    }

    private void a(b bVar, String str, int i10) {
        l lVar = new l();
        lVar.a("duration", SystemClock.elapsedRealtime() - bVar.f102645c);
        lVar.a("code", i10);
        lVar.a("seq", bVar.f102644b);
        lVar.a("featuretype", str);
        lVar.a(CommonNetImpl.POSITION, this.f102637g);
        a("rich_media_feature_select", lVar);
    }

    private void a(Object obj) {
        if (obj instanceof TPRichMediaFeature[]) {
            this.f102634d = (TPRichMediaFeature[]) obj;
        }
        l(0);
    }

    private void a(String str) {
        this.f102632b = UUID.randomUUID().toString() + System.nanoTime() + lg.a.f131412e + TPPlayerConfig.getPlatform();
        this.f102633c = str;
    }

    private void a(String str, com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
        a(aVar);
    }

    private void b(int i10) {
        b(i10, 0);
        if (this.f102640j.containsKey(Integer.valueOf(i10))) {
            return;
        }
        this.f102636f++;
        C1022a c1022a = new C1022a();
        c1022a.f102641a = this.f102636f;
        c1022a.f102642b = SystemClock.elapsedRealtime();
        this.f102640j.put(Integer.valueOf(i10), c1022a);
    }

    private void b(int i10, int i11) {
        String strK = k(i10);
        Iterator<b> it = this.f102639i.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f102643a == i10) {
                a(next, strK, i11);
                it.remove();
            }
        }
    }

    private void c() {
        this.f102638h = SystemClock.elapsedRealtime();
    }

    private void c(int i10) {
        b(i10, 0);
    }

    private void c(int i10, int i11) {
        if (this.f102640j.containsKey(Integer.valueOf(i10))) {
            a(this.f102640j.get(Integer.valueOf(i10)), k(i10), i11);
            this.f102640j.remove(Integer.valueOf(i10));
        }
    }

    private void d() {
        g(0);
    }

    private void d(int i10) {
        c(i10, 0);
    }

    private void e() {
        g(0);
    }

    private void e(int i10) {
        g(i10);
    }

    private void f() {
        this.f102634d = null;
        this.f102635e = 0;
        this.f102636f = 0;
        this.f102638h = 0L;
        this.f102639i.clear();
        this.f102640j.clear();
    }

    private void f(int i10) {
        this.f102637g = i10;
    }

    private void g(int i10) {
        h(i10);
        f();
    }

    private void h(int i10) {
        l(i10);
        i(i10);
        j(i10);
    }

    private void i(int i10) {
        if (this.f102634d != null) {
            for (int i11 = 0; i11 < this.f102634d.length; i11++) {
                b(i11, 0);
            }
        }
    }

    private void j(int i10) {
        if (this.f102634d != null) {
            for (int i11 = 0; i11 < this.f102634d.length; i11++) {
                c(i11, 0);
            }
        }
    }

    private String k(int i10) {
        TPRichMediaFeature[] tPRichMediaFeatureArr = this.f102634d;
        return (tPRichMediaFeatureArr == null || i10 < 0 || i10 >= tPRichMediaFeatureArr.length) ? "" : tPRichMediaFeatureArr[i10].getFeatureType();
    }

    private void l(int i10) {
        if (this.f102638h <= 0) {
            return;
        }
        l lVar = new l();
        lVar.a("duration", SystemClock.elapsedRealtime() - this.f102638h);
        lVar.a("code", i10);
        a("rich_media_prepare", lVar);
        this.f102638h = 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a(int i10, int i11, int i12, String str, Object obj) {
        this.f102631a.writeLock().lock();
        switch (i10) {
            case 300:
                c();
                break;
            case 301:
                a(obj);
                break;
            case 302:
                a(i11);
                break;
            case 303:
                b(i11);
                break;
            case 304:
                c(i11);
                break;
            case 305:
                d(i11);
                break;
            case 306:
                d();
                break;
            case 307:
                e();
                break;
            case 308:
                e(i11);
                break;
            case 309:
                a(str);
                break;
            case 310:
                a(i11, i12);
                break;
            case 311:
                f(i11);
                break;
        }
        this.f102631a.writeLock().unlock();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void b() {
    }
}
