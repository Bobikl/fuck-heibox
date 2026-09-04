package com.max.component.adapter.tree;

import android.view.View;
import androidx.annotation.d0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TreeViewBinder.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e implements com.max.component.adapter.tree.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TreeViewBinder.kt */
    public static class a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d View rootView) {
            super(rootView);
            f0.p(rootView, "rootView");
        }

        @dl.d
        public final <T extends View> T findViewById(@d0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Wl, new Class[]{Integer.TYPE}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            T t10 = (T) this.itemView.findViewById(i10);
            f0.o(t10, "findViewById(...)");
            return t10;
        }
    }

    public abstract void a(@dl.d RecyclerView.ViewHolder viewHolder, int i10, @dl.d b<?> bVar);

    @dl.d
    public abstract RecyclerView.ViewHolder b(@dl.d View view);
}
