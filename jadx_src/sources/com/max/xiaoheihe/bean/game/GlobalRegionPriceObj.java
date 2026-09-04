package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GlobalRegionPriceObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8725499233334962237L;

    /* JADX INFO: renamed from: cc, reason: collision with root package name */
    private String f76971cc;
    private String current;
    private String deadline_date;
    private String discount;
    private boolean expand = false;
    private String final_amount;
    private String has_history;
    private String image;
    private String initial;
    private String initial_amount;
    private String is_lowest;
    private String lowest_price;
    private String new_lowest;
    private PriceHistoryResult price_history_result;
    private String ps_plus;
    private String purchase_protocol;
    private String region_name;
    private String tag;

    public String getCc() {
        return this.f76971cc;
    }

    public String getCurrent() {
        return this.current;
    }

    public String getDeadline_date() {
        return this.deadline_date;
    }

    public String getDiscount() {
        return this.discount;
    }

    public String getFinal_amount() {
        return this.final_amount;
    }

    public String getHas_history() {
        return this.has_history;
    }

    public String getImage() {
        return this.image;
    }

    public String getInitial() {
        return this.initial;
    }

    public String getInitial_amount() {
        return this.initial_amount;
    }

    public String getIs_lowest() {
        return this.is_lowest;
    }

    public String getLowest_price() {
        return this.lowest_price;
    }

    public String getNew_lowest() {
        return this.new_lowest;
    }

    public PriceHistoryResult getPrice_history_result() {
        return this.price_history_result;
    }

    public String getPs_plus() {
        return this.ps_plus;
    }

    public String getPurchase_protocol() {
        return this.purchase_protocol;
    }

    public String getRegion_name() {
        return this.region_name;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean isExpand() {
        return this.expand;
    }

    public void setCc(String str) {
        this.f76971cc = str;
    }

    public void setCurrent(String str) {
        this.current = str;
    }

    public void setDeadline_date(String str) {
        this.deadline_date = str;
    }

    public void setDiscount(String str) {
        this.discount = str;
    }

    public void setExpand(boolean z10) {
        this.expand = z10;
    }

    public void setFinal_amount(String str) {
        this.final_amount = str;
    }

    public void setHas_history(String str) {
        this.has_history = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setInitial(String str) {
        this.initial = str;
    }

    public void setInitial_amount(String str) {
        this.initial_amount = str;
    }

    public void setIs_lowest(String str) {
        this.is_lowest = str;
    }

    public void setLowest_price(String str) {
        this.lowest_price = str;
    }

    public void setNew_lowest(String str) {
        this.new_lowest = str;
    }

    public void setPrice_history_result(PriceHistoryResult priceHistoryResult) {
        this.price_history_result = priceHistoryResult;
    }

    public void setPs_plus(String str) {
        this.ps_plus = str;
    }

    public void setPurchase_protocol(String str) {
        this.purchase_protocol = str;
    }

    public void setRegion_name(String str) {
        this.region_name = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }
}
