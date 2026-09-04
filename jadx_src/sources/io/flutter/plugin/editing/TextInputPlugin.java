package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.inputmethod.e;
import io.flutter.Log;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";

    @n0
    private final AutofillManager afm;

    @p0
    private SparseArray<TextInputChannel.Configuration> autofillConfiguration;

    @p0
    private TextInputChannel.Configuration configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;

    @n0
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;

    @p0
    private Rect lastClientRect;

    @p0
    private InputConnection lastInputConnection;

    @n0
    private ListenableEditingState mEditable;

    @n0
    private final InputMethodManager mImm;
    private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;

    @n0
    private final View mView;

    @n0
    private PlatformViewsController platformViewsController;

    @n0
    private final TextInputChannel textInputChannel;

    public static class InputTarget {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        int f119456id;

        @n0
        Type type;

        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(@n0 Type type, int i10) {
            this.type = type;
            this.f119456id = i10;
        }
    }

    public interface MinMax {
        void inspect(double d10, double d11);
    }

    @SuppressLint({"NewApi"})
    public TextInputPlugin(@n0 View view, @n0 TextInputChannel textInputChannel, @n0 PlatformViewsController platformViewsController) {
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.afm = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        } else {
            this.afm = null;
        }
        if (i10 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.textInputChannel = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void finishAutofillContext(boolean z10) {
                if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z10) {
                    TextInputPlugin.this.afm.commit();
                } else {
                    TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setClient(int i11, TextInputChannel.Configuration configuration) {
                TextInputPlugin.this.setTextInputClient(i11, configuration);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditableSizeAndTransform(double d10, double d11, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d10, d11, dArr);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setPlatformViewClient(int i11, boolean z10) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i11, z10);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        });
        textInputChannel.requestExistingInputState();
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
    }

    private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
        int i10 = textEditState.composingEnd - textEditState.composingStart;
        if (i10 != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (textEditState.text.charAt(textEditState.composingStart + i11) != textEditState2.text.charAt(textEditState2.composingStart + i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean z10, boolean z11, boolean z12, boolean z13, TextInputChannel.TextCapitalization textCapitalization) {
        TextInputChannel.TextInputType textInputType = inputType.type;
        if (textInputType == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputChannel.TextInputType.NUMBER) {
            int i10 = inputType.isSigned ? 4098 : 2;
            return inputType.isDecimal ? i10 | 8192 : i10;
        }
        if (textInputType == TextInputChannel.TextInputType.PHONE) {
            return 3;
        }
        if (textInputType == TextInputChannel.TextInputType.NONE) {
            return 0;
        }
        int i11 = 1;
        if (textInputType == TextInputChannel.TextInputType.MULTILINE) {
            i11 = 131073;
        } else if (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS) {
            i11 = 33;
        } else if (textInputType == TextInputChannel.TextInputType.URL) {
            i11 = 17;
        } else if (textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
            i11 = 145;
        } else if (textInputType == TextInputChannel.TextInputType.NAME) {
            i11 = 97;
        } else if (textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS) {
            i11 = 113;
        }
        if (z10) {
            i11 = i11 | 524288 | 128;
        } else {
            if (z11) {
                i11 |= 32768;
            }
            if (!z12) {
                i11 = i11 | 524288 | 144;
            }
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
            return i11 | 4096;
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
            return i11 | 8192;
        }
        return textCapitalization == TextInputChannel.TextCapitalization.SENTENCES ? i11 | 16384 : i11;
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyValueChanged(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        TextInputChannel.Configuration configuration;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d10, double d11, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z10 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d12 = dArr[12];
        double d13 = dArr[15];
        double d14 = d12 / d13;
        dArr2[1] = d14;
        dArr2[0] = d14;
        double d15 = dArr[13] / d13;
        dArr2[3] = d15;
        dArr2[2] = d15;
        MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d16, double d17) {
                double d18 = 1.0d;
                if (!z10) {
                    double[] dArr3 = dArr;
                    d18 = 1.0d / (((dArr3[3] * d16) + (dArr3[7] * d17)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d19 = ((dArr4[0] * d16) + (dArr4[4] * d17) + dArr4[12]) * d18;
                double d20 = ((dArr4[1] * d16) + (dArr4[5] * d17) + dArr4[13]) * d18;
                double[] dArr5 = dArr2;
                if (d19 < dArr5[0]) {
                    dArr5[0] = d19;
                } else if (d19 > dArr5[1]) {
                    dArr5[1] = d19;
                }
                if (d20 < dArr5[2]) {
                    dArr5[2] = d20;
                } else if (d20 > dArr5[3]) {
                    dArr5[3] = d20;
                }
            }
        };
        minMax.inspect(d10, 0.0d);
        minMax.inspect(d10, d11);
        minMax.inspect(0.0d, d11);
        Float fValueOf = Float.valueOf(this.mView.getContext().getResources().getDisplayMetrics().density);
        this.lastClientRect = new Rect((int) (dArr2[0] * ((double) fValueOf.floatValue())), (int) (dArr2[2] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[1] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[3] * ((double) fValueOf.floatValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i10, boolean z10) {
        if (!z10) {
            this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.autofillConfiguration = null;
            return;
        }
        TextInputChannel.Configuration[] configurationArr = configuration.fields;
        SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (TextInputChannel.Configuration configuration2 : configurationArr) {
            TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                this.afm.notifyValueChanged(this.mView, autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(autofill.editState.text));
            }
        }
    }

    public void autofill(@n0 SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration configuration;
        TextInputChannel.Configuration.Autofill autofill;
        TextInputChannel.Configuration.Autofill autofill2;
        if (Build.VERSION.SDK_INT < 26 || (configuration = this.configuration) == null || this.autofillConfiguration == null || (autofill = configuration.autofill) == null) {
            return;
        }
        HashMap<String, TextInputChannel.TextEditState> map = new HashMap<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i10));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                String string = sparseArray.valueAt(i10).getTextValue().toString();
                TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(string, string.length(), string.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    this.mEditable.setEditingState(textEditState);
                } else {
                    map.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        this.textInputChannel.updateEditingStateWithTag(this.inputTarget.f119456id, map);
    }

    public void clearPlatformViewClient(int i10) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f119456id == i10) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    @j1
    void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mImm.restartInput(this.mView);
    }

    @p0
    public InputConnection createInputConnection(@n0 View view, @n0 KeyboardManager keyboardManager, @n0 EditorInfo editorInfo) {
        int iIntValue;
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.f119456id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        TextInputChannel.Configuration configuration = this.configuration;
        int iInputTypeFromTextInputType = inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.enableIMEPersonalizedLearning, configuration.textCapitalization);
        editorInfo.inputType = iInputTypeFromTextInputType;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.configuration.inputAction;
        if (num == null) {
            iIntValue = (iInputTypeFromTextInputType & 131072) != 0 ? 1 : 6;
        } else {
            iIntValue = num.intValue();
        }
        TextInputChannel.Configuration configuration2 = this.configuration;
        String str = configuration2.actionLabel;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = configuration2.contentCommitMimeTypes;
        if (strArr != null) {
            e.h(editorInfo, strArr);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.f119456id, this.textInputChannel, keyboardManager, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    @SuppressLint({"NewApi"})
    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler(null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    public void didChangeEditingState(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        if (z10) {
            notifyValueChanged(this.mEditable.toString());
        }
        int selectionStart = this.mEditable.getSelectionStart();
        int selectionEnd = this.mEditable.getSelectionEnd();
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        ArrayList<TextEditingDelta> arrayListExtractBatchTextEditingDeltas = this.mEditable.extractBatchTextEditingDeltas();
        if (this.mLastKnownFrameworkTextEditingState == null) {
            z13 = true;
        } else {
            if (this.mEditable.toString().equals(this.mLastKnownFrameworkTextEditingState.text)) {
                TextInputChannel.TextEditState textEditState = this.mLastKnownFrameworkTextEditingState;
                if (selectionStart == textEditState.selectionStart && selectionEnd == textEditState.selectionEnd && composingStart == textEditState.composingStart && composingEnd == textEditState.composingEnd) {
                    z13 = true;
                }
            }
            z13 = false;
        }
        if (z13) {
            this.mEditable.clearBatchDeltas();
            return;
        }
        Log.v(TAG, "send EditingState to flutter: " + this.mEditable.toString());
        if (this.configuration.enableDeltaModel) {
            this.textInputChannel.updateEditingStateWithDeltas(this.inputTarget.f119456id, arrayListExtractBatchTextEditingDeltas);
            this.mEditable.clearBatchDeltas();
        } else {
            this.textInputChannel.updateEditingState(this.inputTarget.f119456id, this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
        }
        this.mLastKnownFrameworkTextEditingState = new TextInputChannel.TextEditState(this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
    }

    @j1
    Editable getEditable() {
        return this.mEditable;
    }

    @j1
    ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    @n0
    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    @p0
    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(@n0 KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(@n0 ViewStructure viewStructure, int i10) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i11 = 0; i11 < this.autofillConfiguration.size(); i11++) {
            int iKeyAt = this.autofillConfiguration.keyAt(i11);
            TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i11).autofill;
            if (autofill != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = autofill.hints;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = autofill.hintText;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = this.lastClientRect) == null) {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(autofill.editState.text));
                } else {
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(@n0 String str, @n0 Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    @j1
    void setTextInputClient(int i10, TextInputChannel.Configuration configuration) {
        notifyViewExited();
        this.configuration = configuration;
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i10);
        this.mEditable.removeEditingStateListener(this);
        TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        this.mEditable = new ListenableEditingState(autofill != null ? autofill.editState : null, this.mView);
        updateAutofillConfigurationIfNeeded(configuration);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    @j1
    void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean zComposingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = zComposingChanged;
            if (zComposingChanged) {
                Log.i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    @j1
    void showTextInput(View view) {
        TextInputChannel.InputType inputType;
        TextInputChannel.Configuration configuration = this.configuration;
        if (configuration != null && (inputType = configuration.inputType) != null && inputType.type == TextInputChannel.TextInputType.NONE) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }
}
