package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.Toyger;
import java.util.List;

/* JADX INFO: compiled from: ToygerFaceService.java */
/* JADX INFO: loaded from: classes6.dex */
public class ToygerRunnable implements Runnable {
    private static final String TAG = "TOYGER_FLOW_RUNNABLE";
    public ToygerAttr attr;
    public TGDepthFrame depthFrame;
    public List<TGFrame> frames;

    ToygerRunnable(List<TGFrame> list, TGDepthFrame tGDepthFrame, ToygerAttr toygerAttr) {
        this.frames = list;
        this.depthFrame = tGDepthFrame;
        this.attr = toygerAttr;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Toyger.processImage(this.frames, this.depthFrame, this.attr);
        ToygerLog.i(TAG, "ToygerRunnable.processing_image from init->process total time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }
}
