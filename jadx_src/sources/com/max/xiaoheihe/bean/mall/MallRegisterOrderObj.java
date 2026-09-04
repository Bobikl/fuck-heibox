package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallRegisterOrderObj implements Serializable {
    public static final String SOURCE_GAME = "game";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6206818970575381301L;
    private String address_id;
    private String appid;
    private String balance;
    private String buy_type;
    private String game_price;
    private String package_id;
    private List<MallOrderParamObj> params;
    private String sale_state;
    private long session;
    private String source;
    private String steam_id;
    private String try_use_hcoin;

    public String getAddress_id() {
        return this.address_id;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBalance() {
        return this.balance;
    }

    public String getBuy_type() {
        return this.buy_type;
    }

    public String getGame_price() {
        return this.game_price;
    }

    public String getPackage_id() {
        return this.package_id;
    }

    public List<MallOrderParamObj> getParams() {
        return this.params;
    }

    public String getSale_state() {
        return this.sale_state;
    }

    public long getSession() {
        return this.session;
    }

    public String getSource() {
        return this.source;
    }

    public String getSteam_id() {
        return this.steam_id;
    }

    public String getTry_use_hcoin() {
        return this.try_use_hcoin;
    }

    public void setAddress_id(String str) {
        this.address_id = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBalance(String str) {
        this.balance = str;
    }

    public void setBuy_type(String str) {
        this.buy_type = str;
    }

    public void setGame_price(String str) {
        this.game_price = str;
    }

    public void setPackage_id(String str) {
        this.package_id = str;
    }

    public void setParams(List<MallOrderParamObj> list) {
        this.params = list;
    }

    public void setSale_state(String str) {
        this.sale_state = str;
    }

    public void setSession(long j10) {
        this.session = j10;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSteam_id(String str) {
        this.steam_id = str;
    }

    public void setTry_use_hcoin(String str) {
        this.try_use_hcoin = str;
    }
}
