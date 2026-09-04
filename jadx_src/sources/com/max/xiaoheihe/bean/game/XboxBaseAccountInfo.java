package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: XboxBaseAccountInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class XboxBaseAccountInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String account_tier_code;

    @e
    private String avatar_url;

    @e
    private String background_url;

    @e
    private String finished_game_count;

    @e
    private String nickname;

    @e
    private String not_started_game_count;

    @e
    private String total_achievement_count;

    @e
    private String total_earned_achievement_count;

    @e
    private String total_game_count;

    @e
    private String total_gamer_score;

    @e
    private String update_time;

    @e
    private String xuid;

    @e
    public final String getAccount_tier_code() {
        return this.account_tier_code;
    }

    @e
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    @e
    public final String getBackground_url() {
        return this.background_url;
    }

    @e
    public final String getFinished_game_count() {
        return this.finished_game_count;
    }

    @e
    public final String getNickname() {
        return this.nickname;
    }

    @e
    public final String getNot_started_game_count() {
        return this.not_started_game_count;
    }

    @e
    public final String getTotal_achievement_count() {
        return this.total_achievement_count;
    }

    @e
    public final String getTotal_earned_achievement_count() {
        return this.total_earned_achievement_count;
    }

    @e
    public final String getTotal_game_count() {
        return this.total_game_count;
    }

    @e
    public final String getTotal_gamer_score() {
        return this.total_gamer_score;
    }

    @e
    public final String getUpdate_time() {
        return this.update_time;
    }

    @e
    public final String getXuid() {
        return this.xuid;
    }

    public final void setAccount_tier_code(@e String str) {
        this.account_tier_code = str;
    }

    public final void setAvatar_url(@e String str) {
        this.avatar_url = str;
    }

    public final void setBackground_url(@e String str) {
        this.background_url = str;
    }

    public final void setFinished_game_count(@e String str) {
        this.finished_game_count = str;
    }

    public final void setNickname(@e String str) {
        this.nickname = str;
    }

    public final void setNot_started_game_count(@e String str) {
        this.not_started_game_count = str;
    }

    public final void setTotal_achievement_count(@e String str) {
        this.total_achievement_count = str;
    }

    public final void setTotal_earned_achievement_count(@e String str) {
        this.total_earned_achievement_count = str;
    }

    public final void setTotal_game_count(@e String str) {
        this.total_game_count = str;
    }

    public final void setTotal_gamer_score(@e String str) {
        this.total_gamer_score = str;
    }

    public final void setUpdate_time(@e String str) {
        this.update_time = str;
    }

    public final void setXuid(@e String str) {
        this.xuid = str;
    }
}
