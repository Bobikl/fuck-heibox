package com.max.xiaoheihe.module.news;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: CustomItemDecoration.java */
/* JADX INFO: loaded from: classes12.dex */
public class c extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f91317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f91318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f91319d;

    public c(Context context, int i10) {
        this.f91317b = context;
        this.f91319d = i10;
    }

    public c(Context context, Drawable drawable) {
        this.f91317b = context;
        this.f91318c = drawable;
    }

    public int a() {
        return this.f91319d;
    }

    public Drawable b() {
        return this.f91318c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@n0 Rect rect, @n0 View view, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 42408, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iF = ViewUtils.f(this.f91317b, 12.0f);
        int iF2 = ViewUtils.f(this.f91317b, 6.0f);
        if (childAdapterPosition == 0) {
            rect.set(iF, 0, iF2 / 2, iF);
        } else if (childAdapterPosition != 1) {
            rect.set(iF2 / 2, 0, iF, iF);
        } else {
            int i10 = iF2 / 2;
            rect.set(i10, 0, i10, iF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@n0 Canvas canvas, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, 42409, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        this.f91318c.setBounds(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
        this.f91318c.draw(canvas);
    }
}
