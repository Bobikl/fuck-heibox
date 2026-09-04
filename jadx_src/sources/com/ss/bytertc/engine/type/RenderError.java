package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum RenderError {
    RENDER_ERROR_OK(0),
    RENDER_ERROR_USING_INTERNAL_SURFACE(-1),
    RENDER_ERROR_USING_SOFTWARE_DECODER(-2);

    private int value;

    RenderError(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static RenderError fromId(int i10) {
        for (RenderError renderError : values()) {
            if (renderError.value() == i10) {
                return renderError;
            }
        }
        return RENDER_ERROR_OK;
    }

    public int value() {
        return this.value;
    }
}
