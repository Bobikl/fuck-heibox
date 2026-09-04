package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.k;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialComponentsViewInflater extends k {
    @Override // androidx.appcompat.app.k
    @n0
    protected AppCompatAutoCompleteTextView c(@n0 Context context, @p0 AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @n0
    protected AppCompatButton d(@n0 Context context, @n0 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @n0
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @n0
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @n0
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
