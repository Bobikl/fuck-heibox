package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.b3;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RtspMessageUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f48679a = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48686h = "RTSP/1.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f48680b = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f48681c = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f48682d = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f48683e = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f48684f = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f48685g = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f48687i = new String(new byte[]{10});

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48688j = new String(new byte[]{13, 10});

    /* JADX INFO: compiled from: RtspMessageUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48690b;

        public a(String str, String str2) {
            this.f48689a = str;
            this.f48690b = str2;
        }
    }

    /* JADX INFO: compiled from: RtspMessageUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48692b;

        public b(String str, long j10) {
            this.f48691a = str;
            this.f48692b = j10;
        }
    }

    private c0() {
    }

    public static byte[] a(List<String> list) {
        return com.google.common.base.p.p(f48688j).k(list).getBytes(y.f48977h);
    }

    private static String b(int i10) {
        if (i10 == 200) {
            return "OK";
        }
        if (i10 == 461) {
            return "Unsupported Transport";
        }
        if (i10 == 500) {
            return "Internal Server Error";
        }
        if (i10 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i10 == 301) {
            return "Move Permanently";
        }
        if (i10 == 302) {
            return "Move Temporarily";
        }
        if (i10 == 400) {
            return "Bad Request";
        }
        if (i10 == 401) {
            return "Unauthorized";
        }
        if (i10 == 404) {
            return "Not Found";
        }
        if (i10 == 405) {
            return "Method Not Allowed";
        }
        switch (i10) {
            case bb.c.b.M5 /* 454 */:
                return "Session Not Found";
            case bb.c.b.N5 /* 455 */:
                return "Method Not Valid In This State";
            case bb.c.b.O5 /* 456 */:
                return "Header Field Not Valid";
            case bb.c.b.P5 /* 457 */:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] c(String str) {
        return str.getBytes(y.f48977h);
    }

    public static boolean d(List<String> list) {
        return f48681c.matcher(list.get(0)).matches();
    }

    public static boolean e(String str) {
        return f48680b.matcher(str).matches() || f48681c.matcher(str).matches();
    }

    public static long f(String str) throws ParserException {
        try {
            Matcher matcher = f48682d.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e10) {
            throw ParserException.c(str, e10);
        }
    }

    public static int g(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw ParserException.c(str, e10);
        }
    }

    private static int h(String str) {
        str.hashCode();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static ImmutableList<Integer> i(@androidx.annotation.p0 String str) {
        if (str == null) {
            return ImmutableList.B();
        }
        ImmutableList.a aVar = new ImmutableList.a();
        for (String str2 : u0.p1(str, ",\\s?")) {
            aVar.a(Integer.valueOf(h(str2)));
        }
        return aVar.e();
    }

    public static f0 j(List<String> list) {
        Matcher matcher = f48680b.matcher(list.get(0));
        com.google.android.exoplayer2.util.a.a(matcher.matches());
        int iH = h((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
        Uri uri = Uri.parse((String) com.google.android.exoplayer2.util.a.g(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        com.google.android.exoplayer2.util.a.a(iIndexOf > 0);
        return new f0(uri, iH, new q.b().c(list.subList(1, iIndexOf)).e(), com.google.common.base.p.p(f48688j).k(list.subList(iIndexOf + 1, list.size())));
    }

    public static g0 k(List<String> list) {
        Matcher matcher = f48681c.matcher(list.get(0));
        com.google.android.exoplayer2.util.a.a(matcher.matches());
        int i10 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        com.google.android.exoplayer2.util.a.a(iIndexOf > 0);
        return new g0(i10, new q.b().c(list.subList(1, iIndexOf)).e(), com.google.common.base.p.p(f48688j).k(list.subList(iIndexOf + 1, list.size())));
    }

    public static b l(String str) throws ParserException {
        Matcher matcher = f48683e.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.c(str, null);
        }
        String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(1));
        long j10 = 60000;
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j10 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e10) {
                throw ParserException.c(str, e10);
            }
        }
        return new b(str2, j10);
    }

    @androidx.annotation.p0
    public static a m(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrQ1 = u0.q1(userInfo, ":");
        return new a(strArrQ1[0], strArrQ1[1]);
    }

    public static m n(String str) throws ParserException {
        Matcher matcher = f48684f.matcher(str);
        if (matcher.find()) {
            return new m(2, (String) com.google.android.exoplayer2.util.a.g(matcher.group(1)), (String) com.google.android.exoplayer2.util.a.g(matcher.group(3)), com.google.common.base.b0.g(matcher.group(4)));
        }
        Matcher matcher2 = f48685g.matcher(str);
        if (matcher2.matches()) {
            return new m(1, (String) com.google.android.exoplayer2.util.a.g(matcher2.group(1)), "", "");
        }
        String strValueOf = String.valueOf(str);
        throw ParserException.c(strValueOf.length() != 0 ? "Invalid WWW-Authenticate header ".concat(strValueOf) : new String("Invalid WWW-Authenticate header "), null);
    }

    public static Uri o(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) com.google.android.exoplayer2.util.a.g(uri.getAuthority());
        com.google.android.exoplayer2.util.a.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(u0.p1(str, "@")[1]).build();
    }

    public static ImmutableList<String> p(f0 f0Var) {
        com.google.android.exoplayer2.util.a.a(f0Var.f48726c.e(q.f48918o) != null);
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.a(u0.H("%s %s %s", s(f0Var.f48725b), f0Var.f48724a, f48686h));
        ImmutableListMultimap<String, String> immutableListMultimapB = f0Var.f48726c.b();
        b3<String> it = immutableListMultimapB.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapB.get(next);
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                aVar.a(u0.H("%s: %s", next, immutableList.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(f0Var.f48727d);
        return aVar.e();
    }

    public static ImmutableList<String> q(g0 g0Var) {
        com.google.android.exoplayer2.util.a.a(g0Var.f48742b.e(q.f48918o) != null);
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.a(u0.H("%s %s %s", f48686h, Integer.valueOf(g0Var.f48741a), b(g0Var.f48741a)));
        ImmutableListMultimap<String, String> immutableListMultimapB = g0Var.f48742b.b();
        b3<String> it = immutableListMultimapB.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapB.get(next);
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                aVar.a(u0.H("%s: %s", next, immutableList.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(g0Var.f48743c);
        return aVar.e();
    }

    public static String[] r(String str) {
        String str2 = f48688j;
        if (!str.contains(str2)) {
            str2 = f48687i;
        }
        return u0.p1(str, str2);
    }

    public static String s(int i10) {
        switch (i10) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
