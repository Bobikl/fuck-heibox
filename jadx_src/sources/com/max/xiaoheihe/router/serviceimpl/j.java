package com.max.xiaoheihe.router.serviceimpl;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.xiaoheihe.module.bbs.HashtagDetailActivity;
import com.max.xiaoheihe.module.game.CouponGivingActivity;
import com.max.xiaoheihe.module.game.GameStoreActivity;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;

/* JADX INFO: compiled from: RouterToPathImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.j.class}, key = {ob.b.f132253e})
public class j implements pb.j {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // pb.j
    public void a(@n0 Context context, @n0 String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 48385, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.R(context, str, false).A();
    }

    @Override // pb.j
    public void b(@n0 Context context, @n0 String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 48384, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.j0(context, str);
    }

    @Override // pb.j
    public void c(@n0 Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48390, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        context.startActivity(GameStoreActivity.R1(context));
    }

    @Override // pb.j
    @n0
    public com.sankuai.waimai.router.common.c d(@n0 Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 48394, new Class[]{Context.class, Integer.TYPE}, com.sankuai.waimai.router.common.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result : com.max.xiaoheihe.base.router.b.w0(context, i10);
    }

    @Override // pb.j
    public void e(@n0 Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48387, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        l0.f95687b.C(context, null, l0.A(lb.a.f130993k3, null, true, true, true, true), null);
    }

    @Override // pb.j
    @n0
    public com.sankuai.waimai.router.common.c f(@n0 Context context, @n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 48386, new Class[]{Context.class, String.class}, com.sankuai.waimai.router.common.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result : com.max.xiaoheihe.base.router.b.f(context, str);
    }

    @Override // pb.j
    @n0
    public com.sankuai.waimai.router.common.c g(@n0 Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48393, new Class[]{Context.class, Boolean.TYPE}, com.sankuai.waimai.router.common.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result : com.max.xiaoheihe.base.router.b.C(context, z10);
    }

    @Override // pb.j
    @n0
    public com.sankuai.waimai.router.common.c h(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 48395, new Class[]{Context.class}, com.sankuai.waimai.router.common.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.c) patchProxyResultProxy.result : com.max.xiaoheihe.base.router.b.P(context);
    }

    @Override // pb.j
    @n0
    public Intent i(@n0 Context context, @n0 String str, @n0 String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, 48388, new Class[]{Context.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : CouponGivingActivity.h2(context, str, str2);
    }

    @Override // pb.j
    public void j(@n0 Context context, @p0 String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 48391, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        context.startActivity(HashtagDetailActivity.x2(context, str));
    }

    @Override // pb.j
    public void k(@n0 Context context, @n0 String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 48383, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.i0(context, str);
    }

    @Override // pb.j
    public void l(@n0 Context context, @p0 String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 48389, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.T(context, str).A();
    }

    @Override // pb.j
    public void m(@n0 Context context, @p0 String str, @p0 String str2, @p0 String str3) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3}, this, changeQuickRedirect, false, 48392, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        context.startActivity(HashtagDetailActivity.z2(context, str, str2, str3));
    }
}
