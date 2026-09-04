package com.max.hbuikit.bean;

import com.max.hbuikit.bean.param.UiKitLottieListObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: UiKitLottieObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public class UiKitLottieObj extends UiKitViewObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String key;

    @e
    private UiKitLottieListObj lottie_list;

    @e
    private UiKitMarkerLottieObj marker_lottie;

    @e
    private String url;

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final UiKitLottieListObj getLottie_list() {
        return this.lottie_list;
    }

    @e
    public final UiKitMarkerLottieObj getMarker_lottie() {
        return this.marker_lottie;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setLottie_list(@e UiKitLottieListObj uiKitLottieListObj) {
        this.lottie_list = uiKitLottieListObj;
    }

    public final void setMarker_lottie(@e UiKitMarkerLottieObj uiKitMarkerLottieObj) {
        this.marker_lottie = uiKitMarkerLottieObj;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }
}
