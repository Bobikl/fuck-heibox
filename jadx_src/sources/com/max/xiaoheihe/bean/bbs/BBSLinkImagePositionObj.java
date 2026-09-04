package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.RectObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSLinkImagePositionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BBSLinkImagePositionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String img_cnt;

    @e
    private String img_number_right_expression;

    @d
    private List<RectObj> imgs;

    @e
    private String more_img;

    public BBSLinkImagePositionObj(@e String str, @e String str2, @d List<RectObj> imgs, @e String str3) {
        f0.p(imgs, "imgs");
        this.more_img = str;
        this.img_cnt = str2;
        this.imgs = imgs;
        this.img_number_right_expression = str3;
    }

    @e
    public final String getImg_cnt() {
        return this.img_cnt;
    }

    @e
    public final String getImg_number_right_expression() {
        return this.img_number_right_expression;
    }

    @d
    public final List<RectObj> getImgs() {
        return this.imgs;
    }

    @e
    public final String getMore_img() {
        return this.more_img;
    }

    public final void setImg_cnt(@e String str) {
        this.img_cnt = str;
    }

    public final void setImg_number_right_expression(@e String str) {
        this.img_number_right_expression = str;
    }

    public final void setImgs(@d List<RectObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14173, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.imgs = list;
    }

    public final void setMore_img(@e String str) {
        this.more_img = str;
    }
}
