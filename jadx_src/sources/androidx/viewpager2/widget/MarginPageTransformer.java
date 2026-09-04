package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.n0;
import androidx.annotation.t0;
import androidx.core.util.o;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {
    private final int mMarginPx;

    public MarginPageTransformer(@t0 int i10) {
        o.j(i10, "Margin must be non-negative");
        this.mMarginPx = i10;
    }

    private ViewPager2 requireViewPager(@n0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@n0 View view, float f10) {
        ViewPager2 viewPager2RequireViewPager = requireViewPager(view);
        float f11 = this.mMarginPx * f10;
        if (viewPager2RequireViewPager.getOrientation() != 0) {
            view.setTranslationY(f11);
            return;
        }
        if (viewPager2RequireViewPager.isRtl()) {
            f11 = -f11;
        }
        view.setTranslationX(f11);
    }
}
