package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePlatformTagObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4646169761776003844L;
    private boolean checked;
    private String desc;
    private String img;
    private int index;
    private String key;
    private List<KeyDescObj> list;

    public String getDesc() {
        return this.desc;
    }

    public String getImg() {
        return this.img;
    }

    public int getIndex() {
        return this.index;
    }

    public String getKey() {
        return this.key;
    }

    public List<KeyDescObj> getList() {
        return this.list;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setList(List<KeyDescObj> list) {
        this.list = list;
    }
}
