package org.jsoup.examples;

import com.tencent.open.SocialConstants;
import java.io.IOException;
import org.jsoup.helper.d;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.f;
import org.jsoup.select.c;

/* JADX INFO: compiled from: ListLinks.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static void a(String[] strArr) throws IOException {
        d.e(strArr.length == 1, "usage: supply url to fetch");
        String str = strArr[0];
        b("Fetching %s...", str);
        Document document = el.a.d(str).get();
        c cVarC1 = document.C1("a[href]");
        c cVarC2 = document.C1("[src]");
        c cVarC3 = document.C1("link[href]");
        b("\nMedia: (%d)", Integer.valueOf(cVarC2.size()));
        for (f fVar : cVarC2) {
            if (fVar.F1().equals(SocialConstants.PARAM_IMG_URL)) {
                b(" * %s: <%s> %sx%s (%s)", fVar.F1(), fVar.g("abs:src"), fVar.g("width"), fVar.g("height"), c(fVar.g("alt"), 20));
            } else {
                b(" * %s: <%s>", fVar.F1(), fVar.g("abs:src"));
            }
        }
        b("\nImports: (%d)", Integer.valueOf(cVarC3.size()));
        for (f fVar2 : cVarC3) {
            b(" * %s <%s> (%s)", fVar2.F1(), fVar2.g("abs:href"), fVar2.g("rel"));
        }
        b("\nLinks: (%d)", Integer.valueOf(cVarC1.size()));
        for (f fVar3 : cVarC1) {
            b(" * a: <%s>  (%s)", fVar3.g("abs:href"), c(fVar3.H1(), 35));
        }
    }

    private static void b(String str, Object... objArr) {
        System.out.println(String.format(str, objArr));
    }

    private static String c(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        return str.substring(0, i10 - 1) + ".";
    }
}
