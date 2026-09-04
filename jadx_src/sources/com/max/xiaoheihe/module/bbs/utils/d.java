package com.max.xiaoheihe.module.bbs.utils;

import android.R;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: KeyboardChangeListener.java */
/* JADX INFO: loaded from: classes10.dex */
public class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f83489f = "ListenerHandler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f83490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f83491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f83493e;

    /* JADX INFO: compiled from: KeyboardChangeListener.java */
    public interface a {
        void s(boolean z10, int i10);
    }

    public d(View view) {
        if (view == null) {
            Log.i(f83489f, "contextObj is null");
        } else {
            this.f83490b = view;
            a();
        }
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31326, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f83490b.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private View c(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 31325, new Class[]{Activity.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : activity.findViewById(R.id.content);
    }

    public void b() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31328, new Class[0], Void.TYPE).isSupported || (view = this.f83490b) == null) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public void d(a aVar) {
        this.f83493e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean z10;
        int i10;
        int i11;
        a aVar;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31327, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int height = this.f83490b.getHeight();
        if (height == 0) {
            Log.i(f83489f, "currHeight is 0");
            return;
        }
        int i12 = this.f83492d;
        if (i12 != 0) {
            if (i12 != height) {
                this.f83492d = height;
                z10 = true;
            }
            if (z10) {
                i10 = this.f83491c;
                if (i10 == height) {
                    i11 = 0;
                } else {
                    i11 = i10 - height;
                    z11 = true;
                }
                aVar = this.f83493e;
                if (aVar != null) {
                    aVar.s(z11, i11);
                }
            }
        }
        this.f83492d = height;
        this.f83491c = height;
        z10 = false;
        if (z10) {
            i10 = this.f83491c;
            if (i10 == height) {
                i11 = 0;
            } else {
                i11 = i10 - height;
                z11 = true;
            }
            aVar = this.f83493e;
            if (aVar != null) {
                aVar.s(z11, i11);
            }
        }
    }
}
