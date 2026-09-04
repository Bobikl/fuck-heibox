package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.shadowlayput.ShadowLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.widget.BottomAdsBarConstraintLayout;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: BottomBarManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.BottomBarManager$doShowBottomADBar$2", f = "BottomBarManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BottomBarManager$doShowBottomADBar$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f89409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ View f89410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ NotificationType f89411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ UiKitViewObj f89412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f89413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f89414h;

    /* JADX INFO: compiled from: BottomBarManager.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f89415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f89416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f89417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f89418e;

        a(FrameLayout frameLayout, View view, Context context, int i10) {
            this.f89415b = frameLayout;
            this.f89416c = view;
            this.f89417d = context;
            this.f89418e = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39800, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a aVar = com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a;
            ViewPriority viewPriority = ViewPriority.LOW;
            if (aVar.c(viewPriority.getValue())) {
                this.f89415b.addView(this.f89416c);
                ViewGroup.LayoutParams layoutParams = this.f89416c.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = ViewUtils.J(this.f89417d) - this.f89418e;
                    this.f89416c.setLayoutParams(layoutParams);
                }
                aVar.a(viewPriority.getValue());
                BottomBarManager bottomBarManager = BottomBarManager.f89397a;
                View view = this.f89416c;
                f0.o(view, "view");
                BottomBarManager.b(bottomBarManager, view);
            }
        }
    }

    /* JADX INFO: compiled from: BottomBarManager.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89419a;

        static {
            int[] iArr = new int[NotificationType.valuesCustom().length];
            try {
                iArr[NotificationType.GAME_ALL_RECOMMEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.GAME_GET_GAME_LIST_V3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationType.MALL_HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89419a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomBarManager$doShowBottomADBar$2(Context context, View view, NotificationType notificationType, UiKitViewObj uiKitViewObj, String str, int i10, kotlin.coroutines.c<? super BottomBarManager$doShowBottomADBar$2> cVar) {
        super(2, cVar);
        this.f89409c = context;
        this.f89410d = view;
        this.f89411e = notificationType;
        this.f89412f = uiKitViewObj;
        this.f89413g = str;
        this.f89414h = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39797, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BottomBarManager$doShowBottomADBar$2(this.f89409c, this.f89410d, this.f89411e, this.f89412f, this.f89413g, this.f89414h, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39799, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39798, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BottomBarManager$doShowBottomADBar$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39796, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f89408b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        View viewInflate = kb.c.d(this.f89409c).inflate(R.layout.view_bottom_abs_shadow_layout, (ViewGroup) new FrameLayout(this.f89409c), false);
        Context context = this.f89409c;
        UiKitViewObj uiKitViewObj = this.f89412f;
        String str = this.f89413g;
        BottomAdsBarConstraintLayout bottomAdsBarConstraintLayout = (BottomAdsBarConstraintLayout) viewInflate.findViewById(R.id.cl_top_layer);
        ((ShadowLayout) viewInflate.findViewById(R.id.shadow_view)).setBackgroundColor(androidx.core.content.d.f(context, R.color.shadow_layout_background_day_night));
        bottomAdsBarConstraintLayout.getBinding().f110597b.setDataToCreate(uiKitViewObj);
        if (str != null) {
            viewInflate.setTag(str);
        }
        View view = this.f89410d;
        FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
        if (frameLayout != null) {
            kotlin.coroutines.jvm.internal.a.a(((FrameLayout) view).postDelayed(new a(frameLayout, viewInflate, this.f89409c, this.f89414h), 100L));
        }
        BottomBarManager bottomBarManager = BottomBarManager.f89397a;
        BottomBarManager.a(bottomBarManager, this.f89411e);
        int i10 = b.f89419a[this.f89411e.ordinal()];
        if (i10 == 1) {
            bottomBarManager.k(new WeakReference<>(viewInflate));
        } else if (i10 == 2) {
            bottomBarManager.j(new WeakReference<>(viewInflate));
        } else if (i10 == 3) {
            bottomBarManager.l(new WeakReference<>(viewInflate));
        }
        return b2.f124493a;
    }
}
