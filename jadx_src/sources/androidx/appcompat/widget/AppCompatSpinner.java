package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements androidx.core.view.g1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.f1
    @SuppressLint({"ResourceType"})
    private static final int[] f2430j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f2431k = 15;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f2432l = "AppCompatSpinner";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f2433m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f2434n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f2435o = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.widget.c f2436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f2438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SpinnerAdapter f2439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f2441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f2442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Rect f2443i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2444b;

        public class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2444b = parcel.readByte() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f2444b ? (byte) 1 : (byte) 0);
        }
    }

    public class a extends f0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ h f2445k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f2445k = hVar;
        }

        @Override // androidx.appcompat.widget.f0
        public androidx.appcompat.view.menu.p b() {
            return this.f2445k;
        }

        @Override // androidx.appcompat.widget.f0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().b()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    @androidx.annotation.w0(16)
    public static final class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 ViewTreeObserver viewTreeObserver, @androidx.annotation.p0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @androidx.annotation.w0(17)
    public static final class d {
        private d() {
        }

        @androidx.annotation.u
        static int a(@androidx.annotation.n0 View view) {
            return view.getTextAlignment();
        }

        @androidx.annotation.u
        static int b(@androidx.annotation.n0 View view) {
            return view.getTextDirection();
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.n0 View view, int i10) {
            view.setTextAlignment(i10);
        }

        @androidx.annotation.u
        static void d(@androidx.annotation.n0 View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    @androidx.annotation.w0(23)
    public static final class e {
        private e() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 ThemedSpinnerAdapter themedSpinnerAdapter, @androidx.annotation.p0 Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @j1
    public class f implements i, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @j1
        androidx.appcompat.app.c f2448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListAdapter f2449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f2450d;

        f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void a(Drawable drawable) {
            Log.e(AppCompatSpinner.f2432l, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public boolean b() {
            androidx.appcompat.app.c cVar = this.f2448b;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public Drawable d() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f2448b;
            if (cVar != null) {
                cVar.dismiss();
                this.f2448b = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void e(int i10) {
            Log.e(AppCompatSpinner.f2432l, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void f(int i10) {
            Log.e(AppCompatSpinner.f2432l, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void g(int i10, int i11) {
            if (this.f2449c == null) {
                return;
            }
            androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f2450d;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c cVarCreate = aVar.D(this.f2449c, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f2448b = cVarCreate;
            ListView listViewL = cVarCreate.l();
            d.d(listViewL, i10);
            d.c(listViewL, i11);
            this.f2448b.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void l(int i10) {
            Log.e(AppCompatSpinner.f2432l, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence m() {
            return this.f2450d;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void n(CharSequence charSequence) {
            this.f2450d = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f2449c.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void p(ListAdapter listAdapter) {
            this.f2449c = listAdapter;
        }
    }

    public static class g implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SpinnerAdapter f2452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListAdapter f2453c;

        public g(@androidx.annotation.p0 SpinnerAdapter spinnerAdapter, @androidx.annotation.p0 Resources.Theme theme) {
            this.f2452b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2453c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof t0) {
                    t0 t0Var = (t0) spinnerAdapter;
                    if (t0Var.getDropDownViewTheme() == null) {
                        t0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2453c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2452b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2452b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2452b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2452b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2452b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f2453c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2452b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2452b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @j1
    public class h extends ListPopupWindow implements i {
        private CharSequence U;
        ListAdapter V;
        private final Rect W;
        private int X;

        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f2454b;

            a(AppCompatSpinner appCompatSpinner) {
                this.f2454b = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i10, hVar.V.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.q0(AppCompatSpinner.this)) {
                    h.this.dismiss();
                } else {
                    h.this.p0();
                    h.super.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2457b;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2457b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2457b);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.W = new Rect();
            R(AppCompatSpinner.this);
            c0(true);
            i0(0);
            e0(new a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void f(int i10) {
            this.X = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void g(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            p0();
            Z(2);
            super.show();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            d.d(listViewJ, i10);
            d.c(listViewJ, i11);
            k0(AppCompatSpinner.this.getSelectedItemPosition());
            if (zB || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            d0(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence m() {
            return this.U;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void n(CharSequence charSequence) {
            this.U = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int o() {
            return this.X;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.i
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.V = listAdapter;
        }

        void p0() {
            Drawable drawableD = d();
            int i10 = 0;
            if (drawableD != null) {
                drawableD.getPadding(AppCompatSpinner.this.f2443i);
                i10 = h1.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f2443i.right : -AppCompatSpinner.this.f2443i.left;
            } else {
                Rect rect = AppCompatSpinner.this.f2443i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f2442h;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.V, d());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f2443i;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                T(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                T((width - paddingLeft) - paddingRight);
            } else {
                T(i11);
            }
            l(h1.b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - G()) - o()) : i10 + paddingLeft + o());
        }

        boolean q0(View view) {
            return androidx.core.view.j1.O0(view) && view.getGlobalVisibleRect(this.W);
        }
    }

    @j1
    public interface i {
        void a(Drawable drawable);

        boolean b();

        Drawable d();

        void dismiss();

        void e(int i10);

        void f(int i10);

        void g(int i10, int i11);

        int h();

        int k();

        void l(int i10);

        CharSequence m();

        void n(CharSequence charSequence);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(@androidx.annotation.n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(@androidx.annotation.n0 Context context, int i10) {
        this(context, null, androidx.appcompat.R.attr.spinnerStyle, i10);
    }

    public AppCompatSpinner(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public AppCompatSpinner(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrY;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f2443i = new Rect();
        s0.a(this, getContext());
        x0 x0VarG = x0.G(context, attributeSet, androidx.appcompat.R.styleable.B, i10, 0);
        this.f2436b = new androidx.appcompat.widget.c(this);
        if (theme != null) {
            this.f2437c = new androidx.appcompat.view.d(context, theme);
        } else {
            int iU = x0VarG.u(androidx.appcompat.R.styleable.Spinner_popupTheme, 0);
            if (iU != 0) {
                this.f2437c = new androidx.appcompat.view.d(context, iU);
            } else {
                this.f2437c = context;
            }
        }
        ?? r11 = -1;
        ?? r10 = 0;
        try {
            if (i11 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2430j, i10, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i(f2432l, "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i11 != 0) {
                            f fVar = new f();
                            this.f2441g = fVar;
                            fVar.n(x0VarG.w(androidx.appcompat.R.styleable.Spinner_android_prompt));
                        } else if (i11 == 1) {
                            h hVar = new h(this.f2437c, attributeSet, i10);
                            x0 x0VarG2 = x0.G(this.f2437c, attributeSet, androidx.appcompat.R.styleable.B, i10, 0);
                            this.f2442h = x0VarG2.q(androidx.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
                            hVar.a(x0VarG2.h(androidx.appcompat.R.styleable.Spinner_android_popupBackground));
                            hVar.n(x0VarG.w(androidx.appcompat.R.styleable.Spinner_android_prompt));
                            x0VarG2.I();
                            this.f2441g = hVar;
                            this.f2438d = new a(this, hVar);
                        }
                        charSequenceArrY = x0VarG.y(androidx.appcompat.R.styleable.Spinner_android_entries);
                        if (charSequenceArrY != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrY);
                            arrayAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        x0VarG.I();
                        this.f2440f = true;
                        spinnerAdapter = this.f2439e;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f2439e = null;
                        }
                        this.f2436b.e(attributeSet, i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r10 != 0) {
                        r10.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 != 0) {
                f fVar2 = new f();
                this.f2441g = fVar2;
                fVar2.n(x0VarG.w(androidx.appcompat.R.styleable.Spinner_android_prompt));
            } else if (i11 == 1) {
                h hVar2 = new h(this.f2437c, attributeSet, i10);
                x0 x0VarG3 = x0.G(this.f2437c, attributeSet, androidx.appcompat.R.styleable.B, i10, 0);
                this.f2442h = x0VarG3.q(androidx.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
                hVar2.a(x0VarG3.h(androidx.appcompat.R.styleable.Spinner_android_popupBackground));
                hVar2.n(x0VarG.w(androidx.appcompat.R.styleable.Spinner_android_prompt));
                x0VarG3.I();
                this.f2441g = hVar2;
                this.f2438d = new a(this, hVar2);
            }
            charSequenceArrY = x0VarG.y(androidx.appcompat.R.styleable.Spinner_android_entries);
            if (charSequenceArrY != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrY);
                arrayAdapter2.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter2);
            }
            x0VarG.I();
            this.f2440f = true;
            spinnerAdapter = this.f2439e;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f2439e = null;
            }
            this.f2436b.e(attributeSet, i10);
        } catch (Throwable th3) {
            th = th3;
            r10 = r11;
        }
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f2443i);
        Rect rect = this.f2443i;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f2441g.g(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.c cVar = this.f2436b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f2441g;
        return iVar != null ? iVar.k() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f2441g;
        return iVar != null ? iVar.h() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2441g != null ? this.f2442h : super.getDropDownWidth();
    }

    @j1
    final i getInternalPopup() {
        return this.f2441g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f2441g;
        return iVar != null ? iVar.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2437c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f2441g;
        return iVar != null ? iVar.m() : super.getPrompt();
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.c cVar = this.f2436b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.c cVar = this.f2436b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f2441g;
        if (iVar == null || !iVar.b()) {
            return;
        }
        this.f2441g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2441g == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f2444b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        i iVar = this.f2441g;
        savedState.f2444b = iVar != null && iVar.b();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f2438d;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        i iVar = this.f2441g;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2440f) {
            this.f2439e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2441g != null) {
            Context context = this.f2437c;
            if (context == null) {
                context = getContext();
            }
            this.f2441g.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.c cVar = this.f2436b;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.c cVar = this.f2436b;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.f2441g;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            iVar.f(i10);
            this.f2441g.l(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.f2441g;
        if (iVar != null) {
            iVar.e(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f2441g != null) {
            this.f2442h = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f2441g;
        if (iVar != null) {
            iVar.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@androidx.annotation.v int i10) {
        setPopupBackgroundDrawable(b0.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f2441g;
        if (iVar != null) {
            iVar.n(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        androidx.appcompat.widget.c cVar = this.f2436b;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        androidx.appcompat.widget.c cVar = this.f2436b;
        if (cVar != null) {
            cVar.j(mode);
        }
    }
}
