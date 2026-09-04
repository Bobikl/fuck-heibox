package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.b, reason: from toString */
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/input/b;", "Landroidx/compose/ui/text/input/g;", "Landroidx/compose/ui/text/input/i;", "buffer", "Lkotlin/b2;", ak.av, "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/text/d;", "Landroidx/compose/ui/text/d;", "b", "()Landroidx/compose/ui/text/d;", "annotatedString", "I", ak.aF, "()I", "newCursorPosition", "d", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/d;I)V", "(Ljava/lang/String;I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class CommitTextCommand implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16697c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.d annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int newCursorPosition;

    public CommitTextCommand(@dl.d androidx.compose.ui.text.d annotatedString, int i10) {
        kotlin.jvm.internal.f0.p(annotatedString, "annotatedString");
        this.annotatedString = annotatedString;
        this.newCursorPosition = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommitTextCommand(@dl.d String text, int i10) {
        this(new androidx.compose.ui.text.d(text, null, null, 6, null), i10);
        kotlin.jvm.internal.f0.p(text, "text");
    }

    @Override // androidx.compose.ui.text.input.g
    public void a(@dl.d i buffer) {
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        if (buffer.m()) {
            buffer.o(buffer.getCompositionStart(), buffer.getCompositionEnd(), d());
        } else {
            buffer.o(buffer.getSelectionStart(), buffer.getSelectionEnd(), d());
        }
        int iH = buffer.h();
        int i10 = this.newCursorPosition;
        buffer.q(fi.u.I(i10 > 0 ? (iH + i10) - 1 : (iH + i10) - d().length(), 0, buffer.i()));
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.d getAnnotatedString() {
        return this.annotatedString;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    @dl.d
    public final String d() {
        return this.annotatedString.getText();
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) other;
        return kotlin.jvm.internal.f0.g(d(), commitTextCommand.d()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public int hashCode() {
        return (d().hashCode() * 31) + this.newCursorPosition;
    }

    @dl.d
    public String toString() {
        return "CommitTextCommand(text='" + d() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }
}
