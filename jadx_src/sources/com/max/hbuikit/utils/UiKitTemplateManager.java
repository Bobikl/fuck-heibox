package com.max.hbuikit.utils;

import android.annotation.SuppressLint;
import android.util.Log;
import com.max.hbuikit.bean.UiKitLayoutObj;
import com.max.hbuikit.bean.UiKitViewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import xh.m;
import yh.p;

/* JADX INFO: compiled from: UiKitTemplateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"CheckResult"})
public final class UiKitTemplateManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final a f73221c = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f73222d = "CACHE_KEY_UI_KIT_TEMPLATE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private static UiKitTemplateManager f73223e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final HashMap<String, UiKitViewObj> f73224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final q0 f73225b;

    /* JADX INFO: renamed from: com.max.hbuikit.utils.UiKitTemplateManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: UiKitTemplateManager.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbuikit.utils.UiKitTemplateManager$1", f = "UiKitTemplateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f73226b;

        AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@e Object obj, @d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.Fl, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : UiKitTemplateManager.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Hl, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Gl, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.El, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f73226b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            z zVarA4 = com.max.hbcache.b.f(UiKitTemplateManager.f73222d, UiKitViewObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c());
            final UiKitTemplateManager uiKitTemplateManager = UiKitTemplateManager.this;
            zVarA4.J5(new com.max.hbcommon.network.d<List<? extends UiKitViewObj>>() { // from class: com.max.hbuikit.utils.UiKitTemplateManager.1.1
                public static ChangeQuickRedirect changeQuickRedirect;

                public void a(@d List<? extends UiKitViewObj> t10) {
                    if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.k.Il, new Class[]{List.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(t10, "t");
                    super.onNext(t10);
                    k.f(uiKitTemplateManager.f73225b, null, null, new UiKitTemplateManager$1$1$onNext$1(t10, uiKitTemplateManager, null), 3, null);
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj2) {
                    if (PatchProxy.proxy(new Object[]{obj2}, this, changeQuickRedirect, false, bb.c.k.Jl, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    a((List) obj2);
                }
            });
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: UiKitTemplateManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        @m
        public final UiKitTemplateManager a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Ol, new Class[0], UiKitTemplateManager.class);
            if (patchProxyResultProxy.isSupported) {
                return (UiKitTemplateManager) patchProxyResultProxy.result;
            }
            if (UiKitTemplateManager.f73223e == null) {
                UiKitTemplateManager.f73223e = new UiKitTemplateManager(null);
            }
            UiKitTemplateManager uiKitTemplateManager = UiKitTemplateManager.f73223e;
            f0.m(uiKitTemplateManager);
            return uiKitTemplateManager;
        }
    }

    private UiKitTemplateManager() {
        this.f73224a = new HashMap<>();
        q0 q0VarA = r0.a(e1.c());
        this.f73225b = q0VarA;
        k.f(q0VarA, null, null, new AnonymousClass1(null), 3, null);
    }

    public /* synthetic */ UiKitTemplateManager(u uVar) {
        this();
    }

    @d
    @m
    public static final UiKitTemplateManager f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Dl, new Class[0], UiKitTemplateManager.class);
        return patchProxyResultProxy.isSupported ? (UiKitTemplateManager) patchProxyResultProxy.result : f73221c.a();
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.xl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Map.Entry<String, UiKitViewObj> entry : this.f73224a.entrySet()) {
            entry.getKey();
            UiKitViewObj value = entry.getValue();
            if (value.isLayout() && !value.getTemplate_completed()) {
                k(value);
            }
        }
    }

    @e
    public final UiKitViewObj g(@e String str) {
        UiKitViewObj uiKitViewObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.yl, new Class[]{String.class}, UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        if (str == null || (uiKitViewObj = this.f73224a.get(str)) == null) {
            return null;
        }
        if (!uiKitViewObj.isLayout() || uiKitViewObj.getTemplate_completed()) {
            return uiKitViewObj.deepCopy();
        }
        UiKitViewObj uiKitViewObjK = k(uiKitViewObj);
        if (uiKitViewObjK != null) {
            return uiKitViewObjK.deepCopy();
        }
        return null;
    }

    public final synchronized void h(@e UiKitViewObj uiKitViewObj) {
        String template_id;
        if (PatchProxy.proxy(new Object[]{uiKitViewObj}, this, changeQuickRedirect, false, bb.c.k.Al, new Class[]{UiKitViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (uiKitViewObj != null && (template_id = uiKitViewObj.getTemplate_id()) != null) {
            this.f73224a.put(template_id, uiKitViewObj.deepCopy());
            j();
        }
    }

    public final synchronized void i(@e List<UiKitViewObj> list) {
        String template_id;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.Bl, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null) {
            for (UiKitViewObj uiKitViewObj : list) {
                if (uiKitViewObj != null && (template_id = uiKitViewObj.getTemplate_id()) != null) {
                    this.f73224a.put(template_id, uiKitViewObj.deepCopy());
                }
            }
            j();
        }
    }

    public final synchronized void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Cl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UiKitViewObj> entry : this.f73224a.entrySet()) {
            entry.getKey();
            UiKitViewObj value = entry.getValue();
            if (value.getTemplate_id() != null) {
                arrayList.add(value);
            }
        }
        if (arrayList.size() > 0) {
            com.max.hbcache.b.k(f73222d, arrayList);
        }
    }

    @e
    public final UiKitViewObj k(@e UiKitViewObj uiKitViewObj) {
        UiKitLayoutObj uiKitLayoutObj;
        List<UiKitViewObj> children;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitViewObj}, this, changeQuickRedirect, false, bb.c.k.zl, new Class[]{UiKitViewObj.class}, UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((uiKitViewObj instanceof UiKitLayoutObj) && (children = (uiKitLayoutObj = (UiKitLayoutObj) uiKitViewObj).getChildren()) != null) {
            int size = children.size();
            for (int i10 = 0; i10 < size; i10++) {
                UiKitViewObj uiKitViewObj2 = children.get(i10);
                if (uiKitViewObj2.getTemplate_id() != null) {
                    children.set(i10, UiKitUtil.r(uiKitViewObj2));
                } else if (children.get(i10) instanceof UiKitLayoutObj) {
                    UiKitViewObj uiKitViewObjK = k(uiKitViewObj2);
                    f0.m(uiKitViewObjK);
                    children.set(i10, uiKitViewObjK);
                }
            }
            uiKitLayoutObj.setTemplate_completed(true);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("templateCompleteChildren ");
        sb2.append(uiKitViewObj != null ? uiKitViewObj.getTemplate_id() : null);
        sb2.append("  ");
        sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        Log.d("templateCompleteChildren", sb2.toString());
        return uiKitViewObj;
    }
}
