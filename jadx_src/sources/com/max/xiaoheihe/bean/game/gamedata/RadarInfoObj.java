package com.max.xiaoheihe.bean.game.gamedata;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGRoundDataObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RadarInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<PUBGRoundDataObj> rounds;
    private List<KeyDescObj> scores;

    public List<PUBGRoundDataObj> getRounds() {
        return this.rounds;
    }

    public List<KeyDescObj> getScores() {
        return this.scores;
    }

    public void setRounds(List<PUBGRoundDataObj> list) {
        this.rounds = list;
    }

    public void setScores(List<KeyDescObj> list) {
        this.scores = list;
    }
}
