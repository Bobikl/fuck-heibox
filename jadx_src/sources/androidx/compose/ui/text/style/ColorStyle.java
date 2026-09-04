package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.l0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.d, reason: from toString */
/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u001d\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/style/d;", "Landroidx/compose/ui/text/style/l;", "Landroidx/compose/ui/graphics/l0;", "f", "()J", "value", "g", "(J)Landroidx/compose/ui/text/style/d;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "J", "i", ak.av, "color", "Landroidx/compose/ui/graphics/a0;", "e", "()Landroidx/compose/ui/graphics/a0;", "brush", "", "d", "()F", "alpha", "<init>", "(JLkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ColorStyle implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    private ColorStyle(long j10) {
        this.value = j10;
        if (!(j10 != l0.INSTANCE.u())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ ColorStyle(long j10, u uVar) {
        this(j10);
    }

    public static /* synthetic */ ColorStyle h(ColorStyle colorStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = colorStyle.value;
        }
        return colorStyle.g(j10);
    }

    @Override // androidx.compose.ui.text.style.l
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.l
    public /* synthetic */ l b(yh.a aVar) {
        return TextForegroundStyle$CC.b(this, aVar);
    }

    @Override // androidx.compose.ui.text.style.l
    public /* synthetic */ l c(l lVar) {
        return TextForegroundStyle$CC.a(this, lVar);
    }

    @Override // androidx.compose.ui.text.style.l
    /* JADX INFO: renamed from: d */
    public float getAlpha() {
        return l0.A(getValue());
    }

    @Override // androidx.compose.ui.text.style.l
    @dl.e
    public a0 e() {
        return null;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && l0.y(this.value, ((ColorStyle) other).value);
    }

    public final long f() {
        return this.value;
    }

    @dl.d
    public final ColorStyle g(long value) {
        return new ColorStyle(value, null);
    }

    public int hashCode() {
        return l0.K(this.value);
    }

    public final long i() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return "ColorStyle(value=" + ((Object) l0.L(this.value)) + ')';
    }
}
