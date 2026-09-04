package com.max.xiaoheihe.module.game.heybox.gamematerial.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.max.hbcommon.base.adapter.t;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.bean.bbs.ImageInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameMaterialLinkAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialLinkAdapter.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialLinkAdapterKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,225:1\n162#2,8:226\n315#2:234\n329#2,4:235\n316#2:239\n315#2:240\n329#2,4:241\n316#2:245\n*S KotlinDebug\n*F\n+ 1 GameMaterialLinkAdapter.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialLinkAdapterKt\n*L\n47#1:226,8\n94#1:234\n94#1:235,4\n94#1:239\n101#1:240\n101#1:241,4\n101#1:245\n*E\n"})
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
    public static final class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f87596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f87597c;

        a(RecyclerView recyclerView, Context context) {
            this.f87596b = recyclerView;
            this.f87597c = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 37622, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (this.f87596b.getAdapter() instanceof t) {
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                t tVar = (t) this.f87596b.getAdapter();
                f0.m(tVar);
                if (childAdapterPosition <= tVar.u() - 1) {
                    return;
                }
            }
            if (layoutParams2.getSpanIndex() % 2 == 0) {
                outRect.left = ViewUtils.f(this.f87597c, 6.0f);
                outRect.top = ViewUtils.f(this.f87597c, 6.0f);
                outRect.right = 0;
            } else {
                outRect.left = ViewUtils.f(this.f87597c, 6.0f);
                outRect.top = ViewUtils.f(this.f87597c, 6.0f);
                outRect.right = 0;
            }
        }
    }

    /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
    public static final class b extends DefaultItemAnimator {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView f87598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StaggeredGridLayoutManager f87599b;

        /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ StaggeredGridLayoutManager f87600b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecyclerView f87601c;

            a(StaggeredGridLayoutManager staggeredGridLayoutManager, RecyclerView recyclerView) {
                this.f87600b = staggeredGridLayoutManager;
                this.f87601c = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37624, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f87600b.invalidateSpanAssignments();
                this.f87601c.invalidateItemDecorations();
            }
        }

        b(RecyclerView recyclerView, StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f87598a = recyclerView;
            this.f87599b = staggeredGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public void onAnimationFinished(@dl.d RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, 37623, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            RecyclerView recyclerView = this.f87598a;
            recyclerView.post(new a(this.f87599b, recyclerView));
        }
    }

    public static final void a(@dl.e Context context, @dl.d RecyclerView mRecyclerView) {
        if (PatchProxy.proxy(new Object[]{context, mRecyclerView}, null, changeQuickRedirect, true, 37620, new Class[]{Context.class, RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mRecyclerView, "mRecyclerView");
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        mRecyclerView.setVerticalScrollBarEnabled(false);
        mRecyclerView.setHorizontalScrollBarEnabled(false);
        mRecyclerView.setClipToPadding(false);
        mRecyclerView.setClipChildren(false);
        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        mRecyclerView.setPadding(ViewUtils.f(context, 6.0f), mRecyclerView.getPaddingTop(), ViewUtils.f(context, 12.0f), mRecyclerView.getPaddingBottom());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) mRecyclerView.getItemAnimator();
        f0.m(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        new b(mRecyclerView, staggeredGridLayoutManager).setSupportsChangeAnimations(false);
        mRecyclerView.addItemDecoration(new a(mRecyclerView, context));
    }

    public static final void b(@dl.e Context context, @dl.e ImageView imageView, int i10, @dl.e ImageInfoObj imageInfoObj) {
        if (PatchProxy.proxy(new Object[]{context, imageView, new Integer(i10), imageInfoObj}, null, changeQuickRedirect, true, 37621, new Class[]{Context.class, ImageView.class, Integer.TYPE, ImageInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(imageInfoObj != null ? imageInfoObj.getWidth() : null)) {
            if (!com.max.hbcommon.utils.c.u(imageInfoObj != null ? imageInfoObj.getHeight() : null)) {
                if (!(n.p(imageInfoObj != null ? imageInfoObj.getWidth() : null) == 0.0f)) {
                    if (!(n.p(imageInfoObj != null ? imageInfoObj.getHeight() : null) == 0.0f)) {
                        if (imageInfoObj == null || context == null || imageView == null) {
                            return;
                        }
                        float fP = n.p(imageInfoObj.getWidth()) / n.p(imageInfoObj.getHeight());
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        layoutParams.width = i10;
                        if (fP > 1.0f) {
                            layoutParams.height = (int) (i10 / Math.min(1.7777778f, fP));
                        } else if (fP < 1.0f) {
                            layoutParams.height = (int) (i10 / Math.max(0.5625f, fP));
                        } else {
                            layoutParams.height = i10;
                        }
                        imageView.setLayoutParams(layoutParams);
                        return;
                    }
                }
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.width = i10;
                    layoutParams2.height = i10;
                    imageView.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            }
        }
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.width = i10;
            layoutParams3.height = i10;
            imageView.setLayoutParams(layoutParams3);
        }
    }
}
