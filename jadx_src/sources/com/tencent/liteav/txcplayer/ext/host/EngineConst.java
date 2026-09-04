package com.tencent.liteav.txcplayer.ext.host;

/* JADX INFO: loaded from: classes4.dex */
public class EngineConst {

    public interface ArgsKey {
        public static final String KEY_PARAM1 = "KEY_PARAM1";
        public static final String KEY_PARAM2 = "KEY_PARAM2";
        public static final String KEY_PARAM3 = "KEY_PARAM3";
        public static final String KEY_PARAM4 = "KEY_PARAM4";
    }

    public interface ArgsValue {
        public static final int MONET_MODULE_CSIG_SR = 1;
        public static final int MONET_MODULE_NONE = 0;
        public static final int MONET_MODULE_TME_SR = 2;
        public static final int MONET_MODULE_VR_BINOCULAR = 12;
        public static final int MONET_MODULE_VR_PANORAMA = 11;
    }

    public interface HostFunctionId {
        public static final int CHECK_FEATURE_AUTH = 3;
        public static final int GET_SDK_TYPE = 2;
        public static final int GET_VOD_LICENSE_FEATURE = 1;
    }

    public interface MonetPluginFunctionId {
        public static final int CONNECT_PLAYER = 100;
        public static final int IS_SUPPORT_RESOLUTION = 104;
        public static final int ON_PLAYER_EVENT = 106;
        public static final int ON_TOUCH_EVENT = 105;
        public static final int SET_SURFACE_BUFFER_SIZE = 101;
        public static final int STOP_MONET = 103;
        public static final int UPDATE_MONET_MODULE = 102;
    }

    public interface PluginClazzName {
        public static final String MONET_PLUGIN_CLAZZ_NAME = "com.tencent.liteav.monet.MonetPlugin";
    }

    public interface PluginId {
        public static final int HOST_ID = 1;
        public static final int PLUGIN_MONET = 2;
    }

    public interface PluginName {
        public static final String HOST_NAME = "Host";
        public static final String MONET_PLUGIN_NAME = "monet";
    }

    public interface RetKey {
        public static final String KEY_RET_PARAM1 = "KEY_RET_PARAM1";
        public static final String KEY_RET_PARAM2 = "KEY_RET_PARAM1";
        public static final String KEY_RET_PARAM3 = "KEY_RET_PARAM3";
        public static final String KEY_RET_PARAM4 = "KEY_RET_PARAM4";
    }
}
