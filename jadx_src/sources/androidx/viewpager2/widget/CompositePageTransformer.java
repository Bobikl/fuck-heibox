package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class CompositePageTransformer implements ViewPager2.PageTransformer {
    private final List<ViewPager2.PageTransformer> mTransformers = new ArrayList();

    public void addTransformer(@n0 ViewPager2.PageTransformer pageTransformer) {
        this.mTransformers.add(pageTransformer);
    }

    public void removeTransformer(@n0 ViewPager2.PageTransformer pageTransformer) {
        this.mTransformers.remove(pageTransformer);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@n0 View view, float f10) {
        Iterator<ViewPager2.PageTransformer> it = this.mTransformers.iterator();
        while (it.hasNext()) {
            it.next().transformPage(view, f10);
        }
    }
}
