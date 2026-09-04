package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.p0;
import com.google.android.exoplayer2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static final String A = "data";
    public static final String A0 = "filled";
    public static final String B = "information";
    public static final String B0 = "open";
    public static final String C = "";
    public static final String D = "id";
    public static final String E = "origin";
    public static final String F = "extent";
    public static final String G = "displayAlign";
    public static final String H = "backgroundColor";
    public static final String I = "fontStyle";
    public static final String J = "fontSize";
    public static final String K = "fontFamily";
    public static final String L = "fontWeight";
    public static final String M = "color";
    public static final String N = "ruby";
    public static final String O = "rubyPosition";
    public static final String P = "textDecoration";
    public static final String Q = "textAlign";
    public static final String R = "textCombine";
    public static final String S = "textEmphasis";
    public static final String T = "writingMode";
    public static final String U = "shear";
    public static final String V = "multiRowAlign";
    public static final String W = "container";
    public static final String X = "base";
    public static final String Y = "baseContainer";
    public static final String Z = "text";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f49782a0 = "textContainer";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f49783b0 = "delimiter";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f49784c0 = "before";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f49785d0 = "after";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f49786e0 = "outside";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f49787f0 = "linethrough";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f49788g0 = "nolinethrough";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f49789h0 = "underline";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f49790i0 = "nounderline";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f49791j0 = "italic";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f49792k0 = "bold";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f49793l0 = "left";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f49794m0 = "center";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f49795n = "tt";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f49796n0 = "right";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f49797o = "head";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f49798o0 = "start";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f49799p = "body";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f49800p0 = "end";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f49801q = "div";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f49802q0 = "none";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f49803r = "p";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f49804r0 = "all";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f49805s = "span";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f49806s0 = "tb";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f49807t = "br";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f49808t0 = "tblr";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f49809u = "style";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f49810u0 = "tbrl";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f49811v = "styling";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f49812v0 = "none";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f49813w = "layout";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f49814w0 = "auto";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f49815x = "region";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f49816x0 = "dot";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f49817y = "metadata";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f49818y0 = "sesame";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f49819z = "image";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f49820z0 = "circle";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f49821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f49822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final g f49826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final String[] f49827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public final String f49829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public final d f49830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f49831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f49832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<d> f49833m;

    private d(@p0 String str, @p0 String str2, long j10, long j11, @p0 g gVar, @p0 String[] strArr, String str3, @p0 String str4, @p0 d dVar) {
        this.f49821a = str;
        this.f49822b = str2;
        this.f49829i = str4;
        this.f49826f = gVar;
        this.f49827g = strArr;
        this.f49823c = str2 != null;
        this.f49824d = j10;
        this.f49825e = j11;
        this.f49828h = (String) com.google.android.exoplayer2.util.a.g(str3);
        this.f49830j = dVar;
        this.f49831k = new HashMap<>();
        this.f49832l = new HashMap<>();
    }

    private void b(Map<String, g> map, com.google.android.exoplayer2.text.b.c cVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f49826f, this.f49827g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) cVar.k();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            cVar.A(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f49830j, map, i12);
            if ("p".equals(this.f49821a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    cVar.y((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    cVar.B(gVarF.m());
                }
                if (gVarF.h() != null) {
                    cVar.v(gVarF.h());
                }
            }
        }
    }

    public static d c(@p0 String str, long j10, long j11, @p0 g gVar, @p0 String[] strArr, String str2, @p0 String str3, @p0 d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), j.f46377b, j.f46377b, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f49821a);
        boolean zEquals2 = f49801q.equals(this.f49821a);
        if (z10 || zEquals || (zEquals2 && this.f49829i != null)) {
            long j10 = this.f49824d;
            if (j10 != j.f46377b) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f49825e;
            if (j11 != j.f46377b) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f49833m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f49833m.size(); i10++) {
            this.f49833m.get(i10).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, com.google.android.exoplayer2.text.b.c> map) {
        if (!map.containsKey(str)) {
            com.google.android.exoplayer2.text.b.c cVar = new com.google.android.exoplayer2.text.b.c();
            cVar.A(new SpannableStringBuilder());
            map.put(str, cVar);
        }
        return (SpannableStringBuilder) com.google.android.exoplayer2.util.a.g(map.get(str).k());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f49828h)) {
            str = this.f49828h;
        }
        if (m(j10) && f49801q.equals(this.f49821a) && this.f49829i != null) {
            list.add(new Pair<>(str, this.f49829i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, com.google.android.exoplayer2.text.b.c> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f49828h) ? str : this.f49828h;
            Iterator<Map.Entry<String, Integer>> it = this.f49832l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f49831k.containsKey(key) ? this.f49831k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (com.google.android.exoplayer2.text.b.c) com.google.android.exoplayer2.util.a.g(map3.get(key)), iIntValue, iIntValue2, ((e) com.google.android.exoplayer2.util.a.g(map2.get(str2))).f49843j);
                }
            }
            for (i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, com.google.android.exoplayer2.text.b.c> map) {
        this.f49831k.clear();
        this.f49832l.clear();
        if (f49817y.equals(this.f49821a)) {
            return;
        }
        if (!"".equals(this.f49828h)) {
            str = this.f49828h;
        }
        if (this.f49823c && z10) {
            k(str, map).append((CharSequence) com.google.android.exoplayer2.util.a.g(this.f49822b));
            return;
        }
        if (f49807t.equals(this.f49821a) && z10) {
            k(str, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, com.google.android.exoplayer2.text.b.c> entry : map.entrySet()) {
                this.f49831k.put(entry.getKey(), Integer.valueOf(((CharSequence) com.google.android.exoplayer2.util.a.g(entry.getValue().k())).length()));
            }
            boolean zEquals = "p".equals(this.f49821a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).p(j10, z10 || zEquals, str, map);
            }
            if (zEquals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, com.google.android.exoplayer2.text.b.c> entry2 : map.entrySet()) {
                this.f49832l.put(entry2.getKey(), Integer.valueOf(((CharSequence) com.google.android.exoplayer2.util.a.g(entry2.getValue().k())).length()));
            }
        }
    }

    public void a(d dVar) {
        if (this.f49833m == null) {
            this.f49833m = new ArrayList();
        }
        this.f49833m.add(dVar);
    }

    public d f(int i10) {
        List<d> list = this.f49833m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f49833m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<com.google.android.exoplayer2.text.b> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f49828h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f49828h, treeMap);
        o(j10, map, map2, this.f49828h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) com.google.android.exoplayer2.util.a.g(map2.get(pair.first));
                arrayList2.add(new com.google.android.exoplayer2.text.b.c().r(bitmapDecodeByteArray).w(eVar.f49835b).x(0).t(eVar.f49836c, 0).u(eVar.f49838e).z(eVar.f49839f).s(eVar.f49840g).D(eVar.f49843j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) com.google.android.exoplayer2.util.a.g(map2.get(entry.getKey()));
            com.google.android.exoplayer2.text.b.c cVar = (com.google.android.exoplayer2.text.b.c) entry.getValue();
            e((SpannableStringBuilder) com.google.android.exoplayer2.util.a.g(cVar.k()));
            cVar.t(eVar2.f49836c, eVar2.f49837d);
            cVar.u(eVar2.f49838e);
            cVar.w(eVar2.f49835b);
            cVar.z(eVar2.f49839f);
            cVar.C(eVar2.f49842i, eVar2.f49841h);
            cVar.D(eVar2.f49843j);
            arrayList2.add(cVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    @p0
    public String[] l() {
        return this.f49827g;
    }

    public boolean m(long j10) {
        long j11 = this.f49824d;
        return (j11 == j.f46377b && this.f49825e == j.f46377b) || (j11 <= j10 && this.f49825e == j.f46377b) || ((j11 == j.f46377b && j10 < this.f49825e) || (j11 <= j10 && j10 < this.f49825e));
    }
}
