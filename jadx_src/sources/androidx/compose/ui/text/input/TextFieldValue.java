package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0013B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 B,\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010!J3\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Landroidx/compose/ui/text/d;", "annotatedString", "Landroidx/compose/ui/text/o0;", "selection", "composition", "b", "(Landroidx/compose/ui/text/d;JLandroidx/compose/ui/text/o0;)Landroidx/compose/ui/text/input/TextFieldValue;", "", "text", ak.aF, "(Ljava/lang/String;JLandroidx/compose/ui/text/o0;)Landroidx/compose/ui/text/input/TextFieldValue;", "other", "", "equals", "", "hashCode", "toString", ak.av, "Landroidx/compose/ui/text/d;", "f", "()Landroidx/compose/ui/text/d;", "J", RXScreenCaptureService.KEY_HEIGHT, "()J", "Landroidx/compose/ui/text/o0;", "g", "()Landroidx/compose/ui/text/o0;", "i", "()Ljava/lang/String;", "<init>", "(Landroidx/compose/ui/text/d;JLandroidx/compose/ui/text/o0;Lkotlin/jvm/internal/u;)V", "(Ljava/lang/String;JLandroidx/compose/ui/text/o0;Lkotlin/jvm/internal/u;)V", "d", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldValue {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<TextFieldValue, Object> f16667e = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d TextFieldValue it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return CollectionsKt__CollectionsKt.r(SaversKt.z(it.getText(), SaversKt.e(), Saver), SaversKt.z(o0.b(it.getSelection()), SaversKt.j(o0.INSTANCE), Saver));
        }
    }, new yh.l<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextFieldValue invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            androidx.compose.runtime.saveable.e<androidx.compose.ui.text.d, Object> eVarE = SaversKt.e();
            Boolean bool = Boolean.FALSE;
            o0 o0VarB = null;
            androidx.compose.ui.text.d dVarB = (kotlin.jvm.internal.f0.g(obj, bool) || obj == null) ? null : eVarE.b(obj);
            kotlin.jvm.internal.f0.m(dVarB);
            Object obj2 = list.get(1);
            androidx.compose.runtime.saveable.e<o0, Object> eVarJ = SaversKt.j(o0.INSTANCE);
            if (!kotlin.jvm.internal.f0.g(obj2, bool) && obj2 != null) {
                o0VarB = eVarJ.b(obj2);
            }
            kotlin.jvm.internal.f0.m(o0VarB);
            return new TextFieldValue(dVarB, o0VarB.getPackedValue(), (o0) null, 4, (kotlin.jvm.internal.u) null);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.text.d text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final o0 composition;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.TextFieldValue$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextFieldValue.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<TextFieldValue, Object> a() {
            return TextFieldValue.f16667e;
        }
    }

    private TextFieldValue(androidx.compose.ui.text.d dVar, long j10, o0 o0Var) {
        this.text = dVar;
        this.selection = p0.c(j10, 0, i().length());
        this.composition = o0Var != null ? o0.b(p0.c(o0Var.getPackedValue(), 0, i().length())) : null;
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.d dVar, long j10, o0 o0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(dVar, (i10 & 2) != 0 ? o0.INSTANCE.a() : j10, (i10 & 4) != 0 ? null : o0Var, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.d dVar, long j10, o0 o0Var, kotlin.jvm.internal.u uVar) {
        this(dVar, j10, o0Var);
    }

    private TextFieldValue(String str, long j10, o0 o0Var) {
        this(new androidx.compose.ui.text.d(str, null, null, 6, null), j10, o0Var, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, o0 o0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? o0.INSTANCE.a() : j10, (i10 & 4) != 0 ? null : o0Var, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, o0 o0Var, kotlin.jvm.internal.u uVar) {
        this(str, j10, o0Var);
    }

    public static /* synthetic */ TextFieldValue d(TextFieldValue textFieldValue, androidx.compose.ui.text.d dVar, long j10, o0 o0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = textFieldValue.text;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            o0Var = textFieldValue.composition;
        }
        return textFieldValue.b(dVar, j10, o0Var);
    }

    public static /* synthetic */ TextFieldValue e(TextFieldValue textFieldValue, String str, long j10, o0 o0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            o0Var = textFieldValue.composition;
        }
        return textFieldValue.c(str, j10, o0Var);
    }

    @dl.d
    public final TextFieldValue b(@dl.d androidx.compose.ui.text.d annotatedString, long selection, @dl.e o0 composition) {
        kotlin.jvm.internal.f0.p(annotatedString, "annotatedString");
        return new TextFieldValue(annotatedString, selection, composition, (kotlin.jvm.internal.u) null);
    }

    @dl.d
    public final TextFieldValue c(@dl.d String text, long selection, @dl.e o0 composition) {
        kotlin.jvm.internal.f0.p(text, "text");
        return new TextFieldValue(new androidx.compose.ui.text.d(text, null, null, 6, null), selection, composition, (kotlin.jvm.internal.u) null);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return o0.g(this.selection, textFieldValue.selection) && kotlin.jvm.internal.f0.g(this.composition, textFieldValue.composition) && kotlin.jvm.internal.f0.g(this.text, textFieldValue.text);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.ui.text.d getText() {
        return this.text;
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final o0 getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + o0.o(this.selection)) * 31;
        o0 o0Var = this.composition;
        return iHashCode + (o0Var != null ? o0.o(o0Var.getPackedValue()) : 0);
    }

    @dl.d
    public final String i() {
        return this.text.getText();
    }

    @dl.d
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) o0.q(this.selection)) + ", composition=" + this.composition + ')';
    }
}
