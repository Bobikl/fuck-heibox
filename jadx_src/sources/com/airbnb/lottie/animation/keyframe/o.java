package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* JADX INFO: compiled from: TextKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class o extends g<DocumentData> {
    public o(List<com.airbnb.lottie.value.a<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public DocumentData i(com.airbnb.lottie.value.a<DocumentData> aVar, float f10) {
        DocumentData documentData;
        return (f10 != 1.0f || (documentData = aVar.f37855c) == null) ? aVar.f37854b : documentData;
    }
}
