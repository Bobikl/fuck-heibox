package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.l1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsMediaPlaylist.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f48316w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f48317x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f48318y = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f48323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f48325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f48326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f48328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f48329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f48330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f48331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    public final DrmInitData f48332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<e> f48333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<b> f48334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map<Uri, d> f48335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f48336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0385g f48337v;

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class b extends f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f48338m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f48339n;

        public b(String str, @p0 e eVar, long j10, int i10, long j11, @p0 DrmInitData drmInitData, @p0 String str2, @p0 String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, eVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f48338m = z11;
            this.f48339n = z12;
        }

        public b b(long j10, int i10) {
            return new b(this.f48345b, this.f48346c, this.f48347d, i10, j10, this.f48350g, this.f48351h, this.f48352i, this.f48353j, this.f48354k, this.f48355l, this.f48338m, this.f48339n);
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f48340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48342c;

        public d(Uri uri, long j10, int i10) {
            this.f48340a = uri;
            this.f48341b = j10;
            this.f48342c = i10;
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class e extends f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f48343m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<b> f48344n;

        public e(String str, long j10, long j11, @p0 String str2, @p0 String str3) {
            this(str, null, "", 0L, -1, com.google.android.exoplayer2.j.f46377b, null, str2, str3, j10, j11, false, ImmutableList.B());
        }

        public e(String str, @p0 e eVar, String str2, long j10, int i10, long j11, @p0 DrmInitData drmInitData, @p0 String str3, @p0 String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, eVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f48343m = str2;
            this.f48344n = ImmutableList.v(list);
        }

        public e b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f48344n.size(); i11++) {
                b bVar = this.f48344n.get(i11);
                arrayList.add(bVar.b(j11, i10));
                j11 += bVar.f48347d;
            }
            return new e(this.f48345b, this.f48346c, this.f48343m, this.f48347d, i10, j10, this.f48350g, this.f48351h, this.f48352i, this.f48353j, this.f48354k, this.f48355l, arrayList);
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static class f implements Comparable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final e f48346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f48347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f48348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f48349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        public final DrmInitData f48350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        public final String f48351h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        public final String f48352i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f48353j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f48354k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f48355l;

        private f(String str, @p0 e eVar, long j10, int i10, long j11, @p0 DrmInitData drmInitData, @p0 String str2, @p0 String str3, long j12, long j13, boolean z10) {
            this.f48345b = str;
            this.f48346c = eVar;
            this.f48347d = j10;
            this.f48348e = i10;
            this.f48349f = j11;
            this.f48350g = drmInitData;
            this.f48351h = str2;
            this.f48352i = str3;
            this.f48353j = j12;
            this.f48354k = j13;
            this.f48355l = z10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f48349f > l10.longValue()) {
                return 1;
            }
            return this.f48349f < l10.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class C0385g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f48359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f48360e;

        public C0385g(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f48356a = j10;
            this.f48357b = z10;
            this.f48358c = j11;
            this.f48359d = j12;
            this.f48360e = z11;
        }
    }

    public g(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, @p0 DrmInitData drmInitData, List<e> list2, List<b> list3, C0385g c0385g, Map<Uri, d> map) {
        super(str, list, z12);
        this.f48319d = i10;
        this.f48323h = j11;
        this.f48322g = z10;
        this.f48324i = z11;
        this.f48325j = i11;
        this.f48326k = j12;
        this.f48327l = i12;
        this.f48328m = j13;
        this.f48329n = j14;
        this.f48330o = z13;
        this.f48331p = z14;
        this.f48332q = drmInitData;
        this.f48333r = ImmutableList.v(list2);
        this.f48334s = ImmutableList.v(list3);
        this.f48335t = ImmutableMap.g(map);
        if (!list3.isEmpty()) {
            b bVar = (b) l1.w(list3);
            this.f48336u = bVar.f48349f + bVar.f48347d;
        } else if (list2.isEmpty()) {
            this.f48336u = 0L;
        } else {
            e eVar = (e) l1.w(list2);
            this.f48336u = eVar.f48349f + eVar.f48347d;
        }
        this.f48320e = j10 != com.google.android.exoplayer2.j.f46377b ? j10 >= 0 ? Math.min(this.f48336u, j10) : Math.max(0L, this.f48336u + j10) : com.google.android.exoplayer2.j.f46377b;
        this.f48321f = j10 >= 0;
        this.f48337v = c0385g;
    }

    @Override // com.google.android.exoplayer2.offline.z
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g a(List<StreamKey> list) {
        return this;
    }

    public g c(long j10, int i10) {
        return new g(this.f48319d, this.f48361a, this.f48362b, this.f48320e, this.f48322g, j10, true, i10, this.f48326k, this.f48327l, this.f48328m, this.f48329n, this.f48363c, this.f48330o, this.f48331p, this.f48332q, this.f48333r, this.f48334s, this.f48337v, this.f48335t);
    }

    public g d() {
        return this.f48330o ? this : new g(this.f48319d, this.f48361a, this.f48362b, this.f48320e, this.f48322g, this.f48323h, this.f48324i, this.f48325j, this.f48326k, this.f48327l, this.f48328m, this.f48329n, this.f48363c, true, this.f48331p, this.f48332q, this.f48333r, this.f48334s, this.f48337v, this.f48335t);
    }

    public long e() {
        return this.f48323h + this.f48336u;
    }

    public boolean f(@p0 g gVar) {
        if (gVar == null) {
            return true;
        }
        long j10 = this.f48326k;
        long j11 = gVar.f48326k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f48333r.size() - gVar.f48333r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f48334s.size();
        int size3 = gVar.f48334s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f48330o && !gVar.f48330o;
        }
        return true;
    }
}
