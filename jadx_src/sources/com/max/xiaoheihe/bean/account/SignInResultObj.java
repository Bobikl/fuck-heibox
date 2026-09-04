package com.max.xiaoheihe.bean.account;

import com.max.hbcommon.bean.AdsBannerObj;
import com.max.xiaoheihe.bean.LevelInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SignInResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AdsBannerObj> ads_banner;
    private SignBirthdayDialogInfoObj birthday_info;
    private String coin;
    private String description;
    private LevelInfoObj level_info;
    private String notify_description;
    private boolean plus_exp;
    private boolean plus_hcoin;
    private String sign_in_coin;
    private String sign_in_exp;
    private String sign_in_member_coin;
    private String sign_in_streak;
    private String state;

    public List<AdsBannerObj> getAds_banner() {
        return this.ads_banner;
    }

    public SignBirthdayDialogInfoObj getBirthday_info() {
        return this.birthday_info;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getDescription() {
        return this.description;
    }

    public LevelInfoObj getLevel_info() {
        return this.level_info;
    }

    public String getNotify_description() {
        return this.notify_description;
    }

    public String getSign_in_coin() {
        return this.sign_in_coin;
    }

    public String getSign_in_exp() {
        return this.sign_in_exp;
    }

    public String getSign_in_member_coin() {
        return this.sign_in_member_coin;
    }

    public String getSign_in_streak() {
        return this.sign_in_streak;
    }

    public String getState() {
        return this.state;
    }

    public boolean isPlus_exp() {
        return this.plus_exp;
    }

    public boolean isPlus_hcoin() {
        return this.plus_hcoin;
    }

    public void setAds_banner(List<AdsBannerObj> list) {
        this.ads_banner = list;
    }

    public void setBirthday_info(SignBirthdayDialogInfoObj signBirthdayDialogInfoObj) {
        this.birthday_info = signBirthdayDialogInfoObj;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setLevel_info(LevelInfoObj levelInfoObj) {
        this.level_info = levelInfoObj;
    }

    public void setNotify_description(String str) {
        this.notify_description = str;
    }

    public void setPlus_exp(boolean z10) {
        this.plus_exp = z10;
    }

    public void setPlus_hcoin(boolean z10) {
        this.plus_hcoin = z10;
    }

    public void setSign_in_coin(String str) {
        this.sign_in_coin = str;
    }

    public void setSign_in_exp(String str) {
        this.sign_in_exp = str;
    }

    public void setSign_in_member_coin(String str) {
        this.sign_in_member_coin = str;
    }

    public void setSign_in_streak(String str) {
        this.sign_in_streak = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
