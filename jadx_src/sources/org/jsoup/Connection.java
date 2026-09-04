package org.jsoup;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import org.jsoup.nodes.Document;

/* JADX INFO: loaded from: classes5.dex */
public interface Connection {

    public enum Method {
        GET,
        POST
    }

    public interface a<T extends a> {
        T C(String str);

        Map<String, String> D();

        T a(String str, String str2);

        T c(String str, String str2);

        T g(URL url);

        T k(Method method);

        Method method();

        URL n();

        String o(String str);

        String q(String str);

        Map<String, String> v();

        boolean x(String str);

        T y(String str);

        boolean z(String str);
    }

    public interface b {
        b a(String str);

        b b(String str);

        String key();

        String value();
    }

    public interface c extends a<c> {
        boolean B();

        c b(boolean z10);

        c d(int i10);

        Collection<b> e();

        c f(org.jsoup.parser.d dVar);

        c h(int i10);

        c i(boolean z10);

        c l(boolean z10);

        org.jsoup.parser.d m();

        boolean p();

        int s();

        boolean t();

        int timeout();

        c u(b bVar);
    }

    public interface d extends a<d> {
        String A();

        String E();

        byte[] F();

        String body();

        String j();

        int r();

        Document w() throws IOException;
    }

    Connection a(String str, String str2);

    Connection b(boolean z10);

    Connection c(String str, String str2);

    Connection d(int i10);

    Connection e(String str, String str2);

    d execute() throws IOException;

    Connection f(org.jsoup.parser.d dVar);

    Connection g(URL url);

    Document get() throws IOException;

    Connection h(int i10);

    Connection i(boolean z10);

    Connection j(String str);

    Connection k(Method method);

    Connection l(boolean z10);

    d m();

    Connection n(String str);

    Connection o(Map<String, String> map);

    Connection p(String... strArr);

    Connection q(Map<String, String> map);

    Document r() throws IOException;

    c request();

    Connection s(String str);

    Connection t(c cVar);

    Connection u(d dVar);
}
