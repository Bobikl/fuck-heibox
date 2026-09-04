package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: HighLikeCommentObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HighLikeCommentObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_color;
    private double comment_id;

    @e
    private String post_content;

    @e
    private String text;

    @e
    private List<String> thumb;

    public HighLikeCommentObj(double d10, @e String str, @e String str2, @e List<String> list, @e String str3) {
        this.comment_id = d10;
        this.text = str;
        this.post_content = str2;
        this.thumb = list;
        this.bg_color = str3;
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    public final double getComment_id() {
        return this.comment_id;
    }

    @e
    public final String getPost_content() {
        return this.post_content;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final List<String> getThumb() {
        return this.thumb;
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setComment_id(double d10) {
        this.comment_id = d10;
    }

    public final void setPost_content(@e String str) {
        this.post_content = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setThumb(@e List<String> list) {
        this.thumb = list;
    }
}
