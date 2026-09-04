package com.tencent.thumbplayer.tcmedia.api.connection;

import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.core.connection.TPNativePlayerConnectionNode;

/* JADX INFO: loaded from: classes4.dex */
public class TPPlayerConnectionNode {
    private TPNativePlayerConnectionNode nativeNode = new TPNativePlayerConnectionNode();

    public boolean addAction(@TPPlayerConnectionConstant.Action int i10) {
        return this.nativeNode.addAction(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapConnectionAction.class, i10));
    }

    public TPNativePlayerConnectionNode getNativeNode() {
        return this.nativeNode;
    }

    public void removeAction(@TPPlayerConnectionConstant.Action int i10) {
        this.nativeNode.removeAction(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapConnectionAction.class, i10));
    }

    public boolean setLongActionConfig(@TPPlayerConnectionConstant.Action int i10, int i11, long j10) {
        return this.nativeNode.setLongActionConfig(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapConnectionAction.class, i10), TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapConnectionConfig.class, i11), j10);
    }
}
