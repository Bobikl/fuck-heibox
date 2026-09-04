package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.f, reason: from toString */
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/f;", "Landroidx/compose/ui/text/input/g;", "Landroidx/compose/ui/text/input/i;", "buffer", "Lkotlin/b2;", ak.av, "", "other", "", "equals", "", "hashCode", "", "toString", "I", ak.aF, "()I", "lengthBeforeCursor", "b", "lengthAfterCursor", "<init>", "(II)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class DeleteSurroundingTextInCodePointsCommand implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16718c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lengthBeforeCursor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lengthAfterCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i10, int i11) {
        this.lengthBeforeCursor = i10;
        this.lengthAfterCursor = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    @Override // androidx.compose.ui.text.input.g
    public void a(@dl.d i buffer) {
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        int i10 = this.lengthBeforeCursor;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11++;
            if (buffer.getSelectionStart() > i11 && h.b(buffer.d((buffer.getSelectionStart() - i11) - 1), buffer.d(buffer.getSelectionStart() - i11))) {
                i11++;
            }
            if (i11 == buffer.getSelectionStart()) {
                break;
            }
        }
        int i13 = this.lengthAfterCursor;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14++;
            if (buffer.getSelectionEnd() + i14 < buffer.i() && h.b(buffer.d((buffer.getSelectionEnd() + i14) - 1), buffer.d(buffer.getSelectionEnd() + i14))) {
                i14++;
            }
            if (buffer.getSelectionEnd() + i14 == buffer.i()) {
                break;
            }
        }
        buffer.c(buffer.getSelectionEnd(), buffer.getSelectionEnd() + i14);
        buffer.c(buffer.getSelectionStart() - i11, buffer.getSelectionStart());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @dl.d
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
