package com.google.android.exoplayer2.text.ttml;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: compiled from: TtmlRenderUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f49844a = "TtmlRenderUtil";

    private f() {
    }

    public static void a(Spannable spannable, int i10, int i11, g gVar, @p0 d dVar, Map<String, g> map, int i12) {
        d dVarE;
        g gVarF;
        int i13;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i10, i11, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.q()) {
            s8.d.a(spannable, new ForegroundColorSpan(gVar.c()), i10, i11, 33);
        }
        if (gVar.p()) {
            s8.d.a(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.d() != null) {
            s8.d.a(spannable, new TypefaceSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.o() != null) {
            b bVar = (b) com.google.android.exoplayer2.util.a.g(gVar.o());
            int i14 = bVar.f49760a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f49761b;
            }
            int i15 = bVar.f49762c;
            if (i15 == -2) {
                i15 = 1;
            }
            s8.d.a(spannable, new s8.f(i14, i13, i15), i10, i11, 33);
        }
        int iJ = gVar.j();
        if (iJ == 2) {
            d dVarD = d(dVar, map);
            if (dVarD != null && (dVarE = e(dVarD, map)) != null) {
                if (dVarE.g() != 1 || dVarE.f(0).f49822b == null) {
                    u.h(f49844a, "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) u0.k(dVarE.f(0).f49822b);
                    g gVarF2 = f(dVarE.f49826f, dVarE.l(), map);
                    int i16 = gVarF2 != null ? gVarF2.i() : -1;
                    if (i16 == -1 && (gVarF = f(dVarD.f49826f, dVarD.l(), map)) != null) {
                        i16 = gVarF.i();
                    }
                    spannable.setSpan(new s8.c(str, i16), i10, i11, 33);
                }
            }
        } else if (iJ == 3 || iJ == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.n()) {
            s8.d.a(spannable, new s8.a(), i10, i11, 33);
        }
        int iF = gVar.f();
        if (iF == 1) {
            s8.d.a(spannable, new AbsoluteSizeSpan((int) gVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            s8.d.a(spannable, new RelativeSizeSpan(gVar.e()), i10, i11, 33);
        } else {
            if (iF != 3) {
                return;
            }
            s8.d.a(spannable, new RelativeSizeSpan(gVar.e() / 100.0f), i10, i11, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    @p0
    private static d d(@p0 d dVar, Map<String, g> map) {
        while (dVar != null) {
            g gVarF = f(dVar.f49826f, dVar.l(), map);
            if (gVarF != null && gVarF.j() == 1) {
                return dVar;
            }
            dVar = dVar.f49830j;
        }
        return null;
    }

    @p0
    private static d e(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g gVarF = f(dVar2.f49826f, dVar2.l(), map);
            if (gVarF != null && gVarF.j() == 3) {
                return dVar2;
            }
            for (int iG = dVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(dVar2.f(iG));
            }
        }
        return null;
    }

    @p0
    public static g f(@p0 g gVar, @p0 String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
