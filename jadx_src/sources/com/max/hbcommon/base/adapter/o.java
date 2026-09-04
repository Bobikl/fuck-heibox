package com.max.hbcommon.base.adapter;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: NonRecyclableCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o<T> extends h<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f66772k = {R.attr.listDivider};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f66773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f66774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected c f66775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected d f66776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f66777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f66778j;

    /* JADX INFO: compiled from: NonRecyclableCommonAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66779b;

        a(int i10) {
            this.f66779b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.jz, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            o oVar = o.this;
            oVar.f66775g.a(oVar.f66774f, view, this.f66779b);
        }
    }

    /* JADX INFO: compiled from: NonRecyclableCommonAdapter.java */
    public class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66781b;

        b(int i10) {
            this.f66781b = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.kz, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            o oVar = o.this;
            oVar.f66776h.a(oVar.f66774f, view, this.f66781b);
            return false;
        }
    }

    /* JADX INFO: compiled from: NonRecyclableCommonAdapter.java */
    public interface c {
        void a(LinearLayout linearLayout, View view, int i10);
    }

    /* JADX INFO: compiled from: NonRecyclableCommonAdapter.java */
    public interface d {
        boolean a(LinearLayout linearLayout, View view, int i10);
    }

    public o(Context context, LinearLayout linearLayout, List<T> list, int i10) {
        super(context, list, i10);
        this.f66773e = context;
        this.f66774f = linearLayout;
        linearLayout.setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f66772k);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f66777i = drawable;
        this.f66778j = drawable.getIntrinsicHeight();
        typedArrayObtainStyledAttributes.recycle();
        if (list == null || list.isEmpty()) {
            return;
        }
        notifyDataSetChanged();
    }

    public Drawable e() {
        return this.f66777i;
    }

    public int f() {
        return this.f66778j;
    }

    public c g() {
        return this.f66775g;
    }

    public d h() {
        return this.f66776h;
    }

    public void i(Drawable drawable) {
        this.f66777i = drawable;
    }

    public void j(int i10) {
        this.f66778j = i10;
    }

    public void k(c cVar) {
        this.f66775g = cVar;
    }

    public void l(d dVar) {
        this.f66776h = dVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.iz, new Class[0], Void.TYPE).isSupported || (linearLayout = this.f66774f) == null) {
            return;
        }
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < this.f66744b.size(); i10++) {
            View viewInflate = this.f66745c.inflate(this.f66746d, (ViewGroup) this.f66774f, false);
            b(new h.a(this.f66746d, viewInflate, i10), this.f66744b.get(i10));
            if (isEnabled(i10)) {
                if (this.f66775g != null) {
                    viewInflate.setOnClickListener(new a(i10));
                }
                if (this.f66776h != null) {
                    viewInflate.setOnLongClickListener(new b(i10));
                }
            }
            this.f66774f.addView(viewInflate, new LinearLayout.LayoutParams(-1, -2));
            if (this.f66777i != null && this.f66778j > 0) {
                View view = new View(this.f66773e);
                view.setBackgroundDrawable(this.f66777i);
                this.f66774f.addView(view, new LinearLayout.LayoutParams(-1, this.f66778j));
            }
        }
    }
}
