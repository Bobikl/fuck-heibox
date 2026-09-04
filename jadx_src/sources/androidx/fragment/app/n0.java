package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentStatePagerAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class n0 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f23750h = "FragmentStatePagerAdapt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f23751i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f23752j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f23753k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FragmentManager f23754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p0 f23756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<Fragment.SavedState> f23757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f23758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Fragment f23759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23760g;

    @Deprecated
    public n0(@androidx.annotation.n0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public n0(@androidx.annotation.n0 FragmentManager fragmentManager, int i10) {
        this.f23756c = null;
        this.f23757d = new ArrayList<>();
        this.f23758e = new ArrayList<>();
        this.f23759f = null;
        this.f23754a = fragmentManager;
        this.f23755b = i10;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@androidx.annotation.n0 ViewGroup viewGroup, int i10, @androidx.annotation.n0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f23756c == null) {
            this.f23756c = this.f23754a.u();
        }
        while (this.f23757d.size() <= i10) {
            this.f23757d.add(null);
        }
        this.f23757d.set(i10, fragment.isAdded() ? this.f23754a.U1(fragment) : null);
        this.f23758e.set(i10, null);
        this.f23756c.x(fragment);
        if (fragment.equals(this.f23759f)) {
            this.f23759f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(@androidx.annotation.n0 ViewGroup viewGroup) {
        p0 p0Var = this.f23756c;
        if (p0Var != null) {
            if (!this.f23760g) {
                try {
                    this.f23760g = true;
                    p0Var.p();
                    this.f23760g = false;
                } catch (Throwable th2) {
                    this.f23760g = false;
                    throw th2;
                }
            }
            this.f23756c = null;
        }
    }

    @androidx.annotation.n0
    public abstract Fragment getItem(int i10);

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.n0
    public Object instantiateItem(@androidx.annotation.n0 ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f23758e.size() > i10 && (fragment = this.f23758e.get(i10)) != null) {
            return fragment;
        }
        if (this.f23756c == null) {
            this.f23756c = this.f23754a.u();
        }
        Fragment item = getItem(i10);
        if (this.f23757d.size() > i10 && (savedState = this.f23757d.get(i10)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.f23758e.size() <= i10) {
            this.f23758e.add(null);
        }
        item.setMenuVisibility(false);
        if (this.f23755b == 0) {
            item.setUserVisibleHint(false);
        }
        this.f23758e.set(i10, item);
        this.f23756c.b(viewGroup.getId(), item);
        if (this.f23755b == 1) {
            this.f23756c.K(item, Lifecycle.State.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@androidx.annotation.n0 View view, @androidx.annotation.n0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f23757d.clear();
            this.f23758e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f23757d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i10 = Integer.parseInt(str.substring(1));
                    Fragment fragmentF0 = this.f23754a.F0(bundle, str);
                    if (fragmentF0 != null) {
                        while (this.f23758e.size() <= i10) {
                            this.f23758e.add(null);
                        }
                        fragmentF0.setMenuVisibility(false);
                        this.f23758e.set(i10, fragmentF0);
                    } else {
                        Log.w(f23750h, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.p0
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f23757d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f23757d.size()];
            this.f23757d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f23758e.size(); i10++) {
            Fragment fragment = this.f23758e.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f23754a.B1(bundle, "f" + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(@androidx.annotation.n0 ViewGroup viewGroup, int i10, @androidx.annotation.n0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f23759f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f23755b == 1) {
                    if (this.f23756c == null) {
                        this.f23756c = this.f23754a.u();
                    }
                    this.f23756c.K(this.f23759f, Lifecycle.State.STARTED);
                } else {
                    this.f23759f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f23755b == 1) {
                if (this.f23756c == null) {
                    this.f23756c = this.f23754a.u();
                }
                this.f23756c.K(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f23759f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(@androidx.annotation.n0 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
