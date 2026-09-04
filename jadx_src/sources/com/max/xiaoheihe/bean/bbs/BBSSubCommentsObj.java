package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSSubCommentsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1295440510807910600L;
    private List<BBSCommentObj> comments;
    private String has_more;
    private String lastval;

    public List<BBSCommentObj> getComments() {
        return this.comments;
    }

    public String getHas_more() {
        return this.has_more;
    }

    public String getLastval() {
        return this.lastval;
    }

    public void setComments(List<BBSCommentObj> list) {
        this.comments = list;
    }

    public void setHas_more(String str) {
        this.has_more = str;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }
}
