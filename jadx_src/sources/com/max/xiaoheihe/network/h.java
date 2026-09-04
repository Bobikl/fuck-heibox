package com.max.xiaoheihe.network;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okhttp3.s;

/* JADX INFO: compiled from: RequestCallback.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface h {

    /* JADX INFO: compiled from: RequestCallback.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static /* synthetic */ void a(h hVar, JsonObject jsonObject, String str, s sVar, int i10, int i11, Object obj) {
            int i12 = i10;
            Object[] objArr = {hVar, jsonObject, str, sVar, new Integer(i12), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47668, new Class[]{h.class, JsonObject.class, String.class, s.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResponse");
            }
            String str2 = (i11 & 2) != 0 ? null : str;
            s sVar2 = (i11 & 4) == 0 ? sVar : null;
            if ((i11 & 8) != 0) {
                i12 = -1;
            }
            hVar.b(jsonObject, str2, sVar2, i12);
        }
    }

    void a(@dl.e Exception exc);

    void b(@dl.e JsonObject jsonObject, @dl.e String str, @dl.e s sVar, int i10);
}
