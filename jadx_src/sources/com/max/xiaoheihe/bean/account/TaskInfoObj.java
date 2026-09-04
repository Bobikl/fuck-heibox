package com.max.xiaoheihe.bean.account;

import com.google.gson.JsonObject;
import com.max.xiaoheihe.bean.game.recommend.GradientColorObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TaskInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String award;
    private String award_battery;
    private String award_coin;
    private List<String> award_desc;
    private List<TaskAwardInfo> award_desc_v2;
    private String award_exp;
    private String award_mdiamond;
    private String desc;
    private GradientColorObj gradient_color;
    private String icon;
    private String is_band;
    private String is_new;
    private int leftPosition;
    private String lock_desc;
    private String maxjia;
    private JsonObject report_extra;
    private String sign_in_streak;
    private String state;
    private String state_desc;
    private String tab_id;
    private String task_end_time;
    private String title;
    private int topPosition;
    private String type;
    private String url;

    public String getAward() {
        return this.award;
    }

    public String getAward_battery() {
        return this.award_battery;
    }

    public String getAward_coin() {
        return this.award_coin;
    }

    public List<String> getAward_desc() {
        return this.award_desc;
    }

    public List<TaskAwardInfo> getAward_desc_v2() {
        return this.award_desc_v2;
    }

    public String getAward_exp() {
        return this.award_exp;
    }

    public String getAward_mdiamond() {
        return this.award_mdiamond;
    }

    public String getDesc() {
        return this.desc;
    }

    public GradientColorObj getGradient_color() {
        return this.gradient_color;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIs_band() {
        return this.is_band;
    }

    public String getIs_new() {
        return this.is_new;
    }

    public int getLeftPosition() {
        return this.leftPosition;
    }

    public String getLock_desc() {
        return this.lock_desc;
    }

    public String getMaxjia() {
        return this.maxjia;
    }

    public JsonObject getReport_extra() {
        return this.report_extra;
    }

    public String getSign_in_streak() {
        return this.sign_in_streak;
    }

    public String getState() {
        return this.state;
    }

    public String getState_desc() {
        return this.state_desc;
    }

    public String getTab_id() {
        return this.tab_id;
    }

    public String getTask_end_time() {
        return this.task_end_time;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTopPosition() {
        return this.topPosition;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAward(String str) {
        this.award = str;
    }

    public void setAward_battery(String str) {
        this.award_battery = str;
    }

    public void setAward_coin(String str) {
        this.award_coin = str;
    }

    public void setAward_desc(List<String> list) {
        this.award_desc = list;
    }

    public void setAward_desc_v2(List<TaskAwardInfo> list) {
        this.award_desc_v2 = list;
    }

    public void setAward_exp(String str) {
        this.award_exp = str;
    }

    public void setAward_mdiamond(String str) {
        this.award_mdiamond = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setGradient_color(GradientColorObj gradientColorObj) {
        this.gradient_color = gradientColorObj;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIs_band(String str) {
        this.is_band = str;
    }

    public void setIs_new(String str) {
        this.is_new = str;
    }

    public void setLeftPosition(int i10) {
        this.leftPosition = i10;
    }

    public void setLock_desc(String str) {
        this.lock_desc = str;
    }

    public void setMaxjia(String str) {
        this.maxjia = str;
    }

    public void setPosition(int i10, int i11) {
        this.leftPosition = i10;
        this.topPosition = i11;
    }

    public void setReport_extra(JsonObject jsonObject) {
        this.report_extra = jsonObject;
    }

    public void setSign_in_streak(String str) {
        this.sign_in_streak = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setState_desc(String str) {
        this.state_desc = str;
    }

    public void setTab_id(String str) {
        this.tab_id = str;
    }

    public void setTask_end_time(String str) {
        this.task_end_time = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopPosition(int i10) {
        this.topPosition = i10;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
