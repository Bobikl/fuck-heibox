package com.alipay.zoloz.toyger.doc;

import android.graphics.Rect;
import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerDocAlgorithmConfig extends ToygerAlgorithmConfig {
    public Rect frameRect;
    public int rotateTimes;
    public int algoType = 1;
    public int exposure = 20;
    public int blur = 80;
    public int card_detect_score = 100;

    public static ToygerDocAlgorithmConfig from(String str) {
        return (ToygerDocAlgorithmConfig) JSON.parseObject(str, ToygerDocAlgorithmConfig.class);
    }

    public String toString() {
        return "ToygerDocAlgorithmConfig{algoType=" + this.algoType + ", rect=" + this.frameRect.toString() + ", rotateTimes=" + this.rotateTimes + ", exposure=" + this.exposure + ", blur=" + this.blur + ", card_detect_score=" + this.card_detect_score + '}';
    }
}
