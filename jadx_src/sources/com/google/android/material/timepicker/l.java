package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: TimePickerTextInputKeyController.java */
/* JADX INFO: loaded from: classes7.dex */
public class l implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ChipTextInputComboView f55822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ChipTextInputComboView f55823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeModel f55824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55825e = false;

    l(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f55822b = chipTextInputComboView;
        this.f55823c = chipTextInputComboView2;
        this.f55824d = timeModel;
    }

    private void b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    private void c(int i10) {
        this.f55823c.setChecked(i10 == 12);
        this.f55822b.setChecked(i10 == 10);
        this.f55824d.f55760g = i10;
    }

    private boolean d(int i10, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i10 >= 7 && i10 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            c(12);
            return true;
        }
        b(editText);
        return false;
    }

    private boolean e(int i10, KeyEvent keyEvent, EditText editText) {
        if (i10 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            c(10);
            return true;
        }
        b(editText);
        return false;
    }

    public void a() {
        TextInputLayout textInput = this.f55822b.getTextInput();
        TextInputLayout textInput2 = this.f55823c.getTextInput();
        EditText editText = textInput.getEditText();
        EditText editText2 = textInput2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10 = i10 == 5;
        if (z10) {
            c(12);
        }
        return z10;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (this.f55825e) {
            return false;
        }
        this.f55825e = true;
        EditText editText = (EditText) view;
        boolean zE = this.f55824d.f55760g == 12 ? e(i10, keyEvent, editText) : d(i10, keyEvent, editText);
        this.f55825e = false;
        return zE;
    }
}
