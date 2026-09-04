package n1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PlaceholderSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u000e\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J4\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017JR\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R$\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018¨\u0006)"}, d2 = {"Ln1/j;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/Paint;", "paint", "", "text", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "Lkotlin/b2;", "draw", "verticalAlign", "I", ak.aF, "()I", "<set-?>", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", ak.av, "()Landroid/graphics/Paint$FontMetricsInt;", "widthPx", "d", "heightPx", "b", "width", "widthUnit", "height", "heightUnit", "pxPerSp", "<init>", "(FIFIFI)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f131962l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f131963m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f131964n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f131965o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f131966p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f131967q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f131968r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f131969s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f131970t = 6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f131971u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f131972v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f131973w = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f131974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f131976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f131977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f131978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f131979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint.FontMetricsInt f131980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f131981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f131982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f131983k;

    /* JADX INFO: compiled from: PlaceholderSpan.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0012"}, d2 = {"Ln1/j$a;", "", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "<init>", "()V", ak.av, "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: n1.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PlaceholderSpan.kt */
        @mh.c(AnnotationRetention.SOURCE)
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Ln1/j$a$a;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1206a {
        }

        /* JADX INFO: compiled from: PlaceholderSpan.kt */
        @mh.c(AnnotationRetention.SOURCE)
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Ln1/j$a$b;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f131974b = f10;
        this.f131975c = i10;
        this.f131976d = f11;
        this.f131977e = i11;
        this.f131978f = f12;
        this.f131979g = i12;
    }

    @dl.d
    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f131980h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        f0.S("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f131983k) {
            return this.f131982j;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF131979g() {
        return this.f131979g;
    }

    public final int d() {
        if (this.f131983k) {
            return this.f131981i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@dl.d Canvas canvas, @dl.e CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @dl.d Paint paint) {
        f0.p(canvas, "canvas");
        f0.p(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@dl.d Paint paint, @dl.e CharSequence text, int start, int end, @dl.e Paint.FontMetricsInt fm) {
        float f10;
        int iA;
        f0.p(paint, "paint");
        this.f131983k = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        f0.o(fontMetricsInt, "paint.fontMetricsInt");
        this.f131980h = fontMetricsInt;
        if (!(a().descent > a().ascent)) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i10 = this.f131975c;
        if (i10 == 0) {
            f10 = this.f131974b * this.f131978f;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f10 = this.f131974b * textSize;
        }
        this.f131981i = k.a(f10);
        int i11 = this.f131977e;
        if (i11 == 0) {
            iA = k.a(this.f131976d * this.f131978f);
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iA = k.a(this.f131976d * textSize);
        }
        this.f131982j = iA;
        if (fm != null) {
            fm.ascent = a().ascent;
            fm.descent = a().descent;
            fm.leading = a().leading;
            switch (this.f131979g) {
                case 0:
                    if (fm.ascent > (-b())) {
                        fm.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fm.ascent + b() > fm.descent) {
                        fm.descent = fm.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fm.ascent > fm.descent - b()) {
                        fm.ascent = fm.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fm.descent - fm.ascent < b()) {
                        int iB = fm.ascent - ((b() - (fm.descent - fm.ascent)) / 2);
                        fm.ascent = iB;
                        fm.descent = iB + b();
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fm.top = Math.min(a().top, fm.ascent);
            fm.bottom = Math.max(a().bottom, fm.descent);
        }
        return d();
    }
}
