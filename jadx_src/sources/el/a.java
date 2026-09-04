package el;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.d;
import org.jsoup.safety.b;

/* JADX INFO: compiled from: Jsoup.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    private a() {
    }

    public static String a(String str, String str2, b bVar) {
        return new org.jsoup.safety.a(bVar).c(o(str, str2)).Q1().g1();
    }

    public static String b(String str, String str2, b bVar, Document.a aVar) {
        Document documentC = new org.jsoup.safety.a(bVar).c(o(str, str2));
        documentC.a2(aVar);
        return documentC.Q1().g1();
    }

    public static String c(String str, b bVar) {
        return a(str, "", bVar);
    }

    public static Connection d(String str) {
        return org.jsoup.helper.b.v(str);
    }

    public static boolean e(String str, b bVar) {
        return new org.jsoup.safety.a(bVar).f(o(str, ""));
    }

    public static Document f(File file, String str) throws IOException {
        return org.jsoup.helper.a.b(file, str, file.getAbsolutePath());
    }

    public static Document g(File file, String str, String str2) throws IOException {
        return org.jsoup.helper.a.b(file, str, str2);
    }

    public static Document h(InputStream inputStream, String str, String str2) throws IOException {
        return org.jsoup.helper.a.c(inputStream, str, str2);
    }

    public static Document i(InputStream inputStream, String str, String str2, d dVar) throws IOException {
        return org.jsoup.helper.a.d(inputStream, str, str2, dVar);
    }

    public static Document j(String str) {
        return d.e(str, "");
    }

    public static Document k(String str, String str2) {
        return d.e(str, str2);
    }

    public static Document l(String str, String str2, d dVar) {
        return dVar.i(str, str2);
    }

    public static Document m(URL url, int i10) throws IOException {
        Connection connectionW = org.jsoup.helper.b.w(url);
        connectionW.d(i10);
        return connectionW.get();
    }

    public static Document n(String str) {
        return d.f(str, "");
    }

    public static Document o(String str, String str2) {
        return d.f(str, str2);
    }
}
