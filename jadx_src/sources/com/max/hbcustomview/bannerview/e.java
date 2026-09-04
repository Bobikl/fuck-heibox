package com.max.hbcustomview.bannerview;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.d1;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.v;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BaseViewHolder.java */
/* JADX INFO: loaded from: classes10.dex */
public class e<T> extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<View> f69016b;

    public e(@n0 View view) {
        super(view);
        this.f69016b = new SparseArray<>();
    }

    @Deprecated
    public void a(T t10, int i10, int i11) {
    }

    public void b(int i10, @l int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32695yg, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        findViewById(i10).setBackgroundColor(i11);
    }

    public void d(int i10, @v int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32673xg, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        findViewById(i10).setBackgroundResource(i11);
    }

    public <V extends View> V findViewById(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32541rg, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (V) patchProxyResultProxy.result;
        }
        V v10 = (V) this.f69016b.get(i10);
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) this.itemView.findViewById(i10);
        this.f69016b.put(i10, v11);
        return v11;
    }

    public void g(@d0 int i10, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), bitmap}, this, changeQuickRedirect, false, bb.c.f.Bg, new Class[]{Integer.TYPE, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        ((ImageView) findViewById(i10)).setImageBitmap(bitmap);
    }

    public void h(@d0 int i10, Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), drawable}, this, changeQuickRedirect, false, bb.c.f.Ag, new Class[]{Integer.TYPE, Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof ImageView) {
            ((ImageView) viewFindViewById).setImageDrawable(drawable);
        }
    }

    public void i(@d0 int i10, @v int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32717zg, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof ImageView) {
            ((ImageView) viewFindViewById).setImageResource(i11);
        }
    }

    public void j(int i10, View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), onClickListener}, this, changeQuickRedirect, false, bb.c.f.f32651wg, new Class[]{Integer.TYPE, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        findViewById(i10).setOnClickListener(onClickListener);
    }

    public void k(int i10, @d1 int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32585tg, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setText(i11);
        }
    }

    public void l(int i10, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), charSequence}, this, changeQuickRedirect, false, bb.c.f.f32563sg, new Class[]{Integer.TYPE, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setText(charSequence);
        }
    }

    public void m(int i10, @l int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32607ug, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setTextColor(i11);
        }
    }

    public void n(@d0 int i10, @n int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32629vg, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setTextColor(androidx.core.content.d.f(this.itemView.getContext(), i11));
        }
    }

    public void o(@d0 int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Cg, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        findViewById(i10).setVisibility(i11);
    }
}
