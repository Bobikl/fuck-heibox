package com.max.xiaoheihe.module.account.accelworld;

import ad.c;
import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.network.p;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.d;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import io.reactivex.schedulers.b;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldAccount.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.accelworld.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccelWorldAccount.kt */
    public static final class RunnableC0648a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ User f78719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78720c;

        RunnableC0648a(User user, String str) {
            this.f78719b = user;
            this.f78720c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24769, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a.c(this.f78719b);
            i0.z(this.f78719b);
            HeyBoxApplication.C().F();
            z<Result> zVarA4 = i.a().T9(this.f78720c).I5(b.d()).a4(io.reactivex.android.schedulers.a.c());
            if (zVarA4 != null) {
                zVarA4.g(new p());
            }
            BaseApplication baseApplicationA = BaseApplication.a();
            Intent intent = new Intent(baseApplicationA, (Class<?>) MainActivity.class);
            intent.addFlags(32768);
            intent.addFlags(268435456);
            d.G1(baseApplicationA, intent);
        }
    }

    public static final boolean a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24764, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<User> it = e().iterator();
        while (it.hasNext()) {
            if (b(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(@e User user) {
        AccountDetailObj account_detail;
        String userid;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{user}, null, changeQuickRedirect, true, 24765, new Class[]{User.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (n.q(user != null ? user.getCan_manager_account_quantity() : null) <= 1) {
            return user != null && (account_detail = user.getAccount_detail()) != null && (userid = account_detail.getUserid()) != null && com.max.xiaoheihe.accelworld.a.c(userid);
        }
        return true;
    }

    public static final synchronized void c(@dl.d User user) {
        if (PatchProxy.proxy(new Object[]{user}, null, changeQuickRedirect, true, 24761, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(user, "user");
        List<User> listE = e();
        if (listE.contains(user)) {
            listE.remove(user);
            listE.add(0, user);
        } else {
            listE.add(user);
        }
        i(listE);
    }

    public static final synchronized void d() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24767, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MMKVManager.f71329a.o(c.f1239s, c.f1240t, null, false);
    }

    @dl.d
    public static final synchronized List<User> e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24759, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        String strI = MMKVManager.f71329a.i(c.f1239s, c.f1240t, null, false);
        List<User> listB = strI != null ? k.b(strI, User.class) : null;
        if (listB == null) {
            listB = new ArrayList<>();
        }
        return listB;
    }

    public static final int f() {
        String userid;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24766, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<User> listE = e();
        if (!(!listE.isEmpty())) {
            listE = null;
        }
        if (listE == null) {
            return 0;
        }
        int i10 = 0;
        for (User user : listE) {
            AccountDetailObj account_detail = user.getAccount_detail();
            if ((account_detail == null || (userid = account_detail.getUserid()) == null || !com.max.xiaoheihe.accelworld.a.c(userid)) ? false : true) {
                return Integer.MAX_VALUE;
            }
            int iQ = n.q(user.getCan_manager_account_quantity());
            if (iQ > i10) {
                i10 = iQ;
            }
        }
        return i10;
    }

    public static final synchronized void g(@e User user) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{user}, null, changeQuickRedirect, true, 24762, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        if (user != null) {
            List<User> listE = e();
            listE.remove(user);
            Iterator<User> it = listE.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
            } while (!b(it.next()));
            if (z10) {
                i(listE);
            } else {
                d();
            }
        }
    }

    public static final void h(@e String str) {
        if (!PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24768, new Class[]{String.class}, Void.TYPE).isSupported && i0.s()) {
            i0.i().setCan_manager_account_quantity(str);
            User userI = i0.i();
            f0.o(userI, "getCurrentUser()");
            c(userI);
        }
    }

    public static final synchronized void i(@dl.d List<User> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 24760, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        MMKVManager.f71329a.o(c.f1239s, c.f1240t, k.r(list), false);
    }

    public static final synchronized void j(@dl.d Context context, @dl.d User user) {
        if (PatchProxy.proxy(new Object[]{context, user}, null, changeQuickRedirect, true, 24763, new Class[]{Context.class, User.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(user, "user");
        d.Z0(context, new RunnableC0648a(user, i0.j()));
    }
}
