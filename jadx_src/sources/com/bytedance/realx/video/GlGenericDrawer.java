package com.bytedance.realx.video;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class GlGenericDrawer implements RendererCommon.GlDrawer {
    private static final String DEFAULT_VERTEX_SHADER_STRING = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private static final String INPUT_TEXTURE_COORDINATE_NAME = "in_tc";
    private static final String INPUT_VERTEX_COORDINATE_NAME = "in_pos";
    private static final String ORI_TEX_SIZE_NAME = "ori_tex_size";
    private static final String TAR_TEX_SIZE_NAME = "tar_tex_size";
    private static final String TEXTURE_MATRIX_NAME = "tex_mat";

    @p0
    private FilterType currentScaleFilter;

    @p0
    private GlShader currentShader;

    @p0
    private ShaderType currentShaderType;
    private final String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private int oriTexSizeLocation;
    private final ShaderCallbacks shaderCallbacks;
    private int tarTexSizeLocation;
    private int texMatrixLocation;
    private final String vertexShader;

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i10, int i11, int i12, int i13);
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this(DEFAULT_VERTEX_SHADER_STRING, str, shaderCallbacks);
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }

    static String createFragmentShaderString(String str, ShaderType shaderType, FilterType filterType) {
        StringBuilder sb2 = new StringBuilder();
        ShaderType shaderType2 = ShaderType.OES;
        if (shaderType == shaderType2) {
            sb2.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb2.append("precision mediump float;\n");
        sb2.append("varying vec2 tc;\n");
        if (filterType != FilterType.Origin) {
            sb2.append("uniform vec2 tar_tex_size;\n");
            sb2.append("uniform vec2 ori_tex_size;\n");
        }
        if (shaderType == ShaderType.YUV) {
            sb2.append("uniform sampler2D y_tex;\n");
            sb2.append("uniform sampler2D u_tex;\n");
            sb2.append("uniform sampler2D v_tex;\n");
            if (filterType == FilterType.Bilinear) {
                sb2.append("float bilinearTextureSample(sampler2D tex, vec2 p) {\n");
                sb2.append("        vec2 c_onePixel =  vec2(1.0 / ori_tex_size.y - tar_tex_size.x + tar_tex_size.x, 1.0 / ori_tex_size.y);\n");
                sb2.append("    vec2 frac = vec2(0.5, 0.5);\n");
                sb2.append("    float C11 = texture2D(tex, p - c_onePixel).r;\n");
                sb2.append("    float C21 = texture2D(tex, p + vec2( c_onePixel.x , -c_onePixel.y)).r;\n");
                sb2.append("    float C12 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).r;\n");
                sb2.append("    float C22 = texture2D(tex, p + c_onePixel).r;\n");
                sb2.append("    float x1 = mix(C11, C21, frac.x);\n");
                sb2.append("    float x2 = mix(C12, C22, frac.x);\n");
                sb2.append("    return mix(x1, x2, frac.y);\n");
                sb2.append("}\n");
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("  float y = bilinearTextureSample(y_tex, p) * 1.16438;\n");
                sb2.append("  float u = bilinearTextureSample(u_tex, p);\n");
                sb2.append("  float v = bilinearTextureSample(v_tex, p);\n");
                sb2.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
                sb2.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
                sb2.append("    y + 2.01723 * u - 1.08563, 1);\n");
                sb2.append("}\n");
            } else if (filterType == FilterType.Bicubic) {
                sb2.append("vec3 cubic_hermite (vec3 A, vec3 B, vec3 C, vec3 D, float t) {\n");
                sb2.append("\t  float t2 = t*t;\n");
                sb2.append("    float t3 = t*t*t;\n");
                sb2.append("    vec3 a = -A/2.0 + (3.0*B)/2.0 - (3.0*C)/2.0 + D/2.0;\n");
                sb2.append("    vec3 b = A - (5.0*B)/2.0 + 2.0*C - D / 2.0;\n");
                sb2.append("    vec3 c = -A/2.0 + C/2.0;\n");
                sb2.append("   \tvec3 d = B;\n");
                sb2.append("    return a*t3 + b*t2 + c*t + d;\n");
                sb2.append("}\n");
                sb2.append("vec4 bicubic_sample (sampler2D tex, , vec2 P) {\n");
                sb2.append("    float c_onePixel_x = 1.0 / ori_tex_size.x - tar_tex_size.x + tar_tex_size.x;\n");
                sb2.append("    float c_onePixel_y = 1.0 / ori_tex_size.y;\n");
                sb2.append("    float c_twoPixels_x = 2.0 / ori_tex_size.x;\n");
                sb2.append("    float c_twoPixels_y = 2.0 / ori_tex_size.y;\n");
                sb2.append("    vec2 pixel = vec2(P.x * ori_tex_size.x, P.y * ori_tex_size.y) + 0.5;\n");
                sb2.append("    vec2 frac = fract(pixel);\n");
                sb2.append("    pixel = floor(pixel);\n");
                sb2.append("    pixel = vec2(pixel.x / ori_tex_size.x, pixel.y / ori_tex_size.y) - vec2(c_onePixel_x, c_onePixel_y) / 2.0;\n");
                sb2.append("    vec3 C00 = texture2D(tex, pixel + vec2(-c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C10 = texture2D(tex, pixel + vec2( 0.0        ,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C20 = texture2D(tex, pixel + vec2( c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C30 = texture2D(tex, pixel + vec2( c_twoPixels_x,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C01 = texture2D(tex, pixel + vec2(-c_onePixel_x , 0.0)).rgb;\n");
                sb2.append("    vec3 C11 = texture2D(tex, pixel + vec2( 0.0        , 0.0)).rgb;\n");
                sb2.append("    vec3 C21 = texture2D(tex, pixel + vec2( c_onePixel_x , 0.0)).rgb;\n");
                sb2.append("    vec3 C31 = texture2D(tex, pixel + vec2( c_twoPixels_x, 0.0)).rgb;\n");
                sb2.append("    vec3 C02 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C12 = texture2D(tex, pixel + vec2( 0.0        , c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C22 = texture2D(tex, pixel + vec2( c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C32 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C03 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb2.append("    vec3 C13 = texture2D(tex, pixel + vec2( 0.0        , c_twoPixels_y)).rgb;\n");
                sb2.append("    vec3 C23 = texture2D(tex, pixel + vec2( c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb2.append("    vec3 C33 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_twoPixels_y)).rgb;  \n");
                sb2.append("    vec3 CP0X = cubic_hermite(C00, C10, C20, C30, frac.x);\n");
                sb2.append("    vec3 CP1X = cubic_hermite(C01, C11, C21, C31, frac.x);\n");
                sb2.append("    vec3 CP2X = cubic_hermite(C02, C12, C22, C32, frac.x);\n");
                sb2.append("    vec3 CP3X = cubic_hermite(C03, C13, C23, C33, frac.x);\n");
                sb2.append("    return vec4(cubic_hermite(CP0X, CP1X, CP2X, CP3X, frac.y), 1.0);");
                sb2.append("}\n");
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("  float y = bicubic_sample(y_tex, p) * 1.16438;\n");
                sb2.append("  float u = bicubic_sample(u_tex, p);\n");
                sb2.append("  float v = bicubic_sample(v_tex, p);\n");
                sb2.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
                sb2.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
                sb2.append("    y + 2.01723 * u - 1.08563, 1);\n");
                sb2.append("}\n");
            } else if (filterType == FilterType.BOX) {
                sb2.append("float box_filter(sampler2D tex, vec2 p) {\n");
                sb2.append("  vec2 c_onePixel =  1.0 / ori_tex_size;\n");
                sb2.append("  float C11, C12, C13, C21, C22, C23, C31, C32, C33;\n");
                sb2.append("  C11 = texture2D(tex, p - c_onePixel).r;\n");
                sb2.append("  C12 = texture2D(tex, p + vec2( 0, -c_onePixel.y)).r;\n");
                sb2.append("  C13 = texture2D(tex, p + vec2( c_onePixel.x, -c_onePixel.y)).r;\n");
                sb2.append("  C21 = texture2D(tex, p + vec2( -c_onePixel.x , 0)).r;\n");
                sb2.append("  C22 = texture2D(tex, p).r;\n");
                sb2.append("  C23 = texture2D(tex, p + vec2( c_onePixel.x , 0)).r;\n");
                sb2.append("  C31 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).r;\n");
                sb2.append("  C32 = texture2D(tex, p + vec2( 0 , c_onePixel.y)).r;\n");
                sb2.append("  C33 = texture2D(tex, p + c_onePixel).r;\n");
                sb2.append("  return (C11 + C12 + C13 + C21 + C22 + C23 + C31 + C32 + C33) / 9.0;\n");
                sb2.append("}\n");
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("  float y = box_filter(y_tex, p) * 1.16438;\n");
                sb2.append("  float u = box_filter(u_tex, p);\n");
                sb2.append("  float v = box_filter(v_tex, p);\n");
                sb2.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
                sb2.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
                sb2.append("    y + 2.01723 * u - 1.08563, 1);\n");
                sb2.append("}\n");
            } else {
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("  float y = texture2D(y_tex, p).r * 1.16438;\n");
                sb2.append("  float u = texture2D(u_tex, p).r;\n");
                sb2.append("  float v = texture2D(v_tex, p).r;\n");
                sb2.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
                sb2.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
                sb2.append("    y + 2.01723 * u - 1.08563, 1);\n");
                sb2.append("}\n");
            }
            sb2.append(str);
        } else {
            String str2 = shaderType == shaderType2 ? "samplerExternalOES" : "sampler2D";
            sb2.append("uniform ");
            sb2.append(str2);
            sb2.append(" tex;\n");
            if (filterType == FilterType.Bilinear) {
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("    vec2 c_onePixel =  vec2(1.0 / ori_tex_size.y - tar_tex_size.x + tar_tex_size.x, 1.0 / ori_tex_size.y);\n");
                sb2.append("    vec2 frac = vec2(0.5, 0.5);\n");
                sb2.append("    vec3 C11 = texture2D(tex, p - c_onePixel).rgb;\n");
                sb2.append("    vec3 C21 = texture2D(tex, p + vec2( c_onePixel.x , -c_onePixel.y)).rgb;\n");
                sb2.append("    vec3 C12 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).rgb;\n");
                sb2.append("    vec3 C22 = texture2D(tex, p + c_onePixel).rgb;\n");
                sb2.append("    vec3 x1 = mix(C11, C21, frac.x);\n");
                sb2.append("    vec3 x2 = mix(C12, C22, frac.x);\n");
                sb2.append("    return vec4(mix(x1, x2, frac.y), 1);\n");
                sb2.append("}\n");
                sb2.append(str);
            } else if (filterType == FilterType.Bicubic) {
                sb2.append("vec3 cubic_hermite (vec3 A, vec3 B, vec3 C, vec3 D, float t) {\n");
                sb2.append("\t  float t2 = t*t;\n");
                sb2.append("    float t3 = t*t*t;\n");
                sb2.append("    vec3 a = -A/2.0 + (3.0*B)/2.0 - (3.0*C)/2.0 + D/2.0;\n");
                sb2.append("    vec3 b = A - (5.0*B)/2.0 + 2.0*C - D / 2.0;\n");
                sb2.append("    vec3 c = -A/2.0 + C/2.0;\n");
                sb2.append("   \tvec3 d = B;\n");
                sb2.append("    return a*t3 + b*t2 + c*t + d;\n");
                sb2.append("}\n");
                sb2.append("vec4 sample (vec2 P) {\n");
                sb2.append("    float c_onePixel_x = 1.0 / ori_tex_size.x - tar_tex_size.x + tar_tex_size.x;\n");
                sb2.append("    float c_onePixel_y = 1.0 / ori_tex_size.y;\n");
                sb2.append("    float c_twoPixels_x = 2.0 / ori_tex_size.x;\n");
                sb2.append("    float c_twoPixels_y = 2.0 / ori_tex_size.y;\n");
                sb2.append("    vec2 pixel = vec2(P.x * ori_tex_size.x, P.y * ori_tex_size.y) + 0.5;\n");
                sb2.append("    vec2 frac = fract(pixel);\n");
                sb2.append("    pixel = floor(pixel);\n");
                sb2.append("    pixel = vec2(pixel.x / ori_tex_size.x, pixel.y / ori_tex_size.y) - vec2(c_onePixel_x, c_onePixel_y) / 2.0;\n");
                sb2.append("    vec3 C00 = texture2D(tex, pixel + vec2(-c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C10 = texture2D(tex, pixel + vec2( 0.0        ,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C20 = texture2D(tex, pixel + vec2( c_onePixel_x ,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C30 = texture2D(tex, pixel + vec2( c_twoPixels_x,-c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C01 = texture2D(tex, pixel + vec2(-c_onePixel_x , 0.0)).rgb;\n");
                sb2.append("    vec3 C11 = texture2D(tex, pixel + vec2( 0.0        , 0.0)).rgb;\n");
                sb2.append("    vec3 C21 = texture2D(tex, pixel + vec2( c_onePixel_x , 0.0)).rgb;\n");
                sb2.append("    vec3 C31 = texture2D(tex, pixel + vec2( c_twoPixels_x, 0.0)).rgb;\n");
                sb2.append("    vec3 C02 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C12 = texture2D(tex, pixel + vec2( 0.0        , c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C22 = texture2D(tex, pixel + vec2( c_onePixel_x , c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C32 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_onePixel_y)).rgb;\n");
                sb2.append("    vec3 C03 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb2.append("    vec3 C13 = texture2D(tex, pixel + vec2( 0.0        , c_twoPixels_y)).rgb;\n");
                sb2.append("    vec3 C23 = texture2D(tex, pixel + vec2( c_onePixel_x , c_twoPixels_y)).rgb;\n");
                sb2.append("    vec3 C33 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_twoPixels_y)).rgb;  \n");
                sb2.append("    vec3 CP0X = cubic_hermite(C00, C10, C20, C30, frac.x);\n");
                sb2.append("    vec3 CP1X = cubic_hermite(C01, C11, C21, C31, frac.x);\n");
                sb2.append("    vec3 CP2X = cubic_hermite(C02, C12, C22, C32, frac.x);\n");
                sb2.append("    vec3 CP3X = cubic_hermite(C03, C13, C23, C33, frac.x);\n");
                sb2.append("    return vec4(cubic_hermite(CP0X, CP1X, CP2X, CP3X, frac.y), 1.0);");
                sb2.append("}\n");
                sb2.append(str);
            } else if (filterType == FilterType.BOX) {
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("  vec2 c_onePixel =  1.0 / ori_tex_size;\n");
                sb2.append("  vec3 C11 = texture2D(tex, p - c_onePixel).rgb;\n");
                sb2.append("  vec3 C12 = texture2D(tex, p + vec2( 0, -c_onePixel.y)).rgb;\n");
                sb2.append("  vec3 C13 = texture2D(tex, p + vec2( c_onePixel.x, -c_onePixel.y)).rgb;\n");
                sb2.append("  vec3 C21 = texture2D(tex, p + vec2( -c_onePixel.x , 0)).rgb;\n");
                sb2.append("  vec3 C22 = texture2D(tex, p).rgb;\n");
                sb2.append("  vec3 C23 = texture2D(tex, p + vec2( c_onePixel.x , 0)).rgb;\n");
                sb2.append("  vec3 C31 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).rgb;\n");
                sb2.append("  vec3 C32 = texture2D(tex, p + vec2( 0 , c_onePixel.y)).rgb;\n");
                sb2.append("  vec3 C33 = texture2D(tex, p + c_onePixel).rgb;\n");
                sb2.append("  return vec4((C11 + C12 + C13 + C21 + C22 + C23 + C31 + C32 + C33) / 9.0, 1.0);\n");
                sb2.append("}\n");
                sb2.append(str);
            } else {
                sb2.append(str.replace("sample(", "texture2D(tex, "));
            }
        }
        return sb2.toString();
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i10, int i11, int i12, int i13, FilterType filterType, int i14, int i15) {
        FilterType filterType2;
        int i16;
        int i17;
        GlShader glShader;
        if (filterType == null || i14 == 0 || i15 == 0) {
            filterType2 = FilterType.Origin;
            i16 = 0;
            i17 = 0;
        } else {
            filterType2 = filterType;
            i16 = i14;
            i17 = i15;
        }
        if (shaderType.equals(this.currentShaderType) && filterType2.equals(this.currentScaleFilter)) {
            glShader = this.currentShader;
        } else {
            this.currentShaderType = shaderType;
            GlShader glShader2 = this.currentShader;
            if (glShader2 != null) {
                glShader2.release();
            }
            GlShader glShaderCreateShader = createShader(shaderType, filterType2);
            this.currentShader = glShaderCreateShader;
            this.currentScaleFilter = filterType2;
            glShaderCreateShader.useProgram();
            if (shaderType == ShaderType.YUV) {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("v_tex"), 2);
            } else {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("tex"), 0);
            }
            GlUtil.checkNoGLES2Error("Create shader");
            this.shaderCallbacks.onNewShader(glShaderCreateShader);
            this.texMatrixLocation = glShaderCreateShader.getUniformLocation(TEXTURE_MATRIX_NAME);
            this.inPosLocation = glShaderCreateShader.getAttribLocation(INPUT_VERTEX_COORDINATE_NAME);
            this.inTcLocation = glShaderCreateShader.getAttribLocation(INPUT_TEXTURE_COORDINATE_NAME);
            glShader = glShaderCreateShader;
        }
        FilterType filterType3 = FilterType.Origin;
        if (filterType2 != filterType3) {
            if (filterType2 != FilterType.BOX) {
                this.tarTexSizeLocation = glShader.getUniformLocation(TAR_TEX_SIZE_NAME);
            }
            this.oriTexSizeLocation = glShader.getUniformLocation(ORI_TEX_SIZE_NAME);
        }
        GlUtil.checkNoGLES2Error("before useProgram ");
        glShader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, bb.c.f.f32240ed, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        GLES20.glVertexAttribPointer(this.inTcLocation, 2, bb.c.f.f32240ed, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        if (filterType2 != filterType3 && i16 > 0 && i16 > 0) {
            int i18 = this.tarTexSizeLocation;
            if (i18 != 0) {
                GLES20.glUniform2f(i18, i10, i11);
            }
            int i19 = this.oriTexSizeLocation;
            if (i19 != 0) {
                GLES20.glUniform2f(i19, i16, i17);
            }
        }
        this.shaderCallbacks.onPrepareShader(glShader, fArr, i10, i11, i12, i13);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    GlShader createShader(ShaderType shaderType, FilterType filterType) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, shaderType, filterType));
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawOes(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        drawOes(i10, fArr, i11, i12, i13, i14, i15, i16, FilterType.Origin, 0, 0);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawOes(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, FilterType filterType, int i17, int i18) {
        prepareShader(ShaderType.OES, fArr, i11, i12, i15, i16, filterType, i17, i18);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            GLES20.glViewport(i13, i14, i15, i16);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            GlUtil.checkNoGLES2Error("drawOes done");
            return;
        }
        Log.e("GlGenericDrawer", "drawOes glBindTexture error: " + iGlGetError);
        RXLogging.e("GlGenericDrawer", "drawOes glBindTexture error: " + iGlGetError);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawRgb(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        drawRgb(i10, fArr, i11, i12, i13, i14, i15, i16, FilterType.Origin, 0, 0);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawRgb(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, FilterType filterType, int i17, int i18) {
        prepareShader(ShaderType.RGB, fArr, i11, i12, i15, i16, filterType, i17, i18);
        GlUtil.checkNoGLES2Error("after prepare shader");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(bb.c.e.F, i10);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            GLES20.glViewport(i13, i14, i15, i16);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(bb.c.e.F, 0);
            GlUtil.checkNoGLES2Error("drawRgb done");
            return;
        }
        Log.e("GlGenericDrawer", "drawRgb glBindTexture error: " + iGlGetError);
        RXLogging.e("GlGenericDrawer", "drawRgb glBindTexture error: " + iGlGetError);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        drawYuv(iArr, fArr, i10, i11, i12, i13, i14, i15, FilterType.Origin, 0, 0);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i10, int i11, int i12, int i13, int i14, int i15, FilterType filterType, int i16, int i17) {
        prepareShader(ShaderType.YUV, fArr, i10, i11, i14, i15, filterType, i16, i17);
        for (int i18 = 0; i18 < 3; i18++) {
            GLES20.glActiveTexture(33984 + i18);
            GLES20.glBindTexture(bb.c.e.F, iArr[i18]);
        }
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("GlGenericDrawer", "drawYuv glBindTexture error: " + iGlGetError);
            RXLogging.e("GlGenericDrawer", "drawYuv glBindTexture error: " + iGlGetError);
            return;
        }
        GLES20.glViewport(i12, i13, i14, i15);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i19 = 0; i19 < 3; i19++) {
            GLES20.glActiveTexture(i19 + 33984);
            GLES20.glBindTexture(bb.c.e.F, 0);
        }
        GlUtil.checkNoGLES2Error("drawYuv done");
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }
}
