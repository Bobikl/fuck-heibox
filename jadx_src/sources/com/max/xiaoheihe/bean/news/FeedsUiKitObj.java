package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsUiKitObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsUiKitObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BBSLinkObj link;

    @e
    private UiKitViewObj ui_kit;

    public FeedsUiKitObj(@e UiKitViewObj uiKitViewObj, @e BBSLinkObj bBSLinkObj) {
        this.ui_kit = uiKitViewObj;
        this.link = bBSLinkObj;
    }

    public static /* synthetic */ FeedsUiKitObj copy$default(FeedsUiKitObj feedsUiKitObj, UiKitViewObj uiKitViewObj, BBSLinkObj bBSLinkObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsUiKitObj, uiKitViewObj, bBSLinkObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15767, new Class[]{FeedsUiKitObj.class, UiKitViewObj.class, BBSLinkObj.class, Integer.TYPE, Object.class}, FeedsUiKitObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsUiKitObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            uiKitViewObj = feedsUiKitObj.ui_kit;
        }
        if ((i10 & 2) != 0) {
            bBSLinkObj = feedsUiKitObj.link;
        }
        return feedsUiKitObj.copy(uiKitViewObj, bBSLinkObj);
    }

    @e
    public final UiKitViewObj component1() {
        return this.ui_kit;
    }

    @e
    public final BBSLinkObj component2() {
        return this.link;
    }

    @d
    public final FeedsUiKitObj copy(@e UiKitViewObj uiKitViewObj, @e BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitViewObj, bBSLinkObj}, this, changeQuickRedirect, false, 15766, new Class[]{UiKitViewObj.class, BBSLinkObj.class}, FeedsUiKitObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsUiKitObj) patchProxyResultProxy.result : new FeedsUiKitObj(uiKitViewObj, bBSLinkObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15765, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(obj instanceof FeedsUiKitObj)) {
            return super.equals(obj);
        }
        UiKitViewObj uiKitViewObj = this.ui_kit;
        String template_id = uiKitViewObj != null ? uiKitViewObj.getTemplate_id() : null;
        FeedsUiKitObj feedsUiKitObj = (FeedsUiKitObj) obj;
        UiKitViewObj uiKitViewObj2 = feedsUiKitObj.ui_kit;
        if (f0.g(template_id, uiKitViewObj2 != null ? uiKitViewObj2.getTemplate_id() : null)) {
            BBSLinkObj bBSLinkObj = this.link;
            String linkid = bBSLinkObj != null ? bBSLinkObj.getLinkid() : null;
            BBSLinkObj bBSLinkObj2 = feedsUiKitObj.link;
            if (f0.g(linkid, bBSLinkObj2 != null ? bBSLinkObj2.getLinkid() : null)) {
                return true;
            }
        }
        return false;
    }

    @e
    public final BBSLinkObj getLink() {
        return this.link;
    }

    @e
    public final UiKitViewObj getUi_kit() {
        return this.ui_kit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15769, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        UiKitViewObj uiKitViewObj = this.ui_kit;
        int iHashCode = (uiKitViewObj == null ? 0 : uiKitViewObj.hashCode()) * 31;
        BBSLinkObj bBSLinkObj = this.link;
        return iHashCode + (bBSLinkObj != null ? bBSLinkObj.hashCode() : 0);
    }

    public final void setLink(@e BBSLinkObj bBSLinkObj) {
        this.link = bBSLinkObj;
    }

    public final void setUi_kit(@e UiKitViewObj uiKitViewObj) {
        this.ui_kit = uiKitViewObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15768, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsUiKitObj(ui_kit=" + this.ui_kit + ", link=" + this.link + ')';
    }
}
