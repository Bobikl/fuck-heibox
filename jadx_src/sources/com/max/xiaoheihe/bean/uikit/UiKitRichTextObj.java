package com.max.xiaoheihe.bean.uikit;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;

/* JADX INFO: compiled from: UiKitRichTextObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UiKitRichTextObj extends UiKitViewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private RichStackModelObj rich_text_stack_model;

    @e
    public final RichStackModelObj getRich_text_stack_model() {
        return this.rich_text_stack_model;
    }

    public final void setRich_text_stack_model(@e RichStackModelObj richStackModelObj) {
        this.rich_text_stack_model = richStackModelObj;
    }
}
