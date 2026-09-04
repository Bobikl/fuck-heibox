package androidx.compose.ui.text.input;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.app.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001JB\u0017\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\bG\u0010HB\u0011\b\u0010\u0012\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\bG\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0004JI\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u0010H\u0016ø\u0001\u0000J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0013\u0010\u001a\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0017R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R$\u00100\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020504038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/b0;", "Lkotlin/b2;", "p", "", "visible", "q", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "k", "o", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/p;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/g;", "onEditCommand", "Landroidx/compose/ui/text/input/o;", "onImeActionPerformed", "f", ak.aF, "b", ak.av, "r", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "oldValue", "newValue", "d", "Lb1/i;", "rect", "e", "Landroid/view/View;", "Landroid/view/View;", "n", "()Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/ui/text/input/s;", "Landroidx/compose/ui/text/input/s;", "inputMethodManager", "Z", "editorHasFocus", "<set-?>", "Landroidx/compose/ui/text/input/TextFieldValue;", "m", "()Landroidx/compose/ui/text/input/TextFieldValue;", "state", "g", "Landroidx/compose/ui/text/input/p;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/c0;", RXScreenCaptureService.KEY_HEIGHT, "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "i", "Lkotlin/z;", "l", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "j", "Landroid/graphics/Rect;", "focusedRect", "Lkotlinx/coroutines/channels/k;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "Lkotlinx/coroutines/channels/k;", "textInputCommandChannel", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/s;)V", "(Landroid/view/View;)V", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class TextInputServiceAndroid implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final s inputMethodManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean editorHasFocus;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private yh.l<? super List<? extends g>, b2> f16676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private yh.l<? super o, b2> f16677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private TextFieldValue state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ImeOptions imeOptions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<WeakReference<c0>> ics;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z baseInputConnection;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Rect focusedRect;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.channels.k<TextInputCommand> textInputCommandChannel;

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16684a;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            iArr[TextInputCommand.StartInput.ordinal()] = 1;
            iArr[TextInputCommand.StopInput.ordinal()] = 2;
            iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            f16684a = iArr;
        }
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(bv = {}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/ui/text/input/TextInputServiceAndroid$b", "Landroidx/compose/ui/text/input/q;", "", "Landroidx/compose/ui/text/input/g;", "editCommands", "Lkotlin/b2;", "b", "Landroidx/compose/ui/text/input/o;", "imeAction", ak.av, "(I)V", "Landroid/view/KeyEvent;", o0.I0, ak.aF, "Landroidx/compose/ui/text/input/c0;", "ic", "d", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements q {
        b() {
        }

        @Override // androidx.compose.ui.text.input.q
        public void a(int imeAction) {
            TextInputServiceAndroid.this.f16677e.invoke(o.i(imeAction));
        }

        @Override // androidx.compose.ui.text.input.q
        public void b(@dl.d List<? extends g> editCommands) {
            kotlin.jvm.internal.f0.p(editCommands, "editCommands");
            TextInputServiceAndroid.this.f16676d.invoke(editCommands);
        }

        @Override // androidx.compose.ui.text.input.q
        public void c(@dl.d KeyEvent event) {
            kotlin.jvm.internal.f0.p(event, "event");
            TextInputServiceAndroid.this.l().sendKeyEvent(event);
        }

        @Override // androidx.compose.ui.text.input.q
        public void d(@dl.d c0 ic2) {
            kotlin.jvm.internal.f0.p(ic2, "ic");
            int size = TextInputServiceAndroid.this.ics.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (kotlin.jvm.internal.f0.g(((WeakReference) TextInputServiceAndroid.this.ics.get(i10)).get(), ic2)) {
                    TextInputServiceAndroid.this.ics.remove(i10);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputServiceAndroid(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        Context context = view.getContext();
        kotlin.jvm.internal.f0.o(context, "view.context");
        this(view, new InputMethodManagerImpl(context));
    }

    public TextInputServiceAndroid(@dl.d View view, @dl.d s inputMethodManager) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(inputMethodManager, "inputMethodManager");
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.f16676d = new yh.l<List<? extends g>, b2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void a(@dl.d List<? extends g> it) {
                kotlin.jvm.internal.f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(List<? extends g> list) {
                a(list);
                return b2.f124493a;
            }
        };
        this.f16677e = new yh.l<o, b2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            public final void a(int i10) {
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(o oVar) {
                a(oVar.getValue());
                return b2.f124493a;
            }
        };
        this.state = new TextFieldValue("", androidx.compose.ui.text.o0.INSTANCE.a(), (androidx.compose.ui.text.o0) null, 4, (kotlin.jvm.internal.u) null);
        this.imeOptions = ImeOptions.INSTANCE.a();
        this.ics = new ArrayList();
        this.baseInputConnection = kotlin.b0.b(LazyThreadSafetyMode.NONE, new yh.a<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.f16686b.getView(), false);
            }
        });
        this.textInputCommandChannel = kotlinx.coroutines.channels.m.d(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection l() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    private final void p() {
        this.inputMethodManager.e(this.view);
    }

    private final void q(boolean z10) {
        if (z10) {
            this.inputMethodManager.a(this.view);
        } else {
            this.inputMethodManager.b(this.view.getWindowToken());
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void s(TextInputCommand textInputCommand, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) {
        int i10 = a.f16684a[textInputCommand.ordinal()];
        if (i10 == 1) {
            ?? r10 = Boolean.TRUE;
            objectRef.f124891b = r10;
            objectRef2.f124891b = r10;
        } else if (i10 == 2) {
            ?? r11 = Boolean.FALSE;
            objectRef.f124891b = r11;
            objectRef2.f124891b = r11;
        } else if ((i10 == 3 || i10 == 4) && !kotlin.jvm.internal.f0.g(objectRef.f124891b, Boolean.FALSE)) {
            objectRef2.f124891b = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    @Override // androidx.compose.ui.text.input.b0
    public void a() {
        this.textInputCommandChannel.v(TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.b0
    public void b() {
        this.textInputCommandChannel.v(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.b0
    public void c() {
        this.editorHasFocus = false;
        this.f16676d = new yh.l<List<? extends g>, b2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            public final void a(@dl.d List<? extends g> it) {
                kotlin.jvm.internal.f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(List<? extends g> list) {
                a(list);
                return b2.f124493a;
            }
        };
        this.f16677e = new yh.l<o, b2>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            public final void a(int i10) {
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(o oVar) {
                a(oVar.getValue());
                return b2.f124493a;
            }
        };
        this.focusedRect = null;
        this.textInputCommandChannel.v(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.b0
    public void d(@dl.e TextFieldValue textFieldValue, @dl.d TextFieldValue newValue) {
        kotlin.jvm.internal.f0.p(newValue, "newValue");
        boolean z10 = true;
        boolean z11 = (androidx.compose.ui.text.o0.g(this.state.getSelection(), newValue.getSelection()) && kotlin.jvm.internal.f0.g(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = this.ics.get(i10).get();
            if (c0Var != null) {
                c0Var.j(newValue);
            }
        }
        if (kotlin.jvm.internal.f0.g(textFieldValue, newValue)) {
            if (z11) {
                s sVar = this.inputMethodManager;
                View view = this.view;
                int iL = androidx.compose.ui.text.o0.l(newValue.getSelection());
                int iK = androidx.compose.ui.text.o0.k(newValue.getSelection());
                androidx.compose.ui.text.o0 composition = this.state.getComposition();
                int iL2 = composition != null ? androidx.compose.ui.text.o0.l(composition.getPackedValue()) : -1;
                androidx.compose.ui.text.o0 composition2 = this.state.getComposition();
                sVar.c(view, iL, iK, iL2, composition2 != null ? androidx.compose.ui.text.o0.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue == null || (kotlin.jvm.internal.f0.g(textFieldValue.i(), newValue.i()) && (!androidx.compose.ui.text.o0.g(textFieldValue.getSelection(), newValue.getSelection()) || kotlin.jvm.internal.f0.g(textFieldValue.getComposition(), newValue.getComposition())))) {
            z10 = false;
        }
        if (z10) {
            p();
            return;
        }
        int size2 = this.ics.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c0 c0Var2 = this.ics.get(i11).get();
            if (c0Var2 != null) {
                c0Var2.k(this.state, this.inputMethodManager, this.view);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.b0
    @kotlin.k(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void e(@dl.d b1.i rect) {
        Rect rect2;
        kotlin.jvm.internal.f0.p(rect, "rect");
        this.focusedRect = new Rect(di.d.L0(rect.t()), di.d.L0(rect.getF30372b()), di.d.L0(rect.x()), di.d.L0(rect.j()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.b0
    public void f(@dl.d TextFieldValue value, @dl.d ImeOptions imeOptions, @dl.d yh.l<? super List<? extends g>, b2> onEditCommand, @dl.d yh.l<? super o, b2> onImeActionPerformed) {
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(imeOptions, "imeOptions");
        kotlin.jvm.internal.f0.p(onEditCommand, "onEditCommand");
        kotlin.jvm.internal.f0.p(onImeActionPerformed, "onImeActionPerformed");
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.f16676d = onEditCommand;
        this.f16677e = onImeActionPerformed;
        this.textInputCommandChannel.v(TextInputCommand.StartInput);
    }

    @dl.e
    public final InputConnection k(@dl.d EditorInfo outAttrs) {
        kotlin.jvm.internal.f0.p(outAttrs, "outAttrs");
        if (!this.editorHasFocus) {
            return null;
        }
        j0.b(outAttrs, this.imeOptions, this.state);
        c0 c0Var = new c0(this.state, new b(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(c0Var));
        return c0Var;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextFieldValue getState() {
        return this.state;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[LOOP:0: B:22:0x0067->B:40:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:1: B:26:0x007e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:22:0x0067->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0067
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public final java.lang.Object r(@dl.d kotlin.coroutines.c<? super kotlin.b2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = (androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1) r0
            int r1 = r0.f16695f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16695f = r1
            goto L18
        L13:
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = new androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f16693d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f16695f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f16692c
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.f16691b
            androidx.compose.ui.text.input.TextInputServiceAndroid r4 = (androidx.compose.ui.text.input.TextInputServiceAndroid) r4
            kotlin.t0.n(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            kotlin.t0.n(r9)
            kotlinx.coroutines.channels.k<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r8.textInputCommandChannel
            kotlinx.coroutines.channels.ChannelIterator r9 = r9.iterator()
            r4 = r8
            r2 = r9
        L44:
            r0.f16691b = r4
            r0.f16692c = r2
            r0.f16695f = r3
            java.lang.Object r9 = r2.b(r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = r2.next()
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            android.view.View r5 = r4.view
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L74
        L67:
            kotlinx.coroutines.channels.k<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.textInputCommandChannel
            java.lang.Object r9 = r9.E()
            boolean r9 = kotlinx.coroutines.channels.n.m(r9)
            if (r9 != 0) goto L67
            goto L44
        L74:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
        L7e:
            if (r9 == 0) goto L90
            s(r9, r5, r6)
            kotlinx.coroutines.channels.k<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.textInputCommandChannel
            java.lang.Object r9 = r9.E()
            java.lang.Object r9 = kotlinx.coroutines.channels.n.h(r9)
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            goto L7e
        L90:
            T r9 = r5.f124891b
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r3)
            boolean r9 = kotlin.jvm.internal.f0.g(r9, r7)
            if (r9 == 0) goto L9f
            r4.p()
        L9f:
            T r9 = r6.f124891b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto Lac
            boolean r9 = r9.booleanValue()
            r4.q(r9)
        Lac:
            T r9 = r5.f124891b
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            boolean r9 = kotlin.jvm.internal.f0.g(r9, r5)
            if (r9 == 0) goto L44
            r4.p()
            goto L44
        Lbd:
            kotlin.b2 r9 = kotlin.b2.f124493a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.r(kotlin.coroutines.c):java.lang.Object");
    }
}
