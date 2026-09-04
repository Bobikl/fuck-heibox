package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GamePreviewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6770670082975047684L;
    private GameObj game;
    private GamePreviewInfoObj preview_info;

    public GameObj getGame() {
        return this.game;
    }

    public GamePreviewInfoObj getPreview_info() {
        return this.preview_info;
    }

    public void setGame(GameObj gameObj) {
        this.game = gameObj;
    }

    public void setPreview_info(GamePreviewInfoObj gamePreviewInfoObj) {
        this.preview_info = gamePreviewInfoObj;
    }
}
