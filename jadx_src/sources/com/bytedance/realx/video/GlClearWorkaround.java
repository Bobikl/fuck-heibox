package com.bytedance.realx.video;

import android.opengl.GLES20;
import android.os.Build;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class GlClearWorkaround {
    private static final String DEFAULT_FRAGMENT_SHADER_STRING = "#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform vec4 u_clear_color;\nvoid main(void) {\n  gl_FragColor = u_clear_color;\n}\n";
    private static final String DEFAULT_VERTEX_SHADER_STRING = "#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform float u_clear_depth;\nattribute vec4 a_position;\nvoid main(void) {\n  gl_Position = vec4(a_position.x, a_position.y, u_clear_depth, 1.0);\n}\n";
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private GlShader currentShader;
    private boolean mHasInit = false;

    public enum WORKAROUND_STATUS {
        kStatusUnknown,
        kStatusEnable,
        kStatusDisable
    }

    private GlShader createShader() {
        return new GlShader(DEFAULT_VERTEX_SHADER_STRING, DEFAULT_FRAGMENT_SHADER_STRING);
    }

    public static WORKAROUND_STATUS isNeedWorkaround() {
        if (Build.VERSION.SDK_INT >= 26) {
            return WORKAROUND_STATUS.kStatusDisable;
        }
        String lowerCase = GLES20.glGetString(bb.c.k.L0).toLowerCase();
        return (lowerCase.contains("mali") || lowerCase.contains("arm")) ? WORKAROUND_STATUS.kStatusEnable : WORKAROUND_STATUS.kStatusDisable;
    }

    private void prepareShader() {
        GlShader glShaderCreateShader = createShader();
        this.currentShader = glShaderCreateShader;
        glShaderCreateShader.useProgram();
        GlUtil.checkNoGLES2Error("Create shader");
        int attribLocation = glShaderCreateShader.getAttribLocation("a_position");
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, 2, bb.c.f.f32240ed, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public synchronized void clear(int i10, int i11, int i12, float f10, float f11, float f12, float f13, float f14, int i13) {
        if (this.mHasInit) {
            if (this.currentShader == null) {
                prepareShader();
            }
            this.currentShader.useProgram();
            GLES20.glUniform1f(this.currentShader.getUniformLocation("u_clear_depth"), f14);
            GLES20.glUniform4f(this.currentShader.getUniformLocation("u_clear_color"), f10, f11, f12, f13);
            if ((i12 & 16384) == 0) {
                GLES20.glColorMask(false, false, false, false);
            }
            GlUtil.checkNoGLES2Error("before depth test");
            if ((i12 & 256) != 0) {
                GLES20.glEnable(bb.c.d.f31489qg);
                GLES20.glDepthFunc(bb.c.b.Z6);
            } else {
                GLES20.glDisable(bb.c.d.f31489qg);
                GLES20.glDepthFunc(512);
            }
            GlUtil.checkNoGLES2Error("before stencil test");
            if ((i12 & 1024) != 0) {
                GLES20.glEnable(bb.c.d.Vg);
                GLES20.glStencilFunc(bb.c.b.Z6, i13, 255);
                GLES20.glStencilOp(bb.c.i.W0, bb.c.i.W0, bb.c.i.X0);
            } else {
                GLES20.glDisable(bb.c.d.Vg);
                GLES20.glStencilOp(bb.c.i.W0, bb.c.i.W0, bb.c.i.W0);
                GLES20.glStencilMask(0);
            }
            GlUtil.checkNoGLES2Error("before clear workaround");
            GLES20.glDisable(bb.c.d.f31642xf);
            GLES20.glDisable(bb.c.d.f31689zi);
            GLES20.glDisable(32823);
            GLES20.glViewport(0, 0, i10, i11);
            GLES20.glDrawArrays(5, 0, 4);
            GlUtil.checkNoGLES2Error("after clear workaround");
        }
    }

    public synchronized void init() {
        this.mHasInit = true;
    }

    public synchronized void release() {
        this.mHasInit = false;
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
        }
    }
}
