package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.recommend.GradientColorObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TaskLineObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TaskLineObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<TaskAwardInfo> award_desc_v2;

    @e
    private String desc;

    @e
    private String finish_cnt;

    @e
    private GradientColorObj gradient_color;

    @e
    private String icon;

    @e
    private String maxjia;

    @e
    private String state;

    @e
    private String state_desc;

    @e
    private String tab_id;

    @e
    private List<? extends TaskInfoObj> tasks;

    @e
    private String title;

    @e
    private String total_cnt;

    @e
    private String type;

    @e
    private String url;

    public TaskLineObj(@e String str, @e List<? extends TaskInfoObj> list, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e List<TaskAwardInfo> list2, @e String str8, @e String str9, @e String str10, @e String str11, @e GradientColorObj gradientColorObj) {
        this.state = str;
        this.tasks = list;
        this.total_cnt = str2;
        this.title = str3;
        this.state_desc = str4;
        this.icon = str5;
        this.finish_cnt = str6;
        this.desc = str7;
        this.award_desc_v2 = list2;
        this.tab_id = str8;
        this.maxjia = str9;
        this.url = str10;
        this.type = str11;
        this.gradient_color = gradientColorObj;
    }

    public static /* synthetic */ TaskLineObj copy$default(TaskLineObj taskLineObj, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, List list2, String str8, String str9, String str10, String str11, GradientColorObj gradientColorObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{taskLineObj, str, list, str2, str3, str4, str5, str6, str7, list2, str8, str9, str10, str11, gradientColorObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 13980, new Class[]{TaskLineObj.class, String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, String.class, String.class, GradientColorObj.class, Integer.TYPE, Object.class}, TaskLineObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TaskLineObj) patchProxyResultProxy.result;
        }
        return taskLineObj.copy((i10 & 1) != 0 ? taskLineObj.state : str, (i10 & 2) != 0 ? taskLineObj.tasks : list, (i10 & 4) != 0 ? taskLineObj.total_cnt : str2, (i10 & 8) != 0 ? taskLineObj.title : str3, (i10 & 16) != 0 ? taskLineObj.state_desc : str4, (i10 & 32) != 0 ? taskLineObj.icon : str5, (i10 & 64) != 0 ? taskLineObj.finish_cnt : str6, (i10 & 128) != 0 ? taskLineObj.desc : str7, (i10 & 256) != 0 ? taskLineObj.award_desc_v2 : list2, (i10 & 512) != 0 ? taskLineObj.tab_id : str8, (i10 & 1024) != 0 ? taskLineObj.maxjia : str9, (i10 & 2048) != 0 ? taskLineObj.url : str10, (i10 & 4096) != 0 ? taskLineObj.type : str11, (i10 & 8192) != 0 ? taskLineObj.gradient_color : gradientColorObj);
    }

    @e
    public final String component1() {
        return this.state;
    }

    @e
    public final String component10() {
        return this.tab_id;
    }

    @e
    public final String component11() {
        return this.maxjia;
    }

    @e
    public final String component12() {
        return this.url;
    }

    @e
    public final String component13() {
        return this.type;
    }

    @e
    public final GradientColorObj component14() {
        return this.gradient_color;
    }

    @e
    public final List<TaskInfoObj> component2() {
        return this.tasks;
    }

    @e
    public final String component3() {
        return this.total_cnt;
    }

    @e
    public final String component4() {
        return this.title;
    }

    @e
    public final String component5() {
        return this.state_desc;
    }

    @e
    public final String component6() {
        return this.icon;
    }

    @e
    public final String component7() {
        return this.finish_cnt;
    }

    @e
    public final String component8() {
        return this.desc;
    }

    @e
    public final List<TaskAwardInfo> component9() {
        return this.award_desc_v2;
    }

    @d
    public final TaskLineObj copy(@e String str, @e List<? extends TaskInfoObj> list, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e List<TaskAwardInfo> list2, @e String str8, @e String str9, @e String str10, @e String str11, @e GradientColorObj gradientColorObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2, str3, str4, str5, str6, str7, list2, str8, str9, str10, str11, gradientColorObj}, this, changeQuickRedirect, false, 13979, new Class[]{String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, String.class, String.class, GradientColorObj.class}, TaskLineObj.class);
        return patchProxyResultProxy.isSupported ? (TaskLineObj) patchProxyResultProxy.result : new TaskLineObj(str, list, str2, str3, str4, str5, str6, str7, list2, str8, str9, str10, str11, gradientColorObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13983, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskLineObj)) {
            return false;
        }
        TaskLineObj taskLineObj = (TaskLineObj) obj;
        return f0.g(this.state, taskLineObj.state) && f0.g(this.tasks, taskLineObj.tasks) && f0.g(this.total_cnt, taskLineObj.total_cnt) && f0.g(this.title, taskLineObj.title) && f0.g(this.state_desc, taskLineObj.state_desc) && f0.g(this.icon, taskLineObj.icon) && f0.g(this.finish_cnt, taskLineObj.finish_cnt) && f0.g(this.desc, taskLineObj.desc) && f0.g(this.award_desc_v2, taskLineObj.award_desc_v2) && f0.g(this.tab_id, taskLineObj.tab_id) && f0.g(this.maxjia, taskLineObj.maxjia) && f0.g(this.url, taskLineObj.url) && f0.g(this.type, taskLineObj.type) && f0.g(this.gradient_color, taskLineObj.gradient_color);
    }

    @e
    public final List<TaskAwardInfo> getAward_desc_v2() {
        return this.award_desc_v2;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getFinish_cnt() {
        return this.finish_cnt;
    }

    @e
    public final GradientColorObj getGradient_color() {
        return this.gradient_color;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getMaxjia() {
        return this.maxjia;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getState_desc() {
        return this.state_desc;
    }

    @e
    public final String getTab_id() {
        return this.tab_id;
    }

    @e
    public final List<TaskInfoObj> getTasks() {
        return this.tasks;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getTotal_cnt() {
        return this.total_cnt;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13982, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.state;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends TaskInfoObj> list = this.tasks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.total_cnt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state_desc;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.finish_cnt;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.desc;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<TaskAwardInfo> list2 = this.award_desc_v2;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.tab_id;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.maxjia;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.url;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        GradientColorObj gradientColorObj = this.gradient_color;
        return iHashCode13 + (gradientColorObj != null ? gradientColorObj.hashCode() : 0);
    }

    public final void setAward_desc_v2(@e List<TaskAwardInfo> list) {
        this.award_desc_v2 = list;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setFinish_cnt(@e String str) {
        this.finish_cnt = str;
    }

    public final void setGradient_color(@e GradientColorObj gradientColorObj) {
        this.gradient_color = gradientColorObj;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setMaxjia(@e String str) {
        this.maxjia = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setState_desc(@e String str) {
        this.state_desc = str;
    }

    public final void setTab_id(@e String str) {
        this.tab_id = str;
    }

    public final void setTasks(@e List<? extends TaskInfoObj> list) {
        this.tasks = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTotal_cnt(@e String str) {
        this.total_cnt = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13981, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TaskLineObj(state=" + this.state + ", tasks=" + this.tasks + ", total_cnt=" + this.total_cnt + ", title=" + this.title + ", state_desc=" + this.state_desc + ", icon=" + this.icon + ", finish_cnt=" + this.finish_cnt + ", desc=" + this.desc + ", award_desc_v2=" + this.award_desc_v2 + ", tab_id=" + this.tab_id + ", maxjia=" + this.maxjia + ", url=" + this.url + ", type=" + this.type + ", gradient_color=" + this.gradient_color + ')';
    }
}
