package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f23633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f23634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f23635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FragmentManager f23636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TabHost.OnTabChangeListener f23638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f23639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23640i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f23641b;

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
            this.f23641b = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @androidx.annotation.n0
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f23641b + z5.g.f141884d;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f23641b);
        }
    }

    public static class a implements TabHost.TabContentFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23642a;

        public a(Context context) {
            this.f23642a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f23642a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        final String f23643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.n0
        final Class<?> f23644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        final Bundle f23645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Fragment f23646d;

        b(@androidx.annotation.n0 String str, @androidx.annotation.n0 Class<?> cls, @androidx.annotation.p0 Bundle bundle) {
            this.f23643a = str;
            this.f23644b = cls;
            this.f23645c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@androidx.annotation.n0 Context context) {
        super(context, null);
        this.f23633b = new ArrayList<>();
        f(context, null);
    }

    @Deprecated
    public FragmentTabHost(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23633b = new ArrayList<>();
        f(context, attributeSet);
    }

    @androidx.annotation.p0
    private p0 b(@androidx.annotation.p0 String str, @androidx.annotation.p0 p0 p0Var) {
        Fragment fragment;
        b bVarE = e(str);
        if (this.f23639h != bVarE) {
            if (p0Var == null) {
                p0Var = this.f23636e.u();
            }
            b bVar = this.f23639h;
            if (bVar != null && (fragment = bVar.f23646d) != null) {
                p0Var.r(fragment);
            }
            if (bVarE != null) {
                Fragment fragment2 = bVarE.f23646d;
                if (fragment2 == null) {
                    Fragment fragmentA = this.f23636e.H0().a(this.f23635d.getClassLoader(), bVarE.f23644b.getName());
                    bVarE.f23646d = fragmentA;
                    fragmentA.setArguments(bVarE.f23645c);
                    p0Var.c(this.f23637f, bVarE.f23646d, bVarE.f23643a);
                } else {
                    p0Var.l(fragment2);
                }
            }
            this.f23639h = bVarE;
        }
        return p0Var;
    }

    private void c() {
        if (this.f23634c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f23637f);
            this.f23634c = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f23637f);
        }
    }

    private void d(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f23634c = frameLayout2;
            frameLayout2.setId(this.f23637f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @androidx.annotation.p0
    private b e(String str) {
        int size = this.f23633b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f23633b.get(i10);
            if (bVar.f23643a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f23637f = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void a(@androidx.annotation.n0 TabHost.TabSpec tabSpec, @androidx.annotation.n0 Class<?> cls, @androidx.annotation.p0 Bundle bundle) {
        tabSpec.setContent(new a(this.f23635d));
        String tag = tabSpec.getTag();
        b bVar = new b(tag, cls, bundle);
        if (this.f23640i) {
            Fragment fragmentS0 = this.f23636e.s0(tag);
            bVar.f23646d = fragmentS0;
            if (fragmentS0 != null && !fragmentS0.isDetached()) {
                p0 p0VarU = this.f23636e.u();
                p0VarU.r(bVar.f23646d);
                p0VarU.m();
            }
        }
        this.f23633b.add(bVar);
        addTab(tabSpec);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f23633b.size();
        p0 p0VarU = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f23633b.get(i10);
            Fragment fragmentS0 = this.f23636e.s0(bVar.f23643a);
            bVar.f23646d = fragmentS0;
            if (fragmentS0 != null && !fragmentS0.isDetached()) {
                if (bVar.f23643a.equals(currentTabTag)) {
                    this.f23639h = bVar;
                } else {
                    if (p0VarU == null) {
                        p0VarU = this.f23636e.u();
                    }
                    p0VarU.r(bVar.f23646d);
                }
            }
        }
        this.f23640i = true;
        p0 p0VarB = b(currentTabTag, p0VarU);
        if (p0VarB != null) {
            p0VarB.m();
            this.f23636e.n0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23640i = false;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f23641b);
    }

    @Override // android.view.View
    @androidx.annotation.n0
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23641b = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@androidx.annotation.p0 String str) {
        p0 p0VarB;
        if (this.f23640i && (p0VarB = b(str, null)) != null) {
            p0VarB.m();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f23638g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@androidx.annotation.p0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f23638g = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@androidx.annotation.n0 Context context, @androidx.annotation.n0 FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.f23635d = context;
        this.f23636e = fragmentManager;
        c();
    }

    @Deprecated
    public void setup(@androidx.annotation.n0 Context context, @androidx.annotation.n0 FragmentManager fragmentManager, int i10) {
        d(context);
        super.setup();
        this.f23635d = context;
        this.f23636e = fragmentManager;
        this.f23637f = i10;
        c();
        this.f23634c.setId(i10);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }
}
