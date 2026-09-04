package com.google.common.io;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: Resources.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class d0 {

    /* JADX INFO: compiled from: Resources.java */
    public class a implements u<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f58655a = Lists.q();

        a() {
        }

        @Override // com.google.common.io.u
        public boolean a(String str) {
            this.f58655a.add(str);
            return true;
        }

        @Override // com.google.common.io.u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f58655a;
        }
    }

    /* JADX INFO: compiled from: Resources.java */
    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final URL f58656a;

        private b(URL url) {
            this.f58656a = (URL) com.google.common.base.w.E(url);
        }

        /* synthetic */ b(URL url, a aVar) {
            this(url);
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return this.f58656a.openStream();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58656a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("Resources.asByteSource(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private d0() {
    }

    public static f a(URL url) {
        return new b(url, null);
    }

    public static j b(URL url, Charset charset) {
        return a(url).a(charset);
    }

    public static void c(URL url, OutputStream outputStream) throws Throwable {
        a(url).g(outputStream);
    }

    @s9.a
    public static URL d(Class<?> cls, String str) {
        URL resource = cls.getResource(str);
        com.google.common.base.w.y(resource != null, "resource %s relative to %s not found.", str, cls.getName());
        return resource;
    }

    @s9.a
    public static URL e(String str) {
        URL resource = ((ClassLoader) com.google.common.base.q.a(Thread.currentThread().getContextClassLoader(), d0.class.getClassLoader())).getResource(str);
        com.google.common.base.w.u(resource != null, "resource %s not found.", str);
        return resource;
    }

    @a0
    @s9.a
    public static <T> T f(URL url, Charset charset, u<T> uVar) throws IOException {
        return (T) b(url, charset).q(uVar);
    }

    public static List<String> g(URL url, Charset charset) throws IOException {
        return (List) f(url, charset, new a());
    }

    public static byte[] h(URL url) throws IOException {
        return a(url).o();
    }

    public static String i(URL url, Charset charset) throws IOException {
        return b(url, charset).n();
    }
}
