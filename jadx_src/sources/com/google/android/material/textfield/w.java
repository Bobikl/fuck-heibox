package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;

/* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public class w extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private EditText f55709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f55710g;

    w(@n0 EndCompoundLayout endCompoundLayout, @androidx.annotation.v int i10) {
        super(endCompoundLayout);
        this.f55708e = R.drawable.design_password_eye;
        this.f55710g = new View.OnClickListener() { // from class: com.google.android.material.textfield.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f55707b.y(view);
            }
        };
        if (i10 != 0) {
            this.f55708e = i10;
        }
    }

    private boolean w() {
        EditText editText = this.f55709f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f55709f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (w()) {
            this.f55709f.setTransformationMethod(null);
        } else {
            this.f55709f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f55709f.setSelection(selectionEnd);
        }
        r();
    }

    @Override // com.google.android.material.textfield.r
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.r
    @d1
    int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.r
    @androidx.annotation.v
    int d() {
        return this.f55708e;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f55710g;
    }

    @Override // com.google.android.material.textfield.r
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.r
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.r
    void n(@p0 EditText editText) {
        this.f55709f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        if (x(this.f55709f)) {
            this.f55709f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.r
    void u() {
        EditText editText = this.f55709f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
