package androidx.compose.ui.text.style;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.m, reason: from toString */
/* JADX INFO: compiled from: TextGeometricTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/m;", "", "", "scaleX", "skewX", "b", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "F", "d", "()F", "e", "<init>", "(FF)V", ak.aF, "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TextGeometricTransform {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final TextGeometricTransform f16962d = new TextGeometricTransform(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float skewX;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.m$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextGeometricTransform.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/m$a;", "", "Landroidx/compose/ui/text/style/m;", d4.d.f108133a, "Landroidx/compose/ui/text/style/m;", ak.av, "()Landroidx/compose/ui/text/style/m;", "getNone$ui_text_release$annotations", "()V", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final TextGeometricTransform a() {
            return TextGeometricTransform.f16962d;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextGeometricTransform() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public TextGeometricTransform(float f10, float f11) {
        this.scaleX = f10;
        this.skewX = f11;
    }

    public /* synthetic */ TextGeometricTransform(float f10, float f11, int i10, u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }

    public static /* synthetic */ TextGeometricTransform c(TextGeometricTransform textGeometricTransform, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = textGeometricTransform.scaleX;
        }
        if ((i10 & 2) != 0) {
            f11 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.b(f10, f11);
    }

    @dl.d
    public final TextGeometricTransform b(float scaleX, float skewX) {
        return new TextGeometricTransform(scaleX, skewX);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getSkewX() {
        return this.skewX;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) other;
        if (this.scaleX == textGeometricTransform.scaleX) {
            return (this.skewX > textGeometricTransform.skewX ? 1 : (this.skewX == textGeometricTransform.skewX ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.scaleX) * 31) + Float.floatToIntBits(this.skewX);
    }

    @dl.d
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }
}
