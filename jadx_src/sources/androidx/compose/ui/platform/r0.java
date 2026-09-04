package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.meituan.robust.Constants;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001b\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u001b\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*J\u000e\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-J\u001b\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u000200ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\fJ\u000e\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0004R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"Landroidx/compose/ui/platform/r0;", "", "Lkotlin/b2;", "q", "", "p", "Landroidx/compose/ui/text/d0;", "spanStyle", "e", "Landroidx/compose/ui/graphics/l0;", "color", "m", "(J)V", "Ls1/u;", "textUnit", "j", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "f", "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "o", "(I)V", "Landroidx/compose/ui/text/font/h0;", "fontSynthesis", "l", "Landroidx/compose/ui/text/style/a;", "baselineShift", "k", "(F)V", "Landroidx/compose/ui/text/style/m;", "textGeometricTransform", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, "g", "Landroidx/compose/ui/graphics/e2;", "shadow", "d", "", Constants.BYTE, ak.av, "", Constants.INT, ak.aF, "", "float", "b", "Lkotlin/r1;", "uLong", "n", androidx.constraintlayout.core.motion.utils.w.b.f17895e, "i", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Parcel parcel;

    public r0() {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.f0.o(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }

    public final void a(byte b10) {
        this.parcel.writeByte(b10);
    }

    public final void b(float f10) {
        this.parcel.writeFloat(f10);
    }

    public final void c(int i10) {
        this.parcel.writeInt(i10);
    }

    public final void d(@dl.d Shadow shadow) {
        kotlin.jvm.internal.f0.p(shadow, "shadow");
        m(shadow.getColor());
        b(b1.f.p(shadow.getOffset()));
        b(b1.f.r(shadow.getOffset()));
        b(shadow.getBlurRadius());
    }

    public final void e(@dl.d SpanStyle spanStyle) {
        kotlin.jvm.internal.f0.p(spanStyle, "spanStyle");
        long jM = spanStyle.m();
        androidx.compose.ui.graphics.l0.Companion companion = androidx.compose.ui.graphics.l0.INSTANCE;
        if (!androidx.compose.ui.graphics.l0.y(jM, companion.u())) {
            a((byte) 1);
            m(spanStyle.m());
        }
        long fontSize = spanStyle.getFontSize();
        s1.u.a aVar = s1.u.f139249b;
        if (!s1.u.j(fontSize, aVar.b())) {
            a((byte) 2);
            j(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            a((byte) 3);
            f(fontWeight);
        }
        androidx.compose.ui.text.font.g0 fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int iJ = fontStyle.j();
            a((byte) 4);
            o(iJ);
        }
        androidx.compose.ui.text.font.h0 fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            a((byte) 5);
            l(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            a((byte) 6);
            i(fontFeatureSettings);
        }
        if (!s1.u.j(spanStyle.getLetterSpacing(), aVar.b())) {
            a((byte) 7);
            j(spanStyle.getLetterSpacing());
        }
        androidx.compose.ui.text.style.a baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float fK = baselineShift.k();
            a((byte) 8);
            k(fK);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            a((byte) 9);
            h(textGeometricTransform);
        }
        if (!androidx.compose.ui.graphics.l0.y(spanStyle.getBackground(), companion.u())) {
            a((byte) 10);
            m(spanStyle.getBackground());
        }
        androidx.compose.ui.text.style.i textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            a((byte) 11);
            g(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            a((byte) 12);
            d(shadow);
        }
    }

    public final void f(@dl.d FontWeight fontWeight) {
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        c(fontWeight.w());
    }

    public final void g(@dl.d androidx.compose.ui.text.style.i textDecoration) {
        kotlin.jvm.internal.f0.p(textDecoration, "textDecoration");
        c(textDecoration.getMask());
    }

    public final void h(@dl.d TextGeometricTransform textGeometricTransform) {
        kotlin.jvm.internal.f0.p(textGeometricTransform, "textGeometricTransform");
        b(textGeometricTransform.getScaleX());
        b(textGeometricTransform.getSkewX());
    }

    public final void i(@dl.d String string) {
        kotlin.jvm.internal.f0.p(string, "string");
        this.parcel.writeString(string);
    }

    public final void j(long textUnit) {
        long jM = s1.u.m(textUnit);
        s1.w.a aVar = s1.w.f139257b;
        byte b10 = 0;
        if (!s1.w.g(jM, aVar.c())) {
            if (s1.w.g(jM, aVar.b())) {
                b10 = 1;
            } else if (s1.w.g(jM, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (s1.w.g(s1.u.m(textUnit), aVar.c())) {
            return;
        }
        b(s1.u.n(textUnit));
    }

    public final void k(float baselineShift) {
        b(baselineShift);
    }

    public final void l(int fontSynthesis) {
        androidx.compose.ui.text.font.h0.Companion companion = androidx.compose.ui.text.font.h0.INSTANCE;
        byte b10 = 0;
        if (!androidx.compose.ui.text.font.h0.h(fontSynthesis, companion.b())) {
            if (androidx.compose.ui.text.font.h0.h(fontSynthesis, companion.a())) {
                b10 = 1;
            } else if (androidx.compose.ui.text.font.h0.h(fontSynthesis, companion.d())) {
                b10 = 2;
            } else if (androidx.compose.ui.text.font.h0.h(fontSynthesis, companion.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long color) {
        n(color);
    }

    public final void n(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void o(int fontStyle) {
        androidx.compose.ui.text.font.g0.Companion companion = androidx.compose.ui.text.font.g0.INSTANCE;
        byte b10 = 0;
        if (!androidx.compose.ui.text.font.g0.f(fontStyle, companion.b()) && androidx.compose.ui.text.font.g0.f(fontStyle, companion.a())) {
            b10 = 1;
        }
        a(b10);
    }

    @dl.d
    public final String p() {
        String strEncodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        kotlin.jvm.internal.f0.o(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return strEncodeToString;
    }

    public final void q() {
        this.parcel.recycle();
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.f0.o(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }
}
