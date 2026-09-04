package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.BindInfoObj;
import com.max.xiaoheihe.bean.game.GameBindInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;

/* JADX INFO: compiled from: GameStatsManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile n0 f87839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static GameBindInfoObj f87840b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameStatsManager.java */
    public class a extends com.max.hbcommon.network.d<GameBindInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.reactivex.g0 f87841b;

        a(io.reactivex.g0 g0Var) {
            this.f87841b = g0Var;
        }

        public void a(GameBindInfoObj gameBindInfoObj) {
            if (PatchProxy.proxy(new Object[]{gameBindInfoObj}, this, changeQuickRedirect, false, 33847, new Class[]{GameBindInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(gameBindInfoObj);
            n0.f87840b = gameBindInfoObj;
            io.reactivex.g0 g0Var = this.f87841b;
            if (g0Var != null) {
                g0Var.onNext(gameBindInfoObj);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33848, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((GameBindInfoObj) obj);
        }
    }

    /* JADX INFO: compiled from: GameStatsManager.java */
    public class b implements kh.o<Result<GameBindInfoObj>, GameBindInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public GameBindInfoObj a(Result<GameBindInfoObj> result) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33849, new Class[]{Result.class}, GameBindInfoObj.class);
            return patchProxyResultProxy.isSupported ? (GameBindInfoObj) patchProxyResultProxy.result : result.getResult();
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.xiaoheihe.bean.game.GameBindInfoObj, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ GameBindInfoObj apply(Result<GameBindInfoObj> result) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33850, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(result);
        }
    }

    private n0() {
    }

    private io.reactivex.z<GameBindInfoObj> b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33843, new Class[0], io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        GameBindInfoObj gameBindInfoObj = f87840b;
        return gameBindInfoObj != null ? io.reactivex.z.l3(gameBindInfoObj).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()) : com.max.xiaoheihe.network.i.a().Tb().z3(new b()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c());
    }

    public static n0 c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 33841, new Class[0], n0.class);
        if (patchProxyResultProxy.isSupported) {
            return (n0) patchProxyResultProxy.result;
        }
        if (f87839a == null) {
            synchronized (n0.class) {
                if (f87839a == null) {
                    f87839a = new n0();
                }
            }
        }
        return f87839a;
    }

    public static Drawable d(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 33844, new Class[]{Context.class, String.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap(16);
        map.put(lb.a.S0, Integer.valueOf(R.drawable.game_dac_entry_80x40));
        map.put(lb.a.L0, Integer.valueOf(R.drawable.game_apex_logo_80x40));
        map.put(lb.a.J0, Integer.valueOf(R.drawable.pubg_entry));
        map.put(lb.a.K0, Integer.valueOf(R.drawable.r6_entry));
        map.put(lb.a.M0, Integer.valueOf(R.drawable.ow_entry));
        map.put(lb.a.R0, Integer.valueOf(R.drawable.game_destiny2_entry_80x40));
        map.put(lb.a.T0, Integer.valueOf(R.drawable.game_csgob5_entry_80x40));
        map.put("csgo", Integer.valueOf(R.drawable.game_csgo_entry_80x40));
        map.put(lb.a.V0, Integer.valueOf(R.drawable.game_csgo5e_entry_80x40));
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return context.getResources().getDrawable(num.intValue());
        }
        return null;
    }

    public BindInfoObj a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33846, new Class[]{String.class}, BindInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BindInfoObj) patchProxyResultProxy.result;
        }
        GameBindInfoObj gameBindInfoObj = f87840b;
        if (gameBindInfoObj != null && gameBindInfoObj.getBind_infos() != null && str != null) {
            for (BindInfoObj bindInfoObj : f87840b.getBind_infos()) {
                if (str.equals(bindInfoObj.getGame_stat())) {
                    return bindInfoObj;
                }
            }
        }
        return null;
    }

    public String e(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 33845, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        BindInfoObj bindInfoObjA = a(str);
        if (bindInfoObjA != null) {
            return bindInfoObjA.getGame_bind_logo();
        }
        return null;
    }

    public void f(io.reactivex.g0<GameBindInfoObj> g0Var) {
        if (PatchProxy.proxy(new Object[]{g0Var}, this, changeQuickRedirect, false, 33842, new Class[]{io.reactivex.g0.class}, Void.TYPE).isSupported) {
            return;
        }
        b().g(new a(g0Var));
    }
}
