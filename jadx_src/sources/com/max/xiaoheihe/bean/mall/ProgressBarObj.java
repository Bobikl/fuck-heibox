package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: MemberBulletinResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ProgressBarObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private RichAttributeModelObj attr_text;

    @e
    private String progress;

    @e
    private String progress_bg_color;

    @e
    private String progress_tinted_color;

    public ProgressBarObj(@e RichAttributeModelObj richAttributeModelObj, @e String str, @e String str2, @e String str3) {
        this.attr_text = richAttributeModelObj;
        this.progress = str;
        this.progress_bg_color = str2;
        this.progress_tinted_color = str3;
    }

    @e
    public final RichAttributeModelObj getAttr_text() {
        return this.attr_text;
    }

    @e
    public final String getProgress() {
        return this.progress;
    }

    @e
    public final String getProgress_bg_color() {
        return this.progress_bg_color;
    }

    @e
    public final String getProgress_tinted_color() {
        return this.progress_tinted_color;
    }

    public final void setAttr_text(@e RichAttributeModelObj richAttributeModelObj) {
        this.attr_text = richAttributeModelObj;
    }

    public final void setProgress(@e String str) {
        this.progress = str;
    }

    public final void setProgress_bg_color(@e String str) {
        this.progress_bg_color = str;
    }

    public final void setProgress_tinted_color(@e String str) {
        this.progress_tinted_color = str;
    }
}
