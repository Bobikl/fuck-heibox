package androidx.viewpager2.widget;

import androidx.annotation.n0;
import androidx.annotation.t0;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    @n0
    private final List<ViewPager2.OnPageChangeCallback> mCallbacks;

    CompositeOnPageChangeCallback(int i10) {
        this.mCallbacks = new ArrayList(i10);
    }

    private void throwCallbackListModifiedWhileInUse(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    void addOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.add(onPageChangeCallback);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i10) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throwCallbackListModifiedWhileInUse(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i10, float f10, @t0 int i11) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            throwCallbackListModifiedWhileInUse(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i10) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throwCallbackListModifiedWhileInUse(e10);
        }
    }

    void removeOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.remove(onPageChangeCallback);
    }
}
