package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameDetailTagWrapperObj implements Serializable {
    public static final String TYPE_ADD_TAG = "TYPE_ADD_TAG";
    public static final String TYPE_COUPON = "TYPE_COUPON";
    public static final String TYPE_GENRES = "TYPE_GENRES";
    public static final String TYPE_HOT_TAG = "TYPE_HOT_TAG";
    public static final String TYPE_PLATFORM = "TYPE_PLATFORM";
    public static final String TYPE_SPECIAL = "TYPE_SPECIAL";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6636051822286352810L;
    private List<GamePlatformInfoObj> platforms_list;
    private KeyDescObj tag_info;
    private String type;

    public List<GamePlatformInfoObj> getPlatforms_list() {
        return this.platforms_list;
    }

    public KeyDescObj getTag_info() {
        return this.tag_info;
    }

    public String getType() {
        return this.type;
    }

    public void setPlatforms_list(List<GamePlatformInfoObj> list) {
        this.platforms_list = list;
    }

    public void setTag_info(KeyDescObj keyDescObj) {
        this.tag_info = keyDescObj;
    }

    public void setType(String str) {
        this.type = str;
    }
}
