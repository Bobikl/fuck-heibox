package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/input/a;", "Landroidx/compose/ui/text/input/g;", "Landroidx/compose/ui/text/input/i;", "buffer", "Lkotlin/b2;", ak.av, "", "other", "", "equals", "", "hashCode", "", "toString", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16696a = 0;

    @Override // androidx.compose.ui.text.input.g
    public void a(@dl.d i buffer) {
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        if (buffer.m()) {
            buffer.c(buffer.getCompositionStart(), buffer.getCompositionEnd());
            return;
        }
        if (buffer.h() != -1) {
            if (buffer.h() == 0) {
                return;
            }
            buffer.c(androidx.compose.ui.text.i.b(buffer.toString(), buffer.h()), buffer.h());
        } else {
            int selectionStart = buffer.getSelectionStart();
            int selectionEnd = buffer.getSelectionEnd();
            buffer.q(buffer.getSelectionStart());
            buffer.c(selectionStart, selectionEnd);
        }
    }

    public boolean equals(@dl.e Object other) {
        return other instanceof a;
    }

    public int hashCode() {
        return n0.d(a.class).hashCode();
    }

    @dl.d
    public String toString() {
        return "BackspaceCommand()";
    }
}
