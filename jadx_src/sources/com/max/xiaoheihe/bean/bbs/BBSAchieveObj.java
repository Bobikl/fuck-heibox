package com.max.xiaoheihe.bean.bbs;

import com.max.xiaoheihe.bean.BtnObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSAchieveObj {
    public static final String OPE_UNLOAD = "unload";
    public static final String OPE_WEAR = "wear";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String achieved;
    private BtnObj btn;
    private String btn_enabled;
    private String desc;
    private String end_color;
    private BBSAchieveExpObj exp;
    private String img;
    private String level;
    private String level_enabled;
    private String medal_id;
    private String name;
    private List<BBSAchieveRuleObj> rules;
    private String start_color;
    private String wear;

    public String getAchieved() {
        return this.achieved;
    }

    public BtnObj getBtn() {
        return this.btn;
    }

    public String getBtn_enabled() {
        return this.btn_enabled;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEnd_color() {
        return this.end_color;
    }

    public BBSAchieveExpObj getExp() {
        return this.exp;
    }

    public String getImg() {
        return this.img;
    }

    public String getLevel() {
        return this.level;
    }

    public String getLevel_enabled() {
        return this.level_enabled;
    }

    public String getMedal_id() {
        return this.medal_id;
    }

    public String getName() {
        return this.name;
    }

    public List<BBSAchieveRuleObj> getRules() {
        return this.rules;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public String getWear() {
        return this.wear;
    }

    public void setAchieved(String str) {
        this.achieved = str;
    }

    public void setBtn(BtnObj btnObj) {
        this.btn = btnObj;
    }

    public void setBtn_enabled(String str) {
        this.btn_enabled = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setExp(BBSAchieveExpObj bBSAchieveExpObj) {
        this.exp = bBSAchieveExpObj;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setLevel_enabled(String str) {
        this.level_enabled = str;
    }

    public void setMedal_id(String str) {
        this.medal_id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRules(List<BBSAchieveRuleObj> list) {
        this.rules = list;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setWear(String str) {
        this.wear = str;
    }
}
