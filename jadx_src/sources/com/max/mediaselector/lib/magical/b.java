package com.max.mediaselector.lib.magical;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: MagicalViewWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup.MarginLayoutParams f75333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f75334b;

    public b(View view) {
        this.f75334b = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f75333a = marginLayoutParams;
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = n.f21701b;
        }
    }

    public int a() {
        return this.f75333a.height;
    }

    public int b() {
        return this.f75333a.bottomMargin;
    }

    public int c() {
        return this.f75333a.leftMargin;
    }

    public int d() {
        return this.f75333a.rightMargin;
    }

    public int e() {
        return this.f75333a.topMargin;
    }

    public int f() {
        return this.f75333a.width;
    }

    public void g(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f35012s2, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75333a.height = Math.round(f10);
        this.f75334b.setLayoutParams(this.f75333a);
    }

    public void h(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35056u2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f75333a;
        marginLayoutParams.bottomMargin = i10;
        this.f75334b.setLayoutParams(marginLayoutParams);
    }

    public void i(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35100w2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f75333a;
        marginLayoutParams.leftMargin = i10;
        this.f75334b.setLayoutParams(marginLayoutParams);
    }

    public void j(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35078v2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f75333a;
        marginLayoutParams.rightMargin = i10;
        this.f75334b.setLayoutParams(marginLayoutParams);
    }

    public void k(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35034t2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f75333a;
        marginLayoutParams.topMargin = i10;
        this.f75334b.setLayoutParams(marginLayoutParams);
    }

    public void l(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34990r2, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75333a.width = Math.round(f10);
        this.f75334b.setLayoutParams(this.f75333a);
    }
}
