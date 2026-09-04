package com.tencent.thumbplayer.tcmedia.core.connection;

import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayer;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativePlayerConnectionMgr {
    private boolean mIsLibLoaded;
    private boolean mInited = false;
    private long mNativeContext = 0;

    public TPNativePlayerConnectionMgr() {
        this.mIsLibLoaded = false;
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            this.mIsLibLoaded = true;
        } catch (UnsupportedOperationException e10) {
            e10.printStackTrace();
            this.mIsLibLoaded = false;
        }
    }

    private native int _activeAllConnections();

    private native int _activeConnection(int i10);

    private native int _addConnection(Object obj, Object obj2, Object obj3, Object obj4);

    private native int _addConnectionWithAddr(long j10, Object obj, long j11, Object obj2);

    private native void _deactiveAllConnections();

    private native void _deactiveConnection(int i10);

    private native void _init();

    private native void _removeConnection(int i10);

    private native void _unInit();

    public int activeAllConnections() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _activeAllConnections();
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int activeConnection(int i10) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _activeConnection(i10);
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int addConnection(long j10, TPNativePlayerConnectionNode tPNativePlayerConnectionNode, long j11, TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _addConnectionWithAddr(j10, tPNativePlayerConnectionNode, j11, tPNativePlayerConnectionNode2);
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int addConnection(TPNativePlayer tPNativePlayer, TPNativePlayerConnectionNode tPNativePlayerConnectionNode, TPNativePlayer tPNativePlayer2, TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _addConnection(tPNativePlayer, tPNativePlayerConnectionNode, tPNativePlayer2, tPNativePlayerConnectionNode2);
        }
        throw new IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public void deactiveAllConnections() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _deactiveAllConnections();
    }

    public void deactiveConnection(int i10) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _deactiveConnection(i10);
    }

    public void init() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            throw new IllegalStateException("Failed to init due to invalid state.");
        }
        this.mInited = true;
        _init();
    }

    public void removeConnection(int i10) {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _removeConnection(i10);
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            this.mInited = false;
            _unInit();
        }
    }
}
