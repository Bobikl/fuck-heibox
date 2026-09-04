package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameRegionPriceObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1211643584929481815L;

    /* JADX INFO: renamed from: cc, reason: collision with root package name */
    private String f76970cc;
    private List<GamePriceObj> data;
    private String image;
    private String name;

    public String getCc() {
        return this.f76970cc;
    }

    public List<GamePriceObj> getData() {
        return this.data;
    }

    public String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public void setCc(String str) {
        this.f76970cc = str;
    }

    public void setData(List<GamePriceObj> list) {
        this.data = list;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
