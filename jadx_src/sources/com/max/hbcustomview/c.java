package com.max.hbcustomview;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: KeyboardChangeListener.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f69047f = "ListenerHandler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f69048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f69051e;

    /* JADX INFO: compiled from: KeyboardChangeListener.java */
    public interface a {
        void s(boolean z10, int i10);
    }

    public c(View view) {
        if (view == null) {
            Log.i(f69047f, "contextObj is null");
        } else {
            this.f69048b = view;
            a();
        }
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.O7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69048b.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void b() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Q7, new Class[0], Void.TYPE).isSupported || (view = this.f69048b) == null) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public void c(a aVar) {
        this.f69051e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.P7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Rect rect = new Rect();
        this.f69048b.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        if (Math.abs(this.f69049c - iHeight) > this.f69050d / 4) {
            int i10 = this.f69049c - iHeight;
            a aVar = this.f69051e;
            if (aVar != null) {
                aVar.s(i10 > 0, i10);
            }
            this.f69049c = iHeight;
        }
    }
}
