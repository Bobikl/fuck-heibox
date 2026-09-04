package com.max.xiaoheihe.bean.favour;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class HistoryVisitedResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<HistoryContentObj> history_visit;

    public ArrayList<HistoryContentObj> getHistory_visit() {
        return this.history_visit;
    }

    public void setHistory_visit(ArrayList<HistoryContentObj> arrayList) {
        this.history_visit = arrayList;
    }
}
