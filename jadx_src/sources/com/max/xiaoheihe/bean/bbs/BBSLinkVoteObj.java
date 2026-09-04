package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSLinkVoteObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2530950285456113783L;
    private String option_imgs;
    private List<BBSVoteOptionObj> option_list;
    private int option_mode;
    private Calendar vote_end_date;
    private int vote_num = -1;
    private String vote_options;
    private String vote_title;
    private String vote_type;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14186, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BBSLinkVoteObj bBSLinkVoteObj = (BBSLinkVoteObj) obj;
        if (this.option_mode != bBSLinkVoteObj.option_mode) {
            return false;
        }
        String str = this.vote_title;
        if (str == null ? bBSLinkVoteObj.vote_title != null : !str.equals(bBSLinkVoteObj.vote_title)) {
            return false;
        }
        String str2 = this.vote_type;
        if (str2 == null ? bBSLinkVoteObj.vote_type != null : !str2.equals(bBSLinkVoteObj.vote_type)) {
            return false;
        }
        if (this.vote_num != bBSLinkVoteObj.vote_num) {
            return false;
        }
        String str3 = this.vote_options;
        if (str3 == null ? bBSLinkVoteObj.vote_options != null : !str3.equals(bBSLinkVoteObj.vote_options)) {
            return false;
        }
        String str4 = this.option_imgs;
        if (str4 == null ? bBSLinkVoteObj.option_imgs != null : !str4.equals(bBSLinkVoteObj.option_imgs)) {
            return false;
        }
        Calendar calendar = this.vote_end_date;
        if (calendar == null ? bBSLinkVoteObj.vote_end_date != null : !calendar.equals(bBSLinkVoteObj.vote_end_date)) {
            return false;
        }
        List<BBSVoteOptionObj> list = this.option_list;
        List<BBSVoteOptionObj> list2 = bBSLinkVoteObj.option_list;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public String getOption_imgs() {
        return this.option_imgs;
    }

    public List<BBSVoteOptionObj> getOption_list() {
        return this.option_list;
    }

    public int getOption_mode() {
        return this.option_mode;
    }

    public Calendar getVote_end_date() {
        return this.vote_end_date;
    }

    public int getVote_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14185, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.vote_num < 0) {
            List<BBSVoteOptionObj> list = this.option_list;
            if (list != null) {
                this.vote_num = list.size();
            } else {
                this.vote_num = 1;
            }
        }
        return this.vote_num;
    }

    public String getVote_options() {
        return this.vote_options;
    }

    public String getVote_title() {
        return this.vote_title;
    }

    public String getVote_type() {
        return this.vote_type;
    }

    public void setOption_imgs(String str) {
        this.option_imgs = str;
    }

    public void setOption_list(List<BBSVoteOptionObj> list) {
        this.option_list = list;
    }

    public void setOption_mode(int i10) {
        this.option_mode = i10;
    }

    public void setVote_end_date(Calendar calendar) {
        this.vote_end_date = calendar;
    }

    public void setVote_num(int i10) {
        this.vote_num = i10;
    }

    public void setVote_options(String str) {
        this.vote_options = str;
    }

    public void setVote_title(String str) {
        this.vote_title = str;
    }

    public void setVote_type(String str) {
        this.vote_type = str;
    }
}
