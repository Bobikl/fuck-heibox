package com.max.xiaoheihe.bean.uikit;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.bean.bbs.UserMedalObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: UiKitUserMedalObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UiKitUserMedalObj extends UiKitViewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<UserMedalObj> all_medal_list;

    @e
    private List<UserMedalObj> preview_medal_list;

    @e
    private String user_id;

    @e
    public final List<UserMedalObj> getAll_medal_list() {
        return this.all_medal_list;
    }

    @e
    public final List<UserMedalObj> getPreview_medal_list() {
        return this.preview_medal_list;
    }

    @e
    public final String getUser_id() {
        return this.user_id;
    }

    public final void setAll_medal_list(@e List<UserMedalObj> list) {
        this.all_medal_list = list;
    }

    public final void setPreview_medal_list(@e List<UserMedalObj> list) {
        this.preview_medal_list = list;
    }

    public final void setUser_id(@e String str) {
        this.user_id = str;
    }
}
