package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1905923275605786977L;
    private String avatar;
    private String birthday;
    private String career;
    private String education;
    private String email;
    private String gender;
    private String heybox_id;
    private String nickname;
    private String signature;

    public String getAvatar() {
        return this.avatar;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getCareer() {
        return this.career;
    }

    public String getEducation() {
        return this.education;
    }

    public String getEmail() {
        return this.email;
    }

    public String getGender() {
        return this.gender;
    }

    public String getHeybox_id() {
        return this.heybox_id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setCareer(String str) {
        this.career = str;
    }

    public void setEducation(String str) {
        this.education = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setHeybox_id(String str) {
        this.heybox_id = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }
}
