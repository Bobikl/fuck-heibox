package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BindInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8037766650534948233L;
    private String bg_img;
    private String bind_bg_color;
    private String bind_desc;
    private String bind_text_color;
    private String display_text;
    private String game_bind_logo;
    private String game_stat;
    private String help_url_value;
    private String input_desc;
    private String input_style;
    private String protocol;
    private List<KeyDescObj> server;
    private String shrink_logo_img;
    private String tips_desc;
    private String tips_desc_color;
    private String title_img;
    private String title_top;

    public String getBg_img() {
        return this.bg_img;
    }

    public String getBind_bg_color() {
        return this.bind_bg_color;
    }

    public String getBind_desc() {
        return this.bind_desc;
    }

    public String getBind_text_color() {
        return this.bind_text_color;
    }

    public String getDisplay_text() {
        return this.display_text;
    }

    public String getGame_bind_logo() {
        return this.game_bind_logo;
    }

    public String getGame_stat() {
        return this.game_stat;
    }

    public String getHelp_url_value() {
        return this.help_url_value;
    }

    public String getInput_desc() {
        return this.input_desc;
    }

    public String getInput_style() {
        return this.input_style;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public List<KeyDescObj> getServer() {
        return this.server;
    }

    public String getShrink_logo_img() {
        return this.shrink_logo_img;
    }

    public String getTips_desc() {
        return this.tips_desc;
    }

    public String getTips_desc_color() {
        return this.tips_desc_color;
    }

    public String getTitle_img() {
        return this.title_img;
    }

    public String getTitle_top() {
        return this.title_top;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setBind_bg_color(String str) {
        this.bind_bg_color = str;
    }

    public void setBind_desc(String str) {
        this.bind_desc = str;
    }

    public void setBind_text_color(String str) {
        this.bind_text_color = str;
    }

    public void setDisplay_text(String str) {
        this.display_text = str;
    }

    public void setGame_bind_logo(String str) {
        this.game_bind_logo = str;
    }

    public void setGame_stat(String str) {
        this.game_stat = str;
    }

    public void setHelp_url_value(String str) {
        this.help_url_value = str;
    }

    public void setInput_desc(String str) {
        this.input_desc = str;
    }

    public void setInput_style(String str) {
        this.input_style = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setServer(List<KeyDescObj> list) {
        this.server = list;
    }

    public void setShrink_logo_img(String str) {
        this.shrink_logo_img = str;
    }

    public void setTips_desc(String str) {
        this.tips_desc = str;
    }

    public void setTips_desc_color(String str) {
        this.tips_desc_color = str;
    }

    public void setTitle_img(String str) {
        this.title_img = str;
    }

    public void setTitle_top(String str) {
        this.title_top = str;
    }
}
