package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.mp4.p;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.z;
import com.google.android.exoplayer2.util.q0;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: SsManifest.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements z<a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f49134i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final C0389a f49139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f49140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f49141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f49142h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SsManifest.java */
    public static class C0389a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f49143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f49144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p[] f49145c;

        public C0389a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f49143a = uuid;
            this.f49144b = bArr;
            this.f49145c = pVarArr;
        }
    }

    /* JADX INFO: compiled from: SsManifest.java */
    public static class b {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f49146q = "{start time}";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f49147r = "{start_time}";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f49148s = "{bitrate}";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f49149t = "{Bitrate}";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f49152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f49153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f49156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f49157h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        public final String f49158i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a2[] f49159j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f49160k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f49161l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f49162m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List<Long> f49163n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long[] f49164o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final long f49165p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @p0 String str5, a2[] a2VarArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, a2VarArr, list, u0.k1(list, 1000000L, j10), u0.j1(j11, 1000000L, j10));
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @p0 String str5, a2[] a2VarArr, List<Long> list, long[] jArr, long j11) {
            this.f49161l = str;
            this.f49162m = str2;
            this.f49150a = i10;
            this.f49151b = str3;
            this.f49152c = j10;
            this.f49153d = str4;
            this.f49154e = i11;
            this.f49155f = i12;
            this.f49156g = i13;
            this.f49157h = i14;
            this.f49158i = str5;
            this.f49159j = a2VarArr;
            this.f49163n = list;
            this.f49164o = jArr;
            this.f49165p = j11;
            this.f49160k = list.size();
        }

        public Uri a(int i10, int i11) {
            com.google.android.exoplayer2.util.a.i(this.f49159j != null);
            com.google.android.exoplayer2.util.a.i(this.f49163n != null);
            com.google.android.exoplayer2.util.a.i(i11 < this.f49163n.size());
            String string = Integer.toString(this.f49159j[i10].f43589i);
            String string2 = this.f49163n.get(i11).toString();
            return q0.f(this.f49161l, this.f49162m.replace(f49148s, string).replace(f49149t, string).replace(f49146q, string2).replace(f49147r, string2));
        }

        public b b(a2[] a2VarArr) {
            return new b(this.f49161l, this.f49162m, this.f49150a, this.f49151b, this.f49152c, this.f49153d, this.f49154e, this.f49155f, this.f49156g, this.f49157h, this.f49158i, a2VarArr, this.f49163n, this.f49164o, this.f49165p);
        }

        public long c(int i10) {
            if (i10 == this.f49160k - 1) {
                return this.f49165p;
            }
            long[] jArr = this.f49164o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return u0.j(this.f49164o, j10, true, true);
        }

        public long e(int i10) {
            return this.f49164o[i10];
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, @p0 C0389a c0389a, b[] bVarArr) {
        this.f49135a = i10;
        this.f49136b = i11;
        this.f49141g = j10;
        this.f49142h = j11;
        this.f49137c = i12;
        this.f49138d = z10;
        this.f49139e = c0389a;
        this.f49140f = bVarArr;
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, @p0 C0389a c0389a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : u0.j1(j11, 1000000L, j10), j12 != 0 ? u0.j1(j12, 1000000L, j10) : j.f46377b, i12, z10, c0389a, bVarArr);
    }

    @Override // com.google.android.exoplayer2.offline.z
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            b bVar2 = this.f49140f[streamKey.f47147c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((a2[]) arrayList3.toArray(new a2[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f49159j[streamKey.f47148d]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((a2[]) arrayList3.toArray(new a2[0])));
        }
        return new a(this.f49135a, this.f49136b, this.f49141g, this.f49142h, this.f49137c, this.f49138d, this.f49139e, (b[]) arrayList2.toArray(new b[0]));
    }
}
