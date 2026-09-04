package io.flutter.plugin.mouse;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.module.mall.SteamStoreRedeemWalletCodeActivity;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@w0(24)
@TargetApi(24)
public class MouseCursorPlugin {

    @n0
    private static HashMap<String, Integer> systemCursorConstants;

    @n0
    private final MouseCursorViewDelegate mView;

    @n0
    private final MouseCursorChannel mouseCursorChannel;

    public interface MouseCursorViewDelegate {
        @n0
        PointerIcon getSystemPointerIcon(int i10);

        void setPointerIcon(@n0 PointerIcon pointerIcon);
    }

    public MouseCursorPlugin(@n0 MouseCursorViewDelegate mouseCursorViewDelegate, @n0 MouseCursorChannel mouseCursorChannel) {
        this.mView = mouseCursorViewDelegate;
        this.mouseCursorChannel = mouseCursorChannel;
        mouseCursorChannel.setMethodHandler(new MouseCursorChannel.MouseCursorMethodHandler() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler
            public void activateSystemCursor(@n0 String str) {
                MouseCursorPlugin.this.mView.setPointerIcon(MouseCursorPlugin.this.resolveSystemCursor(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon resolveSystemCursor(@n0 String str) {
        if (systemCursorConstants == null) {
            systemCursorConstants = new HashMap<String, Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.2
                private static final long serialVersionUID = 1;

                {
                    put("alias", 1010);
                    put("allScroll", 1013);
                    put("basic", 1000);
                    put("cell", 1006);
                    put(UiKitSpanObj.TYPE_CLICK, 1002);
                    put("contextMenu", 1001);
                    put("copy", 1011);
                    put("forbidden", 1012);
                    put("grab", 1020);
                    put("grabbing", 1021);
                    put("help", 1003);
                    put("move", 1013);
                    put("none", 0);
                    put("noDrop", 1012);
                    put("precise", 1007);
                    put("text", 1008);
                    put("resizeColumn", 1014);
                    put("resizeDown", 1015);
                    put("resizeUpLeft", 1016);
                    put("resizeDownRight", 1017);
                    put("resizeLeft", 1014);
                    put("resizeLeftRight", 1014);
                    put("resizeRight", 1014);
                    put("resizeRow", 1015);
                    put("resizeUp", 1015);
                    put("resizeUpDown", 1015);
                    put("resizeUpLeft", 1017);
                    put("resizeUpRight", 1016);
                    put("resizeUpLeftDownRight", 1017);
                    put("resizeUpRightDownLeft", 1016);
                    put("verticalText", 1009);
                    put(SteamStoreRedeemWalletCodeActivity.N3, 1004);
                    put("zoomIn", 1018);
                    put("zoomOut", 1019);
                }
            };
        }
        return this.mView.getSystemPointerIcon(((Integer) systemCursorConstants.getOrDefault(str, 1000)).intValue());
    }

    public void destroy() {
        this.mouseCursorChannel.setMethodHandler(null);
    }
}
