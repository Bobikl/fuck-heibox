package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: classes5.dex */
public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    String getData();

    InvocationHandler[] getPorts();
}
