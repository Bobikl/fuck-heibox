package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: FlagsV2Obj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FlagsV2Obj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String border_color;

    @e
    private String text;

    @e
    private List<String> text_bg_colors;

    @e
    private String text_color;

    public FlagsV2Obj(@e String str, @e String str2, @e String str3, @e List<String> list) {
        this.text = str;
        this.text_color = str2;
        this.border_color = str3;
        this.text_bg_colors = list;
    }

    @e
    public final String getBorder_color() {
        return this.border_color;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final List<String> getText_bg_colors() {
        return this.text_bg_colors;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    public final void setBorder_color(@e String str) {
        this.border_color = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setText_bg_colors(@e List<String> list) {
        this.text_bg_colors = list;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }
}
