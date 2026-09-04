package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MallSteamInfoUploadObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3883714167164928131L;
    private HashMap<String, String> header;
    private String order_id;
    private String steamid;

    public HashMap<String, String> getHeader() {
        return this.header;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getSteamid() {
        return this.steamid;
    }

    public void setHeader(HashMap<String, String> map) {
        this.header = map;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setSteamid(String str) {
        this.steamid = str;
    }
}
