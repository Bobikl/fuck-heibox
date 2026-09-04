package com.google.common.net;

import com.google.common.base.Optional;
import com.google.common.base.n;
import com.google.common.base.p;
import com.google.common.base.q;
import com.google.common.base.s;
import com.google.common.base.w;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.b3;
import com.google.common.collect.r1;
import com.huawei.hms.framework.common.ContainerUtils;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.tencent.qcloud.core.util.IOUtils;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.text.y;

/* JADX INFO: compiled from: MediaType.java */
/* JADX INFO: loaded from: classes7.dex */
@com.google.common.net.a
@o9.b
@s9.j
public final class h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f58945l = "application";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f58948m = "audio";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f58951n = "image";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f58954o = "text";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f58957p = "video";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f58960q = "font";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f58963r = "*";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImmutableListMultimap<String, String> f58992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private String f58993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @t9.b
    private int f58994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private Optional<Charset> f58995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f58930g = "charset";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ImmutableListMultimap<String, String> f58933h = ImmutableListMultimap.V(f58930g, com.google.common.base.a.g(com.google.common.base.c.f56721c.name()));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.common.base.b f58936i = com.google.common.base.b.f().b(com.google.common.base.b.v().F()).b(com.google.common.base.b.s(' ')).b(com.google.common.base.b.H("()<>@,;:\\\"/[]?="));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.google.common.base.b f58939j = com.google.common.base.b.f().b(com.google.common.base.b.H("\"\\\r"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.common.base.b f58942k = com.google.common.base.b.d(" \t\r\n");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map<h, h> f58966s = Maps.Y();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f58969t = i("*", "*");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f58972u = i("text", "*");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f58975v = i("image", "*");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f58978w = i("audio", "*");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f58981x = i("video", "*");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f58984y = i("application", "*");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h f58987z = i("font", "*");
    public static final h A = j("text", "cache-manifest");
    public static final h B = j("text", "css");
    public static final h C = j("text", "csv");
    public static final h D = j("text", LinkDraftObj.DRAFT_TYPE_HTML);
    public static final h E = j("text", "calendar");
    public static final h F = j("text", org.apache.tools.ant.taskdefs.email.b.K);
    public static final h G = j("text", "javascript");
    public static final h H = j("text", "tab-separated-values");
    public static final h I = j("text", "vcard");
    public static final h J = j("text", "vnd.wap.wml");
    public static final h K = j("text", "xml");
    public static final h L = j("text", "vtt");
    public static final h M = i("image", "bmp");
    public static final h N = i("image", "x-canon-crw");
    public static final h O = i("image", "gif");
    public static final h P = i("image", "vnd.microsoft.icon");
    public static final h Q = i("image", "jpeg");
    public static final h R = i("image", "png");
    public static final h S = i("image", "vnd.adobe.photoshop");
    public static final h T = j("image", "svg+xml");
    public static final h U = i("image", "tiff");
    public static final h V = i("image", "webp");
    public static final h W = i("image", "heif");
    public static final h X = i("image", "jp2");
    public static final h Y = i("audio", "mp4");
    public static final h Z = i("audio", "mpeg");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h f58918a0 = i("audio", "ogg");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h f58920b0 = i("audio", "webm");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h f58922c0 = i("audio", "l16");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h f58924d0 = i("audio", "l24");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h f58926e0 = i("audio", "basic");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h f58928f0 = i("audio", "aac");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final h f58931g0 = i("audio", "vorbis");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final h f58934h0 = i("audio", "x-ms-wma");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final h f58937i0 = i("audio", "x-ms-wax");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h f58940j0 = i("audio", "vnd.rn-realaudio");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h f58943k0 = i("audio", "vnd.wave");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final h f58946l0 = i("video", "mp4");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final h f58949m0 = i("video", "mpeg");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final h f58952n0 = i("video", "ogg");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final h f58955o0 = i("video", "quicktime");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h f58958p0 = i("video", "webm");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final h f58961q0 = i("video", "x-ms-wmv");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final h f58964r0 = i("video", "x-flv");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final h f58967s0 = i("video", "3gpp");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final h f58970t0 = i("video", "3gpp2");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final h f58973u0 = j("application", "xml");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final h f58976v0 = j("application", "atom+xml");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final h f58979w0 = i("application", "x-bzip2");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h f58982x0 = j("application", "dart");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final h f58985y0 = i("application", "vnd.apple.pkpass");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final h f58988z0 = i("application", "vnd.ms-fontobject");
    public static final h A0 = i("application", "epub+zip");
    public static final h B0 = i("application", "x-www-form-urlencoded");
    public static final h C0 = i("application", "pkcs12");
    public static final h D0 = i("application", "binary");
    public static final h E0 = i("application", "geo+json");
    public static final h F0 = i("application", "x-gzip");
    public static final h G0 = i("application", "hal+json");
    public static final h H0 = j("application", "javascript");
    public static final h I0 = i("application", "jose");
    public static final h J0 = i("application", "jose+json");
    public static final h K0 = j("application", "json");
    public static final h L0 = j("application", "manifest+json");
    public static final h M0 = i("application", "vnd.google-earth.kml+xml");
    public static final h N0 = i("application", "vnd.google-earth.kmz");
    public static final h O0 = i("application", "mbox");
    public static final h P0 = i("application", "x-apple-aspen-config");
    public static final h Q0 = i("application", "vnd.ms-excel");
    public static final h R0 = i("application", "vnd.ms-outlook");
    public static final h S0 = i("application", "vnd.ms-powerpoint");
    public static final h T0 = i("application", "msword");
    public static final h U0 = i("application", "dash+xml");
    public static final h V0 = i("application", "wasm");
    public static final h W0 = i("application", "x-nacl");
    public static final h X0 = i("application", "x-pnacl");
    public static final h Y0 = i("application", "octet-stream");
    public static final h Z0 = i("application", "ogg");

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final h f58919a1 = i("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final h f58921b1 = i("application", "vnd.openxmlformats-officedocument.presentationml.presentation");

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final h f58923c1 = i("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final h f58925d1 = i("application", "vnd.oasis.opendocument.graphics");

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final h f58927e1 = i("application", "vnd.oasis.opendocument.presentation");

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final h f58929f1 = i("application", "vnd.oasis.opendocument.spreadsheet");

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final h f58932g1 = i("application", "vnd.oasis.opendocument.text");

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final h f58935h1 = j("application", "opensearchdescription+xml");

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final h f58938i1 = i("application", "pdf");

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final h f58941j1 = i("application", "postscript");

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final h f58944k1 = i("application", "protobuf");

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final h f58947l1 = j("application", "rdf+xml");

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final h f58950m1 = j("application", "rtf");

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final h f58953n1 = i("application", "font-sfnt");

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final h f58956o1 = i("application", "x-shockwave-flash");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final h f58959p1 = i("application", "vnd.sketchup.skp");

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final h f58962q1 = j("application", "soap+xml");

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final h f58965r1 = i("application", "x-tar");

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final h f58968s1 = i("application", "font-woff");

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final h f58971t1 = i("application", "font-woff2");

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final h f58974u1 = j("application", "xhtml+xml");

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final h f58977v1 = j("application", "xrd+xml");

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final h f58980w1 = i("application", "zip");

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final h f58983x1 = i("font", "collection");

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final h f58986y1 = i("font", "otf");

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final h f58989z1 = i("font", "sfnt");
    public static final h A1 = i("font", "ttf");
    public static final h B1 = i("font", "woff");
    public static final h C1 = i("font", "woff2");
    private static final p.d D1 = p.p("; ").u(ContainerUtils.KEY_VALUE_DELIMITER);

    /* JADX INFO: compiled from: MediaType.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f58996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f58997b = 0;

        a(String str) {
            this.f58996a = str;
        }

        @s9.a
        char a(char c10) {
            w.g0(e());
            w.g0(f() == c10);
            this.f58997b++;
            return c10;
        }

        char b(com.google.common.base.b bVar) {
            w.g0(e());
            char cF = f();
            w.g0(bVar.B(cF));
            this.f58997b++;
            return cF;
        }

        String c(com.google.common.base.b bVar) {
            int i10 = this.f58997b;
            String strD = d(bVar);
            w.g0(this.f58997b != i10);
            return strD;
        }

        @s9.a
        String d(com.google.common.base.b bVar) {
            w.g0(e());
            int i10 = this.f58997b;
            this.f58997b = bVar.F().o(this.f58996a, i10);
            return e() ? this.f58996a.substring(i10, this.f58997b) : this.f58996a.substring(i10);
        }

        boolean e() {
            int i10 = this.f58997b;
            return i10 >= 0 && i10 < this.f58996a.length();
        }

        char f() {
            w.g0(e());
            return this.f58996a.charAt(this.f58997b);
        }
    }

    private h(String str, String str2, ImmutableListMultimap<String, String> immutableListMultimap) {
        this.f58990a = str;
        this.f58991b = str2;
        this.f58992c = immutableListMultimap;
    }

    private static h b(h hVar) {
        f58966s.put(hVar, hVar);
        return hVar;
    }

    private String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f58990a);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(this.f58991b);
        if (!this.f58992c.isEmpty()) {
            sb2.append("; ");
            D1.d(sb2, Multimaps.E(this.f58992c, new n() { // from class: com.google.common.net.g
                @Override // com.google.common.base.n
                public final Object apply(Object obj) {
                    return h.r((String) obj);
                }
            }).i());
        }
        return sb2.toString();
    }

    public static h e(String str, String str2) {
        h hVarF = f(str, str2, ImmutableListMultimap.T());
        hVarF.f58995f = Optional.a();
        return hVarF;
    }

    private static h f(String str, String str2, r1<String, String> r1Var) {
        w.E(str);
        w.E(str2);
        w.E(r1Var);
        String strT = t(str);
        String strT2 = t(str2);
        w.e(!"*".equals(strT) || "*".equals(strT2), "A wildcard type cannot be used with a non-wildcard subtype");
        ImmutableListMultimap.a aVarM = ImmutableListMultimap.M();
        for (Map.Entry<String, String> entry : r1Var.i()) {
            String strT3 = t(entry.getKey());
            aVarM.f(strT3, s(strT3, entry.getValue()));
        }
        h hVar = new h(strT, strT2, aVarM.a());
        return (h) q.a(f58966s.get(hVar), hVar);
    }

    static h g(String str) {
        return e("application", str);
    }

    static h h(String str) {
        return e("audio", str);
    }

    private static h i(String str, String str2) {
        h hVarB = b(new h(str, str2, ImmutableListMultimap.T()));
        hVarB.f58995f = Optional.a();
        return hVarB;
    }

    private static h j(String str, String str2) {
        h hVarB = b(new h(str, str2, f58933h));
        hVarB.f58995f = Optional.f(com.google.common.base.c.f56721c);
        return hVarB;
    }

    static h k(String str) {
        return e("font", str);
    }

    static h l(String str) {
        return e("image", str);
    }

    static h m(String str) {
        return e("text", str);
    }

    static h n(String str) {
        return e("video", str);
    }

    private static String o(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        sb2.append(y.f128593b);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            sb2.append(cCharAt);
        }
        sb2.append(y.f128593b);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(String str) {
        return (!f58936i.C(str) || str.isEmpty()) ? o(str) : str;
    }

    private static String s(String str, String str2) {
        w.E(str2);
        w.u(com.google.common.base.b.f().C(str2), "parameter values must be ASCII: %s", str2);
        return f58930g.equals(str) ? com.google.common.base.a.g(str2) : str2;
    }

    private static String t(String str) {
        w.d(f58936i.C(str));
        w.d(!str.isEmpty());
        return com.google.common.base.a.g(str);
    }

    private Map<String, ImmutableMultiset<String>> v() {
        return Maps.B0(this.f58992c.e(), new n() { // from class: com.google.common.net.f
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return ImmutableMultiset.s((Collection) obj);
            }
        });
    }

    @s9.a
    public static h w(String str) {
        String strC;
        w.E(str);
        a aVar = new a(str);
        try {
            com.google.common.base.b bVar = f58936i;
            String strC2 = aVar.c(bVar);
            aVar.a(IOUtils.DIR_SEPARATOR_UNIX);
            String strC3 = aVar.c(bVar);
            ImmutableListMultimap.a aVarM = ImmutableListMultimap.M();
            while (aVar.e()) {
                com.google.common.base.b bVar2 = f58942k;
                aVar.d(bVar2);
                aVar.a(';');
                aVar.d(bVar2);
                com.google.common.base.b bVar3 = f58936i;
                String strC4 = aVar.c(bVar3);
                aVar.a(n5.a.f132013h);
                if ('\"' == aVar.f()) {
                    aVar.a(y.f128593b);
                    StringBuilder sb2 = new StringBuilder();
                    while ('\"' != aVar.f()) {
                        if ('\\' == aVar.f()) {
                            aVar.a(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb2.append(aVar.b(com.google.common.base.b.f()));
                        } else {
                            sb2.append(aVar.c(f58939j));
                        }
                    }
                    strC = sb2.toString();
                    aVar.a(y.f128593b);
                } else {
                    strC = aVar.c(bVar3);
                }
                aVarM.f(strC4, strC);
            }
            return f(strC2, strC3, aVarM.a());
        } catch (IllegalStateException e10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 18);
            sb3.append("Could not parse '");
            sb3.append(str);
            sb3.append("'");
            throw new IllegalArgumentException(sb3.toString(), e10);
        }
    }

    public h A(String str, String str2) {
        return C(str, ImmutableSet.E(str2));
    }

    public h B(r1<String, String> r1Var) {
        return f(this.f58990a, this.f58991b, r1Var);
    }

    public h C(String str, Iterable<String> iterable) {
        w.E(str);
        w.E(iterable);
        String strT = t(str);
        ImmutableListMultimap.a aVarM = ImmutableListMultimap.M();
        b3<Map.Entry<String, String>> it = this.f58992c.i().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!strT.equals(key)) {
                aVarM.f(key, next.getValue());
            }
        }
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            aVarM.f(strT, s(strT, it2.next()));
        }
        h hVar = new h(this.f58990a, this.f58991b, aVarM.a());
        if (!strT.equals(f58930g)) {
            hVar.f58995f = this.f58995f;
        }
        return (h) q.a(f58966s.get(hVar), hVar);
    }

    public h D() {
        return this.f58992c.isEmpty() ? this : e(this.f58990a, this.f58991b);
    }

    public Optional<Charset> c() {
        Optional<Charset> optionalF = this.f58995f;
        if (optionalF == null) {
            Optional<Charset> optionalA = Optional.a();
            b3<String> it = this.f58992c.get(f58930g).iterator();
            String str = null;
            optionalF = optionalA;
            while (it.hasNext()) {
                String next = it.next();
                if (str == null) {
                    optionalF = Optional.f(Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(next).length());
                    sb2.append("Multiple charset values defined: ");
                    sb2.append(str);
                    sb2.append(", ");
                    sb2.append(next);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            this.f58995f = optionalF;
        }
        return optionalF;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f58990a.equals(hVar.f58990a) && this.f58991b.equals(hVar.f58991b) && v().equals(hVar.v());
    }

    public int hashCode() {
        int i10 = this.f58994e;
        if (i10 != 0) {
            return i10;
        }
        int iB = s.b(this.f58990a, this.f58991b, v());
        this.f58994e = iB;
        return iB;
    }

    public boolean p() {
        return "*".equals(this.f58990a) || "*".equals(this.f58991b);
    }

    public boolean q(h hVar) {
        return (hVar.f58990a.equals("*") || hVar.f58990a.equals(this.f58990a)) && (hVar.f58991b.equals("*") || hVar.f58991b.equals(this.f58991b)) && this.f58992c.i().containsAll(hVar.f58992c.i());
    }

    public String toString() {
        String str = this.f58993d;
        if (str != null) {
            return str;
        }
        String strD = d();
        this.f58993d = strD;
        return strD;
    }

    public ImmutableListMultimap<String, String> u() {
        return this.f58992c;
    }

    public String x() {
        return this.f58991b;
    }

    public String y() {
        return this.f58990a;
    }

    public h z(Charset charset) {
        w.E(charset);
        h hVarA = A(f58930g, charset.name());
        hVarA.f58995f = Optional.f(charset);
        return hVarA;
    }
}
