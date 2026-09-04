package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameCommentStatsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6415743714818210433L;
    private String expect_comment;
    private String expect_num;
    private String extra_desc;
    private String play_comment;
    private String score_comment;
    private String star_1;
    private String star_2;
    private String star_3;
    private String star_4;
    private String star_5;

    public String getExpect_comment() {
        return this.expect_comment;
    }

    public String getExpect_num() {
        return this.expect_num;
    }

    public String getExtra_desc() {
        return this.extra_desc;
    }

    public String getPlay_comment() {
        return this.play_comment;
    }

    public String getScore_comment() {
        return this.score_comment;
    }

    public String getStar_1() {
        return this.star_1;
    }

    public String getStar_2() {
        return this.star_2;
    }

    public String getStar_3() {
        return this.star_3;
    }

    public String getStar_4() {
        return this.star_4;
    }

    public String getStar_5() {
        return this.star_5;
    }

    public void setExpect_comment(String str) {
        this.expect_comment = str;
    }

    public void setExpect_num(String str) {
        this.expect_num = str;
    }

    public void setExtra_desc(String str) {
        this.extra_desc = str;
    }

    public void setPlay_comment(String str) {
        this.play_comment = str;
    }

    public void setScore_comment(String str) {
        this.score_comment = str;
    }

    public void setStar_1(String str) {
        this.star_1 = str;
    }

    public void setStar_2(String str) {
        this.star_2 = str;
    }

    public void setStar_3(String str) {
        this.star_3 = str;
    }

    public void setStar_4(String str) {
        this.star_4 = str;
    }

    public void setStar_5(String str) {
        this.star_5 = str;
    }
}
