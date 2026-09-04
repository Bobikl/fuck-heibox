package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.triplebanner.TripleBannerDecorationView;
import com.max.hbcommon.component.triplebanner.TripleBannerViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.AllRecommendGameHeaderObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.BannerObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: BannerVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nBannerVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/BannerVHB\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,266:1\n29#2:267\n5#2,2:268\n22#2:270\n7#2:271\n*S KotlinDebug\n*F\n+ 1 BannerVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/BannerVHB\n*L\n125#1:267\n125#1:268,2\n125#1:270\n125#1:271\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class BannerVHB extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f85994h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f85995g;

    /* JADX INFO: compiled from: BannerVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AllRecommendGameHeaderObj f85996b;

        a(AllRecommendGameHeaderObj allRecommendGameHeaderObj) {
            this.f85996b = allRecommendGameHeaderObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35933, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.k.b(this.f85996b.getAd_report());
        }
    }

    /* JADX INFO: compiled from: BannerVHB.kt */
    public static final class b extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<AllRecommendGameHeaderObj> f85997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BannerVHB f85998b;

        b(List<AllRecommendGameHeaderObj> list, BannerVHB bannerVHB) {
            this.f85997a = list;
            this.f85998b = bannerVHB;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 35934, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            if (i10 < 0 || i10 >= this.f85997a.size()) {
                return;
            }
            this.f85998b.G(this.f85997a.get(i10));
        }
    }

    /* JADX INFO: compiled from: BannerVHB.kt */
    public static final class c extends com.max.hbcustomview.bannerview.d<AllRecommendGameHeaderObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<AllRecommendGameHeaderObj> f86000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ TripleBannerViewPager<AllRecommendGameHeaderObj> f86001h;

        c(List<AllRecommendGameHeaderObj> list, TripleBannerViewPager<AllRecommendGameHeaderObj> tripleBannerViewPager) {
            this.f86000g = list;
            this.f86001h = tripleBannerViewPager;
        }

        public void A(@dl.e com.max.hbcustomview.bannerview.e<AllRecommendGameHeaderObj> eVar, @dl.e AllRecommendGameHeaderObj allRecommendGameHeaderObj, int i10, int i11) {
            Object[] objArr = {eVar, allRecommendGameHeaderObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35937, new Class[]{com.max.hbcustomview.bannerview.e.class, AllRecommendGameHeaderObj.class, cls, cls}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            BannerVHB bannerVHB = BannerVHB.this;
            BannerVHB.w(bannerVHB, allRecommendGameHeaderObj, BannerVHB.v(bannerVHB, eVar.getItemViewType()), eVar.itemView, this.f86001h, xb.a.c(eVar.getAbsoluteAdapterPosition(), this.f86000g.size()));
        }

        @Override // com.max.hbcustomview.bannerview.d
        public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<AllRecommendGameHeaderObj> eVar, AllRecommendGameHeaderObj allRecommendGameHeaderObj, int i10, int i11) {
            Object[] objArr = {eVar, allRecommendGameHeaderObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35938, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            A(eVar, allRecommendGameHeaderObj, i10, i11);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public int q(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35936, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : BannerVHB.v(BannerVHB.this, i10);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public int s(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35935, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : BannerVHB.this.z(this.f86000g.get(i10));
        }
    }

    public BannerVHB(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f85995g = param;
    }

    private final int A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35913, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (ViewUtils.L(this.f85995g.b()) * 72) / 375;
    }

    private final void C(final AllRecommendGameHeaderObj allRecommendGameHeaderObj, int i10, View view, final TripleBannerViewPager<AllRecommendGameHeaderObj> tripleBannerViewPager, final int i11) {
        Object[] objArr = {allRecommendGameHeaderObj, new Integer(i10), view, tripleBannerViewPager, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35919, new Class[]{AllRecommendGameHeaderObj.class, cls, View.class, TripleBannerViewPager.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (allRecommendGameHeaderObj == null || i10 == -1 || view == null) {
            return;
        }
        final int iA = A();
        final a aVar = new a(allRecommendGameHeaderObj);
        final com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(i10, view);
        if (i10 == R.layout.item_card_recommend_news) {
            if (allRecommendGameHeaderObj.getHeader_content() == null || allRecommendGameHeaderObj.getHeader_content().getSplit_imgs() == null) {
                r1.M1(eVar, aVar, allRecommendGameHeaderObj, allRecommendGameHeaderObj.getHeader_style(), iA, true);
            } else {
                List<String> listC = com.max.hbcommon.utils.b.c(allRecommendGameHeaderObj.getHeader_content().getSplit_imgs());
                if (listC.size() > 0) {
                    r1.M1(eVar, aVar, allRecommendGameHeaderObj, allRecommendGameHeaderObj.getHeader_style(), iA, false);
                    com.max.hbcommon.utils.b.a(listC, new com.max.hbcommon.utils.b.f() { // from class: com.max.xiaoheihe.module.game.adapter.recommend.binder.BannerVHB$refreshBannerItemView$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.BannerVHB$refreshBannerItemView$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BannerVHB.kt */
                        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.adapter.recommend.binder.BannerVHB$refreshBannerItemView$1$1", f = "BannerVHB.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            int f86009b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86010c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            final /* synthetic */ View.OnClickListener f86011d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            final /* synthetic */ AllRecommendGameHeaderObj f86012e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            final /* synthetic */ int f86013f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            final /* synthetic */ BannerVHB f86014g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            final /* synthetic */ int f86015h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            final /* synthetic */ TripleBannerViewPager<AllRecommendGameHeaderObj> f86016i;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.BannerVHB$refreshBannerItemView$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: BannerVHB.kt */
                            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.adapter.recommend.binder.BannerVHB$refreshBannerItemView$1$1$1", f = "BannerVHB.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            public static final class C07701 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                int f86017b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86018c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                final /* synthetic */ View.OnClickListener f86019d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                final /* synthetic */ AllRecommendGameHeaderObj f86020e;

                                /* JADX INFO: renamed from: f, reason: collision with root package name */
                                final /* synthetic */ int f86021f;

                                /* JADX INFO: renamed from: g, reason: collision with root package name */
                                final /* synthetic */ BannerVHB f86022g;

                                /* JADX INFO: renamed from: h, reason: collision with root package name */
                                final /* synthetic */ int f86023h;

                                /* JADX INFO: renamed from: i, reason: collision with root package name */
                                final /* synthetic */ TripleBannerViewPager<AllRecommendGameHeaderObj> f86024i;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C07701(com.max.hbcommon.base.adapter.s.e eVar, View.OnClickListener onClickListener, AllRecommendGameHeaderObj allRecommendGameHeaderObj, int i10, BannerVHB bannerVHB, int i11, TripleBannerViewPager<AllRecommendGameHeaderObj> tripleBannerViewPager, kotlin.coroutines.c<? super C07701> cVar) {
                                    super(2, cVar);
                                    this.f86018c = eVar;
                                    this.f86019d = onClickListener;
                                    this.f86020e = allRecommendGameHeaderObj;
                                    this.f86021f = i10;
                                    this.f86022g = bannerVHB;
                                    this.f86023h = i11;
                                    this.f86024i = tripleBannerViewPager;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @dl.d
                                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 35930, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07701(this.f86018c, this.f86019d, this.f86020e, this.f86021f, this.f86022g, this.f86023h, this.f86024i, cVar);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35932, new Class[]{Object.class, Object.class}, Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                                }

                                @dl.e
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35931, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07701) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @dl.e
                                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35929, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    kotlin.coroutines.intrinsics.b.h();
                                    if (this.f86017b != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.t0.n(obj);
                                    com.max.hbcommon.base.adapter.s.e eVar = this.f86018c;
                                    View.OnClickListener onClickListener = this.f86019d;
                                    AllRecommendGameHeaderObj allRecommendGameHeaderObj = this.f86020e;
                                    r1.M1(eVar, onClickListener, allRecommendGameHeaderObj, allRecommendGameHeaderObj.getHeader_style(), this.f86021f, true);
                                    BannerVHB.x(this.f86022g, this.f86023h, this.f86020e.getHeader_content().getSplit_imgs().getImg_front(), this.f86020e.getHeader_content().getSplit_imgs().getImg_back(), this.f86024i);
                                    return b2.f124493a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(com.max.hbcommon.base.adapter.s.e eVar, View.OnClickListener onClickListener, AllRecommendGameHeaderObj allRecommendGameHeaderObj, int i10, BannerVHB bannerVHB, int i11, TripleBannerViewPager<AllRecommendGameHeaderObj> tripleBannerViewPager, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.f86010c = eVar;
                                this.f86011d = onClickListener;
                                this.f86012e = allRecommendGameHeaderObj;
                                this.f86013f = i10;
                                this.f86014g = bannerVHB;
                                this.f86015h = i11;
                                this.f86016i = tripleBannerViewPager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.d
                            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 35926, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f86010c, this.f86011d, this.f86012e, this.f86013f, this.f86014g, this.f86015h, this.f86016i, cVar);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35928, new Class[]{Object.class, Object.class}, Object.class);
                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                            }

                            @dl.e
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35927, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.e
                            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35925, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i10 = this.f86009b;
                                if (i10 == 0) {
                                    kotlin.t0.n(obj);
                                    n2 n2VarE = e1.e();
                                    C07701 c07701 = new C07701(this.f86010c, this.f86011d, this.f86012e, this.f86013f, this.f86014g, this.f86015h, this.f86016i, null);
                                    this.f86009b = 1;
                                    if (kotlinx.coroutines.i.h(n2VarE, c07701, this) == objH) {
                                        return objH;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.t0.n(obj);
                                }
                                return b2.f124493a;
                            }
                        }

                        @Override // com.max.hbcommon.utils.b.f
                        public final void onFinish() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35924, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            kotlinx.coroutines.k.f(this.f86002a.n(), null, null, new AnonymousClass1(eVar, aVar, allRecommendGameHeaderObj, iA, this.f86002a, i11, tripleBannerViewPager, null), 3, null);
                        }
                    });
                } else {
                    D(i11, allRecommendGameHeaderObj.getHeader_content().getSplit_imgs().getImg_front(), allRecommendGameHeaderObj.getHeader_content().getSplit_imgs().getImg_back(), tripleBannerViewPager);
                    r1.M1(eVar, aVar, allRecommendGameHeaderObj, allRecommendGameHeaderObj.getHeader_style(), iA, true);
                }
            }
        }
        view.getLayoutParams().height = -1;
    }

    private final void D(int i10, String str, String str2, TripleBannerViewPager<AllRecommendGameHeaderObj> tripleBannerViewPager) {
        TripleBannerDecorationView tbd_down;
        TripleBannerDecorationView tbd_down2;
        ArrayList<String> imageList;
        TripleBannerDecorationView tbd_down3;
        ArrayList<String> imageList2;
        TripleBannerDecorationView tbd_up;
        TripleBannerDecorationView tbd_up2;
        ArrayList<String> imageList3;
        TripleBannerDecorationView tbd_up3;
        ArrayList<String> imageList4;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), str, str2, tripleBannerViewPager}, this, changeQuickRedirect, false, 35920, new Class[]{Integer.TYPE, String.class, String.class, TripleBannerViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        if (tripleBannerViewPager != null && (tbd_up3 = tripleBannerViewPager.getTbd_up()) != null && (imageList4 = tbd_up3.getImageList()) != null) {
            imageList4.remove(i10);
        }
        if (tripleBannerViewPager != null && (tbd_up2 = tripleBannerViewPager.getTbd_up()) != null && (imageList3 = tbd_up2.getImageList()) != null) {
            imageList3.add(i10, str);
        }
        if (tripleBannerViewPager != null && (tbd_up = tripleBannerViewPager.getTbd_up()) != null) {
            tbd_up.s();
        }
        if (tripleBannerViewPager != null && (tbd_down3 = tripleBannerViewPager.getTbd_down()) != null && (imageList2 = tbd_down3.getImageList()) != null) {
            imageList2.remove(i10);
        }
        if (tripleBannerViewPager != null && (tbd_down2 = tripleBannerViewPager.getTbd_down()) != null && (imageList = tbd_down2.getImageList()) != null) {
            imageList.add(i10, str2);
        }
        if (tripleBannerViewPager == null || (tbd_down = tripleBannerViewPager.getTbd_down()) == null) {
            return;
        }
        tbd_down.s();
    }

    private final void E(TripleBannerViewPager<AllRecommendGameHeaderObj> tripleBannerViewPager, List<AllRecommendGameHeaderObj> list) {
        if (PatchProxy.proxy(new Object[]{tripleBannerViewPager, list}, this, changeQuickRedirect, false, 35914, new Class[]{TripleBannerViewPager.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        Context contextB = this.f85995g.b();
        tripleBannerViewPager.setLayoutHeight(A());
        tripleBannerViewPager.V(ViewUtils.f(contextB, 2.0f));
        tripleBannerViewPager.c0(ViewUtils.f(contextB, 8.0f));
        tripleBannerViewPager.Z(ViewUtils.f(contextB, 6.0f));
        tripleBannerViewPager.L(new b(list, this));
        f0.n(contextB, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        tripleBannerViewPager.j0(((AppCompatActivity) contextB).getLifecycle()).R(new c(list, tripleBannerViewPager)).k();
    }

    public static final /* synthetic */ int v(BannerVHB bannerVHB, int i10) {
        Object[] objArr = {bannerVHB, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 35921, new Class[]{BannerVHB.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : bannerVHB.y(i10);
    }

    public static final /* synthetic */ void w(BannerVHB bannerVHB, AllRecommendGameHeaderObj allRecommendGameHeaderObj, int i10, View view, TripleBannerViewPager tripleBannerViewPager, int i11) {
        Object[] objArr = {bannerVHB, allRecommendGameHeaderObj, new Integer(i10), view, tripleBannerViewPager, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 35922, new Class[]{BannerVHB.class, AllRecommendGameHeaderObj.class, cls, View.class, TripleBannerViewPager.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        bannerVHB.C(allRecommendGameHeaderObj, i10, view, tripleBannerViewPager, i11);
    }

    public static final /* synthetic */ void x(BannerVHB bannerVHB, int i10, String str, String str2, TripleBannerViewPager tripleBannerViewPager) {
        if (PatchProxy.proxy(new Object[]{bannerVHB, new Integer(i10), str, str2, tripleBannerViewPager}, null, changeQuickRedirect, true, 35923, new Class[]{BannerVHB.class, Integer.TYPE, String.class, String.class, TripleBannerViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        bannerVHB.D(i10, str, str2, tripleBannerViewPager);
    }

    private final int y(int i10) {
        return i10 == 6 ? R.layout.item_card_recommend_news : R.layout.layout_empty;
    }

    @dl.d
    public final RecommendVHBParam B() {
        return this.f85995g;
    }

    public final void F(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35911, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f85995g = recommendVHBParam;
    }

    public final void G(@dl.e AllRecommendGameHeaderObj allRecommendGameHeaderObj) {
        String name;
        RecommendGameListItemObj header_content;
        if (PatchProxy.proxy(new Object[]{allRecommendGameHeaderObj}, this, changeQuickRedirect, false, 35915, new Class[]{AllRecommendGameHeaderObj.class}, Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("trackBannerItemExposure, gameHeaderObj = ");
        sb2.append((allRecommendGameHeaderObj == null || (header_content = allRecommendGameHeaderObj.getHeader_content()) == null) ? null : header_content.getGame_name());
        String string = sb2.toString();
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb3 = new StringBuilder();
        if (BannerVHB.class.isAnonymousClass()) {
            name = BannerVHB.class.getName();
            f0.m(name);
        } else {
            name = BannerVHB.class.getSimpleName();
            f0.m(name);
        }
        sb3.append(name);
        sb3.append(", ");
        sb3.append(string);
        aVar.q(sb3.toString());
        if (allRecommendGameHeaderObj == null || f0.g("1", allRecommendGameHeaderObj.getIsReported())) {
            return;
        }
        com.max.hbcommon.utils.k.c(allRecommendGameHeaderObj.getAd_report());
        allRecommendGameHeaderObj.setIsReported("1");
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35912, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        TripleBannerViewPager tripleBannerViewPager = (TripleBannerViewPager) viewHolder.i(R.id.triple_banner);
        Log.d("BannerVHB", String.valueOf(com.max.hbutils.utils.k.p(tripleBannerViewPager.getTag(R.id.triple_banner))));
        Log.d("BannerVHB", String.valueOf(com.max.hbutils.utils.k.p(data)));
        Log.d("BannerVHB", String.valueOf(f0.g(tripleBannerViewPager.getTag(R.id.triple_banner), data)));
        if (!(data instanceof BannerObj) || f0.g(tripleBannerViewPager.getTag(R.id.triple_banner), data)) {
            return;
        }
        tripleBannerViewPager.setTag(R.id.triple_banner, data);
        BannerObj bannerObj = (BannerObj) data;
        if (com.max.hbcommon.utils.c.w(bannerObj.getItems())) {
            tripleBannerViewPager.setVisibility(8);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<AllRecommendGameHeaderObj> items = bannerObj.getItems();
        f0.m(items);
        for (AllRecommendGameHeaderObj allRecommendGameHeaderObj : items) {
            if (allRecommendGameHeaderObj.getHeader_content() == null || allRecommendGameHeaderObj.getHeader_content().getSplit_imgs() == null || com.max.hbcommon.utils.b.c(allRecommendGameHeaderObj.getHeader_content().getSplit_imgs()).size() != 0) {
                arrayList.add(null);
                arrayList2.add(null);
            } else {
                arrayList.add(allRecommendGameHeaderObj.getHeader_content().getSplit_imgs().getImg_front());
                arrayList2.add(allRecommendGameHeaderObj.getHeader_content().getSplit_imgs().getImg_back());
            }
        }
        tripleBannerViewPager.setBdUpList(arrayList);
        tripleBannerViewPager.setBdDownList(arrayList2);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void h(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35917, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof BannerObj) {
            TripleBannerViewPager<AllRecommendGameHeaderObj> rv_banner = (TripleBannerViewPager) viewHolder.i(R.id.triple_banner);
            f0.o(rv_banner, "rv_banner");
            BannerObj bannerObj = (BannerObj) data;
            ArrayList<AllRecommendGameHeaderObj> items = bannerObj.getItems();
            f0.m(items);
            E(rv_banner, items);
            if (com.max.hbcommon.utils.c.w(bannerObj.getItems())) {
                return;
            }
            rv_banner.J(bannerObj.getItems());
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 35916, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        super.p(itemView, shownList, data);
        if (data instanceof BannerObj) {
            BannerObj bannerObj = (BannerObj) data;
            if (com.max.hbcommon.utils.c.w(bannerObj.getItems())) {
                return;
            }
            ArrayList<AllRecommendGameHeaderObj> items = bannerObj.getItems();
            G(items != null ? items.get(0) : null);
        }
    }

    public final int z(@dl.d AllRecommendGameHeaderObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 35918, new Class[]{AllRecommendGameHeaderObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        return f0.g("协议", data.getHeader_style()) ? 6 : -1;
    }
}
