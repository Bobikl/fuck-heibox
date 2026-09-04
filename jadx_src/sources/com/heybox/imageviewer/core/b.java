package com.heybox.imageviewer.core;

import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.heybox.imageviewer.widgets.video.ExoVideoView2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface b {

    /* JADX INFO: compiled from: ImageLoader.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d b bVar, @dl.d ImageView view, @dl.d d data, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{bVar, view, data, viewHolder}, null, changeQuickRedirect, true, 156, new Class[]{b.class, ImageView.class, d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(data, "data");
            f0.p(viewHolder, "viewHolder");
        }

        public static void b(@dl.d b bVar, @dl.d SubsamplingScaleImageView subsamplingView, @dl.d d data, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{bVar, subsamplingView, data, viewHolder}, null, changeQuickRedirect, true, bb.c.b.f30528b0, new Class[]{b.class, SubsamplingScaleImageView.class, d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(subsamplingView, "subsamplingView");
            f0.p(data, "data");
            f0.p(viewHolder, "viewHolder");
        }

        public static void c(@dl.d b bVar, @dl.d ExoVideoView2 exoVideoView, @dl.d d data, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{bVar, exoVideoView, data, viewHolder}, null, changeQuickRedirect, true, 158, new Class[]{b.class, ExoVideoView2.class, d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(exoVideoView, "exoVideoView");
            f0.p(data, "data");
            f0.p(viewHolder, "viewHolder");
        }

        @dl.e
        public static Object d(@dl.d b bVar, @dl.d Context context, @dl.d String str, @dl.d kotlin.coroutines.c<? super Boolean> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, context, str, cVar}, null, changeQuickRedirect, true, 159, new Class[]{b.class, Context.class, String.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : kotlin.coroutines.jvm.internal.a.a(false);
        }
    }

    void a(@dl.d ExoVideoView2 exoVideoView2, @dl.d d dVar, @dl.d RecyclerView.ViewHolder viewHolder);

    void b(@dl.d SubsamplingScaleImageView subsamplingScaleImageView, @dl.d d dVar, @dl.d RecyclerView.ViewHolder viewHolder);

    @dl.e
    Object d(@dl.d Context context, @dl.d String str, @dl.d kotlin.coroutines.c<? super Boolean> cVar);

    void e(@dl.d ImageView imageView, @dl.d d dVar, @dl.d RecyclerView.ViewHolder viewHolder);
}
