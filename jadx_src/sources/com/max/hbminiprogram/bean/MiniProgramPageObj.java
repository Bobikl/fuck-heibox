package com.max.hbminiprogram.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramPageObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MiniProgramPageObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String is_v2;

    @e
    private MiniProgramBoardObj main_page_menu;

    @e
    private Boolean my_app_is_full;

    public MiniProgramPageObj(@e MiniProgramBoardObj miniProgramBoardObj, @e Boolean bool, @e String str) {
        this.main_page_menu = miniProgramBoardObj;
        this.my_app_is_full = bool;
        this.is_v2 = str;
    }

    public static /* synthetic */ MiniProgramPageObj copy$default(MiniProgramPageObj miniProgramPageObj, MiniProgramBoardObj miniProgramBoardObj, Boolean bool, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramPageObj, miniProgramBoardObj, bool, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.H, new Class[]{MiniProgramPageObj.class, MiniProgramBoardObj.class, Boolean.class, String.class, Integer.TYPE, Object.class}, MiniProgramPageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MiniProgramPageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            miniProgramBoardObj = miniProgramPageObj.main_page_menu;
        }
        if ((i10 & 2) != 0) {
            bool = miniProgramPageObj.my_app_is_full;
        }
        if ((i10 & 4) != 0) {
            str = miniProgramPageObj.is_v2;
        }
        return miniProgramPageObj.copy(miniProgramBoardObj, bool, str);
    }

    @e
    public final MiniProgramBoardObj component1() {
        return this.main_page_menu;
    }

    @e
    public final Boolean component2() {
        return this.my_app_is_full;
    }

    @e
    public final String component3() {
        return this.is_v2;
    }

    @d
    public final MiniProgramPageObj copy(@e MiniProgramBoardObj miniProgramBoardObj, @e Boolean bool, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramBoardObj, bool, str}, this, changeQuickRedirect, false, c.h.G, new Class[]{MiniProgramBoardObj.class, Boolean.class, String.class}, MiniProgramPageObj.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramPageObj) patchProxyResultProxy.result : new MiniProgramPageObj(miniProgramBoardObj, bool, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.K, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniProgramPageObj)) {
            return false;
        }
        MiniProgramPageObj miniProgramPageObj = (MiniProgramPageObj) obj;
        return f0.g(this.main_page_menu, miniProgramPageObj.main_page_menu) && f0.g(this.my_app_is_full, miniProgramPageObj.my_app_is_full) && f0.g(this.is_v2, miniProgramPageObj.is_v2);
    }

    @e
    public final MiniProgramBoardObj getMain_page_menu() {
        return this.main_page_menu;
    }

    @e
    public final Boolean getMy_app_is_full() {
        return this.my_app_is_full;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.J, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        MiniProgramBoardObj miniProgramBoardObj = this.main_page_menu;
        int iHashCode = (miniProgramBoardObj == null ? 0 : miniProgramBoardObj.hashCode()) * 31;
        Boolean bool = this.my_app_is_full;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.is_v2;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @e
    public final String is_v2() {
        return this.is_v2;
    }

    public final void setMain_page_menu(@e MiniProgramBoardObj miniProgramBoardObj) {
        this.main_page_menu = miniProgramBoardObj;
    }

    public final void setMy_app_is_full(@e Boolean bool) {
        this.my_app_is_full = bool;
    }

    public final void set_v2(@e String str) {
        this.is_v2 = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.I, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MiniProgramPageObj(main_page_menu=" + this.main_page_menu + ", my_app_is_full=" + this.my_app_is_full + ", is_v2=" + this.is_v2 + ')';
    }
}
