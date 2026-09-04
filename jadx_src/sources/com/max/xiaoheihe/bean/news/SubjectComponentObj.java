package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.game.GameNavMenuObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SubjectComponentObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6887152434724540353L;
    private String class_;
    private String click;
    private String description;
    private String outer_img;
    private String outer_title;
    private SubjectParams params;
    private String title;
    private String type;
    private GameNavMenuObj webview;

    public class SubjectParams implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 1328294022203669460L;
        private String click;
        private String description;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private String f77010id;
        private String inner_img;
        private String inner_title;
        private String news_num;

        public SubjectParams() {
        }

        public String getClick() {
            return this.click;
        }

        public String getDescription() {
            return this.description;
        }

        public String getId() {
            return this.f77010id;
        }

        public String getInner_img() {
            return this.inner_img;
        }

        public String getInner_title() {
            return this.inner_title;
        }

        public String getNews_num() {
            return this.news_num;
        }

        public void setClick(String str) {
            this.click = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setId(String str) {
            this.f77010id = str;
        }

        public void setInner_img(String str) {
            this.inner_img = str;
        }

        public void setInner_title(String str) {
            this.inner_title = str;
        }

        public void setNews_num(String str) {
            this.news_num = str;
        }
    }

    public String getClass_() {
        return this.class_;
    }

    public String getClick() {
        return this.click;
    }

    public String getDescription() {
        return this.description;
    }

    public String getOuter_img() {
        return this.outer_img;
    }

    public String getOuter_title() {
        return this.outer_title;
    }

    public SubjectParams getParams() {
        return this.params;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public GameNavMenuObj getWebview() {
        return this.webview;
    }

    public void setClass_(String str) {
        this.class_ = str;
    }

    public void setClick(String str) {
        this.click = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setOuter_img(String str) {
        this.outer_img = str;
    }

    public void setOuter_title(String str) {
        this.outer_title = str;
    }

    public void setParams(SubjectParams subjectParams) {
        this.params = subjectParams;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWebview(GameNavMenuObj gameNavMenuObj) {
        this.webview = gameNavMenuObj;
    }
}
