package androidx.compose.foundation.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/d0;", "Landroidx/compose/ui/text/input/x;", "", androidx.constraintlayout.core.motion.utils.w.c.R, "b", ak.av, "Landroidx/compose/ui/text/input/x;", "delegate", ak.aF, "I", "originalLength", "d", "transformedLength", "<init>", "(Landroidx/compose/ui/text/input/x;II)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class d0 implements androidx.compose.ui.text.input.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.input.x delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int originalLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int transformedLength;

    public d0(@dl.d androidx.compose.ui.text.input.x delegate, int i10, int i11) {
        f0.p(delegate, "delegate");
        this.delegate = delegate;
        this.originalLength = i10;
        this.transformedLength = i11;
    }

    @Override // androidx.compose.ui.text.input.x
    public int a(int offset) {
        int iA = this.delegate.a(offset);
        boolean z10 = false;
        if (iA >= 0 && iA <= this.originalLength) {
            z10 = true;
        }
        if (z10) {
            return iA;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + offset + " -> " + iA + " is not in range of original text [0, " + this.originalLength + ']').toString());
    }

    @Override // androidx.compose.ui.text.input.x
    public int b(int offset) {
        int iB = this.delegate.b(offset);
        boolean z10 = false;
        if (iB >= 0 && iB <= this.transformedLength) {
            z10 = true;
        }
        if (z10) {
            return iB;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + offset + " -> " + iB + " is not in range of transformed text [0, " + this.transformedLength + ']').toString());
    }
}
