package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SessionDescriptionParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f48831a = Pattern.compile("([a-z])=\\s?(.+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f48832b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f48833c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48834d = "v";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48835e = "o";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48836f = "s";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48837g = "i";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48838h = "u";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f48839i = "e";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48840j = "p";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f48841k = "c";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f48842l = "b";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f48843m = "t";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f48844n = "k";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f48845o = "a";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f48846p = "m";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f48847q = "r";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f48848r = "z";

    private l0() {
    }

    private static void a(k0.b bVar, b.C0387b c0387b) throws ParserException {
        try {
            bVar.n(c0387b.j());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw ParserException.c(null, e10);
        }
    }

    public static k0 b(String str) throws ParserException {
        k0.b bVar = new k0.b();
        b.C0387b c0387bC = null;
        for (String str2 : c0.r(str)) {
            if (!"".equals(str2)) {
                Matcher matcher = f48831a.matcher(str2);
                if (!matcher.matches()) {
                    String strValueOf = String.valueOf(str2);
                    throw ParserException.c(strValueOf.length() != 0 ? "Malformed SDP line: ".concat(strValueOf) : new String("Malformed SDP line: "), null);
                }
                String str3 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(1));
                String str4 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(2));
                byte b10 = -1;
                switch (str3.hashCode()) {
                    case 97:
                        if (str3.equals("a")) {
                            b10 = 11;
                        }
                        break;
                    case 98:
                        if (str3.equals(f48842l)) {
                            b10 = 8;
                        }
                        break;
                    case 99:
                        if (str3.equals("c")) {
                            b10 = 7;
                        }
                        break;
                    case 101:
                        if (str3.equals(f48839i)) {
                            b10 = 5;
                        }
                        break;
                    case 105:
                        if (str3.equals("i")) {
                            b10 = 3;
                        }
                        break;
                    case 107:
                        if (str3.equals(f48844n)) {
                            b10 = 10;
                        }
                        break;
                    case 109:
                        if (str3.equals(f48846p)) {
                            b10 = 12;
                        }
                        break;
                    case 111:
                        if (str3.equals(f48835e)) {
                            b10 = 1;
                        }
                        break;
                    case 112:
                        if (str3.equals("p")) {
                            b10 = 6;
                        }
                        break;
                    case 114:
                        if (str3.equals(f48847q)) {
                            b10 = 13;
                        }
                        break;
                    case 115:
                        if (str3.equals("s")) {
                            b10 = 2;
                        }
                        break;
                    case 116:
                        if (str3.equals("t")) {
                            b10 = 9;
                        }
                        break;
                    case 117:
                        if (str3.equals("u")) {
                            b10 = 4;
                        }
                        break;
                    case 118:
                        if (str3.equals("v")) {
                            b10 = 0;
                        }
                        break;
                    case 122:
                        if (str3.equals("z")) {
                            b10 = 14;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        if (!"0".equals(str4)) {
                            throw ParserException.c(String.format("SDP version %s is not supported.", str4), null);
                        }
                        break;
                        break;
                    case 1:
                        bVar.t(str4);
                        break;
                    case 2:
                        bVar.w(str4);
                        break;
                    case 3:
                        if (c0387bC == null) {
                            bVar.v(str4);
                        } else {
                            c0387bC.n(str4);
                        }
                        break;
                    case 4:
                        bVar.y(Uri.parse(str4));
                        break;
                    case 5:
                        bVar.r(str4);
                        break;
                    case 6:
                        bVar.u(str4);
                        break;
                    case 7:
                        if (c0387bC == null) {
                            bVar.q(str4);
                        } else {
                            c0387bC.l(str4);
                        }
                        break;
                    case 8:
                        String[] strArrP1 = u0.p1(str4, ":\\s?");
                        com.google.android.exoplayer2.util.a.a(strArrP1.length == 2);
                        int i10 = Integer.parseInt(strArrP1[1]);
                        if (c0387bC == null) {
                            bVar.p(i10 * 1000);
                        } else {
                            c0387bC.k(i10 * 1000);
                        }
                        break;
                    case 9:
                        bVar.x(str4);
                        break;
                    case 10:
                        if (c0387bC == null) {
                            bVar.s(str4);
                        } else {
                            c0387bC.m(str4);
                        }
                        break;
                    case 11:
                        Matcher matcher2 = f48832b.matcher(str4);
                        if (!matcher2.matches()) {
                            String strValueOf2 = String.valueOf(str2);
                            throw ParserException.c(strValueOf2.length() != 0 ? "Malformed Attribute line: ".concat(strValueOf2) : new String("Malformed Attribute line: "), null);
                        }
                        String str5 = (String) com.google.android.exoplayer2.util.a.g(matcher2.group(1));
                        String strG = com.google.common.base.b0.g(matcher2.group(2));
                        if (c0387bC == null) {
                            bVar.m(str5, strG);
                        } else {
                            c0387bC.i(str5, strG);
                        }
                        break;
                        break;
                    case 12:
                        if (c0387bC != null) {
                            a(bVar, c0387bC);
                        }
                        c0387bC = c(str4);
                        break;
                }
            }
        }
        if (c0387bC != null) {
            a(bVar, c0387bC);
        }
        try {
            return bVar.o();
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw ParserException.c(null, e10);
        }
    }

    private static b.C0387b c(String str) throws ParserException {
        Matcher matcher = f48833c.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw ParserException.c(strValueOf.length() != 0 ? "Malformed SDP media description line: ".concat(strValueOf) : new String("Malformed SDP media description line: "), null);
        }
        try {
            return new b.C0387b((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)), Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(2))), (String) com.google.android.exoplayer2.util.a.g(matcher.group(3)), Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(4))));
        } catch (NumberFormatException e10) {
            String strValueOf2 = String.valueOf(str);
            throw ParserException.c(strValueOf2.length() != 0 ? "Malformed SDP media description line: ".concat(strValueOf2) : new String("Malformed SDP media description line: "), e10);
        }
    }
}
