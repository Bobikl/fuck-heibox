package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEventPass;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/f1;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Ls1/r;", "bounds", "Lkotlin/b2;", "o", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "m", "", "f", ak.aB, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface f1 extends c {
    boolean f();

    void m();

    void o(@dl.d androidx.compose.ui.input.pointer.p pointerEvent, @dl.d PointerEventPass pass, long bounds);

    boolean s();
}
