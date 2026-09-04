package com.heybox.imageviewer.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.ChangeTransform;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.u;
import androidx.transition.v;
import com.heybox.imageviewer.R;
import com.heybox.imageviewer.widgets.PhotoView2;
import com.heybox.imageviewer.widgets.SubsamplingScaleImageView2;
import com.max.hbmmkv.MMKVManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TransitionEndHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TransitionEndHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TransitionEndHelper f59761a = new TransitionEndHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f59762b;
    public static ChangeQuickRedirect changeQuickRedirect;

    private TransitionEndHelper() {
    }

    public static final /* synthetic */ void d(TransitionEndHelper transitionEndHelper, View view, RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{transitionEndHelper, view, viewHolder}, null, changeQuickRedirect, true, 208, new Class[]{TransitionEndHelper.class, View.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        transitionEndHelper.m(view, viewHolder);
    }

    public static final /* synthetic */ Transition e(TransitionEndHelper transitionEndHelper) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{transitionEndHelper}, null, changeQuickRedirect, true, 207, new Class[]{TransitionEndHelper.class}, Transition.class);
        return patchProxyResultProxy.isSupported ? (Transition) patchProxyResultProxy.result : transitionEndHelper.n();
    }

    private final void f(View view, RecyclerView.ViewHolder viewHolder) {
        if (!PatchProxy.proxy(new Object[]{view, viewHolder}, this, changeQuickRedirect, false, 200, new Class[]{View.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported && (viewHolder instanceof com.heybox.imageviewer.viewholders.d)) {
            com.heybox.imageviewer.viewholders.d dVar = (com.heybox.imageviewer.viewholders.d) viewHolder;
            dVar.b().f141014b.setTranslationX(dVar.b().f141015c.getTranslationX());
            dVar.b().f141014b.setTranslationY(dVar.b().f141015c.getTranslationY());
            dVar.b().f141014b.setScaleX(dVar.b().f141015c.getScaleX());
            dVar.b().f141014b.setScaleY(dVar.b().f141015c.getScaleY());
            dVar.b().f141014b.setVisibility(0);
            dVar.b().f141015c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(yh.a tmp0) {
        if (PatchProxy.proxy(new Object[]{tmp0}, null, changeQuickRedirect, true, 206, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final void i(RecyclerView.ViewHolder viewHolder, View view) {
        if (PatchProxy.proxy(new Object[]{viewHolder, view}, this, changeQuickRedirect, false, 203, new Class[]{RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.a) {
            if (view != null) {
                ((com.heybox.imageviewer.viewholders.a) viewHolder).b().f141010b.animate().setDuration(0L).setStartDelay(Math.max(a.f59777a.d() - ((long) 20), 0L)).alpha(0.0f).start();
                return;
            } else {
                ((com.heybox.imageviewer.viewholders.a) viewHolder).b().f141010b.animate().setDuration(a.f59777a.d()).alpha(0.0f).start();
                return;
            }
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.b) {
            if (view != null) {
                ((com.heybox.imageviewer.viewholders.b) viewHolder).b().f141012b.animate().setDuration(0L).setStartDelay(Math.max(a.f59777a.d() - ((long) 20), 0L)).alpha(0.0f).start();
                return;
            } else {
                ((com.heybox.imageviewer.viewholders.b) viewHolder).b().f141012b.animate().setDuration(a.f59777a.d()).alpha(0.0f).start();
                return;
            }
        }
        if (viewHolder instanceof com.heybox.imageviewer.viewholders.d) {
            if (view != null) {
                ((com.heybox.imageviewer.viewholders.d) viewHolder).b().f141014b.animate().setDuration(0L).setStartDelay(Math.max(a.f59777a.d() - ((long) 20), 0L)).alpha(0.0f).start();
            } else {
                ((com.heybox.imageviewer.viewholders.d) viewHolder).b().f141014b.animate().setDuration(a.f59777a.d()).alpha(0.0f).start();
            }
        }
    }

    static /* synthetic */ void j(TransitionEndHelper transitionEndHelper, RecyclerView.ViewHolder viewHolder, View view, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{transitionEndHelper, viewHolder, view, new Integer(i10), obj}, null, changeQuickRedirect, true, 204, new Class[]{TransitionEndHelper.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            view = null;
        }
        transitionEndHelper.i(viewHolder, view);
    }

    private final void k(View view, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{view, iArr}, this, changeQuickRedirect, false, 205, new Class[]{View.class, int[].class}, Void.TYPE).isSupported) {
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

    private final void m(View view, RecyclerView.ViewHolder viewHolder) {
        ImageView.ScaleType scaleType;
        if (PatchProxy.proxy(new Object[]{view, viewHolder}, this, changeQuickRedirect, false, 201, new Class[]{View.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
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
            aVar.b().f141010b.setTranslationX(0.0f);
            aVar.b().f141010b.setTranslationY(0.0f);
            aVar.b().f141010b.setScaleX(1.0f);
            aVar.b().f141010b.setScaleY(1.0f);
            i(viewHolder, view);
            PhotoView2 photoView3 = aVar.b().f141010b;
            ViewGroup.LayoutParams layoutParams = aVar.b().f141010b.getLayoutParams();
            layoutParams.width = view != null ? view.getWidth() : layoutParams.width;
            layoutParams.height = view != null ? view.getHeight() : layoutParams.height;
            int[] iArr = new int[2];
            f59761a.k(view, iArr);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(iArr[0]);
                marginLayoutParams.topMargin = iArr[1] - a.f59777a.h();
            }
            photoView3.setLayoutParams(layoutParams);
            return;
        }
        if (!(viewHolder instanceof com.heybox.imageviewer.viewholders.b)) {
            if (viewHolder instanceof com.heybox.imageviewer.viewholders.d) {
                com.heybox.imageviewer.viewholders.d dVar = (com.heybox.imageviewer.viewholders.d) viewHolder;
                dVar.b().f141014b.setTranslationX(0.0f);
                dVar.b().f141014b.setTranslationY(0.0f);
                dVar.b().f141014b.setScaleX(view != null ? 1.0f : 2.0f);
                dVar.b().f141014b.setScaleY(view == null ? 2.0f : 1.0f);
                i(viewHolder, view);
                dVar.b().f141015c.g();
                ImageView imageView2 = dVar.b().f141014b;
                ViewGroup.LayoutParams layoutParams2 = dVar.b().f141014b.getLayoutParams();
                layoutParams2.width = view != null ? view.getWidth() : layoutParams2.width;
                layoutParams2.height = view != null ? view.getHeight() : layoutParams2.height;
                int[] iArr2 = new int[2];
                f59761a.k(view, iArr2);
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginStart(iArr2[0]);
                    marginLayoutParams2.topMargin = iArr2[1] - a.f59777a.h();
                }
                imageView2.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        com.heybox.imageviewer.viewholders.b bVar = (com.heybox.imageviewer.viewholders.b) viewHolder;
        bVar.b().f141012b.setTranslationX(0.0f);
        bVar.b().f141012b.setTranslationY(0.0f);
        if (MMKVManager.f71329a.d("common", ad.c.f1227g, false, false)) {
            bVar.b().f141012b.setScaleX(1.0f);
            bVar.b().f141012b.setScaleY(1.0f);
            i(viewHolder, view);
        } else {
            bVar.b().f141012b.setScaleX(view != null ? 2.0f : 1.0f);
            bVar.b().f141012b.setScaleY(view != null ? 2.0f : 1.0f);
            j(this, viewHolder, null, 2, null);
        }
        SubsamplingScaleImageView2 subsamplingScaleImageView2 = bVar.b().f141012b;
        ViewGroup.LayoutParams layoutParams3 = bVar.b().f141012b.getLayoutParams();
        layoutParams3.width = view != null ? view.getWidth() : layoutParams3.width;
        layoutParams3.height = view != null ? view.getHeight() : layoutParams3.height;
        int[] iArr3 = new int[2];
        f59761a.k(view, iArr3);
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginStart(iArr3[0]);
            marginLayoutParams3.topMargin = iArr3[1] - a.f59777a.h();
        }
        subsamplingScaleImageView2.setLayoutParams(layoutParams3);
    }

    private final Transition n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 202, new Class[0], Transition.class);
        if (patchProxyResultProxy.isSupported) {
            return (Transition) patchProxyResultProxy.result;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.N0(new ChangeBounds());
        transitionSet.N0(new ChangeImageTransform());
        transitionSet.N0(new ChangeTransform());
        transitionSet.w0(a.f59777a.d());
        transitionSet.y0(new DecelerateInterpolator());
        return transitionSet;
    }

    public final void g(@dl.d final j fragment, @dl.e final View view, @dl.d final RecyclerView.ViewHolder holder) {
        if (PatchProxy.proxy(new Object[]{fragment, view, holder}, this, changeQuickRedirect, false, 199, new Class[]{j.class, View.class, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "fragment");
        f0.p(holder, "holder");
        View view2 = fragment.getView();
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.viewer_need_hide_view_when_end) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
        View viewFindViewById2 = holder.itemView.findViewById(R.id.viewer_need_hide_view_when_end2);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(4);
        }
        f(view, holder);
        final yh.a<b2> aVar = new yh.a<b2>() { // from class: com.heybox.imageviewer.utils.TransitionEndHelper$end$doTransition$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: TransitionEndHelper.kt */
            public static final class a extends u {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ j f59769b;

                a(j jVar) {
                    this.f59769b = jVar;
                }

                @Override // androidx.transition.u, androidx.transition.Transition.h
                public void b(@dl.d Transition transition) {
                    if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, 213, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(transition, "transition");
                    TransitionEndHelper transitionEndHelper = TransitionEndHelper.f59761a;
                    TransitionEndHelper.f59762b = true;
                }

                @Override // androidx.transition.u, androidx.transition.Transition.h
                public void d(@dl.d Transition transition) {
                    if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, bb.c.b.f30645g1, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(transition, "transition");
                    if (TransitionEndHelper.f59762b) {
                        TransitionEndHelper transitionEndHelper = TransitionEndHelper.f59761a;
                        TransitionEndHelper.f59762b = false;
                        this.f59769b.dismissAllowingStateLoss();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 212, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 211, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                View view3 = holder.itemView;
                f0.n(view3, "null cannot be cast to non-null type android.view.ViewGroup");
                TransitionEndHelper transitionEndHelper = TransitionEndHelper.f59761a;
                Transition transitionE = TransitionEndHelper.e(transitionEndHelper);
                transitionE.a(new a(fragment));
                v.b((ViewGroup) view3, transitionE);
                TransitionEndHelper.d(transitionEndHelper, view, holder);
            }
        };
        holder.itemView.post(new Runnable() { // from class: com.heybox.imageviewer.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                TransitionEndHelper.h(aVar);
            }
        });
        fragment.getLifecycle().a(new TransitionEndHelper$end$1(fragment, holder, aVar));
    }

    public final boolean l() {
        return f59762b;
    }
}
