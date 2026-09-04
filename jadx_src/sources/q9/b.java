package q9;

import com.google.common.escape.h;
import com.google.common.escape.i;
import kotlin.text.y;

/* JADX INFO: compiled from: HtmlEscapers.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@a
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f138640a = i.b().b(y.f128593b, "&quot;").b('\'', "&#39;").b(y.f128595d, "&amp;").b(y.f128596e, "&lt;").b(y.f128597f, "&gt;").c();

    private b() {
    }

    public static h a() {
        return f138640a;
    }
}
