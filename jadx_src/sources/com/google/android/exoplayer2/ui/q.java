package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SpannedToHtmlConverter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f50782a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f50784b;

        private b(String str, Map<String, String> map) {
            this.f50783a = str;
            this.f50784b = map;
        }
    }

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator<c> f50785e = new Comparator() { // from class: com.google.android.exoplayer2.ui.s
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q.c.e((q.c) obj, (q.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator<c> f50786f = new Comparator() { // from class: com.google.android.exoplayer2.ui.t
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q.c.f((q.c) obj, (q.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f50790d;

        private c(int i10, int i11, String str, String str2) {
            this.f50787a = i10;
            this.f50788b = i11;
            this.f50789c = str;
            this.f50790d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f50788b, cVar.f50788b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f50789c.compareTo(cVar2.f50789c);
            return iCompareTo != 0 ? iCompareTo : cVar.f50790d.compareTo(cVar2.f50790d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int f(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f50787a, cVar.f50787a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f50789c.compareTo(cVar.f50789c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f50790d.compareTo(cVar.f50790d);
        }
    }

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f50791a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c> f50792b = new ArrayList();
    }

    private q() {
    }

    public static b a(@androidx.annotation.p0 CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", ImmutableMap.v());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), ImmutableMap.v());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            StringBuilder sb2 = new StringBuilder(14);
            sb2.append("bg_");
            sb2.append(iIntValue);
            map.put(k.a(sb2.toString()), com.google.android.exoplayer2.util.u0.H("background-color:%s;", k.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f10);
        StringBuilder sb3 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb3.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f50792b, c.f50786f);
            Iterator it2 = dVar.f50792b.iterator();
            while (it2.hasNext()) {
                sb3.append(((c) it2.next()).f50790d);
            }
            Collections.sort(dVar.f50791a, c.f50785e);
            Iterator it3 = dVar.f50791a.iterator();
            while (it3.hasNext()) {
                sb3.append(((c) it3.next()).f50789c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb3.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb3.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f50782a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                com.google.android.exoplayer2.util.a.g(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f50791a.add(cVar);
                f(sparseArray, spanEnd).f50792b.add(cVar);
            }
        }
        return sparseArray;
    }

    @androidx.annotation.p0
    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof s8.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof s8.f)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof s8.c) {
                String strB = b(((s8.c) obj).f139333a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strB).length() + 16);
                sb2.append("<rt>");
                sb2.append(strB);
                sb2.append("</rt></ruby>");
                return sb2.toString();
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    @androidx.annotation.p0
    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return com.google.android.exoplayer2.util.u0.H("<span style='color:%s;'>", k.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return com.google.android.exoplayer2.util.u0.H("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof s8.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return com.google.android.exoplayer2.util.u0.H("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return com.google.android.exoplayer2.util.u0.H("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return com.google.android.exoplayer2.util.u0.H("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof s8.c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof s8.f)) {
                return null;
            }
            s8.f fVar = (s8.f) obj;
            return com.google.android.exoplayer2.util.u0.H("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(fVar.f139345a, fVar.f139346b), g(fVar.f139347c));
        }
        int i10 = ((s8.c) obj).f139334b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append(com.google.android.exoplayer2.text.ttml.d.f49820z0);
        } else if (i10 == 2) {
            sb2.append(com.google.android.exoplayer2.text.ttml.d.f49816x0);
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append(com.google.android.exoplayer2.text.ttml.d.f49818y0);
        }
        return sb2.toString();
    }
}
