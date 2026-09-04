package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/c0;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "A1", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)J", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", "width", "j", RXScreenCaptureService.KEY_HEIGHT, "i", "", "K1", "()Z", "enforceIncoming", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public interface c0 extends androidx.compose.ui.layout.w {
    long A1(@dl.d androidx.compose.ui.layout.l0 l0Var, @dl.d androidx.compose.ui.layout.g0 g0Var, long j10);

    boolean K1();

    @Override // androidx.compose.ui.layout.w
    int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    @Override // androidx.compose.ui.layout.w
    int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    @Override // androidx.compose.ui.layout.w
    int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    @Override // androidx.compose.ui.layout.w
    int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    @Override // androidx.compose.ui.layout.w
    @dl.d
    androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 l0Var, @dl.d androidx.compose.ui.layout.g0 g0Var, long j10);
}
