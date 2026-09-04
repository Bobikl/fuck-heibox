package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.x;
import androidx.compose.ui.text.o0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J)\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\bJ\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/selection/r;", "Landroidx/compose/foundation/text/selection/a;", "Landroidx/compose/foundation/text/w;", "", "pagesAmount", "l0", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/g;", "Lkotlin/t;", "or", "", "h0", "n0", "m0", "Landroidx/compose/ui/text/input/TextFieldValue;", "j", "Landroidx/compose/ui/text/input/TextFieldValue;", "i0", "()Landroidx/compose/ui/text/input/TextFieldValue;", "currentValue", "k", "Landroidx/compose/foundation/text/w;", "j0", "()Landroidx/compose/foundation/text/w;", "layoutResultProxy", "k0", "value", "Landroidx/compose/ui/text/input/x;", "offsetMapping", "Landroidx/compose/foundation/text/selection/u;", "state", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/x;Landroidx/compose/foundation/text/w;Landroidx/compose/foundation/text/selection/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class r extends a<r> {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextFieldValue currentValue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final androidx.compose.foundation.text.w layoutResultProxy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@dl.d TextFieldValue currentValue, @dl.d x offsetMapping, @dl.e androidx.compose.foundation.text.w wVar, @dl.d u state) {
        super(currentValue.getText(), currentValue.getSelection(), wVar != null ? wVar.getValue() : null, offsetMapping, state, null);
        f0.p(currentValue, "currentValue");
        f0.p(offsetMapping, "offsetMapping");
        f0.p(state, "state");
        this.currentValue = currentValue;
        this.layoutResultProxy = wVar;
    }

    public /* synthetic */ r(TextFieldValue textFieldValue, x xVar, androidx.compose.foundation.text.w wVar, u uVar, int i10, kotlin.jvm.internal.u uVar2) {
        this(textFieldValue, (i10 & 2) != 0 ? x.INSTANCE.a() : xVar, wVar, (i10 & 8) != 0 ? new u() : uVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final int l0(androidx.compose.foundation.text.w wVar, int i10) {
        b1.i iVarA;
        androidx.compose.ui.layout.q innerTextFieldCoordinates = wVar.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            androidx.compose.ui.layout.q decorationBoxCoordinates = wVar.getDecorationBoxCoordinates();
            iVarA = decorationBoxCoordinates != null ? androidx.compose.ui.layout.p.c(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
            if (iVarA == null) {
                iVarA = b1.i.f30369e.a();
            }
        } else {
            iVarA = b1.i.f30369e.a();
        }
        b1.i iVarE = wVar.getValue().e(getOffsetMapping().b(o0.i(this.currentValue.getSelection())));
        return getOffsetMapping().a(wVar.getValue().x(b1.g.a(iVarE.t(), iVarE.getF30372b() + (b1.m.m(iVarA.z()) * i10))));
    }

    @dl.e
    public final List<androidx.compose.ui.text.input.g> h0(@dl.d yh.l<? super r, ? extends androidx.compose.ui.text.input.g> or) {
        f0.p(or, "or");
        if (!o0.h(getSelection())) {
            return CollectionsKt__CollectionsKt.L(new CommitTextCommand("", 0), new SetSelectionCommand(o0.l(getSelection()), o0.l(getSelection())));
        }
        androidx.compose.ui.text.input.g gVarInvoke = or.invoke(this);
        if (gVarInvoke != null) {
            return kotlin.collections.s.k(gVarInvoke);
        }
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    @dl.e
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final androidx.compose.foundation.text.w getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    @dl.d
    public final TextFieldValue k0() {
        return TextFieldValue.d(this.currentValue, getAnnotatedString(), getSelection(), null, 4, null);
    }

    @dl.d
    public final r m0() {
        androidx.compose.foundation.text.w wVar;
        if ((D().length() > 0) && (wVar = this.layoutResultProxy) != null) {
            b0(l0(wVar, 1));
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @dl.d
    public final r n0() {
        androidx.compose.foundation.text.w wVar;
        if ((D().length() > 0) && (wVar = this.layoutResultProxy) != null) {
            b0(l0(wVar, -1));
        }
        f0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
