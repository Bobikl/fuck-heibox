package com.max.xiaoheihe.bean.mall;

import com.max.xiaoheihe.bean.StateObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MallSkuObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4603209835151801650L;
    private String cat_value;
    private String count;
    private String desc;
    private int desire_count;
    private MallGameInfoObj game_info;
    private String h_src;
    private String head_image;
    private String head_img;
    private ArrayList<String> keys;
    private String left_percent;
    private String max_count;
    private String name;
    private MallPriceObj price;
    private StateObj sale;
    private String sale_desc;
    private String sale_prefix;
    private String sale_state;
    private String sku_id;
    private String spu_cat;
    private String spu_id;
    private MallUnitObj unit;
    private boolean valid;

    public String getCat_value() {
        return this.cat_value;
    }

    public String getCount() {
        return this.count;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getDesire_count() {
        return this.desire_count;
    }

    public MallGameInfoObj getGame_info() {
        return this.game_info;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHead_image() {
        return this.head_image;
    }

    public String getHead_img() {
        return this.head_img;
    }

    public ArrayList<String> getKeys() {
        return this.keys;
    }

    public String getLeft_percent() {
        return this.left_percent;
    }

    public String getMax_count() {
        return this.max_count;
    }

    public String getName() {
        return this.name;
    }

    public MallPriceObj getPrice() {
        return this.price;
    }

    public StateObj getSale() {
        return this.sale;
    }

    public String getSale_desc() {
        return this.sale_desc;
    }

    public String getSale_prefix() {
        return this.sale_prefix;
    }

    public String getSale_state() {
        return this.sale_state;
    }

    public String getSku_id() {
        return this.sku_id;
    }

    public String getSpu_cat() {
        return this.spu_cat;
    }

    public String getSpu_id() {
        return this.spu_id;
    }

    public MallUnitObj getUnit() {
        return this.unit;
    }

    public boolean isValid() {
        return this.valid;
    }

    public void setCat_value(String str) {
        this.cat_value = str;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDesire_count(int i10) {
        this.desire_count = i10;
    }

    public void setGame_info(MallGameInfoObj mallGameInfoObj) {
        this.game_info = mallGameInfoObj;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHead_image(String str) {
        this.head_image = str;
    }

    public void setHead_img(String str) {
        this.head_img = str;
    }

    public void setKeys(ArrayList<String> arrayList) {
        this.keys = arrayList;
    }

    public void setLeft_percent(String str) {
        this.left_percent = str;
    }

    public void setMax_count(String str) {
        this.max_count = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(MallPriceObj mallPriceObj) {
        this.price = mallPriceObj;
    }

    public void setSale(StateObj stateObj) {
        this.sale = stateObj;
    }

    public void setSale_desc(String str) {
        this.sale_desc = str;
    }

    public void setSale_prefix(String str) {
        this.sale_prefix = str;
    }

    public void setSale_state(String str) {
        this.sale_state = str;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
    }

    public void setSpu_cat(String str) {
        this.spu_cat = str;
    }

    public void setSpu_id(String str) {
        this.spu_id = str;
    }

    public void setUnit(MallUnitObj mallUnitObj) {
        this.unit = mallUnitObj;
    }

    public void setValid(boolean z10) {
        this.valid = z10;
    }
}
