package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.a0;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.b0;
import com.google.android.material.internal.j0;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
/* JADX INFO: loaded from: classes7.dex */
public class n implements TimePickerView.f, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinearLayout f55827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeModel f55828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextWatcher f55829d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextWatcher f55830e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ChipTextInputComboView f55831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ChipTextInputComboView f55832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l f55833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EditText f55834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final EditText f55835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaterialButtonToggleGroup f55836k;

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class a extends b0 {
        a() {
        }

        @Override // com.google.android.material.internal.b0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    n.this.f55828c.n(0);
                } else {
                    n.this.f55828c.n(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class b extends b0 {
        b() {
        }

        @Override // com.google.android.material.internal.b0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    n.this.f55828c.k(0);
                } else {
                    n.this.f55828c.k(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n.this.c(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class d extends com.google.android.material.timepicker.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TimeModel f55840b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, TimeModel timeModel) {
            super(context, i10);
            this.f55840b = timeModel;
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(view.getResources().getString(this.f55840b.c(), String.valueOf(this.f55840b.d())));
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class e extends com.google.android.material.timepicker.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TimeModel f55842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i10, TimeModel timeModel) {
            super(context, i10);
            this.f55842b = timeModel;
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f55842b.f55759f)));
        }
    }

    public n(LinearLayout linearLayout, TimeModel timeModel) {
        this.f55827b = linearLayout;
        this.f55828c = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f55831f = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f55832g = chipTextInputComboView2;
        int i10 = R.id.material_label;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i10);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i10);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        int i11 = R.id.selection_type;
        chipTextInputComboView.setTag(i11, 12);
        chipTextInputComboView2.setTag(i11, 10);
        if (timeModel.f55757d == 0) {
            k();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(timeModel.f());
        chipTextInputComboView.c(timeModel.h());
        this.f55834i = chipTextInputComboView2.getTextInput().getEditText();
        this.f55835j = chipTextInputComboView.getTextInput().getEditText();
        this.f55833h = new l(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new d(linearLayout.getContext(), R.string.material_hour_selection, timeModel));
        chipTextInputComboView.setChipDelegate(new e(linearLayout.getContext(), R.string.material_minute_selection, timeModel));
        initialize();
    }

    private void d() {
        this.f55834i.addTextChangedListener(this.f55830e);
        this.f55835j.addTextChangedListener(this.f55829d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        if (z10) {
            this.f55828c.o(i10 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void g() {
        this.f55834i.removeTextChangedListener(this.f55830e);
        this.f55835j.removeTextChangedListener(this.f55829d);
    }

    private static void i(EditText editText, @androidx.annotation.l int i10) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable drawableB = b0.a.b(context, i11);
            drawableB.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{drawableB, drawableB});
        } catch (Throwable unused) {
        }
    }

    private void j(TimeModel timeModel) {
        g();
        Locale locale = this.f55827b.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.f55753i, Integer.valueOf(timeModel.f55759f));
        String str2 = String.format(locale, TimeModel.f55753i, Integer.valueOf(timeModel.d()));
        this.f55831f.setText(str);
        this.f55832g.setText(str2);
        d();
        l();
    }

    private void k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f55827b.findViewById(R.id.material_clock_period_toggle);
        this.f55836k = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.m
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i10, boolean z10) {
                this.f55826a.f(materialButtonToggleGroup2, i10, z10);
            }
        });
        this.f55836k.setVisibility(0);
        l();
    }

    private void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f55836k;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.e(this.f55828c.f55761h == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i10) {
        this.f55828c.f55760g = i10;
        this.f55831f.setChecked(i10 == 12);
        this.f55832g.setChecked(i10 == 10);
        l();
    }

    public void e() {
        this.f55831f.setChecked(false);
        this.f55832g.setChecked(false);
    }

    public void h() {
        this.f55831f.setChecked(this.f55828c.f55760g == 12);
        this.f55832g.setChecked(this.f55828c.f55760g == 10);
    }

    @Override // com.google.android.material.timepicker.k
    public void hide() {
        View focusedChild = this.f55827b.getFocusedChild();
        if (focusedChild != null) {
            j0.o(focusedChild);
        }
        this.f55827b.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.k
    public void initialize() {
        d();
        j(this.f55828c);
        this.f55833h.a();
    }

    @Override // com.google.android.material.timepicker.k
    public void invalidate() {
        j(this.f55828c);
    }

    @Override // com.google.android.material.timepicker.k
    public void show() {
        this.f55827b.setVisibility(0);
        c(this.f55828c.f55760g);
    }
}
