package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: EditProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002J\f\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0010\u001a\u00020\tR$\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "", "Landroidx/compose/ui/text/input/g;", "editCommands", "failedCommand", "", ak.aF, "g", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/k0;", "textInputSession", "Lkotlin/b2;", "f", "b", RXScreenCaptureService.KEY_HEIGHT, "<set-?>", ak.av, "Landroidx/compose/ui/text/input/TextFieldValue;", "e", "()Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "Landroidx/compose/ui/text/input/i;", "Landroidx/compose/ui/text/input/i;", "d", "()Landroidx/compose/ui/text/input/i;", "mBuffer", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class EditProcessor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16659c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.l(), o0.INSTANCE.a(), (o0) null, (kotlin.jvm.internal.u) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private i mBuffer = new i(this.mBufferState.getText(), this.mBufferState.getSelection(), (kotlin.jvm.internal.u) null);

    private final String c(List<? extends g> editCommands, final g failedCommand) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.i() + ", composition=" + this.mBuffer.e() + ", selection=" + ((Object) o0.q(this.mBuffer.j())) + "):");
        kotlin.jvm.internal.f0.o(sb2, "append(value)");
        sb2.append('\n');
        kotlin.jvm.internal.f0.o(sb2, "append('\\n')");
        CollectionsKt___CollectionsKt.e3(editCommands, sb2, (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new yh.l<g, CharSequence>() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d g it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return (failedCommand == it ? " > " : "   ") + this.g(it);
            }
        });
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(g gVar) {
        if (gVar instanceof CommitTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) gVar;
            sb2.append(commitTextCommand.d().length());
            sb2.append(", newCursorPosition=");
            sb2.append(commitTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (gVar instanceof SetComposingTextCommand) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) gVar;
            sb3.append(setComposingTextCommand.d().length());
            sb3.append(", newCursorPosition=");
            sb3.append(setComposingTextCommand.getNewCursorPosition());
            sb3.append(')');
            return sb3.toString();
        }
        if (!(gVar instanceof SetComposingRegionCommand) && !(gVar instanceof DeleteSurroundingTextCommand) && !(gVar instanceof DeleteSurroundingTextInCodePointsCommand) && !(gVar instanceof SetSelectionCommand) && !(gVar instanceof k) && !(gVar instanceof a) && !(gVar instanceof MoveCursorCommand) && !(gVar instanceof d)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown EditCommand: ");
            String strF = n0.d(gVar.getClass()).F();
            if (strF == null) {
                strF = "{anonymous EditCommand}";
            }
            sb4.append(strF);
            return sb4.toString();
        }
        return gVar.toString();
    }

    @dl.d
    public final TextFieldValue b(@dl.d List<? extends g> editCommands) {
        kotlin.jvm.internal.f0.p(editCommands, "editCommands");
        int i10 = 0;
        g gVar = null;
        try {
            int size = editCommands.size();
            while (i10 < size) {
                g gVar2 = editCommands.get(i10);
                try {
                    gVar2.a(this.mBuffer);
                    i10++;
                    gVar = gVar2;
                } catch (Exception e10) {
                    e = e10;
                    gVar = gVar2;
                    throw new RuntimeException(c(editCommands, gVar), e);
                }
            }
            TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.u(), this.mBuffer.j(), this.mBuffer.e(), (kotlin.jvm.internal.u) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e11) {
            e = e11;
        }
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getMBuffer() {
        return this.mBuffer;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    public final void f(@dl.d TextFieldValue value, @dl.e k0 k0Var) {
        kotlin.jvm.internal.f0.p(value, "value");
        boolean z10 = true;
        boolean z11 = !kotlin.jvm.internal.f0.g(value.getComposition(), this.mBuffer.e());
        boolean z12 = false;
        if (!kotlin.jvm.internal.f0.g(this.mBufferState.getText(), value.getText())) {
            this.mBuffer = new i(value.getText(), value.getSelection(), (kotlin.jvm.internal.u) null);
        } else if (o0.g(this.mBufferState.getSelection(), value.getSelection())) {
            z10 = false;
        } else {
            this.mBuffer.r(o0.l(value.getSelection()), o0.k(value.getSelection()));
            z12 = true;
            z10 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.b();
        } else if (!o0.h(value.getComposition().getPackedValue())) {
            this.mBuffer.p(o0.l(value.getComposition().getPackedValue()), o0.k(value.getComposition().getPackedValue()));
        }
        if (z10 || (!z12 && z11)) {
            this.mBuffer.b();
            value = TextFieldValue.d(value, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (k0Var != null) {
            k0Var.g(textFieldValue, value);
        }
    }

    @dl.d
    public final TextFieldValue h() {
        return this.mBufferState;
    }
}
