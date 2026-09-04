package com.max.xiaoheihe.module.game.pick;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import com.max.hbcommon.base.d;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pick.OwnGamePlatfObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import mb.e1;
import xh.m;

/* JADX INFO: compiled from: AddGameOwnFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final C0804a f87968e = new C0804a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f87969f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e1 f87970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.viewpager.widget.a f87971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final ArrayList<KeyDescObj> f87972d = new ArrayList<>();

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.pick.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AddGameOwnFragment.kt */
    public static final class C0804a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0804a() {
        }

        public /* synthetic */ C0804a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38087, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
        }
    }

    /* JADX INFO: compiled from: AddGameOwnFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<OwnGamePlatfObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38088, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (a.this.isActive()) {
                super.onError(e10);
                a.N3(a.this);
            }
        }

        public void onNext(@dl.d Result<OwnGamePlatfObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38089, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (a.this.isActive()) {
                a aVar = a.this;
                OwnGamePlatfObj result2 = result.getResult();
                f0.o(result2, "result.result");
                a.M3(aVar, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38090, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OwnGamePlatfObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AddGameOwnFragment.kt */
    public static final class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38092, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a.this.f87972d.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38091, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : com.max.xiaoheihe.module.game.pick.b.f87975h.b(((KeyDescObj) a.this.f87972d.get(i10)).getKey());
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@dl.d Object object) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{object}, this, changeQuickRedirect, false, 38094, new Class[]{Object.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            f0.p(object, "object");
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @e
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38093, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : ((KeyDescObj) a.this.f87972d.get(i10)).getTitle();
        }
    }

    public static final /* synthetic */ void M3(a aVar, OwnGamePlatfObj ownGamePlatfObj) {
        if (PatchProxy.proxy(new Object[]{aVar, ownGamePlatfObj}, null, changeQuickRedirect, true, 38086, new Class[]{a.class, OwnGamePlatfObj.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.U3(ownGamePlatfObj);
    }

    public static final /* synthetic */ void N3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 38085, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.showError();
    }

    private final void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38082, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().e7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38081, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O3().f131536b.setBackgroundResource(R.color.background_layer_2_color);
        O3().f131536b.setViewPager(O3().f131537c);
        O3().f131536b.getLayoutParams().height = ViewUtils.f(this.mContext, 42.0f);
        O3().f131536b.setTabSpaceEqual(false);
        O3().f131536b.setTabPadding(10.0f);
        ViewGroup.LayoutParams layoutParams = O3().f131536b.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ViewUtils.f(this.mContext, 2.0f);
        marginLayoutParams.rightMargin = ViewUtils.f(this.mContext, 2.0f);
    }

    private final void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38080, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        W3(new c(getChildFragmentManager()));
        O3().f131537c.setAdapter(P3());
        O3().f131537c.setOffscreenPageLimit(4);
    }

    @dl.d
    @m
    public static final a T3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38084, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f87968e.a();
    }

    private final void U3(OwnGamePlatfObj ownGamePlatfObj) {
        if (PatchProxy.proxy(new Object[]{ownGamePlatfObj}, this, changeQuickRedirect, false, 38083, new Class[]{OwnGamePlatfObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<KeyDescObj> game_types = ownGamePlatfObj.getGame_types();
        if (game_types == null || game_types.isEmpty()) {
            showEmpty(R.drawable.common_tag_common_45x45, "暂无拥有游戏");
            return;
        }
        List<KeyDescObj> game_types2 = ownGamePlatfObj.getGame_types();
        if (game_types2 != null) {
            this.f87972d.clear();
            this.f87972d.addAll(game_types2);
            P3().notifyDataSetChanged();
            if (game_types2.size() > 1) {
                O3().f131536b.setVisibility(0);
            } else {
                O3().f131536b.setVisibility(8);
            }
            O3().f131536b.notifyDataSetChanged();
        }
    }

    @dl.d
    public final e1 O3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38075, new Class[0], e1.class);
        if (patchProxyResultProxy.isSupported) {
            return (e1) patchProxyResultProxy.result;
        }
        e1 e1Var = this.f87970b;
        if (e1Var != null) {
            return e1Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final androidx.viewpager.widget.a P3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38077, new Class[0], androidx.viewpager.widget.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.viewpager.widget.a) patchProxyResultProxy.result;
        }
        androidx.viewpager.widget.a aVar = this.f87971c;
        if (aVar != null) {
            return aVar;
        }
        f0.S("mPagerAdapter");
        return null;
    }

    public final void V3(@dl.d e1 e1Var) {
        if (PatchProxy.proxy(new Object[]{e1Var}, this, changeQuickRedirect, false, 38076, new Class[]{e1.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e1Var, "<set-?>");
        this.f87970b = e1Var;
    }

    public final void W3(@dl.d androidx.viewpager.widget.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 38078, new Class[]{androidx.viewpager.widget.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f87971c = aVar;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38079, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        e1 e1VarC = e1.c(getLayoutInflater());
        f0.o(e1VarC, "inflate(layoutInflater)");
        V3(e1VarC);
        setContentView(O3());
        S3();
        R3();
        Q3();
    }
}
