package com.max.hbcustomview.bannerview.provider;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ReflectLayoutManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(ViewPager2 viewPager2, int i10) {
        if (PatchProxy.proxy(new Object[]{viewPager2, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32520qh, new Class[]{ViewPager2.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            RecyclerView recyclerView = (RecyclerView) viewPager2.getChildAt(0);
            recyclerView.setOverScrollMode(2);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager == null) {
                return;
            }
            ScrollDurationManger scrollDurationManger = new ScrollDurationManger(viewPager2, i10, linearLayoutManager);
            recyclerView.setLayoutManager(scrollDurationManger);
            Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            declaredField.set(linearLayoutManager, recyclerView);
            Field declaredField2 = ViewPager2.class.getDeclaredField("mLayoutManager");
            declaredField2.setAccessible(true);
            declaredField2.set(viewPager2, scrollDurationManger);
            Field declaredField3 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");
            declaredField3.setAccessible(true);
            Object obj = declaredField3.get(viewPager2);
            if (obj != null) {
                Field declaredField4 = obj.getClass().getDeclaredField("mLayoutManager");
                declaredField4.setAccessible(true);
                declaredField4.set(obj, scrollDurationManger);
            }
            Field declaredField5 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");
            declaredField5.setAccessible(true);
            Object obj2 = declaredField5.get(viewPager2);
            if (obj2 != null) {
                Field declaredField6 = obj2.getClass().getDeclaredField("mLayoutManager");
                declaredField6.setAccessible(true);
                declaredField6.set(obj2, scrollDurationManger);
            }
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }
}
