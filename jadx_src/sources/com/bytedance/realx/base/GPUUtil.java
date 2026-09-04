package com.bytedance.realx.base;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.w0;
import bb.c;

/* JADX INFO: loaded from: classes6.dex */
public class GPUUtil {
    private static String glRenderer = "unknown";
    private static String glVendor = "unknown";
    private static boolean initialized = false;

    /* JADX WARN: Code duplicated, block: B:101:0x0180  */
    /* JADX WARN: Code duplicated, block: B:107:0x018b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0194  */
    /* JADX WARN: Code duplicated, block: B:113:0x019d  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x001d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0165  */
    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0177  */
    @w0(api = 17)
    private static void Initialize() throws Throwable {
        boolean z10;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        EGLContext eGLContextEglGetCurrentContext;
        initialized = true;
        try {
            eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (eGLContextEglGetCurrentContext != null) {
                try {
                    if (eGLContextEglGetCurrentContext == EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (Exception e10) {
                    e = e10;
                    z10 = false;
                    eGLDisplay = null;
                    eGLSurface = null;
                    Log.e("gpm", e.toString());
                    if (!z10) {
                        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContextEglGetCurrentContext != null) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                        }
                        if (eGLDisplay != null) {
                        } else {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                    eGLDisplay = null;
                    eGLSurface = null;
                    if (z10) {
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContextEglGetCurrentContext != null) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                        }
                        if (eGLDisplay != null) {
                            EGL14.eglTerminate(eGLDisplay);
                        }
                    }
                    throw th;
                }
            } else {
                z10 = true;
            }
            if (z10) {
                try {
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    if (eGLDisplayEglGetDisplay != null) {
                        try {
                            if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                                int[] iArr = new int[2];
                                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                                    throw new Exception("eglInitialize error");
                                }
                                int[] iArr2 = new int[1];
                                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                                if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{c.m.Ql, 8, c.m.Pl, 8, c.m.Ol, 8, c.m.Nl, 8, c.m.sm, 4, c.m.fm, 1, c.m.km}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                                    throw new Exception("eglChooseConfig error");
                                }
                                if (iArr2[0] <= 0) {
                                    throw new Exception("no egl config chosen");
                                }
                                EGLConfig eGLConfig = eGLConfigArr[0];
                                eGLContextEglGetCurrentContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{c.m.co, 2, c.m.km}, 0);
                                if (eGLContextEglGetCurrentContext == null || eGLContextEglGetCurrentContext == EGL14.EGL_NO_CONTEXT) {
                                    throw new Exception("eglCreateContext error");
                                }
                                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{c.m.Pm, 1, c.m.Om, 1, c.m.km}, 0);
                                if (eGLSurfaceEglCreatePbufferSurface != null) {
                                    try {
                                        if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                                            if (!EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglGetCurrentContext)) {
                                                throw new Exception("eglMakeCurrent error");
                                            }
                                            eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                                            eGLDisplay = eGLDisplayEglGetDisplay;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                                        eGLDisplay = eGLDisplayEglGetDisplay;
                                        Log.e("gpm", e.toString());
                                        if (!z10) {
                                            EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                                            if (eGLSurface != null) {
                                                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                            }
                                            if (eGLContextEglGetCurrentContext != null) {
                                                EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                                            }
                                            if (eGLDisplay != null) {
                                            } else {
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                                        eGLDisplay = eGLDisplayEglGetDisplay;
                                        if (z10) {
                                            EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
                                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface5, eGLSurface5, EGL14.EGL_NO_CONTEXT);
                                            if (eGLSurface != null) {
                                                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                            }
                                            if (eGLContextEglGetCurrentContext != null) {
                                                EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                                            }
                                            if (eGLDisplay != null) {
                                                EGL14.eglTerminate(eGLDisplay);
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                throw new Exception("eglCreatePbufferSurface error");
                            }
                        } catch (Exception e12) {
                            e = e12;
                            eGLDisplay = eGLDisplayEglGetDisplay;
                            eGLSurface = null;
                            Log.e("gpm", e.toString());
                            if (!z10) {
                                EGLSurface eGLSurface6 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface6, eGLSurface6, EGL14.EGL_NO_CONTEXT);
                                if (eGLSurface != null) {
                                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                }
                                if (eGLContextEglGetCurrentContext != null) {
                                    EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                                }
                                if (eGLDisplay != null) {
                                } else {
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            eGLDisplay = eGLDisplayEglGetDisplay;
                            eGLSurface = null;
                            if (z10) {
                                EGLSurface eGLSurface7 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface7, eGLSurface7, EGL14.EGL_NO_CONTEXT);
                                if (eGLSurface != null) {
                                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                }
                                if (eGLContextEglGetCurrentContext != null) {
                                    EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                                }
                                if (eGLDisplay != null) {
                                    EGL14.eglTerminate(eGLDisplay);
                                }
                            }
                            throw th;
                        }
                    }
                    throw new Exception("eglGetDisplay error");
                } catch (Exception e13) {
                    e = e13;
                    eGLDisplay = null;
                    eGLSurface = null;
                    Log.e("gpm", e.toString());
                    if (!z10) {
                        EGLSurface eGLSurface8 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface8, eGLSurface8, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContextEglGetCurrentContext != null) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                        }
                        if (eGLDisplay != null) {
                        } else {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    eGLDisplay = null;
                    eGLSurface = null;
                    if (z10) {
                        EGLSurface eGLSurface9 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface9, eGLSurface9, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContextEglGetCurrentContext != null) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                        }
                        if (eGLDisplay != null) {
                            EGL14.eglTerminate(eGLDisplay);
                        }
                    }
                    throw th;
                }
            }
            eGLDisplay = null;
            eGLSurface = null;
            try {
                try {
                    glVendor = GLES20.glGetString(c.k.L0);
                    glRenderer = GLES20.glGetString(c.k.M0);
                    if (z10) {
                        EGLSurface eGLSurface10 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface10, eGLSurface10, EGL14.EGL_NO_CONTEXT);
                        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                        }
                        if (eGLContextEglGetCurrentContext != null && eGLContextEglGetCurrentContext != EGL14.EGL_NO_CONTEXT) {
                            EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                        }
                        if (eGLDisplay == null || eGLDisplay == EGL14.EGL_NO_DISPLAY) {
                            return;
                        }
                        EGL14.eglTerminate(eGLDisplay);
                    }
                } catch (Exception e14) {
                    e = e14;
                    Log.e("gpm", e.toString());
                    if (!z10) {
                        return;
                    }
                    EGLSurface eGLSurface11 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface11, eGLSurface11, EGL14.EGL_NO_CONTEXT);
                    if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    }
                    if (eGLContextEglGetCurrentContext != null && eGLContextEglGetCurrentContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                    }
                    if (eGLDisplay != null || eGLDisplay == EGL14.EGL_NO_DISPLAY) {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                if (z10) {
                    EGLSurface eGLSurface12 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface12, eGLSurface12, EGL14.EGL_NO_CONTEXT);
                    if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    }
                    if (eGLContextEglGetCurrentContext != null && eGLContextEglGetCurrentContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplay, eGLContextEglGetCurrentContext);
                    }
                    if (eGLDisplay != null && eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGL14.eglTerminate(eGLDisplay);
                    }
                }
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            z10 = false;
            eGLDisplay = null;
            eGLSurface = null;
            eGLContextEglGetCurrentContext = null;
        } catch (Throwable th7) {
            th = th7;
            z10 = false;
            eGLDisplay = null;
            eGLSurface = null;
            eGLContextEglGetCurrentContext = null;
        }
    }

    @w0(api = 22)
    public static String getGPURenderer() throws Throwable {
        if (!initialized) {
            Initialize();
        }
        return glRenderer;
    }

    public static String getGPURendererFallback() {
        return glRenderer;
    }
}
