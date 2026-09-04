package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;

/* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class w implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f23884c = "FragmentManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FragmentManager f23885b;

    /* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f23886b;

        a(m0 m0Var) {
            this.f23886b = m0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f23886b.k();
            this.f23886b.m();
            SpecialEffectsController.r((ViewGroup) fragmentK.mView.getParent(), w.this.f23885b).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    w(FragmentManager fragmentManager) {
        this.f23885b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.p0 View view, @androidx.annotation.n0 String str, @androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        m0 m0VarD;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f23885b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f23472a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(R.styleable.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !s.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentR0 = resourceId != -1 ? this.f23885b.r0(resourceId) : null;
        if (fragmentR0 == null && string != null) {
            fragmentR0 = this.f23885b.s0(string);
        }
        if (fragmentR0 == null && id2 != -1) {
            fragmentR0 = this.f23885b.r0(id2);
        }
        if (fragmentR0 == null) {
            fragmentR0 = this.f23885b.H0().a(context.getClassLoader(), attributeValue);
            fragmentR0.mFromLayout = true;
            fragmentR0.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragmentR0.mContainerId = id2;
            fragmentR0.mTag = string;
            fragmentR0.mInLayout = true;
            FragmentManager fragmentManager = this.f23885b;
            fragmentR0.mFragmentManager = fragmentManager;
            fragmentR0.mHost = fragmentManager.K0();
            fragmentR0.onInflate(this.f23885b.K0().f(), attributeSet, fragmentR0.mSavedFragmentState);
            m0VarD = this.f23885b.n(fragmentR0);
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentR0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentR0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentR0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f23885b;
            fragmentR0.mFragmentManager = fragmentManager2;
            fragmentR0.mHost = fragmentManager2.K0();
            fragmentR0.onInflate(this.f23885b.K0().f(), attributeSet, fragmentR0.mSavedFragmentState);
            m0VarD = this.f23885b.D(fragmentR0);
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentR0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.j(fragmentR0, viewGroup);
        fragmentR0.mContainer = viewGroup;
        m0VarD.m();
        m0VarD.j();
        View view2 = fragmentR0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentR0.mView.getTag() == null) {
            fragmentR0.mView.setTag(string);
        }
        fragmentR0.mView.addOnAttachStateChangeListener(new a(m0VarD));
        return fragmentR0.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.n0 String str, @androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
