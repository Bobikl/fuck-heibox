package k;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import k.g.a;

/* JADX INFO: compiled from: LookupParameters.java */
/* JADX INFO: loaded from: classes.dex */
public final class m<LookupExtra extends g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f124393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f124395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f124396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LookupExtra f124397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f124398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f124399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f124400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f124401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f124402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f124403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f124404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f124405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f124406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f124407o;

    /* JADX INFO: compiled from: LookupParameters.java */
    public static final class a<LookupExtra extends g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f124408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f124409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f124410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f124411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LookupExtra f124412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f124413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f124414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f124415h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f124416i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f124417j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f124418k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f124419l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f124420m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f124421n;

        public a() {
            this.f124410c = -1;
            this.f124414g = true;
            this.f124415h = false;
            this.f124416i = 3;
            this.f124417j = false;
            this.f124418k = 0;
            this.f124419l = false;
            this.f124420m = 0;
            this.f124421n = false;
        }

        public a(m<LookupExtra> mVar) {
            this.f124410c = -1;
            this.f124414g = true;
            this.f124415h = false;
            this.f124416i = 3;
            this.f124417j = false;
            this.f124418k = 0;
            this.f124419l = false;
            this.f124420m = 0;
            this.f124421n = false;
            this.f124408a = mVar.f124393a;
            this.f124409b = mVar.f124394b;
            this.f124410c = mVar.f124395c;
            this.f124411d = mVar.f124396d;
            this.f124412e = mVar.f124397e;
            this.f124413f = mVar.f124398f;
            this.f124414g = mVar.f124399g;
            this.f124415h = mVar.f124400h;
            this.f124416i = mVar.f124401i;
            this.f124417j = mVar.f124402j;
            this.f124418k = mVar.f124403k;
            this.f124419l = mVar.f124404l;
            this.f124420m = mVar.f124405m;
            this.f124421n = mVar.f124406n;
        }

        public a<LookupExtra> a(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("timeoutMills".concat(" can not less than 0"));
            }
            this.f124410c = i10;
            return this;
        }

        public a<LookupExtra> b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException(com.umeng.analytics.pro.d.R.concat(" can not be null"));
            }
            this.f124408a = context.getApplicationContext();
            return this;
        }

        public a<LookupExtra> c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("channel".concat(" can not be empty"));
            }
            this.f124413f = str;
            return this;
        }

        public a<LookupExtra> d(LookupExtra lookupextra) {
            if (lookupextra == null) {
                throw new IllegalArgumentException("lookupExtra".concat(" can not be null"));
            }
            this.f124412e = lookupextra;
            return this;
        }

        public m<LookupExtra> e() {
            Context context = this.f124408a;
            if (context == null) {
                throw new IllegalStateException("mAppContext".concat(" is not initialized yet"));
            }
            String str = this.f124409b;
            if (str == null) {
                throw new IllegalStateException("mHostname".concat(" is not initialized yet"));
            }
            int i10 = this.f124410c;
            if (-1 == i10) {
                throw new IllegalStateException("mTimeoutMills".concat(" is not initialized yet"));
            }
            String str2 = this.f124411d;
            if (str2 == null) {
                throw new IllegalStateException("mDnsIp".concat(" is not initialized yet"));
            }
            LookupExtra lookupextra = this.f124412e;
            if (lookupextra == null) {
                throw new IllegalStateException("mLookupExtra".concat(" is not initialized yet"));
            }
            String str3 = this.f124413f;
            if (str3 != null) {
                return new m<>(context, str, i10, str2, lookupextra, str3, this.f124414g, this.f124415h, this.f124416i, this.f124417j, this.f124418k, this.f124419l, this.f124420m, this.f124421n);
            }
            throw new IllegalStateException("mChannel".concat(" is not initialized yet"));
        }

        public a<LookupExtra> f(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("dnsIp".concat(" can not be empty"));
            }
            this.f124411d = str;
            return this;
        }

        public a<LookupExtra> g(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("hostname".concat(" can not be empty"));
            }
            this.f124409b = str;
            return this;
        }
    }

    public m(Context context, String str, int i10, String str2, LookupExtra lookupextra, String str3, boolean z10, boolean z11, int i11, boolean z12, int i12, boolean z13, int i13, boolean z14) {
        this.f124393a = context;
        this.f124394b = str;
        this.f124395c = i10;
        this.f124396d = str2;
        this.f124397e = lookupextra;
        this.f124398f = str3;
        this.f124399g = z10;
        this.f124400h = z11;
        this.f124401i = i11;
        this.f124402j = z12;
        this.f124403k = i12;
        this.f124404l = z13;
        this.f124405m = i13;
        this.f124406n = z14;
        a(str);
    }

    public void a(String str) {
        this.f124407o = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f124395c == mVar.f124395c && this.f124399g == mVar.f124399g && this.f124400h == mVar.f124400h && this.f124401i == mVar.f124401i && this.f124402j == mVar.f124402j && this.f124403k == mVar.f124403k && this.f124404l == mVar.f124404l && this.f124405m == mVar.f124405m && this.f124406n == mVar.f124406n && b.a.o(this.f124393a, mVar.f124393a) && b.a.o(this.f124394b, mVar.f124394b) && b.a.o(this.f124396d, mVar.f124396d) && b.a.o(this.f124397e, mVar.f124397e) && b.a.o(this.f124398f, mVar.f124398f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f124393a, this.f124394b, Integer.valueOf(this.f124395c), this.f124396d, this.f124397e, this.f124398f, Boolean.valueOf(this.f124399g), Boolean.valueOf(this.f124400h), Integer.valueOf(this.f124401i), Boolean.valueOf(this.f124402j), Integer.valueOf(this.f124403k), Boolean.valueOf(this.f124404l), Integer.valueOf(this.f124405m), Boolean.valueOf(this.f124406n)});
    }

    public String toString() {
        return "LookupParameters{appContext=" + this.f124393a + ", hostname='" + this.f124394b + "', timeoutMills=" + this.f124395c + ", dnsIp=" + this.f124396d + ", lookupExtra=" + this.f124397e + ", channel='" + this.f124398f + "', fallback2Local=" + this.f124399g + ", blockFirst=" + this.f124400h + ", family=" + this.f124401i + ", ignoreCurNetStack=" + this.f124402j + ", customNetStack=" + this.f124403k + ", enableAsyncLookup=" + this.f124404l + ", curRetryTime=" + this.f124405m + ", netChangeLookup=" + this.f124406n + '}';
    }
}
