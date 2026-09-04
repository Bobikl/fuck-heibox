package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    static final boolean f2588a4 = false;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    static final String f2589b4 = "SearchView";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f2590c4 = "nm";

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    static final o f2591d4;
    final SearchAutoComplete C;
    private final View D;
    private final View E;
    private final View F;
    final ImageView G;
    private CharSequence G2;
    private boolean G3;
    final ImageView H;
    final ImageView I;
    final ImageView J;
    private int J3;
    private final View K;
    private boolean K3;
    private p L;
    private CharSequence L3;
    private Rect M;
    private CharSequence M3;
    private Rect N;
    private boolean N3;
    private int[] O;
    private int O3;
    private int[] P;
    SearchableInfo P3;
    private final ImageView Q;
    private Bundle Q3;
    private final Drawable R;
    private final Runnable R3;
    private final int S;
    private Runnable S3;
    private final int T;
    private final WeakHashMap<String, Drawable.ConstantState> T3;
    private final Intent U;
    private final View.OnClickListener U3;
    private final Intent V;
    View.OnKeyListener V3;
    private final CharSequence W;
    private final TextView.OnEditorActionListener W3;
    private final AdapterView.OnItemClickListener X3;
    private final AdapterView.OnItemSelectedListener Y3;
    private TextWatcher Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private m f2592a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private l f2593b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    View.OnFocusChangeListener f2594c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private n f2595p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f2596p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f2597p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private View.OnClickListener f2598x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    androidx.cursoradapter.widget.a f2599x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private boolean f2600y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f2601y2;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2602b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2602b = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2602b + z5.g.f141884d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f2602b));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f2603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private SearchView f2604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2605h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Runnable f2606i;

        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f2606i = new a();
            this.f2603f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f2591d4.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f2605h) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2605h = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f2603f <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2605h) {
                removeCallbacks(this.f2606i);
                post(this.f2606i);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f2604g.d0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2604g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f2604g.hasFocus() && getVisibility() == 0) {
                this.f2605h = true;
                if (SearchView.O(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f2605h = false;
                removeCallbacks(this.f2606i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2605h = true;
                    return;
                }
                this.f2605h = false;
                removeCallbacks(this.f2606i);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f2604g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f2603f = i10;
        }
    }

    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.c0(charSequence);
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.i0();
        }
    }

    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.cursoradapter.widget.a aVar = SearchView.this.f2599x2;
            if (aVar instanceof r0) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f2594c0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.C();
        }
    }

    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.G) {
                searchView.Z();
                return;
            }
            if (view == searchView.I) {
                searchView.V();
                return;
            }
            if (view == searchView.H) {
                searchView.a0();
            } else if (view == searchView.J) {
                searchView.e0();
            } else if (view == searchView.C) {
                searchView.I();
            }
        }
    }

    public class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.P3 == null) {
                return false;
            }
            if (searchView.C.isPopupShowing() && SearchView.this.C.getListSelection() != -1) {
                return SearchView.this.b0(view, i10, keyEvent);
            }
            if (SearchView.this.C.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.T(0, null, searchView2.C.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.a0();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.W(i10, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.X(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @androidx.annotation.w0(29)
    public static class k {
        private k() {
        }

        @androidx.annotation.u
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @androidx.annotation.u
        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i10);

        boolean b(int i10);
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f2618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f2619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f2620c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() {
            this.f2618a = null;
            this.f2619b = null;
            this.f2620c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2618a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2619b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f2620c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f2619b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f2618a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f2620c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f2621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f2622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f2623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f2624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f2625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2626f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2625e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f2622b = new Rect();
            this.f2624d = new Rect();
            this.f2623c = new Rect();
            a(rect, rect2);
            this.f2621a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f2622b.set(rect);
            this.f2624d.set(rect);
            Rect rect3 = this.f2624d;
            int i10 = this.f2625e;
            rect3.inset(-i10, -i10);
            this.f2623c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003f  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f2626f;
                    if (z11 && !this.f2624d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f2626f;
                    this.f2626f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f2622b.contains(x10, y10)) {
                this.f2626f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f2623c.contains(x10, y10)) {
                Rect rect = this.f2623c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f2621a.getWidth() / 2, this.f2621a.getHeight() / 2);
            }
            return this.f2621a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f2591d4 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public SearchView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = new Rect();
        this.N = new Rect();
        this.O = new int[2];
        this.P = new int[2];
        this.R3 = new b();
        this.S3 = new c();
        this.T3 = new WeakHashMap<>();
        f fVar = new f();
        this.U3 = fVar;
        this.V3 = new g();
        h hVar = new h();
        this.W3 = hVar;
        i iVar = new i();
        this.X3 = iVar;
        j jVar = new j();
        this.Y3 = jVar;
        this.Z3 = new a();
        int[] iArr = R.styleable.A;
        x0 x0VarG = x0.G(context, attributeSet, iArr, i10, 0);
        j1.z1(this, context, iArr, attributeSet, x0VarG.B(), i10, 0);
        LayoutInflater.from(context).inflate(x0VarG.u(R.styleable.SearchView_layout, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.C = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.D = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.E = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.F = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.G = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.H = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.I = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.J = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.Q = imageView5;
        j1.I1(viewFindViewById, x0VarG.h(R.styleable.SearchView_queryBackground));
        j1.I1(viewFindViewById2, x0VarG.h(R.styleable.SearchView_submitBackground));
        int i11 = R.styleable.SearchView_searchIcon;
        imageView.setImageDrawable(x0VarG.h(i11));
        imageView2.setImageDrawable(x0VarG.h(R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(x0VarG.h(R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(x0VarG.h(R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(x0VarG.h(i11));
        this.R = x0VarG.h(R.styleable.SearchView_searchHintIcon);
        b1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.S = x0VarG.u(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.T = x0VarG.u(R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.Z3);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.V3);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(x0VarG.a(R.styleable.SearchView_iconifiedByDefault, true));
        int iG = x0VarG.g(R.styleable.SearchView_android_maxWidth, -1);
        if (iG != -1) {
            setMaxWidth(iG);
        }
        this.W = x0VarG.x(R.styleable.SearchView_defaultQueryHint);
        this.G2 = x0VarG.x(R.styleable.SearchView_queryHint);
        int iO = x0VarG.o(R.styleable.SearchView_android_imeOptions, -1);
        if (iO != -1) {
            setImeOptions(iO);
        }
        int iO2 = x0VarG.o(R.styleable.SearchView_android_inputType, -1);
        if (iO2 != -1) {
            setInputType(iO2);
        }
        setFocusable(x0VarG.a(R.styleable.SearchView_android_focusable, true));
        x0VarG.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.U = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.V = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.K = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        n0(this.f2600y1);
        j0();
    }

    private Intent D(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.M3);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.Q3;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.P3.getSearchActivity());
        return intent;
    }

    private Intent E(Cursor cursor, int i10, String str) {
        int position;
        String strT;
        try {
            String strT2 = r0.t(cursor, "suggest_intent_action");
            if (strT2 == null) {
                strT2 = this.P3.getSuggestIntentAction();
            }
            if (strT2 == null) {
                strT2 = "android.intent.action.SEARCH";
            }
            String str2 = strT2;
            String strT3 = r0.t(cursor, "suggest_intent_data");
            if (strT3 == null) {
                strT3 = this.P3.getSuggestIntentData();
            }
            if (strT3 != null && (strT = r0.t(cursor, "suggest_intent_data_id")) != null) {
                strT3 = strT3 + "/" + Uri.encode(strT);
            }
            return D(str2, strT3 == null ? null : Uri.parse(strT3), r0.t(cursor, "suggest_intent_extra_data"), r0.t(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w(f2589b4, "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.Q3;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent G(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void H() {
        this.C.dismissDropDown();
    }

    private void J(View view, Rect rect) {
        view.getLocationInWindow(this.O);
        getLocationInWindow(this.P);
        int[] iArr = this.O;
        int i10 = iArr[1];
        int[] iArr2 = this.P;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence K(CharSequence charSequence) {
        if (!this.f2600y1 || this.R == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.C.getTextSize()) * 1.25d);
        this.R.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.R), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean L() {
        SearchableInfo searchableInfo = this.P3;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.P3.getVoiceSearchLaunchWebSearch()) {
            intent = this.U;
        } else if (this.P3.getVoiceSearchLaunchRecognizer()) {
            intent = this.V;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean O(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean Q() {
        return (this.f2601y2 || this.K3) && !N();
    }

    private void S(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e(f2589b4, "Failed launch activity: " + intent, e10);
        }
    }

    private boolean U(int i10, int i11, String str) {
        Cursor cursorB = this.f2599x2.b();
        if (cursorB == null || !cursorB.moveToPosition(i10)) {
            return false;
        }
        S(E(cursorB, i11, str));
        return true;
    }

    private void f0() {
        post(this.R3);
    }

    private void g0(int i10) {
        Editable text = this.C.getText();
        Cursor cursorB = this.f2599x2.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f2599x2.convertToString(cursorB);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void h0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.C.getText());
        if (!z11 && (!this.f2600y1 || this.N3)) {
            z10 = false;
        }
        this.I.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.I.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void j0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.C;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(K(queryHint));
    }

    private void k0() {
        this.C.setThreshold(this.P3.getSuggestThreshold());
        this.C.setImeOptions(this.P3.getImeOptions());
        int inputType = this.P3.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.P3.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.C.setInputType(inputType);
        androidx.cursoradapter.widget.a aVar = this.f2599x2;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.P3.getSuggestAuthority() != null) {
            r0 r0Var = new r0(getContext(), this, this.P3, this.T3);
            this.f2599x2 = r0Var;
            this.C.setAdapter(r0Var);
            ((r0) this.f2599x2).D(this.f2597p3 ? 2 : 1);
        }
    }

    private void l0() {
        this.F.setVisibility((Q() && (this.H.getVisibility() == 0 || this.J.getVisibility() == 0)) ? 0 : 8);
    }

    private void m0(boolean z10) {
        this.H.setVisibility((this.f2601y2 && Q() && hasFocus() && (z10 || !this.K3)) ? 0 : 8);
    }

    private void n0(boolean z10) {
        this.f2596p2 = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.C.getText());
        this.G.setVisibility(i10);
        m0(z11);
        this.D.setVisibility(z10 ? 8 : 0);
        this.Q.setVisibility((this.Q.getDrawable() == null || this.f2600y1) ? 8 : 0);
        h0();
        o0(!z11);
        l0();
    }

    private void o0(boolean z10) {
        int i10 = 8;
        if (this.K3 && !N() && z10) {
            this.H.setVisibility(8);
            i10 = 0;
        }
        this.J.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.C.setText(charSequence);
        this.C.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void C() {
        if (this.K.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.E.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = h1.b(this);
            int dimensionPixelSize = this.f2600y1 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
            this.C.getDropDownBackground().getPadding(rect);
            this.C.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.C.setDropDownWidth((((this.K.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void I() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.C);
            return;
        }
        o oVar = f2591d4;
        oVar.b(this.C);
        oVar.a(this.C);
    }

    public boolean M() {
        return this.f2600y1;
    }

    public boolean N() {
        return this.f2596p2;
    }

    public boolean P() {
        return this.f2597p3;
    }

    public boolean R() {
        return this.f2601y2;
    }

    void T(int i10, String str, String str2) {
        getContext().startActivity(D("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void V() {
        if (!TextUtils.isEmpty(this.C.getText())) {
            this.C.setText("");
            this.C.requestFocus();
            this.C.setImeVisibility(true);
        } else if (this.f2600y1) {
            l lVar = this.f2593b0;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                n0(true);
            }
        }
    }

    boolean W(int i10, int i11, String str) {
        n nVar = this.f2595p1;
        if (nVar != null && nVar.b(i10)) {
            return false;
        }
        U(i10, 0, null);
        this.C.setImeVisibility(false);
        H();
        return true;
    }

    boolean X(int i10) {
        n nVar = this.f2595p1;
        if (nVar != null && nVar.a(i10)) {
            return false;
        }
        g0(i10);
        return true;
    }

    protected void Y(@androidx.annotation.p0 CharSequence charSequence) {
        setQuery(charSequence);
    }

    void Z() {
        n0(false);
        this.C.requestFocus();
        this.C.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2598x1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void a0() {
        Editable text = this.C.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f2592a0;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.P3 != null) {
                T(0, null, text.toString());
            }
            this.C.setImeVisibility(false);
            H();
        }
    }

    boolean b0(View view, int i10, KeyEvent keyEvent) {
        if (this.P3 != null && this.f2599x2 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return W(this.C.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.C.setSelection(i10 == 21 ? 0 : this.C.length());
                this.C.setListSelection(0);
                this.C.clearListSelection();
                this.C.b();
                return true;
            }
            if (i10 == 19) {
                this.C.getListSelection();
                return false;
            }
        }
        return false;
    }

    void c0(CharSequence charSequence) {
        Editable text = this.C.getText();
        this.M3 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        m0(z10);
        o0(!z10);
        h0();
        l0();
        if (this.f2592a0 != null && !TextUtils.equals(charSequence, this.L3)) {
            this.f2592a0.a(charSequence.toString());
        }
        this.L3 = charSequence.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.G3 = true;
        super.clearFocus();
        this.C.clearFocus();
        this.C.setImeVisibility(false);
        this.G3 = false;
    }

    void d0() {
        n0(N());
        f0();
        if (this.C.hasFocus()) {
            I();
        }
    }

    void e0() {
        SearchableInfo searchableInfo = this.P3;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(G(this.U, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(F(this.V, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(f2589b4, "Could not find voice search activity");
        }
    }

    public int getImeOptions() {
        return this.C.getImeOptions();
    }

    public int getInputType() {
        return this.C.getInputType();
    }

    public int getMaxWidth() {
        return this.J3;
    }

    public CharSequence getQuery() {
        return this.C.getText();
    }

    @androidx.annotation.p0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.G2;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.P3;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.W : getContext().getText(this.P3.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.T;
    }

    int getSuggestionRowLayout() {
        return this.S;
    }

    public androidx.cursoradapter.widget.a getSuggestionsAdapter() {
        return this.f2599x2;
    }

    void i0() {
        int[] iArr = this.C.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.F.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        n0(true);
        this.C.setImeOptions(this.O3);
        this.N3 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.N3) {
            return;
        }
        this.N3 = true;
        int imeOptions = this.C.getImeOptions();
        this.O3 = imeOptions;
        this.C.setImeOptions(imeOptions | 33554432);
        this.C.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.R3);
        post(this.S3);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            J(this.C, this.M);
            Rect rect = this.N;
            Rect rect2 = this.M;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.L;
            if (pVar != null) {
                pVar.a(this.N, this.M);
                return;
            }
            p pVar2 = new p(this.N, this.M, this.C);
            this.L = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (N()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.J3;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.J3;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.J3) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        n0(savedState.f2602b);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2602b = N();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        f0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.G3 || !isFocusable()) {
            return false;
        }
        if (N()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.C.requestFocus(i10, rect);
        if (zRequestFocus) {
            n0(false);
        }
        return zRequestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.Q3 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            V();
        } else {
            Z();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f2600y1 == z10) {
            return;
        }
        this.f2600y1 = z10;
        n0(z10);
        j0();
    }

    public void setImeOptions(int i10) {
        this.C.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.C.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.J3 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f2593b0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2594c0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f2592a0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2598x1 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.f2595p1 = nVar;
    }

    public void setQuery(CharSequence charSequence, boolean z10) {
        this.C.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.C;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.M3 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        a0();
    }

    public void setQueryHint(@androidx.annotation.p0 CharSequence charSequence) {
        this.G2 = charSequence;
        j0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f2597p3 = z10;
        androidx.cursoradapter.widget.a aVar = this.f2599x2;
        if (aVar instanceof r0) {
            ((r0) aVar).D(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.P3 = searchableInfo;
        if (searchableInfo != null) {
            k0();
            j0();
        }
        boolean zL = L();
        this.K3 = zL;
        if (zL) {
            this.C.setPrivateImeOptions(f2590c4);
        }
        n0(N());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f2601y2 = z10;
        n0(N());
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.a aVar) {
        this.f2599x2 = aVar;
        this.C.setAdapter(aVar);
    }
}
