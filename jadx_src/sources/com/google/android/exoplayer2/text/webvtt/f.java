package com.google.android.exoplayer2.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttCueParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    private static final int A = 2;
    static final float B = 0.5f;
    private static final String C = "WebvttCueParser";
    private static final Map<String, Integer> D;
    private static final Map<String, Integer> E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f49948a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f49949b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f49950c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f49951d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f49952e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f49953f = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f49954g = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f49955h = '<';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f49956i = '>';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f49957j = '/';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f49958k = '&';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char f49959l = ';';

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final char f49960m = ' ';

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f49961n = "lt";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f49962o = "gt";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f49963p = "amp";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f49964q = "nbsp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f49965r = "b";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f49966s = "c";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f49967t = "i";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f49968u = "lang";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f49969v = "ruby";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f49970w = "rt";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f49971x = "u";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f49972y = "v";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f49973z = 1;

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f49974c = new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.b.e((f.b) obj, (f.b) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f49975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f49976b;

        private b(c cVar, int i10) {
            this.f49975a = cVar;
            this.f49976b = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f49975a.f49978b, bVar2.f49975a.f49978b);
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f49979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f49980d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f49978b = i10;
            this.f49977a = str;
            this.f49979c = str2;
            this.f49980d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            com.google.android.exoplayer2.util.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrP1 = u0.p1(strTrim, "\\.");
            String str3 = strArrP1[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrP1.length; i11++) {
                hashSet.add(strArrP1[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.text.webvtt.d f49982c;

        public d(int i10, com.google.android.exoplayer2.text.webvtt.d dVar) {
            this.f49981b = i10;
            this.f49982c = dVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f49981b, dVar.f49981b);
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f49985c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f49983a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f49984b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49986d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f49987e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f49988f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f49989g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f49990h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f49991i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f49992j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f49993k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 != -3.4028235E38f && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != -3.4028235E38f) {
                return f10;
            }
            return i10 == 0 ? 1.0f : -3.4028235E38f;
        }

        @p0
        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            StringBuilder sb2 = new StringBuilder(34);
                            sb2.append("Unknown textAlignment: ");
                            sb2.append(i10);
                            u.m(f.C, sb2.toString());
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public com.google.android.exoplayer2.text.webvtt.e a() {
            return new com.google.android.exoplayer2.text.webvtt.e(g().a(), this.f49983a, this.f49984b);
        }

        public com.google.android.exoplayer2.text.b.c g() {
            float fE = this.f49990h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f49986d);
            }
            int iF = this.f49991i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f49986d);
            }
            com.google.android.exoplayer2.text.b.c cVarD = new com.google.android.exoplayer2.text.b.c().B(c(this.f49986d)).t(b(this.f49987e, this.f49988f), this.f49988f).u(this.f49989g).w(fE).x(iF).z(Math.min(this.f49992j, d(iF, fE))).D(this.f49993k);
            CharSequence charSequence = this.f49985c;
            if (charSequence != null) {
                cVarD.A(charSequence);
            }
            return cVarD;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        D = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        E = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = D;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = E;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(f49960m);
                break;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 33);
                sb2.append("ignoring unsupported entity: '&");
                sb2.append(str);
                sb2.append(";'");
                u.m(C, sb2.toString());
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, @p0 String str, c cVar, List<b> list, List<com.google.android.exoplayer2.text.webvtt.d> list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f49974c);
        int i11 = cVar.f49978b;
        int length = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (f49970w.equals(((b) arrayList.get(i12)).f49975a.f49977a)) {
                b bVar = (b) arrayList.get(i12);
                int iG = g(i(list2, str, bVar.f49975a), i10, 1);
                int i13 = bVar.f49975a.f49978b - length;
                int i14 = bVar.f49976b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new s8.c(charSequenceSubSequence.toString(), iG), i11, i13, 33);
                length += charSequenceSubSequence.length();
                i11 = i13;
            }
        }
    }

    private static void d(@p0 String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<com.google.android.exoplayer2.text.webvtt.d> list2) {
        int i10 = cVar.f49978b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f49977a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f49980d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listH = h(list2, str, cVar);
        for (int i11 = 0; i11 < listH.size(); i11++) {
            e(spannableStringBuilder, listH.get(i11).f49982c, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, com.google.android.exoplayer2.text.webvtt.d dVar, int i10, int i11) {
        if (dVar == null) {
            return;
        }
        if (dVar.i() != -1) {
            s8.d.a(spannableStringBuilder, new StyleSpan(dVar.i()), i10, i11, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (dVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (dVar.k()) {
            s8.d.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i10, i11, 33);
        }
        if (dVar.j()) {
            s8.d.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i10, i11, 33);
        }
        if (dVar.d() != null) {
            s8.d.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i10, i11, 33);
        }
        int iF = dVar.f();
        if (iF == 1) {
            s8.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            s8.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            s8.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e() / 100.0f), i10, i11, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new s8.a(), i10, i11, 33);
        }
    }

    private static int f(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> h(List<com.google.android.exoplayer2.text.webvtt.d> list, @p0 String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.exoplayer2.text.webvtt.d dVar = list.get(i10);
            int iH = dVar.h(str, cVar.f49977a, cVar.f49980d, cVar.f49979c);
            if (iH > 0) {
                arrayList.add(new d(iH, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<com.google.android.exoplayer2.text.webvtt.d> list, @p0 String str, c cVar) {
        List<d> listH = h(list, str, cVar);
        for (int i10 = 0; i10 < listH.size(); i10++) {
            com.google.android.exoplayer2.text.webvtt.d dVar = listH.get(i10).f49982c;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String strTrim = str.trim();
        com.google.android.exoplayer2.util.a.a(!strTrim.isEmpty());
        return u0.q1(strTrim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    static com.google.android.exoplayer2.text.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f49985c = charSequence;
        return eVar.g().a();
    }

    @p0
    public static com.google.android.exoplayer2.text.webvtt.e m(e0 e0Var, List<com.google.android.exoplayer2.text.webvtt.d> list) {
        String strQ = e0Var.q();
        if (strQ == null) {
            return null;
        }
        Pattern pattern = f49953f;
        Matcher matcher = pattern.matcher(strQ);
        if (matcher.matches()) {
            return n(null, matcher, e0Var, list);
        }
        String strQ2 = e0Var.q();
        if (strQ2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strQ2);
        if (matcher2.matches()) {
            return n(strQ.trim(), matcher2, e0Var, list);
        }
        return null;
    }

    @p0
    private static com.google.android.exoplayer2.text.webvtt.e n(@p0 String str, Matcher matcher, e0 e0Var, List<com.google.android.exoplayer2.text.webvtt.d> list) {
        e eVar = new e();
        try {
            eVar.f49983a = i.d((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
            eVar.f49984b = i.d((String) com.google.android.exoplayer2.util.a.g(matcher.group(2)));
            p((String) com.google.android.exoplayer2.util.a.g(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String strQ = e0Var.q();
            while (!TextUtils.isEmpty(strQ)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strQ.trim());
                strQ = e0Var.q();
            }
            eVar.f49985c = q(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(matcher.group());
            u.m(C, strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    static com.google.android.exoplayer2.text.b.c o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f49954g.matcher(str);
        while (matcher.find()) {
            String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(1));
            String str3 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f49986d = v(str3);
                } else if (CommonNetImpl.POSITION.equals(str2)) {
                    u(str3, eVar);
                } else if (UiKitSpanObj.TYPE_SIZE.equals(str2)) {
                    eVar.f49992j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f49993k = w(str3);
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(str2);
                    sb2.append(":");
                    sb2.append(str3);
                    u.m(C, sb2.toString());
                }
            } catch (NumberFormatException unused) {
                String strValueOf = String.valueOf(matcher.group());
                u.m(C, strValueOf.length() != 0 ? "Skipping bad cue setting: ".concat(strValueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    static SpannedString q(@p0 String str, String str2, List<com.google.android.exoplayer2.text.webvtt.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iF = i10 + 1;
                if (iF < str2.length()) {
                    boolean z10 = str2.charAt(iF) == '/';
                    iF = f(str2, iF);
                    int i11 = iF - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iF - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strJ = j(strSubstring);
                        if (k(strJ)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f49977a.equals(strJ)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iF;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                u.m(C, str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f49989g = r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f49987e = i.c(str);
            eVar.f49988f = 0;
        } else {
            eVar.f49987e = Integer.parseInt(str);
            eVar.f49988f = 1;
        }
    }

    private static int t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                u.m(C, str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f49991i = t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.f49990h = i.c(str);
    }

    private static int v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                u.m(C, str.length() != 0 ? "Invalid alignment value: ".concat(str) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        u.m(C, str.length() != 0 ? "Invalid 'vertical' value: ".concat(str) : new String("Invalid 'vertical' value: "));
        return Integer.MIN_VALUE;
    }
}
