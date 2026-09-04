package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J)\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/v;", "Landroidx/compose/ui/layout/k1;", "Landroidx/compose/ui/node/c;", "Lkotlin/b2;", "d", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", "width", "j", RXScreenCaptureService.KEY_HEIGHT, "i", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface v extends androidx.compose.ui.layout.k1, c {
    int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    @Override // androidx.compose.ui.layout.k1
    void d();

    int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m mVar, int i10);

    @dl.d
    androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 l0Var, @dl.d androidx.compose.ui.layout.g0 g0Var, long j10);
}
