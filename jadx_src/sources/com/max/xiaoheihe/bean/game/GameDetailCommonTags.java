package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameDetailCommonTags.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameDetailCommonTags implements Serializable {

    @d
    public static final String ADD_TAG = "add_tag";

    @d
    public static final String HEYBOX_TAG = "heybox_tag";

    @d
    public static final String PLATFORM_TAG = "platform";

    @d
    public static final String RICH_TAG = "rich_tag";

    @d
    public static final String SIMPLE_TAG = "simple_tag";

    @d
    public static final String STEAM_TAG = "steam_aggre";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background_color;

    @e
    private String desc;

    @e
    private List<String> desc_list;

    @e
    private List<TagDetailObj> detail_list;

    @e
    private String percent;

    @e
    private List<GamePlatformInfoObj> platform_list;

    @e
    private String prot;

    @e
    private RichStackModelObj rich_text;

    @e
    private String text_color;

    @e
    private String type;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: GameDetailCommonTags.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public GameDetailCommonTags(@e String str, @e String str2) {
        this(str, str2, null, null, null, null, null, null, null, null);
    }

    public GameDetailCommonTags(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e List<String> list, @e List<TagDetailObj> list2, @e List<GamePlatformInfoObj> list3, @e RichStackModelObj richStackModelObj) {
        this.type = str;
        this.desc = str2;
        this.text_color = str3;
        this.background_color = str4;
        this.prot = str5;
        this.percent = str6;
        this.desc_list = list;
        this.detail_list = list2;
        this.platform_list = list3;
        this.rich_text = richStackModelObj;
    }

    public GameDetailCommonTags(@e String str, @e List<GamePlatformInfoObj> list) {
        this(str, null, null, null, null, null, null, null, list, null);
    }

    public static /* synthetic */ GameDetailCommonTags copy$default(GameDetailCommonTags gameDetailCommonTags, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, RichStackModelObj richStackModelObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameDetailCommonTags, str, str2, str3, str4, str5, str6, list, list2, list3, richStackModelObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14707, new Class[]{GameDetailCommonTags.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, List.class, RichStackModelObj.class, Integer.TYPE, Object.class}, GameDetailCommonTags.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDetailCommonTags) patchProxyResultProxy.result;
        }
        return gameDetailCommonTags.copy((i10 & 1) != 0 ? gameDetailCommonTags.type : str, (i10 & 2) != 0 ? gameDetailCommonTags.desc : str2, (i10 & 4) != 0 ? gameDetailCommonTags.text_color : str3, (i10 & 8) != 0 ? gameDetailCommonTags.background_color : str4, (i10 & 16) != 0 ? gameDetailCommonTags.prot : str5, (i10 & 32) != 0 ? gameDetailCommonTags.percent : str6, (i10 & 64) != 0 ? gameDetailCommonTags.desc_list : list, (i10 & 128) != 0 ? gameDetailCommonTags.detail_list : list2, (i10 & 256) != 0 ? gameDetailCommonTags.platform_list : list3, (i10 & 512) != 0 ? gameDetailCommonTags.rich_text : richStackModelObj);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final RichStackModelObj component10() {
        return this.rich_text;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.text_color;
    }

    @e
    public final String component4() {
        return this.background_color;
    }

    @e
    public final String component5() {
        return this.prot;
    }

    @e
    public final String component6() {
        return this.percent;
    }

    @e
    public final List<String> component7() {
        return this.desc_list;
    }

    @e
    public final List<TagDetailObj> component8() {
        return this.detail_list;
    }

    @e
    public final List<GamePlatformInfoObj> component9() {
        return this.platform_list;
    }

    @d
    public final GameDetailCommonTags copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e List<String> list, @e List<TagDetailObj> list2, @e List<GamePlatformInfoObj> list3, @e RichStackModelObj richStackModelObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, list, list2, list3, richStackModelObj}, this, changeQuickRedirect, false, 14706, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, List.class, List.class, List.class, RichStackModelObj.class}, GameDetailCommonTags.class);
        return patchProxyResultProxy.isSupported ? (GameDetailCommonTags) patchProxyResultProxy.result : new GameDetailCommonTags(str, str2, str3, str4, str5, str6, list, list2, list3, richStackModelObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14710, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDetailCommonTags)) {
            return false;
        }
        GameDetailCommonTags gameDetailCommonTags = (GameDetailCommonTags) obj;
        return f0.g(this.type, gameDetailCommonTags.type) && f0.g(this.desc, gameDetailCommonTags.desc) && f0.g(this.text_color, gameDetailCommonTags.text_color) && f0.g(this.background_color, gameDetailCommonTags.background_color) && f0.g(this.prot, gameDetailCommonTags.prot) && f0.g(this.percent, gameDetailCommonTags.percent) && f0.g(this.desc_list, gameDetailCommonTags.desc_list) && f0.g(this.detail_list, gameDetailCommonTags.detail_list) && f0.g(this.platform_list, gameDetailCommonTags.platform_list) && f0.g(this.rich_text, gameDetailCommonTags.rich_text);
    }

    @e
    public final String getBackground_color() {
        return this.background_color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final List<String> getDesc_list() {
        return this.desc_list;
    }

    @e
    public final List<TagDetailObj> getDetail_list() {
        return this.detail_list;
    }

    @e
    public final String getPercent() {
        return this.percent;
    }

    @e
    public final List<GamePlatformInfoObj> getPlatform_list() {
        return this.platform_list;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    @e
    public final RichStackModelObj getRich_text() {
        return this.rich_text;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14709, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.background_color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.prot;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.percent;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.desc_list;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<TagDetailObj> list2 = this.detail_list;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GamePlatformInfoObj> list3 = this.platform_list;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        RichStackModelObj richStackModelObj = this.rich_text;
        return iHashCode9 + (richStackModelObj != null ? richStackModelObj.hashCode() : 0);
    }

    public final void setBackground_color(@e String str) {
        this.background_color = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setDesc_list(@e List<String> list) {
        this.desc_list = list;
    }

    public final void setDetail_list(@e List<TagDetailObj> list) {
        this.detail_list = list;
    }

    public final void setPercent(@e String str) {
        this.percent = str;
    }

    public final void setPlatform_list(@e List<GamePlatformInfoObj> list) {
        this.platform_list = list;
    }

    public final void setProt(@e String str) {
        this.prot = str;
    }

    public final void setRich_text(@e RichStackModelObj richStackModelObj) {
        this.rich_text = richStackModelObj;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14708, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameDetailCommonTags(type=" + this.type + ", desc=" + this.desc + ", text_color=" + this.text_color + ", background_color=" + this.background_color + ", prot=" + this.prot + ", percent=" + this.percent + ", desc_list=" + this.desc_list + ", detail_list=" + this.detail_list + ", platform_list=" + this.platform_list + ", rich_text=" + this.rich_text + ')';
    }
}
