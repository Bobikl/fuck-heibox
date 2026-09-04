package com.max.xiaoheihe.bean.game.ow;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class OWPlayerInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String level;
    private String nickname;
    private String player_id;
    private String portraitAvatar;
    private String portraitFrame;
    private String portraitFrameIcon;
    private OWPlayerRankObj ranked;

    public String getLevel() {
        return this.level;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPlayer_id() {
        return this.player_id;
    }

    public String getPortraitAvatar() {
        return this.portraitAvatar;
    }

    public String getPortraitFrame() {
        return this.portraitFrame;
    }

    public String getPortraitFrameIcon() {
        return this.portraitFrameIcon;
    }

    public OWPlayerRankObj getRanked() {
        return this.ranked;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPlayer_id(String str) {
        this.player_id = str;
    }

    public void setPortraitAvatar(String str) {
        this.portraitAvatar = str;
    }

    public void setPortraitFrame(String str) {
        this.portraitFrame = str;
    }

    public void setPortraitFrameIcon(String str) {
        this.portraitFrameIcon = str;
    }

    public void setRanked(OWPlayerRankObj oWPlayerRankObj) {
        this.ranked = oWPlayerRankObj;
    }
}
