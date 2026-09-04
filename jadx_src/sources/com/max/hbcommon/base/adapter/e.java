package com.max.hbcommon.base.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface e<T> {

    /* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static <T> void a(@dl.d e<T> eVar, @dl.d g viewHolder, @dl.d s<?> adapter, T t10) {
            if (PatchProxy.proxy(new Object[]{eVar, viewHolder, adapter, t10}, null, changeQuickRedirect, true, bb.c.b.qx, new Class[]{e.class, g.class, s.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(adapter, "adapter");
        }

        public static <T> void b(@dl.d e<T> eVar, @dl.d g holder) {
            if (PatchProxy.proxy(new Object[]{eVar, holder}, null, changeQuickRedirect, true, bb.c.b.ox, new Class[]{e.class, g.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(holder, "holder");
        }

        public static <T> void c(@dl.d e<T> eVar, @dl.d g holder) {
            if (PatchProxy.proxy(new Object[]{eVar, holder}, null, changeQuickRedirect, true, bb.c.b.px, new Class[]{e.class, g.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(holder, "holder");
        }
    }

    void c(@dl.d g gVar);

    @dl.e
    Integer e(T t10);

    void h(@dl.d g gVar, @dl.d s<?> sVar, T t10);

    @dl.e
    g i(@dl.d ViewGroup viewGroup, int i10);

    @dl.e
    Pair<l, RecyclerView> j(@dl.d g gVar, @dl.d s<?> sVar, T t10);

    void l(@dl.d g gVar);
}
