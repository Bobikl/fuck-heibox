package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AwardGameList.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AwardGameList implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String award_id;

    @e
    private String award_name;

    @e
    private ArrayList<GameCardObj> games;

    public AwardGameList(@e String str, @e String str2, @e ArrayList<GameCardObj> arrayList) {
        this.award_id = str;
        this.award_name = str2;
        this.games = arrayList;
    }

    public static /* synthetic */ AwardGameList copy$default(AwardGameList awardGameList, String str, String str2, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{awardGameList, str, str2, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 15332, new Class[]{AwardGameList.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, AwardGameList.class);
        if (patchProxyResultProxy.isSupported) {
            return (AwardGameList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = awardGameList.award_id;
        }
        if ((i10 & 2) != 0) {
            str2 = awardGameList.award_name;
        }
        if ((i10 & 4) != 0) {
            arrayList = awardGameList.games;
        }
        return awardGameList.copy(str, str2, arrayList);
    }

    @e
    public final String component1() {
        return this.award_id;
    }

    @e
    public final String component2() {
        return this.award_name;
    }

    @e
    public final ArrayList<GameCardObj> component3() {
        return this.games;
    }

    @d
    public final AwardGameList copy(@e String str, @e String str2, @e ArrayList<GameCardObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, arrayList}, this, changeQuickRedirect, false, 15331, new Class[]{String.class, String.class, ArrayList.class}, AwardGameList.class);
        return patchProxyResultProxy.isSupported ? (AwardGameList) patchProxyResultProxy.result : new AwardGameList(str, str2, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15335, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwardGameList)) {
            return false;
        }
        AwardGameList awardGameList = (AwardGameList) obj;
        return f0.g(this.award_id, awardGameList.award_id) && f0.g(this.award_name, awardGameList.award_name) && f0.g(this.games, awardGameList.games);
    }

    @e
    public final String getAward_id() {
        return this.award_id;
    }

    @e
    public final String getAward_name() {
        return this.award_name;
    }

    @e
    public final ArrayList<GameCardObj> getGames() {
        return this.games;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15334, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.award_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.award_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<GameCardObj> arrayList = this.games;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setAward_id(@e String str) {
        this.award_id = str;
    }

    public final void setAward_name(@e String str) {
        this.award_name = str;
    }

    public final void setGames(@e ArrayList<GameCardObj> arrayList) {
        this.games = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15333, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AwardGameList(award_id=" + this.award_id + ", award_name=" + this.award_name + ", games=" + this.games + ')';
    }
}
