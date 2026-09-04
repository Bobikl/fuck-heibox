package com.max.hbcommon.utils;

import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: FilterCheckUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static KeyDescObj a(List<KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.f.f32701z0, new Class[]{List.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        for (KeyDescObj keyDescObj : list) {
            if (keyDescObj.isChecked()) {
                return keyDescObj;
            }
        }
        return null;
    }

    public static void b(FiltersObj filtersObj, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{filtersObj, keyDescObj}, null, changeQuickRedirect, true, bb.c.f.A0, new Class[]{FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported || filtersObj == null || keyDescObj == null) {
            return;
        }
        c(filtersObj.getFilters(), keyDescObj);
    }

    public static void c(List<KeyDescObj> list, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{list, keyDescObj}, null, changeQuickRedirect, true, bb.c.f.B0, new Class[]{List.class, KeyDescObj.class}, Void.TYPE).isSupported || list == null || keyDescObj == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : list) {
            if (keyDescObj2.getKey() == null || !keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                keyDescObj2.setChecked(false);
            } else {
                keyDescObj2.setChecked(true);
            }
        }
    }
}
