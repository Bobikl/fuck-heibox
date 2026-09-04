package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardListV2Obj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class GameCardListV2Obj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String color;

    @e
    private final String desc;

    @e
    private ArrayList<GameCardV2Obj> games;

    @e
    private final String icon;

    @e
    private final String image;

    @e
    private final String more_button_text;

    @e
    private final String name;

    @e
    private final String prot;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15349, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCardListV2Obj)) {
            return false;
        }
        GameCardListV2Obj gameCardListV2Obj = (GameCardListV2Obj) obj;
        return f0.g(this.image, gameCardListV2Obj.image) && f0.g(this.icon, gameCardListV2Obj.icon) && f0.g(this.name, gameCardListV2Obj.name) && f0.g(this.desc, gameCardListV2Obj.desc) && f0.g(this.prot, gameCardListV2Obj.prot) && f0.g(this.more_button_text, gameCardListV2Obj.more_button_text) && f0.g(this.color, gameCardListV2Obj.color) && f0.g(this.games, gameCardListV2Obj.games);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final ArrayList<GameCardV2Obj> getGames() {
        return this.games;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getMore_button_text() {
        return this.more_button_text;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15350, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.image;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.prot;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.more_button_text;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        ArrayList<GameCardV2Obj> arrayList = this.games;
        return iHashCode7 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setGames(@e ArrayList<GameCardV2Obj> arrayList) {
        this.games = arrayList;
    }
}
