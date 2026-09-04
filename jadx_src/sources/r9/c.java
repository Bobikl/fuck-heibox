package r9;

import com.google.common.escape.h;
import com.google.common.escape.i;
import kotlin.text.y;
import okio.Utf8;

/* JADX INFO: compiled from: XmlEscapers.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@a
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f138861a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f138862b = 31;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f138863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f138864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f138865e;

    static {
        i.c cVarB = i.b();
        cVarB.d((char) 0, Utf8.REPLACEMENT_CHARACTER);
        cVarB.e("�");
        for (char c10 = 0; c10 <= 31; c10 = (char) (c10 + 1)) {
            if (c10 != '\t' && c10 != '\n' && c10 != '\r') {
                cVarB.b(c10, "�");
            }
        }
        cVarB.b(y.f128595d, "&amp;");
        cVarB.b(y.f128596e, "&lt;");
        cVarB.b(y.f128597f, "&gt;");
        f138864d = cVarB.c();
        cVarB.b('\'', "&apos;");
        cVarB.b(y.f128593b, "&quot;");
        f138863c = cVarB.c();
        cVarB.b('\t', "&#x9;");
        cVarB.b('\n', "&#xA;");
        cVarB.b('\r', "&#xD;");
        f138865e = cVarB.c();
    }

    private c() {
    }

    public static h a() {
        return f138865e;
    }

    public static h b() {
        return f138864d;
    }
}
