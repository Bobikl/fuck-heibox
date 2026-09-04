package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.bean.ButtonObj;
import com.max.xiaoheihe.bean.TypedButtonObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.LastEventObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameDetailsWrapperObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -453353627123325976L;
    private GameDetailsObj gameDetailsObj;
    private String gameType;
    private boolean mobile;
    private MobileGameDetailsObj mobileGameDetailsObj;

    public enum BottomButtonStyle {
        Purchase(1),
        GroupPurchase(2),
        CountDown(3),
        AddFreeLicence(4),
        NotFinishOrder(5),
        CustomButton(6),
        Follow(7);

        public static ChangeQuickRedirect changeQuickRedirect;
        private final int value;

        BottomButtonStyle(int i10) {
            this.value = i10;
        }

        public static BottomButtonStyle valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 14807, new Class[]{String.class}, BottomButtonStyle.class);
            return patchProxyResultProxy.isSupported ? (BottomButtonStyle) patchProxyResultProxy.result : (BottomButtonStyle) Enum.valueOf(BottomButtonStyle.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static BottomButtonStyle[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 14806, new Class[0], BottomButtonStyle[].class);
            return patchProxyResultProxy.isSupported ? (BottomButtonStyle[]) patchProxyResultProxy.result : (BottomButtonStyle[]) values().clone();
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum BottomIconStyle {
        ICON_STYLE_FOLLOW_STATUE("0"),
        ICON_STYLE_OWNED("1"),
        ICON_STYLE_CUSTOM("2");

        public static ChangeQuickRedirect changeQuickRedirect;
        private final String type;

        BottomIconStyle(String str) {
            this.type = str;
        }

        public static BottomIconStyle valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 14809, new Class[]{String.class}, BottomIconStyle.class);
            return patchProxyResultProxy.isSupported ? (BottomIconStyle) patchProxyResultProxy.result : (BottomIconStyle) Enum.valueOf(BottomIconStyle.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static BottomIconStyle[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 14808, new Class[0], BottomIconStyle[].class);
            return patchProxyResultProxy.isSupported ? (BottomIconStyle[]) patchProxyResultProxy.result : (BottomIconStyle[]) values().clone();
        }

        public String getType() {
            return this.type;
        }
    }

    public GameDetailsWrapperObj(String str, MobileGameDetailsObj mobileGameDetailsObj, GameDetailsObj gameDetailsObj) {
        this.gameType = str;
        this.mobileGameDetailsObj = mobileGameDetailsObj;
        this.gameDetailsObj = gameDetailsObj;
        this.mobile = mobileGameDetailsObj != null;
    }

    public String getAbout_the_game() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14744, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getAbout_the_game() : this.gameDetailsObj.getAbout_the_game();
    }

    public String getAppId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14787, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getAppid() : this.gameDetailsObj.getAppid();
    }

    public String getAppicon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14745, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getAppicon() : this.gameDetailsObj.getAppicon();
    }

    public ButtonObj getBottom_btn() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14764, new Class[0], ButtonObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ButtonObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getBottom_btn() : this.gameDetailsObj.getBottom_btn();
    }

    public List<String> getButton_style_list() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14798, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getButton_style_list() : this.gameDetailsObj.getButton_style_list();
    }

    public List<TypedButtonObj> getButton_style_list_v2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14799, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getButton_style_list_v2() : this.gameDetailsObj.getButton_style_list_v2();
    }

    public String getCarts_count() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14755, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getCarts_count() : this.gameDetailsObj.getCarts_count();
    }

    public String getComment_change() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14747, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getComment_change() : this.gameDetailsObj.getComment_change();
    }

    public String getComment_state() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14746, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getComment_state() : this.gameDetailsObj.getComment_state();
    }

    public GameCommentStatsObj getComment_stats() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14752, new Class[0], GameCommentStatsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentStatsObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getComment_stats() : this.gameDetailsObj.getComment_stats();
    }

    public List<GameDetailCommonTags> getCommon_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14777, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return isMobile() ? this.mobileGameDetailsObj.getCommon_tags() : this.gameDetailsObj.getCommon_tags();
    }

    public String getDeadline_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14775, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return isMobile() ? this.mobileGameDetailsObj.getDeadline_desc() : this.gameDetailsObj.getDeadline_desc();
    }

    public String getDeadline_timestamp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14774, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return isMobile() ? this.mobileGameDetailsObj.getDeadline_timestamp() : this.gameDetailsObj.getDeadline_timestamp();
    }

    public GameObj getDemo_concat_game() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14802, new Class[0], GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getDemo_concat_game() : this.gameDetailsObj.getDemo_concat_game();
    }

    public String getDemo_concat_game_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14803, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getDemo_concat_game_title() : this.gameDetailsObj.getDemo_concat_game_title();
    }

    public String getDesc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14736, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getDesc() : this.gameDetailsObj.getDesc();
    }

    public String getDeveloper_test_state() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14760, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getDeveloper_test_state() : this.gameDetailsObj.getDeveloper_test_state();
    }

    public GamePeakValueObj getDeveloper_words() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14758, new Class[0], GamePeakValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePeakValueObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getDeveloper_words() : this.gameDetailsObj.getDeveloper_words();
    }

    public List<GameBundleObj> getDlcs() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14759, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getDlcs() : this.gameDetailsObj.getDlcs();
    }

    public String getFollow_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14784, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getFollow_num() : this.gameDetailsObj.getFollow_num();
    }

    public String getFollow_state() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14750, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getFollow_state() : this.gameDetailsObj.getFollow_state();
    }

    public String getFollow_state_v2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14805, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String follow_state_v2 = this.mobile ? this.mobileGameDetailsObj.getFollow_state_v2() : this.gameDetailsObj.getFollow_state_v2();
        return !c.u(follow_state_v2) ? follow_state_v2 : getFollow_state();
    }

    public FreeLicenseObj getFreeLicenseObj() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14765, new Class[0], FreeLicenseObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FreeLicenseObj) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getFreelicense();
    }

    public List<GameAwardObj> getGameAward() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14766, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getGame_award() : this.gameDetailsObj.getGame_award();
    }

    public GameDetailsObj getGameDetailsObj() {
        return this.gameDetailsObj;
    }

    public String getGame_data_url() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14723, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getGame_data_url();
    }

    public GameImpressTagListObj getGame_impressions() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14792, new Class[0], GameImpressTagListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameImpressTagListObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getGame_impressions() : this.gameDetailsObj.getGame_impressions();
    }

    public String getGame_review_summary() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14753, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getGame_review_summary() : this.gameDetailsObj.getGame_review_summary();
    }

    public String getGame_type() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14773, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? "mobile" : this.gameDetailsObj.getGame_type();
    }

    public GroupingPriceObj getGrouping_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14797, new Class[0], GroupingPriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GroupingPriceObj) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getGrouping_price();
    }

    public HardwarePerformance getHardware_performance() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14778, new Class[0], HardwarePerformance.class);
        if (patchProxyResultProxy.isSupported) {
            return (HardwarePerformance) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getHardware_performance();
    }

    public String getHas_game_data() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14718, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getHas_game_data();
    }

    public String getHas_game_detail() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14722, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getHas_game_detail();
    }

    public String getHas_wiki() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14719, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getHas_wiki();
    }

    public GamePriceObj getHeybox_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14768, new Class[0], GamePriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePriceObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getHeybox_price() : this.gameDetailsObj.getHeybox_price();
    }

    public List<KeyDescObj> getHot_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14761, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getHot_tags() : this.gameDetailsObj.getHot_tags();
    }

    public List<KeyDescObj> getIcon_style_list() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14800, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getIcon_style_list() : this.gameDetailsObj.getIcon_style_list();
    }

    public String getImage() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14748, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getImage() : this.gameDetailsObj.getImage();
    }

    public String getImpression_score() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14793, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getImpression_score() : this.gameDetailsObj.getImpression_score();
    }

    public String getIs_official() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14756, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getIs_official() : this.gameDetailsObj.getIs_official();
    }

    public String getIs_show_all_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14783, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getIs_show_all_price() : this.gameDetailsObj.getIs_show_all_price();
    }

    public LastEventObj getLatest_event() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14790, new Class[0], LastEventObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LastEventObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getLatest_event() : this.gameDetailsObj.getLatest_event();
    }

    public String getLike_lottie_key() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14801, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getLike_lottie_key() : this.gameDetailsObj.getLike_lottie_key();
    }

    public String getLive_url() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14724, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getLive_url();
    }

    public String getMainColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14788, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getMain_color() : this.gameDetailsObj.getMain_color();
    }

    public List<KeyDescObj> getMenu_v2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14757, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getMenu_v2() : this.gameDetailsObj.getMenu_v2();
    }

    public GamePriceObj getMinimum_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14740, new Class[0], GamePriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePriceObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getMinimum_price() : this.gameDetailsObj.getMinimum_price();
    }

    public MobileGameDetailsObj getMobileGameDetailsObj() {
        return this.mobileGameDetailsObj;
    }

    public List<GameObj> getMorelike() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14786, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getMorelike();
    }

    public MultiDimensionRadarObj getMultidimensional_score_radar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14791, new Class[0], MultiDimensionRadarObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MultiDimensionRadarObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getMultidimensional_score_radar() : this.gameDetailsObj.getMultidimensional_score_radar();
    }

    public String getName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14726, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getName() : this.gameDetailsObj.getName();
    }

    public String getName_en() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14727, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getName_en() : this.gameDetailsObj.getName_en();
    }

    public List<GameNavMenuObj> getNav_menu() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14725, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getNav_menu() : this.gameDetailsObj.getNav_menu();
    }

    public GameObj getOriginGame() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14794, new Class[0], GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getOrigin_game();
    }

    public String getOwn_State() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14804, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getOwn_state() : this.gameDetailsObj.getOwn_state();
    }

    public String getPlatf() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14770, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getPlatf();
    }

    public GamePlatformPriceObj getPlatform_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14734, new Class[0], GamePlatformPriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePlatformPriceObj) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getPlatform_price();
    }

    public List<GamePlatformTagObj> getPlatform_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14735, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getPlatform_tags();
    }

    public List<String> getPlatforms() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14772, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getPlatforms();
    }

    public List<GamePlatformInfoObj> getPlatforms_list() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14771, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getPlatforms_list();
    }

    public List<String> getPlatforms_url() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14733, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return this.mobileGameDetailsObj.getPlatforms_url();
        }
        if (!GameObj.GAME_TYPE_CONSOLE.equals(this.gameType)) {
            return this.gameDetailsObj.getPlatforms_url();
        }
        ArrayList arrayList = null;
        if (this.gameDetailsObj.getPlatform_infos() != null) {
            arrayList = new ArrayList();
            Iterator<GamePlatformInfoObj> it = this.gameDetailsObj.getPlatform_infos().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getImg_url());
            }
        }
        return arrayList;
    }

    public String getPositive_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14754, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getPositive_desc() : this.gameDetailsObj.getPositive_desc();
    }

    public GamePreviewInfoObj getPreview_info() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14762, new Class[0], GamePreviewInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePreviewInfoObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getPreview_info() : this.gameDetailsObj.getPreview_info();
    }

    public GamePriceObj getPrice() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14739, new Class[0], GamePriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePriceObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getPrice() : this.gameDetailsObj.getPrice();
    }

    public CommentSpecialTagObj getPrice_bg_color() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14782, new Class[0], CommentSpecialTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommentSpecialTagObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getPrice_bg_color() : this.gameDetailsObj.getPrice_bg_color();
    }

    public String getPrice_placeholder() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14779, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getPrice_placeholder() : this.gameDetailsObj.getPrice_placeholder();
    }

    public RichStackModelObj getPrice_rich_text() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14780, new Class[0], RichStackModelObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RichStackModelObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getPrice_rich_text() : this.gameDetailsObj.getPrice_rich_text();
    }

    public String getPurchase_url() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14767, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getPurchase_url() : this.gameDetailsObj.getPurchase_url();
    }

    public List<GlobalRegionPriceObj> getRegion_prices() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14769, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getRegion_prices();
    }

    public String getScore() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14742, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getScore() : this.gameDetailsObj.getScore();
    }

    public String getScore_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14741, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getScore_desc() : this.gameDetailsObj.getScore_desc();
    }

    public CommentSpecialTagObj getScreen_shot_bg_color() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14781, new Class[0], CommentSpecialTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommentSpecialTagObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getScreen_shot_bg_color() : this.gameDetailsObj.getScreen_shot_bg_color();
    }

    public List<GameScreenshotObj> getScreenshots() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14737, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getScreenshots() : this.gameDetailsObj.getScreenshots();
    }

    public String getShare_bg_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14749, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getShare_bg_img() : this.gameDetailsObj.getShare_bg_img();
    }

    public String getShare_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14730, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getShare_desc() : this.gameDetailsObj.getShare_desc();
    }

    public String getShare_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14731, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getShare_img() : this.gameDetailsObj.getShare_img();
    }

    public String getShare_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14729, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getShare_title() : this.gameDetailsObj.getShare_title();
    }

    public String getShare_url() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14728, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getShare_url() : this.gameDetailsObj.getShare_url();
    }

    public String getShow_authentic_guarantee() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14789, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getShow_authentic_guarantee();
    }

    public String getShow_luck_coupon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14795, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getShow_luck_coupon();
    }

    public List<KeyDescObj> getSpecial_tags_v2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14776, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (isMobile()) {
            return null;
        }
        return this.gameDetailsObj.getSpecial_tags_v2();
    }

    public GameSubscribeInfoObj getSubscribe_info() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14763, new Class[0], GameSubscribeInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameSubscribeInfoObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getSubscribe_info() : this.gameDetailsObj.getSubscribe_info();
    }

    public String getSubscribe_state() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14751, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getSubscribe_state() : this.gameDetailsObj.getSubscribe_state();
    }

    public BBSTopicObj getTopic_detail() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14716, new Class[0], BBSTopicObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTopicObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getTopic_detail() : this.gameDetailsObj.getTopic_detail();
    }

    public String getTopic_vote_url() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14717, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getTopic_vote_url() : this.gameDetailsObj.getTopic_vote_url();
    }

    public String getType() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14732, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getType() : this.gameDetailsObj.getType();
    }

    public LinkInfoObj getUser_comment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14720, new Class[0], LinkInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkInfoObj) patchProxyResultProxy.result;
        }
        return this.mobile ? this.mobileGameDetailsObj.getUser_comment() : this.gameDetailsObj.getUser_comment();
    }

    public GameUserNumObj getUser_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14743, new Class[0], GameUserNumObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameUserNumObj) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getUser_num();
    }

    public String getWish_rank() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14796, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.mobile) {
            return null;
        }
        return this.gameDetailsObj.getWish_rank();
    }

    public boolean isEmpty() {
        return this.mobileGameDetailsObj == null && this.gameDetailsObj == null;
    }

    public boolean isIs_free() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14738, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.mobile ? this.mobileGameDetailsObj.isIs_free() : this.gameDetailsObj.isIs_free();
    }

    public boolean isMobile() {
        return this.mobile;
    }

    public void setFollow_num(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14785, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.mobile) {
            this.mobileGameDetailsObj.setFollow_num(str);
        } else {
            this.gameDetailsObj.setFollow_num(str);
        }
    }

    public void setGameDetailsObj(GameDetailsObj gameDetailsObj) {
        this.gameDetailsObj = gameDetailsObj;
    }

    public void setMobile(boolean z10) {
        this.mobile = z10;
    }

    public void setMobileGameDetailsObj(MobileGameDetailsObj mobileGameDetailsObj) {
        this.mobileGameDetailsObj = mobileGameDetailsObj;
    }

    public void setUser_comment(LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 14721, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported || this.mobile) {
            return;
        }
        this.gameDetailsObj.setUser_comment(linkInfoObj);
    }
}
