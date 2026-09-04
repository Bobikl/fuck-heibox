package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: MaterialTimePicker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends androidx.fragment.app.j implements TimePickerView.d {
    static final String A = "TIME_PICKER_INPUT_MODE";
    static final String B = "TIME_PICKER_TITLE_RES";
    static final String C = "TIME_PICKER_TITLE_TEXT";
    static final String D = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String E = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String F = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String G = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String H = "TIME_PICKER_OVERRIDE_THEME_RES_ID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f55769x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f55770y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final String f55771z = "TIME_PICKER_TIME_MODEL";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TimePickerView f55776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewStub f55777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private i f55778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private n f55779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private k f55780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @v
    private int f55781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @v
    private int f55782l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f55784n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f55786p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f55788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MaterialButton f55789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Button f55790t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TimeModel f55792v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<View.OnClickListener> f55772b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<View.OnClickListener> f55773c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<DialogInterface.OnCancelListener> f55774d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<DialogInterface.OnDismissListener> f55775e = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d1
    private int f55783m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d1
    private int f55785o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @d1
    private int f55787q = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f55791u = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f55793w = 0;

    /* JADX INFO: compiled from: MaterialTimePicker.java */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = e.this.f55772b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            e.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MaterialTimePicker.java */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = e.this.f55773c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            e.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MaterialTimePicker.java */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            eVar.f55791u = eVar.f55791u == 0 ? 1 : 0;
            e eVar2 = e.this;
            eVar2.t4(eVar2.f55789s);
        }
    }

    /* JADX INFO: compiled from: MaterialTimePicker.java */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private Integer f55798b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f55800d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CharSequence f55802f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f55804h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TimeModel f55797a = new TimeModel();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d1
        private int f55799c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @d1
        private int f55801e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @d1
        private int f55803g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f55805i = 0;

        @n0
        public e j() {
            return e.j4(this);
        }

        @s9.a
        @n0
        public d k(@f0(from = 0, to = 23) int i10) {
            this.f55797a.l(i10);
            return this;
        }

        @s9.a
        @n0
        public d l(int i10) {
            this.f55798b = Integer.valueOf(i10);
            return this;
        }

        @s9.a
        @n0
        public d m(@f0(from = 0, to = 59) int i10) {
            this.f55797a.n(i10);
            return this;
        }

        @s9.a
        @n0
        public d n(@d1 int i10) {
            this.f55803g = i10;
            return this;
        }

        @s9.a
        @n0
        public d o(@p0 CharSequence charSequence) {
            this.f55804h = charSequence;
            return this;
        }

        @s9.a
        @n0
        public d p(@d1 int i10) {
            this.f55801e = i10;
            return this;
        }

        @s9.a
        @n0
        public d q(@p0 CharSequence charSequence) {
            this.f55802f = charSequence;
            return this;
        }

        @s9.a
        @n0
        public d r(@e1 int i10) {
            this.f55805i = i10;
            return this;
        }

        @s9.a
        @n0
        public d s(int i10) {
            TimeModel timeModel = this.f55797a;
            int i11 = timeModel.f55758e;
            int i12 = timeModel.f55759f;
            TimeModel timeModel2 = new TimeModel(i10);
            this.f55797a = timeModel2;
            timeModel2.n(i12);
            this.f55797a.l(i11);
            return this;
        }

        @s9.a
        @n0
        public d t(@d1 int i10) {
            this.f55799c = i10;
            return this;
        }

        @s9.a
        @n0
        public d u(@p0 CharSequence charSequence) {
            this.f55800d = charSequence;
            return this;
        }
    }

    private Pair<Integer, Integer> b4(int i10) {
        if (i10 == 0) {
            return new Pair<>(Integer.valueOf(this.f55781k), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        }
        if (i10 == 1) {
            return new Pair<>(Integer.valueOf(this.f55782l), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i10);
    }

    private int f4() {
        int i10 = this.f55793w;
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValueA = com.google.android.material.resources.b.a(requireContext(), R.attr.materialTimePickerTheme);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private k h4(int i10, @n0 TimePickerView timePickerView, @n0 ViewStub viewStub) {
        if (i10 != 0) {
            if (this.f55779i == null) {
                this.f55779i = new n((LinearLayout) viewStub.inflate(), this.f55792v);
            }
            this.f55779i.e();
            return this.f55779i;
        }
        i iVar = this.f55778h;
        if (iVar == null) {
            iVar = new i(timePickerView, this.f55792v);
        }
        this.f55778h = iVar;
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i4() {
        k kVar = this.f55780j;
        if (kVar instanceof n) {
            ((n) kVar).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public static e j4(@n0 d dVar) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f55771z, dVar.f55797a);
        if (dVar.f55798b != null) {
            bundle.putInt(A, dVar.f55798b.intValue());
        }
        bundle.putInt(B, dVar.f55799c);
        if (dVar.f55800d != null) {
            bundle.putCharSequence(C, dVar.f55800d);
        }
        bundle.putInt(D, dVar.f55801e);
        if (dVar.f55802f != null) {
            bundle.putCharSequence(E, dVar.f55802f);
        }
        bundle.putInt(F, dVar.f55803g);
        if (dVar.f55804h != null) {
            bundle.putCharSequence(G, dVar.f55804h);
        }
        bundle.putInt(H, dVar.f55805i);
        eVar.setArguments(bundle);
        return eVar;
    }

    private void o4(@p0 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(f55771z);
        this.f55792v = timeModel;
        if (timeModel == null) {
            this.f55792v = new TimeModel();
        }
        this.f55791u = bundle.getInt(A, this.f55792v.f55757d != 1 ? 0 : 1);
        this.f55783m = bundle.getInt(B, 0);
        this.f55784n = bundle.getCharSequence(C);
        this.f55785o = bundle.getInt(D, 0);
        this.f55786p = bundle.getCharSequence(E);
        this.f55787q = bundle.getInt(F, 0);
        this.f55788r = bundle.getCharSequence(G);
        this.f55793w = bundle.getInt(H, 0);
    }

    private void s4() {
        Button button = this.f55790t;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4(MaterialButton materialButton) {
        if (materialButton == null || this.f55776f == null || this.f55777g == null) {
            return;
        }
        k kVar = this.f55780j;
        if (kVar != null) {
            kVar.hide();
        }
        k kVarH4 = h4(this.f55791u, this.f55776f, this.f55777g);
        this.f55780j = kVarH4;
        kVarH4.show();
        this.f55780j.invalidate();
        Pair<Integer, Integer> pairB4 = b4(this.f55791u);
        materialButton.setIconResource(((Integer) pairB4.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairB4.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    public boolean T3(@n0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f55774d.add(onCancelListener);
    }

    public boolean U3(@n0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f55775e.add(onDismissListener);
    }

    public boolean V3(@n0 View.OnClickListener onClickListener) {
        return this.f55773c.add(onClickListener);
    }

    public boolean W3(@n0 View.OnClickListener onClickListener) {
        return this.f55772b.add(onClickListener);
    }

    public void X3() {
        this.f55774d.clear();
    }

    public void Y3() {
        this.f55775e.clear();
    }

    public void Z3() {
        this.f55773c.clear();
    }

    public void a4() {
        this.f55772b.clear();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b0() {
        this.f55791u = 1;
        t4(this.f55789s);
        this.f55779i.h();
    }

    @f0(from = 0, to = 23)
    public int c4() {
        return this.f55792v.f55758e % 24;
    }

    public int d4() {
        return this.f55791u;
    }

    @f0(from = 0, to = 59)
    public int e4() {
        return this.f55792v.f55759f;
    }

    @p0
    i g4() {
        return this.f55778h;
    }

    public boolean k4(@n0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f55774d.remove(onCancelListener);
    }

    public boolean l4(@n0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f55775e.remove(onDismissListener);
    }

    public boolean m4(@n0 View.OnClickListener onClickListener) {
        return this.f55773c.remove(onClickListener);
    }

    public boolean n4(@n0 View.OnClickListener onClickListener) {
        return this.f55772b.remove(onClickListener);
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@n0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f55774d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        o4(bundle);
    }

    @Override // androidx.fragment.app.j
    @n0
    public final Dialog onCreateDialog(@p0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), f4());
        Context context = dialog.getContext();
        int iG = com.google.android.material.resources.b.g(context, R.attr.colorSurface, e.class.getCanonicalName());
        int i10 = R.attr.materialTimePickerStyle;
        int i11 = R.style.Widget_MaterialComponents_TimePicker;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.I0, i10, i11);
        this.f55782l = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f55781k = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        typedArrayObtainStyledAttributes.recycle();
        kVar.Z(context);
        kVar.o0(ColorStateList.valueOf(iG));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(kVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        kVar.n0(j1.R(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @n0
    public final View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f55776f = timePickerView;
        timePickerView.setOnDoubleTapListener(this);
        this.f55777g = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f55789s = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i10 = this.f55783m;
        if (i10 != 0) {
            textView.setText(i10);
        } else if (!TextUtils.isEmpty(this.f55784n)) {
            textView.setText(this.f55784n);
        }
        t4(this.f55789s);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new a());
        int i11 = this.f55785o;
        if (i11 != 0) {
            button.setText(i11);
        } else if (!TextUtils.isEmpty(this.f55786p)) {
            button.setText(this.f55786p);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f55790t = button2;
        button2.setOnClickListener(new b());
        int i12 = this.f55787q;
        if (i12 != 0) {
            this.f55790t.setText(i12);
        } else if (!TextUtils.isEmpty(this.f55788r)) {
            this.f55790t.setText(this.f55788r);
        }
        s4();
        this.f55789s.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f55780j = null;
        this.f55778h = null;
        this.f55779i = null;
        TimePickerView timePickerView = this.f55776f;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.f55776f = null;
        }
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@n0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f55775e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f55771z, this.f55792v);
        bundle.putInt(A, this.f55791u);
        bundle.putInt(B, this.f55783m);
        bundle.putCharSequence(C, this.f55784n);
        bundle.putInt(D, this.f55785o);
        bundle.putCharSequence(E, this.f55786p);
        bundle.putInt(F, this.f55787q);
        bundle.putCharSequence(G, this.f55788r);
        bundle.putInt(H, this.f55793w);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f55780j instanceof n) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55768b.i4();
                }
            }, 100L);
        }
    }

    @androidx.annotation.j1
    void p4(@p0 k kVar) {
        this.f55780j = kVar;
    }

    public void q4(@f0(from = 0, to = 23) int i10) {
        this.f55792v.k(i10);
        k kVar = this.f55780j;
        if (kVar != null) {
            kVar.invalidate();
        }
    }

    public void r4(@f0(from = 0, to = 59) int i10) {
        this.f55792v.n(i10);
        k kVar = this.f55780j;
        if (kVar != null) {
            kVar.invalidate();
        }
    }

    @Override // androidx.fragment.app.j
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        s4();
    }
}
