package com.max.xiaoheihe.bean.uikit;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitViewObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;

/* JADX INFO: compiled from: UiKitUserLevelObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UiKitUserLevelObj extends UiKitViewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String level;

    @e
    public final String getLevel() {
        return this.level;
    }

    public final void setLevel(@e String str) {
        this.level = str;
    }
}
