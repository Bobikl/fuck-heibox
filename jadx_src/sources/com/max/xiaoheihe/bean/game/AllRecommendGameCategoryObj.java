package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AllRecommendGameCategoryObj {
    public static final String LAYOUT_MATRIX_1X1 = "matrix_1x1";
    public static final String LAYOUT_MATRIX_1X2 = "matrix_1x2";
    public static final String LAYOUT_MATRIX_2X2 = "matrix_2x2";
    public static final String LAYOUT_MATRIX_3X1 = "matrix_3x1";
    public static final String LAYOUT_MATRIX_NX2 = "matrix_n*2";
    public static final String STYLE_GAME = "游戏";
    public static final String STYLE_GAME_COMMENT_RECOMMEND = "安利墙-游戏评价";
    public static final String STYLE_GAME_COMPILATION = "游戏专辑";
    public static final String STYLE_PROTOCOL = "协议";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String layout;
    private List<RecommendGameListItemObj> list;
    private String more_protocol;
    private String show_type;
    private String style;
    private String sub_title;
    private String title;

    public String getLayout() {
        return this.layout;
    }

    public List<RecommendGameListItemObj> getList() {
        return this.list;
    }

    public String getMore_protocol() {
        return this.more_protocol;
    }

    public String getShow_type() {
        return this.show_type;
    }

    public String getStyle() {
        return this.style;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setLayout(String str) {
        this.layout = str;
    }

    public void setList(List<RecommendGameListItemObj> list) {
        this.list = list;
    }

    public void setMore_protocol(String str) {
        this.more_protocol = str;
    }

    public void setShow_type(String str) {
        this.show_type = str;
    }

    public void setStyle(String str) {
        this.style = str;
    }

    public void setSub_title(String str) {
        this.sub_title = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
