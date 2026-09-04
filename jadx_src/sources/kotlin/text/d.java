package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f128565a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Charset f128566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Charset f128567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Charset f128568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Charset f128569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Charset f128570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Charset f128571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private static volatile Charset f128572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private static volatile Charset f128573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private static volatile Charset f128574j;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        f0.o(charsetForName, "forName(\"UTF-8\")");
        f128566b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        f0.o(charsetForName2, "forName(\"UTF-16\")");
        f128567c = charsetForName2;
        Charset charsetForName3 = Charset.forName(mj.c.f131911d);
        f0.o(charsetForName3, "forName(\"UTF-16BE\")");
        f128568d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        f0.o(charsetForName4, "forName(\"UTF-16LE\")");
        f128569e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        f0.o(charsetForName5, "forName(\"US-ASCII\")");
        f128570f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        f0.o(charsetForName6, "forName(\"ISO-8859-1\")");
        f128571g = charsetForName6;
    }

    private d() {
    }

    @dl.d
    @xh.h(name = "UTF32")
    public final Charset a() {
        Charset charset = f128572h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        f0.o(charsetForName, "forName(\"UTF-32\")");
        f128572h = charsetForName;
        return charsetForName;
    }

    @dl.d
    @xh.h(name = "UTF32_BE")
    public final Charset b() {
        Charset charset = f128574j;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        f0.o(charsetForName, "forName(\"UTF-32BE\")");
        f128574j = charsetForName;
        return charsetForName;
    }

    @dl.d
    @xh.h(name = "UTF32_LE")
    public final Charset c() {
        Charset charset = f128573i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        f0.o(charsetForName, "forName(\"UTF-32LE\")");
        f128573i = charsetForName;
        return charsetForName;
    }
}
