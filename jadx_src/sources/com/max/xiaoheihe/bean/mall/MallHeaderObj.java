package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.xiaoheihe.bean.MenuObj;
import com.max.xiaoheihe.bean.MenusObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallHeaderObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AdsBannerObj> banners;
    private String coin;
    private String mall_desc;
    private MemberCardInfoObj member_info;
    private List<MenuObj> menu;
    private String pay_coin;
    private String pay_type;
    private String pay_url;
    private String presell_desc;
    private String search_placeholder;
    private MenusObj tabs;
    private String wait_process_orders;

    public List<AdsBannerObj> getBanners() {
        return this.banners;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getMall_desc() {
        return this.mall_desc;
    }

    public MemberCardInfoObj getMember_info() {
        return this.member_info;
    }

    public List<MenuObj> getMenu() {
        return this.menu;
    }

    public String getPay_coin() {
        return this.pay_coin;
    }

    public String getPay_type() {
        return this.pay_type;
    }

    public String getPay_url() {
        return this.pay_url;
    }

    public String getPresell_desc() {
        return this.presell_desc;
    }

    public String getSearch_placeholder() {
        return this.search_placeholder;
    }

    public MenusObj getTabs() {
        return this.tabs;
    }

    public String getWait_process_orders() {
        return this.wait_process_orders;
    }

    public void setBanners(List<AdsBannerObj> list) {
        this.banners = list;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setMall_desc(String str) {
        this.mall_desc = str;
    }

    public void setMember_info(MemberCardInfoObj memberCardInfoObj) {
        this.member_info = memberCardInfoObj;
    }

    public void setMenu(List<MenuObj> list) {
        this.menu = list;
    }

    public void setPay_coin(String str) {
        this.pay_coin = str;
    }

    public void setPay_type(String str) {
        this.pay_type = str;
    }

    public void setPay_url(String str) {
        this.pay_url = str;
    }

    public void setPresell_desc(String str) {
        this.presell_desc = str;
    }

    public void setSearch_placeholder(String str) {
        this.search_placeholder = str;
    }

    public void setTabs(MenusObj menusObj) {
        this.tabs = menusObj;
    }

    public void setWait_process_orders(String str) {
        this.wait_process_orders = str;
    }
}
