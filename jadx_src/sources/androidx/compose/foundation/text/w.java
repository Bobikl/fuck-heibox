package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0004J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0007J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b\"\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/w;", "", "Lb1/f;", "k", "(J)J", ak.av, CommonNetImpl.POSITION, "", "coerceInVisibleBounds", "", "g", "(JZ)I", "", "vertical", "f", "lineIndex", "visibleEnd", "d", androidx.constraintlayout.core.motion.utils.w.c.R, "j", "(J)Z", "Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/text/i0;", "i", "()Landroidx/compose/ui/text/i0;", "value", "Landroidx/compose/ui/layout/q;", "b", "Landroidx/compose/ui/layout/q;", ak.aF, "()Landroidx/compose/ui/layout/q;", "m", "(Landroidx/compose/ui/layout/q;)V", "innerTextFieldCoordinates", "l", "decorationBoxCoordinates", "<init>", "(Landroidx/compose/ui/text/i0;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextLayoutResult value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q innerTextFieldCoordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q decorationBoxCoordinates;

    public w(@dl.d TextLayoutResult value) {
        f0.p(value, "value");
        this.value = value;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private final long a(long j10) {
        b1.i iVarA;
        androidx.compose.ui.layout.q qVar = this.innerTextFieldCoordinates;
        if (qVar != null) {
            iVarA = null;
            if (qVar.p()) {
                androidx.compose.ui.layout.q qVar2 = this.decorationBoxCoordinates;
                if (qVar2 != null) {
                    iVarA = androidx.compose.ui.layout.p.c(qVar2, qVar, false, 2, null);
                }
            } else {
                iVarA = b1.i.f30369e.a();
            }
            if (iVarA == null) {
                iVarA = b1.i.f30369e.a();
            }
        } else {
            iVarA = b1.i.f30369e.a();
        }
        return x.b(j10, iVarA);
    }

    public static /* synthetic */ int e(w wVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return wVar.d(i10, z10);
    }

    public static /* synthetic */ int h(w wVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return wVar.g(j10, z10);
    }

    private final long k(long j10) {
        b1.f fVarD;
        androidx.compose.ui.layout.q qVar = this.innerTextFieldCoordinates;
        if (qVar == null) {
            return j10;
        }
        androidx.compose.ui.layout.q qVar2 = this.decorationBoxCoordinates;
        if (qVar2 != null) {
            fVarD = b1.f.d((qVar.p() && qVar2.p()) ? qVar.a0(qVar2, j10) : j10);
        } else {
            fVarD = null;
        }
        return fVarD != null ? fVarD.getF30368a() : j10;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.layout.q getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.layout.q getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int d(int lineIndex, boolean visibleEnd) {
        return this.value.o(lineIndex, visibleEnd);
    }

    public final int f(float vertical) {
        return this.value.r(b1.f.r(k(a(b1.g.a(0.0f, vertical)))));
    }

    public final int g(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = a(position);
        }
        return this.value.x(k(position));
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final boolean j(long offset) {
        long jK = k(a(offset));
        int iR = this.value.r(b1.f.r(jK));
        return b1.f.p(jK) >= this.value.s(iR) && b1.f.p(jK) <= this.value.t(iR);
    }

    public final void l(@dl.e androidx.compose.ui.layout.q qVar) {
        this.decorationBoxCoordinates = qVar;
    }

    public final void m(@dl.e androidx.compose.ui.layout.q qVar) {
        this.innerTextFieldCoordinates = qVar;
    }
}
