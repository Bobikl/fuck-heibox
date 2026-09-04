package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class GameStoreItemObj implements Serializable {
    public static final String STATE_ON_SALE = "1";
    public static final String STATE_SOLD_OUT = "0";
    public static final String STATE_WAITING = "2";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 158658695882272149L;
    private String appid;
    private String count;
    private String game_icon;
    private String game_img;
    private String game_name;
    private String game_type;
    private String h_src;
    private GamePriceObj heybox_price;
    private String is_owned;
    private String left_percent;
    private String package_id;
    private List<String> platforms;
    private List<String> platforms_url;
    private GamePriceObj price;
    private String product_intro;
    private String product_name;
    private String product_type;
    private String product_type_desc;
    private String sold_num;
    private String state;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14874, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameStoreItemObj)) {
            return false;
        }
        GameStoreItemObj gameStoreItemObj = (GameStoreItemObj) obj;
        return Objects.equals(getAppid(), gameStoreItemObj.getAppid()) && Objects.equals(getCount(), gameStoreItemObj.getCount()) && Objects.equals(getGame_icon(), gameStoreItemObj.getGame_icon()) && Objects.equals(getGame_img(), gameStoreItemObj.getGame_img()) && Objects.equals(getGame_name(), gameStoreItemObj.getGame_name()) && Objects.equals(getGame_type(), gameStoreItemObj.getGame_type()) && Objects.equals(getLeft_percent(), gameStoreItemObj.getLeft_percent()) && Objects.equals(getPackage_id(), gameStoreItemObj.getPackage_id()) && Objects.equals(getIs_owned(), gameStoreItemObj.getIs_owned()) && Objects.equals(getPrice(), gameStoreItemObj.getPrice()) && Objects.equals(getHeybox_price(), gameStoreItemObj.getHeybox_price()) && Objects.equals(getState(), gameStoreItemObj.getState()) && Objects.equals(getProduct_intro(), gameStoreItemObj.getProduct_intro()) && Objects.equals(getProduct_name(), gameStoreItemObj.getProduct_name()) && Objects.equals(getProduct_type(), gameStoreItemObj.getProduct_type()) && Objects.equals(getProduct_type_desc(), gameStoreItemObj.getProduct_type_desc()) && Objects.equals(getSold_num(), gameStoreItemObj.getSold_num()) && Objects.equals(getPlatforms_url(), gameStoreItemObj.getPlatforms_url()) && Objects.equals(getPlatforms(), gameStoreItemObj.getPlatforms()) && Objects.equals(getH_src(), gameStoreItemObj.getH_src());
    }

    public String getAppid() {
        return this.appid;
    }

    public String getCount() {
        return this.count;
    }

    public String getGame_icon() {
        return this.game_icon;
    }

    public String getGame_img() {
        return this.game_img;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getH_src() {
        return this.h_src;
    }

    public GamePriceObj getHeybox_price() {
        return this.heybox_price;
    }

    public String getIs_owned() {
        return this.is_owned;
    }

    public String getLeft_percent() {
        return this.left_percent;
    }

    public String getPackage_id() {
        return this.package_id;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public List<String> getPlatforms_url() {
        return this.platforms_url;
    }

    public GamePriceObj getPrice() {
        return this.price;
    }

    public String getProduct_intro() {
        return this.product_intro;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public String getProduct_type() {
        return this.product_type;
    }

    public String getProduct_type_desc() {
        return this.product_type_desc;
    }

    public String getSold_num() {
        return this.sold_num;
    }

    public String getState() {
        return this.state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14875, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getAppid(), getCount(), getGame_icon(), getGame_img(), getGame_name(), getGame_type(), getLeft_percent(), getPackage_id(), getIs_owned(), getPrice(), getHeybox_price(), getState(), getProduct_intro(), getProduct_name(), getProduct_type(), getProduct_type_desc(), getSold_num(), getPlatforms_url(), getPlatforms(), getH_src());
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setGame_icon(String str) {
        this.game_icon = str;
    }

    public void setGame_img(String str) {
        this.game_img = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHeybox_price(GamePriceObj gamePriceObj) {
        this.heybox_price = gamePriceObj;
    }

    public void setIs_owned(String str) {
        this.is_owned = str;
    }

    public void setLeft_percent(String str) {
        this.left_percent = str;
    }

    public void setPackage_id(String str) {
        this.package_id = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }

    public void setPlatforms_url(List<String> list) {
        this.platforms_url = list;
    }

    public void setPrice(GamePriceObj gamePriceObj) {
        this.price = gamePriceObj;
    }

    public void setProduct_intro(String str) {
        this.product_intro = str;
    }

    public void setProduct_name(String str) {
        this.product_name = str;
    }

    public void setProduct_type(String str) {
        this.product_type = str;
    }

    public void setProduct_type_desc(String str) {
        this.product_type_desc = str;
    }

    public void setSold_num(String str) {
        this.sold_num = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
