package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SteamBalanceObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3174604723834701234L;
    private String current_balance;
    private List<MallSteamKeyStateObj> keys;
    private String steam_id;

    public String getCurrent_balance() {
        return this.current_balance;
    }

    public List<MallSteamKeyStateObj> getKeys() {
        return this.keys;
    }

    public String getSteam_id() {
        return this.steam_id;
    }

    public void setCurrent_balance(String str) {
        this.current_balance = str;
    }

    public void setKeys(List<MallSteamKeyStateObj> list) {
        this.keys = list;
    }

    public void setSteam_id(String str) {
        this.steam_id = str;
    }
}
