package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.BBSLinkViewShowsObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendBoardMultiObj;
import com.max.xiaoheihe.bean.recommend.GeneralGameObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: RecommendBoardItem.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecommendBoardItem implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private GeneralGameObj game;

    @e
    private LinkInfoObj game_comment;

    @e
    private String index;
    private boolean isExposureReport;
    private boolean isHideReport;

    @e
    private List<String> rec_labels;

    @e
    private List<RichAttributeModelObj> rich_text_labels;

    public RecommendBoardItem(@e GeneralGameObj generalGameObj, @e LinkInfoObj linkInfoObj, @e List<String> list, @e List<RichAttributeModelObj> list2, @e String str, boolean z10, boolean z11) {
        this.game = generalGameObj;
        this.game_comment = linkInfoObj;
        this.rec_labels = list;
        this.rich_text_labels = list2;
        this.index = str;
        this.isExposureReport = z10;
        this.isHideReport = z11;
    }

    public /* synthetic */ RecommendBoardItem(GeneralGameObj generalGameObj, LinkInfoObj linkInfoObj, List list, List list2, String str, boolean z10, boolean z11, int i10, u uVar) {
        this(generalGameObj, linkInfoObj, list, list2, str, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11);
    }

    public static /* synthetic */ RecommendBoardItem copy$default(RecommendBoardItem recommendBoardItem, GeneralGameObj generalGameObj, LinkInfoObj linkInfoObj, List list, List list2, String str, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12 = z11;
        Object[] objArr = {recommendBoardItem, generalGameObj, linkInfoObj, list, list2, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15556, new Class[]{RecommendBoardItem.class, GeneralGameObj.class, LinkInfoObj.class, List.class, List.class, String.class, cls, cls, Integer.TYPE, Object.class}, RecommendBoardItem.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendBoardItem) patchProxyResultProxy.result;
        }
        GeneralGameObj generalGameObj2 = (i10 & 1) != 0 ? recommendBoardItem.game : generalGameObj;
        LinkInfoObj linkInfoObj2 = (i10 & 2) != 0 ? recommendBoardItem.game_comment : linkInfoObj;
        List list3 = (i10 & 4) != 0 ? recommendBoardItem.rec_labels : list;
        List list4 = (i10 & 8) != 0 ? recommendBoardItem.rich_text_labels : list2;
        String str2 = (i10 & 16) != 0 ? recommendBoardItem.index : str;
        boolean z13 = (i10 & 32) != 0 ? recommendBoardItem.isExposureReport : z10 ? 1 : 0;
        if ((i10 & 64) != 0) {
            z12 = recommendBoardItem.isHideReport;
        }
        return recommendBoardItem.copy(generalGameObj2, linkInfoObj2, list3, list4, str2, z13, z12);
    }

    @e
    public final GeneralGameObj component1() {
        return this.game;
    }

    @e
    public final LinkInfoObj component2() {
        return this.game_comment;
    }

    @e
    public final List<String> component3() {
        return this.rec_labels;
    }

    @e
    public final List<RichAttributeModelObj> component4() {
        return this.rich_text_labels;
    }

    @e
    public final String component5() {
        return this.index;
    }

    public final boolean component6() {
        return this.isExposureReport;
    }

    public final boolean component7() {
        return this.isHideReport;
    }

    @d
    public final RecommendBoardItem copy(@e GeneralGameObj generalGameObj, @e LinkInfoObj linkInfoObj, @e List<String> list, @e List<RichAttributeModelObj> list2, @e String str, boolean z10, boolean z11) {
        Object[] objArr = {generalGameObj, linkInfoObj, list, list2, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15555, new Class[]{GeneralGameObj.class, LinkInfoObj.class, List.class, List.class, String.class, cls, cls}, RecommendBoardItem.class);
        return patchProxyResultProxy.isSupported ? (RecommendBoardItem) patchProxyResultProxy.result : new RecommendBoardItem(generalGameObj, linkInfoObj, list, list2, str, z10, z11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15553, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(RecommendBoardItem.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.mall.RecommendBoardItem");
        return f0.g(this.game_comment, ((RecommendBoardItem) obj).game_comment);
    }

    @d
    public final BBSLinkViewShowsObj generateShowInfo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15551, new Class[0], BBSLinkViewShowsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkViewShowsObj) patchProxyResultProxy.result;
        }
        BBSLinkViewShowsObj bBSLinkViewShowsObj = new BBSLinkViewShowsObj();
        LinkInfoObj linkInfoObj = this.game_comment;
        bBSLinkViewShowsObj.setId(n.q(linkInfoObj != null ? linkInfoObj.getLinkid() : null));
        bBSLinkViewShowsObj.setPos(this.index);
        bBSLinkViewShowsObj.setTime(n.r(String.valueOf(w.C())));
        GeneralGameObj generalGameObj = this.game;
        bBSLinkViewShowsObj.setH_src(generalGameObj != null ? generalGameObj.getH_src() : null);
        return bBSLinkViewShowsObj;
    }

    @e
    public final GeneralGameObj getGame() {
        return this.game;
    }

    @d
    public final PathSrcNode getGameLibraryShowInfo(@d RecommendBoardMultiObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 15552, new Class[]{RecommendBoardMultiObj.class}, PathSrcNode.class);
        if (patchProxyResultProxy.isSupported) {
            return (PathSrcNode) patchProxyResultProxy.result;
        }
        f0.p(data, "data");
        PathSrcNode pathSrcNodeCopyToPathNode = data.copyToPathNode();
        f0.o(pathSrcNodeCopyToPathNode, "data.copyToPathNode()");
        JsonObject addition = pathSrcNodeCopyToPathNode.getAddition();
        GeneralGameObj generalGameObj = this.game;
        addition.addProperty("app_id", generalGameObj != null ? generalGameObj.getAppid() : null);
        JsonObject addition2 = pathSrcNodeCopyToPathNode.getAddition();
        GeneralGameObj generalGameObj2 = this.game;
        addition2.addProperty("h_src", generalGameObj2 != null ? generalGameObj2.getH_src() : null);
        pathSrcNodeCopyToPathNode.getAddition().addProperty("idx", this.index);
        return pathSrcNodeCopyToPathNode;
    }

    @e
    public final LinkInfoObj getGame_comment() {
        return this.game_comment;
    }

    @e
    public final String getIndex() {
        return this.index;
    }

    @e
    public final List<String> getRec_labels() {
        return this.rec_labels;
    }

    @e
    public final List<RichAttributeModelObj> getRich_text_labels() {
        return this.rich_text_labels;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15554, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        LinkInfoObj linkInfoObj = this.game_comment;
        if (linkInfoObj != null) {
            return linkInfoObj.hashCode();
        }
        return 0;
    }

    public final boolean isExposureReport() {
        return this.isExposureReport;
    }

    public final boolean isHideReport() {
        return this.isHideReport;
    }

    public final void setExposureReport(boolean z10) {
        this.isExposureReport = z10;
    }

    public final void setGame(@e GeneralGameObj generalGameObj) {
        this.game = generalGameObj;
    }

    public final void setGame_comment(@e LinkInfoObj linkInfoObj) {
        this.game_comment = linkInfoObj;
    }

    public final void setHideReport(boolean z10) {
        this.isHideReport = z10;
    }

    public final void setIndex(@e String str) {
        this.index = str;
    }

    public final void setRec_labels(@e List<String> list) {
        this.rec_labels = list;
    }

    public final void setRich_text_labels(@e List<RichAttributeModelObj> list) {
        this.rich_text_labels = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15557, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RecommendBoardItem(game=" + this.game + ", game_comment=" + this.game_comment + ", rec_labels=" + this.rec_labels + ", rich_text_labels=" + this.rich_text_labels + ", index=" + this.index + ", isExposureReport=" + this.isExposureReport + ", isHideReport=" + this.isHideReport + ')';
    }
}
