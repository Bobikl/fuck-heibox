package com.max.xiaoheihe.bean;

import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class RelatedGoodsInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1385576222807967428L;
    private String duration;
    private MallProductObj good;
    private String related_goods_num_desc;

    public String getDuration() {
        return this.duration;
    }

    public MallProductObj getGood() {
        return this.good;
    }

    public String getRelated_goods_num_desc() {
        return this.related_goods_num_desc;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setGood(MallProductObj mallProductObj) {
        this.good = mallProductObj;
    }

    public void setRelated_goods_num_desc(String str) {
        this.related_goods_num_desc = str;
    }
}
