package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.algorithm.TGFrame;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerFaceInfo extends ToygerBiometricInfo<ToygerFaceAttr> {
    public ToygerFaceInfo() {
    }

    public ToygerFaceInfo(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr) {
        this.frame = tGFrame;
        this.attr = toygerFaceAttr;
    }
}
