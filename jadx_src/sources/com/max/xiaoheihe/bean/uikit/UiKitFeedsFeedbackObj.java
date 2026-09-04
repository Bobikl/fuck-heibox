package com.max.xiaoheihe.bean.uikit;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitImageObj;
import com.max.xiaoheihe.bean.bbs.FeedbackCateObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: UiKitFeedsFeedbackObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UiKitFeedsFeedbackObj extends UiKitImageObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<FeedbackCateObj> feedback;

    @e
    private String h_src;

    @e
    private String linkid;

    @e
    public final ArrayList<FeedbackCateObj> getFeedback() {
        return this.feedback;
    }

    @e
    public final String getH_src() {
        return this.h_src;
    }

    @e
    public final String getLinkid() {
        return this.linkid;
    }

    public final void setFeedback(@e ArrayList<FeedbackCateObj> arrayList) {
        this.feedback = arrayList;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setLinkid(@e String str) {
        this.linkid = str;
    }
}
