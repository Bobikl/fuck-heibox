package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: FeedsContentLinkCollectionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsContentLinkCollectionObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<BBSLinkObj> link_list;

    @e
    private String link_see_more_protocol;

    @e
    private String title;

    @e
    private String title_protocol;

    @e
    private BBSLinkObj top_link;

    @e
    public final List<BBSLinkObj> getLink_list() {
        return this.link_list;
    }

    @e
    public final String getLink_see_more_protocol() {
        return this.link_see_more_protocol;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getTitle_protocol() {
        return this.title_protocol;
    }

    @e
    public final BBSLinkObj getTop_link() {
        return this.top_link;
    }

    public final void setLink_list(@e List<BBSLinkObj> list) {
        this.link_list = list;
    }

    public final void setLink_see_more_protocol(@e String str) {
        this.link_see_more_protocol = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTitle_protocol(@e String str) {
        this.title_protocol = str;
    }

    public final void setTop_link(@e BBSLinkObj bBSLinkObj) {
        this.top_link = bBSLinkObj;
    }
}
