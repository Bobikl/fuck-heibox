package com.max.xiaoheihe.bean.rich;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.InsetObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BaseRichModelObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class BaseRichModelObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background_color;

    @e
    private String border_color;

    @e
    private String border_width;

    @e
    private String corner_radius;

    @e
    private String height;

    @e
    private InsetObj inset;

    @e
    private String protocol;

    @e
    private String type;

    public BaseRichModelObj() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public BaseRichModelObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e InsetObj insetObj, @e String str7) {
        this.type = str;
        this.background_color = str2;
        this.corner_radius = str3;
        this.border_color = str4;
        this.border_width = str5;
        this.protocol = str6;
        this.inset = insetObj;
        this.height = str7;
    }

    public /* synthetic */ BaseRichModelObj(String str, String str2, String str3, String str4, String str5, String str6, InsetObj insetObj, String str7, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : insetObj, (i10 & 128) == 0 ? str7 : null);
    }

    @e
    public final String getBackground_color() {
        return this.background_color;
    }

    @e
    public final String getBorder_color() {
        return this.border_color;
    }

    @e
    public final String getBorder_width() {
        return this.border_width;
    }

    @e
    public final String getCorner_radius() {
        return this.corner_radius;
    }

    @e
    public final String getHeight() {
        return this.height;
    }

    @e
    public final InsetObj getInset() {
        return this.inset;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public final void setBackground_color(@e String str) {
        this.background_color = str;
    }

    public final void setBorder_color(@e String str) {
        this.border_color = str;
    }

    public final void setBorder_width(@e String str) {
        this.border_width = str;
    }

    public final void setCorner_radius(@e String str) {
        this.corner_radius = str;
    }

    public final void setHeight(@e String str) {
        this.height = str;
    }

    public final void setInset(@e InsetObj insetObj) {
        this.inset = insetObj;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }
}
