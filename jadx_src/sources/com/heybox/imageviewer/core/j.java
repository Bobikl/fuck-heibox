package com.heybox.imageviewer.core;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ViewerCallback.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface j extends com.heybox.imageviewer.e {

    /* JADX INFO: compiled from: ViewerCallback.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d j jVar, @dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
            if (PatchProxy.proxy(new Object[]{jVar, viewHolder, view, new Float(f10)}, null, changeQuickRedirect, true, bb.c.b.f30851p0, new Class[]{j.class, RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(view, "view");
        }

        public static void b(@dl.d j jVar, long j10) {
        }

        public static void c(@dl.d j jVar, @dl.d RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{jVar, viewHolder, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.b.f30828o0, new Class[]{j.class, RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
        }

        public static void d(@dl.d j jVar, int i10) {
        }

        public static void e(@dl.d j jVar, int i10, float f10, int i11) {
        }

        public static void f(@dl.d j jVar, int i10, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{jVar, new Integer(i10), viewHolder}, null, changeQuickRedirect, true, bb.c.b.f30918s0, new Class[]{j.class, Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
        }

        public static void g(@dl.d j jVar, @dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view) {
            if (PatchProxy.proxy(new Object[]{jVar, viewHolder, view}, null, changeQuickRedirect, true, bb.c.b.f30896r0, new Class[]{j.class, RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(view, "view");
        }

        public static void h(@dl.d j jVar, @dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
            if (PatchProxy.proxy(new Object[]{jVar, viewHolder, view, new Float(f10)}, null, changeQuickRedirect, true, 172, new Class[]{j.class, RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(view, "view");
        }
    }

    @Override // com.heybox.imageviewer.e
    void a(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10);

    @Override // com.heybox.imageviewer.e
    void b(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10);

    @Override // com.heybox.imageviewer.e
    void c(@dl.d RecyclerView.ViewHolder viewHolder, int i10);

    @Override // com.heybox.imageviewer.e
    void d(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view);

    void f(long j10);

    void i(int i10, @dl.d RecyclerView.ViewHolder viewHolder);

    void onPageScrollStateChanged(int i10);

    void onPageScrolled(int i10, float f10, int i11);
}
