package com.heybox.imageviewer.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.heybox.imageviewer.widgets.video.ExoVideoView2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.z;
import yh.l;

/* JADX INFO: compiled from: Components.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class Components {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f59731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static com.heybox.imageviewer.core.b f59732c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static com.heybox.imageviewer.core.a f59733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private static h f59734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private static i f59735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private static com.heybox.imageviewer.core.c f59736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private static j f59737h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final Components f59730a = new Components();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final z f59738i = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<ExecutorService>() { // from class: com.heybox.imageviewer.core.Components$threadPoolExecutor$2
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ExecutorService a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 149, new Class[0], ExecutorService.class);
            return patchProxyResultProxy.isSupported ? (ExecutorService) patchProxyResultProxy.result : Executors.newFixedThreadPool(10);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ ExecutorService invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 150, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: Components.kt */
    public static final class a implements com.heybox.imageviewer.core.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.heybox.imageviewer.core.a
        public void a(@dl.d List<? extends com.heybox.imageviewer.core.d> list, @dl.d com.heybox.imageviewer.core.d dVar) {
            if (PatchProxy.proxy(new Object[]{list, dVar}, this, changeQuickRedirect, false, 131, new Class[]{List.class, com.heybox.imageviewer.core.d.class}, Void.TYPE).isSupported) {
                return;
            }
            com.heybox.imageviewer.core.a.C0493a.a(this, list, dVar);
        }

        @Override // com.heybox.imageviewer.core.a
        @dl.d
        public List<com.heybox.imageviewer.core.d> b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 130, new Class[0], List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : com.heybox.imageviewer.core.a.C0493a.c(this);
        }

        @Override // com.heybox.imageviewer.core.a
        public void c(long j10, @dl.d l<? super List<? extends com.heybox.imageviewer.core.d>, b2> lVar) {
            if (PatchProxy.proxy(new Object[]{new Long(j10), lVar}, this, changeQuickRedirect, false, 128, new Class[]{Long.TYPE, l.class}, Void.TYPE).isSupported) {
                return;
            }
            com.heybox.imageviewer.core.a.C0493a.b(this, j10, lVar);
        }

        @Override // com.heybox.imageviewer.core.a
        @dl.d
        public List<com.heybox.imageviewer.core.d> d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 127, new Class[0], List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : com.heybox.imageviewer.core.a.C0493a.e(this);
        }

        @Override // com.heybox.imageviewer.core.a
        public void e(long j10, @dl.d l<? super List<? extends com.heybox.imageviewer.core.d>, b2> lVar) {
            if (PatchProxy.proxy(new Object[]{new Long(j10), lVar}, this, changeQuickRedirect, false, 129, new Class[]{Long.TYPE, l.class}, Void.TYPE).isSupported) {
                return;
            }
            com.heybox.imageviewer.core.a.C0493a.d(this, j10, lVar);
        }
    }

    /* JADX INFO: compiled from: Components.kt */
    public static final class b implements com.heybox.imageviewer.core.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.heybox.imageviewer.core.b
        public void a(@dl.d ExoVideoView2 exoVideoView2, @dl.d com.heybox.imageviewer.core.d dVar, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{exoVideoView2, dVar, viewHolder}, this, changeQuickRedirect, false, 134, new Class[]{ExoVideoView2.class, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            com.heybox.imageviewer.core.b.a.c(this, exoVideoView2, dVar, viewHolder);
        }

        @Override // com.heybox.imageviewer.core.b
        public void b(@dl.d SubsamplingScaleImageView subsamplingScaleImageView, @dl.d com.heybox.imageviewer.core.d dVar, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{subsamplingScaleImageView, dVar, viewHolder}, this, changeQuickRedirect, false, 133, new Class[]{SubsamplingScaleImageView.class, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            com.heybox.imageviewer.core.b.a.b(this, subsamplingScaleImageView, dVar, viewHolder);
        }

        @Override // com.heybox.imageviewer.core.b
        @dl.e
        public Object d(@dl.d Context context, @dl.d String str, @dl.d kotlin.coroutines.c<? super Boolean> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, cVar}, this, changeQuickRedirect, false, 135, new Class[]{Context.class, String.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : com.heybox.imageviewer.core.b.a.d(this, context, str, cVar);
        }

        @Override // com.heybox.imageviewer.core.b
        public void e(@dl.d ImageView imageView, @dl.d com.heybox.imageviewer.core.d dVar, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{imageView, dVar, viewHolder}, this, changeQuickRedirect, false, 132, new Class[]{ImageView.class, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            com.heybox.imageviewer.core.b.a.a(this, imageView, dVar, viewHolder);
        }
    }

    /* JADX INFO: compiled from: Components.kt */
    public static final class c implements com.heybox.imageviewer.core.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.heybox.imageviewer.core.c
        @dl.e
        public View h(@dl.d ViewGroup viewGroup) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 136, new Class[]{ViewGroup.class}, View.class);
            return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : com.heybox.imageviewer.core.c.a.a(this, viewGroup);
        }
    }

    /* JADX INFO: compiled from: Components.kt */
    public static final class d implements h {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.heybox.imageviewer.core.h
        @dl.e
        public ImageView a(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 137, new Class[]{Long.TYPE}, ImageView.class);
            return patchProxyResultProxy.isSupported ? (ImageView) patchProxyResultProxy.result : h.a.a(this, j10);
        }
    }

    /* JADX INFO: compiled from: Components.kt */
    public static final class e implements i {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.heybox.imageviewer.core.i
        public void e(int i10, @dl.d com.heybox.imageviewer.core.d dVar, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), dVar, viewHolder}, this, changeQuickRedirect, false, 139, new Class[]{Integer.TYPE, com.heybox.imageviewer.core.d.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            i.a.a(this, i10, dVar, viewHolder);
        }

        @Override // com.heybox.imageviewer.core.i
        public void g(int i10, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 138, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            i.a.c(this, i10, viewHolder);
        }

        @Override // com.heybox.imageviewer.core.i
        public void j(@dl.d Context context, @dl.d com.heybox.imageviewer.utils.c cVar) {
            if (PatchProxy.proxy(new Object[]{context, cVar}, this, changeQuickRedirect, false, 140, new Class[]{Context.class, com.heybox.imageviewer.utils.c.class}, Void.TYPE).isSupported) {
                return;
            }
            i.a.b(this, context, cVar);
        }
    }

    /* JADX INFO: compiled from: Components.kt */
    public static final class f implements j {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
        public void a(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 143, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            j.a.h(this, viewHolder, view, f10);
        }

        @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
        public void b(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 142, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            j.a.a(this, viewHolder, view, f10);
        }

        @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
        public void c(@dl.d RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 141, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            j.a.c(this, viewHolder, i10);
        }

        @Override // com.heybox.imageviewer.core.j, com.heybox.imageviewer.e
        public void d(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view) {
            if (PatchProxy.proxy(new Object[]{viewHolder, view}, this, changeQuickRedirect, false, 144, new Class[]{RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            j.a.g(this, viewHolder, view);
        }

        @Override // com.heybox.imageviewer.core.j
        public void f(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 148, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            j.a.b(this, j10);
        }

        @Override // com.heybox.imageviewer.core.j
        public void i(int i10, @dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 147, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            j.a.f(this, i10, viewHolder);
        }

        @Override // com.heybox.imageviewer.core.j
        public void onPageScrollStateChanged(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 145, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            j.a.d(this, i10);
        }

        @Override // com.heybox.imageviewer.core.j
        public void onPageScrolled(int i10, float f10, int i11) {
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 146, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
                return;
            }
            j.a.e(this, i10, f10, i11);
        }
    }

    private Components() {
    }

    @dl.d
    public final ExecutorService a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 119, new Class[0], ExecutorService.class);
        if (patchProxyResultProxy.isSupported) {
            return (ExecutorService) patchProxyResultProxy.result;
        }
        Object value = f59738i.getValue();
        f0.o(value, "getValue(...)");
        return (ExecutorService) value;
    }

    public final boolean b() {
        return f59731b;
    }

    public final void c(@dl.d com.heybox.imageviewer.core.b imageLoader, @dl.d com.heybox.imageviewer.core.a dataProvider, @dl.d h transformer) {
        if (PatchProxy.proxy(new Object[]{imageLoader, dataProvider, transformer}, this, changeQuickRedirect, false, 120, new Class[]{com.heybox.imageviewer.core.b.class, com.heybox.imageviewer.core.a.class, h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageLoader, "imageLoader");
        f0.p(dataProvider, "dataProvider");
        f0.p(transformer, "transformer");
        if (f59731b) {
            throw new IllegalStateException();
        }
        f59732c = imageLoader;
        f59733d = dataProvider;
        f59734e = transformer;
        f59731b = true;
    }

    public final void d() {
        f59731b = false;
        f59732c = null;
        f59733d = null;
        f59734e = null;
        f59735f = null;
        f59737h = null;
        f59736g = null;
    }

    @dl.d
    public final com.heybox.imageviewer.core.a e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 122, new Class[0], com.heybox.imageviewer.core.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.heybox.imageviewer.core.a) patchProxyResultProxy.result;
        }
        com.heybox.imageviewer.core.a aVar = f59733d;
        return aVar == null ? new a() : aVar;
    }

    @dl.d
    public final com.heybox.imageviewer.core.b f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 121, new Class[0], com.heybox.imageviewer.core.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.heybox.imageviewer.core.b) patchProxyResultProxy.result;
        }
        com.heybox.imageviewer.core.b bVar = f59732c;
        return bVar == null ? new b() : bVar;
    }

    @dl.d
    public final com.heybox.imageviewer.core.c g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 126, new Class[0], com.heybox.imageviewer.core.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.heybox.imageviewer.core.c) patchProxyResultProxy.result;
        }
        com.heybox.imageviewer.core.c cVar = f59736g;
        return cVar == null ? new c() : cVar;
    }

    @dl.d
    public final h h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 123, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        h hVar = f59734e;
        return hVar == null ? new d() : hVar;
    }

    @dl.d
    public final i i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 124, new Class[0], i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        i iVar = f59735f;
        return iVar == null ? new e() : iVar;
    }

    @dl.d
    public final j j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 125, new Class[0], j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        j jVar = f59737h;
        return jVar == null ? new f() : jVar;
    }

    public final void k(@dl.e com.heybox.imageviewer.core.c cVar) {
        f59736g = cVar;
    }

    public final void l(@dl.e i iVar) {
        f59735f = iVar;
    }

    public final void m(@dl.e j jVar) {
        f59737h = jVar;
    }
}
