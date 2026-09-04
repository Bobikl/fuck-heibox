package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: BaseGameOverviewObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class BaseGameOverviewObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String item_type;

    @e
    public final String getItem_type() {
        return this.item_type;
    }

    public final void setItem_type(@e String str) {
        this.item_type = str;
    }
}
