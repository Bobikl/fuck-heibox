package com.max.hbstory.delegate.picture;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbstory.R;
import com.max.hbstory.bean.StoryImgObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.widget.StoryViewPager2Container;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class PictureViewPager2Delegate implements com.max.hbstory.delegate.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f72869e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f72870f = 3000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f72871g = 800;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f72872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private ViewPager2 f72873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f72874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private c f72875d;

    /* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public PictureViewPager2Delegate(@dl.d com.max.hbstory.d storyContext) {
        f0.p(storyContext, "storyContext");
        this.f72872a = storyContext;
        if (storyContext.a() != null) {
            q();
            s();
            o();
            m();
        }
    }

    public static final /* synthetic */ void l(PictureViewPager2Delegate pictureViewPager2Delegate, List list) {
        if (PatchProxy.proxy(new Object[]{pictureViewPager2Delegate, list}, null, changeQuickRedirect, true, bb.c.k.f33783pg, new Class[]{PictureViewPager2Delegate.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        pictureViewPager2Delegate.u(list);
    }

    private final void m() {
        Fragment fragmentB;
        final com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33599hg, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72872a.b()) == null || (gVarD = this.f72872a.d()) == null) {
            return;
        }
        LiveData<com.max.hbstory.g.d> liveDataI = gVarD.i();
        final l<com.max.hbstory.g.d, b2> lVar = new l<com.max.hbstory.g.d, b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeBottomSheetSlideOffset$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(final com.max.hbstory.g.d dVar) {
                if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.f33806qg, new Class[]{com.max.hbstory.g.d.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar2 = this.f72876b.f72872a;
                int i10 = this.f72876b.f72874c;
                final com.max.hbstory.g gVar = gVarD;
                final PictureViewPager2Delegate pictureViewPager2Delegate = this.f72876b;
                StoryUtilsKt.e(dVar2, i10, new yh.a<b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeBottomSheetSlideOffset$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33872tg, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Integer numF;
                        StoryLinkCardInfoObj link_card_info;
                        StoryVideoInfoObj video_info;
                        StoryLinkCardInfoObj link_card_info2;
                        StoryVideoInfoObj video_info2;
                        int height = 0;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33850sg, new Class[0], Void.TYPE).isSupported || (numF = gVar.n().f()) == null) {
                            return;
                        }
                        StoryItemsObj storyItemsObjM = StoryUtilsKt.m(pictureViewPager2Delegate.f72872a, numF.intValue());
                        int width = (storyItemsObjM == null || (link_card_info2 = storyItemsObjM.getLink_card_info()) == null || (video_info2 = link_card_info2.getVideo_info()) == null) ? 0 : video_info2.getWidth();
                        if (storyItemsObjM != null && (link_card_info = storyItemsObjM.getLink_card_info()) != null && (video_info = link_card_info.getVideo_info()) != null) {
                            height = video_info.getHeight();
                        }
                        ViewPager2 viewPager2 = pictureViewPager2Delegate.f72873b;
                        ViewParent parent = viewPager2 != null ? viewPager2.getParent() : null;
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            StoryUtilsKt.c(viewGroup, dVar.b(), dVar.a(), width, height, false, 16, null);
                        }
                        ViewPager2 viewPager3 = pictureViewPager2Delegate.f72873b;
                        if (viewPager3 != null) {
                            StoryUtilsKt.c(viewPager3, dVar.b(), dVar.a(), width, height, false, 16, null);
                        }
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbstory.g.d dVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.f33828rg, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dVar);
                return b2.f124493a;
            }
        };
        liveDataI.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.picture.f
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                PictureViewPager2Delegate.n(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33714mg, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void o() {
        Fragment fragmentB;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33645jg, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72872a.b()) == null || (gVarD = this.f72872a.d()) == null) {
            return;
        }
        LiveData<Boolean> liveDataW = gVarD.w();
        final l<Boolean, b2> lVar = new l<Boolean, b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeLongPressEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(final Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.f33894ug, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar = this.f72881b.f72872a;
                int i10 = this.f72881b.f72874c;
                final PictureViewPager2Delegate pictureViewPager2Delegate = this.f72881b;
                StoryUtilsKt.e(dVar, i10, new yh.a<b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeLongPressEvent$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33960xg, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33938wg, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        Boolean trueStartFalseEnd = bool;
                        f0.o(trueStartFalseEnd, "$trueStartFalseEnd");
                        if (trueStartFalseEnd.booleanValue()) {
                            c cVar = pictureViewPager2Delegate.f72875d;
                            if (cVar != null) {
                                cVar.d(true);
                                return;
                            }
                            return;
                        }
                        c cVar2 = pictureViewPager2Delegate.f72875d;
                        if (cVar2 != null) {
                            cVar2.f();
                        }
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.f33916vg, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool);
                return b2.f124493a;
            }
        };
        liveDataW.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.picture.g
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                PictureViewPager2Delegate.p(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33760og, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void q() {
        Fragment fragmentB;
        final com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33576gg, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72872a.b()) == null || (gVarD = this.f72872a.d()) == null) {
            return;
        }
        LiveData<Integer> liveDataN = gVarD.n();
        final l<Integer, b2> lVar = new l<Integer, b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observePageChanges$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(final Integer num) {
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.f33982yg, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar = this.f72884b.f72872a;
                int i10 = this.f72884b.f72874c;
                final PictureViewPager2Delegate pictureViewPager2Delegate = this.f72884b;
                final com.max.hbstory.g gVar = gVarD;
                StoryUtilsKt.v(dVar, i10, new yh.a<b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observePageChanges$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Bg, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        View viewFindViewWithTag;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Ag, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        PictureViewPager2Delegate pictureViewPager2Delegate2 = pictureViewPager2Delegate;
                        Integer it = num;
                        f0.o(it, "$it");
                        pictureViewPager2Delegate2.f72874c = it.intValue();
                        PictureViewPager2Delegate pictureViewPager2Delegate3 = pictureViewPager2Delegate;
                        ViewPager2 viewPager2E = pictureViewPager2Delegate3.f72872a.e();
                        if (viewPager2E != null) {
                            viewFindViewWithTag = viewPager2E.findViewWithTag(StoryUtilsKt.f73013b + pictureViewPager2Delegate.f72874c);
                        } else {
                            viewFindViewWithTag = null;
                        }
                        if (!(viewFindViewWithTag instanceof View)) {
                            viewFindViewWithTag = null;
                        }
                        StoryViewPager2Container storyViewPager2Container = viewFindViewWithTag != null ? (StoryViewPager2Container) viewFindViewWithTag.findViewById(R.id.vp2_container) : null;
                        pictureViewPager2Delegate3.f72873b = storyViewPager2Container != null ? storyViewPager2Container.getPictureViewPager2() : null;
                        ViewPager2 viewPager2 = pictureViewPager2Delegate.f72873b;
                        if (viewPager2 != null) {
                            com.max.hbstory.g gVar2 = gVar;
                            PictureViewPager2Delegate pictureViewPager2Delegate4 = pictureViewPager2Delegate;
                            gVar2.X(viewPager2.getCurrentItem());
                            if (pictureViewPager2Delegate4.f72875d == null) {
                                pictureViewPager2Delegate4.f72875d = new c(viewPager2);
                            } else {
                                c cVar = pictureViewPager2Delegate4.f72875d;
                                if (cVar != null) {
                                    cVar.c(viewPager2);
                                }
                            }
                            RecyclerView.Adapter adapter = viewPager2.getAdapter();
                            b bVar = adapter instanceof b ? (b) adapter : null;
                            PictureViewPager2Delegate.l(pictureViewPager2Delegate4, bVar != null ? bVar.n() : null);
                        }
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.f34004zg, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num);
                return b2.f124493a;
            }
        };
        liveDataN.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.picture.d
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                PictureViewPager2Delegate.r(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33691lg, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void s() {
        final com.max.hbstory.g gVarD;
        final Fragment fragmentB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33621ig, new Class[0], Void.TYPE).isSupported || (gVarD = this.f72872a.d()) == null || (fragmentB = this.f72872a.b()) == null) {
            return;
        }
        LiveData<com.max.hbstory.g.c> liveDataA = gVarD.A();
        final l<com.max.hbstory.g.c, b2> lVar = new l<com.max.hbstory.g.c, b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeScroll$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(final com.max.hbstory.g.c cVar) {
                if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.k.Cg, new Class[]{com.max.hbstory.g.c.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar = this.f72889b.f72872a;
                int i10 = this.f72889b.f72874c;
                final PictureViewPager2Delegate pictureViewPager2Delegate = this.f72889b;
                final Fragment fragment = fragmentB;
                final com.max.hbstory.g gVar = gVarD;
                StoryUtilsKt.e(dVar, i10, new yh.a<b2>() { // from class: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeScroll$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeScroll$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbstory.delegate.picture.PictureViewPager2Delegate$observeScroll$1$1$1", f = "PictureViewPager2Delegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C05831 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        int f72896b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ PictureViewPager2Delegate f72897c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        final /* synthetic */ com.max.hbstory.g.c f72898d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ com.max.hbstory.g f72899e;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C05831(PictureViewPager2Delegate pictureViewPager2Delegate, com.max.hbstory.g.c cVar, com.max.hbstory.g gVar, kotlin.coroutines.c<? super C05831> cVar2) {
                            super(2, cVar2);
                            this.f72897c = pictureViewPager2Delegate;
                            this.f72898d = cVar;
                            this.f72899e = gVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.Hg, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C05831(this.f72897c, this.f72898d, this.f72899e, cVar);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Jg, new Class[]{Object.class, Object.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                        }

                        @dl.e
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Ig, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C05831) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Gg, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.f72896b != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                            ViewPager2 viewPager2 = this.f72897c.f72873b;
                            if (viewPager2 != null) {
                                com.max.hbstory.g.c cVar = this.f72898d;
                                com.max.hbstory.g gVar = this.f72899e;
                                PictureViewPager2Delegate pictureViewPager2Delegate = this.f72897c;
                                if (cVar.l()) {
                                    if (viewPager2.isFakeDragging()) {
                                        viewPager2.endFakeDrag();
                                    }
                                    gVar.f0(false);
                                    c cVar2 = pictureViewPager2Delegate.f72875d;
                                    if (cVar2 != null) {
                                        c.e(cVar2, false, 1, null);
                                    }
                                } else if (Math.abs(cVar.h()) > Math.abs(cVar.i()) / 2.0f) {
                                    if (!viewPager2.isFakeDragging() && viewPager2.beginFakeDrag()) {
                                        gVar.f0(true);
                                    }
                                    if (viewPager2.isFakeDragging()) {
                                        viewPager2.fakeDragBy(-cVar.h());
                                    }
                                }
                            }
                            return b2.f124493a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Fg, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Eg, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        c cVar2 = pictureViewPager2Delegate.f72875d;
                        if (cVar2 != null) {
                            cVar2.f();
                        }
                        k.f(z.a(fragment), null, null, new C05831(pictureViewPager2Delegate, cVar, gVar, null), 3, null);
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbstory.g.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.k.Dg, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(cVar);
                return b2.f124493a;
            }
        };
        liveDataA.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.picture.e
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                PictureViewPager2Delegate.t(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33737ng, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void u(List<StoryImgObj> list) {
        c cVar;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.f33668kg, new Class[]{List.class}, Void.TYPE).isSupported || list == null || (cVar = this.f72875d) == null) {
            return;
        }
        c.e(cVar, false, 1, null);
    }
}
