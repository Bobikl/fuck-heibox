package com.max.xiaoheihe.bean.game.apex;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApexLogsResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<ApexContentLogObj> list = new ArrayList();

    public List<ApexContentLogObj> getList() {
        return this.list;
    }

    public void setList(List<ApexContentLogObj> list) {
        this.list = list;
    }
}
