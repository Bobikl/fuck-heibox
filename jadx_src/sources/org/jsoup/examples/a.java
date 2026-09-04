package org.jsoup.examples;

import com.google.android.exoplayer2.text.ttml.d;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import org.jsoup.helper.c;
import org.jsoup.nodes.g;
import org.jsoup.nodes.h;
import org.jsoup.select.e;
import org.jsoup.select.f;

/* JADX INFO: compiled from: HtmlToPlainText.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: compiled from: HtmlToPlainText.java */
    public class b implements f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f137829d = 80;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f137830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private StringBuilder f137831b;

        private b() {
            this.f137830a = 0;
            this.f137831b = new StringBuilder();
        }

        private void c(String str) {
            if (str.startsWith("\n")) {
                this.f137830a = 0;
            }
            if (str.equals(" ")) {
                if (this.f137831b.length() == 0) {
                    return;
                }
                StringBuilder sb2 = this.f137831b;
                if (c.a(sb2.substring(sb2.length() - 1), " ", "\n")) {
                    return;
                }
            }
            if (str.length() + this.f137830a <= 80) {
                this.f137831b.append(str);
                this.f137830a += str.length();
                return;
            }
            String[] strArrSplit = str.split("\\s+");
            int i10 = 0;
            while (i10 < strArrSplit.length) {
                String str2 = strArrSplit[i10];
                if (!(i10 == strArrSplit.length - 1)) {
                    str2 = str2 + " ";
                }
                if (str2.length() + this.f137830a > 80) {
                    StringBuilder sb3 = this.f137831b;
                    sb3.append("\n");
                    sb3.append(str2);
                    this.f137830a = str2.length();
                } else {
                    this.f137831b.append(str2);
                    this.f137830a += str2.length();
                }
                i10++;
            }
        }

        @Override // org.jsoup.select.f
        public void a(g gVar, int i10) {
            String strY = gVar.y();
            if (strY.equals(d.f49807t)) {
                c("\n");
            } else if (c.a(strY, "p", "h1", "h2", "h3", "h4", "h5")) {
                c("\n\n");
            } else if (strY.equals(ak.av)) {
                c(String.format(" <%s>", gVar.a("href")));
            }
        }

        @Override // org.jsoup.select.f
        public void b(g gVar, int i10) {
            String strY = gVar.y();
            if (gVar instanceof h) {
                c(((h) gVar).j0());
            } else if (strY.equals("li")) {
                c("\n * ");
            }
        }

        public String toString() {
            return this.f137831b.toString();
        }
    }

    public static void b(String... strArr) throws IOException {
        org.jsoup.helper.d.e(strArr.length == 1, "usage: supply url to fetch");
        System.out.println(new a().a(el.a.d(strArr[0]).get()));
    }

    public String a(org.jsoup.nodes.f fVar) {
        b bVar = new b();
        new e(bVar).a(fVar);
        return bVar.toString();
    }
}
