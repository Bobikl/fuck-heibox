package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PlayerInfoObj> player_list;
    private List<Integer> ratio;
    private List<String> titles;

    public List<PlayerInfoObj> getPlayer_list() {
        return this.player_list;
    }

    public List<Integer> getRatio() {
        return this.ratio;
    }

    public List<String> getTitles() {
        return this.titles;
    }

    public void setPlayer_list(List<PlayerInfoObj> list) {
        this.player_list = list;
    }

    public void setRatio(List<Integer> list) {
        this.ratio = list;
    }

    public void setTitles(List<String> list) {
        this.titles = list;
    }
}
