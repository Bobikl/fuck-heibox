package androidx.compose.foundation.text;

import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lb1/f;", "Lb1/i;", "rect", "b", "(JLb1/i;)J", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, b1.i iVar) {
        float fX;
        float fJ;
        if (b1.f.p(j10) < iVar.t()) {
            fX = iVar.t();
        } else {
            fX = b1.f.p(j10) > iVar.x() ? iVar.x() : b1.f.p(j10);
        }
        if (b1.f.r(j10) < iVar.getF30372b()) {
            fJ = iVar.getF30372b();
        } else {
            fJ = b1.f.r(j10) > iVar.j() ? iVar.j() : b1.f.r(j10);
        }
        return b1.g.a(fX, fJ);
    }
}
