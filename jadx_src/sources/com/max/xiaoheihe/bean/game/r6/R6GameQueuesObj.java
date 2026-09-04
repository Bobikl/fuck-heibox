package com.max.xiaoheihe.bean.game.r6;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R6GameQueuesObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String desc1;
    private String desc2;
    private List<R6KVObj> details;
    private List<R6KVObj> headers;
    private String history_rank_tips;
    private List<R6RankObj> history_ranks;
    private String main1;
    private String main2;
    private String queue;
    private R6RadarDataObj radar;

    public String getDesc1() {
        return this.desc1;
    }

    public String getDesc2() {
        return this.desc2;
    }

    public List<R6KVObj> getDetails() {
        return this.details;
    }

    public List<R6KVObj> getHeaders() {
        return this.headers;
    }

    public String getHistory_rank_tips() {
        return this.history_rank_tips;
    }

    public List<R6RankObj> getHistory_ranks() {
        return this.history_ranks;
    }

    public String getMain1() {
        return this.main1;
    }

    public String getMain2() {
        return this.main2;
    }

    public String getQueue() {
        return this.queue;
    }

    public R6RadarDataObj getRadar() {
        return this.radar;
    }

    public void setDesc1(String str) {
        this.desc1 = str;
    }

    public void setDesc2(String str) {
        this.desc2 = str;
    }

    public void setDetails(List<R6KVObj> list) {
        this.details = list;
    }

    public void setHeaders(List<R6KVObj> list) {
        this.headers = list;
    }

    public void setHistory_rank_tips(String str) {
        this.history_rank_tips = str;
    }

    public void setHistory_ranks(List<R6RankObj> list) {
        this.history_ranks = list;
    }

    public void setMain1(String str) {
        this.main1 = str;
    }

    public void setMain2(String str) {
        this.main2 = str;
    }

    public void setQueue(String str) {
        this.queue = str;
    }

    public void setRadar(R6RadarDataObj r6RadarDataObj) {
        this.radar = r6RadarDataObj;
    }
}
