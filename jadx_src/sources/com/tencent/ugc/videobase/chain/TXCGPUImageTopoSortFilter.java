package com.tencent.ugc.videobase.chain;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.lang.reflect.Array;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TXCGPUImageTopoSortFilter extends TXCGPUImageFilter {
    private static final String INPUT_TEXTURE_NAME_FOR_ON_DRAW = "input-texture-name-for-on-draw";
    private Node mFinalNode;
    private final Map<Node, Integer> mIndicesMap;
    private final Node mInitNode;
    private FloatBuffer mInputCubeCoordsBuffer;
    private FloatBuffer mInputTextureCoordsBuffer;
    private int mInputTextureId;
    private final List<Node> mNodes;
    private final FloatBuffer mNormalCubeVerticesBuffer;
    private final FloatBuffer mNormalTextureCoordsBuffer;
    private GLTexture mOutputTexture;
    private int[] mUsedCountOneDraw;

    public static class Node {
        private int countAsInput;
        private final TXCGPUImageFilter filter;
        private GLTexture glTexture;
        private final Map<String, Node> inputNodeMap;

        private Node(TXCGPUImageFilter tXCGPUImageFilter) {
            this.inputNodeMap = new HashMap();
            this.glTexture = null;
            this.countAsInput = 0;
            this.filter = tXCGPUImageFilter;
        }

        public void addExtraInput(String str, Node node) {
            node.countAsInput++;
            this.inputNodeMap.put(str, node);
        }

        public void setInputForOnDraw(Node node) {
            node.countAsInput++;
            this.inputNodeMap.put(TXCGPUImageTopoSortFilter.INPUT_TEXTURE_NAME_FOR_ON_DRAW, node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TXCGPUImageTopoSortFilter() {
        ArrayList arrayList = new ArrayList();
        this.mNodes = arrayList;
        this.mIndicesMap = new HashMap();
        this.mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
        this.mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(l.NORMAL, false, false);
        Node node = new Node(null);
        this.mInitNode = node;
        arrayList.add(node);
    }

    private void doReverseDraw(Node node) {
        for (Node node2 : node.inputNodeMap.values()) {
            if (node2 != this.mInitNode && node2.glTexture == null) {
                doReverseDraw(node2);
            }
        }
        if (node.filter instanceof TXCGPUImageMultipleInputFilter) {
            TXCGPUImageMultipleInputFilter tXCGPUImageMultipleInputFilter = (TXCGPUImageMultipleInputFilter) node.filter;
            for (Map.Entry entry : node.inputNodeMap.entrySet()) {
                if (!INPUT_TEXTURE_NAME_FOR_ON_DRAW.equals(entry.getKey())) {
                    if (entry.getValue() == this.mInitNode) {
                        tXCGPUImageMultipleInputFilter.setInputTexture((String) entry.getKey(), this.mInputTextureId);
                    } else {
                        tXCGPUImageMultipleInputFilter.setInputTexture((String) entry.getKey(), ((Node) entry.getValue()).glTexture.getId());
                    }
                }
            }
        }
        GLTexture gLTexture = this.mOutputTexture;
        Size size = this.mOutputSize;
        int i10 = size.width;
        int i11 = size.height;
        if (node != this.mFinalNode) {
            i10 = node.filter.getOutputSize().width;
            i11 = node.filter.getOutputSize().height;
            node.glTexture = this.mTexturePool.obtain(i10, i11);
            gLTexture = node.glTexture;
        }
        Node node3 = (Node) node.inputNodeMap.get(INPUT_TEXTURE_NAME_FOR_ON_DRAW);
        GLES20.glViewport(0, 0, i10, i11);
        if (node3 == this.mInitNode) {
            node.filter.onDraw(this.mInputTextureId, gLTexture, this.mInputCubeCoordsBuffer, this.mInputTextureCoordsBuffer);
        } else {
            node.filter.onDraw(node3.glTexture.getId(), gLTexture, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        }
        for (Node node4 : node.inputNodeMap.values()) {
            int iIntValue = this.mIndicesMap.get(node4).intValue();
            int[] iArr = this.mUsedCountOneDraw;
            iArr[iIntValue] = iArr[iIntValue] + 1;
            if (node4.glTexture != null && this.mUsedCountOneDraw[iIntValue] == node4.countAsInput) {
                node4.glTexture.release();
                node4.glTexture = null;
            }
        }
    }

    private Node findFinalNode() {
        int size = this.mNodes.size();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, size, size);
        for (int i11 = 0; i11 < this.mNodes.size(); i11++) {
            Arrays.fill(zArr[i11], false);
        }
        for (Node node : this.mNodes) {
            int iIntValue = this.mIndicesMap.get(node).intValue();
            Iterator it = node.inputNodeMap.values().iterator();
            while (it.hasNext()) {
                zArr[this.mIndicesMap.get((Node) it.next()).intValue()][iIntValue] = true;
            }
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        ArrayList arrayList2 = new ArrayList();
        while (arrayList.size() > 1) {
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            arrayList2.clear();
            for (int i12 = 0; i12 < size; i12++) {
                for (int i13 = 0; i13 < size; i13++) {
                    if (zArr[i12][i13]) {
                        iArr2[i12] = iArr2[i12] + 1;
                        iArr[i13] = iArr[i13] + 1;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Integer) it2.next()).intValue();
                if (iArr[iIntValue2] == 0 && iArr2[iIntValue2] != 0) {
                    arrayList2.add(Integer.valueOf(iIntValue2));
                }
            }
            if (arrayList2.isEmpty()) {
                break;
            }
            arrayList.removeAll(arrayList2);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Arrays.fill(zArr[((Integer) it3.next()).intValue()], false);
            }
        }
        if (arrayList.size() == 1) {
            return this.mNodes.get(((Integer) arrayList.get(0)).intValue());
        }
        return null;
    }

    protected Node createNodeFromFilter(TXCGPUImageFilter tXCGPUImageFilter) {
        Node node = new Node(tXCGPUImageFilter);
        this.mNodes.add(node);
        return node;
    }

    protected Node getInitNode() {
        return this.mInitNode;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (isInitialized()) {
            runPendingOnDrawTasks();
            this.mInputTextureId = i10;
            this.mOutputTexture = gLTexture;
            this.mInputCubeCoordsBuffer = floatBuffer;
            this.mInputTextureCoordsBuffer = floatBuffer2;
            Arrays.fill(this.mUsedCountOneDraw, 0);
            doReverseDraw(this.mFinalNode);
            Iterator<Node> it = this.mNodes.iterator();
            while (it.hasNext()) {
                GLTexture unused = it.next().glTexture;
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    protected void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        for (Node node : this.mNodes) {
            if (node.filter != null) {
                node.filter.initialize(gLTexturePool);
            }
        }
        for (int i10 = 0; i10 < this.mNodes.size(); i10++) {
            this.mIndicesMap.put(this.mNodes.get(i10), Integer.valueOf(i10));
        }
        Node nodeFindFinalNode = findFinalNode();
        this.mFinalNode = nodeFindFinalNode;
        if (nodeFindFinalNode == null) {
            throw new RuntimeException("Directed acyclic graph can't find a final node.");
        }
        this.mUsedCountOneDraw = new int[this.mNodes.size()];
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i10, int i11) {
        super.onOutputSizeChanged(i10, i11);
        for (Node node : this.mNodes) {
            if (node.filter != null) {
                node.filter.onOutputSizeChanged(i10, i11);
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    protected void onUninit() {
        super.onUninit();
        for (Node node : this.mNodes) {
            if (node.filter != null) {
                node.filter.uninitialize();
            }
        }
    }
}
