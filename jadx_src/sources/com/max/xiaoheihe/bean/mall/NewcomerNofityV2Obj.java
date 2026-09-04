package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewcomerNotifyObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class NewcomerNofityV2Obj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<MallCouponObj> coupons;

    @e
    private ArrayList<GameObj> game;

    @e
    private String prot;

    @e
    private String sub_title;

    @e
    private String title;

    public NewcomerNofityV2Obj(@e String str, @e String str2, @e String str3, @e ArrayList<MallCouponObj> arrayList, @e ArrayList<GameObj> arrayList2) {
        this.sub_title = str;
        this.title = str2;
        this.prot = str3;
        this.coupons = arrayList;
        this.game = arrayList2;
    }

    public static /* synthetic */ NewcomerNofityV2Obj copy$default(NewcomerNofityV2Obj newcomerNofityV2Obj, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerNofityV2Obj, str, str2, str3, arrayList, arrayList2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15532, new Class[]{NewcomerNofityV2Obj.class, String.class, String.class, String.class, ArrayList.class, ArrayList.class, Integer.TYPE, Object.class}, NewcomerNofityV2Obj.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewcomerNofityV2Obj) patchProxyResultProxy.result;
        }
        return newcomerNofityV2Obj.copy((i10 & 1) != 0 ? newcomerNofityV2Obj.sub_title : str, (i10 & 2) != 0 ? newcomerNofityV2Obj.title : str2, (i10 & 4) != 0 ? newcomerNofityV2Obj.prot : str3, (i10 & 8) != 0 ? newcomerNofityV2Obj.coupons : arrayList, (i10 & 16) != 0 ? newcomerNofityV2Obj.game : arrayList2);
    }

    @e
    public final String component1() {
        return this.sub_title;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.prot;
    }

    @e
    public final ArrayList<MallCouponObj> component4() {
        return this.coupons;
    }

    @e
    public final ArrayList<GameObj> component5() {
        return this.game;
    }

    @d
    public final NewcomerNofityV2Obj copy(@e String str, @e String str2, @e String str3, @e ArrayList<MallCouponObj> arrayList, @e ArrayList<GameObj> arrayList2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, arrayList, arrayList2}, this, changeQuickRedirect, false, 15531, new Class[]{String.class, String.class, String.class, ArrayList.class, ArrayList.class}, NewcomerNofityV2Obj.class);
        return patchProxyResultProxy.isSupported ? (NewcomerNofityV2Obj) patchProxyResultProxy.result : new NewcomerNofityV2Obj(str, str2, str3, arrayList, arrayList2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15535, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewcomerNofityV2Obj)) {
            return false;
        }
        NewcomerNofityV2Obj newcomerNofityV2Obj = (NewcomerNofityV2Obj) obj;
        return f0.g(this.sub_title, newcomerNofityV2Obj.sub_title) && f0.g(this.title, newcomerNofityV2Obj.title) && f0.g(this.prot, newcomerNofityV2Obj.prot) && f0.g(this.coupons, newcomerNofityV2Obj.coupons) && f0.g(this.game, newcomerNofityV2Obj.game);
    }

    @e
    public final ArrayList<MallCouponObj> getCoupons() {
        return this.coupons;
    }

    @e
    public final ArrayList<GameObj> getGame() {
        return this.game;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    @e
    public final String getSub_title() {
        return this.sub_title;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15534, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.sub_title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prot;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList<MallCouponObj> arrayList = this.coupons;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<GameObj> arrayList2 = this.game;
        return iHashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final void setCoupons(@e ArrayList<MallCouponObj> arrayList) {
        this.coupons = arrayList;
    }

    public final void setGame(@e ArrayList<GameObj> arrayList) {
        this.game = arrayList;
    }

    public final void setProt(@e String str) {
        this.prot = str;
    }

    public final void setSub_title(@e String str) {
        this.sub_title = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15533, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NewcomerNofityV2Obj(sub_title=" + this.sub_title + ", title=" + this.title + ", prot=" + this.prot + ", coupons=" + this.coupons + ", game=" + this.game + ')';
    }
}
