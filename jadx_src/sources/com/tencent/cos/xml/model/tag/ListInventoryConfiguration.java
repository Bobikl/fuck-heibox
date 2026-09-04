package com.tencent.cos.xml.model.tag;

import java.util.Set;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class ListInventoryConfiguration {
    public String continuationToken;
    public Set<InventoryConfiguration> inventoryConfigurations;
    public boolean isTruncated = false;
    public String nextContinuationToken;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListInventoryConfigurationResult\n");
        sb2.append("IsTruncated:");
        sb2.append(this.isTruncated);
        sb2.append("\n");
        if (this.continuationToken != null) {
            sb2.append("ContinuationToken:");
            sb2.append(this.continuationToken);
            sb2.append("\n");
        }
        if (this.nextContinuationToken != null) {
            sb2.append("NextContinuationToken:");
            sb2.append(this.nextContinuationToken);
            sb2.append("\n");
        }
        Set<InventoryConfiguration> set = this.inventoryConfigurations;
        if (set != null) {
            for (InventoryConfiguration inventoryConfiguration : set) {
                if (inventoryConfiguration != null) {
                    sb2.append(inventoryConfiguration.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
