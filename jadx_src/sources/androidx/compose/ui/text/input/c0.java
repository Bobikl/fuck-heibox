package androidx.compose.ui.text.input;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.core.app.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010i\u001a\u00020\u0012\u0012\u0006\u0010U\u001a\u00020Q\u0012\u0006\u0010Y\u001a\u00020\u0005¢\u0006\u0004\bj\u0010kJ\u0017\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0016J\u001a\u0010#\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\fH\u0016J\u0018\u00100\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\fH\u0016J\u0012\u00101\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020\fH\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\fH\u0016J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010.\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\fH\u0016J\u0012\u0010=\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010@\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u00010>H\u0016J\n\u0010B\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\fH\u0016J\u0010\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010G\u001a\u00020\fH\u0016J\u001c\u0010L\u001a\u00020\u00052\b\u0010I\u001a\u0004\u0018\u00010\u000f2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016J\"\u0010P\u001a\u00020\u00052\u0006\u0010N\u001a\u00020M2\u0006\u0010.\u001a\u00020\f2\b\u0010O\u001a\u0004\u0018\u00010JH\u0016R\u0017\u0010U\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010Y\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010ZR*\u0010b\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00128\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010ZR\u0016\u0010d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010VR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00070e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010fR\u0016\u0010h\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010V¨\u0006l"}, d2 = {"Landroidx/compose/ui/text/input/c0;", "Landroid/view/inputmethod/InputConnection;", "Lkotlin/Function0;", "Lkotlin/b2;", "block", "", "d", "Landroidx/compose/ui/text/input/g;", "editCommand", ak.av, "b", ak.aF, "", "code", "i", "", "message", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/ui/text/input/s;", "inputMethodManager", "Landroid/view/View;", sd.b.f139384b, "k", "beginBatchEdit", "endBatchEdit", "closeConnection", "", "text", "newCursorPosition", "commitText", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "setComposingRegion", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", o0.I0, "sendKeyEvent", "maxChars", Constants.KEY_FLAGS, "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "Landroid/os/Handler;", "getHandler", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "reqModes", "getCursorCapsMode", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "Landroidx/compose/ui/text/input/q;", "Landroidx/compose/ui/text/input/q;", "f", "()Landroidx/compose/ui/text/input/q;", "eventCallback", "Z", "e", "()Z", "autoCorrect", "I", "batchDepth", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "g", "()Landroidx/compose/ui/text/input/TextFieldValue;", "j", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "mTextFieldValue", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "Ljava/util/List;", "editCommands", "isActive", "initState", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/q;Z)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c0 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q eventCallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoCorrect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int batchDepth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private TextFieldValue mTextFieldValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentExtractedTextRequestToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean extractedTextMonitorMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<g> editCommands;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isActive;

    public c0(@dl.d TextFieldValue initState, @dl.d q eventCallback, boolean z10) {
        kotlin.jvm.internal.f0.p(initState, "initState");
        kotlin.jvm.internal.f0.p(eventCallback, "eventCallback");
        this.eventCallback = eventCallback;
        this.autoCorrect = z10;
        this.mTextFieldValue = initState;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    private final void a(g gVar) {
        b();
        try {
            this.editCommands.add(gVar);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.batchDepth++;
        return true;
    }

    private final boolean c() {
        int i10 = this.batchDepth - 1;
        this.batchDepth = i10;
        if (i10 == 0 && (!this.editCommands.isEmpty())) {
            this.eventCallback.b(CollectionsKt___CollectionsKt.T5(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean d(yh.a<b2> aVar) {
        boolean z10 = this.isActive;
        if (z10) {
            aVar.invoke();
        }
        return z10;
    }

    private final void h(String str) {
    }

    private final void i(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.isActive;
        return z10 ? b() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.d(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@dl.e CompletionInfo text) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@dl.d InputContentInfo inputContentInfo, int flags, @dl.e Bundle opts) {
        kotlin.jvm.internal.f0.p(inputContentInfo, "inputContentInfo");
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@dl.e CorrectionInfo correctionInfo) {
        boolean z10 = this.isActive;
        return z10 ? this.autoCorrect : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@dl.e CharSequence text, int newCursorPosition) {
        boolean z10 = this.isActive;
        if (z10) {
            a(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final q getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new k());
        return true;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextFieldValue getMTextFieldValue() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.mTextFieldValue.i(), androidx.compose.ui.text.o0.l(this.mTextFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    @dl.d
    public ExtractedText getExtractedText(@dl.e ExtractedTextRequest request, int flags) {
        boolean z10 = (flags & 1) != 0;
        this.extractedTextMonitorMode = z10;
        if (z10) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return t.a(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @dl.e
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @dl.e
    public CharSequence getSelectedText(int flags) {
        if (androidx.compose.ui.text.o0.h(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return h0.a(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @dl.d
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return h0.b(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @dl.d
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return h0.c(this.mTextFieldValue, maxChars).toString();
    }

    public final void j(@dl.d TextFieldValue value) {
        kotlin.jvm.internal.f0.p(value, "value");
        this.mTextFieldValue = value;
    }

    public final void k(@dl.d TextFieldValue state, @dl.d s inputMethodManager, @dl.d View view) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(inputMethodManager, "inputMethodManager");
        kotlin.jvm.internal.f0.p(view, "view");
        if (this.isActive) {
            j(state);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.d(view, this.currentExtractedTextRequestToken, t.a(state));
            }
            androidx.compose.ui.text.o0 composition = state.getComposition();
            int iL = composition != null ? androidx.compose.ui.text.o0.l(composition.getPackedValue()) : -1;
            androidx.compose.ui.text.o0 composition2 = state.getComposition();
            inputMethodManager.c(view, androidx.compose.ui.text.o0.l(state.getSelection()), androidx.compose.ui.text.o0.k(state.getSelection()), iL, composition2 != null ? androidx.compose.ui.text.o0.k(composition2.getPackedValue()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id2) {
        boolean z10 = this.isActive;
        if (z10) {
            z10 = false;
            switch (id2) {
                case R.id.selectAll:
                    a(new SetSelectionCommand(0, this.mTextFieldValue.i().length()));
                    break;
                case R.id.cut:
                    i(bb.c.b.f30898r2);
                    break;
                case R.id.copy:
                    i(bb.c.b.f30920s2);
                    break;
                case R.id.paste:
                    i(bb.c.b.f30942t2);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iA;
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iA = o.INSTANCE.c();
                    break;
                case 3:
                    iA = o.INSTANCE.g();
                    break;
                case 4:
                    iA = o.INSTANCE.h();
                    break;
                case 5:
                    iA = o.INSTANCE.d();
                    break;
                case 6:
                    iA = o.INSTANCE.b();
                    break;
                case 7:
                    iA = o.INSTANCE.f();
                    break;
                default:
                    Log.w(d0.f16710b, "IME sends unsupported Editor Action: " + editorAction);
                    iA = o.INSTANCE.a();
                    break;
            }
        } else {
            iA = o.INSTANCE.a();
        }
        this.eventCallback.a(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@dl.e String action, @dl.e Bundle data) {
        boolean z10 = this.isActive;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        Log.w(d0.f16710b, "requestCursorUpdates is not supported");
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@dl.d KeyEvent event) {
        kotlin.jvm.internal.f0.p(event, "event");
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        this.eventCallback.c(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z10 = this.isActive;
        if (z10) {
            a(new SetComposingRegionCommand(start, end));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@dl.e CharSequence text, int newCursorPosition) {
        boolean z10 = this.isActive;
        if (z10) {
            a(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        a(new SetSelectionCommand(start, end));
        return true;
    }
}
