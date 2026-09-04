package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FragmentContainerView.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n55#2,6:354\n55#2,6:360\n1855#3,2:366\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:354,6\n135#1:360,6\n226#1:366,2\n*E\n"})
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<View> f23551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<View> f23552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private View.OnApplyWindowInsetsListener f23553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23554e;

    /* JADX INFO: compiled from: FragmentContainerView.kt */
    @androidx.annotation.w0(20)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f23555a = new a();

        private a() {
        }

        @dl.d
        public final WindowInsets a(@dl.d View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @dl.d View v10, @dl.d WindowInsets insets) {
            kotlin.jvm.internal.f0.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.f0.p(v10, "v");
            kotlin.jvm.internal.f0.p(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v10, insets);
            kotlin.jvm.internal.f0.o(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@dl.d Context context) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f23551b = new ArrayList();
        this.f23552c = new ArrayList();
        this.f23554e = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public FragmentContainerView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public FragmentContainerView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f23551b = new ArrayList();
        this.f23552c = new ArrayList();
        this.f23554e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = R.styleable.f23473b;
            kotlin.jvm.internal.f0.o(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + kotlin.text.y.f128593b);
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@dl.d Context context, @dl.d AttributeSet attrs, @dl.d FragmentManager fm) {
        String str;
        super(context, attrs);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(attrs, "attrs");
        kotlin.jvm.internal.f0.p(fm, "fm");
        this.f23551b = new ArrayList();
        this.f23552c = new ArrayList();
        this.f23554e = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = R.styleable.f23473b;
        kotlin.jvm.internal.f0.o(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentR0 = fm.r0(id2);
        if (classAttribute != null && fragmentR0 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = fm.H0().a(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.f0.o(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.mFragmentId = id2;
            fragmentA.mContainerId = id2;
            fragmentA.mTag = string;
            fragmentA.mFragmentManager = fm;
            fragmentA.mHost = fm.K0();
            fragmentA.onInflate(context, attrs, (Bundle) null);
            fm.u().M(true).f(this, fragmentA, string).p();
        }
        fm.p1(this);
    }

    private final void a(View view) {
        if (this.f23552c.contains(view)) {
            this.f23551b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@dl.d View child, int i10, @dl.e ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.f0.p(child, "child");
        if (FragmentManager.R0(child) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @dl.d
    @androidx.annotation.w0(20)
    public WindowInsets dispatchApplyWindowInsets(@dl.d WindowInsets insets) {
        n3 n3VarG1;
        kotlin.jvm.internal.f0.p(insets, "insets");
        n3 n3VarK = n3.K(insets);
        kotlin.jvm.internal.f0.o(n3VarK, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f23553d;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f23555a;
            kotlin.jvm.internal.f0.m(onApplyWindowInsetsListener);
            n3VarG1 = n3.K(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            n3VarG1 = j1.g1(this, n3VarK);
        }
        kotlin.jvm.internal.f0.o(n3VarG1, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!n3VarG1.A()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                j1.p(getChildAt(i10), n3VarG1);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        if (this.f23554e) {
            Iterator<T> it = this.f23551b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@dl.d Canvas canvas, @dl.d View child, long j10) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(child, "child");
        if (this.f23554e && (!this.f23551b.isEmpty()) && this.f23551b.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        this.f23552c.remove(view);
        if (this.f23551b.remove(view)) {
            this.f23554e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.u0(this).r0(getId());
    }

    @Override // android.view.View
    @dl.d
    @androidx.annotation.w0(20)
    public WindowInsets onApplyWindowInsets(@dl.d WindowInsets insets) {
        kotlin.jvm.internal.f0.p(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.f0.o(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.f0.o(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.f0.o(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.f0.o(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @xh.h(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f23554e = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@dl.e LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@dl.d View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.f23553d = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        if (view.getParent() == this) {
            this.f23552c.add(view);
        }
        super.startViewTransition(view);
    }
}
