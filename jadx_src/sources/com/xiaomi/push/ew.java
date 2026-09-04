package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ew {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f345a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f346b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f107052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f107053e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107049a = 0;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private boolean f347c = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f107050b = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f107054f = false;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private List<String> f344a = Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f107051c = -1;

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }

        public static a b(b bVar) {
            return new a().a(bVar);
        }

        @Override // com.xiaomi.push.e
        public int a() {
            if (this.f107051c < 0) {
                b();
            }
            return this.f107051c;
        }

        public a a(int i10) {
            this.f345a = true;
            this.f107049a = i10;
            return this;
        }

        @Override // com.xiaomi.push.e
        public a a(b bVar) throws d {
            while (true) {
                int iM158a = bVar.m158a();
                if (iM158a == 0) {
                    return this;
                }
                if (iM158a == 8) {
                    a(bVar.c());
                } else if (iM158a == 16) {
                    a(bVar.m164a());
                } else if (iM158a == 24) {
                    b(bVar.m167b());
                } else if (iM158a == 32) {
                    b(bVar.m164a());
                } else if (iM158a == 42) {
                    a(bVar.m161a());
                } else if (!a(bVar, iM158a)) {
                    return this;
                }
            }
        }

        public a a(String str) {
            str.getClass();
            if (this.f344a.isEmpty()) {
                this.f344a = new ArrayList();
            }
            this.f344a.add(str);
            return this;
        }

        public a a(boolean z10) {
            this.f346b = true;
            this.f347c = z10;
            return this;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public List<String> m289a() {
            return this.f344a;
        }

        @Override // com.xiaomi.push.e
        public void a(c cVar) {
            if (m290a()) {
                cVar.m211b(1, c());
            }
            if (m292c()) {
                cVar.m203a(2, m291b());
            }
            if (m293d()) {
                cVar.m198a(3, d());
            }
            if (f()) {
                cVar.m203a(4, m294e());
            }
            Iterator<String> it = m289a().iterator();
            while (it.hasNext()) {
                cVar.m202a(5, it.next());
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m290a() {
            return this.f345a;
        }

        @Override // com.xiaomi.push.e
        public int b() {
            int iA = 0;
            int iB = m290a() ? c.b(1, c()) + 0 : 0;
            if (m292c()) {
                iB += c.a(2, m291b());
            }
            if (m293d()) {
                iB += c.a(3, d());
            }
            if (f()) {
                iB += c.a(4, m294e());
            }
            Iterator<String> it = m289a().iterator();
            while (it.hasNext()) {
                iA += c.a(it.next());
            }
            int size = iB + iA + (m289a().size() * 1);
            this.f107051c = size;
            return size;
        }

        public a b(int i10) {
            this.f107052d = true;
            this.f107050b = i10;
            return this;
        }

        public a b(boolean z10) {
            this.f107053e = true;
            this.f107054f = z10;
            return this;
        }

        /* JADX INFO: renamed from: b, reason: collision with other method in class */
        public boolean m291b() {
            return this.f347c;
        }

        public int c() {
            return this.f107049a;
        }

        /* JADX INFO: renamed from: c, reason: collision with other method in class */
        public boolean m292c() {
            return this.f346b;
        }

        public int d() {
            return this.f107050b;
        }

        /* JADX INFO: renamed from: d, reason: collision with other method in class */
        public boolean m293d() {
            return this.f107052d;
        }

        public int e() {
            return this.f344a.size();
        }

        /* JADX INFO: renamed from: e, reason: collision with other method in class */
        public boolean m294e() {
            return this.f107054f;
        }

        public boolean f() {
            return this.f107053e;
        }
    }
}
