package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: PostExposureCountResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostExposureCountResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<String> info;

    @e
    private List<KeyDescObj> options;

    public PostExposureCountResult(@e List<String> list, @e List<KeyDescObj> list2) {
        this.info = list;
        this.options = list2;
    }

    @e
    public final List<String> getInfo() {
        return this.info;
    }

    @e
    public final List<KeyDescObj> getOptions() {
        return this.options;
    }

    public final void setInfo(@e List<String> list) {
        this.info = list;
    }

    public final void setOptions(@e List<KeyDescObj> list) {
        this.options = list;
    }
}
