package com.tencent.thumbplayer.tcmedia.adapter;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static String f102309t = "TPPlaybackInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f102314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f102315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f102316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f102317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f102319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f102320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f102321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f102322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f102323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f102324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f102325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f102326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f102327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long[] f102328s = {-1, -1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f102329u;

    public static b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new b();
        }
        String[] strArrSplit = str.split("\n");
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (!strArrSplit[i10].startsWith("#") && strArrSplit[i10].contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
                String[] strArrSplit2 = strArrSplit[i10].split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrSplit2 == null || strArrSplit2.length < 2) {
                    String str2 = f102309t;
                    StringBuilder sb2 = new StringBuilder("parseInfo, ");
                    sb2.append((strArrSplit2 == null || strArrSplit2.length <= 0) ? "param null, " : strArrSplit2[0]);
                    sb2.append("is empty");
                    TPLogUtil.i(str2, sb2.toString());
                } else {
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
        }
        b bVar = new b();
        if (map.containsKey("ContainerFormat")) {
            bVar.b((String) map.get("ContainerFormat"));
        }
        if (map.containsKey("VideoCodec")) {
            bVar.d((String) map.get("VideoCodec"));
        }
        if (map.containsKey("AudioCodec")) {
            bVar.e((String) map.get("AudioCodec"));
        }
        if (map.containsKey(com.google.common.net.c.f58864t1)) {
            bVar.a(Long.valueOf((String) map.get(com.google.common.net.c.f58864t1)).longValue());
        }
        if (map.containsKey("Height")) {
            bVar.b(Long.valueOf((String) map.get("Height")).longValue());
        }
        if (map.containsKey("VideoBitRate")) {
            bVar.c(Long.valueOf((String) map.get("VideoBitRate")).longValue());
        }
        if (map.containsKey("AudioBitRate")) {
            bVar.d(Long.valueOf((String) map.get("AudioBitRate")).longValue());
        }
        if (map.containsKey("SampleRate")) {
            bVar.e(Long.valueOf((String) map.get("SampleRate")).longValue());
        }
        if (map.containsKey("Channels")) {
            bVar.d(Integer.valueOf((String) map.get("Channels")).intValue());
        }
        if (map.containsKey("Definition")) {
            bVar.c((String) map.get("Definition"));
        }
        return bVar;
    }

    public long a() {
        return this.f102314e;
    }

    public void a(int i10) {
        this.f102312c = i10;
    }

    public void a(long j10) {
        this.f102314e = j10;
    }

    public void a(long[] jArr) {
        this.f102328s = jArr;
    }

    public long b() {
        return this.f102315f;
    }

    public void b(int i10) {
        this.f102326q = i10;
    }

    public void b(long j10) {
        this.f102315f = j10;
    }

    public void b(String str) {
        this.f102310a = str;
    }

    public String c() {
        return this.f102310a;
    }

    public void c(int i10) {
        this.f102318i = i10;
    }

    public void c(long j10) {
        this.f102316g = j10;
    }

    public void c(String str) {
        this.f102327r = str;
    }

    public String d() {
        return this.f102327r;
    }

    public void d(int i10) {
        this.f102320k = i10;
    }

    public void d(long j10) {
        this.f102319j = j10;
    }

    public void d(String str) {
        this.f102311b = str;
    }

    public int e() {
        return this.f102312c;
    }

    public void e(int i10) {
        this.f102322m = i10;
    }

    public void e(long j10) {
        this.f102321l = j10;
    }

    public void e(String str) {
        this.f102317h = str;
    }

    public long f() {
        return this.f102316g;
    }

    public void f(int i10) {
        this.f102329u = i10;
    }

    public void f(long j10) {
        this.f102323n = j10;
    }

    public long g() {
        return this.f102319j;
    }

    public void g(int i10) {
        this.f102313d = i10;
    }

    public void g(long j10) {
        this.f102324o = j10;
    }

    public int h() {
        return this.f102322m;
    }

    public void h(long j10) {
        this.f102325p = j10;
    }

    public long i() {
        return this.f102323n;
    }

    public long[] j() {
        return this.f102328s;
    }

    public long k() {
        return this.f102324o;
    }

    public long l() {
        return this.f102325p;
    }

    public int m() {
        return this.f102329u;
    }

    public int n() {
        return this.f102313d;
    }

    public void o() {
        this.f102310a = null;
        this.f102311b = null;
        this.f102312c = 0;
        this.f102313d = 0;
        this.f102314e = 0L;
        this.f102315f = 0L;
        this.f102316g = 0L;
        this.f102317h = null;
        this.f102318i = 0;
        this.f102319j = 0L;
        this.f102320k = 0;
        this.f102321l = 0L;
        this.f102326q = 2;
        this.f102322m = 0;
        this.f102323n = 0L;
        this.f102324o = 0L;
        this.f102325p = 0L;
        this.f102329u = 0;
        this.f102328s = new long[]{-1, -1};
    }
}
