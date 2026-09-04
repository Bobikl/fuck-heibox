package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: MaterialDatePicker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j<S> extends androidx.fragment.app.j {
    private static final String B = "OVERRIDE_THEME_RES_ID";
    private static final String C = "DATE_SELECTOR_KEY";
    private static final String D = "CALENDAR_CONSTRAINTS_KEY";
    private static final String E = "DAY_VIEW_DECORATOR_KEY";
    private static final String F = "TITLE_TEXT_RES_ID_KEY";
    private static final String G = "TITLE_TEXT_KEY";
    private static final String H = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String I = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String J = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String K = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final String L = "INPUT_MODE_KEY";
    static final Object M = "CONFIRM_BUTTON_TAG";
    static final Object N = "CANCEL_BUTTON_TAG";
    static final Object O = "TOGGLE_BUTTON_TAG";
    public static final int P = 0;
    public static final int Q = 1;

    @p0
    private CharSequence A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<k<? super S>> f54094b = new LinkedHashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f54095c = new LinkedHashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f54096d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f54097e = new LinkedHashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e1
    private int f54098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private DateSelector<S> f54099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q<S> f54100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private CalendarConstraints f54101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private DayViewDecorator f54102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaterialCalendar<S> f54103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d1
    private int f54104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f54105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f54106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d1
    private int f54108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f54109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @d1
    private int f54110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f54111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f54112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f54113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CheckableImageButton f54114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.k f54115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Button f54116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f54117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private CharSequence f54118z;

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = j.this.f54094b.iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(j.this.h4());
            }
            j.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(@n0 View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(j.this.c4().q() + ", " + ((Object) a0Var.W()));
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = j.this.f54095c.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            j.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class d implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f54123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f54124d;

        d(int i10, View view, int i11) {
            this.f54122b = i10;
            this.f54123c = view;
            this.f54124d = i11;
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            int i10 = n3Var.f(n3.m.i()).f20743b;
            if (this.f54122b >= 0) {
                this.f54123c.getLayoutParams().height = this.f54122b + i10;
                View view2 = this.f54123c;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f54123c;
            view3.setPadding(view3.getPaddingLeft(), this.f54124d + i10, this.f54123c.getPaddingRight(), this.f54123c.getPaddingBottom());
            return n3Var;
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class e extends p<S> {
        e() {
        }

        @Override // com.google.android.material.datepicker.p
        public void a() {
            j.this.f54116x.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.p
        public void b(S s10) {
            j jVar = j.this;
            jVar.w4(jVar.f4());
            j.this.f54116x.setEnabled(j.this.c4().s0());
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.f54116x.setEnabled(j.this.c4().s0());
            j.this.f54114v.toggle();
            j jVar = j.this;
            jVar.y4(jVar.f54114v);
            j.this.t4();
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public static final class g<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DateSelector<S> f54128a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CalendarConstraints f54130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        DayViewDecorator f54131d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54129b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54132e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f54133f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f54134g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CharSequence f54135h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f54136i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        CharSequence f54137j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        S f54138k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f54139l = 0;

        private g(DateSelector<S> dateSelector) {
            this.f54128a = dateSelector;
        }

        private Month b() {
            if (!this.f54128a.u0().isEmpty()) {
                Month monthC = Month.c(this.f54128a.u0().iterator().next().longValue());
                if (f(monthC, this.f54130c)) {
                    return monthC;
                }
            }
            Month monthD = Month.d();
            return f(monthD, this.f54130c) ? monthD : this.f54130c.u();
        }

        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <S> g<S> c(@n0 DateSelector<S> dateSelector) {
            return new g<>(dateSelector);
        }

        @n0
        public static g<Long> d() {
            return new g<>(new SingleDateSelector());
        }

        @n0
        public static g<androidx.core.util.k<Long, Long>> e() {
            return new g<>(new RangeDateSelector());
        }

        private static boolean f(Month month, CalendarConstraints calendarConstraints) {
            return month.compareTo(calendarConstraints.u()) >= 0 && month.compareTo(calendarConstraints.k()) <= 0;
        }

        @n0
        public j<S> a() {
            if (this.f54130c == null) {
                this.f54130c = new CalendarConstraints.b().a();
            }
            if (this.f54132e == 0) {
                this.f54132e = this.f54128a.Q();
            }
            S s10 = this.f54138k;
            if (s10 != null) {
                this.f54128a.Z(s10);
            }
            if (this.f54130c.p() == null) {
                this.f54130c.z(b());
            }
            return j.n4(this);
        }

        @s9.a
        @n0
        public g<S> g(CalendarConstraints calendarConstraints) {
            this.f54130c = calendarConstraints;
            return this;
        }

        @s9.a
        @n0
        public g<S> h(@p0 DayViewDecorator dayViewDecorator) {
            this.f54131d = dayViewDecorator;
            return this;
        }

        @s9.a
        @n0
        public g<S> i(int i10) {
            this.f54139l = i10;
            return this;
        }

        @s9.a
        @n0
        public g<S> j(@d1 int i10) {
            this.f54136i = i10;
            this.f54137j = null;
            return this;
        }

        @s9.a
        @n0
        public g<S> k(@p0 CharSequence charSequence) {
            this.f54137j = charSequence;
            this.f54136i = 0;
            return this;
        }

        @s9.a
        @n0
        public g<S> l(@d1 int i10) {
            this.f54134g = i10;
            this.f54135h = null;
            return this;
        }

        @s9.a
        @n0
        public g<S> m(@p0 CharSequence charSequence) {
            this.f54135h = charSequence;
            this.f54134g = 0;
            return this;
        }

        @s9.a
        @n0
        public g<S> n(S s10) {
            this.f54138k = s10;
            return this;
        }

        @s9.a
        @n0
        public g<S> o(@p0 SimpleDateFormat simpleDateFormat) {
            this.f54128a.q0(simpleDateFormat);
            return this;
        }

        @s9.a
        @n0
        public g<S> p(@e1 int i10) {
            this.f54129b = i10;
            return this;
        }

        @s9.a
        @n0
        public g<S> q(@d1 int i10) {
            this.f54132e = i10;
            this.f54133f = null;
            return this;
        }

        @s9.a
        @n0
        public g<S> r(@p0 CharSequence charSequence) {
            this.f54133f = charSequence;
            this.f54132e = 0;
            return this;
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface h {
    }

    @n0
    private static Drawable a4(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, b0.a.b(context, com.google.android.material.R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], b0.a.b(context, com.google.android.material.R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void b4(Window window) {
        if (this.f54117y) {
            return;
        }
        View viewFindViewById = requireView().findViewById(com.google.android.material.R.id.fullscreen_header);
        com.google.android.material.internal.e.b(window, true, j0.h(viewFindViewById), null);
        j1.a2(viewFindViewById, new d(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f54117y = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> c4() {
        if (this.f54099g == null) {
            this.f54099g = (DateSelector) getArguments().getParcelable(C);
        }
        return this.f54099g;
    }

    @p0
    private static CharSequence d4(@p0 CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String e4() {
        return c4().W0(requireContext());
    }

    private static int g4(@n0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_content_padding);
        int i10 = Month.d().f54035e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private int i4(Context context) {
        int i10 = this.f54098f;
        return i10 != 0 ? i10 : c4().S(context);
    }

    private void j4(Context context) {
        this.f54114v.setTag(O);
        this.f54114v.setImageDrawable(a4(context));
        this.f54114v.setChecked(this.f54107o != 0);
        j1.B1(this.f54114v, null);
        y4(this.f54114v);
        this.f54114v.setOnClickListener(new f());
    }

    static boolean k4(@n0 Context context) {
        return o4(context, R.attr.windowFullscreen);
    }

    private boolean l4() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean m4(@n0 Context context) {
        return o4(context, com.google.android.material.R.attr.nestedScrollable);
    }

    @n0
    static <S> j<S> n4(@n0 g<S> gVar) {
        j<S> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt(B, gVar.f54129b);
        bundle.putParcelable(C, gVar.f54128a);
        bundle.putParcelable(D, gVar.f54130c);
        bundle.putParcelable(E, gVar.f54131d);
        bundle.putInt(F, gVar.f54132e);
        bundle.putCharSequence(G, gVar.f54133f);
        bundle.putInt(L, gVar.f54139l);
        bundle.putInt(H, gVar.f54134g);
        bundle.putCharSequence(I, gVar.f54135h);
        bundle.putInt(J, gVar.f54136i);
        bundle.putCharSequence(K, gVar.f54137j);
        jVar.setArguments(bundle);
        return jVar;
    }

    static boolean o4(@n0 Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, com.google.android.material.R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4() {
        int iI4 = i4(requireContext());
        this.f54103k = MaterialCalendar.f4(c4(), iI4, this.f54101i, this.f54102j);
        boolean zIsChecked = this.f54114v.isChecked();
        this.f54100h = zIsChecked ? m.P3(c4(), iI4, this.f54101i) : this.f54103k;
        x4(zIsChecked);
        w4(f4());
        androidx.fragment.app.p0 p0VarU = getChildFragmentManager().u();
        p0VarU.y(com.google.android.material.R.id.mtrl_calendar_frame, this.f54100h);
        p0VarU.o();
        this.f54100h.L3(new e());
    }

    public static long u4() {
        return Month.d().f54037g;
    }

    public static long v4() {
        return s.t().getTimeInMillis();
    }

    private void x4(boolean z10) {
        this.f54112t.setText((z10 && l4()) ? this.A : this.f54118z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4(@n0 CheckableImageButton checkableImageButton) {
        this.f54114v.setContentDescription(this.f54114v.isChecked() ? checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public boolean S3(DialogInterface.OnCancelListener onCancelListener) {
        return this.f54096d.add(onCancelListener);
    }

    public boolean T3(DialogInterface.OnDismissListener onDismissListener) {
        return this.f54097e.add(onDismissListener);
    }

    public boolean U3(View.OnClickListener onClickListener) {
        return this.f54095c.add(onClickListener);
    }

    public boolean V3(k<? super S> kVar) {
        return this.f54094b.add(kVar);
    }

    public void W3() {
        this.f54096d.clear();
    }

    public void X3() {
        this.f54097e.clear();
    }

    public void Y3() {
        this.f54095c.clear();
    }

    public void Z3() {
        this.f54094b.clear();
    }

    public String f4() {
        return c4().q1(getContext());
    }

    @p0
    public final S h4() {
        return c4().t();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@n0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f54096d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public final void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f54098f = bundle.getInt(B);
        this.f54099g = (DateSelector) bundle.getParcelable(C);
        this.f54101i = (CalendarConstraints) bundle.getParcelable(D);
        this.f54102j = (DayViewDecorator) bundle.getParcelable(E);
        this.f54104l = bundle.getInt(F);
        this.f54105m = bundle.getCharSequence(G);
        this.f54107o = bundle.getInt(L);
        this.f54108p = bundle.getInt(H);
        this.f54109q = bundle.getCharSequence(I);
        this.f54110r = bundle.getInt(J);
        this.f54111s = bundle.getCharSequence(K);
        CharSequence text = this.f54105m;
        if (text == null) {
            text = requireContext().getResources().getText(this.f54104l);
        }
        this.f54118z = text;
        this.A = d4(text);
    }

    @Override // androidx.fragment.app.j
    @n0
    public final Dialog onCreateDialog(@p0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), i4(requireContext()));
        Context context = dialog.getContext();
        this.f54106n = k4(context);
        int iG = com.google.android.material.resources.b.g(context, com.google.android.material.R.attr.colorSurface, j.class.getCanonicalName());
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context, null, com.google.android.material.R.attr.materialCalendarStyle, com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f54115w = kVar;
        kVar.Z(context);
        this.f54115w.o0(ColorStateList.valueOf(iG));
        this.f54115w.n0(j1.R(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @n0
    public final View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f54106n ? com.google.android.material.R.layout.mtrl_picker_fullscreen : com.google.android.material.R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f54102j;
        if (dayViewDecorator != null) {
            dayViewDecorator.j(context);
        }
        if (this.f54106n) {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(g4(context), -2));
        } else {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(g4(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_selection_text);
        this.f54113u = textView;
        j1.D1(textView, 1);
        this.f54114v = (CheckableImageButton) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_toggle);
        this.f54112t = (TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_title_text);
        j4(context);
        this.f54116x = (Button) viewInflate.findViewById(com.google.android.material.R.id.confirm_button);
        if (c4().s0()) {
            this.f54116x.setEnabled(true);
        } else {
            this.f54116x.setEnabled(false);
        }
        this.f54116x.setTag(M);
        CharSequence charSequence = this.f54109q;
        if (charSequence != null) {
            this.f54116x.setText(charSequence);
        } else {
            int i10 = this.f54108p;
            if (i10 != 0) {
                this.f54116x.setText(i10);
            }
        }
        this.f54116x.setOnClickListener(new a());
        j1.B1(this.f54116x, new b());
        Button button = (Button) viewInflate.findViewById(com.google.android.material.R.id.cancel_button);
        button.setTag(N);
        CharSequence charSequence2 = this.f54111s;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i11 = this.f54110r;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@n0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f54097e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(B, this.f54098f);
        bundle.putParcelable(C, this.f54099g);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f54101i);
        MaterialCalendar<S> materialCalendar = this.f54103k;
        Month monthA4 = materialCalendar == null ? null : materialCalendar.a4();
        if (monthA4 != null) {
            bVar.d(monthA4.f54037g);
        }
        bundle.putParcelable(D, bVar.a());
        bundle.putParcelable(E, this.f54102j);
        bundle.putInt(F, this.f54104l);
        bundle.putCharSequence(G, this.f54105m);
        bundle.putInt(H, this.f54108p);
        bundle.putCharSequence(I, this.f54109q);
        bundle.putInt(J, this.f54110r);
        bundle.putCharSequence(K, this.f54111s);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f54106n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f54115w);
            b4(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f54115w, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new d9.a(requireDialog(), rect));
        }
        t4();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStop() {
        this.f54100h.M3();
        super.onStop();
    }

    public boolean p4(DialogInterface.OnCancelListener onCancelListener) {
        return this.f54096d.remove(onCancelListener);
    }

    public boolean q4(DialogInterface.OnDismissListener onDismissListener) {
        return this.f54097e.remove(onDismissListener);
    }

    public boolean r4(View.OnClickListener onClickListener) {
        return this.f54095c.remove(onClickListener);
    }

    public boolean s4(k<? super S> kVar) {
        return this.f54094b.remove(kVar);
    }

    @androidx.annotation.j1
    void w4(String str) {
        this.f54113u.setContentDescription(e4());
        this.f54113u.setText(str);
    }
}
