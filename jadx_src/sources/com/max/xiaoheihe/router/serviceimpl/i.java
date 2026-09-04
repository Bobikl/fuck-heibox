package com.max.xiaoheihe.router.serviceimpl;

import android.os.Build;
import android.util.Log;
import androidx.annotation.n0;
import com.huawei.hms.framework.common.ContainerUtils;
import com.max.hbcommon.network.eventlistener.HBNetEventListener;
import com.max.hbutils.utils.w;
import com.max.security.SecurityTool;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.utils.NDKTools;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.annotation.RouterService;
import java.util.ArrayList;
import okhttp3.a0;
import okhttp3.t;

/* JADX INFO: compiled from: RequestInterceptImpl.java */
/* JADX INFO: loaded from: classes13.dex */
@RouterService(interfaces = {pb.i.class}, key = {"request"})
public class i implements pb.i {
    public static ChangeQuickRedirect changeQuickRedirect;

    private boolean f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48380, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "/bbs/app/feeds/".equals(str) || "/bbs/app/feeds/news/".equals(str) || "/bbs/app/topic/feeds/".equals(str) || "/bbs/app/waterfall/feeds/".equals(str);
    }

    @Override // pb.i
    @n0
    public String a(boolean z10, @n0 a0 a0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), a0Var}, this, changeQuickRedirect, false, 48379, new Class[]{Boolean.TYPE, a0.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.j(com.max.hbcache.c.G0))) {
            return "";
        }
        User userO = i0.o();
        ArrayList arrayList = new ArrayList();
        if (!com.max.hbcommon.utils.c.u(userO.getPkey())) {
            arrayList.add(l0.M() + ContainerUtils.KEY_VALUE_DELIMITER + userO.getPkey());
            if (z10) {
                arrayList.add("x_pkey=" + userO.getPkey());
            }
        }
        if (!com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.h.f())) {
            arrayList.add("x_xhh_tokenid=" + com.max.xiaoheihe.utils.h.f());
        }
        if (!com.max.hbcommon.utils.c.u(a0Var.i("Cookie"))) {
            arrayList.add(a0Var.i("Cookie"));
        }
        if (z10 && userO.isLoginFlag()) {
            arrayList.add("x_heybox_id=" + userO.getAccount_detail().getUserid());
        }
        return arrayList.size() > 0 ? com.max.xiaoheihe.utils.d.T0(arrayList, ';') : "";
    }

    @Override // pb.i
    public void b(@n0 t.a aVar, @n0 String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, this, changeQuickRedirect, false, 48378, new Class[]{t.a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String str2 = (System.currentTimeMillis() / 1000) + "";
        if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.j(com.max.hbcache.c.G0))) {
            aVar.c("is_limitted_visitor", "1");
        } else {
            User userO = i0.o();
            Log.d("HBSecurity", "\n\n\n************ RequestInterceptorImpl *************\n\n");
            String vd2 = SecurityTool.getVD(HeyBoxApplication.C(), SecurityTool.getVX(HeyBoxApplication.C(), "HPPDCEAENEHBFHPASRDCAMNHJLAAPF"), str2, i0.j());
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            String str3 = str + "/";
            SecurityTool.setKN(str2, vd2);
            SecurityTool.setKB(str3, vd2);
            SecurityTool.setKM(str2, vd2);
            if (com.max.hbcommon.utils.c.u(l0.T(aVar.h().getUrl(), "heybox_id"))) {
                aVar.c("heybox_id", userO.isLoginFlag() ? userO.getAccount_detail().getUserid() : "-1");
            }
            NDKTools.encode(HeyBoxApplication.C(), str3, str2, vd2);
            aVar.c(l0.I(), com.max.xiaoheihe.utils.d.U()).c(l0.J(), Build.MODEL).R(l0.L(), vd2).R(l0.N(), SecurityTool.getVA(HeyBoxApplication.C(), vd2));
            if (f(str3)) {
                aVar.c(l0.K(), com.max.hbcommon.utils.i.b(HeyBoxApplication.C()).toLowerCase());
            }
        }
        aVar.c(l0.Q(), "Android").c(l0.W(), "Android").c(l0.V(), "mobile").c(l0.F(), Build.VERSION.RELEASE.trim()).c(l0.R(), com.max.xiaoheihe.utils.d.x0()).c(l0.G(), com.max.xiaoheihe.a.f76430g).R(l0.O(), str2).c(l0.S(), com.max.xiaoheihe.utils.h.e()).c(l0.H(), com.max.xiaoheihe.utils.d.t0()).c(l0.U(), l0.g0()).R(l0.P(), w.D());
    }

    @Override // pb.i
    public boolean c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48381, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ad.a.a(ad.a.f1197d, false);
    }

    @Override // pb.i
    @n0
    public String d() {
        return com.max.xiaoheihe.network.c.f94838c;
    }

    @Override // pb.i
    public int e(Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 48382, new Class[]{Throwable.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : HBNetEventListener.d(th2);
    }
}
