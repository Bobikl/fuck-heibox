package com.max.xiaoheihe.bean;

import com.max.xiaoheihe.bean.account.PushStateObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ResultVerifyInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8319246101026465447L;
    private String can_sync;
    private String captcha_url;
    private String game_comment_num;
    private String game_impression_num;
    private String link_id;
    private List<GameObj> recommend_comment_game_list;
    private PushStateObj reply_push_state;
    private String sync_steam_protocol;
    private String verify_reason;

    public String getCan_sync() {
        return this.can_sync;
    }

    public String getCaptcha_url() {
        return this.captcha_url;
    }

    public String getGame_comment_num() {
        return this.game_comment_num;
    }

    public String getGame_impression_num() {
        return this.game_impression_num;
    }

    public String getLink_id() {
        return this.link_id;
    }

    public List<GameObj> getRecommend_comment_game_list() {
        return this.recommend_comment_game_list;
    }

    public PushStateObj getReply_push_state() {
        return this.reply_push_state;
    }

    public String getSync_steam_protocol() {
        return this.sync_steam_protocol;
    }

    public String getVerify_reason() {
        return this.verify_reason;
    }

    public void setCan_sync(String str) {
        this.can_sync = str;
    }

    public void setCaptcha_url(String str) {
        this.captcha_url = str;
    }

    public void setGame_comment_num(String str) {
        this.game_comment_num = str;
    }

    public void setGame_impression_num(String str) {
        this.game_impression_num = str;
    }

    public void setLink_id(String str) {
        this.link_id = str;
    }

    public void setRecommend_comment_game_list(List<GameObj> list) {
        this.recommend_comment_game_list = list;
    }

    public void setReply_push_state(PushStateObj pushStateObj) {
        this.reply_push_state = pushStateObj;
    }

    public void setSync_steam_protocol(String str) {
        this.sync_steam_protocol = str;
    }

    public void setVerify_reason(String str) {
        this.verify_reason = str;
    }
}
