package com.tencent.ugc.videobase.chain;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TXCGPUImageMultipleInputFilter extends TXCGPUImageFilter {
    public static final String SECOND_INPUT_SAMPLE2D_NAME = "inputImageTexture2";
    public static final String THIRD_INPUT_SAMPLE2D_NAME = "inputImageTexture3";
    private final Map<String, Integer> mInputUniforms;
    private final Map<String, Integer> mTexturesOnNextDraw;

    public TXCGPUImageMultipleInputFilter(String str, String str2) {
        super(str, str2);
        this.mTexturesOnNextDraw = new HashMap();
        this.mInputUniforms = new HashMap();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    protected void afterDrawArrays() {
        super.afterDrawArrays();
        int baseInputTextureUnit = getBaseInputTextureUnit();
        Iterator<Map.Entry<String, Integer>> it = this.mTexturesOnNextDraw.entrySet().iterator();
        while (it.hasNext()) {
            it.next();
            GLES20.glActiveTexture(baseInputTextureUnit);
            OpenGlUtils.bindTexture(getTarget(), 0);
            baseInputTextureUnit++;
        }
        this.mTexturesOnNextDraw.clear();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    protected void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        int baseInputTextureUnit = getBaseInputTextureUnit();
        for (Map.Entry<String, Integer> entry : this.mTexturesOnNextDraw.entrySet()) {
            Integer numValueOf = this.mInputUniforms.get(entry.getKey());
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(GLES20.glGetUniformLocation(getProgramId(), entry.getKey()));
                this.mInputUniforms.put(entry.getKey(), numValueOf);
            }
            GLES20.glActiveTexture(baseInputTextureUnit);
            OpenGlUtils.bindTexture(getTarget(), entry.getValue().intValue());
            GLES20.glUniform1i(numValueOf.intValue(), baseInputTextureUnit - 33984);
            baseInputTextureUnit++;
        }
    }

    protected int getBaseInputTextureUnit() {
        return 33985;
    }

    public void setInputTexture(String str, int i10) {
        this.mTexturesOnNextDraw.put(str, Integer.valueOf(i10));
    }
}
