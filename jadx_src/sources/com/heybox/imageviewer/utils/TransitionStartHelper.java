package com.heybox.imageviewer.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.u;
import androidx.transition.v;
import com.heybox.imageviewer.R;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.widgets.PhotoView2;
import com.heybox.imageviewer.widgets.SubsamplingScaleImageView2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TransitionStartHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TransitionStartHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TransitionStartHelper f59770a = new TransitionStartHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f59771b;
    public static ChangeQuickRedirect changeQuickRedirect;

    private TransitionStartHelper() {
    }

    public static final /* synthetic */ void b(TransitionStartHelper transitionStartHelper, RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{transitionStartHelper, viewHolder}, null, changeQuickRedirect, true, 224, new Class[]{TransitionStartHelper.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        transitionStartHelper.g(viewHolder);
    }

    public static final /* synthetic */ void e(TransitionStartHelper transitionStartHelper, RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{transitionStartHelper, viewHolder}, null, changeQuickRedirect, true, bb.c.b.f30852p1, new Class[]{TransitionStartHelper.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        transitionStartHelper.m(viewHolder);
    }

    public static final /* synthetic */ Transition f(TransitionStartHelper transitionStartHelper) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{transitionStartHelper}, null, changeQuickRedirect, true, bb.c.b.f30829o1, new Class[]{TransitionStartHelper.class}, Transition.class);
        return patchProxyResultProxy.isSupported ? (Transition) patchProxyResultProxy.result : transitionStartHelper.n();
    }

    private final void g(RecyclerView.ViewHolder viewHolder) {
        if (!PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, 220, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported && (viewHolder instanceof com.heybox.imageviewer.viewholders.a) && ad.a.a(ad.a.f1213t, false)) {
            com.heybox.imageviewer.viewholders.a aVar = (com.heybox.imageviewer.viewholders.a) viewHolder;
            Object tag = aVar.b().f141010b.getTag(R.id.viewer_adapter_item_data);
            f0.n(tag, "null cannot be cast to non-null type com.heybox.imageviewer.core.Photo");
            com.heybox.imageviewer.core.b bVarF = Components.f59730a.f();
            PhotoView2 photoView = aVar.b().f141010b;
            f0.o(photoView, "photoView");
            bVarF.e(photoView, (com.heybox.imageviewer.core.d) tag, viewHolder);
        }
    }

    private final void h(View view, RecyclerView.ViewHolder viewHolder) {
        ImageView.ScaleType scaleType;
        if (PatchProxy.proxy(new Object[]{view, viewHolder}, this, changeQuickRedirect, false, 216, new Class[]{View.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.a) {
            com.heybox.imageviewer.viewholders.a aVar = (com.heybox.imageviewer.viewholders.a) viewHolder;
            PhotoView2 photoView2 = aVar.b().f141010b;
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView == null || (scaleType = imageView.getScaleType()) == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            photoView2.setScaleType(scaleType);
            PhotoView2 photoView3 = aVar.b().f141010b;
            ViewGroup.LayoutParams layoutParams = aVar.b().f141010b.getLayoutParams();
            layoutParams.width = view != null ? view.getWidth() : layoutParams.width;
            layoutParams.height = view != null ? view.getHeight() : layoutParams.height;
            int[] iArr = new int[2];
            f59770a.i(view, iArr);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(iArr[0]);
                marginLayoutParams.topMargin = iArr[1] - a.f59777a.h();
            }
            photoView3.setLayoutParams(layoutParams);
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.b) {
            com.heybox.imageviewer.viewholders.b bVar = (com.heybox.imageviewer.viewholders.b) viewHolder;
            SubsamplingScaleImageView2 subsamplingScaleImageView2 = bVar.b().f141012b;
            ViewGroup.LayoutParams layoutParams2 = bVar.b().f141012b.getLayoutParams();
            layoutParams2.width = view != null ? view.getWidth() : layoutParams2.width;
            layoutParams2.height = view != null ? view.getHeight() : layoutParams2.height;
            int[] iArr2 = new int[2];
            f59770a.i(view, iArr2);
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(iArr2[0]);
                marginLayoutParams2.topMargin = iArr2[1] - a.f59777a.h();
            }
            subsamplingScaleImageView2.setLayoutParams(layoutParams2);
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.d) {
            com.heybox.imageviewer.viewholders.d dVar = (com.heybox.imageviewer.viewholders.d) viewHolder;
            ImageView imageView2 = dVar.b().f141014b;
            ViewGroup.LayoutParams layoutParams3 = dVar.b().f141014b.getLayoutParams();
            layoutParams3.width = view != null ? view.getWidth() : layoutParams3.width;
            layoutParams3.height = view != null ? view.getHeight() : layoutParams3.height;
            int[] iArr3 = new int[2];
            f59770a.i(view, iArr3);
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.setMarginStart(iArr3[0]);
                marginLayoutParams3.topMargin = iArr3[1] - a.f59777a.h();
            }
            imageView2.setLayoutParams(layoutParams3);
        }
    }

    private final void i(View view, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{view, iArr}, this, changeQuickRedirect, false, 219, new Class[]{View.class, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        if (iArr[0] == 0) {
            Object tag = view != null ? view.getTag(R.id.viewer_start_view_location_0) : null;
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            iArr[0] = num != null ? num.intValue() : 0;
        }
        if (iArr[1] == 0) {
            Object tag2 = view != null ? view.getTag(R.id.viewer_start_view_location_1) : null;
            Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
            iArr[1] = num2 != null ? num2.intValue() : 0;
        }
        if (view != null && view.getLayoutDirection() == 1) {
            iArr[0] = (view.getContext().getResources().getDisplayMetrics().widthPixels - iArr[0]) - view.getWidth();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(yh.a tmp0) {
        if (PatchProxy.proxy(new Object[]{tmp0}, null, changeQuickRedirect, true, 221, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final void m(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, 217, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.a) {
            com.heybox.imageviewer.viewholders.a aVar = (com.heybox.imageviewer.viewholders.a) viewHolder;
            aVar.b().f141010b.setScaleType(ImageView.ScaleType.FIT_CENTER);
            PhotoView2 photoView2 = aVar.b().f141010b;
            ViewGroup.LayoutParams layoutParams = aVar.b().f141010b.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.topMargin = 0;
            }
            photoView2.setLayoutParams(layoutParams);
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.b) {
            com.heybox.imageviewer.viewholders.b bVar = (com.heybox.imageviewer.viewholders.b) viewHolder;
            SubsamplingScaleImageView2 subsamplingScaleImageView2 = bVar.b().f141012b;
            ViewGroup.LayoutParams layoutParams2 = bVar.b().f141012b.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(0);
                marginLayoutParams2.topMargin = 0;
            }
            subsamplingScaleImageView2.setLayoutParams(layoutParams2);
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.d) {
            com.heybox.imageviewer.viewholders.d dVar = (com.heybox.imageviewer.viewholders.d) viewHolder;
            ImageView imageView = dVar.b().f141014b;
            ViewGroup.LayoutParams layoutParams3 = dVar.b().f141014b.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.setMarginStart(0);
                marginLayoutParams3.topMargin = 0;
            }
            imageView.setLayoutParams(layoutParams3);
        }
    }

    private final Transition n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 218, new Class[0], Transition.class);
        if (patchProxyResultProxy.isSupported) {
            return (Transition) patchProxyResultProxy.result;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.N0(new ChangeBounds());
        transitionSet.N0(new ChangeImageTransform());
        transitionSet.w0(a.f59777a.d());
        transitionSet.y0(new DecelerateInterpolator());
        return transitionSet;
    }

    public final boolean j() {
        return f59771b;
    }

    public final void k(@dl.d y owner, @dl.e View view, @dl.d final RecyclerView.ViewHolder holder) {
        if (PatchProxy.proxy(new Object[]{owner, view, holder}, this, changeQuickRedirect, false, 215, new Class[]{y.class, View.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        f0.p(holder, "holder");
        h(view, holder);
        final yh.a<b2> aVar = new yh.a<b2>() { // from class: com.heybox.imageviewer.utils.TransitionStartHelper$start$doTransition$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: TransitionStartHelper.kt */
            public static final class a extends u {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ RecyclerView.ViewHolder f59776b;

                a(RecyclerView.ViewHolder viewHolder) {
                    this.f59776b = viewHolder;
                }

                @Override // androidx.transition.u, androidx.transition.Transition.h
                public void b(@dl.d Transition transition) {
                    if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, bb.c.b.f30985v1, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(transition, "transition");
                    TransitionStartHelper transitionStartHelper = TransitionStartHelper.f59770a;
                    TransitionStartHelper.f59771b = true;
                }

                @Override // androidx.transition.u, androidx.transition.Transition.h
                public void d(@dl.d Transition transition) {
                    if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, bb.c.b.f31007w1, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(transition, "transition");
                    if (TransitionStartHelper.f59771b) {
                        TransitionStartHelper transitionStartHelper = TransitionStartHelper.f59770a;
                        TransitionStartHelper.f59771b = false;
                        TransitionStartHelper.b(transitionStartHelper, this.f59776b);
                    }
                }
            }

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30963u1, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30941t1, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                View view2 = holder.itemView;
                f0.n(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                TransitionStartHelper transitionStartHelper = TransitionStartHelper.f59770a;
                Transition transitionF = TransitionStartHelper.f(transitionStartHelper);
                transitionF.a(new a(holder));
                v.b((ViewGroup) view2, transitionF);
                TransitionStartHelper.e(transitionStartHelper, holder);
            }
        };
        holder.itemView.postDelayed(new Runnable() { // from class: com.heybox.imageviewer.utils.f
            @Override // java.lang.Runnable
            public final void run() {
                TransitionStartHelper.l(aVar);
            }
        }, 50L);
        owner.getLifecycle().a(new TransitionStartHelper$start$1(owner, holder, aVar));
    }
}
