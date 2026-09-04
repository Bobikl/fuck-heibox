package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;

/* JADX INFO: compiled from: GameOverviewHeaderObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewHeaderObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String faq_protocol;

    @e
    private GameOverviewHeaderInfoObj header_info;

    @e
    private String protocol;

    @e
    public final String getFaq_protocol() {
        return this.faq_protocol;
    }

    @e
    public final GameOverviewHeaderInfoObj getHeader_info() {
        return this.header_info;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public final void setFaq_protocol(@e String str) {
        this.faq_protocol = str;
    }

    public final void setHeader_info(@e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        this.header_info = gameOverviewHeaderInfoObj;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }
}
