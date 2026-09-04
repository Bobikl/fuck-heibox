package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\b\b\u0002\u0010%\u001a\u00020 \u0012\b\b\u0002\u0010)\u001a\u00020\u0011\u0012\b\b\u0002\u0010+\u001a\u00020\u0011\u0012\u0006\u00100\u001a\u00020,\u0012\b\b\u0002\u00105\u001a\u000201\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u0010=\u001a\u00020;\u0012\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b?\u0010@J\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00042\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u000eH\u0002J\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010)\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010+\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u00104R\u0019\u0010:\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "", "Landroidx/compose/ui/text/input/g;", "Lkotlin/b2;", "e", "d", "Landroidx/compose/ui/input/key/b;", o0.I0, "Landroidx/compose/ui/text/input/b;", "p", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/b;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/r;", "Lkotlin/t;", "block", "f", "", "o", "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/foundation/text/TextFieldState;", ak.av, "Landroidx/compose/foundation/text/TextFieldState;", "l", "()Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "b", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "j", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/ui/text/input/TextFieldValue;", ak.aF, "Landroidx/compose/ui/text/input/TextFieldValue;", "n", "()Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Z", "g", "()Z", "editable", "k", "singleLine", "Landroidx/compose/foundation/text/selection/u;", "Landroidx/compose/foundation/text/selection/u;", "i", "()Landroidx/compose/foundation/text/selection/u;", "preparedSelectionState", "Landroidx/compose/ui/text/input/x;", "Landroidx/compose/ui/text/input/x;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/ui/text/input/x;", "offsetMapping", "Landroidx/compose/foundation/text/a0;", "Landroidx/compose/foundation/text/a0;", "m", "()Landroidx/compose/foundation/text/a0;", "undoManager", "Landroidx/compose/foundation/text/e;", "Landroidx/compose/foundation/text/e;", "keyMapping", "onValueChange", "<init>", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/u;Landroidx/compose/ui/text/input/x;Landroidx/compose/foundation/text/a0;Landroidx/compose/foundation/text/e;Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldKeyInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextFieldState state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextFieldSelectionManager selectionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextFieldValue value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean editable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.text.selection.u preparedSelectionState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.input.x offsetMapping;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final a0 undoManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e keyMapping;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final yh.l<TextFieldValue, b2> f7938j;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKeyInput(@dl.d TextFieldState state, @dl.d TextFieldSelectionManager selectionManager, @dl.d TextFieldValue value, boolean z10, boolean z11, @dl.d androidx.compose.foundation.text.selection.u preparedSelectionState, @dl.d androidx.compose.ui.text.input.x offsetMapping, @dl.e a0 a0Var, @dl.d e keyMapping, @dl.d yh.l<? super TextFieldValue, b2> onValueChange) {
        f0.p(state, "state");
        f0.p(selectionManager, "selectionManager");
        f0.p(value, "value");
        f0.p(preparedSelectionState, "preparedSelectionState");
        f0.p(offsetMapping, "offsetMapping");
        f0.p(keyMapping, "keyMapping");
        f0.p(onValueChange, "onValueChange");
        this.state = state;
        this.selectionManager = selectionManager;
        this.value = value;
        this.editable = z10;
        this.singleLine = z11;
        this.preparedSelectionState = preparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = a0Var;
        this.keyMapping = keyMapping;
        this.f7938j = onValueChange;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, androidx.compose.foundation.text.selection.u uVar, androidx.compose.ui.text.input.x xVar, a0 a0Var, e eVar, yh.l lVar, int i10, kotlin.jvm.internal.u uVar2) {
        this(textFieldState, textFieldSelectionManager, (i10 & 4) != 0 ? new TextFieldValue((String) null, 0L, (androidx.compose.ui.text.o0) null, 7, (kotlin.jvm.internal.u) null) : textFieldValue, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, uVar, (i10 & 64) != 0 ? androidx.compose.ui.text.input.x.INSTANCE.a() : xVar, (i10 & 128) != 0 ? null : a0Var, (i10 & 256) != 0 ? f.a() : eVar, (i10 & 512) != 0 ? new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            public final void a(@dl.d TextFieldValue it) {
                f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue2) {
                a(textFieldValue2);
                return b2.f124493a;
            }
        } : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(androidx.compose.ui.text.input.g gVar) {
        e(kotlin.collections.s.k(gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(List<? extends androidx.compose.ui.text.input.g> list) {
        EditProcessor processor = this.state.getProcessor();
        List<? extends androidx.compose.ui.text.input.g> listT5 = CollectionsKt___CollectionsKt.T5(list);
        listT5.add(0, new androidx.compose.ui.text.input.k());
        this.f7938j.invoke(processor.b(listT5));
    }

    private final void f(yh.l<? super androidx.compose.foundation.text.selection.r, b2> lVar) {
        androidx.compose.foundation.text.selection.r rVar = new androidx.compose.foundation.text.selection.r(this.value, this.offsetMapping, this.state.g(), this.preparedSelectionState);
        lVar.invoke(rVar);
        if (androidx.compose.ui.text.o0.g(rVar.getSelection(), this.value.getSelection()) && f0.g(rVar.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.f7938j.invoke(rVar.k0());
    }

    private final CommitTextCommand p(KeyEvent event) {
        if (!t.a(event)) {
            return null;
        }
        String string = o.a(new StringBuilder(), androidx.compose.ui.input.key.d.c(event)).toString();
        f0.o(string, "StringBuilder().appendCo…              .toString()");
        return new CommitTextCommand(string, 1);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final androidx.compose.ui.text.input.x getOffsetMapping() {
        return this.offsetMapping;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final androidx.compose.foundation.text.selection.u getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextFieldState getState() {
        return this.state;
    }

    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public final a0 getUndoManager() {
        return this.undoManager;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextFieldValue getValue() {
        return this.value;
    }

    public final boolean o(@dl.d KeyEvent event) {
        final KeyCommand keyCommandA;
        f0.p(event, "event");
        CommitTextCommand commitTextCommandP = p(event);
        if (commitTextCommandP != null) {
            if (!this.editable) {
                return false;
            }
            d(commitTextCommandP);
            this.preparedSelectionState.b();
            return true;
        }
        if (!androidx.compose.ui.input.key.c.g(androidx.compose.ui.input.key.d.b(event), androidx.compose.ui.input.key.c.INSTANCE.a()) || (keyCommandA = this.keyMapping.a(event)) == null || (keyCommandA.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f124884b = true;
        f(new yh.l<androidx.compose.foundation.text.selection.r, b2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            /* JADX INFO: compiled from: TextFieldKeyInput.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f7951a;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    iArr[KeyCommand.COPY.ordinal()] = 1;
                    iArr[KeyCommand.PASTE.ordinal()] = 2;
                    iArr[KeyCommand.CUT.ordinal()] = 3;
                    iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    iArr[KeyCommand.UP.ordinal()] = 10;
                    iArr[KeyCommand.DOWN.ordinal()] = 11;
                    iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    iArr[KeyCommand.HOME.ordinal()] = 18;
                    iArr[KeyCommand.END.ordinal()] = 19;
                    iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    iArr[KeyCommand.TAB.ordinal()] = 27;
                    iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    iArr[KeyCommand.UNDO.ordinal()] = 46;
                    iArr[KeyCommand.REDO.ordinal()] = 47;
                    iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    f7951a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.foundation.text.selection.r commandExecutionContext) {
                TextFieldValue textFieldValueH;
                TextFieldValue textFieldValueD;
                f0.p(commandExecutionContext, "$this$commandExecutionContext");
                switch (a.f7951a[keyCommandA.ordinal()]) {
                    case 1:
                        this.getSelectionManager().l(false);
                        break;
                    case 2:
                        this.getSelectionManager().P();
                        break;
                    case 3:
                        this.getSelectionManager().p();
                        break;
                    case 4:
                        commandExecutionContext.d(new yh.l<androidx.compose.foundation.text.selection.r, b2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            public final void a(@dl.d androidx.compose.foundation.text.selection.r collapseLeftOr) {
                                f0.p(collapseLeftOr, "$this$collapseLeftOr");
                                collapseLeftOr.H();
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.foundation.text.selection.r rVar) {
                                a(rVar);
                                return b2.f124493a;
                            }
                        });
                        break;
                    case 5:
                        commandExecutionContext.e(new yh.l<androidx.compose.foundation.text.selection.r, b2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            public final void a(@dl.d androidx.compose.foundation.text.selection.r collapseRightOr) {
                                f0.p(collapseRightOr, "$this$collapseRightOr");
                                collapseRightOr.P();
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.foundation.text.selection.r rVar) {
                                a(rVar);
                                return b2.f124493a;
                            }
                        });
                        break;
                    case 6:
                        commandExecutionContext.I();
                        break;
                    case 7:
                        commandExecutionContext.Q();
                        break;
                    case 8:
                        commandExecutionContext.N();
                        break;
                    case 9:
                        commandExecutionContext.K();
                        break;
                    case 10:
                        commandExecutionContext.X();
                        break;
                    case 11:
                        commandExecutionContext.G();
                        break;
                    case 12:
                        commandExecutionContext.n0();
                        break;
                    case 13:
                        commandExecutionContext.m0();
                        break;
                    case 14:
                        commandExecutionContext.W();
                        break;
                    case 15:
                        commandExecutionContext.T();
                        break;
                    case 16:
                        commandExecutionContext.U();
                        break;
                    case 17:
                        commandExecutionContext.V();
                        break;
                    case 18:
                        commandExecutionContext.S();
                        break;
                    case 19:
                        commandExecutionContext.R();
                        break;
                    case 20:
                        List<androidx.compose.ui.text.input.g> listH0 = commandExecutionContext.h0(new yh.l<androidx.compose.foundation.text.selection.r, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // yh.l
                            @dl.e
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final androidx.compose.ui.text.input.g invoke(@dl.d androidx.compose.foundation.text.selection.r deleteIfSelectedOr) {
                                f0.p(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                return new DeleteSurroundingTextCommand(androidx.compose.ui.text.o0.i(deleteIfSelectedOr.getSelection()) - deleteIfSelectedOr.x(), 0);
                            }
                        });
                        if (listH0 != null) {
                            this.e(listH0);
                        }
                        break;
                    case 21:
                        List<androidx.compose.ui.text.input.g> listH1 = commandExecutionContext.h0(new yh.l<androidx.compose.foundation.text.selection.r, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // yh.l
                            @dl.e
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final androidx.compose.ui.text.input.g invoke(@dl.d androidx.compose.foundation.text.selection.r deleteIfSelectedOr) {
                                f0.p(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                int iO = deleteIfSelectedOr.o();
                                if (iO != -1) {
                                    return new DeleteSurroundingTextCommand(0, iO - androidx.compose.ui.text.o0.i(deleteIfSelectedOr.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listH1 != null) {
                            this.e(listH1);
                        }
                        break;
                    case 22:
                        List<androidx.compose.ui.text.input.g> listH2 = commandExecutionContext.h0(new yh.l<androidx.compose.foundation.text.selection.r, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // yh.l
                            @dl.e
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final androidx.compose.ui.text.input.g invoke(@dl.d androidx.compose.foundation.text.selection.r deleteIfSelectedOr) {
                                f0.p(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                Integer numA = deleteIfSelectedOr.A();
                                if (numA == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(androidx.compose.ui.text.o0.i(deleteIfSelectedOr.getSelection()) - numA.intValue(), 0);
                            }
                        });
                        if (listH2 != null) {
                            this.e(listH2);
                        }
                        break;
                    case 23:
                        List<androidx.compose.ui.text.input.g> listH3 = commandExecutionContext.h0(new yh.l<androidx.compose.foundation.text.selection.r, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // yh.l
                            @dl.e
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final androidx.compose.ui.text.input.g invoke(@dl.d androidx.compose.foundation.text.selection.r deleteIfSelectedOr) {
                                f0.p(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                Integer numP = deleteIfSelectedOr.p();
                                if (numP != null) {
                                    return new DeleteSurroundingTextCommand(0, numP.intValue() - androidx.compose.ui.text.o0.i(deleteIfSelectedOr.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listH3 != null) {
                            this.e(listH3);
                        }
                        break;
                    case 24:
                        List<androidx.compose.ui.text.input.g> listH4 = commandExecutionContext.h0(new yh.l<androidx.compose.foundation.text.selection.r, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // yh.l
                            @dl.e
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final androidx.compose.ui.text.input.g invoke(@dl.d androidx.compose.foundation.text.selection.r deleteIfSelectedOr) {
                                f0.p(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                Integer numL = deleteIfSelectedOr.l();
                                if (numL == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(androidx.compose.ui.text.o0.i(deleteIfSelectedOr.getSelection()) - numL.intValue(), 0);
                            }
                        });
                        if (listH4 != null) {
                            this.e(listH4);
                        }
                        break;
                    case 25:
                        List<androidx.compose.ui.text.input.g> listH5 = commandExecutionContext.h0(new yh.l<androidx.compose.foundation.text.selection.r, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // yh.l
                            @dl.e
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final androidx.compose.ui.text.input.g invoke(@dl.d androidx.compose.foundation.text.selection.r deleteIfSelectedOr) {
                                f0.p(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                                Integer numI = deleteIfSelectedOr.i();
                                if (numI != null) {
                                    return new DeleteSurroundingTextCommand(0, numI.intValue() - androidx.compose.ui.text.o0.i(deleteIfSelectedOr.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listH5 != null) {
                            this.e(listH5);
                        }
                        break;
                    case 26:
                        if (!this.getSingleLine()) {
                            this.d(new CommitTextCommand("\n", 1));
                        } else {
                            booleanRef.f124884b = false;
                        }
                        break;
                    case 27:
                        if (!this.getSingleLine()) {
                            this.d(new CommitTextCommand("\t", 1));
                        } else {
                            booleanRef.f124884b = false;
                        }
                        break;
                    case 28:
                        commandExecutionContext.Y();
                        break;
                    case 29:
                        commandExecutionContext.H().Z();
                        break;
                    case 30:
                        commandExecutionContext.P().Z();
                        break;
                    case 31:
                        commandExecutionContext.I().Z();
                        break;
                    case 32:
                        commandExecutionContext.Q().Z();
                        break;
                    case 33:
                        commandExecutionContext.N().Z();
                        break;
                    case 34:
                        commandExecutionContext.K().Z();
                        break;
                    case 35:
                        commandExecutionContext.W().Z();
                        break;
                    case 36:
                        commandExecutionContext.T().Z();
                        break;
                    case 37:
                        commandExecutionContext.U().Z();
                        break;
                    case 38:
                        commandExecutionContext.V().Z();
                        break;
                    case 39:
                        commandExecutionContext.X().Z();
                        break;
                    case 40:
                        commandExecutionContext.G().Z();
                        break;
                    case 41:
                        commandExecutionContext.n0().Z();
                        break;
                    case 42:
                        commandExecutionContext.m0().Z();
                        break;
                    case 43:
                        commandExecutionContext.S().Z();
                        break;
                    case 44:
                        commandExecutionContext.R().Z();
                        break;
                    case 45:
                        commandExecutionContext.f();
                        break;
                    case 46:
                        a0 undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.c(commandExecutionContext.k0());
                        }
                        a0 undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (textFieldValueH = undoManager2.h()) != null) {
                            this.f7938j.invoke(textFieldValueH);
                            break;
                        }
                        break;
                    case 47:
                        a0 undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (textFieldValueD = undoManager3.d()) != null) {
                            this.f7938j.invoke(textFieldValueD);
                            break;
                        }
                        break;
                    case 48:
                        d.b();
                        break;
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.foundation.text.selection.r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        });
        a0 a0Var = this.undoManager;
        if (a0Var != null) {
            a0Var.a();
        }
        return booleanRef.f124884b;
    }
}
