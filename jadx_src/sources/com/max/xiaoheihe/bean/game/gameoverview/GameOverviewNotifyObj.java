package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;

/* JADX INFO: compiled from: GameOverviewNotifyObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewNotifyObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String msg;

    @e
    private String protocol;

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }
}
