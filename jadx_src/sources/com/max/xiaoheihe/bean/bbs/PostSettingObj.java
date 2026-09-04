package com.max.xiaoheihe.bean.bbs;

import androidx.collection.k;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PostSettingObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostSettingObj implements Serializable {

    @d
    public static final String POST_ROOT_TYPE_ALL = "1";

    @d
    public static final String POST_ROOT_TYPE_FANS = "2";

    @d
    public static final String POST_ROOT_TYPE_ME = "3";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String articleAuth;

    @e
    private String articleReprintTips;

    @e
    private String articleType;

    @e
    private ArrayList<BBSTopicObj> checkedTopics;
    private boolean headLine;
    private boolean is_edit;

    @e
    private List<KeyDescObj> post_plan;
    private long schedulePostTimeMs;

    @e
    private List<KeyDescObj> select_post_plan;

    @e
    private String source;

    @e
    private LinkImageObj thumbImageObj;

    @e
    private String view_limit;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PostSettingObj.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final boolean isPublic(@e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14455, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return (f0.g(str, "2") || f0.g(str, "3")) ? false : true;
        }
    }

    public PostSettingObj() {
        this(false, null, null, null, null, null, null, null, null, null, false, 0L, 4095, null);
    }

    public PostSettingObj(boolean z10, @e String str, @e LinkImageObj linkImageObj, @e String str2, @e String str3, @e String str4, @e String str5, @e ArrayList<BBSTopicObj> arrayList, @e List<KeyDescObj> list, @e List<KeyDescObj> list2, boolean z11, long j10) {
        this.headLine = z10;
        this.view_limit = str;
        this.thumbImageObj = linkImageObj;
        this.articleType = str2;
        this.articleReprintTips = str3;
        this.source = str4;
        this.articleAuth = str5;
        this.checkedTopics = arrayList;
        this.post_plan = list;
        this.select_post_plan = list2;
        this.is_edit = z11;
        this.schedulePostTimeMs = j10;
    }

    public /* synthetic */ PostSettingObj(boolean z10, String str, LinkImageObj linkImageObj, String str2, String str3, String str4, String str5, ArrayList arrayList, List list, List list2, boolean z11, long j10, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : linkImageObj, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : arrayList, (i10 & 256) != 0 ? null : list, (i10 & 512) == 0 ? list2 : null, (i10 & 1024) == 0 ? z11 : false, (i10 & 2048) != 0 ? 0L : j10);
    }

    public static /* synthetic */ PostSettingObj copy$default(PostSettingObj postSettingObj, boolean z10, String str, LinkImageObj linkImageObj, String str2, String str3, String str4, String str5, ArrayList arrayList, List list, List list2, boolean z11, long j10, int i10, Object obj) {
        long j11 = j10;
        Object[] objArr = {postSettingObj, new Byte(z10 ? (byte) 1 : (byte) 0), str, linkImageObj, str2, str3, str4, str5, arrayList, list, list2, new Byte(z11 ? (byte) 1 : (byte) 0), new Long(j11), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 14451, new Class[]{PostSettingObj.class, cls, String.class, LinkImageObj.class, String.class, String.class, String.class, String.class, ArrayList.class, List.class, List.class, cls, Long.TYPE, Integer.TYPE, Object.class}, PostSettingObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostSettingObj) patchProxyResultProxy.result;
        }
        boolean z12 = (i10 & 1) != 0 ? postSettingObj.headLine : z10 ? 1 : 0;
        String str6 = (i10 & 2) != 0 ? postSettingObj.view_limit : str;
        LinkImageObj linkImageObj2 = (i10 & 4) != 0 ? postSettingObj.thumbImageObj : linkImageObj;
        String str7 = (i10 & 8) != 0 ? postSettingObj.articleType : str2;
        String str8 = (i10 & 16) != 0 ? postSettingObj.articleReprintTips : str3;
        String str9 = (i10 & 32) != 0 ? postSettingObj.source : str4;
        String str10 = (i10 & 64) != 0 ? postSettingObj.articleAuth : str5;
        ArrayList arrayList2 = (i10 & 128) != 0 ? postSettingObj.checkedTopics : arrayList;
        List list3 = (i10 & 256) != 0 ? postSettingObj.post_plan : list;
        List list4 = (i10 & 512) != 0 ? postSettingObj.select_post_plan : list2;
        boolean z13 = (i10 & 1024) != 0 ? postSettingObj.is_edit : z11 ? 1 : 0;
        if ((i10 & 2048) != 0) {
            j11 = postSettingObj.schedulePostTimeMs;
        }
        return postSettingObj.copy(z12, str6, linkImageObj2, str7, str8, str9, str10, arrayList2, list3, list4, z13, j11);
    }

    public final boolean component1() {
        return this.headLine;
    }

    @e
    public final List<KeyDescObj> component10() {
        return this.select_post_plan;
    }

    public final boolean component11() {
        return this.is_edit;
    }

    public final long component12() {
        return this.schedulePostTimeMs;
    }

    @e
    public final String component2() {
        return this.view_limit;
    }

    @e
    public final LinkImageObj component3() {
        return this.thumbImageObj;
    }

    @e
    public final String component4() {
        return this.articleType;
    }

    @e
    public final String component5() {
        return this.articleReprintTips;
    }

    @e
    public final String component6() {
        return this.source;
    }

    @e
    public final String component7() {
        return this.articleAuth;
    }

    @e
    public final ArrayList<BBSTopicObj> component8() {
        return this.checkedTopics;
    }

    @e
    public final List<KeyDescObj> component9() {
        return this.post_plan;
    }

    @d
    public final PostSettingObj copy(boolean z10, @e String str, @e LinkImageObj linkImageObj, @e String str2, @e String str3, @e String str4, @e String str5, @e ArrayList<BBSTopicObj> arrayList, @e List<KeyDescObj> list, @e List<KeyDescObj> list2, boolean z11, long j10) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), str, linkImageObj, str2, str3, str4, str5, arrayList, list, list2, new Byte(z11 ? (byte) 1 : (byte) 0), new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 14450, new Class[]{cls, String.class, LinkImageObj.class, String.class, String.class, String.class, String.class, ArrayList.class, List.class, List.class, cls, Long.TYPE}, PostSettingObj.class);
        return patchProxyResultProxy.isSupported ? (PostSettingObj) patchProxyResultProxy.result : new PostSettingObj(z10, str, linkImageObj, str2, str3, str4, str5, arrayList, list, list2, z11, j10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14454, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostSettingObj)) {
            return false;
        }
        PostSettingObj postSettingObj = (PostSettingObj) obj;
        return this.headLine == postSettingObj.headLine && f0.g(this.view_limit, postSettingObj.view_limit) && f0.g(this.thumbImageObj, postSettingObj.thumbImageObj) && f0.g(this.articleType, postSettingObj.articleType) && f0.g(this.articleReprintTips, postSettingObj.articleReprintTips) && f0.g(this.source, postSettingObj.source) && f0.g(this.articleAuth, postSettingObj.articleAuth) && f0.g(this.checkedTopics, postSettingObj.checkedTopics) && f0.g(this.post_plan, postSettingObj.post_plan) && f0.g(this.select_post_plan, postSettingObj.select_post_plan) && this.is_edit == postSettingObj.is_edit && this.schedulePostTimeMs == postSettingObj.schedulePostTimeMs;
    }

    @e
    public final String getArticleAuth() {
        return this.articleAuth;
    }

    @e
    public final String getArticleReprintTips() {
        return this.articleReprintTips;
    }

    @e
    public final String getArticleType() {
        return this.articleType;
    }

    @e
    public final ArrayList<BBSTopicObj> getCheckedTopics() {
        return this.checkedTopics;
    }

    public final boolean getHeadLine() {
        return this.headLine;
    }

    @e
    public final List<KeyDescObj> getPost_plan() {
        return this.post_plan;
    }

    public final long getSchedulePostTimeMs() {
        return this.schedulePostTimeMs;
    }

    @e
    public final KeyDescObj getSelectPostPlan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14448, new Class[0], KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        List<KeyDescObj> list = this.post_plan;
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

    public final int getSelectPostPlanIndex() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14449, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<KeyDescObj> list = this.post_plan;
        if (list != null) {
            return CollectionsKt___CollectionsKt.Y2(list, getSelectPostPlan());
        }
        return -1;
    }

    @e
    public final List<KeyDescObj> getSelect_post_plan() {
        return this.select_post_plan;
    }

    @e
    public final String getSource() {
        return this.source;
    }

    @e
    public final LinkImageObj getThumbImageObj() {
        return this.thumbImageObj;
    }

    @e
    public final String getView_limit() {
        return this.view_limit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14453, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.headLine;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i10 = r10 * 31;
        String str = this.view_limit;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        LinkImageObj linkImageObj = this.thumbImageObj;
        int iHashCode2 = (iHashCode + (linkImageObj == null ? 0 : linkImageObj.hashCode())) * 31;
        String str2 = this.articleType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.articleReprintTips;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.articleAuth;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ArrayList<BBSTopicObj> arrayList = this.checkedTopics;
        int iHashCode7 = (iHashCode6 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        List<KeyDescObj> list = this.post_plan;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<KeyDescObj> list2 = this.select_post_plan;
        int iHashCode9 = (iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        boolean z11 = this.is_edit;
        return ((iHashCode9 + (z11 ? 1 : z11)) * 31) + k.a(this.schedulePostTimeMs);
    }

    public final boolean is_edit() {
        return this.is_edit;
    }

    public final void setArticleAuth(@e String str) {
        this.articleAuth = str;
    }

    public final void setArticleReprintTips(@e String str) {
        this.articleReprintTips = str;
    }

    public final void setArticleType(@e String str) {
        this.articleType = str;
    }

    public final void setCheckedTopics(@e ArrayList<BBSTopicObj> arrayList) {
        this.checkedTopics = arrayList;
    }

    public final void setHeadLine(boolean z10) {
        this.headLine = z10;
    }

    public final void setPost_plan(@e List<KeyDescObj> list) {
        this.post_plan = list;
    }

    public final void setSchedulePostTimeMs(long j10) {
        this.schedulePostTimeMs = j10;
    }

    public final void setSelect_post_plan(@e List<KeyDescObj> list) {
        this.select_post_plan = list;
    }

    public final void setSource(@e String str) {
        this.source = str;
    }

    public final void setThumbImageObj(@e LinkImageObj linkImageObj) {
        this.thumbImageObj = linkImageObj;
    }

    public final void setView_limit(@e String str) {
        this.view_limit = str;
    }

    public final void set_edit(boolean z10) {
        this.is_edit = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14452, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostSettingObj(headLine=" + this.headLine + ", view_limit=" + this.view_limit + ", thumbImageObj=" + this.thumbImageObj + ", articleType=" + this.articleType + ", articleReprintTips=" + this.articleReprintTips + ", source=" + this.source + ", articleAuth=" + this.articleAuth + ", checkedTopics=" + this.checkedTopics + ", post_plan=" + this.post_plan + ", select_post_plan=" + this.select_post_plan + ", is_edit=" + this.is_edit + ", schedulePostTimeMs=" + this.schedulePostTimeMs + ')';
    }
}
