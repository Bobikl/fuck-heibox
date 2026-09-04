package androidx.core.text;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RestrictTo;
import androidx.annotation.b0;
import androidx.annotation.f0;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.os.e0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PrecomputedTextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class l implements Spannable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f21140f = '\n';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f21141g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    @b0("sLock")
    private static Executor f21142h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Spannable f21143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final a f21144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final int[] f21145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final PrecomputedText f21146e;

    /* JADX INFO: compiled from: PrecomputedTextCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final TextPaint f21147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final TextDirectionHeuristic f21148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f21151e;

        /* JADX INFO: renamed from: androidx.core.text.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PrecomputedTextCompat.java */
        public static class C0142a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @n0
            private final TextPaint f21152a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f21154c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f21155d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f21153b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0142a(@n0 TextPaint textPaint) {
                this.f21152a = textPaint;
            }

            @n0
            public a a() {
                return new a(this.f21152a, this.f21153b, this.f21154c, this.f21155d);
            }

            @w0(23)
            public C0142a b(int i10) {
                this.f21154c = i10;
                return this;
            }

            @w0(23)
            public C0142a c(int i10) {
                this.f21155d = i10;
                return this;
            }

            @w0(18)
            public C0142a d(@n0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f21153b = textDirectionHeuristic;
                return this;
            }
        }

        @w0(28)
        public a(@n0 PrecomputedText.Params params) {
            this.f21147a = params.getTextPaint();
            this.f21148b = params.getTextDirection();
            this.f21149c = params.getBreakStrategy();
            this.f21150d = params.getHyphenationFrequency();
            this.f21151e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(@n0 TextPaint textPaint, @n0 TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f21151e = new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    public /* synthetic */ Builder(@NonNull TextPaint textPaint2) {
                    }

                    @NonNull
                    public native /* synthetic */ Params build();

                    public native /* synthetic */ Builder setBreakStrategy(int i12);

                    public native /* synthetic */ Builder setHyphenationFrequency(int i12);

                    public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
                }.setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f21151e = null;
            }
            this.f21147a = textPaint2;
            this.f21148b = textDirectionHeuristic;
            this.f21149c = i10;
            this.f21150d = i11;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean a(@n0 a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f21149c != aVar.b() || this.f21150d != aVar.c() || this.f21147a.getTextSize() != aVar.e().getTextSize() || this.f21147a.getTextScaleX() != aVar.e().getTextScaleX() || this.f21147a.getTextSkewX() != aVar.e().getTextSkewX() || this.f21147a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f21147a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f21147a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f21147a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f21147a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f21147a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f21147a.getTypeface().equals(aVar.e().getTypeface());
        }

        @w0(23)
        public int b() {
            return this.f21149c;
        }

        @w0(23)
        public int c() {
            return this.f21150d;
        }

        @w0(18)
        @p0
        public TextDirectionHeuristic d() {
            return this.f21148b;
        }

        @n0
        public TextPaint e() {
            return this.f21147a;
        }

        public boolean equals(@p0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f21148b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? androidx.core.util.j.b(Float.valueOf(this.f21147a.getTextSize()), Float.valueOf(this.f21147a.getTextScaleX()), Float.valueOf(this.f21147a.getTextSkewX()), Float.valueOf(this.f21147a.getLetterSpacing()), Integer.valueOf(this.f21147a.getFlags()), this.f21147a.getTextLocales(), this.f21147a.getTypeface(), Boolean.valueOf(this.f21147a.isElegantTextHeight()), this.f21148b, Integer.valueOf(this.f21149c), Integer.valueOf(this.f21150d)) : androidx.core.util.j.b(Float.valueOf(this.f21147a.getTextSize()), Float.valueOf(this.f21147a.getTextScaleX()), Float.valueOf(this.f21147a.getTextSkewX()), Float.valueOf(this.f21147a.getLetterSpacing()), Integer.valueOf(this.f21147a.getFlags()), this.f21147a.getTextLocale(), this.f21147a.getTypeface(), Boolean.valueOf(this.f21147a.isElegantTextHeight()), this.f21148b, Integer.valueOf(this.f21149c), Integer.valueOf(this.f21150d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f21147a.getTextSize());
            sb2.append(", textScaleX=" + this.f21147a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f21147a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f21147a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f21147a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f21147a.getTextLocales());
            } else {
                sb2.append(", textLocale=" + this.f21147a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f21147a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f21147a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f21148b);
            sb2.append(", breakStrategy=" + this.f21149c);
            sb2.append(", hyphenationFrequency=" + this.f21150d);
            sb2.append(z5.g.f141884d);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: PrecomputedTextCompat.java */
    public static class b extends FutureTask<l> {

        /* JADX INFO: compiled from: PrecomputedTextCompat.java */
        public static class a implements Callable<l> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private a f21156b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f21157c;

            a(@n0 a aVar, @n0 CharSequence charSequence) {
                this.f21156b = aVar;
                this.f21157c = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l call() throws Exception {
                return l.a(this.f21157c, this.f21156b);
            }
        }

        b(@n0 a aVar, @n0 CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    @w0(28)
    private l(@n0 PrecomputedText precomputedText, @n0 a aVar) {
        this.f21143b = precomputedText;
        this.f21144c = aVar;
        this.f21145d = null;
        this.f21146e = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    private l(@n0 CharSequence charSequence, @n0 a aVar, @n0 int[] iArr) {
        this.f21143b = new SpannableString(charSequence);
        this.f21144c = aVar;
        this.f21145d = iArr;
        this.f21146e = null;
    }

    @SuppressLint({"WrongConstant"})
    public static l a(@n0 CharSequence charSequence, @n0 a aVar) {
        PrecomputedText.Params params;
        androidx.core.util.o.l(charSequence);
        androidx.core.util.o.l(aVar);
        try {
            e0.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f21151e) != null) {
                return new l(PrecomputedText.create(charSequence, params), aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, f21140f, i10, length);
                i10 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i10));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), Integer.MAX_VALUE).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            return new l(charSequence, aVar, iArr);
        } finally {
            e0.d();
        }
    }

    @i1
    public static Future<l> g(@n0 CharSequence charSequence, @n0 a aVar, @p0 Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (f21141g) {
                if (f21142h == null) {
                    f21142h = Executors.newFixedThreadPool(1);
                }
                executor = f21142h;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @f0(from = 0)
    public int b() {
        return Build.VERSION.SDK_INT >= 29 ? this.f21146e.getParagraphCount() : this.f21145d.length;
    }

    @f0(from = 0)
    public int c(@f0(from = 0) int i10) {
        androidx.core.util.o.g(i10, 0, b(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f21146e.getParagraphEnd(i10) : this.f21145d[i10];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f21143b.charAt(i10);
    }

    @f0(from = 0)
    public int d(@f0(from = 0) int i10) {
        androidx.core.util.o.g(i10, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f21146e.getParagraphStart(i10);
        }
        if (i10 == 0) {
            return 0;
        }
        return this.f21145d[i10 - 1];
    }

    @n0
    public a e() {
        return this.f21144c;
    }

    @w0(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public PrecomputedText f() {
        Spannable spannable = this.f21143b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f21143b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f21143b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f21143b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f21146e.getSpans(i10, i11, cls) : (T[]) this.f21143b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f21143b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f21143b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21146e.removeSpan(obj);
        } else {
            this.f21143b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21146e.setSpan(obj, i10, i11, i12);
        } else {
            this.f21143b.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f21143b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @n0
    public String toString() {
        return this.f21143b.toString();
    }
}
