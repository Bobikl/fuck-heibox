package com.max.hbexpression.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class EmojisListResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6506050581088571253L;
    private List<EmojiGroupObj> emoji_groups;
    private String emoji_version;

    public List<EmojiGroupObj> getEmoji_groups() {
        return this.emoji_groups;
    }

    public String getEmoji_version() {
        return this.emoji_version;
    }

    public void setEmoji_groups(List<EmojiGroupObj> list) {
        this.emoji_groups = list;
    }

    public void setEmoji_version(String str) {
        this.emoji_version = str;
    }
}
