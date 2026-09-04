package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: MediaItem.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i2 implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f46261i = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f46263k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f46264l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f46265m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f46266n = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final h f46269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    @Deprecated
    public final i f46270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f46271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2 f46272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f46273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public final e f46274h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i2 f46262j = new c().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<i2> f46267o = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.h2
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return i2.d(bundle);
        }
    };

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f46275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f46276b;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f46277a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private Object f46278b;

            public a(Uri uri) {
                this.f46277a = uri;
            }

            public b c() {
                return new b(this);
            }

            public a d(Uri uri) {
                this.f46277a = uri;
                return this;
            }

            public a e(@androidx.annotation.p0 Object obj) {
                this.f46278b = obj;
                return this;
            }
        }

        private b(a aVar) {
            this.f46275a = aVar.f46277a;
            this.f46276b = aVar.f46278b;
        }

        public a a() {
            return new a(this.f46275a).e(this.f46276b);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46275a.equals(bVar.f46275a) && com.google.android.exoplayer2.util.u0.c(this.f46276b, bVar.f46276b);
        }

        public int hashCode() {
            int iHashCode = this.f46275a.hashCode() * 31;
            Object obj = this.f46276b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private String f46279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Uri f46280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private String f46281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f46282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f46283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<StreamKey> f46284f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private String f46285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ImmutableList<k> f46286h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private b f46287i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f46288j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private m2 f46289k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f46290l;

        public c() {
            this.f46282d = new d.a();
            this.f46283e = new f.a();
            this.f46284f = Collections.emptyList();
            this.f46286h = ImmutableList.B();
            this.f46290l = new g.a();
        }

        private c(i2 i2Var) {
            this();
            this.f46282d = i2Var.f46273g.c();
            this.f46279a = i2Var.f46268b;
            this.f46289k = i2Var.f46272f;
            this.f46290l = i2Var.f46271e.c();
            h hVar = i2Var.f46269c;
            if (hVar != null) {
                this.f46285g = hVar.f46350f;
                this.f46281c = hVar.f46346b;
                this.f46280b = hVar.f46345a;
                this.f46284f = hVar.f46349e;
                this.f46286h = hVar.f46351g;
                this.f46288j = hVar.f46353i;
                f fVar = hVar.f46347c;
                this.f46283e = fVar != null ? fVar.b() : new f.a();
                this.f46287i = hVar.f46348d;
            }
        }

        @Deprecated
        public c A(long j10) {
            this.f46290l.i(j10);
            return this;
        }

        @Deprecated
        public c B(float f10) {
            this.f46290l.j(f10);
            return this;
        }

        @Deprecated
        public c C(long j10) {
            this.f46290l.k(j10);
            return this;
        }

        public c D(String str) {
            this.f46279a = (String) com.google.android.exoplayer2.util.a.g(str);
            return this;
        }

        public c E(m2 m2Var) {
            this.f46289k = m2Var;
            return this;
        }

        public c F(@androidx.annotation.p0 String str) {
            this.f46281c = str;
            return this;
        }

        public c G(@androidx.annotation.p0 List<StreamKey> list) {
            this.f46284f = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c H(List<k> list) {
            this.f46286h = ImmutableList.v(list);
            return this;
        }

        @Deprecated
        public c I(@androidx.annotation.p0 List<j> list) {
            this.f46286h = list != null ? ImmutableList.v(list) : ImmutableList.B();
            return this;
        }

        public c J(@androidx.annotation.p0 Object obj) {
            this.f46288j = obj;
            return this;
        }

        public c K(@androidx.annotation.p0 Uri uri) {
            this.f46280b = uri;
            return this;
        }

        public c L(@androidx.annotation.p0 String str) {
            return K(str == null ? null : Uri.parse(str));
        }

        public i2 a() {
            i iVar;
            com.google.android.exoplayer2.util.a.i(this.f46283e.f46321b == null || this.f46283e.f46320a != null);
            Uri uri = this.f46280b;
            if (uri != null) {
                iVar = new i(uri, this.f46281c, this.f46283e.f46320a != null ? this.f46283e.j() : null, this.f46287i, this.f46284f, this.f46285g, this.f46286h, this.f46288j);
            } else {
                iVar = null;
            }
            String str = this.f46279a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f46282d.g();
            g gVarF = this.f46290l.f();
            m2 m2Var = this.f46289k;
            if (m2Var == null) {
                m2Var = m2.f46588p3;
            }
            return new i2(str2, eVarG, iVar, gVarF, m2Var);
        }

        @Deprecated
        public c b(@androidx.annotation.p0 Uri uri) {
            return c(uri, null);
        }

        @Deprecated
        public c c(@androidx.annotation.p0 Uri uri, @androidx.annotation.p0 Object obj) {
            this.f46287i = uri != null ? new b.a(uri).e(obj).c() : null;
            return this;
        }

        @Deprecated
        public c d(@androidx.annotation.p0 String str) {
            return b(str != null ? Uri.parse(str) : null);
        }

        public c e(@androidx.annotation.p0 b bVar) {
            this.f46287i = bVar;
            return this;
        }

        @Deprecated
        public c f(long j10) {
            this.f46282d.h(j10);
            return this;
        }

        @Deprecated
        public c g(boolean z10) {
            this.f46282d.i(z10);
            return this;
        }

        @Deprecated
        public c h(boolean z10) {
            this.f46282d.j(z10);
            return this;
        }

        @Deprecated
        public c i(@androidx.annotation.f0(from = 0) long j10) {
            this.f46282d.k(j10);
            return this;
        }

        @Deprecated
        public c j(boolean z10) {
            this.f46282d.l(z10);
            return this;
        }

        public c k(d dVar) {
            this.f46282d = dVar.c();
            return this;
        }

        public c l(@androidx.annotation.p0 String str) {
            this.f46285g = str;
            return this;
        }

        public c m(@androidx.annotation.p0 f fVar) {
            this.f46283e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        @Deprecated
        public c n(boolean z10) {
            this.f46283e.l(z10);
            return this;
        }

        @Deprecated
        public c o(@androidx.annotation.p0 byte[] bArr) {
            this.f46283e.n(bArr);
            return this;
        }

        @Deprecated
        public c p(@androidx.annotation.p0 Map<String, String> map) {
            f.a aVar = this.f46283e;
            if (map == null) {
                map = ImmutableMap.v();
            }
            aVar.o(map);
            return this;
        }

        @Deprecated
        public c q(@androidx.annotation.p0 Uri uri) {
            this.f46283e.p(uri);
            return this;
        }

        @Deprecated
        public c r(@androidx.annotation.p0 String str) {
            this.f46283e.q(str);
            return this;
        }

        @Deprecated
        public c s(boolean z10) {
            this.f46283e.r(z10);
            return this;
        }

        @Deprecated
        public c t(boolean z10) {
            this.f46283e.t(z10);
            return this;
        }

        @Deprecated
        public c u(boolean z10) {
            this.f46283e.k(z10);
            return this;
        }

        @Deprecated
        public c v(@androidx.annotation.p0 List<Integer> list) {
            f.a aVar = this.f46283e;
            if (list == null) {
                list = ImmutableList.B();
            }
            aVar.m(list);
            return this;
        }

        @Deprecated
        public c w(@androidx.annotation.p0 UUID uuid) {
            this.f46283e.s(uuid);
            return this;
        }

        public c x(g gVar) {
            this.f46290l = gVar.c();
            return this;
        }

        @Deprecated
        public c y(long j10) {
            this.f46290l.g(j10);
            return this;
        }

        @Deprecated
        public c z(float f10) {
            this.f46290l.h(f10);
            return this;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class d implements com.google.android.exoplayer2.i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f46292h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f46293i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f46294j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f46295k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f46296l = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.f0(from = 0)
        public final long f46298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f46299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f46300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f46301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f46302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f46291g = new a().f();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<e> f46297m = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.j2
            @Override // com.google.android.exoplayer2.i.a
            public final i a(Bundle bundle) {
                return i2.d.e(bundle);
            }
        };

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f46303a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f46304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f46305c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f46306d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f46307e;

            public a() {
                this.f46304b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f46303a = dVar.f46298b;
                this.f46304b = dVar.f46299c;
                this.f46305c = dVar.f46300d;
                this.f46306d = dVar.f46301e;
                this.f46307e = dVar.f46302f;
            }

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                com.google.android.exoplayer2.util.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f46304b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f46306d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f46305c = z10;
                return this;
            }

            public a k(@androidx.annotation.f0(from = 0) long j10) {
                com.google.android.exoplayer2.util.a.a(j10 >= 0);
                this.f46303a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f46307e = z10;
                return this;
            }
        }

        private d(a aVar) {
            this.f46298b = aVar.f46303a;
            this.f46299c = aVar.f46304b;
            this.f46300d = aVar.f46305c;
            this.f46301e = aVar.f46306d;
            this.f46302f = aVar.f46307e;
        }

        private static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e e(Bundle bundle) {
            return new a().k(bundle.getLong(d(0), 0L)).h(bundle.getLong(d(1), Long.MIN_VALUE)).j(bundle.getBoolean(d(2), false)).i(bundle.getBoolean(d(3), false)).l(bundle.getBoolean(d(4), false)).g();
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(d(0), this.f46298b);
            bundle.putLong(d(1), this.f46299c);
            bundle.putBoolean(d(2), this.f46300d);
            bundle.putBoolean(d(3), this.f46301e);
            bundle.putBoolean(d(4), this.f46302f);
            return bundle;
        }

        public a c() {
            return new a();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f46298b == dVar.f46298b && this.f46299c == dVar.f46299c && this.f46300d == dVar.f46300d && this.f46301e == dVar.f46301e && this.f46302f == dVar.f46302f;
        }

        public int hashCode() {
            long j10 = this.f46298b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f46299c;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f46300d ? 1 : 0)) * 31) + (this.f46301e ? 1 : 0)) * 31) + (this.f46302f ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final e f46308n = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f46309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f46310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final Uri f46311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final ImmutableMap<String, String> f46312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImmutableMap<String, String> f46313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f46314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f46315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f46316h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public final ImmutableList<Integer> f46317i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ImmutableList<Integer> f46318j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private final byte[] f46319k;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @androidx.annotation.p0
            private UUID f46320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private Uri f46321b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ImmutableMap<String, String> f46322c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f46323d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f46324e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f46325f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private ImmutableList<Integer> f46326g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            @androidx.annotation.p0
            private byte[] f46327h;

            @Deprecated
            private a() {
                this.f46322c = ImmutableMap.v();
                this.f46326g = ImmutableList.B();
            }

            private a(f fVar) {
                this.f46320a = fVar.f46309a;
                this.f46321b = fVar.f46311c;
                this.f46322c = fVar.f46313e;
                this.f46323d = fVar.f46314f;
                this.f46324e = fVar.f46315g;
                this.f46325f = fVar.f46316h;
                this.f46326g = fVar.f46318j;
                this.f46327h = fVar.f46319k;
            }

            public a(UUID uuid) {
                this.f46320a = uuid;
                this.f46322c = ImmutableMap.v();
                this.f46326g = ImmutableList.B();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Deprecated
            public a s(@androidx.annotation.p0 UUID uuid) {
                this.f46320a = uuid;
                return this;
            }

            public f j() {
                return new f(this);
            }

            public a k(boolean z10) {
                m(z10 ? ImmutableList.E(2, 1) : ImmutableList.B());
                return this;
            }

            public a l(boolean z10) {
                this.f46325f = z10;
                return this;
            }

            public a m(List<Integer> list) {
                this.f46326g = ImmutableList.v(list);
                return this;
            }

            public a n(@androidx.annotation.p0 byte[] bArr) {
                this.f46327h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a o(Map<String, String> map) {
                this.f46322c = ImmutableMap.g(map);
                return this;
            }

            public a p(@androidx.annotation.p0 Uri uri) {
                this.f46321b = uri;
                return this;
            }

            public a q(@androidx.annotation.p0 String str) {
                this.f46321b = str == null ? null : Uri.parse(str);
                return this;
            }

            public a r(boolean z10) {
                this.f46323d = z10;
                return this;
            }

            public a t(boolean z10) {
                this.f46324e = z10;
                return this;
            }

            public a u(UUID uuid) {
                this.f46320a = uuid;
                return this;
            }
        }

        private f(a aVar) {
            com.google.android.exoplayer2.util.a.i((aVar.f46325f && aVar.f46321b == null) ? false : true);
            UUID uuid = (UUID) com.google.android.exoplayer2.util.a.g(aVar.f46320a);
            this.f46309a = uuid;
            this.f46310b = uuid;
            this.f46311c = aVar.f46321b;
            this.f46312d = aVar.f46322c;
            this.f46313e = aVar.f46322c;
            this.f46314f = aVar.f46323d;
            this.f46316h = aVar.f46325f;
            this.f46315g = aVar.f46324e;
            this.f46317i = aVar.f46326g;
            this.f46318j = aVar.f46326g;
            this.f46319k = aVar.f46327h != null ? Arrays.copyOf(aVar.f46327h, aVar.f46327h.length) : null;
        }

        public a b() {
            return new a();
        }

        @androidx.annotation.p0
        public byte[] c() {
            byte[] bArr = this.f46319k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f46309a.equals(fVar.f46309a) && com.google.android.exoplayer2.util.u0.c(this.f46311c, fVar.f46311c) && com.google.android.exoplayer2.util.u0.c(this.f46313e, fVar.f46313e) && this.f46314f == fVar.f46314f && this.f46316h == fVar.f46316h && this.f46315g == fVar.f46315g && this.f46318j.equals(fVar.f46318j) && Arrays.equals(this.f46319k, fVar.f46319k);
        }

        public int hashCode() {
            int iHashCode = this.f46309a.hashCode() * 31;
            Uri uri = this.f46311c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f46313e.hashCode()) * 31) + (this.f46314f ? 1 : 0)) * 31) + (this.f46316h ? 1 : 0)) * 31) + (this.f46315g ? 1 : 0)) * 31) + this.f46318j.hashCode()) * 31) + Arrays.hashCode(this.f46319k);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class g implements com.google.android.exoplayer2.i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f46329h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f46330i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f46331j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f46332k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f46333l = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f46336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f46337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f46338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f46339f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g f46328g = new a().f();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<g> f46334m = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.k2
            @Override // com.google.android.exoplayer2.i.a
            public final i a(Bundle bundle) {
                return i2.g.e(bundle);
            }
        };

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f46340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f46341b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f46342c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f46343d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f46344e;

            public a() {
                this.f46340a = com.google.android.exoplayer2.j.f46377b;
                this.f46341b = com.google.android.exoplayer2.j.f46377b;
                this.f46342c = com.google.android.exoplayer2.j.f46377b;
                this.f46343d = -3.4028235E38f;
                this.f46344e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f46340a = gVar.f46335b;
                this.f46341b = gVar.f46336c;
                this.f46342c = gVar.f46337d;
                this.f46343d = gVar.f46338e;
                this.f46344e = gVar.f46339f;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f46342c = j10;
                return this;
            }

            public a h(float f10) {
                this.f46344e = f10;
                return this;
            }

            public a i(long j10) {
                this.f46341b = j10;
                return this;
            }

            public a j(float f10) {
                this.f46343d = f10;
                return this;
            }

            public a k(long j10) {
                this.f46340a = j10;
                return this;
            }
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f46335b = j10;
            this.f46336c = j11;
            this.f46337d = j12;
            this.f46338e = f10;
            this.f46339f = f11;
        }

        private g(a aVar) {
            this(aVar.f46340a, aVar.f46341b, aVar.f46342c, aVar.f46343d, aVar.f46344e);
        }

        private static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g e(Bundle bundle) {
            return new g(bundle.getLong(d(0), com.google.android.exoplayer2.j.f46377b), bundle.getLong(d(1), com.google.android.exoplayer2.j.f46377b), bundle.getLong(d(2), com.google.android.exoplayer2.j.f46377b), bundle.getFloat(d(3), -3.4028235E38f), bundle.getFloat(d(4), -3.4028235E38f));
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(d(0), this.f46335b);
            bundle.putLong(d(1), this.f46336c);
            bundle.putLong(d(2), this.f46337d);
            bundle.putFloat(d(3), this.f46338e);
            bundle.putFloat(d(4), this.f46339f);
            return bundle;
        }

        public a c() {
            return new a();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f46335b == gVar.f46335b && this.f46336c == gVar.f46336c && this.f46337d == gVar.f46337d && this.f46338e == gVar.f46338e && this.f46339f == gVar.f46339f;
        }

        public int hashCode() {
            long j10 = this.f46335b;
            long j11 = this.f46336c;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f46337d;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f46338e;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f46339f;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f46345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f46346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final f f46347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final b f46348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<StreamKey> f46349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f46350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImmutableList<k> f46351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        public final List<j> f46352h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f46353i;

        private h(Uri uri, @androidx.annotation.p0 String str, @androidx.annotation.p0 f fVar, @androidx.annotation.p0 b bVar, List<StreamKey> list, @androidx.annotation.p0 String str2, ImmutableList<k> immutableList, @androidx.annotation.p0 Object obj) {
            this.f46345a = uri;
            this.f46346b = str;
            this.f46347c = fVar;
            this.f46348d = bVar;
            this.f46349e = list;
            this.f46350f = str2;
            this.f46351g = immutableList;
            ImmutableList.a aVarQ = ImmutableList.q();
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                aVarQ.a(immutableList.get(i10).a().i());
            }
            this.f46352h = aVarQ.e();
            this.f46353i = obj;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f46345a.equals(hVar.f46345a) && com.google.android.exoplayer2.util.u0.c(this.f46346b, hVar.f46346b) && com.google.android.exoplayer2.util.u0.c(this.f46347c, hVar.f46347c) && com.google.android.exoplayer2.util.u0.c(this.f46348d, hVar.f46348d) && this.f46349e.equals(hVar.f46349e) && com.google.android.exoplayer2.util.u0.c(this.f46350f, hVar.f46350f) && this.f46351g.equals(hVar.f46351g) && com.google.android.exoplayer2.util.u0.c(this.f46353i, hVar.f46353i);
        }

        public int hashCode() {
            int iHashCode = this.f46345a.hashCode() * 31;
            String str = this.f46346b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f46347c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f46348d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f46349e.hashCode()) * 31;
            String str2 = this.f46350f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f46351g.hashCode()) * 31;
            Object obj = this.f46353i;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class i extends h {
        private i(Uri uri, @androidx.annotation.p0 String str, @androidx.annotation.p0 f fVar, @androidx.annotation.p0 b bVar, List<StreamKey> list, @androidx.annotation.p0 String str2, ImmutableList<k> immutableList, @androidx.annotation.p0 Object obj) {
            super(uri, str, fVar, bVar, list, str2, immutableList, obj);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class j extends k {
        @Deprecated
        public j(Uri uri, String str, @androidx.annotation.p0 String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public j(Uri uri, String str, @androidx.annotation.p0 String str2, int i10) {
            this(uri, str, str2, i10, 0, null);
        }

        @Deprecated
        public j(Uri uri, String str, @androidx.annotation.p0 String str2, int i10, int i11, @androidx.annotation.p0 String str3) {
            super(uri, str, str2, i10, i11, str3);
        }

        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f46354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f46355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f46356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f46357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f46358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f46359f;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f46360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private String f46361b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @androidx.annotation.p0
            private String f46362c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f46363d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f46364e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @androidx.annotation.p0
            private String f46365f;

            public a(Uri uri) {
                this.f46360a = uri;
            }

            private a(k kVar) {
                this.f46360a = kVar.f46354a;
                this.f46361b = kVar.f46355b;
                this.f46362c = kVar.f46356c;
                this.f46363d = kVar.f46357d;
                this.f46364e = kVar.f46358e;
                this.f46365f = kVar.f46359f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            public k h() {
                return new k(this);
            }

            public a j(@androidx.annotation.p0 String str) {
                this.f46365f = str;
                return this;
            }

            public a k(@androidx.annotation.p0 String str) {
                this.f46362c = str;
                return this;
            }

            public a l(String str) {
                this.f46361b = str;
                return this;
            }

            public a m(int i10) {
                this.f46364e = i10;
                return this;
            }

            public a n(int i10) {
                this.f46363d = i10;
                return this;
            }

            public a o(Uri uri) {
                this.f46360a = uri;
                return this;
            }
        }

        private k(Uri uri, String str, @androidx.annotation.p0 String str2, int i10, int i11, @androidx.annotation.p0 String str3) {
            this.f46354a = uri;
            this.f46355b = str;
            this.f46356c = str2;
            this.f46357d = i10;
            this.f46358e = i11;
            this.f46359f = str3;
        }

        private k(a aVar) {
            this.f46354a = aVar.f46360a;
            this.f46355b = aVar.f46361b;
            this.f46356c = aVar.f46362c;
            this.f46357d = aVar.f46363d;
            this.f46358e = aVar.f46364e;
            this.f46359f = aVar.f46365f;
        }

        public a a() {
            return new a();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f46354a.equals(kVar.f46354a) && com.google.android.exoplayer2.util.u0.c(this.f46355b, kVar.f46355b) && com.google.android.exoplayer2.util.u0.c(this.f46356c, kVar.f46356c) && this.f46357d == kVar.f46357d && this.f46358e == kVar.f46358e && com.google.android.exoplayer2.util.u0.c(this.f46359f, kVar.f46359f);
        }

        public int hashCode() {
            int iHashCode = this.f46354a.hashCode() * 31;
            String str = this.f46355b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f46356c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f46357d) * 31) + this.f46358e) * 31;
            String str3 = this.f46359f;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    private i2(String str, e eVar, @androidx.annotation.p0 i iVar, g gVar, m2 m2Var) {
        this.f46268b = str;
        this.f46269c = iVar;
        this.f46270d = iVar;
        this.f46271e = gVar;
        this.f46272f = m2Var;
        this.f46273g = eVar;
        this.f46274h = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i2 d(Bundle bundle) {
        String str = (String) com.google.android.exoplayer2.util.a.g(bundle.getString(g(0), ""));
        Bundle bundle2 = bundle.getBundle(g(1));
        g gVar = bundle2 == null ? g.f46328g : (g) g.f46334m.a(bundle2);
        Bundle bundle3 = bundle.getBundle(g(2));
        m2 m2Var = bundle3 == null ? m2.f46588p3 : (m2) m2.f46585n4.a(bundle3);
        Bundle bundle4 = bundle.getBundle(g(3));
        return new i2(str, bundle4 == null ? e.f46308n : (e) d.f46297m.a(bundle4), null, gVar, m2Var);
    }

    public static i2 e(Uri uri) {
        return new c().K(uri).a();
    }

    public static i2 f(String str) {
        return new c().L(str).a();
    }

    private static String g(int i10) {
        return Integer.toString(i10, 36);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(g(0), this.f46268b);
        bundle.putBundle(g(1), this.f46271e.a());
        bundle.putBundle(g(2), this.f46272f.a());
        bundle.putBundle(g(3), this.f46273g.a());
        return bundle;
    }

    public c c() {
        return new c();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return com.google.android.exoplayer2.util.u0.c(this.f46268b, i2Var.f46268b) && this.f46273g.equals(i2Var.f46273g) && com.google.android.exoplayer2.util.u0.c(this.f46269c, i2Var.f46269c) && com.google.android.exoplayer2.util.u0.c(this.f46271e, i2Var.f46271e) && com.google.android.exoplayer2.util.u0.c(this.f46272f, i2Var.f46272f);
    }

    public int hashCode() {
        int iHashCode = this.f46268b.hashCode() * 31;
        h hVar = this.f46269c;
        return ((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f46271e.hashCode()) * 31) + this.f46273g.hashCode()) * 31) + this.f46272f.hashCode();
    }
}
