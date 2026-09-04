package com.max.hbexpression.bean;

import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class EmojiGroupObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2235324305947201502L;
    private List<EmojiItemtObj> emojis;
    private String expression_pack_name;
    private String group_code;
    private String group_img;
    private String group_name;
    private String source_url;
    private String type;

    public List<EmojiItemtObj> getEmojis() {
        return this.emojis;
    }

    public String getExpression_pack_name() {
        return this.expression_pack_name;
    }

    public String getGroup_code() {
        return this.group_code;
    }

    public String getGroup_img() {
        return this.group_img;
    }

    public String getGroup_name() {
        return this.group_name;
    }

    @p0
    public String getSource_url() {
        return this.source_url;
    }

    public String getType() {
        return this.type;
    }

    public void setEmojis(List<EmojiItemtObj> list) {
        this.emojis = list;
    }

    public void setExpression_pack_name(String str) {
        this.expression_pack_name = str;
    }

    public void setGroup_code(String str) {
        this.group_code = str;
    }

    public void setGroup_img(String str) {
        this.group_img = str;
    }

    public void setGroup_name(String str) {
        this.group_name = str;
    }

    public void setSource_url(String str) {
        this.source_url = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
