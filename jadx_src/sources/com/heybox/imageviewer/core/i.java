package com.heybox.imageviewer.core;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VHCustomizer.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface i {

    /* JADX INFO: compiled from: VHCustomizer.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d i iVar, int i10, @dl.d d data, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{iVar, new Integer(i10), data, viewHolder}, null, changeQuickRedirect, true, bb.c.b.f30782m0, new Class[]{i.class, Integer.TYPE, d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            f0.p(viewHolder, "viewHolder");
        }

        public static void b(@dl.d i iVar, @dl.d Context context, @dl.d com.heybox.imageviewer.utils.c builder) {
            if (PatchProxy.proxy(new Object[]{iVar, context, builder}, null, changeQuickRedirect, true, 169, new Class[]{i.class, Context.class, com.heybox.imageviewer.utils.c.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(builder, "builder");
        }

        public static void c(@dl.d i iVar, int i10, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{iVar, new Integer(i10), viewHolder}, null, changeQuickRedirect, true, 167, new Class[]{i.class, Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
        }
    }

    void e(int i10, @dl.d d dVar, @dl.d RecyclerView.ViewHolder viewHolder);

    void g(int i10, @dl.d RecyclerView.ViewHolder viewHolder);

    void j(@dl.d Context context, @dl.d com.heybox.imageviewer.utils.c cVar);
}
