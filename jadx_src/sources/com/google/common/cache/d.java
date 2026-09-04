package com.google.common.cache;

import com.google.common.base.b0;
import com.google.common.base.s;
import com.google.common.base.w;
import com.google.common.base.z;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CacheBuilderSpec.java */
/* JADX INFO: loaded from: classes7.dex */
@com.google.common.cache.f
@o9.c
public final class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final z f56981o = z.h(',').q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final z f56982p = z.h(n5.a.f132013h).q();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ImmutableMap<String, m> f56983q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    @o9.d
    Integer f56984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    @o9.d
    Long f56985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @o9.d
    Long f56986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @o9.d
    Integer f56987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    @o9.d
    LocalCache.Strength f56988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @CheckForNull
    @o9.d
    LocalCache.Strength f56989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    @o9.d
    Boolean f56990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @o9.d
    long f56991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    @o9.d
    TimeUnit f56992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @o9.d
    long f56993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @CheckForNull
    @o9.d
    TimeUnit f56994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @o9.d
    long f56995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @CheckForNull
    @o9.d
    TimeUnit f56996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f56997n;

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56998a;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            f56998a = iArr;
            try {
                iArr[LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56998a[LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class b extends AbstractC0446d {
        b() {
        }

        @Override // com.google.common.cache.d.AbstractC0446d
        protected void b(d dVar, long j10, TimeUnit timeUnit) {
            w.e(dVar.f56994k == null, "expireAfterAccess already set");
            dVar.f56993j = j10;
            dVar.f56994k = timeUnit;
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class c extends f {
        c() {
        }

        @Override // com.google.common.cache.d.f
        protected void b(d dVar, int i10) {
            Integer num = dVar.f56987d;
            w.u(num == null, "concurrency level was already set to ", num);
            dVar.f56987d = Integer.valueOf(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static abstract class AbstractC0446d implements m {
        AbstractC0446d() {
        }

        @Override // com.google.common.cache.d.m
        public void a(d dVar, String str, @CheckForNull String str2) {
            TimeUnit timeUnit;
            if (b0.d(str2)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
                sb2.append("value of key ");
                sb2.append(str);
                sb2.append(" omitted");
                throw new IllegalArgumentException(sb2.toString());
            }
            try {
                char cCharAt = str2.charAt(str2.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (cCharAt != 's') {
                        throw new IllegalArgumentException(d.d("key %s invalid unit: was %s, must end with one of [dhms]", str, str2));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                b(dVar, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(d.d("key %s value set to %s, must be integer", str, str2));
            }
        }

        protected abstract void b(d dVar, long j10, TimeUnit timeUnit);
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class e extends f {
        e() {
        }

        @Override // com.google.common.cache.d.f
        protected void b(d dVar, int i10) {
            Integer num = dVar.f56984a;
            w.u(num == null, "initial capacity was already set to ", num);
            dVar.f56984a = Integer.valueOf(i10);
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static abstract class f implements m {
        f() {
        }

        @Override // com.google.common.cache.d.m
        public void a(d dVar, String str, String str2) {
            if (!b0.d(str2)) {
                try {
                    b(dVar, Integer.parseInt(str2));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(d.d("key %s value set to %s, must be integer", str, str2), e10);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
                sb2.append("value of key ");
                sb2.append(str);
                sb2.append(" omitted");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        protected abstract void b(d dVar, int i10);
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class g implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocalCache.Strength f56999a;

        public g(LocalCache.Strength strength) {
            this.f56999a = strength;
        }

        @Override // com.google.common.cache.d.m
        public void a(d dVar, String str, @CheckForNull String str2) {
            w.u(str2 == null, "key %s does not take values", str);
            LocalCache.Strength strength = dVar.f56988e;
            w.y(strength == null, "%s was already set to %s", str, strength);
            dVar.f56988e = this.f56999a;
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static abstract class h implements m {
        h() {
        }

        @Override // com.google.common.cache.d.m
        public void a(d dVar, String str, String str2) {
            if (!b0.d(str2)) {
                try {
                    b(dVar, Long.parseLong(str2));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(d.d("key %s value set to %s, must be integer", str, str2), e10);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
                sb2.append("value of key ");
                sb2.append(str);
                sb2.append(" omitted");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        protected abstract void b(d dVar, long j10);
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class i extends h {
        i() {
        }

        @Override // com.google.common.cache.d.h
        protected void b(d dVar, long j10) {
            Long l10 = dVar.f56985b;
            w.u(l10 == null, "maximum size was already set to ", l10);
            Long l11 = dVar.f56986c;
            w.u(l11 == null, "maximum weight was already set to ", l11);
            dVar.f56985b = Long.valueOf(j10);
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class j extends h {
        j() {
        }

        @Override // com.google.common.cache.d.h
        protected void b(d dVar, long j10) {
            Long l10 = dVar.f56986c;
            w.u(l10 == null, "maximum weight was already set to ", l10);
            Long l11 = dVar.f56985b;
            w.u(l11 == null, "maximum size was already set to ", l11);
            dVar.f56986c = Long.valueOf(j10);
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class k implements m {
        k() {
        }

        @Override // com.google.common.cache.d.m
        public void a(d dVar, String str, @CheckForNull String str2) {
            w.e(str2 == null, "recordStats does not take values");
            w.e(dVar.f56990g == null, "recordStats already set");
            dVar.f56990g = Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class l extends AbstractC0446d {
        l() {
        }

        @Override // com.google.common.cache.d.AbstractC0446d
        protected void b(d dVar, long j10, TimeUnit timeUnit) {
            w.e(dVar.f56996m == null, "refreshAfterWrite already set");
            dVar.f56995l = j10;
            dVar.f56996m = timeUnit;
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public interface m {
        void a(d dVar, String str, @CheckForNull String str2);
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocalCache.Strength f57000a;

        public n(LocalCache.Strength strength) {
            this.f57000a = strength;
        }

        @Override // com.google.common.cache.d.m
        public void a(d dVar, String str, @CheckForNull String str2) {
            w.u(str2 == null, "key %s does not take values", str);
            LocalCache.Strength strength = dVar.f56989f;
            w.y(strength == null, "%s was already set to %s", str, strength);
            dVar.f56989f = this.f57000a;
        }
    }

    /* JADX INFO: compiled from: CacheBuilderSpec.java */
    public static class o extends AbstractC0446d {
        o() {
        }

        @Override // com.google.common.cache.d.AbstractC0446d
        protected void b(d dVar, long j10, TimeUnit timeUnit) {
            w.e(dVar.f56992i == null, "expireAfterWrite already set");
            dVar.f56991h = j10;
            dVar.f56992i = timeUnit;
        }
    }

    static {
        ImmutableMap.b bVarI = ImmutableMap.b().i("initialCapacity", new e()).i("maximumSize", new i()).i("maximumWeight", new j()).i("concurrencyLevel", new c());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        f56983q = bVarI.i("weakKeys", new g(strength)).i("softValues", new n(LocalCache.Strength.SOFT)).i("weakValues", new n(strength)).i("recordStats", new k()).i("expireAfterAccess", new b()).i("expireAfterWrite", new o()).i("refreshAfterWrite", new l()).i("refreshInterval", new l()).d();
    }

    private d(String str) {
        this.f56997n = str;
    }

    public static d b() {
        return e("maximumSize=0");
    }

    @CheckForNull
    private static Long c(long j10, @CheckForNull TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d e(String str) {
        d dVar = new d(str);
        if (!str.isEmpty()) {
            for (String str2 : f56981o.n(str)) {
                ImmutableList immutableListU = ImmutableList.u(f56982p.n(str2));
                w.e(!immutableListU.isEmpty(), "blank key-value pair");
                w.u(immutableListU.size() <= 2, "key-value pair %s with more than one equals sign", str2);
                String str3 = (String) immutableListU.get(0);
                m mVar = f56983q.get(str3);
                w.u(mVar != null, "unknown key %s", str3);
                mVar.a(dVar, str3, immutableListU.size() == 1 ? null : (String) immutableListU.get(1));
            }
        }
        return dVar;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.a(this.f56984a, dVar.f56984a) && s.a(this.f56985b, dVar.f56985b) && s.a(this.f56986c, dVar.f56986c) && s.a(this.f56987d, dVar.f56987d) && s.a(this.f56988e, dVar.f56988e) && s.a(this.f56989f, dVar.f56989f) && s.a(this.f56990g, dVar.f56990g) && s.a(c(this.f56991h, this.f56992i), c(dVar.f56991h, dVar.f56992i)) && s.a(c(this.f56993j, this.f56994k), c(dVar.f56993j, dVar.f56994k)) && s.a(c(this.f56995l, this.f56996m), c(dVar.f56995l, dVar.f56996m));
    }

    CacheBuilder<Object, Object> f() {
        CacheBuilder<Object, Object> cacheBuilderD = CacheBuilder.D();
        Integer num = this.f56984a;
        if (num != null) {
            cacheBuilderD.x(num.intValue());
        }
        Long l10 = this.f56985b;
        if (l10 != null) {
            cacheBuilderD.B(l10.longValue());
        }
        Long l11 = this.f56986c;
        if (l11 != null) {
            cacheBuilderD.C(l11.longValue());
        }
        Integer num2 = this.f56987d;
        if (num2 != null) {
            cacheBuilderD.e(num2.intValue());
        }
        LocalCache.Strength strength = this.f56988e;
        if (strength != null) {
            if (a.f56998a[strength.ordinal()] != 1) {
                throw new AssertionError();
            }
            cacheBuilderD.M();
        }
        LocalCache.Strength strength2 = this.f56989f;
        if (strength2 != null) {
            int i10 = a.f56998a[strength2.ordinal()];
            if (i10 == 1) {
                cacheBuilderD.N();
            } else {
                if (i10 != 2) {
                    throw new AssertionError();
                }
                cacheBuilderD.J();
            }
        }
        Boolean bool = this.f56990g;
        if (bool != null && bool.booleanValue()) {
            cacheBuilderD.E();
        }
        TimeUnit timeUnit = this.f56992i;
        if (timeUnit != null) {
            cacheBuilderD.g(this.f56991h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f56994k;
        if (timeUnit2 != null) {
            cacheBuilderD.f(this.f56993j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f56996m;
        if (timeUnit3 != null) {
            cacheBuilderD.F(this.f56995l, timeUnit3);
        }
        return cacheBuilderD;
    }

    public String g() {
        return this.f56997n;
    }

    public int hashCode() {
        return s.b(this.f56984a, this.f56985b, this.f56986c, this.f56987d, this.f56988e, this.f56989f, this.f56990g, c(this.f56991h, this.f56992i), c(this.f56993j, this.f56994k), c(this.f56995l, this.f56996m));
    }

    public String toString() {
        return com.google.common.base.q.c(this).s(g()).toString();
    }
}
