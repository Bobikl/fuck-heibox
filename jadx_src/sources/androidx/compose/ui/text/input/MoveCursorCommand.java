package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.w, reason: from toString */
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/w;", "Landroidx/compose/ui/text/input/g;", "Landroidx/compose/ui/text/input/i;", "buffer", "Lkotlin/b2;", ak.av, "", "other", "", "equals", "", "hashCode", "", "toString", "I", "b", "()I", "amount", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class MoveCursorCommand implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16788b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int amount;

    public MoveCursorCommand(int i10) {
        this.amount = i10;
    }

    @Override // androidx.compose.ui.text.input.g
    public void a(@dl.d i buffer) {
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        if (buffer.h() == -1) {
            buffer.q(buffer.getSelectionStart());
        }
        int selectionStart = buffer.getSelectionStart();
        String string = buffer.toString();
        int i10 = this.amount;
        int i11 = 0;
        if (i10 <= 0) {
            int i12 = -i10;
            while (i11 < i12) {
                int iB = androidx.compose.ui.text.i.b(string, selectionStart);
                if (iB == -1) {
                    break;
                }
                i11++;
                selectionStart = iB;
            }
        } else {
            while (i11 < i10) {
                int iA = androidx.compose.ui.text.i.a(string, selectionStart);
                if (iA == -1) {
                    break;
                }
                i11++;
                selectionStart = iA;
            }
        }
        buffer.q(selectionStart);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) other).amount;
    }

    public int hashCode() {
        return this.amount;
    }

    @dl.d
    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
