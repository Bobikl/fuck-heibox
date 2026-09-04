package com.eclipsesource.v8.debug;

/* JADX INFO: loaded from: classes6.dex */
public enum StepAction {
    STEP_OUT(0),
    STEP_NEXT(1),
    STEP_IN(2),
    STEP_FRAME(3);

    int index;

    StepAction(int i10) {
        this.index = i10;
    }
}
