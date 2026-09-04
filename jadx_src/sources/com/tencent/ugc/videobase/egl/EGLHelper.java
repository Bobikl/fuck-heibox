package com.tencent.ugc.videobase.egl;

import com.tencent.liteav.base.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public interface EGLHelper<T> {
    void destroy() throws EGLException;

    void destroySurface() throws EGLException;

    T getContext();

    Size getSurfaceSize();

    void makeCurrent() throws EGLException;

    void swapBuffers() throws EGLException;

    void unmakeCurrent();

    void updateSurface(Object obj) throws EGLException;
}
