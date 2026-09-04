package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/a0;", "", "Lkotlin/b2;", "e", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "now", "f", ak.av, ak.aF, RXScreenCaptureService.KEY_HEIGHT, "d", "", "I", "b", "()I", "maxStoredCharacters", "Landroidx/compose/foundation/text/a0$a;", "Landroidx/compose/foundation/text/a0$a;", "undoStack", "redoStack", "storedCharacters", "Ljava/lang/Long;", "lastSnapshot", "", "Z", "forceNextSnapshot", "<init>", "(I)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxStoredCharacters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a undoStack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a redoStack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int storedCharacters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Long lastSnapshot;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean forceNextSnapshot;

    /* JADX INFO: compiled from: UndoManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/a0$a;", "", ak.av, "Landroidx/compose/foundation/text/a0$a;", "()Landroidx/compose/foundation/text/a0$a;", ak.aF, "(Landroidx/compose/foundation/text/a0$a;)V", "next", "Landroidx/compose/ui/text/input/TextFieldValue;", "b", "Landroidx/compose/ui/text/input/TextFieldValue;", "()Landroidx/compose/ui/text/input/TextFieldValue;", "d", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value", "<init>", "(Landroidx/compose/foundation/text/a0$a;Landroidx/compose/ui/text/input/TextFieldValue;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private a next;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private TextFieldValue value;

        public a(@dl.e a aVar, @dl.d TextFieldValue value) {
            f0.p(value, "value");
            this.next = aVar;
            this.value = value;
        }

        public /* synthetic */ a(a aVar, TextFieldValue textFieldValue, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? null : aVar, textFieldValue);
        }

        @dl.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void c(@dl.e a aVar) {
            this.next = aVar;
        }

        public final void d(@dl.d TextFieldValue textFieldValue) {
            f0.p(textFieldValue, "<set-?>");
            this.value = textFieldValue;
        }
    }

    public a0() {
        this(0, 1, null);
    }

    public a0(int i10) {
        this.maxStoredCharacters = i10;
    }

    public /* synthetic */ a0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private final void e() {
        a next;
        a next2 = this.undoStack;
        if ((next2 != null ? next2.getNext() : null) == null) {
            return;
        }
        while (true) {
            if (next2 == null) {
                next = null;
            } else {
                a next3 = next2.getNext();
                if (next3 != null) {
                    next = next3.getNext();
                } else {
                    next = null;
                }
            }
            if (next == null) {
                break;
            } else {
                next2 = next2.getNext();
            }
        }
        if (next2 == null) {
            return;
        }
        next2.c(null);
    }

    public static /* synthetic */ void g(a0 a0Var, TextFieldValue textFieldValue, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = c0.a();
        }
        a0Var.f(textFieldValue, j10);
    }

    public final void a() {
        this.forceNextSnapshot = true;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void c(@dl.d TextFieldValue value) {
        TextFieldValue value2;
        f0.p(value, "value");
        this.forceNextSnapshot = false;
        a aVar = this.undoStack;
        if (f0.g(value, aVar != null ? aVar.getValue() : null)) {
            return;
        }
        String strI = value.i();
        a aVar2 = this.undoStack;
        if (f0.g(strI, (aVar2 == null || (value2 = aVar2.getValue()) == null) ? null : value2.i())) {
            a aVar3 = this.undoStack;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(value);
            return;
        }
        this.undoStack = new a(this.undoStack, value);
        this.redoStack = null;
        int length = this.storedCharacters + value.i().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            e();
        }
    }

    @dl.e
    public final TextFieldValue d() {
        a aVar = this.redoStack;
        if (aVar == null) {
            return null;
        }
        this.redoStack = aVar.getNext();
        this.undoStack = new a(this.undoStack, aVar.getValue());
        this.storedCharacters += aVar.getValue().i().length();
        return aVar.getValue();
    }

    public final void f(@dl.d TextFieldValue value, long j10) {
        f0.p(value, "value");
        if (!this.forceNextSnapshot) {
            Long l10 = this.lastSnapshot;
            if (j10 <= (l10 != null ? l10.longValue() : 0L) + ((long) b0.a())) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j10);
        c(value);
    }

    @dl.e
    public final TextFieldValue h() {
        a next;
        a aVar = this.undoStack;
        if (aVar == null || (next = aVar.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= aVar.getValue().i().length();
        this.redoStack = new a(this.redoStack, aVar.getValue());
        return next.getValue();
    }
}
