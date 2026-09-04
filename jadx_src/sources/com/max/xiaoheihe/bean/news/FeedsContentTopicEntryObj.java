package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.max.hbstory.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: FeedsContentTopicEntryObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsContentTopicEntryObj extends FeedsContentBaseObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<KeyDescObj> topic_list;

    @e
    public final List<KeyDescObj> getTopic_list() {
        return this.topic_list;
    }

    public final void setTopic_list(@e List<KeyDescObj> list) {
        this.topic_list = list;
    }
}
