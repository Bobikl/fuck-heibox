package com.max.xiaoheihe.module.bbs.component;

import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.bean.bbs.UserMedalObj;
import dl.d;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: BBSUserSectionView.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void a(@e List<? extends UserMedalObj> list, @e List<? extends UserMedalObj> list2, @e String str);

    void b(boolean z10);

    @d
    HeyBoxAvatarView getAvartar();

    @d
    TextView getTv_name();

    void setAvartar(@d HeyBoxAvatarView heyBoxAvatarView);

    void setExtraTag(@e String str, @e UiKitViewObj uiKitViewObj);

    void setLevel(int i10);

    void setName(@e String str);

    void setTv_name(@d TextView textView);
}
