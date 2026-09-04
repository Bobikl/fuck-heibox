package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Scroller;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.viewpager.widget.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes10.dex */
public class NoScrollViewPager extends ViewPager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public NoScrollViewPager(@n0 Context context) {
        super(context);
    }

    public NoScrollViewPager(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i10) {
        return false;
    }

    public void setViewPagerScroll(Scroller scroller) {
        if (PatchProxy.proxy(new Object[]{scroller}, this, changeQuickRedirect, false, bb.c.f.f32465o8, new Class[]{Scroller.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Field declaredField = ViewPager.class.getDeclaredField("k");
            declaredField.setAccessible(true);
            declaredField.set(this, scroller);
        } catch (Exception e10) {
            Log.d("NoScrollViewPager", e10.getMessage());
        }
    }
}
