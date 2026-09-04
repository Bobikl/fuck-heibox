package com.max.hblogistics;

import com.max.hbcommon.base.adapter.s;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: AddressUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.Ag, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        return str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

    public static void b(s.e eVar, AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, addressInfoObj}, null, changeQuickRedirect, true, bb.c.g.f33238zg, new Class[]{s.e.class, AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.p(R.id.tv_name, addressInfoObj.getName());
        eVar.p(R.id.tv_phone, a(addressInfoObj.getPhone()));
        eVar.p(R.id.tv_detail, String.format("%s%s%s%s", addressInfoObj.getProvince(), addressInfoObj.getCity(), addressInfoObj.getDistrict(), addressInfoObj.getDetail()));
        eVar.i(R.id.tv_default_tag).setVisibility(com.max.hbcommon.utils.c.x(addressInfoObj.getIs_default()) ? 0 : 8);
    }
}
