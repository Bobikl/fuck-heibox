package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import android.widget.ImageView;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicObj;
import java.util.List;

/* JADX INFO: compiled from: RecommendedTopicsController.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface y0 {
    @dl.e
    List<String> J1();

    @dl.e
    List<BBSTopicObj> O2();

    @dl.d
    androidx.lifecycle.y P2();

    @dl.d
    RecommendTopicContainer f2();

    @dl.d
    String getContent();

    @dl.d
    Context getContext();

    @dl.d
    String getTitle();

    @dl.e
    String k1();

    void w3(@dl.d RecommendedTopicObj recommendedTopicObj);

    @dl.d
    ImageView x();
}
