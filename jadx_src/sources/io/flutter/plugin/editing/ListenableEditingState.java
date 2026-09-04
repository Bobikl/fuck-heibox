package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ListenableEditingState extends SpannableStringBuilder {
    private static final String TAG = "ListenableEditingState";
    private int mComposingEndWhenBeginBatchEdit;
    private int mComposingStartWhenBeginBatchEdit;
    private BaseInputConnection mDummyConnection;
    private int mSelectionEndWhenBeginBatchEdit;
    private int mSelectionStartWhenBeginBatchEdit;
    private String mTextWhenBeginBatchEdit;
    private String mToStringCache;
    private int mBatchEditNestDepth = 0;
    private int mChangeNotificationDepth = 0;
    private ArrayList<EditingStateWatcher> mListeners = new ArrayList<>();
    private ArrayList<EditingStateWatcher> mPendingListeners = new ArrayList<>();
    private ArrayList<TextEditingDelta> mBatchTextEditingDeltas = new ArrayList<>();

    public interface EditingStateWatcher {
        void didChangeEditingState(boolean z10, boolean z11, boolean z12);
    }

    public ListenableEditingState(@p0 TextInputChannel.TextEditState textEditState, @n0 View view) {
        this.mDummyConnection = new BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
            @Override // android.view.inputmethod.BaseInputConnection
            public Editable getEditable() {
                return this;
            }
        };
        if (textEditState != null) {
            setEditingState(textEditState);
        }
    }

    private void notifyListener(EditingStateWatcher editingStateWatcher, boolean z10, boolean z11, boolean z12) {
        this.mChangeNotificationDepth++;
        editingStateWatcher.didChangeEditingState(z10, z11, z12);
        this.mChangeNotificationDepth--;
    }

    private void notifyListenersIfNeeded(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            Iterator<EditingStateWatcher> it = this.mListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), z10, z11, z12);
            }
        }
    }

    public void addEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "adding a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        if (this.mBatchEditNestDepth <= 0) {
            this.mListeners.add(editingStateWatcher);
        } else {
            Log.w(TAG, "a listener was added to EditingState while a batch edit was in progress");
            this.mPendingListeners.add(editingStateWatcher);
        }
    }

    public void beginBatchEdit() {
        this.mBatchEditNestDepth++;
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        if (this.mBatchEditNestDepth != 1 || this.mListeners.isEmpty()) {
            return;
        }
        this.mTextWhenBeginBatchEdit = toString();
        this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
        this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
        this.mComposingStartWhenBeginBatchEdit = getComposingStart();
        this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
    }

    public void clearBatchDeltas() {
        this.mBatchTextEditingDeltas.clear();
    }

    public void endBatchEdit() {
        int i10 = this.mBatchEditNestDepth;
        if (i10 == 0) {
            Log.e(TAG, "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i10 == 1) {
            Iterator<EditingStateWatcher> it = this.mPendingListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), true, true, true);
            }
            if (!this.mListeners.isEmpty()) {
                Log.v(TAG, "didFinishBatchEdit with " + String.valueOf(this.mListeners.size()) + " listener(s)");
                notifyListenersIfNeeded(!toString().equals(this.mTextWhenBeginBatchEdit), (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true, (this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd()) ? false : true);
            }
        }
        this.mListeners.addAll(this.mPendingListeners);
        this.mPendingListeners.clear();
        this.mBatchEditNestDepth--;
    }

    public ArrayList<TextEditingDelta> extractBatchTextEditingDeltas() {
        ArrayList<TextEditingDelta> arrayList = new ArrayList<>(this.mBatchTextEditingDeltas);
        this.mBatchTextEditingDeltas.clear();
        return arrayList;
    }

    public final int getComposingEnd() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int getComposingStart() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int getSelectionEnd() {
        return Selection.getSelectionEnd(this);
    }

    public final int getSelectionStart() {
        return Selection.getSelectionStart(this);
    }

    public void removeEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "removing a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        this.mListeners.remove(editingStateWatcher);
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.remove(editingStateWatcher);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i14 = i11 - i10;
        boolean z10 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z10; i15++) {
            z10 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        if (z10) {
            this.mToStringCache = null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i10, i11, charSequence, i12, i13);
        boolean z11 = z10;
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(string, i10, i11, charSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
        if (this.mBatchEditNestDepth > 0) {
            return spannableStringBuilderReplace;
        }
        notifyListenersIfNeeded(z11, (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true, (getComposingStart() == composingStart && getComposingEnd() == composingEnd) ? false : true);
        return spannableStringBuilderReplace;
    }

    public void setComposingRange(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.mDummyConnection.setComposingRegion(i10, i11);
        }
    }

    public void setEditingState(TextInputChannel.TextEditState textEditState) {
        beginBatchEdit();
        replace(0, length(), (CharSequence) textEditState.text);
        if (textEditState.hasSelection()) {
            Selection.setSelection(this, textEditState.selectionStart, textEditState.selectionEnd);
        } else {
            Selection.removeSelection(this);
        }
        setComposingRange(textEditState.composingStart, textEditState.composingEnd);
        clearBatchDeltas();
        endBatchEdit();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(toString(), getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.mToStringCache;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.mToStringCache = string;
        return string;
    }
}
