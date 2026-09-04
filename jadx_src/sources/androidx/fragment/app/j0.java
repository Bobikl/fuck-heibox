package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: FragmentPagerAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class j0 extends androidx.viewpager.widget.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private p0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    @Deprecated
    public j0(@androidx.annotation.n0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public j0(@androidx.annotation.n0 FragmentManager fragmentManager, int i10) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i10;
    }

    private static String makeFragmentName(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@androidx.annotation.n0 ViewGroup viewGroup, int i10, @androidx.annotation.n0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.u();
        }
        this.mCurTransaction.r(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(@androidx.annotation.n0 ViewGroup viewGroup) {
        p0 p0Var = this.mCurTransaction;
        if (p0Var != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    p0Var.p();
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th2) {
                    this.mExecutingFinishUpdate = false;
                    throw th2;
                }
            }
            this.mCurTransaction = null;
        }
    }

    @androidx.annotation.n0
    public abstract Fragment getItem(int i10);

    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.n0
    public Object instantiateItem(@androidx.annotation.n0 ViewGroup viewGroup, int i10) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.u();
        }
        long itemId = getItemId(i10);
        Fragment fragmentS0 = this.mFragmentManager.s0(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentS0 != null) {
            this.mCurTransaction.l(fragmentS0);
        } else {
            fragmentS0 = getItem(i10);
            this.mCurTransaction.c(viewGroup.getId(), fragmentS0, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (fragmentS0 != this.mCurrentPrimaryItem) {
            fragmentS0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.K(fragmentS0, Lifecycle.State.STARTED);
            } else {
                fragmentS0.setUserVisibleHint(false);
            }
        }
        return fragmentS0;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@androidx.annotation.n0 View view, @androidx.annotation.n0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.p0
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(@androidx.annotation.n0 ViewGroup viewGroup, int i10, @androidx.annotation.n0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.u();
                    }
                    this.mCurTransaction.K(this.mCurrentPrimaryItem, Lifecycle.State.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.u();
                }
                this.mCurTransaction.K(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
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
