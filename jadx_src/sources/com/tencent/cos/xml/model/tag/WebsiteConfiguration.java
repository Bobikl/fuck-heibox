package com.tencent.cos.xml.model.tag;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WebsiteConfiguration {
    public ErrorDocument errorDocument;
    public IndexDocument indexDocument;
    public RedirectAllRequestTo redirectAllRequestTo;
    public List<RoutingRule> routingRules;

    public static class Contidion {
        public int httpErrorCodeReturnedEquals = -1;
        public String keyPrefixEquals;
    }

    public static class ErrorDocument {
        public String key;
    }

    public static class IndexDocument {
        public String suffix;
    }

    public static class Redirect {
        public String protocol;
        public String replaceKeyPrefixWith;
        public String replaceKeyWith;
    }

    public static class RedirectAllRequestTo {
        public String protocol;
    }

    public static class RoutingRule {
        public Contidion contidion;
        public Redirect redirect;
    }
}
