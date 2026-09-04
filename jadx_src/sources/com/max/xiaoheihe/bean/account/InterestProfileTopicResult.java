package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: InterestProfileTopicResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class InterestProfileTopicResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private Integer follow_topic_limit;

    @e
    private ArrayList<BBSTopicObj> followed;

    @e
    private ArrayList<BBSTopicObj> hots;

    @e
    private ArrayList<BBSTopicObj> recommends;

    @e
    private String title;

    public InterestProfileTopicResult(@e String str, @e String str2, @e Integer num, @e ArrayList<BBSTopicObj> arrayList, @e ArrayList<BBSTopicObj> arrayList2, @e ArrayList<BBSTopicObj> arrayList3) {
        this.desc = str;
        this.title = str2;
        this.follow_topic_limit = num;
        this.followed = arrayList;
        this.recommends = arrayList2;
        this.hots = arrayList3;
    }

    public static /* synthetic */ InterestProfileTopicResult copy$default(InterestProfileTopicResult interestProfileTopicResult, String str, String str2, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{interestProfileTopicResult, str, str2, num, arrayList, arrayList2, arrayList3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.GP, new Class[]{InterestProfileTopicResult.class, String.class, String.class, Integer.class, ArrayList.class, ArrayList.class, ArrayList.class, Integer.TYPE, Object.class}, InterestProfileTopicResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (InterestProfileTopicResult) patchProxyResultProxy.result;
        }
        return interestProfileTopicResult.copy((i10 & 1) != 0 ? interestProfileTopicResult.desc : str, (i10 & 2) != 0 ? interestProfileTopicResult.title : str2, (i10 & 4) != 0 ? interestProfileTopicResult.follow_topic_limit : num, (i10 & 8) != 0 ? interestProfileTopicResult.followed : arrayList, (i10 & 16) != 0 ? interestProfileTopicResult.recommends : arrayList2, (i10 & 32) != 0 ? interestProfileTopicResult.hots : arrayList3);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final Integer component3() {
        return this.follow_topic_limit;
    }

    @e
    public final ArrayList<BBSTopicObj> component4() {
        return this.followed;
    }

    @e
    public final ArrayList<BBSTopicObj> component5() {
        return this.recommends;
    }

    @e
    public final ArrayList<BBSTopicObj> component6() {
        return this.hots;
    }

    @d
    public final InterestProfileTopicResult copy(@e String str, @e String str2, @e Integer num, @e ArrayList<BBSTopicObj> arrayList, @e ArrayList<BBSTopicObj> arrayList2, @e ArrayList<BBSTopicObj> arrayList3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, num, arrayList, arrayList2, arrayList3}, this, changeQuickRedirect, false, c.m.FP, new Class[]{String.class, String.class, Integer.class, ArrayList.class, ArrayList.class, ArrayList.class}, InterestProfileTopicResult.class);
        return patchProxyResultProxy.isSupported ? (InterestProfileTopicResult) patchProxyResultProxy.result : new InterestProfileTopicResult(str, str2, num, arrayList, arrayList2, arrayList3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13875, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestProfileTopicResult)) {
            return false;
        }
        InterestProfileTopicResult interestProfileTopicResult = (InterestProfileTopicResult) obj;
        return f0.g(this.desc, interestProfileTopicResult.desc) && f0.g(this.title, interestProfileTopicResult.title) && f0.g(this.follow_topic_limit, interestProfileTopicResult.follow_topic_limit) && f0.g(this.followed, interestProfileTopicResult.followed) && f0.g(this.recommends, interestProfileTopicResult.recommends) && f0.g(this.hots, interestProfileTopicResult.hots);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final Integer getFollow_topic_limit() {
        return this.follow_topic_limit;
    }

    @e
    public final ArrayList<BBSTopicObj> getFollowed() {
        return this.followed;
    }

    @e
    public final ArrayList<BBSTopicObj> getHots() {
        return this.hots;
    }

    @e
    public final ArrayList<BBSTopicObj> getRecommends() {
        return this.recommends;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.IP, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.follow_topic_limit;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList<BBSTopicObj> arrayList = this.followed;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<BBSTopicObj> arrayList2 = this.recommends;
        int iHashCode5 = (iHashCode4 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<BBSTopicObj> arrayList3 = this.hots;
        return iHashCode5 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setFollow_topic_limit(@e Integer num) {
        this.follow_topic_limit = num;
    }

    public final void setFollowed(@e ArrayList<BBSTopicObj> arrayList) {
        this.followed = arrayList;
    }

    public final void setHots(@e ArrayList<BBSTopicObj> arrayList) {
        this.hots = arrayList;
    }

    public final void setRecommends(@e ArrayList<BBSTopicObj> arrayList) {
        this.recommends = arrayList;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.HP, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "InterestProfileTopicResult(desc=" + this.desc + ", title=" + this.title + ", follow_topic_limit=" + this.follow_topic_limit + ", followed=" + this.followed + ", recommends=" + this.recommends + ", hots=" + this.hots + ')';
    }
}
