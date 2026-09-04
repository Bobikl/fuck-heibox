package com.max.hbuikit.bean;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.starlightc.ucropplus.model.RemoteTextRenderInfo;
import dl.e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: UiKitTextObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitTextObj extends UiKitViewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean bold;

    @e
    private String ellipsize;

    @e
    private String font_name;

    @e
    private String gravity;

    @e
    private String line_height;

    @e
    private String max_height;

    @e
    private String max_lines;

    @e
    private String max_width;

    @e
    private String min_height;

    @e
    private String min_width;

    @e
    private RemoteTextRenderInfo render_info;

    @e
    private Boolean show_strike;

    @e
    private Boolean show_underline;

    @e
    private List<UiKitSpanObj> span_list;

    @e
    private String text;

    @e
    private String text_color;

    @e
    private String text_size;

    public UiKitTextObj() {
        Boolean bool = Boolean.FALSE;
        this.show_strike = bool;
        this.show_underline = bool;
    }

    public final boolean getBold() {
        return this.bold;
    }

    @e
    public final String getEllipsize() {
        return this.ellipsize;
    }

    @e
    public final String getFont_name() {
        return this.font_name;
    }

    @e
    public final String getGravity() {
        return this.gravity;
    }

    @e
    public final String getLine_height() {
        return this.line_height;
    }

    @e
    public final String getMax_height() {
        return this.max_height;
    }

    @e
    public final String getMax_lines() {
        return this.max_lines;
    }

    @e
    public final String getMax_width() {
        return this.max_width;
    }

    @e
    public final String getMin_height() {
        return this.min_height;
    }

    @e
    public final String getMin_width() {
        return this.min_width;
    }

    @e
    public final RemoteTextRenderInfo getRender_info() {
        return this.render_info;
    }

    @e
    public final Boolean getShow_strike() {
        return this.show_strike;
    }

    @e
    public final Boolean getShow_underline() {
        return this.show_underline;
    }

    @e
    public final List<UiKitSpanObj> getSpan_list() {
        return this.span_list;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    @e
    public final String getText_size() {
        return this.text_size;
    }

    public final void setBold(boolean z10) {
        this.bold = z10;
    }

    public final void setEllipsize(@e String str) {
        this.ellipsize = str;
    }

    public final void setFont_name(@e String str) {
        this.font_name = str;
    }

    public final void setGravity(@e String str) {
        this.gravity = str;
    }

    public final void setLine_height(@e String str) {
        this.line_height = str;
    }

    public final void setMax_height(@e String str) {
        this.max_height = str;
    }

    public final void setMax_lines(@e String str) {
        this.max_lines = str;
    }

    public final void setMax_width(@e String str) {
        this.max_width = str;
    }

    public final void setMin_height(@e String str) {
        this.min_height = str;
    }

    public final void setMin_width(@e String str) {
        this.min_width = str;
    }

    public final void setRender_info(@e RemoteTextRenderInfo remoteTextRenderInfo) {
        this.render_info = remoteTextRenderInfo;
    }

    public final void setShow_strike(@e Boolean bool) {
        this.show_strike = bool;
    }

    public final void setShow_underline(@e Boolean bool) {
        this.show_underline = bool;
    }

    public final void setSpan_list(@e List<UiKitSpanObj> list) {
        this.span_list = list;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }

    public final void setText_size(@e String str) {
        this.text_size = str;
    }
}
