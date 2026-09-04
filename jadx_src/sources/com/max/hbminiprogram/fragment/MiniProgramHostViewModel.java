package com.max.hbminiprogram.fragment;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.x0;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.bean.TopicInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.Pair;
import kotlin.b2;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.k;
import yh.l;

/* JADX INFO: compiled from: MiniProgramHostViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MiniProgramHostViewModel extends androidx.lifecycle.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final Application f71278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final i0<String> f71279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final LiveData<String> f71280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final j<Boolean> f71281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final u<Boolean> f71282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final g0<Boolean> f71283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final i0<MiniProgramMenuInfoObj> f71284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private final e<Pair<TopicInfoObj, Boolean>> f71285j;

    /* JADX INFO: compiled from: MiniProgramHostViewModel.kt */
    public static final /* synthetic */ class a implements j0, a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f71287a;

        a(l function) {
            f0.p(function, "function");
            this.f71287a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.Y0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f71287a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @d
        public final kotlin.u<?> b() {
            return this.f71287a;
        }

        public final boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.Z0, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if ((obj instanceof j0) && (obj instanceof a0)) {
                return f0.g(b(), ((a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33285a1, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramHostViewModel(@d Application app) {
        super(app);
        f0.p(app, "app");
        this.f71278c = app;
        i0<String> i0Var = new i0<>();
        this.f71279d = i0Var;
        this.f71280e = i0Var;
        j<Boolean> jVarA = v.a(Boolean.TRUE);
        this.f71281f = jVarA;
        this.f71282g = jVarA;
        g0<Boolean> g0Var = new g0<>();
        this.f71283h = g0Var;
        i0<MiniProgramMenuInfoObj> i0Var2 = new i0<>();
        this.f71284i = i0Var2;
        this.f71285j = g.G(FlowLiveDataConversions.a(i0Var2), jVarA, new MiniProgramHostViewModel$miniProgramTopicInfo$1(null));
        g0Var.s(i0Var2, new a(new l<MiniProgramMenuInfoObj, b2>() { // from class: com.max.hbminiprogram.fragment.MiniProgramHostViewModel.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
                if (PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, bb.c.i.T0, new Class[]{MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                boolean z10 = !TextUtils.isEmpty((CharSequence) MiniProgramHostViewModel.this.f71279d.f()) && f0.g(Boolean.TRUE, miniProgramMenuInfoObj.getCan_add_to_my_list());
                if (ob.a.o().b() && z10 && f0.g("0", com.max.hbcache.c.o(com.max.hbcache.c.f66131k0, "0"))) {
                    com.max.hbcache.c.C(com.max.hbcache.c.f66131k0, "1");
                    MiniProgramHostViewModel.this.f71283h.o(Boolean.TRUE);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, bb.c.i.U0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(miniProgramMenuInfoObj);
                return b2.f124493a;
            }
        }));
    }

    @d
    public final Application h() {
        return this.f71278c;
    }

    @d
    public final LiveData<String> i() {
        return this.f71280e;
    }

    @d
    public final i0<MiniProgramMenuInfoObj> k() {
        return this.f71284i;
    }

    @d
    public final e<Pair<TopicInfoObj, Boolean>> m() {
        return this.f71285j;
    }

    @d
    public final LiveData<Boolean> n() {
        return this.f71283h;
    }

    @d
    public final u<Boolean> o() {
        return this.f71282g;
    }

    public final void p(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.S0, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k.f(x0.a(this), null, null, new MiniProgramHostViewModel$setMiniProgramAppearanceLightStatusBars$1(this, z10, null), 3, null);
    }

    public final void r(@d String miniProgramId) {
        if (PatchProxy.proxy(new Object[]{miniProgramId}, this, changeQuickRedirect, false, bb.c.i.R0, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(miniProgramId, "miniProgramId");
        this.f71279d.r(miniProgramId);
    }
}
