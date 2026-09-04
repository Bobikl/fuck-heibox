package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class HeyboxRankObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String friend_rank;
    private HeyboxInfoObj heybox_info;
    private String heybox_rank;
    private PlayInfoObj play_info;
    private int rank;
    private SteamIdInfoObj steam_info;
    private SteamIdInfoObj steamid_info;

    public String getFriend_rank() {
        return this.friend_rank;
    }

    public HeyboxInfoObj getHeybox_info() {
        return this.heybox_info;
    }

    public String getHeybox_rank() {
        return this.heybox_rank;
    }

    public PlayInfoObj getPlay_info() {
        return this.play_info;
    }

    public int getRank() {
        return this.rank;
    }

    public SteamIdInfoObj getSteam_info() {
        return this.steam_info;
    }

    public SteamIdInfoObj getSteamid_info() {
        return this.steamid_info;
    }

    public void setFriend_rank(String str) {
        this.friend_rank = str;
    }

    public void setHeybox_info(HeyboxInfoObj heyboxInfoObj) {
        this.heybox_info = heyboxInfoObj;
    }

    public void setHeybox_rank(String str) {
        this.heybox_rank = str;
    }

    public void setPlay_info(PlayInfoObj playInfoObj) {
        this.play_info = playInfoObj;
    }

    public void setRank(int i10) {
        this.rank = i10;
    }

    public void setSteam_info(SteamIdInfoObj steamIdInfoObj) {
        this.steam_info = steamIdInfoObj;
    }

    public void setSteamid_info(SteamIdInfoObj steamIdInfoObj) {
        this.steamid_info = steamIdInfoObj;
    }
}
