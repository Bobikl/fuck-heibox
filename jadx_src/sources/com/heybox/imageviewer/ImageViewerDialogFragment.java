package com.heybox.imageviewer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.paging.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.utils.TransitionEndHelper;
import com.heybox.imageviewer.utils.TransitionStartHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;

/* JADX INFO: compiled from: ImageViewerDialogFragment.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nImageViewerDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerDialogFragment.kt\ncom/heybox/imageviewer/ImageViewerDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1#2:198\n*E\n"})
public class ImageViewerDialogFragment extends b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private w9.a f59594b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f59603k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f59595c = b0.c(new yh.a<k>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$viewModel$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @dl.d
        public final k a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 79, new Class[0], k.class);
            return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : (k) new y0(this.f59619b).a(k.class);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.k, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ k invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 80, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final z f59596d = b0.c(new yh.a<d>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$actions$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @dl.d
        public final d a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 52, new Class[0], d.class);
            if (patchProxyResultProxy.isSupported) {
                return (d) patchProxyResultProxy.result;
            }
            FragmentActivity fragmentActivityRequireActivity = this.f59607b.requireActivity();
            f0.o(fragmentActivityRequireActivity, "requireActivity(...)");
            return (d) new y0(fragmentActivityRequireActivity).a(d.class);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.d, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ d invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 53, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final z f59597e = b0.c(new yh.a<com.heybox.imageviewer.core.j>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$userCallback$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final com.heybox.imageviewer.core.j a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 77, new Class[0], com.heybox.imageviewer.core.j.class);
            return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.j) patchProxyResultProxy.result : Components.f59730a.j();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.core.j, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ com.heybox.imageviewer.core.j invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 78, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final z f59598f = b0.c(new yh.a<Long>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$initKey$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final Long a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 64, new Class[0], Long.class);
            return patchProxyResultProxy.isSupported ? (Long) patchProxyResultProxy.result : Long.valueOf(((com.heybox.imageviewer.core.d) CollectionsKt___CollectionsKt.w2(Components.f59730a.e().d())).id());
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ Long invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 65, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final z f59599g = b0.c(new yh.a<com.heybox.imageviewer.core.h>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$transformer$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final com.heybox.imageviewer.core.h a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 75, new Class[0], com.heybox.imageviewer.core.h.class);
            return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.h) patchProxyResultProxy.result : Components.f59730a.h();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.core.h, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ com.heybox.imageviewer.core.h invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 76, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final z f59600h = b0.c(new yh.a<com.heybox.imageviewer.adapter.a>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$adapter$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @dl.d
        public final com.heybox.imageviewer.adapter.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 54, new Class[0], com.heybox.imageviewer.adapter.a.class);
            return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.adapter.a) patchProxyResultProxy.result : new com.heybox.imageviewer.adapter.a(ImageViewerDialogFragment.X3(this.f59608b));
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.adapter.a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ com.heybox.imageviewer.adapter.a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 55, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f59601i = 110;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final z f59604l = b0.c(new yh.a<ImageViewerDialogFragment$adapterListener$2.a>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$adapterListener$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ImageViewerDialogFragment.kt */
        @t0({"SMAP\nImageViewerDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerDialogFragment.kt\ncom/heybox/imageviewer/ImageViewerDialogFragment$adapterListener$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1#2:198\n*E\n"})
        public static final class a implements e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ImageViewerDialogFragment f59610a;

            a(ImageViewerDialogFragment imageViewerDialogFragment) {
                this.f59610a = imageViewerDialogFragment;
            }

            @Override // com.heybox.imageviewer.e
            public void a(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
                if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 60, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(view, "view");
                ImageViewerDialogFragment.W3(this.f59610a).f141006b.D(com.heybox.imageviewer.utils.a.f59777a.j());
                ImageViewerDialogFragment.b4(this.f59610a).a(viewHolder, view, f10);
            }

            @Override // com.heybox.imageviewer.e
            public void b(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
                if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 59, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(view, "view");
                ImageViewerDialogFragment.W3(this.f59610a).f141006b.F(f10, com.heybox.imageviewer.utils.a.f59777a.j(), 0);
                ImageViewerDialogFragment.b4(this.f59610a).b(viewHolder, view, f10);
            }

            @Override // com.heybox.imageviewer.e
            public void c(@dl.d RecyclerView.ViewHolder viewHolder, int i10) {
                if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 58, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                TransitionStartHelper transitionStartHelper = TransitionStartHelper.f59770a;
                ImageViewerDialogFragment imageViewerDialogFragment = this.f59610a;
                transitionStartHelper.k(imageViewerDialogFragment, ImageViewerDialogFragment.a4(imageViewerDialogFragment).a(ImageViewerDialogFragment.X3(this.f59610a)), viewHolder);
                ImageViewerDialogFragment.W3(this.f59610a).f141006b.D(com.heybox.imageviewer.utils.a.f59777a.j());
                ImageViewerDialogFragment.b4(this.f59610a).c(viewHolder, i10);
            }

            @Override // com.heybox.imageviewer.e
            public void d(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view) {
                if (PatchProxy.proxy(new Object[]{viewHolder, view}, this, changeQuickRedirect, false, 61, new Class[]{RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(view, "view");
                Object tag = view.getTag(R.id.viewer_adapter_item_key);
                ImageView imageViewA = null;
                Long l10 = tag instanceof Long ? (Long) tag : null;
                if (l10 != null) {
                    imageViewA = ImageViewerDialogFragment.a4(this.f59610a).a(l10.longValue());
                }
                TransitionEndHelper.f59761a.g(this.f59610a, imageViewA, viewHolder);
                ImageViewerDialogFragment.W3(this.f59610a).f141006b.D(0);
                ImageViewerDialogFragment.b4(this.f59610a).d(viewHolder, view);
            }
        }

        {
            super(0);
        }

        @dl.d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 56, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(this.f59609b);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.ImageViewerDialogFragment$adapterListener$2$a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 57, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final z f59605m = b0.c(new yh.a<ImageViewerDialogFragment$pagerCallback$2.a>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$pagerCallback$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ImageViewerDialogFragment.kt */
        public static final class a extends ViewPager2.OnPageChangeCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ImageViewerDialogFragment f59616a;

            a(ImageViewerDialogFragment imageViewerDialogFragment) {
                this.f59616a = imageViewerDialogFragment;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 72, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                ImageViewerDialogFragment.b4(this.f59616a).onPageScrollStateChanged(i10);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i10, float f10, int i11) {
                Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 73, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
                    return;
                }
                ImageViewerDialogFragment.b4(this.f59616a).onPageScrolled(i10, f10, i11);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 74, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                long jId = ImageViewerDialogFragment.c4(this.f59616a).e().get(i10).id();
                ViewPager2 viewer = ImageViewerDialogFragment.W3(this.f59616a).f141008d;
                f0.o(viewer, "viewer");
                View viewA = com.heybox.imageviewer.utils.b.a(viewer, R.id.viewer_adapter_item_key, Long.valueOf(jId));
                Object tag = viewA != null ? viewA.getTag(R.id.viewer_adapter_item_holder) : null;
                RecyclerView.ViewHolder viewHolder = tag instanceof RecyclerView.ViewHolder ? (RecyclerView.ViewHolder) tag : null;
                if (viewHolder == null) {
                    return;
                }
                if (!this.f59616a.f59602j) {
                    ImageViewerDialogFragment.d4(this.f59616a).removeMessages(this.f59616a.f59601i);
                    ImageViewerDialogFragment.b4(this.f59616a).i(i10, viewHolder);
                } else {
                    this.f59616a.f59602j = false;
                    ImageViewerDialogFragment.d4(this.f59616a).removeMessages(this.f59616a.f59601i);
                    ImageViewerDialogFragment.d4(this.f59616a).sendMessageDelayed(Message.obtain(ImageViewerDialogFragment.d4(this.f59616a), this.f59616a.f59601i, i10, 0, viewHolder), com.heybox.imageviewer.utils.a.f59777a.k());
                }
            }
        }

        {
            super(0);
        }

        @dl.d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 70, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(this.f59615b);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.heybox.imageviewer.ImageViewerDialogFragment$pagerCallback$2$a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 71, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final z f59606n = b0.c(new ImageViewerDialogFragment$viewerHandler$2(this));

    /* JADX INFO: compiled from: ImageViewerDialogFragment.kt */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public ImageViewerDialogFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51, new Class[0], ImageViewerDialogFragment.class);
            return patchProxyResultProxy.isSupported ? (ImageViewerDialogFragment) patchProxyResultProxy.result : new ImageViewerDialogFragment();
        }
    }

    public static final /* synthetic */ com.heybox.imageviewer.adapter.a V3(ImageViewerDialogFragment imageViewerDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewerDialogFragment}, null, changeQuickRedirect, true, 44, new Class[]{ImageViewerDialogFragment.class}, com.heybox.imageviewer.adapter.a.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.adapter.a) patchProxyResultProxy.result : imageViewerDialogFragment.g4();
    }

    public static final /* synthetic */ w9.a W3(ImageViewerDialogFragment imageViewerDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewerDialogFragment}, null, changeQuickRedirect, true, 45, new Class[]{ImageViewerDialogFragment.class}, w9.a.class);
        return patchProxyResultProxy.isSupported ? (w9.a) patchProxyResultProxy.result : imageViewerDialogFragment.i4();
    }

    public static final /* synthetic */ long X3(ImageViewerDialogFragment imageViewerDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewerDialogFragment}, null, changeQuickRedirect, true, 46, new Class[]{ImageViewerDialogFragment.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : imageViewerDialogFragment.j4();
    }

    public static final /* synthetic */ com.heybox.imageviewer.core.h a4(ImageViewerDialogFragment imageViewerDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewerDialogFragment}, null, changeQuickRedirect, true, 47, new Class[]{ImageViewerDialogFragment.class}, com.heybox.imageviewer.core.h.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.h) patchProxyResultProxy.result : imageViewerDialogFragment.l4();
    }

    public static final /* synthetic */ com.heybox.imageviewer.core.j b4(ImageViewerDialogFragment imageViewerDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewerDialogFragment}, null, changeQuickRedirect, true, 48, new Class[]{ImageViewerDialogFragment.class}, com.heybox.imageviewer.core.j.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.j) patchProxyResultProxy.result : imageViewerDialogFragment.m4();
    }

    public static final /* synthetic */ k c4(ImageViewerDialogFragment imageViewerDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewerDialogFragment}, null, changeQuickRedirect, true, 49, new Class[]{ImageViewerDialogFragment.class}, k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : imageViewerDialogFragment.n4();
    }

    public static final /* synthetic */ Handler d4(ImageViewerDialogFragment imageViewerDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewerDialogFragment}, null, changeQuickRedirect, true, 50, new Class[]{ImageViewerDialogFragment.class}, Handler.class);
        return patchProxyResultProxy.isSupported ? (Handler) patchProxyResultProxy.result : imageViewerDialogFragment.o4();
    }

    private final d f4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26, new Class[0], d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : (d) this.f59596d.getValue();
    }

    private final com.heybox.imageviewer.adapter.a g4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30, new Class[0], com.heybox.imageviewer.adapter.a.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.adapter.a) patchProxyResultProxy.result : (com.heybox.imageviewer.adapter.a) this.f59600h.getValue();
    }

    private final ImageViewerDialogFragment$adapterListener$2.a h4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35, new Class[0], ImageViewerDialogFragment$adapterListener$2.a.class);
        return patchProxyResultProxy.isSupported ? (ImageViewerDialogFragment$adapterListener$2.a) patchProxyResultProxy.result : (ImageViewerDialogFragment$adapterListener$2.a) this.f59604l.getValue();
    }

    private final w9.a i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24, new Class[0], w9.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (w9.a) patchProxyResultProxy.result;
        }
        w9.a aVar = this.f59594b;
        f0.m(aVar);
        return aVar;
    }

    private final long j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : ((Number) this.f59598f.getValue()).longValue();
    }

    private final ImageViewerDialogFragment$pagerCallback$2.a k4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36, new Class[0], ImageViewerDialogFragment$pagerCallback$2.a.class);
        return patchProxyResultProxy.isSupported ? (ImageViewerDialogFragment$pagerCallback$2.a) patchProxyResultProxy.result : (ImageViewerDialogFragment$pagerCallback$2.a) this.f59605m.getValue();
    }

    private final com.heybox.imageviewer.core.h l4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29, new Class[0], com.heybox.imageviewer.core.h.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.h) patchProxyResultProxy.result : (com.heybox.imageviewer.core.h) this.f59599g.getValue();
    }

    private final com.heybox.imageviewer.core.j m4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27, new Class[0], com.heybox.imageviewer.core.j.class);
        return patchProxyResultProxy.isSupported ? (com.heybox.imageviewer.core.j) patchProxyResultProxy.result : (com.heybox.imageviewer.core.j) this.f59597e.getValue();
    }

    private final k n4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25, new Class[0], k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : (k) this.f59595c.getValue();
    }

    private final Handler o4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40, new Class[0], Handler.class);
        return patchProxyResultProxy.isSupported ? (Handler) patchProxyResultProxy.result : (Handler) this.f59606n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void p4(Pair<String, ? extends Object> pair) {
        if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 34, new Class[]{Pair.class}, Void.TYPE).isSupported) {
        }
        String strE = pair != null ? pair.e() : null;
        if (strE != null) {
            switch (strE.hashCode()) {
                case -1811086742:
                    if (strE.equals(l.f59757b)) {
                        ViewPager2 viewPager2 = i4().f141008d;
                        Object objF = pair.f();
                        f0.n(objF, "null cannot be cast to non-null type kotlin.Int");
                        viewPager2.setCurrentItem(Math.max(((Integer) objF).intValue(), 0));
                        break;
                    }
                    break;
                case -313871972:
                    if (strE.equals(l.f59759d)) {
                        n4().g(g4(), pair.f(), new yh.a<b2>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment$handle$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 63, new Class[0], Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 62, new Class[0], Void.TYPE).isSupported) {
                                    return;
                                }
                                this.f59611b.onBackPressed();
                            }
                        });
                        break;
                    }
                    break;
                case 1085444827:
                    if (strE.equals("refresh")) {
                        com.heybox.imageviewer.adapter.a aVarG4 = g4();
                        Object objF2 = pair.f();
                        f0.n(objF2, "null cannot be cast to non-null type kotlin.Int");
                        aVarG4.notifyItemChanged(((Integer) objF2).intValue());
                        break;
                    }
                    break;
                case 1671672458:
                    if (strE.equals(l.f59758c)) {
                        onBackPressed();
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(ImageViewerDialogFragment this$0, y source, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{this$0, source, event}, null, changeQuickRedirect, true, 41, new Class[]{ImageViewerDialogFragment.class, y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(source, "source");
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            this$0.f59603k = SystemClock.elapsedRealtime();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            this$0.m4().f(SystemClock.elapsedRealtime() - this$0.f59603k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(yh.l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, 42, new Class[]{yh.l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(yh.l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, 43, new Class[]{yh.l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.heybox.imageviewer.b
    public void P3(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.P3(str);
        Components.f59730a.d();
    }

    @Override // com.heybox.imageviewer.b
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39, new Class[0], Void.TYPE).isSupported || TransitionStartHelper.f59770a.j()) {
            return;
        }
        TransitionEndHelper transitionEndHelper = TransitionEndHelper.f59761a;
        if (transitionEndHelper.l()) {
            return;
        }
        long jId = n4().e().get(i4().f141008d.getCurrentItem()).id();
        ViewPager2 viewer = i4().f141008d;
        f0.o(viewer, "viewer");
        int i10 = R.id.viewer_adapter_item_key;
        View viewA = com.heybox.imageviewer.utils.b.a(viewer, i10, Long.valueOf(jId));
        if (viewA != null) {
            com.heybox.imageviewer.core.h hVarL4 = l4();
            Object tag = viewA.getTag(i10);
            f0.n(tag, "null cannot be cast to non-null type kotlin.Long");
            ImageView imageViewA = hVarL4.a(((Long) tag).longValue());
            i4().f141006b.D(0);
            Object tag2 = viewA.getTag(R.id.viewer_adapter_item_holder);
            RecyclerView.ViewHolder viewHolder = tag2 instanceof RecyclerView.ViewHolder ? (RecyclerView.ViewHolder) tag2 : null;
            if (viewHolder != null) {
                transitionEndHelper.g(this, imageViewA, viewHolder);
                m4().d(viewHolder, viewA);
            }
        }
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 31, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        if (Components.f59730a.b()) {
            return;
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 32, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        w9.a aVarD = this.f59594b;
        if (aVarD == null) {
            aVarD = w9.a.d(inflater, viewGroup, false);
        }
        this.f59594b = aVarD;
        return i4().b();
    }

    @Override // com.heybox.imageviewer.b, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        o4().removeMessages(this.f59601i);
        g4().C(null);
        i4().f141008d.unregisterOnPageChangeCallback(k4());
        i4().f141008d.setAdapter(null);
        this.f59594b = null;
        Components.f59730a.d();
    }

    @Override // com.heybox.imageviewer.b, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        g4().C(h4());
        View childAt = i4().f141008d.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setClipChildren(false);
            recyclerView.setItemAnimator(null);
        }
        ViewPager2 viewPager2 = i4().f141008d;
        com.heybox.imageviewer.utils.a aVar = com.heybox.imageviewer.utils.a.f59777a;
        viewPager2.setOrientation(aVar.l());
        viewPager2.registerOnPageChangeCallback(k4());
        viewPager2.setOffscreenPageLimit(aVar.e());
        viewPager2.setAdapter(g4());
        getLifecycle().a(new v() { // from class: com.heybox.imageviewer.f
            @Override // androidx.lifecycle.v
            public final void d(y yVar, Lifecycle.Event event) {
                ImageViewerDialogFragment.q4(this.f59748b, yVar, event);
            }
        });
        com.heybox.imageviewer.core.c cVarG = Components.f59730a.g();
        ConstraintLayout overlayView = i4().f141007c;
        f0.o(overlayView, "overlayView");
        View viewH = cVarG.h(overlayView);
        if (viewH != null) {
            ConstraintLayout overlayView2 = i4().f141007c;
            f0.o(overlayView2, "overlayView");
            overlayView2.addView(viewH);
        }
        LiveData<o0<com.heybox.imageviewer.core.d>> liveDataC = n4().c();
        y viewLifecycleOwner = getViewLifecycleOwner();
        final yh.l<o0<com.heybox.imageviewer.core.d>, b2> lVar = new yh.l<o0<com.heybox.imageviewer.core.d>, b2>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment.onViewCreated.5
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(o0<com.heybox.imageviewer.core.d> o0Var) {
                if (PatchProxy.proxy(new Object[]{o0Var}, this, changeQuickRedirect, false, 66, new Class[]{o0.class}, Void.TYPE).isSupported) {
                    return;
                }
                ImageViewerDialogFragment.this.f59602j = true;
                com.heybox.imageviewer.adapter.a aVarV3 = ImageViewerDialogFragment.V3(ImageViewerDialogFragment.this);
                Lifecycle lifecycle = ImageViewerDialogFragment.this.getViewLifecycleOwner().getLifecycle();
                f0.o(lifecycle, "getLifecycle(...)");
                f0.m(o0Var);
                aVarV3.w(lifecycle, o0Var);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(o0<com.heybox.imageviewer.core.d> o0Var) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{o0Var}, this, changeQuickRedirect, false, 67, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(o0Var);
                return b2.f124493a;
            }
        };
        liveDataC.k(viewLifecycleOwner, new j0() { // from class: com.heybox.imageviewer.g
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                ImageViewerDialogFragment.r4(lVar, obj);
            }
        });
        i0<Boolean> i0VarF = n4().f();
        y viewLifecycleOwner2 = getViewLifecycleOwner();
        final yh.l<Boolean, b2> lVar2 = new yh.l<Boolean, b2>() { // from class: com.heybox.imageviewer.ImageViewerDialogFragment.onViewCreated.6
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 68, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                ImageViewerDialogFragment.W3(ImageViewerDialogFragment.this).f141008d.setUserInputEnabled(bool != null ? bool.booleanValue() : true);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 69, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool);
                return b2.f124493a;
            }
        };
        i0VarF.k(viewLifecycleOwner2, new j0() { // from class: com.heybox.imageviewer.h
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                ImageViewerDialogFragment.s4(lVar2, obj);
            }
        });
        f4().e().k(getViewLifecycleOwner(), new j0() { // from class: com.heybox.imageviewer.i
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                this.f59751a.p4((Pair) obj);
            }
        });
    }
}
