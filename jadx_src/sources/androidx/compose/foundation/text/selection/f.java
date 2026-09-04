package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0%\u0012\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0%¢\u0006\u0004\b)\u0010*J_\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016J(\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/selection/f;", "Landroidx/compose/foundation/text/selection/i;", "Lb1/f;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "isStartHandle", "Landroidx/compose/ui/layout/q;", "containerLayoutCoordinates", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/j;", "previousSelection", "Lkotlin/Pair;", "i", "(JJLb1/f;ZLandroidx/compose/ui/layout/q;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/j;)Lkotlin/Pair;", "g", "selection", "e", "(Landroidx/compose/foundation/text/selection/j;Z)J", "d", "Landroidx/compose/ui/text/d;", "getText", "", androidx.constraintlayout.core.motion.utils.w.c.R, "Lb1/i;", ak.aF, "Landroidx/compose/ui/text/o0;", RXScreenCaptureService.KEY_HEIGHT, "(I)J", "", ak.av, "J", "f", "()J", "selectableId", "Lkotlin/Function0;", "coordinatesCallback", "Landroidx/compose/ui/text/i0;", "layoutResultCallback", "<init>", "(JLyh/a;Lyh/a;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<androidx.compose.ui.layout.q> f8361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.a<TextLayoutResult> f8362c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(long j10, @dl.d yh.a<? extends androidx.compose.ui.layout.q> coordinatesCallback, @dl.d yh.a<TextLayoutResult> layoutResultCallback) {
        f0.p(coordinatesCallback, "coordinatesCallback");
        f0.p(layoutResultCallback, "layoutResultCallback");
        this.selectableId = j10;
        this.f8361b = coordinatesCallback;
        this.f8362c = layoutResultCallback;
    }

    @Override // androidx.compose.foundation.text.selection.i
    @dl.d
    public b1.i c(int offset) {
        int length;
        TextLayoutResult textLayoutResultInvoke = this.f8362c.invoke();
        if (textLayoutResultInvoke != null && (length = textLayoutResultInvoke.getLayoutInput().getText().length()) >= 1) {
            return textLayoutResultInvoke.d(fi.u.I(offset, 0, length - 1));
        }
        return b1.i.f30369e.a();
    }

    @Override // androidx.compose.foundation.text.selection.i
    @dl.e
    public androidx.compose.ui.layout.q d() {
        androidx.compose.ui.layout.q qVarInvoke = this.f8361b.invoke();
        if (qVarInvoke == null || !qVarInvoke.p()) {
            return null;
        }
        return qVarInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.i
    public long e(@dl.d Selection selection, boolean isStartHandle) {
        TextLayoutResult textLayoutResultInvoke;
        f0.p(selection, "selection");
        if ((isStartHandle && selection.h().h() != getSelectableId()) || (!isStartHandle && selection.f().h() != getSelectableId())) {
            return b1.f.f30364b.e();
        }
        if (d() != null && (textLayoutResultInvoke = this.f8362c.invoke()) != null) {
            return w.b(textLayoutResultInvoke, (isStartHandle ? selection.h() : selection.f()).g(), isStartHandle, selection.g());
        }
        return b1.f.f30364b.e();
    }

    @Override // androidx.compose.foundation.text.selection.i
    /* JADX INFO: renamed from: f, reason: from getter */
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.i
    @dl.e
    public Selection g() {
        TextLayoutResult textLayoutResultInvoke = this.f8362c.invoke();
        if (textLayoutResultInvoke == null) {
            return null;
        }
        return g.b(p0.b(0, textLayoutResultInvoke.getLayoutInput().getText().length()), false, getSelectableId(), textLayoutResultInvoke);
    }

    @Override // androidx.compose.foundation.text.selection.i
    @dl.d
    public androidx.compose.ui.text.d getText() {
        TextLayoutResult textLayoutResultInvoke = this.f8362c.invoke();
        return textLayoutResultInvoke == null ? new androidx.compose.ui.text.d("", null, null, 6, null) : textLayoutResultInvoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.i
    public long h(int offset) {
        int length;
        TextLayoutResult textLayoutResultInvoke = this.f8362c.invoke();
        if (textLayoutResultInvoke != null && (length = textLayoutResultInvoke.getLayoutInput().getText().length()) >= 1) {
            int iQ = textLayoutResultInvoke.q(fi.u.I(offset, 0, length - 1));
            return p0.b(textLayoutResultInvoke.u(iQ), textLayoutResultInvoke.o(iQ, true));
        }
        return o0.INSTANCE.a();
    }

    @Override // androidx.compose.foundation.text.selection.i
    @dl.d
    public Pair<Selection, Boolean> i(long startHandlePosition, long endHandlePosition, @dl.e b1.f previousHandlePosition, boolean isStartHandle, @dl.d androidx.compose.ui.layout.q containerLayoutCoordinates, @dl.d SelectionAdjustment adjustment, @dl.e Selection previousSelection) {
        TextLayoutResult textLayoutResultInvoke;
        f0.p(containerLayoutCoordinates, "containerLayoutCoordinates");
        f0.p(adjustment, "adjustment");
        if (!(previousSelection == null || (getSelectableId() == previousSelection.h().h() && getSelectableId() == previousSelection.f().h()))) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        androidx.compose.ui.layout.q qVarD = d();
        if (qVarD != null && (textLayoutResultInvoke = this.f8362c.invoke()) != null) {
            long jA0 = containerLayoutCoordinates.a0(qVarD, b1.f.f30364b.e());
            return g.d(textLayoutResultInvoke, b1.f.u(startHandlePosition, jA0), b1.f.u(endHandlePosition, jA0), previousHandlePosition != null ? b1.f.d(b1.f.u(previousHandlePosition.getF30368a(), jA0)) : null, getSelectableId(), adjustment, previousSelection, isStartHandle);
        }
        return new Pair<>(null, Boolean.FALSE);
    }
}
