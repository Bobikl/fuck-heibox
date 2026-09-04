package com.max.xiaoheihe.bean.game.r6;

import com.max.xiaoheihe.bean.account.HeyboxInfoObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes3.dex */
public class R6ContentFriendObj extends R6ContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String avatar;
    private String end_color;
    private HeyboxInfoObj heybox_info;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76986id;
    private String is_me;
    private String name;
    private double percent;
    private int rank;
    private String start_color;
    private String value;

    public String getAvatar() {
        return this.avatar;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public HeyboxInfoObj getHeybox_info() {
        return this.heybox_info;
    }

    public String getId() {
        return this.f76986id;
    }

    public String getIs_me() {
        return this.is_me;
    }

    public String getName() {
        return this.name;
    }

    public double getPercent() {
        return this.percent;
    }

    public int getRank() {
        return this.rank;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public String getValue() {
        return this.value;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setHeybox_info(HeyboxInfoObj heyboxInfoObj) {
        this.heybox_info = heyboxInfoObj;
    }

    public void setId(String str) {
        this.f76986id = str;
    }

    public void setIs_me(String str) {
        this.is_me = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPercent(double d10) {
        this.percent = d10;
    }

    public void setRank(int i10) {
        this.rank = i10;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public PlayerRankObj toPlayerRank() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15299, new Class[0], PlayerRankObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlayerRankObj) patchProxyResultProxy.result;
        }
        PlayerRankObj playerRankObj = new PlayerRankObj();
        playerRankObj.setRank(this.rank);
        playerRankObj.setAvatar(this.avatar);
        playerRankObj.setNickname(this.name);
        playerRankObj.setValue(this.value);
        playerRankObj.setHeybox_info(this.heybox_info);
        playerRankObj.setPercent(this.percent);
        playerRankObj.setStart_color(this.start_color);
        playerRankObj.setEnd_color(this.end_color);
        return playerRankObj;
    }
}
