package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.b0;
import com.google.android.material.internal.j0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Chip f55711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextInputLayout f55712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EditText f55713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextWatcher f55714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f55715f;

    public class b extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f55716c = "00";

        private b() {
        }

        @Override // com.google.android.material.internal.b0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f55711b.setText(ChipTextInputComboView.this.d("00"));
                return;
            }
            String strD = ChipTextInputComboView.this.d(editable);
            Chip chip = ChipTextInputComboView.this.f55711b;
            if (TextUtils.isEmpty(strD)) {
                strD = ChipTextInputComboView.this.d("00");
            }
            chip.setText(strD);
        }
    }

    public ChipTextInputComboView(@n0 Context context) {
        this(context, null);
    }

    public ChipTextInputComboView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f55711b = chip;
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.f15475z);
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f55712c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f55713d = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f55714e = bVar;
        editText.addTextChangedListener(bVar);
        e();
        addView(chip);
        addView(textInputLayout);
        this.f55715f = (TextView) findViewById(R.id.material_label);
        editText.setId(j1.D());
        j1.U1(this.f55715f, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    private void e() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f55713d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f55713d.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f55713d.setFilters(inputFilterArr);
    }

    @androidx.annotation.j1
    CharSequence getChipText() {
        return this.f55711b.getText();
    }

    public TextInputLayout getTextInput() {
        return this.f55712c;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f55711b.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f55711b.setChecked(z10);
        this.f55713d.setVisibility(z10 ? 0 : 4);
        this.f55711b.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            j0.v(this.f55713d);
        }
    }

    public void setChipDelegate(androidx.core.view.a aVar) {
        j1.B1(this.f55711b, aVar);
    }

    public void setCursorVisible(boolean z10) {
        this.f55713d.setCursorVisible(z10);
    }

    public void setHelperText(CharSequence charSequence) {
        this.f55715f.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f55711b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f55711b.setTag(i10, obj);
    }

    public void setText(CharSequence charSequence) {
        String strD = d(charSequence);
        this.f55711b.setText(strD);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        this.f55713d.removeTextChangedListener(this.f55714e);
        this.f55713d.setText(strD);
        this.f55713d.addTextChangedListener(this.f55714e);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f55711b.toggle();
    }
}
