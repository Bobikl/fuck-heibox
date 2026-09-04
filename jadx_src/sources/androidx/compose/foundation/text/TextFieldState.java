package androidx.compose.foundation.text;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.n1;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.k0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u0019\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\bx\u0010yJo\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010:\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00106\u001a\u0004\b.\u00107\"\u0004\b8\u00109R4\u0010A\u001a\u00020;2\u0006\u00105\u001a\u00020;8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010H\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b<\u0010E\"\u0004\bF\u0010GR\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010W\u001a\u00020R2\u0006\u00105\u001a\u00020R8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u00106\u001a\u0004\b(\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010X\u001a\u0004\bY\u00107\"\u0004\bZ\u00109R+\u0010^\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\b\\\u00107\"\u0004\b]\u00109R+\u0010b\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00106\u001a\u0004\b`\u00107\"\u0004\ba\u00109R+\u0010e\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bc\u00106\u001a\u0004\bc\u00107\"\u0004\bd\u00109R$\u0010g\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010X\u001a\u0004\bf\u00107R\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010iR\u0017\u0010n\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bf\u0010l\u001a\u0004\b_\u0010mR(\u0010s\u001a\u0004\u0018\u00010J2\b\u0010o\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010p\"\u0004\bq\u0010rR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010t\u001a\u0004\bS\u0010uR&\u0010w\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u000f0\r8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\bw\u0010t\u001a\u0004\bL\u0010u\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006z"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "Landroidx/compose/ui/text/d;", "untransformedText", "visualText", "Landroidx/compose/ui/text/q0;", "textStyle", "", "softWrap", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Lkotlin/b2;", "onValueChange", "Landroidx/compose/foundation/text/i;", "keyboardActions", "Landroidx/compose/ui/focus/g;", "focusManager", "Landroidx/compose/ui/graphics/l0;", "selectionBackgroundColor", "G", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;ZLs1/e;Landroidx/compose/ui/text/font/v$b;Lyh/l;Landroidx/compose/foundation/text/i;Landroidx/compose/ui/focus/g;J)V", "Landroidx/compose/foundation/text/p;", ak.av, "Landroidx/compose/foundation/text/p;", "r", "()Landroidx/compose/foundation/text/p;", androidx.exifinterface.media.a.S4, "(Landroidx/compose/foundation/text/p;)V", "textDelegate", "Landroidx/compose/runtime/n1;", "b", "Landroidx/compose/runtime/n1;", "l", "()Landroidx/compose/runtime/n1;", "recomposeScope", "Landroidx/compose/ui/text/input/EditProcessor;", ak.aF, "Landroidx/compose/ui/text/input/EditProcessor;", "k", "()Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/k0;", "d", "Landroidx/compose/ui/text/input/k0;", "e", "()Landroidx/compose/ui/text/input/k0;", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/compose/ui/text/input/k0;)V", "inputSession", "<set-?>", "Landroidx/compose/runtime/a1;", "()Z", "v", "(Z)V", "hasFocus", "Ls1/h;", "f", RXScreenCaptureService.KEY_HEIGHT, "()F", ak.aD, "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/q;", "g", "Landroidx/compose/ui/layout/q;", "()Landroidx/compose/ui/layout/q;", "x", "(Landroidx/compose/ui/layout/q;)V", "layoutCoordinates", "Landroidx/compose/runtime/a1;", "Landroidx/compose/foundation/text/w;", "layoutResultState", "i", "Landroidx/compose/ui/text/d;", ak.aB, "()Landroidx/compose/ui/text/d;", "F", "(Landroidx/compose/ui/text/d;)V", "Landroidx/compose/foundation/text/HandleState;", "j", "()Landroidx/compose/foundation/text/HandleState;", ak.aG, "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "Z", "o", "B", "showFloatingToolbar", "q", "D", "showSelectionHandleStart", "m", "p", "C", "showSelectionHandleEnd", "n", androidx.exifinterface.media.a.W4, "showCursorHandle", "t", "isLayoutResultStale", "Landroidx/compose/foundation/text/g;", "Landroidx/compose/foundation/text/g;", "keyboardActionRunner", "Landroidx/compose/ui/graphics/h1;", "Landroidx/compose/ui/graphics/h1;", "()Landroidx/compose/ui/graphics/h1;", "selectionPaint", "value", "()Landroidx/compose/foundation/text/w;", "y", "(Landroidx/compose/foundation/text/w;)V", "layoutResult", "Lyh/l;", "()Lyh/l;", "Landroidx/compose/ui/text/input/o;", "onImeActionPerformed", "<init>", "(Landroidx/compose/foundation/text/p;Landroidx/compose/runtime/n1;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private p textDelegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n1 recomposeScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EditProcessor processor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private k0 inputSession;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 hasFocus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 minHeightForSingleLineField;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q layoutCoordinates;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<w> layoutResultState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.text.d untransformedText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 handleState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean showFloatingToolbar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 showSelectionHandleStart;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 showSelectionHandleEnd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 showCursorHandle;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isLayoutResultStale;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g keyboardActionRunner;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private yh.l<? super TextFieldValue, b2> f8026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final yh.l<TextFieldValue, b2> f8027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final yh.l<androidx.compose.ui.text.input.o, b2> f8028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 selectionPaint;

    public TextFieldState(@dl.d p textDelegate, @dl.d n1 recomposeScope) {
        f0.p(textDelegate, "textDelegate");
        f0.p(recomposeScope, "recomposeScope");
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.processor = new EditProcessor();
        Boolean bool = Boolean.FALSE;
        this.hasFocus = h2.g(bool, null, 2, null);
        this.minHeightForSingleLineField = h2.g(s1.h.d(s1.h.g(0)), null, 2, null);
        this.layoutResultState = h2.g(null, null, 2, null);
        this.handleState = h2.g(HandleState.None, null, 2, null);
        this.showSelectionHandleStart = h2.g(bool, null, 2, null);
        this.showSelectionHandleEnd = h2.g(bool, null, 2, null);
        this.showCursorHandle = h2.g(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.keyboardActionRunner = new g();
        this.f8026q = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChangeOriginal$1
            public final void a(@dl.d TextFieldValue it) {
                f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                a(textFieldValue);
                return b2.f124493a;
            }
        };
        this.f8027r = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChange$1
            {
                super(1);
            }

            public final void a(@dl.d TextFieldValue it) {
                f0.p(it, "it");
                String strI = it.i();
                androidx.compose.ui.text.d untransformedText = this.f8031b.getUntransformedText();
                if (!f0.g(strI, untransformedText != null ? untransformedText.getText() : null)) {
                    this.f8031b.u(HandleState.None);
                }
                this.f8031b.f8026q.invoke(it);
                this.f8031b.getRecomposeScope().invalidate();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                a(textFieldValue);
                return b2.f124493a;
            }
        };
        this.f8028s = new yh.l<androidx.compose.ui.text.input.o, b2>() { // from class: androidx.compose.foundation.text.TextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            public final void a(int i10) {
                this.f8030b.keyboardActionRunner.e(i10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.text.input.o oVar) {
                a(oVar.getValue());
                return b2.f124493a;
            }
        };
        this.selectionPaint = androidx.compose.ui.graphics.i.a();
    }

    public final void A(boolean z10) {
        this.showCursorHandle.setValue(Boolean.valueOf(z10));
    }

    public final void B(boolean z10) {
        this.showFloatingToolbar = z10;
    }

    public final void C(boolean z10) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z10));
    }

    public final void D(boolean z10) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z10));
    }

    public final void E(@dl.d p pVar) {
        f0.p(pVar, "<set-?>");
        this.textDelegate = pVar;
    }

    public final void F(@dl.e androidx.compose.ui.text.d dVar) {
        this.untransformedText = dVar;
    }

    public final void G(@dl.d androidx.compose.ui.text.d untransformedText, @dl.d androidx.compose.ui.text.d visualText, @dl.d TextStyle textStyle, boolean softWrap, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, @dl.d yh.l<? super TextFieldValue, b2> onValueChange, @dl.d i keyboardActions, @dl.d androidx.compose.ui.focus.g focusManager, long selectionBackgroundColor) {
        f0.p(untransformedText, "untransformedText");
        f0.p(visualText, "visualText");
        f0.p(textStyle, "textStyle");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        f0.p(onValueChange, "onValueChange");
        f0.p(keyboardActions, "keyboardActions");
        f0.p(focusManager, "focusManager");
        this.f8026q = onValueChange;
        this.selectionPaint.i(selectionBackgroundColor);
        g gVar = this.keyboardActionRunner;
        gVar.h(keyboardActions);
        gVar.f(focusManager);
        gVar.g(this.inputSession);
        this.untransformedText = untransformedText;
        p pVarC = CoreTextKt.c(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (192 & 32) != 0 ? true : softWrap, (192 & 64) != 0 ? androidx.compose.ui.text.style.q.INSTANCE.a() : 0, (192 & 128) != 0 ? Integer.MAX_VALUE : 0, CollectionsKt__CollectionsKt.E());
        if (this.textDelegate != pVarC) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = pVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final HandleState c() {
        return (HandleState) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final k0 getInputSession() {
        return this.inputSession;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.ui.layout.q getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @dl.e
    public final w g() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float h() {
        return ((s1.h) this.minHeightForSingleLineField.getValue()).w();
    }

    @dl.d
    public final yh.l<androidx.compose.ui.text.input.o, b2> i() {
        return this.f8028s;
    }

    @dl.d
    public final yh.l<TextFieldValue, b2> j() {
        return this.f8027r;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final EditProcessor getProcessor() {
        return this.processor;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final n1 getRecomposeScope() {
        return this.recomposeScope;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final h1 getSelectionPaint() {
        return this.selectionPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final p getTextDelegate() {
        return this.textDelegate;
    }

    @dl.e
    /* JADX INFO: renamed from: s, reason: from getter */
    public final androidx.compose.ui.text.d getUntransformedText() {
        return this.untransformedText;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void u(@dl.d HandleState handleState) {
        f0.p(handleState, "<set-?>");
        this.handleState.setValue(handleState);
    }

    public final void v(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    public final void w(@dl.e k0 k0Var) {
        this.inputSession = k0Var;
    }

    public final void x(@dl.e androidx.compose.ui.layout.q qVar) {
        this.layoutCoordinates = qVar;
    }

    public final void y(@dl.e w wVar) {
        this.layoutResultState.setValue(wVar);
        this.isLayoutResultStale = false;
    }

    public final void z(float f10) {
        this.minHeightForSingleLineField.setValue(s1.h.d(f10));
    }
}
