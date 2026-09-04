package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ex {

    public static final class a extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f350a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f353b;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private boolean f356c;

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private boolean f358d;

        /* JADX INFO: renamed from: e, reason: collision with other field name */
        private boolean f360e;

        /* JADX INFO: renamed from: f, reason: collision with other field name */
        private boolean f361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f107061g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f107062h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f107063i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f107064j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f107065k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f107066l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f107067m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107055a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private long f348a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f349a = "";

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private String f352b = "";

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private String f355c = "";

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private String f357d = "";

        /* JADX INFO: renamed from: e, reason: collision with other field name */
        private String f359e = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107056b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f107057c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f107058d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f107060f = "";

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private long f351b = 0;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private long f354c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f107059e = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107059e < 0) {
                b();
            }
            return this.f107059e;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public long m295a() {
            return this.f348a;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public a m296a() {
            this.f361f = false;
            this.f357d = "";
            return this;
        }

        public a a(int i10) {
            this.f350a = true;
            this.f107055a = i10;
            return this;
        }

        public a a(long j10) {
            this.f353b = true;
            this.f348a = j10;
            return this;
        }

        @Override // com.xiaomi.push.e
        public a a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                switch (iM158a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.m167b());
                        break;
                    case 16:
                        a(bVar.m168b());
                        break;
                    case 26:
                        a(bVar.m161a());
                        break;
                    case 34:
                        b(bVar.m161a());
                        break;
                    case 42:
                        c(bVar.m161a());
                        break;
                    case 50:
                        d(bVar.m161a());
                        break;
                    case 58:
                        e(bVar.m161a());
                        break;
                    case 64:
                        b(bVar.m167b());
                        break;
                    case 72:
                        c(bVar.m167b());
                        break;
                    case 80:
                        d(bVar.m167b());
                        break;
                    case 90:
                        f(bVar.m161a());
                        break;
                    case 96:
                        b(bVar.m168b());
                        break;
                    case 104:
                        c(bVar.m168b());
                        break;
                    default:
                        if (!a(bVar, iM158a)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }

        public a a(String str) {
            this.f356c = true;
            this.f349a = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m297a() {
            return this.f349a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m298a()) {
                cVar.m198a(1, c());
            }
            if (m301b()) {
                cVar.m212b(2, m295a());
            }
            if (m304c()) {
                cVar.m202a(3, m297a());
            }
            if (m306d()) {
                cVar.m202a(4, m300b());
            }
            if (m308e()) {
                cVar.m202a(5, m303c());
            }
            if (m310f()) {
                cVar.m202a(6, m305d());
            }
            if (g()) {
                cVar.m202a(7, m307e());
            }
            if (h()) {
                cVar.m198a(8, d());
            }
            if (i()) {
                cVar.m198a(9, e());
            }
            if (j()) {
                cVar.m198a(10, f());
            }
            if (k()) {
                cVar.m202a(11, m309f());
            }
            if (l()) {
                cVar.m212b(12, m299b());
            }
            if (m()) {
                cVar.m212b(13, m302c());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m298a() {
            return this.f350a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m298a() ? 0 + com.xiaomi.push.c.a(1, c()) : 0;
            if (m301b()) {
                iA += com.xiaomi.push.c.b(2, m295a());
            }
            if (m304c()) {
                iA += com.xiaomi.push.c.a(3, m297a());
            }
            if (m306d()) {
                iA += com.xiaomi.push.c.a(4, m300b());
            }
            if (m308e()) {
                iA += com.xiaomi.push.c.a(5, m303c());
            }
            if (m310f()) {
                iA += com.xiaomi.push.c.a(6, m305d());
            }
            if (g()) {
                iA += com.xiaomi.push.c.a(7, m307e());
            }
            if (h()) {
                iA += com.xiaomi.push.c.a(8, d());
            }
            if (i()) {
                iA += com.xiaomi.push.c.a(9, e());
            }
            if (j()) {
                iA += com.xiaomi.push.c.a(10, f());
            }
            if (k()) {
                iA += com.xiaomi.push.c.a(11, m309f());
            }
            if (l()) {
                iA += com.xiaomi.push.c.b(12, m299b());
            }
            if (m()) {
                iA += com.xiaomi.push.c.b(13, m302c());
            }
            this.f107059e = iA;
            return iA;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public long m299b() {
            return this.f351b;
        }

        public a b(int i10) {
            this.f107062h = true;
            this.f107056b = i10;
            return this;
        }

        public a b(long j10) {
            this.f107066l = true;
            this.f351b = j10;
            return this;
        }

        public a b(String str) {
            this.f358d = true;
            this.f352b = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m300b() {
            return this.f352b;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m301b() {
            return this.f353b;
        }

        public int c() {
            return this.f107055a;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public long m302c() {
            return this.f354c;
        }

        public a c(int i10) {
            this.f107063i = true;
            this.f107057c = i10;
            return this;
        }

        public a c(long j10) {
            this.f107067m = true;
            this.f354c = j10;
            return this;
        }

        public a c(String str) {
            this.f360e = true;
            this.f355c = str;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public String m303c() {
            return this.f355c;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m304c() {
            return this.f356c;
        }

        public int d() {
            return this.f107056b;
        }

        public a d(int i10) {
            this.f107064j = true;
            this.f107058d = i10;
            return this;
        }

        public a d(String str) {
            this.f361f = true;
            this.f357d = str;
            return this;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public String m305d() {
            return this.f357d;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m306d() {
            return this.f358d;
        }

        public int e() {
            return this.f107057c;
        }

        public a e(String str) {
            this.f107061g = true;
            this.f359e = str;
            return this;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public String m307e() {
            return this.f359e;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m308e() {
            return this.f360e;
        }

        public int f() {
            return this.f107058d;
        }

        public a f(String str) {
            this.f107065k = true;
            this.f107060f = str;
            return this;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public String m309f() {
            return this.f107060f;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public boolean m310f() {
            return this.f361f;
        }

        public boolean g() {
            return this.f107061g;
        }

        public boolean h() {
            return this.f107062h;
        }

        public boolean i() {
            return this.f107063i;
        }

        public boolean j() {
            return this.f107064j;
        }

        public boolean k() {
            return this.f107065k;
        }

        public boolean l() {
            return this.f107066l;
        }

        public boolean m() {
            return this.f107067m;
        }
    }

    public static final class b extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f362a;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private boolean f364c;

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private boolean f365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f107072e;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f363b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107068a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107069b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f107070c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f107071d = -1;

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107071d < 0) {
                b();
            }
            return this.f107071d;
        }

        public b a(int i10) {
            this.f364c = true;
            this.f107068a = i10;
            return this;
        }

        @Override // com.xiaomi.push.e
        public b a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 8) {
                    a(bVar.m164a());
                } else if (iM158a == 24) {
                    a(bVar.m167b());
                } else if (iM158a == 32) {
                    b(bVar.m167b());
                } else if (iM158a == 40) {
                    c(bVar.m167b());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public b a(boolean z10) {
            this.f362a = true;
            this.f363b = z10;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m312b()) {
                cVar.m203a(1, m311a());
            }
            if (m313c()) {
                cVar.m198a(3, c());
            }
            if (m314d()) {
                cVar.m198a(4, d());
            }
            if (m315e()) {
                cVar.m198a(5, e());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m311a() {
            return this.f363b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m312b() ? 0 + com.xiaomi.push.c.a(1, m311a()) : 0;
            if (m313c()) {
                iA += com.xiaomi.push.c.a(3, c());
            }
            if (m314d()) {
                iA += com.xiaomi.push.c.a(4, d());
            }
            if (m315e()) {
                iA += com.xiaomi.push.c.a(5, e());
            }
            this.f107071d = iA;
            return iA;
        }

        public b b(int i10) {
            this.f365d = true;
            this.f107069b = i10;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m312b() {
            return this.f362a;
        }

        public int c() {
            return this.f107068a;
        }

        public b c(int i10) {
            this.f107072e = true;
            this.f107070c = i10;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m313c() {
            return this.f364c;
        }

        public int d() {
            return this.f107069b;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m314d() {
            return this.f365d;
        }

        public int e() {
            return this.f107070c;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m315e() {
            return this.f107072e;
        }
    }

    public static final class c extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f367a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f368b;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private boolean f369c;

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private boolean f370d;

        /* JADX INFO: renamed from: e, reason: collision with other field name */
        private boolean f371e;

        /* JADX INFO: renamed from: f, reason: collision with other field name */
        private boolean f372f;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f366a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f107074b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f107075c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f107076d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f107077e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f107078f = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107073a = -1;

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107073a < 0) {
                b();
            }
            return this.f107073a;
        }

        @Override // com.xiaomi.push.e
        public c a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 10) {
                    a(bVar.m161a());
                } else if (iM158a == 18) {
                    b(bVar.m161a());
                } else if (iM158a == 26) {
                    c(bVar.m161a());
                } else if (iM158a == 34) {
                    d(bVar.m161a());
                } else if (iM158a == 42) {
                    e(bVar.m161a());
                } else if (iM158a == 50) {
                    f(bVar.m161a());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public c a(String str) {
            this.f367a = true;
            this.f366a = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m316a() {
            return this.f366a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m317a()) {
                cVar.m202a(1, m316a());
            }
            if (m319b()) {
                cVar.m202a(2, m318b());
            }
            if (m320c()) {
                cVar.m202a(3, c());
            }
            if (m321d()) {
                cVar.m202a(4, d());
            }
            if (m322e()) {
                cVar.m202a(5, e());
            }
            if (m323f()) {
                cVar.m202a(6, f());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m317a() {
            return this.f367a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m317a() ? 0 + com.xiaomi.push.c.a(1, m316a()) : 0;
            if (m319b()) {
                iA += com.xiaomi.push.c.a(2, m318b());
            }
            if (m320c()) {
                iA += com.xiaomi.push.c.a(3, c());
            }
            if (m321d()) {
                iA += com.xiaomi.push.c.a(4, d());
            }
            if (m322e()) {
                iA += com.xiaomi.push.c.a(5, e());
            }
            if (m323f()) {
                iA += com.xiaomi.push.c.a(6, f());
            }
            this.f107073a = iA;
            return iA;
        }

        public c b(String str) {
            this.f368b = true;
            this.f107074b = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m318b() {
            return this.f107074b;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m319b() {
            return this.f368b;
        }

        public c c(String str) {
            this.f369c = true;
            this.f107075c = str;
            return this;
        }

        public String c() {
            return this.f107075c;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m320c() {
            return this.f369c;
        }

        public c d(String str) {
            this.f370d = true;
            this.f107076d = str;
            return this;
        }

        public String d() {
            return this.f107076d;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m321d() {
            return this.f370d;
        }

        public c e(String str) {
            this.f371e = true;
            this.f107077e = str;
            return this;
        }

        public String e() {
            return this.f107077e;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m322e() {
            return this.f371e;
        }

        public c f(String str) {
            this.f372f = true;
            this.f107078f = str;
            return this;
        }

        public String f() {
            return this.f107078f;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public boolean m323f() {
            return this.f372f;
        }
    }

    public static final class d extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f374a;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private boolean f376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f107082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f107083e;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f375b = false;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f373a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f107080b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f107081c = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107079a = -1;

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107079a < 0) {
                b();
            }
            return this.f107079a;
        }

        @Override // com.xiaomi.push.e
        public d a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 8) {
                    a(bVar.m164a());
                } else if (iM158a == 18) {
                    a(bVar.m161a());
                } else if (iM158a == 26) {
                    b(bVar.m161a());
                } else if (iM158a == 34) {
                    c(bVar.m161a());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public d a(String str) {
            this.f376c = true;
            this.f373a = str;
            return this;
        }

        public d a(boolean z10) {
            this.f374a = true;
            this.f375b = z10;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m324a() {
            return this.f373a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m327b()) {
                cVar.m203a(1, m325a());
            }
            if (m328c()) {
                cVar.m202a(2, m324a());
            }
            if (d()) {
                cVar.m202a(3, m326b());
            }
            if (e()) {
                cVar.m202a(4, c());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m325a() {
            return this.f375b;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m327b() ? 0 + com.xiaomi.push.c.a(1, m325a()) : 0;
            if (m328c()) {
                iA += com.xiaomi.push.c.a(2, m324a());
            }
            if (d()) {
                iA += com.xiaomi.push.c.a(3, m326b());
            }
            if (e()) {
                iA += com.xiaomi.push.c.a(4, c());
            }
            this.f107079a = iA;
            return iA;
        }

        public d b(String str) {
            this.f107082d = true;
            this.f107080b = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m326b() {
            return this.f107080b;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m327b() {
            return this.f374a;
        }

        public d c(String str) {
            this.f107083e = true;
            this.f107081c = str;
            return this;
        }

        public String c() {
            return this.f107081c;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m328c() {
            return this.f376c;
        }

        public boolean d() {
            return this.f107082d;
        }

        public boolean e() {
            return this.f107083e;
        }
    }

    public static final class e extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f377a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f380a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private com.xiaomi.push.a f381b;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f383b;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private boolean f385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f107087d;

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private boolean f387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f107088e;

        /* JADX INFO: renamed from: e, reason: collision with other field name */
        private boolean f389e;

        /* JADX INFO: renamed from: f, reason: collision with other field name */
        private boolean f390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f107090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f107091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f107092i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f107093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f107094k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f107095l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f107096m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107084a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f379a = "";

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private String f382b = "";

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private String f384c = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107085b = 0;

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private String f386d = "";

        /* JADX INFO: renamed from: e, reason: collision with other field name */
        private String f388e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f107089f = "";

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private b f378a = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f107086c = 0;

        public e() {
            com.xiaomi.push.a aVar = com.xiaomi.push.a.f106807a;
            this.f377a = aVar;
            this.f381b = aVar;
            this.f107087d = 0;
            this.f107088e = -1;
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107088e < 0) {
                b();
            }
            return this.f107088e;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m329a() {
            return this.f377a;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public b m330a() {
            return this.f378a;
        }

        public e a(int i10) {
            this.f380a = true;
            this.f107084a = i10;
            return this;
        }

        public e a(com.xiaomi.push.a aVar) {
            this.f107094k = true;
            this.f377a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public e a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                switch (iM158a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.c());
                        break;
                    case 18:
                        a(bVar.m161a());
                        break;
                    case 26:
                        b(bVar.m161a());
                        break;
                    case 34:
                        c(bVar.m161a());
                        break;
                    case 40:
                        b(bVar.m167b());
                        break;
                    case 50:
                        d(bVar.m161a());
                        break;
                    case 58:
                        e(bVar.m161a());
                        break;
                    case 66:
                        f(bVar.m161a());
                        break;
                    case 74:
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                        break;
                    case 80:
                        c(bVar.m167b());
                        break;
                    case 90:
                        a(bVar.m160a());
                        break;
                    case 98:
                        b(bVar.m160a());
                        break;
                    case 104:
                        d(bVar.m167b());
                        break;
                    default:
                        if (!a(bVar, iM158a)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }

        public e a(b bVar) {
            bVar.getClass();
            this.f107092i = true;
            this.f378a = bVar;
            return this;
        }

        public e a(String str) {
            this.f383b = true;
            this.f379a = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m331a() {
            return this.f379a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m332a()) {
                cVar.m211b(1, c());
            }
            if (m335b()) {
                cVar.m202a(2, m331a());
            }
            if (m337c()) {
                cVar.m202a(3, m334b());
            }
            if (m339d()) {
                cVar.m202a(4, m336c());
            }
            if (m341e()) {
                cVar.m198a(5, d());
            }
            if (m343f()) {
                cVar.m202a(6, m338d());
            }
            if (g()) {
                cVar.m202a(7, m340e());
            }
            if (h()) {
                cVar.m202a(8, m342f());
            }
            if (i()) {
                cVar.m201a(9, (com.xiaomi.push.e) m330a());
            }
            if (j()) {
                cVar.m198a(10, e());
            }
            if (k()) {
                cVar.m200a(11, m329a());
            }
            if (l()) {
                cVar.m200a(12, m333b());
            }
            if (m()) {
                cVar.m198a(13, f());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m332a() {
            return this.f380a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iB = m332a() ? 0 + com.xiaomi.push.c.b(1, c()) : 0;
            if (m335b()) {
                iB += com.xiaomi.push.c.a(2, m331a());
            }
            if (m337c()) {
                iB += com.xiaomi.push.c.a(3, m334b());
            }
            if (m339d()) {
                iB += com.xiaomi.push.c.a(4, m336c());
            }
            if (m341e()) {
                iB += com.xiaomi.push.c.a(5, d());
            }
            if (m343f()) {
                iB += com.xiaomi.push.c.a(6, m338d());
            }
            if (g()) {
                iB += com.xiaomi.push.c.a(7, m340e());
            }
            if (h()) {
                iB += com.xiaomi.push.c.a(8, m342f());
            }
            if (i()) {
                iB += com.xiaomi.push.c.a(9, (com.xiaomi.push.e) m330a());
            }
            if (j()) {
                iB += com.xiaomi.push.c.a(10, e());
            }
            if (k()) {
                iB += com.xiaomi.push.c.a(11, m329a());
            }
            if (l()) {
                iB += com.xiaomi.push.c.a(12, m333b());
            }
            if (m()) {
                iB += com.xiaomi.push.c.a(13, f());
            }
            this.f107088e = iB;
            return iB;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public com.xiaomi.push.a m333b() {
            return this.f381b;
        }

        public e b(int i10) {
            this.f389e = true;
            this.f107085b = i10;
            return this;
        }

        public e b(com.xiaomi.push.a aVar) {
            this.f107095l = true;
            this.f381b = aVar;
            return this;
        }

        public e b(String str) {
            this.f385c = true;
            this.f382b = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m334b() {
            return this.f382b;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m335b() {
            return this.f383b;
        }

        public int c() {
            return this.f107084a;
        }

        public e c(int i10) {
            this.f107093j = true;
            this.f107086c = i10;
            return this;
        }

        public e c(String str) {
            this.f387d = true;
            this.f384c = str;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public String m336c() {
            return this.f384c;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m337c() {
            return this.f385c;
        }

        public int d() {
            return this.f107085b;
        }

        public e d(int i10) {
            this.f107096m = true;
            this.f107087d = i10;
            return this;
        }

        public e d(String str) {
            this.f390f = true;
            this.f386d = str;
            return this;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public String m338d() {
            return this.f386d;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m339d() {
            return this.f387d;
        }

        public int e() {
            return this.f107086c;
        }

        public e e(String str) {
            this.f107090g = true;
            this.f388e = str;
            return this;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public String m340e() {
            return this.f388e;
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m341e() {
            return this.f389e;
        }

        public int f() {
            return this.f107087d;
        }

        public e f(String str) {
            this.f107091h = true;
            this.f107089f = str;
            return this;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public String m342f() {
            return this.f107089f;
        }

        /* JADX INFO: renamed from: f, reason: collision with other method in class */
        public boolean m343f() {
            return this.f390f;
        }

        public boolean g() {
            return this.f107090g;
        }

        public boolean h() {
            return this.f107091h;
        }

        public boolean i() {
            return this.f107092i;
        }

        public boolean j() {
            return this.f107093j;
        }

        public boolean k() {
            return this.f107094k;
        }

        public boolean l() {
            return this.f107095l;
        }

        public boolean m() {
            return this.f107096m;
        }
    }

    public static final class f extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f393a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f107099c;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f392a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f107098b = "";

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private b f391a = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107097a = -1;

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107097a < 0) {
                b();
            }
            return this.f107097a;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public b m344a() {
            return this.f391a;
        }

        @Override // com.xiaomi.push.e
        public f a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 10) {
                    a(bVar.m161a());
                } else if (iM158a == 18) {
                    b(bVar.m161a());
                } else if (iM158a == 26) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public f a(b bVar) {
            bVar.getClass();
            this.f107099c = true;
            this.f391a = bVar;
            return this;
        }

        public f a(String str) {
            this.f393a = true;
            this.f392a = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m345a() {
            return this.f392a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m346a()) {
                cVar.m202a(1, m345a());
            }
            if (m348b()) {
                cVar.m202a(2, m347b());
            }
            if (c()) {
                cVar.m201a(3, (com.xiaomi.push.e) m344a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m346a() {
            return this.f393a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m346a() ? 0 + com.xiaomi.push.c.a(1, m345a()) : 0;
            if (m348b()) {
                iA += com.xiaomi.push.c.a(2, m347b());
            }
            if (c()) {
                iA += com.xiaomi.push.c.a(3, (com.xiaomi.push.e) m344a());
            }
            this.f107097a = iA;
            return iA;
        }

        public f b(String str) {
            this.f394b = true;
            this.f107098b = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m347b() {
            return this.f107098b;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m348b() {
            return this.f394b;
        }

        public boolean c() {
            return this.f107099c;
        }
    }

    public static final class g extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f396a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f397b;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private boolean f398c;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f395a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f107101b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f107102c = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107100a = -1;

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107100a < 0) {
                b();
            }
            return this.f107100a;
        }

        @Override // com.xiaomi.push.e
        public g a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 10) {
                    a(bVar.m161a());
                } else if (iM158a == 18) {
                    b(bVar.m161a());
                } else if (iM158a == 26) {
                    c(bVar.m161a());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public g a(String str) {
            this.f396a = true;
            this.f395a = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m349a() {
            return this.f395a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m350a()) {
                cVar.m202a(1, m349a());
            }
            if (m352b()) {
                cVar.m202a(2, m351b());
            }
            if (m353c()) {
                cVar.m202a(3, c());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m350a() {
            return this.f396a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m350a() ? 0 + com.xiaomi.push.c.a(1, m349a()) : 0;
            if (m352b()) {
                iA += com.xiaomi.push.c.a(2, m351b());
            }
            if (m353c()) {
                iA += com.xiaomi.push.c.a(3, c());
            }
            this.f107100a = iA;
            return iA;
        }

        public g b(String str) {
            this.f397b = true;
            this.f107101b = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m351b() {
            return this.f107101b;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m352b() {
            return this.f397b;
        }

        public g c(String str) {
            this.f398c = true;
            this.f107102c = str;
            return this;
        }

        public String c() {
            return this.f107102c;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m353c() {
            return this.f398c;
        }
    }

    public static final class h extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f400a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f401b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107103a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f399a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107104b = -1;

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107104b < 0) {
                b();
            }
            return this.f107104b;
        }

        public h a(int i10) {
            this.f400a = true;
            this.f107103a = i10;
            return this;
        }

        @Override // com.xiaomi.push.e
        public h a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 8) {
                    a(bVar.m167b());
                } else if (iM158a == 18) {
                    a(bVar.m161a());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public h a(String str) {
            this.f401b = true;
            this.f399a = str;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m354a() {
            return this.f399a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m355a()) {
                cVar.m198a(1, c());
            }
            if (m356b()) {
                cVar.m202a(2, m354a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m355a() {
            return this.f400a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m355a() ? 0 + com.xiaomi.push.c.a(1, c()) : 0;
            if (m356b()) {
                iA += com.xiaomi.push.c.a(2, m354a());
            }
            this.f107104b = iA;
            return iA;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m356b() {
            return this.f401b;
        }

        public int c() {
            return this.f107103a;
        }
    }

    public static final class i extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f403a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f402a = com.xiaomi.push.a.f106807a;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107105a = -1;

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107105a < 0) {
                b();
            }
            return this.f107105a;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m357a() {
            return this.f402a;
        }

        public i a(com.xiaomi.push.a aVar) {
            this.f403a = true;
            this.f402a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public i a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 10) {
                    a(bVar.m160a());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m358a()) {
                cVar.m200a(1, m357a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m358a() {
            return this.f403a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m358a() ? 0 + com.xiaomi.push.c.a(1, m357a()) : 0;
            this.f107105a = iA;
            return iA;
        }
    }

    public static final class j extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f107107b;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.a f404a = com.xiaomi.push.a.f106807a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private b f405a = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107106a = -1;

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107106a < 0) {
                b();
            }
            return this.f107106a;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.a m359a() {
            return this.f404a;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public b m360a() {
            return this.f405a;
        }

        public j a(com.xiaomi.push.a aVar) {
            this.f406a = true;
            this.f404a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public j a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 10) {
                    a(bVar.m160a());
                } else if (iM158a == 18) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public j a(b bVar) {
            bVar.getClass();
            this.f107107b = true;
            this.f405a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m361a()) {
                cVar.m200a(1, m359a());
            }
            if (m362b()) {
                cVar.m201a(2, (com.xiaomi.push.e) m360a());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m361a() {
            return this.f406a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m361a() ? 0 + com.xiaomi.push.c.a(1, m359a()) : 0;
            if (m362b()) {
                iA += com.xiaomi.push.c.a(2, (com.xiaomi.push.e) m360a());
            }
            this.f107106a = iA;
            return iA;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m362b() {
            return this.f107107b;
        }
    }

    public static final class k extends com.xiaomi.push.e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f409a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f107110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f107111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f107112e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f107114g;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f408a = "";

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private String f411b = "";

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private long f407a = 0;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private long f410b = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f107113f = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107108a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107109b = -1;

        public static k a(byte[] bArr) {
            return (k) new k().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107109b < 0) {
                b();
            }
            return this.f107109b;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public long m363a() {
            return this.f407a;
        }

        public k a(int i10) {
            this.f107114g = true;
            this.f107108a = i10;
            return this;
        }

        public k a(long j10) {
            this.f107110c = true;
            this.f407a = j10;
            return this;
        }

        @Override // com.xiaomi.push.e
        public k a(com.xiaomi.push.b bVar) throws com.xiaomi.push.d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 10) {
                    a(bVar.m161a());
                } else if (iM158a == 18) {
                    b(bVar.m161a());
                } else if (iM158a == 24) {
                    a(bVar.m159a());
                } else if (iM158a == 32) {
                    b(bVar.m159a());
                } else if (iM158a == 40) {
                    a(bVar.m164a());
                } else if (iM158a == 48) {
                    a(bVar.m167b());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public k a(String str) {
            this.f409a = true;
            this.f408a = str;
            return this;
        }

        public k a(boolean z10) {
            this.f107112e = true;
            this.f107113f = z10;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m364a() {
            return this.f408a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) throws IOException {
            if (m365a()) {
                cVar.m202a(1, m364a());
            }
            if (m368b()) {
                cVar.m202a(2, m367b());
            }
            if (m369c()) {
                cVar.m199a(3, m363a());
            }
            if (d()) {
                cVar.m199a(4, m366b());
            }
            if (f()) {
                cVar.m203a(5, e());
            }
            if (g()) {
                cVar.m198a(6, c());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m365a() {
            return this.f409a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = m365a() ? 0 + com.xiaomi.push.c.a(1, m364a()) : 0;
            if (m368b()) {
                iA += com.xiaomi.push.c.a(2, m367b());
            }
            if (m369c()) {
                iA += com.xiaomi.push.c.a(3, m363a());
            }
            if (d()) {
                iA += com.xiaomi.push.c.a(4, m366b());
            }
            if (f()) {
                iA += com.xiaomi.push.c.a(5, e());
            }
            if (g()) {
                iA += com.xiaomi.push.c.a(6, c());
            }
            this.f107109b = iA;
            return iA;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public long m366b() {
            return this.f410b;
        }

        public k b(long j10) {
            this.f107111d = true;
            this.f410b = j10;
            return this;
        }

        public k b(String str) {
            this.f412b = true;
            this.f411b = str;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public String m367b() {
            return this.f411b;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m368b() {
            return this.f412b;
        }

        public int c() {
            return this.f107108a;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m369c() {
            return this.f107110c;
        }

        public boolean d() {
            return this.f107111d;
        }

        public boolean e() {
            return this.f107113f;
        }

        public boolean f() {
            return this.f107112e;
        }

        public boolean g() {
            return this.f107114g;
        }
    }
}
