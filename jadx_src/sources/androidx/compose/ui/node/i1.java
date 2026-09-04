package androidx.compose.ui.node;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: compiled from: RootForTest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/i1;", "", "Landroidx/compose/ui/input/key/b;", "keyEvent", "", "k", "(Landroid/view/KeyEvent;)Z", "Ls1/e;", "getDensity", "()Ls1/e;", "density", "Landroidx/compose/ui/semantics/o;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/o;", "semanticsOwner", "Landroidx/compose/ui/text/input/i0;", "getTextInputService", "()Landroidx/compose/ui/text/input/i0;", "textInputService", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface i1 {
    @dl.d
    s1.e getDensity();

    @dl.d
    androidx.compose.ui.semantics.o getSemanticsOwner();

    @dl.d
    androidx.compose.ui.text.input.i0 getTextInputService();

    boolean k(@dl.d KeyEvent keyEvent);
}
