package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewOverlayRecordObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewOverlayRecordObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String cur_rank_score;

    @e
    private String desc;

    @e
    private String faq_protocol;

    @e
    private List<Overlaymatch> overlay_matches;

    @e
    private String title;

    @e
    public final String getCur_rank_score() {
        return this.cur_rank_score;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getFaq_protocol() {
        return this.faq_protocol;
    }

    @e
    public final List<Overlaymatch> getOverlay_matches() {
        return this.overlay_matches;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setCur_rank_score(@e String str) {
        this.cur_rank_score = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setFaq_protocol(@e String str) {
        this.faq_protocol = str;
    }

    public final void setOverlay_matches(@e List<Overlaymatch> list) {
        this.overlay_matches = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
