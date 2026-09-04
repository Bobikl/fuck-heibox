package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ProxyConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28325c = "http";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28326d = "https";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28327e = "*";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28328f = "direct://";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f28329g = "<local>";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f28330h = "<-loopback>";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<C0226b> f28331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f28332b;

    /* JADX INFO: compiled from: ProxyConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<C0226b> f28333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f28334b;

        public a() {
            this.f28333a = new ArrayList();
            this.f28334b = new ArrayList();
        }

        public a(@n0 b bVar) {
            this.f28333a = bVar.b();
            this.f28334b = bVar.a();
        }

        @n0
        private List<String> g() {
            return this.f28334b;
        }

        @n0
        private List<C0226b> i() {
            return this.f28333a;
        }

        @n0
        public a a(@n0 String str) {
            this.f28334b.add(str);
            return this;
        }

        @n0
        public a b() {
            return c(b.f28327e);
        }

        @n0
        public a c(@n0 String str) {
            this.f28333a.add(new C0226b(str, b.f28328f));
            return this;
        }

        @n0
        public a d(@n0 String str) {
            this.f28333a.add(new C0226b(str));
            return this;
        }

        @n0
        public a e(@n0 String str, @n0 String str2) {
            this.f28333a.add(new C0226b(str2, str));
            return this;
        }

        @n0
        public b f() {
            return new b(i(), g());
        }

        @n0
        public a h() {
            return a(b.f28329g);
        }

        @n0
        public a j() {
            return a(b.f28330h);
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProxyConfig.java */
    public static final class C0226b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28336b;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C0226b(@n0 String str) {
            this(b.f28327e, str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C0226b(@n0 String str, @n0 String str2) {
            this.f28335a = str;
            this.f28336b = str2;
        }

        @n0
        public String a() {
            return this.f28335a;
        }

        @n0
        public String b() {
            return this.f28336b;
        }
    }

    /* JADX INFO: compiled from: ProxyConfig.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public b(@n0 List<C0226b> list, @n0 List<String> list2) {
        this.f28331a = list;
        this.f28332b = list2;
    }

    @n0
    public List<String> a() {
        return Collections.unmodifiableList(this.f28332b);
    }

    @n0
    public List<C0226b> b() {
        return Collections.unmodifiableList(this.f28331a);
    }
}
