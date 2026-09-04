package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.v0;
import androidx.compose.ui.platform.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.shape.l, reason: from toString */
/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J%\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/shape/l;", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/w0;", "", "e", "Lb1/m;", "shapeSize", "Ls1/e;", "density", "b", "(JLs1/e;)F", "", "toString", "percent", "f", "", "hashCode", "", "other", "", "equals", "F", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/String;", "valueOverride", "<init>", "(F)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class CornerSize implements f, w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float percent;

    public CornerSize(float f10) {
        this.percent = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    private final float getPercent() {
        return this.percent;
    }

    public static /* synthetic */ CornerSize g(CornerSize cornerSize, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = cornerSize.percent;
        }
        return cornerSize.f(f10);
    }

    @Override // androidx.compose.foundation.shape.f
    public float b(long shapeSize, @dl.d s1.e density) {
        f0.p(density, "density");
        return b1.m.q(shapeSize) * (this.percent / 100.0f);
    }

    @Override // androidx.compose.ui.platform.w0
    public /* synthetic */ kotlin.sequences.m c() {
        return v0.a(this);
    }

    @Override // androidx.compose.ui.platform.w0
    public /* synthetic */ String d() {
        return v0.b(this);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CornerSize) && f0.g(Float.valueOf(this.percent), Float.valueOf(((CornerSize) other).percent));
    }

    @dl.d
    public final CornerSize f(float percent) {
        return new CornerSize(percent);
    }

    @Override // androidx.compose.ui.platform.w0
    @dl.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.percent);
        sb2.append('%');
        return sb2.toString();
    }

    public int hashCode() {
        return Float.floatToIntBits(this.percent);
    }

    @dl.d
    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }
}
