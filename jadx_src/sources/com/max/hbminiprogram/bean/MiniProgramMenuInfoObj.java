package com.max.hbminiprogram.bean;

import bb.c;
import com.max.hbcommon.bean.MiniProgramShortCutObj;
import com.max.hbshare.bean.HBShareProtocolData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramMenuInfoObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MiniProgramMenuInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String app_name;

    @e
    private Boolean can_add_to_my_list;

    @e
    private MiniProgramShortCutObj desktop_info;

    @e
    private Boolean is_my_mini_app;

    @e
    private MenuHeaderInfoObj menu_info;

    @e
    private ScreenShotShareObj screen_shot_share;

    @e
    private HBShareProtocolData share_info;

    @e
    private TopicInfoObj topic_info;

    public MiniProgramMenuInfoObj(@e MenuHeaderInfoObj menuHeaderInfoObj, @e Boolean bool, @e String str, @e Boolean bool2, @e MiniProgramShortCutObj miniProgramShortCutObj, @e HBShareProtocolData hBShareProtocolData, @e TopicInfoObj topicInfoObj, @e ScreenShotShareObj screenShotShareObj) {
        this.menu_info = menuHeaderInfoObj;
        this.is_my_mini_app = bool;
        this.app_name = str;
        this.can_add_to_my_list = bool2;
        this.desktop_info = miniProgramShortCutObj;
        this.share_info = hBShareProtocolData;
        this.topic_info = topicInfoObj;
        this.screen_shot_share = screenShotShareObj;
    }

    public static /* synthetic */ MiniProgramMenuInfoObj copy$default(MiniProgramMenuInfoObj miniProgramMenuInfoObj, MenuHeaderInfoObj menuHeaderInfoObj, Boolean bool, String str, Boolean bool2, MiniProgramShortCutObj miniProgramShortCutObj, HBShareProtocolData hBShareProtocolData, TopicInfoObj topicInfoObj, ScreenShotShareObj screenShotShareObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj, menuHeaderInfoObj, bool, str, bool2, miniProgramShortCutObj, hBShareProtocolData, topicInfoObj, screenShotShareObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.f33280x, new Class[]{MiniProgramMenuInfoObj.class, MenuHeaderInfoObj.class, Boolean.class, String.class, Boolean.class, MiniProgramShortCutObj.class, HBShareProtocolData.class, TopicInfoObj.class, ScreenShotShareObj.class, Integer.TYPE, Object.class}, MiniProgramMenuInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MiniProgramMenuInfoObj) patchProxyResultProxy.result;
        }
        return miniProgramMenuInfoObj.copy((i10 & 1) != 0 ? miniProgramMenuInfoObj.menu_info : menuHeaderInfoObj, (i10 & 2) != 0 ? miniProgramMenuInfoObj.is_my_mini_app : bool, (i10 & 4) != 0 ? miniProgramMenuInfoObj.app_name : str, (i10 & 8) != 0 ? miniProgramMenuInfoObj.can_add_to_my_list : bool2, (i10 & 16) != 0 ? miniProgramMenuInfoObj.desktop_info : miniProgramShortCutObj, (i10 & 32) != 0 ? miniProgramMenuInfoObj.share_info : hBShareProtocolData, (i10 & 64) != 0 ? miniProgramMenuInfoObj.topic_info : topicInfoObj, (i10 & 128) != 0 ? miniProgramMenuInfoObj.screen_shot_share : screenShotShareObj);
    }

    @e
    public final MenuHeaderInfoObj component1() {
        return this.menu_info;
    }

    @e
    public final Boolean component2() {
        return this.is_my_mini_app;
    }

    @e
    public final String component3() {
        return this.app_name;
    }

    @e
    public final Boolean component4() {
        return this.can_add_to_my_list;
    }

    @e
    public final MiniProgramShortCutObj component5() {
        return this.desktop_info;
    }

    @e
    public final HBShareProtocolData component6() {
        return this.share_info;
    }

    @e
    public final TopicInfoObj component7() {
        return this.topic_info;
    }

    @e
    public final ScreenShotShareObj component8() {
        return this.screen_shot_share;
    }

    @d
    public final MiniProgramMenuInfoObj copy(@e MenuHeaderInfoObj menuHeaderInfoObj, @e Boolean bool, @e String str, @e Boolean bool2, @e MiniProgramShortCutObj miniProgramShortCutObj, @e HBShareProtocolData hBShareProtocolData, @e TopicInfoObj topicInfoObj, @e ScreenShotShareObj screenShotShareObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menuHeaderInfoObj, bool, str, bool2, miniProgramShortCutObj, hBShareProtocolData, topicInfoObj, screenShotShareObj}, this, changeQuickRedirect, false, c.h.f33279w, new Class[]{MenuHeaderInfoObj.class, Boolean.class, String.class, Boolean.class, MiniProgramShortCutObj.class, HBShareProtocolData.class, TopicInfoObj.class, ScreenShotShareObj.class}, MiniProgramMenuInfoObj.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramMenuInfoObj) patchProxyResultProxy.result : new MiniProgramMenuInfoObj(menuHeaderInfoObj, bool, str, bool2, miniProgramShortCutObj, hBShareProtocolData, topicInfoObj, screenShotShareObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.A, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniProgramMenuInfoObj)) {
            return false;
        }
        MiniProgramMenuInfoObj miniProgramMenuInfoObj = (MiniProgramMenuInfoObj) obj;
        return f0.g(this.menu_info, miniProgramMenuInfoObj.menu_info) && f0.g(this.is_my_mini_app, miniProgramMenuInfoObj.is_my_mini_app) && f0.g(this.app_name, miniProgramMenuInfoObj.app_name) && f0.g(this.can_add_to_my_list, miniProgramMenuInfoObj.can_add_to_my_list) && f0.g(this.desktop_info, miniProgramMenuInfoObj.desktop_info) && f0.g(this.share_info, miniProgramMenuInfoObj.share_info) && f0.g(this.topic_info, miniProgramMenuInfoObj.topic_info) && f0.g(this.screen_shot_share, miniProgramMenuInfoObj.screen_shot_share);
    }

    @e
    public final String getApp_name() {
        return this.app_name;
    }

    @e
    public final Boolean getCan_add_to_my_list() {
        return this.can_add_to_my_list;
    }

    @e
    public final MiniProgramShortCutObj getDesktop_info() {
        return this.desktop_info;
    }

    @e
    public final MenuHeaderInfoObj getMenu_info() {
        return this.menu_info;
    }

    @e
    public final ScreenShotShareObj getScreen_shot_share() {
        return this.screen_shot_share;
    }

    @e
    public final HBShareProtocolData getShare_info() {
        return this.share_info;
    }

    @e
    public final TopicInfoObj getTopic_info() {
        return this.topic_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33282z, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        MenuHeaderInfoObj menuHeaderInfoObj = this.menu_info;
        int iHashCode = (menuHeaderInfoObj == null ? 0 : menuHeaderInfoObj.hashCode()) * 31;
        Boolean bool = this.is_my_mini_app;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.app_name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.can_add_to_my_list;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MiniProgramShortCutObj miniProgramShortCutObj = this.desktop_info;
        int iHashCode5 = (iHashCode4 + (miniProgramShortCutObj == null ? 0 : miniProgramShortCutObj.hashCode())) * 31;
        HBShareProtocolData hBShareProtocolData = this.share_info;
        int iHashCode6 = (iHashCode5 + (hBShareProtocolData == null ? 0 : hBShareProtocolData.hashCode())) * 31;
        TopicInfoObj topicInfoObj = this.topic_info;
        int iHashCode7 = (iHashCode6 + (topicInfoObj == null ? 0 : topicInfoObj.hashCode())) * 31;
        ScreenShotShareObj screenShotShareObj = this.screen_shot_share;
        return iHashCode7 + (screenShotShareObj != null ? screenShotShareObj.hashCode() : 0);
    }

    @e
    public final Boolean is_my_mini_app() {
        return this.is_my_mini_app;
    }

    public final void setApp_name(@e String str) {
        this.app_name = str;
    }

    public final void setCan_add_to_my_list(@e Boolean bool) {
        this.can_add_to_my_list = bool;
    }

    public final void setDesktop_info(@e MiniProgramShortCutObj miniProgramShortCutObj) {
        this.desktop_info = miniProgramShortCutObj;
    }

    public final void setMenu_info(@e MenuHeaderInfoObj menuHeaderInfoObj) {
        this.menu_info = menuHeaderInfoObj;
    }

    public final void setScreen_shot_share(@e ScreenShotShareObj screenShotShareObj) {
        this.screen_shot_share = screenShotShareObj;
    }

    public final void setShare_info(@e HBShareProtocolData hBShareProtocolData) {
        this.share_info = hBShareProtocolData;
    }

    public final void setTopic_info(@e TopicInfoObj topicInfoObj) {
        this.topic_info = topicInfoObj;
    }

    public final void set_my_mini_app(@e Boolean bool) {
        this.is_my_mini_app = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.f33281y, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MiniProgramMenuInfoObj(menu_info=" + this.menu_info + ", is_my_mini_app=" + this.is_my_mini_app + ", app_name=" + this.app_name + ", can_add_to_my_list=" + this.can_add_to_my_list + ", desktop_info=" + this.desktop_info + ", share_info=" + this.share_info + ", topic_info=" + this.topic_info + ", screen_shot_share=" + this.screen_shot_share + ')';
    }
}
