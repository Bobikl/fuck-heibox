package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i10, float f10, int i11) {
        if (this.mPageTransformer == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.mLayoutManager.getChildCount(); i12++) {
            View childAt = this.mLayoutManager.getChildAt(i12);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.mLayoutManager.getChildCount())));
            }
            this.mPageTransformer.transformPage(childAt, (this.mLayoutManager.getPosition(childAt) - i10) + f11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i10) {
    }

    void setPageTransformer(@p0 ViewPager2.PageTransformer pageTransformer) {
        this.mPageTransformer = pageTransformer;
    }
}
