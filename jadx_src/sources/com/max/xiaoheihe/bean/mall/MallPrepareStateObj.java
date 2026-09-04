package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamGameAccount;
import com.max.xiaoheihe.bean.game.GamePayCardObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallPrepareStateObj implements Serializable {
    public static final String PREPARE_STATE_AREA_CHANGE = "6";
    public static final String PREPARE_STATE_INVALID_PURCHASE = "5";
    public static final String PREPARE_STATE_NO_BIND = "2";
    public static final String PREPARE_STATE_NO_COOKIE = "3";
    public static final String PREPARE_STATE_SUCCESS = "1";
    public static final String PREPARE_STATE_WAIT = "4";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1247986638240443591L;
    private String balance_available;
    private String bind_steam_id;
    private String desc_desc;
    private String desc_title;
    private KeyDescObj extra;
    private String faq;
    private GamePayCardObj game_info;
    private List<KeyDescObj> infos;
    private String msg;
    private String prepare_state;
    private String recheck;
    private RichStackModelObj region_confirm_rich_text;
    private String region_desc;
    private String region_notice;
    private RichStackModelObj region_rich_text;
    private SteamGameAccount steam_id_info;
    private String title;
    private String user_balance;

    public String getBalance_available() {
        return this.balance_available;
    }

    public String getBind_steam_id() {
        return this.bind_steam_id;
    }

    public String getDesc_desc() {
        return this.desc_desc;
    }

    public String getDesc_title() {
        return this.desc_title;
    }

    public KeyDescObj getExtra() {
        return this.extra;
    }

    public String getFaq() {
        return this.faq;
    }

    public GamePayCardObj getGame_info() {
        return this.game_info;
    }

    public List<KeyDescObj> getInfos() {
        return this.infos;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getPrepare_state() {
        return this.prepare_state;
    }

    public String getRecheck() {
        return this.recheck;
    }

    public RichStackModelObj getRegion_confirm_rich_text() {
        return this.region_confirm_rich_text;
    }

    public String getRegion_desc() {
        return this.region_desc;
    }

    public String getRegion_notice() {
        return this.region_notice;
    }

    public RichStackModelObj getRegion_rich_text() {
        return this.region_rich_text;
    }

    public SteamGameAccount getSteam_id_info() {
        return this.steam_id_info;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser_balance() {
        return this.user_balance;
    }

    public void setBalance_available(String str) {
        this.balance_available = str;
    }

    public void setBind_steam_id(String str) {
        this.bind_steam_id = str;
    }

    public void setDesc_desc(String str) {
        this.desc_desc = str;
    }

    public void setDesc_title(String str) {
        this.desc_title = str;
    }

    public void setExtra(KeyDescObj keyDescObj) {
        this.extra = keyDescObj;
    }

    public void setFaq(String str) {
        this.faq = str;
    }

    public void setGame_info(GamePayCardObj gamePayCardObj) {
        this.game_info = gamePayCardObj;
    }

    public void setInfos(List<KeyDescObj> list) {
        this.infos = list;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setPrepare_state(String str) {
        this.prepare_state = str;
    }

    public void setRecheck(String str) {
        this.recheck = str;
    }

    public void setRegion_confirm_rich_text(RichStackModelObj richStackModelObj) {
        this.region_confirm_rich_text = richStackModelObj;
    }

    public void setRegion_desc(String str) {
        this.region_desc = str;
    }

    public void setRegion_notice(String str) {
        this.region_notice = str;
    }

    public void setRegion_rich_text(RichStackModelObj richStackModelObj) {
        this.region_rich_text = richStackModelObj;
    }

    public void setSteam_id_info(SteamGameAccount steamGameAccount) {
        this.steam_id_info = steamGameAccount;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser_balance(String str) {
        this.user_balance = str;
    }
}
