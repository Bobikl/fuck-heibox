package com.max.xiaoheihe.bean.bbs;

import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamesInfoResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8164218111146541955L;
    private List<GameObj> base_infos;

    public List<GameObj> getBase_infos() {
        return this.base_infos;
    }

    public void setBase_infos(List<GameObj> list) {
        this.base_infos = list;
    }
}
