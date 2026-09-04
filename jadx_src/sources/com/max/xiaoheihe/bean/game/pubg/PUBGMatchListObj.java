package com.max.xiaoheihe.bean.game.pubg;

import com.max.xiaoheihe.bean.account.PushStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGMatchListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String download_url;
    private List<PUBGMatchObj> matches;
    private PUBGMatchPlayerObj player_info;
    private PushStateObj push_state;

    public String getDownload_url() {
        return this.download_url;
    }

    public List<PUBGMatchObj> getMatches() {
        return this.matches;
    }

    public PUBGMatchPlayerObj getPlayer_info() {
        return this.player_info;
    }

    public PushStateObj getPush_state() {
        return this.push_state;
    }

    public void setDownload_url(String str) {
        this.download_url = str;
    }

    public PUBGMatchListObj setMatches(List<PUBGMatchObj> list) {
        this.matches = list;
        return this;
    }

    public void setPlayer_info(PUBGMatchPlayerObj pUBGMatchPlayerObj) {
        this.player_info = pUBGMatchPlayerObj;
    }

    public void setPush_state(PushStateObj pushStateObj) {
        this.push_state = pushStateObj;
    }
}
