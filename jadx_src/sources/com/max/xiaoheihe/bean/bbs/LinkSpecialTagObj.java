package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: LinkSpecialTagObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class LinkSpecialTagObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String corner_radius;

    @e
    private String end_color;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private String f76964id;

    @e
    private String is_bold;

    @e
    private String name;

    @e
    private String padding_hor;

    @e
    private String padding_ver;

    @e
    private String start_color;

    public LinkSpecialTagObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9) {
        this.name = str;
        this.color = str2;
        this.f76964id = str3;
        this.start_color = str4;
        this.end_color = str5;
        this.is_bold = str6;
        this.corner_radius = str7;
        this.padding_ver = str8;
        this.padding_hor = str9;
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getCorner_radius() {
        return this.corner_radius;
    }

    @e
    public final String getEnd_color() {
        return this.end_color;
    }

    @e
    public final String getId() {
        return this.f76964id;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getPadding_hor() {
        return this.padding_hor;
    }

    @e
    public final String getPadding_ver() {
        return this.padding_ver;
    }

    @e
    public final String getStart_color() {
        return this.start_color;
    }

    @e
    public final String is_bold() {
        return this.is_bold;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setCorner_radius(@e String str) {
        this.corner_radius = str;
    }

    public final void setEnd_color(@e String str) {
        this.end_color = str;
    }

    public final void setId(@e String str) {
        this.f76964id = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPadding_hor(@e String str) {
        this.padding_hor = str;
    }

    public final void setPadding_ver(@e String str) {
        this.padding_ver = str;
    }

    public final void setStart_color(@e String str) {
        this.start_color = str;
    }

    public final void set_bold(@e String str) {
        this.is_bold = str;
    }
}
