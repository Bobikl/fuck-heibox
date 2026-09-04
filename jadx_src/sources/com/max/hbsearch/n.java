package com.max.hbsearch;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: SearchHost.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface n {

    /* JADX INFO: compiled from: SearchHost.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static /* synthetic */ void a(n nVar, String str, String str2, String str3, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{nVar, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 8004, new Class[]{n.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSearchHistory");
            }
            nVar.v1(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) == 0 ? str3 : null);
        }

        public static /* synthetic */ void b(n nVar, KeyDescObj keyDescObj, String str, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{nVar, keyDescObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 8003, new Class[]{n.class, KeyDescObj.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performSearch");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            nVar.s1(keyDescObj, str);
        }
    }

    void s1(@dl.e KeyDescObj keyDescObj, @dl.e String str);

    void v1(@dl.e String str, @dl.e String str2, @dl.e String str3);
}
