package com.max.xiaoheihe.module.bbs.post_edit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.paging.CombinedLoadStates;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.widget.RecyclerPreloadView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.PostModuleListObj;
import com.max.xiaoheihe.bean.bbs.PostModuleObj;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.max.xiaoheihe.bean.game.GameShotListObj;
import com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.na;
import df.p80;
import df.ug0;
import df.vg0;
import df.wg0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: PostToolV2Fragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nPostToolV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostToolV2Fragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostToolV2Fragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,728:1\n172#2,9:729\n1#3:738\n262#4,2:739\n262#4,2:741\n766#5:743\n857#5,2:744\n766#5:746\n857#5,2:747\n*S KotlinDebug\n*F\n+ 1 PostToolV2Fragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostToolV2Fragment\n*L\n83#1:729,9\n268#1:739,2\n269#1:741,2\n402#1:743\n402#1:744,2\n423#1:746\n423#1:747,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PostToolV2Fragment extends com.max.hbcommon.base.d {

    @dl.d
    public static final String A = "post_tab_type";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final a f82643u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f82644v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final String f82645w = "PostToolV2Fragment-dbg";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f82646x = 30;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f82647y = 150;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f82648z = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private PostToolsV2TabType f82649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private ug0 f82650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private vg0 f82651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private wg0 f82652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.z f82653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private GalleryPagingAdapter f82654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private GalleryPagingAdapter f82655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private GalleryPagingAdapter f82656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f82657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.adapter.p f82658k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.adapter.y f82660m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f82663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f82664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f82665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private String f82666s;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final List<PostModuleObj> f82659l = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final ArrayList<GameScreenPicShotObj> f82661n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final List<GameScreenPicShotObj> f82662o = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private HashMap<String, Uri> f82667t = new HashMap<>();

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final PostToolV2Fragment a(@dl.e PostToolsV2TabType postToolsV2TabType) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postToolsV2TabType}, this, changeQuickRedirect, false, 30706, new Class[]{PostToolsV2TabType.class}, PostToolV2Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostToolV2Fragment) patchProxyResultProxy.result;
            }
            PostToolV2Fragment postToolV2Fragment = new PostToolV2Fragment();
            Pair[] pairArr = new Pair[1];
            pairArr[0] = c1.a(PostToolV2Fragment.A, postToolsV2TabType != null ? postToolsV2TabType.name() : null);
            postToolV2Fragment.setArguments(androidx.core.os.e.b(pairArr));
            return postToolV2Fragment;
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f82669b;

        static {
            int[] iArr = new int[PostToolsV2TabType.valuesCustom().length];
            try {
                iArr[PostToolsV2TabType.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostToolsV2TabType.GAME_SHOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostToolsV2TabType.TEMPLATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f82668a = iArr;
            int[] iArr2 = new int[PostType.valuesCustom().length];
            try {
                iArr2[PostType.Picture.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PostType.Article.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PostType.Video.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f82669b = iArr2;
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<GameShotListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30708, new Class[0], Void.TYPE).isSupported || !PostToolV2Fragment.this.isActive() || kotlin.jvm.internal.f0.g(PostToolV2Fragment.W3(PostToolV2Fragment.this).u().f(), Boolean.FALSE)) {
                return;
            }
            PostToolV2Fragment.L3(PostToolV2Fragment.this);
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30707, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (PostToolV2Fragment.this.isActive() && !kotlin.jvm.internal.f0.g(PostToolV2Fragment.W3(PostToolV2Fragment.this).u().f(), Boolean.FALSE)) {
                super.onError(e10);
                PostToolV2Fragment.h4(PostToolV2Fragment.this);
                PostToolV2Fragment.L3(PostToolV2Fragment.this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00de  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
        public void onNext(@dl.d Result<GameShotListObj> result) {
            PostToolV2Fragment postToolV2Fragment;
            vg0 vg0Var;
            SmartRefreshLayout smartRefreshLayout;
            List<GameScreenPicShotObj> screen_shots;
            SmartRefreshLayout smartRefreshLayout2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30709, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (PostToolV2Fragment.this.isActive() && !kotlin.jvm.internal.f0.g(PostToolV2Fragment.W3(PostToolV2Fragment.this).u().f(), Boolean.FALSE)) {
                super.onNext(result);
                PostToolV2Fragment.this.f82666s = null;
                if (PostToolV2Fragment.this.f82663p == 0) {
                    GameShotListObj result2 = result.getResult();
                    if (!com.max.hbcommon.utils.c.u(result2 != null ? result2.getToast() : null)) {
                        if (((com.max.hbcommon.base.d) PostToolV2Fragment.this).mFragmentHidden) {
                            PostToolV2Fragment postToolV2Fragment2 = PostToolV2Fragment.this;
                            GameShotListObj result3 = result.getResult();
                            postToolV2Fragment2.f82666s = result3 != null ? result3.getToast() : null;
                        } else {
                            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                            GameShotListObj result4 = result.getResult();
                            cVar.c(result4 != null ? result4.getToast() : null);
                        }
                    }
                    PostToolV2Fragment.this.f82661n.clear();
                    PostToolV2Fragment.this.f82665r = true;
                    vg0 vg0Var2 = PostToolV2Fragment.this.f82651d;
                    if (vg0Var2 != null && (smartRefreshLayout2 = vg0Var2.f116851c) != null) {
                        smartRefreshLayout2.b0(true);
                    }
                }
                GameShotListObj result5 = result.getResult();
                if (result5 == null || (screen_shots = result5.getScreen_shots()) == null) {
                    postToolV2Fragment = PostToolV2Fragment.this;
                    if (postToolV2Fragment.f82663p == 0) {
                        GameShotListObj result6 = result.getResult();
                        PostToolV2Fragment.j4(postToolV2Fragment, result6 != null ? result6.getTips_img_url() : null);
                    } else {
                        postToolV2Fragment.f82665r = false;
                        vg0Var = postToolV2Fragment.f82651d;
                        if (vg0Var != null && (smartRefreshLayout = vg0Var.f116851c) != null) {
                            smartRefreshLayout.b0(false);
                        }
                    }
                } else {
                    if (!(true ^ com.max.hbcommon.utils.c.w(screen_shots))) {
                        screen_shots = null;
                    }
                    if (screen_shots != null) {
                        PostToolV2Fragment.i4(PostToolV2Fragment.this, screen_shots);
                    } else {
                        postToolV2Fragment = PostToolV2Fragment.this;
                        if (postToolV2Fragment.f82663p == 0) {
                            GameShotListObj result7 = result.getResult();
                            PostToolV2Fragment.j4(postToolV2Fragment, result7 != null ? result7.getTips_img_url() : null);
                        } else {
                            postToolV2Fragment.f82665r = false;
                            vg0Var = postToolV2Fragment.f82651d;
                            if (vg0Var != null) {
                                smartRefreshLayout.b0(false);
                            }
                        }
                    }
                }
                PostToolV2Fragment.g4(PostToolV2Fragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30710, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameShotListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f82672c;

        /* JADX INFO: compiled from: PostToolV2Fragment.kt */
        public static final class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PostToolV2Fragment f82673a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FragmentActivity f82674b;

            a(PostToolV2Fragment postToolV2Fragment, FragmentActivity fragmentActivity) {
                this.f82673a = postToolV2Fragment;
                this.f82674b = fragmentActivity;
            }

            @Override // com.max.hbpermission.c
            public final void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30712, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                PostTabActivityViewModel postTabActivityViewModelW3 = PostToolV2Fragment.W3(this.f82673a);
                FragmentActivity fragmentActivity = this.f82674b;
                kotlin.jvm.internal.f0.o(fragmentActivity, "fragmentActivity");
                postTabActivityViewModelW3.y(fragmentActivity);
            }
        }

        d(FragmentActivity fragmentActivity) {
            this.f82672c = fragmentActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30711, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PermissionManager permissionManager = PermissionManager.f71603a;
            PostToolV2Fragment postToolV2Fragment = PostToolV2Fragment.this;
            FragmentActivity fragmentActivity = this.f82672c;
            kotlin.jvm.internal.f0.o(fragmentActivity, "fragmentActivity");
            permissionManager.R(postToolV2Fragment, fragmentActivity, new a(PostToolV2Fragment.this, this.f82672c));
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class e implements com.max.xiaoheihe.module.game.adapter.y.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f82676b;

        e(Context context) {
            this.f82676b = context;
        }

        @Override // com.max.xiaoheihe.module.game.adapter.y.a
        public void a(boolean z10, int i10) {
            List<GameScreenPicShotObj> listM;
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 30713, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PostToolV2Fragment.W3(PostToolV2Fragment.this).B();
            com.max.xiaoheihe.module.game.adapter.y yVar = PostToolV2Fragment.this.f82660m;
            if (yVar == null || (listM = yVar.m()) == null) {
                return;
            }
            PostToolV2Fragment postToolV2Fragment = PostToolV2Fragment.this;
            Context context = this.f82676b;
            if (z10) {
                PostToolV2Fragment.a4(postToolV2Fragment, context, listM);
            } else {
                PostToolV2Fragment.b4(postToolV2Fragment, listM);
            }
        }

        @Override // com.max.xiaoheihe.module.game.adapter.y.a
        public void b(int i10, @dl.d ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), imageView}, this, changeQuickRedirect, false, 30714, new Class[]{Integer.TYPE, ImageView.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(imageView, "imageView");
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class f extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f82677b;

        f(Context context) {
            this.f82677b = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 30717, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int iF = ViewUtils.f(this.f82677b, 1.0f);
            outRect.set(0, 0, parent.getChildAdapterPosition(view) % 2 == 0 ? iF : 0, iF);
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class g implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 30718, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            PostToolV2Fragment.this.f82663p += 30;
            PostToolV2Fragment postToolV2Fragment = PostToolV2Fragment.this;
            PostToolV2Fragment.l4(postToolV2Fragment, postToolV2Fragment.f82663p, 0, 2, null);
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class h extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@dl.d RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 30731, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                GalleryPagingAdapter galleryPagingAdapter = adapter instanceof GalleryPagingAdapter ? (GalleryPagingAdapter) adapter : null;
                if (galleryPagingAdapter != null) {
                    galleryPagingAdapter.L();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            GalleryPagingAdapter galleryPagingAdapter;
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30732, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (Math.abs(i11) < 150) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                galleryPagingAdapter = adapter instanceof GalleryPagingAdapter ? (GalleryPagingAdapter) adapter : null;
                if (galleryPagingAdapter != null) {
                    galleryPagingAdapter.L();
                    return;
                }
                return;
            }
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            galleryPagingAdapter = adapter2 instanceof GalleryPagingAdapter ? (GalleryPagingAdapter) adapter2 : null;
            if (galleryPagingAdapter != null) {
                galleryPagingAdapter.K();
            }
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class i extends com.max.xiaoheihe.module.bbs.adapter.p {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostToolV2Fragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PostModuleObj f82680c;

            a(PostModuleObj postModuleObj) {
                this.f82680c = postModuleObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30735, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(i.this.o(), this.f82680c.getProtocol());
            }
        }

        i(Context context, List<PostModuleObj> list) {
            super(context, list, R.layout.item_post_tools_v2_template);
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.p, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PostModuleObj postModuleObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postModuleObj}, this, changeQuickRedirect, false, 30734, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            q(eVar, postModuleObj);
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.p
        public void q(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e PostModuleObj postModuleObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postModuleObj}, this, changeQuickRedirect, false, 30733, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PostModuleObj.class}, Void.TYPE).isSupported || eVar == null || postModuleObj == null) {
                return;
            }
            View viewI = eVar.i(R.id.iv_template_img);
            kotlin.jvm.internal.f0.o(viewI, "viewHolder.getView(R.id.iv_template_img)");
            ImageView imageView = (ImageView) viewI;
            View viewI2 = eVar.i(R.id.tv_template_name);
            kotlin.jvm.internal.f0.o(viewI2, "viewHolder.getView(R.id.tv_template_name)");
            View viewI3 = eVar.i(R.id.tv_icon_label);
            kotlin.jvm.internal.f0.o(viewI3, "viewHolder.getView(R.id.tv_icon_label)");
            TextView textView = (TextView) viewI3;
            ((TextView) viewI2).setText(postModuleObj.getTitle());
            String big_img = postModuleObj.getBig_img();
            if (big_img == null || kotlin.text.u.V1(big_img)) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                com.max.hbimage.b.K(postModuleObj.getIcon(), imageView);
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                com.max.hbimage.b.K(postModuleObj.getBig_img(), imageView);
            }
            eVar.itemView.setOnClickListener(new a(postModuleObj));
            m(textView, postModuleObj, new float[]{5.0f, 5.0f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f, 0.0f});
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class j implements androidx.lifecycle.j0<Pair<? extends Result<PostModuleListObj>, ? extends Throwable>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Pair<? extends Result<PostModuleListObj>, ? extends Throwable> pair) {
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30737, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(pair);
        }

        public final void b(Pair<? extends Result<PostModuleListObj>, ? extends Throwable> pair) {
            PostModuleListObj result;
            List<PostModuleObj> tools;
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30736, new Class[]{Pair.class}, Void.TYPE).isSupported) {
                return;
            }
            if (pair.f() != null) {
                Log.e(PostToolV2Fragment.f82645w, "[templatePostToolLiveData] error: " + pair.f());
            }
            Result<PostModuleListObj> resultE = pair.e();
            if (resultE == null || (result = resultE.getResult()) == null || (tools = result.getTools()) == null) {
                return;
            }
            if (!(true ^ com.max.hbcommon.utils.c.w(tools))) {
                tools = null;
            }
            if (tools != null) {
                PostToolV2Fragment postToolV2Fragment = PostToolV2Fragment.this;
                postToolV2Fragment.f82659l.clear();
                postToolV2Fragment.f82659l.addAll(tools);
                com.max.xiaoheihe.module.bbs.adapter.p pVar = postToolV2Fragment.f82658k;
                if (pVar != null) {
                    pVar.notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class k extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f82712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f82713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f82714d;

        k(int i10, int i11, int i12) {
            this.f82712b = i10;
            this.f82713c = i11;
            this.f82714d = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 30738, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i10 = this.f82712b;
            int i11 = childAdapterPosition % i10;
            int i12 = this.f82713c;
            outRect.left = (i11 * i12) / i10;
            outRect.right = i12 - (((i11 + 1) * i12) / i10);
            if (childAdapterPosition >= i10) {
                outRect.top = this.f82714d;
            }
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPostToolV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostToolV2Fragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostToolV2Fragment$initViewModelForGallery$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,728:1\n262#2,2:729\n262#2,2:731\n262#2,2:733\n262#2,2:735\n*S KotlinDebug\n*F\n+ 1 PostToolV2Fragment.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostToolV2Fragment$initViewModelForGallery$2\n*L\n238#1:729,2\n239#1:731,2\n242#1:733,2\n243#1:735,2\n*E\n"})
    public static final class l implements androidx.lifecycle.j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ug0 f82715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostToolV2Fragment f82716b;

        l(ug0 ug0Var, PostToolV2Fragment postToolV2Fragment) {
            this.f82715a = ug0Var;
            this.f82716b = postToolV2Fragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30760, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean isGranted) {
            if (PatchProxy.proxy(new Object[]{isGranted}, this, changeQuickRedirect, false, 30759, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.o(isGranted, "isGranted");
            if (!isGranted.booleanValue()) {
                RecyclerPreloadView recyclerPreloadView = this.f82715a.f116421c;
                kotlin.jvm.internal.f0.o(recyclerPreloadView, "galleryBinding.recycler");
                recyclerPreloadView.setVisibility(8);
                Group group = this.f82715a.f116420b;
                kotlin.jvm.internal.f0.o(group, "galleryBinding.groupGoSetting");
                group.setVisibility(0);
                return;
            }
            RecyclerPreloadView recyclerPreloadView2 = this.f82715a.f116421c;
            kotlin.jvm.internal.f0.o(recyclerPreloadView2, "galleryBinding.recycler");
            recyclerPreloadView2.setVisibility(0);
            Group group2 = this.f82715a.f116420b;
            kotlin.jvm.internal.f0.o(group2, "galleryBinding.groupGoSetting");
            group2.setVisibility(8);
            PostToolV2Fragment.c4(this.f82716b);
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class m implements com.bumptech.glide.request.g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f82717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vg0 f82718c;

        m(int i10, vg0 vg0Var) {
            this.f82717b = i10;
            this.f82718c = vg0Var;
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@dl.e GlideException glideException, @dl.e Object obj, @dl.d com.bumptech.glide.request.target.p<Drawable> target, boolean z10) {
            Object[] objArr = {glideException, obj, target, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30765, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            kotlin.jvm.internal.f0.p(target, "target");
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30767, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
        }

        public boolean c(@dl.d Drawable resource, @dl.d Object model, @dl.e com.bumptech.glide.request.target.p<Drawable> pVar, @dl.d DataSource dataSource, boolean z10) {
            Object[] objArr = {resource, model, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30766, new Class[]{Drawable.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            kotlin.jvm.internal.f0.p(resource, "resource");
            kotlin.jvm.internal.f0.p(model, "model");
            kotlin.jvm.internal.f0.p(dataSource, "dataSource");
            int intrinsicWidth = resource.getIntrinsicWidth();
            int intrinsicHeight = resource.getIntrinsicHeight();
            if (intrinsicWidth != 0) {
                float f10 = (this.f82717b / intrinsicWidth) * intrinsicHeight;
                ViewGroup.LayoutParams layoutParams = this.f82718c.f116853e.f114473b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) f10;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: PostToolV2Fragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30768, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            pb.p pVarP = ob.a.p();
            Activity mContext = ((com.max.hbcommon.base.d) PostToolV2Fragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            String GAME_SHOT_FAQ_WEB = lb.a.f131078y4;
            kotlin.jvm.internal.f0.o(GAME_SHOT_FAQ_WEB, "GAME_SHOT_FAQ_WEB");
            pVarP.a(mContext, "常见问题", GAME_SHOT_FAQ_WEB);
        }
    }

    public PostToolV2Fragment() {
        final yh.a aVar = null;
        this.f82653f = FragmentViewModelLazyKt.h(this, kotlin.jvm.internal.n0.d(PostTabActivityViewModel.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$special$$inlined$activityViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30769, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.requireActivity().getViewModelStore();
                kotlin.jvm.internal.f0.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30770, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$special$$inlined$activityViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30772, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30771, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new yh.a<androidx.lifecycle.y0.b>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$special$$inlined$activityViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final androidx.lifecycle.y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30773, new Class[0], androidx.lifecycle.y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (androidx.lifecycle.y0.b) patchProxyResultProxy.result;
                }
                androidx.lifecycle.y0.b defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ androidx.lifecycle.y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30774, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public static final /* synthetic */ void L3(PostToolV2Fragment postToolV2Fragment) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment}, null, changeQuickRedirect, true, 30702, new Class[]{PostToolV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.m4();
    }

    public static final /* synthetic */ PostTabActivityViewModel W3(PostToolV2Fragment postToolV2Fragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postToolV2Fragment}, null, changeQuickRedirect, true, 30696, new Class[]{PostToolV2Fragment.class}, PostTabActivityViewModel.class);
        return patchProxyResultProxy.isSupported ? (PostTabActivityViewModel) patchProxyResultProxy.result : postToolV2Fragment.n4();
    }

    public static final /* synthetic */ void Z3(PostToolV2Fragment postToolV2Fragment) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment}, null, changeQuickRedirect, true, 30700, new Class[]{PostToolV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.u4();
    }

    public static final /* synthetic */ void a4(PostToolV2Fragment postToolV2Fragment, Context context, List list) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment, context, list}, null, changeQuickRedirect, true, 30698, new Class[]{PostToolV2Fragment.class, Context.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.v4(context, list);
    }

    public static final /* synthetic */ void b4(PostToolV2Fragment postToolV2Fragment, List list) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment, list}, null, changeQuickRedirect, true, 30699, new Class[]{PostToolV2Fragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.w4(list);
    }

    public static final /* synthetic */ void c4(PostToolV2Fragment postToolV2Fragment) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment}, null, changeQuickRedirect, true, 30697, new Class[]{PostToolV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.x4();
    }

    public static final /* synthetic */ void g4(PostToolV2Fragment postToolV2Fragment) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment}, null, changeQuickRedirect, true, 30703, new Class[]{PostToolV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.showContentView();
    }

    public static final /* synthetic */ void h4(PostToolV2Fragment postToolV2Fragment) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment}, null, changeQuickRedirect, true, 30701, new Class[]{PostToolV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.showError();
    }

    public static final /* synthetic */ void i4(PostToolV2Fragment postToolV2Fragment, List list) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment, list}, null, changeQuickRedirect, true, 30704, new Class[]{PostToolV2Fragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.y4(list);
    }

    public static final /* synthetic */ void j4(PostToolV2Fragment postToolV2Fragment, String str) {
        if (PatchProxy.proxy(new Object[]{postToolV2Fragment, str}, null, changeQuickRedirect, true, 30705, new Class[]{PostToolV2Fragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        postToolV2Fragment.z4(str);
    }

    @SuppressLint({"AutoDispose"})
    private final void k4(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30689, new Class[]{cls, cls}, Void.TYPE).isSupported || kotlin.jvm.internal.f0.g(n4().u().f(), Boolean.FALSE)) {
            return;
        }
        addDisposable((c) com.max.xiaoheihe.network.i.a().La(com.max.xiaoheihe.utils.i0.j(), com.max.xiaoheihe.utils.i0.m(), null, null, i10, i11).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    static /* synthetic */ void l4(PostToolV2Fragment postToolV2Fragment, int i10, int i11, int i12, Object obj) {
        Object[] objArr = {postToolV2Fragment, new Integer(i10), new Integer(i11), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30690, new Class[]{PostToolV2Fragment.class, cls, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i12 & 2) != 0) {
            i11 = 30;
        }
        postToolV2Fragment.k4(i10, i11);
    }

    private final void m4() {
        SmartRefreshLayout smartRefreshLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30693, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f82664q = false;
        vg0 vg0Var = this.f82651d;
        if (vg0Var == null || (smartRefreshLayout = vg0Var.f116851c) == null) {
            return;
        }
        smartRefreshLayout.A(0);
        smartRefreshLayout.p(0);
    }

    private final PostTabActivityViewModel n4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30676, new Class[0], PostTabActivityViewModel.class);
        return patchProxyResultProxy.isSupported ? (PostTabActivityViewModel) patchProxyResultProxy.result : (PostTabActivityViewModel) this.f82653f.getValue();
    }

    private final void o4(ug0 ug0Var) {
        Context context;
        if (PatchProxy.proxy(new Object[]{ug0Var}, this, changeQuickRedirect, false, 30680, new Class[]{ug0.class}, Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        RecyclerPreloadView recyclerPreloadView = ug0Var.f116421c;
        kotlin.jvm.internal.f0.o(recyclerPreloadView, "galleryBinding.recycler");
        TextView textView = ug0Var.f116422d;
        kotlin.jvm.internal.f0.o(textView, "galleryBinding.tvEmptyDataTips");
        r4(recyclerPreloadView, textView, context);
        t4(ug0Var, context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ug0Var.f116425g.setOnClickListener(new d(activity));
        }
        SpannableString spannableString = new SpannableString("点击 去设置 切换至允许访问所有照片");
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.text_primary_1_color)), 2, 6, 33);
        ug0Var.f116424f.setText(spannableString);
        ug0Var.f116423e.setBackground(ViewUtils.w(ViewUtils.f(context, 3.0f), context.getColor(R.color.black_start), context.getColor(R.color.black_end), GradientDrawable.Orientation.BL_TR));
    }

    private final void p4(vg0 vg0Var) {
        Context context;
        if (PatchProxy.proxy(new Object[]{vg0Var}, this, changeQuickRedirect, false, 30684, new Class[]{vg0.class}, Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        q4(vg0Var, context);
        l4(this, this.f82663p, 0, 2, null);
    }

    private final void q4(final vg0 vg0Var, Context context) {
        if (PatchProxy.proxy(new Object[]{vg0Var, context}, this, changeQuickRedirect, false, 30685, new Class[]{vg0.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.game.adapter.y yVar = new com.max.xiaoheihe.module.game.adapter.y(context, this.f82661n, ViewUtils.f(context, 1.0f), 0);
        this.f82660m = yVar;
        yVar.y(true);
        com.max.xiaoheihe.module.game.adapter.y yVar2 = this.f82660m;
        if (yVar2 != null) {
            yVar2.z(true);
        }
        com.max.xiaoheihe.module.game.adapter.y yVar3 = this.f82660m;
        if (yVar3 != null) {
            yVar3.x(new e(context));
        }
        vg0Var.f116850b.setLayoutManager(new GridLayoutManager(context, 2));
        vg0Var.f116850b.setAdapter(this.f82660m);
        vg0Var.f116850b.setPreloadEnable(true);
        vg0Var.f116850b.setPreLoadGap(10);
        vg0Var.f116850b.setPreLoadAction(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initGameShotView$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30716, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30715, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                PostToolV2Fragment.Z3(this.f82681b);
                vg0Var.f116850b.b();
            }
        });
        vg0Var.f116850b.setItemAnimator(null);
        vg0Var.f116850b.addItemDecoration(new f(context));
        vg0Var.f116851c.i0(false);
        vg0Var.f116851c.f0(new g());
    }

    private final void r4(RecyclerPreloadView recyclerPreloadView, final View view, Context context) {
        if (PatchProxy.proxy(new Object[]{recyclerPreloadView, view, context}, this, changeQuickRedirect, false, 30683, new Class[]{RecyclerPreloadView.class, View.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        recyclerPreloadView.setVisibility(0);
        view.setVisibility(8);
        if (recyclerPreloadView.getItemDecorationCount() == 0) {
            recyclerPreloadView.addItemDecoration(new le.a(4, ViewUtils.f(recyclerPreloadView.getContext(), 2.0f), false));
        }
        recyclerPreloadView.setLayoutManager(new GridLayoutManager(context, 4));
        final GalleryPagingAdapter galleryPagingAdapter = new GalleryPagingAdapter(context, null, new yh.l<com.max.xiaoheihe.module.bbs.post_edit.e, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initRecyclerViewForGallery$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d e galleryPostToolEvent) {
                if (PatchProxy.proxy(new Object[]{galleryPostToolEvent}, this, changeQuickRedirect, false, 30719, new Class[]{e.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(galleryPostToolEvent, "galleryPostToolEvent");
                PostToolV2Fragment.W3(this.f82683b).C(galleryPostToolEvent);
                PostToolV2Fragment.W3(this.f82683b).B();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e eVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 30720, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(eVar);
                return b2.f124493a;
            }
        });
        galleryPagingAdapter.o(new yh.l<CombinedLoadStates, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initRecyclerViewForGallery$2$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d CombinedLoadStates loadState) {
                if (PatchProxy.proxy(new Object[]{loadState}, this, changeQuickRedirect, false, 30721, new Class[]{CombinedLoadStates.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(loadState, "loadState");
                if (!(loadState.getSource().k() instanceof androidx.paging.v.NotLoading) || !loadState.getAppend().getEndOfPaginationReached() || galleryPagingAdapter.getItemCount() != 2) {
                    view.setVisibility(8);
                } else {
                    if (kotlin.jvm.internal.f0.g(PostToolV2Fragment.W3(this).n().f(), Boolean.FALSE)) {
                        return;
                    }
                    view.setVisibility(0);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{combinedLoadStates}, this, changeQuickRedirect, false, 30722, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(combinedLoadStates);
                return b2.f124493a;
            }
        });
        this.f82654g = galleryPagingAdapter;
        final GalleryPagingAdapter galleryPagingAdapter2 = new GalleryPagingAdapter(context, null, new yh.l<com.max.xiaoheihe.module.bbs.post_edit.e, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initRecyclerViewForGallery$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d e galleryPostToolEvent) {
                if (PatchProxy.proxy(new Object[]{galleryPostToolEvent}, this, changeQuickRedirect, false, 30723, new Class[]{e.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(galleryPostToolEvent, "galleryPostToolEvent");
                PostToolV2Fragment.W3(this.f82687b).C(galleryPostToolEvent);
                PostToolV2Fragment.W3(this.f82687b).B();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e eVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 30724, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(eVar);
                return b2.f124493a;
            }
        });
        galleryPagingAdapter2.o(new yh.l<CombinedLoadStates, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initRecyclerViewForGallery$4$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d CombinedLoadStates loadState) {
                if (PatchProxy.proxy(new Object[]{loadState}, this, changeQuickRedirect, false, 30725, new Class[]{CombinedLoadStates.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(loadState, "loadState");
                if (!(loadState.getSource().k() instanceof androidx.paging.v.NotLoading) || !loadState.getAppend().getEndOfPaginationReached() || galleryPagingAdapter2.getItemCount() != 2) {
                    view.setVisibility(8);
                } else {
                    if (kotlin.jvm.internal.f0.g(PostToolV2Fragment.W3(this).n().f(), Boolean.FALSE)) {
                        return;
                    }
                    view.setVisibility(0);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{combinedLoadStates}, this, changeQuickRedirect, false, 30726, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(combinedLoadStates);
                return b2.f124493a;
            }
        });
        this.f82655h = galleryPagingAdapter2;
        final GalleryPagingAdapter galleryPagingAdapter3 = new GalleryPagingAdapter(context, null, new yh.l<com.max.xiaoheihe.module.bbs.post_edit.e, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initRecyclerViewForGallery$5
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d e galleryPostToolEvent) {
                if (PatchProxy.proxy(new Object[]{galleryPostToolEvent}, this, changeQuickRedirect, false, 30727, new Class[]{e.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(galleryPostToolEvent, "galleryPostToolEvent");
                PostToolV2Fragment.W3(this.f82691b).C(galleryPostToolEvent);
                PostToolV2Fragment.W3(this.f82691b).B();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e eVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 30728, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(eVar);
                return b2.f124493a;
            }
        });
        galleryPagingAdapter3.o(new yh.l<CombinedLoadStates, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initRecyclerViewForGallery$6$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d CombinedLoadStates loadState) {
                if (PatchProxy.proxy(new Object[]{loadState}, this, changeQuickRedirect, false, 30729, new Class[]{CombinedLoadStates.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(loadState, "loadState");
                if (!(loadState.getSource().k() instanceof androidx.paging.v.NotLoading) || !loadState.getAppend().getEndOfPaginationReached() || galleryPagingAdapter3.getItemCount() != 2) {
                    view.setVisibility(8);
                } else {
                    if (kotlin.jvm.internal.f0.g(PostToolV2Fragment.W3(this).n().f(), Boolean.FALSE)) {
                        return;
                    }
                    view.setVisibility(0);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{combinedLoadStates}, this, changeQuickRedirect, false, 30730, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(combinedLoadStates);
                return b2.f124493a;
            }
        });
        this.f82656i = galleryPagingAdapter3;
        recyclerPreloadView.setItemAnimator(null);
        recyclerPreloadView.addOnScrollListener(new h());
    }

    private final void s4(wg0 wg0Var) {
        Context context;
        if (PatchProxy.proxy(new Object[]{wg0Var}, this, changeQuickRedirect, false, 30694, new Class[]{wg0.class}, Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        if (wg0Var.f117185b.getItemDecorationCount() == 0) {
            wg0Var.f117185b.addItemDecoration(new k(4, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 6.0f)));
        }
        i iVar = new i(context, this.f82659l);
        this.f82658k = iVar;
        wg0Var.f117185b.setAdapter(iVar);
        wg0Var.f117185b.setLayoutManager(new GridLayoutManager(context, 4));
        n4().i().k(getViewLifecycleOwner(), new j());
    }

    private final void t4(final ug0 ug0Var, final Context context) {
        if (PatchProxy.proxy(new Object[]{ug0Var, context}, this, changeQuickRedirect, false, 30681, new Class[]{ug0.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        n4().h().k(getViewLifecycleOwner(), new androidx.lifecycle.j0<PostType>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$initViewModelForGallery$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: PostToolV2Fragment.kt */
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f82698a;

                static {
                    int[] iArr = new int[PostType.valuesCustom().length];
                    try {
                        iArr[PostType.Picture.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PostType.Article.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PostType.Video.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f82698a = iArr;
                }
            }

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(PostType postType) {
                if (PatchProxy.proxy(new Object[]{postType}, this, changeQuickRedirect, false, 30740, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(postType);
            }

            public final void b(PostType postType) {
                if (PatchProxy.proxy(new Object[]{postType}, this, changeQuickRedirect, false, 30739, new Class[]{PostType.class}, Void.TYPE).isSupported) {
                    return;
                }
                int i10 = postType == null ? -1 : a.f82698a[postType.ordinal()];
                if (i10 == 1) {
                    ug0Var.f116421c.setAdapter(this.f82654g);
                    GalleryPagingAdapter galleryPagingAdapter = this.f82654g;
                    if (galleryPagingAdapter != null) {
                        galleryPagingAdapter.D();
                    }
                    kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new PostToolV2Fragment$initViewModelForGallery$1$onChanged$1(this, context, null), 3, null);
                    return;
                }
                if (i10 == 2) {
                    ug0Var.f116421c.setAdapter(this.f82655h);
                    GalleryPagingAdapter galleryPagingAdapter2 = this.f82654g;
                    if (galleryPagingAdapter2 != null) {
                        galleryPagingAdapter2.D();
                    }
                    kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new PostToolV2Fragment$initViewModelForGallery$1$onChanged$2(this, context, null), 3, null);
                    return;
                }
                if (i10 != 3) {
                    return;
                }
                ug0Var.f116421c.setAdapter(this.f82656i);
                GalleryPagingAdapter galleryPagingAdapter3 = this.f82654g;
                if (galleryPagingAdapter3 != null) {
                    galleryPagingAdapter3.D();
                }
                kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new PostToolV2Fragment$initViewModelForGallery$1$onChanged$3(this, context, null), 3, null);
            }
        });
        n4().n().k(getViewLifecycleOwner(), new l(ug0Var, this));
    }

    private final void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30688, new Class[0], Void.TYPE).isSupported || this.f82664q || !this.f82665r) {
            return;
        }
        this.f82664q = true;
        int i10 = this.f82663p + 30;
        this.f82663p = i10;
        l4(this, i10, 0, 2, null);
    }

    private final void v4(Context context, List<GameScreenPicShotObj> list) {
        GameScreenPicShotObj gameScreenPicShotObj;
        final String img_url;
        if (PatchProxy.proxy(new Object[]{context, list}, this, changeQuickRedirect, false, 30686, new Class[]{Context.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.f82662o.contains((GameScreenPicShotObj) obj)) {
                arrayList.add(obj);
            }
        }
        if (!(arrayList.size() == 1)) {
            arrayList = null;
        }
        if (arrayList != null && (gameScreenPicShotObj = (GameScreenPicShotObj) CollectionsKt___CollectionsKt.R2(arrayList, 0)) != null && (img_url = gameScreenPicShotObj.getImg_url()) != null) {
            n4().M(context, img_url, new yh.l<Uri, b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$onGameShotChecked$2$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d Uri fileUri) {
                    if (PatchProxy.proxy(new Object[]{fileUri}, this, changeQuickRedirect, false, 30761, new Class[]{Uri.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    kotlin.jvm.internal.f0.p(fileUri, "fileUri");
                    this.f82720b.f82667t.put(img_url, fileUri);
                    PostToolV2Fragment.W3(this.f82720b).D(new Pair<>(Boolean.TRUE, fileUri));
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Uri uri) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, 30762, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(uri);
                    return b2.f124493a;
                }
            }, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostToolV2Fragment$onGameShotChecked$2$1$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30764, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30763, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.hbutils.utils.c.d(this.f82722b.getString(R.string.load_fail));
                }
            });
        }
        this.f82662o.clear();
        this.f82662o.addAll(list);
    }

    private final void w4(List<GameScreenPicShotObj> list) {
        GameScreenPicShotObj gameScreenPicShotObj;
        String img_url;
        Uri uriRemove;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30687, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        List<GameScreenPicShotObj> list2 = this.f82662o;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!list.contains((GameScreenPicShotObj) obj)) {
                arrayList.add(obj);
            }
        }
        if (!(arrayList.size() == 1)) {
            arrayList = null;
        }
        if (arrayList != null && (gameScreenPicShotObj = (GameScreenPicShotObj) CollectionsKt___CollectionsKt.R2(arrayList, 0)) != null && (img_url = gameScreenPicShotObj.getImg_url()) != null && (uriRemove = this.f82667t.remove(img_url)) != null) {
            n4().D(new Pair<>(Boolean.FALSE, uriRemove));
        }
        this.f82662o.clear();
        this.f82662o.addAll(list);
    }

    private final void x4() {
        GalleryPagingAdapter galleryPagingAdapter;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30682, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PostType postTypeF = n4().h().f();
        int i10 = postTypeF == null ? -1 : b.f82669b[postTypeF.ordinal()];
        if (i10 == 1) {
            GalleryPagingAdapter galleryPagingAdapter2 = this.f82654g;
            if (galleryPagingAdapter2 != null) {
                galleryPagingAdapter2.r();
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 && (galleryPagingAdapter = this.f82656i) != null) {
                galleryPagingAdapter.r();
                return;
            }
            return;
        }
        GalleryPagingAdapter galleryPagingAdapter3 = this.f82655h;
        if (galleryPagingAdapter3 != null) {
            galleryPagingAdapter3.r();
        }
    }

    private final void y4(List<GameScreenPicShotObj> list) {
        p80 p80Var;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30691, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        vg0 vg0Var = this.f82651d;
        SmartRefreshLayout smartRefreshLayout = vg0Var != null ? vg0Var.f116851c : null;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.setVisibility(0);
        }
        vg0 vg0Var2 = this.f82651d;
        LinearLayout linearLayoutB = (vg0Var2 == null || (p80Var = vg0Var2.f116853e) == null) ? null : p80Var.b();
        if (linearLayoutB != null) {
            linearLayoutB.setVisibility(8);
        }
        vg0 vg0Var3 = this.f82651d;
        View view = vg0Var3 != null ? vg0Var3.f116852d : null;
        if (view != null) {
            view.setVisibility(8);
        }
        int size = this.f82661n.size();
        this.f82661n.addAll(list);
        if (size > 0) {
            com.max.xiaoheihe.module.game.adapter.y yVar = this.f82660m;
            if (yVar != null) {
                yVar.notifyItemRangeInserted(size, list.size());
                return;
            }
            return;
        }
        com.max.xiaoheihe.module.game.adapter.y yVar2 = this.f82660m;
        if (yVar2 != null) {
            yVar2.notifyDataSetChanged();
        }
    }

    private final void z4(String str) {
        vg0 vg0Var;
        Context context;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 30692, new Class[]{String.class}, Void.TYPE).isSupported || (vg0Var = this.f82651d) == null || (context = getContext()) == null) {
            return;
        }
        vg0Var.f116851c.setVisibility(8);
        vg0 vg0Var2 = this.f82651d;
        View view = vg0Var2 != null ? vg0Var2.f116852d : null;
        if (view != null) {
            view.setVisibility(0);
        }
        vg0Var.f116853e.b().setVisibility(0);
        vg0Var.f116853e.b().setBackground(new ColorDrawable(context.getColor(R.color.background_layer_2_color)));
        TextView textView = vg0Var.f116853e.f114479h;
        textView.setTextColor(context.getColor(R.color.text_primary_1_color));
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = ViewUtils.f(context, 12.0f);
            textView.setLayoutParams(marginLayoutParams);
        }
        LinearLayout linearLayout = vg0Var.f116853e.f114482k;
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = ViewUtils.f(context, 10.0f);
            marginLayoutParams2.rightMargin = ViewUtils.f(context, 12.0f);
            marginLayoutParams2.leftMargin = ViewUtils.f(context, 12.0f);
            linearLayout.setLayoutParams(marginLayoutParams2);
        }
        LinearLayout linearLayout2 = vg0Var.f116853e.f114482k;
        linearLayout2.setBackground(ViewUtils.H(ViewUtils.o(context, linearLayout2), com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color), com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color)));
        vg0Var.f116853e.f114475d.setColor(context.getColor(R.color.text_primary_1_color));
        vg0Var.f116853e.f114477f.setColor(context.getColor(R.color.text_primary_1_color));
        vg0Var.f116853e.f114476e.setColor(context.getColor(R.color.text_primary_1_color));
        vg0Var.f116853e.f114478g.setColor(context.getColor(R.color.text_primary_1_color));
        int iL = ViewUtils.L(context) / 2;
        ImageView imageView = vg0Var.f116853e.f114473b;
        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.rightMargin = 0;
            layoutParams4.leftMargin = 0;
            layoutParams4.gravity = 1;
            layoutParams4.width = iL;
            layoutParams4.height = -2;
            imageView.setLayoutParams(layoutParams4);
        }
        com.bumptech.glide.request.h hVarY0 = new com.bumptech.glide.request.h().Y0(new com.bumptech.glide.load.resource.bitmap.s(), new com.bumptech.glide.load.resource.bitmap.b0(ViewUtils.f(context, 5.0f)));
        kotlin.jvm.internal.f0.o(hVarY0, "RequestOptions().transfo…oundedCorners(imgRadius))");
        Glide.F(context).load(str).i(hVarY0).E1(new m(iL, vg0Var)).C1(vg0Var.f116853e.f114473b);
        vg0Var.f116853e.f114481j.setOnClickListener(new n());
        vg0Var.f116853e.f114480i.setTextColor(context.getColor(R.color.background_layer_4_color_alpha80));
        vg0Var.f116853e.f114474c.setColorFilter(context.getColor(R.color.background_layer_4_color_alpha80));
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30678, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater == null) {
            com.max.heybox.hblog.g.f74531b.v("[PostToolV2Fragment-dbg][installViews] inflater is null");
            return;
        }
        FrameLayout frameLayout = ((com.max.hbcommon.base.d) this).mContainer;
        if (frameLayout == null) {
            com.max.heybox.hblog.g.f74531b.v("[PostToolV2Fragment-dbg][installViews] container is null");
            return;
        }
        na naVarD = na.d(layoutInflater, frameLayout, false);
        kotlin.jvm.internal.f0.o(naVarD, "inflate(inflater, container, false)");
        PostToolsV2TabType postToolsV2TabType = this.f82649b;
        int i10 = postToolsV2TabType == null ? -1 : b.f82668a[postToolsV2TabType.ordinal()];
        if (i10 == 1) {
            this.f82650c = ug0.a(naVarD.f113774b.inflate());
        } else if (i10 == 2) {
            this.f82651d = vg0.a(naVarD.f113775c.inflate());
        } else if (i10 != 3) {
            Log.e(f82645w, "[onCreateView] invalid tabType: " + this.f82649b);
        } else {
            this.f82652e = wg0.a(naVarD.f113776d.inflate());
        }
        setContentView(naVarD);
        if (this.f82649b == PostToolsV2TabType.GAME_SHOT) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        String string;
        Object objB;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 30677, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(A)) == null) {
            return;
        }
        try {
            kotlin.Result.a aVar = kotlin.Result.f124476c;
            this.f82649b = PostToolsV2TabType.valueOf(string);
            objB = kotlin.Result.b(b2.f124493a);
        } catch (Throwable th2) {
            kotlin.Result.a aVar2 = kotlin.Result.f124476c;
            objB = kotlin.Result.b(kotlin.t0.a(th2));
        }
        kotlin.Result.a(objB);
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30695, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (com.max.hbcommon.utils.c.u(this.f82666s)) {
            return;
        }
        com.max.hbutils.utils.c.f73533a.c(this.f82666s);
        this.f82666s = null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 30679, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        PostToolsV2TabType postToolsV2TabType = this.f82649b;
        int i10 = postToolsV2TabType == null ? -1 : b.f82668a[postToolsV2TabType.ordinal()];
        if (i10 == 1) {
            ug0 ug0Var = this.f82650c;
            if (ug0Var != null) {
                o4(ug0Var);
                return;
            }
            return;
        }
        if (i10 == 2) {
            vg0 vg0Var = this.f82651d;
            if (vg0Var != null) {
                p4(vg0Var);
                return;
            }
            return;
        }
        if (i10 == 3) {
            wg0 wg0Var = this.f82652e;
            if (wg0Var != null) {
                s4(wg0Var);
                return;
            }
            return;
        }
        com.max.heybox.hblog.g.f74531b.v("[PostToolV2Fragment][onViewCreated] invalid tabType: " + this.f82649b);
    }
}
