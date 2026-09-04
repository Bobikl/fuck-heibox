package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: PagerAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable = new DataSetObservable();
    private DataSetObserver mViewPagerObserver;

    @Deprecated
    public void destroyItem(@n0 View view, int i10, @n0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void destroyItem(@n0 ViewGroup viewGroup, int i10, @n0 Object obj) {
        destroyItem((View) viewGroup, i10, obj);
    }

    @Deprecated
    public void finishUpdate(@n0 View view) {
    }

    public void finishUpdate(@n0 ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    public abstract int getCount();

    public int getItemPosition(@n0 Object obj) {
        return -1;
    }

    @p0
    public CharSequence getPageTitle(int i10) {
        return null;
    }

    public float getPageWidth(int i10) {
        return 1.0f;
    }

    @n0
    @Deprecated
    public Object instantiateItem(@n0 View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @n0
    public Object instantiateItem(@n0 ViewGroup viewGroup, int i10) {
        return instantiateItem((View) viewGroup, i10);
    }

    public abstract boolean isViewFromObject(@n0 View view, @n0 Object obj);

    public void notifyDataSetChanged() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.mViewPagerObserver;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(@n0 DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public void restoreState(@p0 Parcelable parcelable, @p0 ClassLoader classLoader) {
    }

    @p0
    public Parcelable saveState() {
        return null;
    }

    @Deprecated
    public void setPrimaryItem(@n0 View view, int i10, @n0 Object obj) {
    }

    public void setPrimaryItem(@n0 ViewGroup viewGroup, int i10, @n0 Object obj) {
        setPrimaryItem((View) viewGroup, i10, obj);
    }

    void setViewPagerObserver(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    @Deprecated
    public void startUpdate(@n0 View view) {
    }

    public void startUpdate(@n0 ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }

    public void unregisterDataSetObserver(@n0 DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }
}
