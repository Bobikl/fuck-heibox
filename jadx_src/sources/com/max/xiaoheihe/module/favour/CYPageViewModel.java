package com.max.xiaoheihe.module.favour;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseDisplayState;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: CYPageViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class CYPageViewModel extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f83627q = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final z f83628k = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<com.max.xiaoheihe.module.favour.d>() { // from class: com.max.xiaoheihe.module.favour.CYPageViewModel$repository$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final d a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31608, new Class[0], d.class);
            return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : new d();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.favour.d, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ d invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31609, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private i0<Boolean> f83629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private i0<Boolean> f83630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f83631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private String f83632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final ArrayList<BBSUserMsgObj> f83633p;

    /* JADX INFO: compiled from: CYPageViewModel.kt */
    public static final class a implements com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83636c;

        a(Context context, String str) {
            this.f83635b = context;
            this.f83636c = str;
        }

        public void a(@dl.d Result<?> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31595, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (f0.g(CYPageViewModel.this.m().f(), Boolean.TRUE)) {
                if (com.max.hbcommon.utils.c.u(t10.getMsg())) {
                    com.max.hbutils.utils.c.f(this.f83635b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(t10.getMsg());
                }
                Iterator<BBSUserMsgObj> it = CYPageViewModel.this.v().iterator();
                f0.o(it, "mCyList.iterator()");
                while (it.hasNext()) {
                    BBSUserMsgObj next = it.next();
                    f0.o(next, "bbsCommentsObjIterator.next()");
                    if (f0.g(this.f83636c, next.getComment_id())) {
                        it.remove();
                        CYPageViewModel.this.x().r(Boolean.valueOf(f0.g(CYPageViewModel.this.x().f(), Boolean.FALSE)));
                        return;
                    }
                }
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31596, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31597, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    /* JADX INFO: compiled from: CYPageViewModel.kt */
    public static final class b implements com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83639c;

        b(String str, String str2) {
            this.f83638b = str;
            this.f83639c = str2;
        }

        public void a(@dl.d Result<?> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31598, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (f0.g(CYPageViewModel.this.m().f(), Boolean.TRUE)) {
                if (!com.max.hbcommon.utils.c.w(CYPageViewModel.this.v())) {
                    for (BBSUserMsgObj bBSUserMsgObj : CYPageViewModel.this.v()) {
                        if (f0.g(this.f83638b, bBSUserMsgObj.getComment_id())) {
                            bBSUserMsgObj.setIs_cy(this.f83639c);
                            break;
                        }
                    }
                }
                CYPageViewModel.this.x().r(Boolean.valueOf(f0.g(CYPageViewModel.this.x().f(), Boolean.FALSE)));
                if (com.max.hbcommon.utils.c.u(t10.getMsg())) {
                    return;
                }
                com.max.hbutils.utils.c.f(t10.getMsg());
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31599, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(CYPageViewModel.this.m().f(), Boolean.TRUE)) {
                com.max.hbutils.utils.c.f(f0.g("1", this.f83639c) ? "插眼失败，请稍后再试" : "取消插眼失败，请稍后再试");
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31600, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    /* JADX INFO: compiled from: CYPageViewModel.kt */
    public static final class c implements com.max.xiaoheihe.base.mvvm.repository.a<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83641b;

        c(Context context) {
            this.f83641b = context;
        }

        public void a(@dl.d Result<?> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31601, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (f0.g(CYPageViewModel.this.m().f(), Boolean.TRUE)) {
                if (com.max.hbcommon.utils.c.u(t10.getMsg())) {
                    com.max.hbutils.utils.c.f(this.f83641b.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(t10.getMsg());
                }
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31602, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31603, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(result);
        }
    }

    /* JADX INFO: compiled from: CYPageViewModel.kt */
    public static final class d implements com.max.xiaoheihe.base.mvvm.repository.a<BBSUserMsgResult<List<? extends BBSUserMsgObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void a(@dl.d BBSUserMsgResult<List<BBSUserMsgObj>> t10) {
            List<BBSUserMsgObj> result;
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31604, new Class[]{BBSUserMsgResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (f0.g(CYPageViewModel.this.m().f(), Boolean.TRUE) && (result = t10.getResult()) != null) {
                CYPageViewModel cYPageViewModel = CYPageViewModel.this;
                for (BBSUserMsgObj bBSUserMsgObj : result) {
                    bBSUserMsgObj.setUser_a(t10.getUser());
                    bBSUserMsgObj.setMessage_type("-2");
                }
                cYPageViewModel.v().addAll(result);
                cYPageViewModel.z().r(Boolean.FALSE);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31606, new Class[0], Void.TYPE).isSupported && f0.g(CYPageViewModel.this.m().f(), Boolean.TRUE)) {
                i0<Boolean> i0VarZ = CYPageViewModel.this.z();
                Boolean bool = Boolean.FALSE;
                i0VarZ.r(bool);
                CYPageViewModel.this.k().r(BaseDisplayState.CONTENT);
                CYPageViewModel.this.x().r(Boolean.valueOf(f0.g(CYPageViewModel.this.x().f(), bool)));
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31605, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(CYPageViewModel.this.m().f(), Boolean.TRUE)) {
                CYPageViewModel.this.k().r(BaseDisplayState.ERROR);
                CYPageViewModel.this.z().r(Boolean.FALSE);
            }
        }

        @Override // com.max.xiaoheihe.base.mvvm.repository.a
        public /* bridge */ /* synthetic */ void onNext(BBSUserMsgResult<List<? extends BBSUserMsgObj>> bBSUserMsgResult) {
            if (PatchProxy.proxy(new Object[]{bBSUserMsgResult}, this, changeQuickRedirect, false, 31607, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(bBSUserMsgResult);
        }
    }

    public CYPageViewModel() {
        Boolean bool = Boolean.FALSE;
        this.f83629l = new i0<>(bool);
        this.f83630m = new i0<>(bool);
        this.f83632o = "0";
        this.f83633p = new ArrayList<>();
    }

    private final void t(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31594, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Boolean boolF = this.f83629l.f();
        Boolean bool = Boolean.TRUE;
        if (f0.g(boolF, bool)) {
            return;
        }
        if (z10) {
            this.f83631n = 0;
            this.f83633p.clear();
        } else {
            this.f83631n += 30;
        }
        this.f83629l.r(bool);
        y().d(this.f83631n, this.f83632o, new d());
    }

    private final com.max.xiaoheihe.module.favour.d y() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31584, new Class[0], com.max.xiaoheihe.module.favour.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.favour.d) patchProxyResultProxy.result : (com.max.xiaoheihe.module.favour.d) this.f83628k.getValue();
    }

    public final void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31593, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t(false);
    }

    public final void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31592, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t(true);
    }

    public final void C(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31587, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f83632o = str;
    }

    public final void D(int i10) {
        this.f83631n = i10;
    }

    public final void E(@dl.d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 31586, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f83630m = i0Var;
    }

    public final void F(@dl.d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 31585, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f83629l = i0Var;
    }

    @Override // com.max.xiaoheihe.base.mvvm.a
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31588, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        B();
    }

    public final void p(@dl.d Context context, @dl.d String id2) {
        if (PatchProxy.proxy(new Object[]{context, id2}, this, changeQuickRedirect, false, 31591, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(id2, "id");
        y().a(id2, new a(context, id2));
    }

    public final void r(@dl.d String commentID, @dl.d String op) {
        if (PatchProxy.proxy(new Object[]{commentID, op}, this, changeQuickRedirect, false, 31589, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(commentID, "commentID");
        f0.p(op, "op");
        y().b(commentID, op, new b(commentID, op));
    }

    public final void s(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 31590, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        y().c(str, str2, str3, str4, str5, str6, str7, new c(context));
    }

    @dl.d
    public final String u() {
        return this.f83632o;
    }

    @dl.d
    public final ArrayList<BBSUserMsgObj> v() {
        return this.f83633p;
    }

    public final int w() {
        return this.f83631n;
    }

    @dl.d
    public final i0<Boolean> x() {
        return this.f83630m;
    }

    @dl.d
    public final i0<Boolean> z() {
        return this.f83629l;
    }
}
