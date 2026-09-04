package com.max.xiaoheihe.bean.game.destiny2;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.game.apex.ApexContentMenuObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameModeObj;
import com.max.xiaoheihe.bean.game.r6.R6GameQueuesObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Destiny2PlayerOverviewObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ActivityObj activity;
    private String download_url;
    private List<Destiny2GuardianObj> guardian;
    private List<Destiny2MatchObj> match;
    private List<ApexContentMenuObj> menu;
    private String message;
    private String message_time;
    private List<PUBGGameModeObj> modes;
    private List<KeyDescObj> play_mode;
    private PlayerInfoObj player;
    private List<R6GameQueuesObj> stats;

    public ActivityObj getActivity() {
        return this.activity;
    }

    public String getDownload_url() {
        return this.download_url;
    }

    public List<Destiny2GuardianObj> getGuardian() {
        return this.guardian;
    }

    public List<Destiny2MatchObj> getMatch() {
        return this.match;
    }

    public List<ApexContentMenuObj> getMenu() {
        return this.menu;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage_time() {
        return this.message_time;
    }

    public List<PUBGGameModeObj> getModes() {
        return this.modes;
    }

    public List<KeyDescObj> getPlay_mode() {
        return this.play_mode;
    }

    public PlayerInfoObj getPlayer() {
        return this.player;
    }

    public List<R6GameQueuesObj> getStats() {
        return this.stats;
    }

    public void setActivity(ActivityObj activityObj) {
        this.activity = activityObj;
    }

    public void setDownload_url(String str) {
        this.download_url = str;
    }

    public void setGuardian(List<Destiny2GuardianObj> list) {
        this.guardian = list;
    }

    public void setMatch(List<Destiny2MatchObj> list) {
        this.match = list;
    }

    public void setMenu(List<ApexContentMenuObj> list) {
        this.menu = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessage_time(String str) {
        this.message_time = str;
    }

    public void setModes(List<PUBGGameModeObj> list) {
        this.modes = list;
    }

    public void setPlay_mode(List<KeyDescObj> list) {
        this.play_mode = list;
    }

    public void setPlayer(PlayerInfoObj playerInfoObj) {
        this.player = playerInfoObj;
    }

    public void setStats(List<R6GameQueuesObj> list) {
        this.stats = list;
    }
}
