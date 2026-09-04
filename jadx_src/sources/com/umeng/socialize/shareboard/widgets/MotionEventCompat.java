package com.umeng.socialize.shareboard.widgets;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public class MotionEventCompat {
    static final int ACTION_MASK = 255;
    static final int ACTION_POINTER_DOWN = 5;
    static final int ACTION_POINTER_INDEX_MASK = 65280;
    static final int ACTION_POINTER_INDEX_SHIFT = 8;
    static final int ACTION_POINTER_UP = 6;

    MotionEventCompat() {
    }

    static int getActionIndex(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }
}
