package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameBundleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7935272702459560630L;
    private String bundle_id;
    private String game_count;
    private String h_src;
    private boolean has_owned;
    private GamePriceObj heybox_price;
    private String image;
    private String name;
    private String owned_cnt;
    private String owned_rate;
    private List<String> platforms_url;
    private GamePriceObj price;
    private String release_timestamp;
    private String type;

    public String getBundle_id() {
        return this.bundle_id;
    }

    public String getGame_count() {
        return this.game_count;
    }

    public String getH_src() {
        return this.h_src;
    }

    public GamePriceObj getHeybox_price() {
        return this.heybox_price;
    }

    public String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public String getOwned_cnt() {
        return this.owned_cnt;
    }

    public String getOwned_rate() {
        return this.owned_rate;
    }

    public List<String> getPlatforms_url() {
        return this.platforms_url;
    }

    public GamePriceObj getPrice() {
        return this.price;
    }

    public String getRelease_timestamp() {
        return this.release_timestamp;
    }

    public String getType() {
        return this.type;
    }

    public boolean isHas_owned() {
        return this.has_owned;
    }

    public void setBundle_id(String str) {
        this.bundle_id = str;
    }

    public void setGame_count(String str) {
        this.game_count = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHas_owned(boolean z10) {
        this.has_owned = z10;
    }

    public void setHeybox_price(GamePriceObj gamePriceObj) {
        this.heybox_price = gamePriceObj;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwned_cnt(String str) {
        this.owned_cnt = str;
    }

    public void setOwned_rate(String str) {
        this.owned_rate = str;
    }

    public void setPlatforms_url(List<String> list) {
        this.platforms_url = list;
    }

    public void setPrice(GamePriceObj gamePriceObj) {
        this.price = gamePriceObj;
    }

    public void setRelease_timestamp(String str) {
        this.release_timestamp = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
