package com.max.hbcustomview.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class UpdateInsetsGridLayoutManager extends GridLayoutManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f69221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f69223d;

    public UpdateInsetsGridLayoutManager(Context context, int i10) {
        super(context, i10);
        this.f69221b = null;
        this.f69222c = false;
        this.f69223d = null;
    }

    public UpdateInsetsGridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i10, i11, z10);
        this.f69221b = null;
        this.f69222c = false;
        this.f69223d = null;
    }

    public UpdateInsetsGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f69221b = null;
        this.f69222c = false;
        this.f69223d = null;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{recycler, state}, this, changeQuickRedirect, false, bb.c.f.am, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69221b == null && !this.f69222c) {
            try {
                this.f69221b = RecyclerView.class.getDeclaredMethod("markItemDecorInsetsDirty", new Class[0]);
                Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mRecyclerView");
                declaredField.setAccessible(true);
                this.f69223d = (RecyclerView) declaredField.get(this);
                this.f69221b.setAccessible(true);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                this.f69222c = true;
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
                this.f69222c = true;
            } catch (NoSuchMethodException e12) {
                e12.printStackTrace();
                this.f69222c = true;
            }
        }
        if (this.f69221b != null && state.willRunSimpleAnimations()) {
            try {
                this.f69221b.invoke(this.f69223d, new Object[0]);
            } catch (IllegalAccessException e13) {
                e13.printStackTrace();
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
            }
        }
        super.onLayoutChildren(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void requestSimpleAnimationsInNextLayout() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.bm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.requestSimpleAnimationsInNextLayout();
        Method method = this.f69221b;
        if (method != null) {
            try {
                method.invoke(this.f69223d, new Object[0]);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }
}
