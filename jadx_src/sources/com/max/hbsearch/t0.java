package com.max.hbsearch;

import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: SearchPageConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final t0 f72375a = new t0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private t0() {
    }

    @dl.e
    public final List<SearchHotwordObj> a(int i10) {
        SearchHotwordsObj searchHotwordsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.D5, new Class[]{Integer.TYPE}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (i10 == 1 || i10 == 5 || i10 == 11 || i10 == 18 || i10 == 35 || i10 == 39 || i10 == 14 || i10 == 15 || (searchHotwordsObj = o.f72358b) == null) {
            return null;
        }
        return searchHotwordsObj.getHashtag_list();
    }

    public final boolean b(int i10) {
        return i10 != 36;
    }

    public final boolean c(int i10) {
        return (i10 == 7 || i10 == 8 || i10 == 12 || i10 == 10 || i10 == 13 || i10 == 16 || i10 == 25 || i10 == 28 || i10 == 27 || i10 == 36) ? false : true;
    }

    public final boolean d(int i10) {
        if (i10 != 5 && i10 != 25 && i10 != 39 && i10 != 7 && i10 != 8 && i10 != 27 && i10 != 28 && i10 != 35 && i10 != 36) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public final boolean e(int i10) {
        return i10 == 37;
    }

    public final boolean f(int i10) {
        return i10 == 35 || i10 == 36;
    }
}
