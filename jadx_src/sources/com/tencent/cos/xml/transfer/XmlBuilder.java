package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import com.tencent.cos.xml.model.bucket.PutBucketIntelligentTieringRequest;
import com.tencent.cos.xml.model.tag.AccessControlPolicy;
import com.tencent.cos.xml.model.tag.BucketLoggingStatus;
import com.tencent.cos.xml.model.tag.CORSConfiguration;
import com.tencent.cos.xml.model.tag.CreateBucketConfiguration;
import com.tencent.cos.xml.model.tag.Delete;
import com.tencent.cos.xml.model.tag.DomainConfiguration;
import com.tencent.cos.xml.model.tag.InventoryConfiguration;
import com.tencent.cos.xml.model.tag.LifecycleConfiguration;
import com.tencent.cos.xml.model.tag.ReplicationConfiguration;
import com.tencent.cos.xml.model.tag.RestoreConfigure;
import com.tencent.cos.xml.model.tag.Tagging;
import com.tencent.cos.xml.model.tag.VersioningConfiguration;
import com.tencent.cos.xml.model.tag.WebsiteConfiguration;
import com.tencent.cos.xml.model.tag.eventstreaming.CSVInput;
import com.tencent.cos.xml.model.tag.eventstreaming.CSVOutput;
import com.tencent.cos.xml.model.tag.eventstreaming.JSONInput;
import com.tencent.cos.xml.model.tag.eventstreaming.JSONOutput;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectRequest;
import com.umeng.socialize.net.dplus.db.DBConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.apache.tools.ant.taskdefs.y3;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class XmlBuilder extends XmlSlimBuilder {
    private static void addElement(XmlSerializer xmlSerializer, String str, String str2) throws IOException {
        if (str2 != null) {
            xmlSerializer.startTag("", str);
            xmlSerializer.text(str2);
            xmlSerializer.endTag("", str);
        }
    }

    public static String buildAccessControlPolicyXML(AccessControlPolicy accessControlPolicy) throws XmlPullParserException, IOException {
        if (accessControlPolicy == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "AccessControlPolicy");
        xmlSerializerNewSerializer.startTag("", "Owner");
        addElement(xmlSerializerNewSerializer, "ID", accessControlPolicy.owner.f99463id);
        xmlSerializerNewSerializer.endTag("", "Owner");
        xmlSerializerNewSerializer.startTag("", "AccessControlList");
        for (AccessControlPolicy.Grant grant : accessControlPolicy.accessControlList.grants) {
            xmlSerializerNewSerializer.startTag("", "Grant");
            if (!TextUtils.isEmpty(grant.grantee.uri)) {
                xmlSerializerNewSerializer.setPrefix("xsi", "http://www.w3.org/2001/XMLSchema-instance");
                xmlSerializerNewSerializer.startTag("", "Grantee");
                xmlSerializerNewSerializer.attribute("", "xsi:type", "CanonicalUser");
                addElement(xmlSerializerNewSerializer, "URI", grant.grantee.uri);
                xmlSerializerNewSerializer.endTag("", "Grantee");
            } else if (!TextUtils.isEmpty(grant.grantee.f99462id)) {
                xmlSerializerNewSerializer.setPrefix("xsi", "http://www.w3.org/2001/XMLSchema-instance");
                xmlSerializerNewSerializer.startTag("", "Grantee");
                xmlSerializerNewSerializer.attribute("", "xsi:type", "Group");
                addElement(xmlSerializerNewSerializer, "ID", grant.grantee.f99462id);
                xmlSerializerNewSerializer.endTag("", "Grantee");
            }
            addElement(xmlSerializerNewSerializer, "Permission", grant.permission);
            xmlSerializerNewSerializer.endTag("", "Grant");
        }
        xmlSerializerNewSerializer.endTag("", "AccessControlList");
        xmlSerializerNewSerializer.endTag("", "AccessControlPolicy");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildBucketLogging(BucketLoggingStatus bucketLoggingStatus) throws XmlPullParserException, IOException {
        if (bucketLoggingStatus == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "BucketLoggingStatus");
        if (bucketLoggingStatus.loggingEnabled != null) {
            xmlSerializerNewSerializer.startTag("", "LoggingEnabled");
            addElement(xmlSerializerNewSerializer, "TargetBucket", bucketLoggingStatus.loggingEnabled.targetBucket);
            addElement(xmlSerializerNewSerializer, "TargetPrefix", bucketLoggingStatus.loggingEnabled.targetPrefix);
            xmlSerializerNewSerializer.endTag("", "LoggingEnabled");
        }
        xmlSerializerNewSerializer.endTag("", "BucketLoggingStatus");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildCORSConfigurationXML(CORSConfiguration cORSConfiguration) throws XmlPullParserException, IOException {
        if (cORSConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "CORSConfiguration");
        List<CORSConfiguration.CORSRule> list = cORSConfiguration.corsRules;
        if (list != null) {
            for (CORSConfiguration.CORSRule cORSRule : list) {
                if (cORSRule != null) {
                    xmlSerializerNewSerializer.startTag("", "CORSRule");
                    addElement(xmlSerializerNewSerializer, "ID", cORSRule.f99464id);
                    addElement(xmlSerializerNewSerializer, "AllowedOrigin", cORSRule.allowedOrigin);
                    List<String> list2 = cORSRule.allowedMethod;
                    if (list2 != null) {
                        Iterator<String> it = list2.iterator();
                        while (it.hasNext()) {
                            addElement(xmlSerializerNewSerializer, "AllowedMethod", it.next());
                        }
                    }
                    List<String> list3 = cORSRule.allowedHeader;
                    if (list3 != null) {
                        Iterator<String> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            addElement(xmlSerializerNewSerializer, "AllowedHeader", it2.next());
                        }
                    }
                    List<String> list4 = cORSRule.exposeHeader;
                    if (list4 != null) {
                        Iterator<String> it3 = list4.iterator();
                        while (it3.hasNext()) {
                            addElement(xmlSerializerNewSerializer, "ExposeHeader", it3.next());
                        }
                    }
                    addElement(xmlSerializerNewSerializer, "MaxAgeSeconds", String.valueOf(cORSRule.maxAgeSeconds));
                    xmlSerializerNewSerializer.endTag("", "CORSRule");
                }
            }
        }
        xmlSerializerNewSerializer.endTag("", "CORSConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildCreateBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) throws XmlPullParserException, IOException {
        if (createBucketConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "CreateBucketConfiguration");
        addElement(xmlSerializerNewSerializer, "BucketAZConfig", createBucketConfiguration.bucketAzConfig);
        xmlSerializerNewSerializer.endTag("", "CreateBucketConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildDelete(Delete delete) throws XmlPullParserException, IOException {
        if (delete == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "Delete");
        addElement(xmlSerializerNewSerializer, "Quiet", String.valueOf(delete.quiet));
        List<Delete.DeleteObject> list = delete.deleteObjects;
        if (list != null) {
            for (Delete.DeleteObject deleteObject : list) {
                if (deleteObject != null) {
                    xmlSerializerNewSerializer.startTag("", "Object");
                    addElement(xmlSerializerNewSerializer, "Key", deleteObject.key);
                    addElement(xmlSerializerNewSerializer, "VersionId", deleteObject.versionId);
                    xmlSerializerNewSerializer.endTag("", "Object");
                }
            }
        }
        xmlSerializerNewSerializer.endTag("", "Delete");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildDomainConfiguration(DomainConfiguration domainConfiguration) throws XmlPullParserException, IOException {
        if (domainConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "DomainConfiguration");
        List<DomainConfiguration.DomainRule> list = domainConfiguration.domainRules;
        if (list != null && list.size() > 0) {
            for (DomainConfiguration.DomainRule domainRule : domainConfiguration.domainRules) {
                xmlSerializerNewSerializer.startTag("", "DomainRule");
                addElement(xmlSerializerNewSerializer, "Status", domainRule.status);
                addElement(xmlSerializerNewSerializer, y3.f135966f, domainRule.name);
                addElement(xmlSerializerNewSerializer, "Type", domainRule.type);
                addElement(xmlSerializerNewSerializer, "ForcedReplacement", domainRule.forcedReplacement);
                xmlSerializerNewSerializer.endTag("", "DomainRule");
            }
        }
        xmlSerializerNewSerializer.endTag("", "DomainConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildInventoryConfiguration(InventoryConfiguration inventoryConfiguration) throws XmlPullParserException, IOException {
        if (inventoryConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "InventoryConfiguration");
        String str = inventoryConfiguration.f99465id;
        if (str != null) {
            addElement(xmlSerializerNewSerializer, DBConfig.ID, str);
        }
        addElement(xmlSerializerNewSerializer, "IsEnabled", inventoryConfiguration.isEnabled ? "true" : "false");
        if (inventoryConfiguration.destination != null) {
            xmlSerializerNewSerializer.startTag("", "Destination");
            if (inventoryConfiguration.destination.cosBucketDestination != null) {
                xmlSerializerNewSerializer.startTag("", "COSBucketDestination");
                String str2 = inventoryConfiguration.destination.cosBucketDestination.format;
                if (str2 != null) {
                    addElement(xmlSerializerNewSerializer, "Format", str2);
                }
                String str3 = inventoryConfiguration.destination.cosBucketDestination.accountId;
                if (str3 != null) {
                    addElement(xmlSerializerNewSerializer, "AccountId", str3);
                }
                String str4 = inventoryConfiguration.destination.cosBucketDestination.bucket;
                if (str4 != null) {
                    addElement(xmlSerializerNewSerializer, "Bucket", str4);
                }
                String str5 = inventoryConfiguration.destination.cosBucketDestination.prefix;
                if (str5 != null) {
                    addElement(xmlSerializerNewSerializer, "Prefix", str5);
                }
                if (inventoryConfiguration.destination.cosBucketDestination.encryption != null) {
                    xmlSerializerNewSerializer.startTag("", "Encryption");
                    addElement(xmlSerializerNewSerializer, "SSE-COS", inventoryConfiguration.destination.cosBucketDestination.encryption.sSECOS);
                    xmlSerializerNewSerializer.endTag("", "Encryption");
                }
                xmlSerializerNewSerializer.endTag("", "COSBucketDestination");
            }
            xmlSerializerNewSerializer.endTag("", "Destination");
        }
        InventoryConfiguration.Schedule schedule = inventoryConfiguration.schedule;
        if (schedule != null && schedule.frequency != null) {
            xmlSerializerNewSerializer.startTag("", "Schedule");
            addElement(xmlSerializerNewSerializer, "Frequency", inventoryConfiguration.schedule.frequency);
            xmlSerializerNewSerializer.endTag("", "Schedule");
        }
        InventoryConfiguration.Filter filter = inventoryConfiguration.filter;
        if (filter != null && filter.prefix != null) {
            xmlSerializerNewSerializer.startTag("", "Filter");
            addElement(xmlSerializerNewSerializer, "Prefix", inventoryConfiguration.filter.prefix);
            xmlSerializerNewSerializer.endTag("", "Filter");
        }
        String str6 = inventoryConfiguration.includedObjectVersions;
        if (str6 != null) {
            addElement(xmlSerializerNewSerializer, "IncludedObjectVersions", str6);
        }
        InventoryConfiguration.OptionalFields optionalFields = inventoryConfiguration.optionalFields;
        if (optionalFields != null && optionalFields.fields != null) {
            xmlSerializerNewSerializer.startTag("", "OptionalFields");
            Iterator<String> it = inventoryConfiguration.optionalFields.fields.iterator();
            while (it.hasNext()) {
                addElement(xmlSerializerNewSerializer, "Field", it.next());
            }
            xmlSerializerNewSerializer.endTag("", "OptionalFields");
        }
        xmlSerializerNewSerializer.endTag("", "InventoryConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildLifecycleConfigurationXML(LifecycleConfiguration lifecycleConfiguration) throws XmlPullParserException, IOException {
        if (lifecycleConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "LifecycleConfiguration");
        List<LifecycleConfiguration.Rule> list = lifecycleConfiguration.rules;
        if (list != null) {
            for (LifecycleConfiguration.Rule rule : list) {
                if (rule != null) {
                    xmlSerializerNewSerializer.startTag("", "Rule");
                    addElement(xmlSerializerNewSerializer, "ID", rule.f99466id);
                    if (rule.filter != null) {
                        xmlSerializerNewSerializer.startTag("", "Filter");
                        addElement(xmlSerializerNewSerializer, "Prefix", rule.filter.prefix);
                        xmlSerializerNewSerializer.endTag("", "Filter");
                    }
                    addElement(xmlSerializerNewSerializer, "Status", rule.status);
                    if (rule.transition != null) {
                        xmlSerializerNewSerializer.startTag("", "Transition");
                        addElement(xmlSerializerNewSerializer, "Days", String.valueOf(rule.transition.days));
                        addElement(xmlSerializerNewSerializer, "StorageClass", rule.transition.storageClass);
                        addElement(xmlSerializerNewSerializer, "Date", rule.transition.date);
                        xmlSerializerNewSerializer.endTag("", "Transition");
                    }
                    if (rule.expiration != null) {
                        xmlSerializerNewSerializer.startTag("", "Expiration");
                        addElement(xmlSerializerNewSerializer, "Days", String.valueOf(rule.expiration.days));
                        addElement(xmlSerializerNewSerializer, "ExpiredObjectDeleteMarker", rule.expiration.expiredObjectDeleteMarker);
                        addElement(xmlSerializerNewSerializer, "Date", rule.expiration.date);
                        xmlSerializerNewSerializer.endTag("", "Expiration");
                    }
                    if (rule.noncurrentVersionTransition != null) {
                        xmlSerializerNewSerializer.startTag("", "NoncurrentVersionTransition");
                        addElement(xmlSerializerNewSerializer, "NoncurrentDays", String.valueOf(rule.noncurrentVersionTransition.noncurrentDays));
                        addElement(xmlSerializerNewSerializer, "StorageClass", rule.noncurrentVersionTransition.storageClass);
                        xmlSerializerNewSerializer.endTag("", "NoncurrentVersionTransition");
                    }
                    if (rule.noncurrentVersionExpiration != null) {
                        xmlSerializerNewSerializer.startTag("", "NoncurrentVersionExpiration");
                        addElement(xmlSerializerNewSerializer, "NoncurrentDays", String.valueOf(rule.noncurrentVersionExpiration.noncurrentDays));
                        xmlSerializerNewSerializer.endTag("", "NoncurrentVersionExpiration");
                    }
                    if (rule.abortIncompleteMultiUpload != null) {
                        xmlSerializerNewSerializer.startTag("", "AbortIncompleteMultipartUpload");
                        addElement(xmlSerializerNewSerializer, "DaysAfterInitiation", String.valueOf(rule.abortIncompleteMultiUpload.daysAfterInitiation));
                        xmlSerializerNewSerializer.endTag("", "AbortIncompleteMultipartUpload");
                    }
                    xmlSerializerNewSerializer.endTag("", "Rule");
                }
            }
        }
        xmlSerializerNewSerializer.endTag("", "LifecycleConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildPutBucketAccelerateXML(boolean z10) throws XmlPullParserException, IOException {
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "AccelerateConfiguration");
        addElement(xmlSerializerNewSerializer, "Status", z10 ? PutBucketIntelligentTieringRequest.STATUS_ENABLED : PutBucketIntelligentTieringRequest.STATUS_SUSPEND);
        xmlSerializerNewSerializer.endTag("", "AccelerateConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildReplicationConfiguration(ReplicationConfiguration replicationConfiguration) throws XmlPullParserException, IOException {
        if (replicationConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "ReplicationConfiguration");
        addElement(xmlSerializerNewSerializer, "Role", replicationConfiguration.role);
        List<ReplicationConfiguration.Rule> list = replicationConfiguration.rules;
        if (list != null) {
            for (ReplicationConfiguration.Rule rule : list) {
                if (rule != null) {
                    xmlSerializerNewSerializer.startTag("", "Rule");
                    addElement(xmlSerializerNewSerializer, "Status", rule.status);
                    addElement(xmlSerializerNewSerializer, "ID", rule.f99474id);
                    addElement(xmlSerializerNewSerializer, "Prefix", rule.prefix);
                    if (rule.destination != null) {
                        xmlSerializerNewSerializer.startTag("", "Destination");
                        addElement(xmlSerializerNewSerializer, "Bucket", rule.destination.bucket);
                        addElement(xmlSerializerNewSerializer, "StorageClass", rule.destination.storageClass);
                        xmlSerializerNewSerializer.endTag("", "Destination");
                    }
                    xmlSerializerNewSerializer.endTag("", "Rule");
                }
            }
        }
        xmlSerializerNewSerializer.endTag("", "ReplicationConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildRestore(RestoreConfigure restoreConfigure) throws XmlPullParserException, IOException {
        if (restoreConfigure == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "RestoreRequest");
        addElement(xmlSerializerNewSerializer, "Days", String.valueOf(restoreConfigure.days));
        if (restoreConfigure.casJobParameters != null) {
            xmlSerializerNewSerializer.startTag("", "CASJobParameters");
            addElement(xmlSerializerNewSerializer, "Tier", restoreConfigure.casJobParameters.tier);
            xmlSerializerNewSerializer.endTag("", "CASJobParameters");
        }
        xmlSerializerNewSerializer.endTag("", "RestoreRequest");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildSelectRequest(SelectRequest selectRequest) throws XmlPullParserException, IOException {
        if (selectRequest == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "SelectRequest");
        addElement(xmlSerializerNewSerializer, "Expression", selectRequest.getExpression());
        addElement(xmlSerializerNewSerializer, "ExpressionType", selectRequest.getExpressionType());
        xmlSerializerNewSerializer.startTag("", "InputSerialization");
        addElement(xmlSerializerNewSerializer, "CompressionType", selectRequest.getInputSerialization().getCompressionType());
        if (selectRequest.getInputSerialization().getCsv() != null) {
            CSVInput csv = selectRequest.getInputSerialization().getCsv();
            xmlSerializerNewSerializer.startTag("", "CSV");
            addElement(xmlSerializerNewSerializer, "FileHeaderInfo", csv.getFileHeaderInfo());
            addElement(xmlSerializerNewSerializer, "RecordDelimiter", csv.getRecordDelimiterAsString());
            addElement(xmlSerializerNewSerializer, "FieldDelimiter", csv.getFieldDelimiterAsString());
            addElement(xmlSerializerNewSerializer, "QuoteCharacter", csv.getQuoteCharacterAsString());
            addElement(xmlSerializerNewSerializer, "QuoteEscapeCharacter", csv.getQuoteEscapeCharacterAsString());
            addElement(xmlSerializerNewSerializer, "Comments", csv.getCommentsAsString());
            addElement(xmlSerializerNewSerializer, "AllowQuotedRecordDelimiter", csv.getAllowQuotedRecordDelimiter().booleanValue() ? "TRUE" : "FALSE");
            xmlSerializerNewSerializer.endTag("", "CSV");
        } else if (selectRequest.getInputSerialization().getJson() != null) {
            JSONInput json = selectRequest.getInputSerialization().getJson();
            xmlSerializerNewSerializer.startTag("", "JSON");
            addElement(xmlSerializerNewSerializer, "Type", json.getType());
            xmlSerializerNewSerializer.endTag("", "JSON");
        }
        xmlSerializerNewSerializer.endTag("", "InputSerialization");
        xmlSerializerNewSerializer.startTag("", "OutputSerialization");
        if (selectRequest.getOutputSerialization().getCsv() != null) {
            CSVOutput csv2 = selectRequest.getOutputSerialization().getCsv();
            xmlSerializerNewSerializer.startTag("", "CSV");
            addElement(xmlSerializerNewSerializer, "QuoteFields", csv2.getQuoteFields());
            addElement(xmlSerializerNewSerializer, "RecordDelimiter", csv2.getRecordDelimiterAsString());
            addElement(xmlSerializerNewSerializer, "FieldDelimiter", csv2.getFieldDelimiterAsString());
            addElement(xmlSerializerNewSerializer, "QuoteCharacter", csv2.getQuoteCharacterAsString());
            addElement(xmlSerializerNewSerializer, "QuoteEscapeCharacter", csv2.getQuoteEscapeCharacterAsString());
            xmlSerializerNewSerializer.endTag("", "CSV");
        } else if (selectRequest.getOutputSerialization().getJson() != null) {
            JSONOutput json2 = selectRequest.getOutputSerialization().getJson();
            xmlSerializerNewSerializer.startTag("", "JSON");
            addElement(xmlSerializerNewSerializer, "RecordDelimiter", json2.getRecordDelimiterAsString());
            xmlSerializerNewSerializer.endTag("", "JSON");
        }
        xmlSerializerNewSerializer.endTag("", "OutputSerialization");
        xmlSerializerNewSerializer.startTag("", "RequestProgress");
        addElement(xmlSerializerNewSerializer, PutBucketIntelligentTieringRequest.STATUS_ENABLED, String.valueOf(selectRequest.getRequestProgress().getEnabled()));
        xmlSerializerNewSerializer.endTag("", "RequestProgress");
        xmlSerializerNewSerializer.endTag("", "SelectRequest");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildTagging(Tagging tagging) throws XmlPullParserException, IOException {
        if (tagging == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "Tagging");
        xmlSerializerNewSerializer.startTag("", "TagSet");
        if (!tagging.tagSet.tags.isEmpty()) {
            for (Tagging.Tag tag : tagging.tagSet.tags) {
                xmlSerializerNewSerializer.startTag("", "Tag");
                addElement(xmlSerializerNewSerializer, "Key", tag.key);
                addElement(xmlSerializerNewSerializer, "Value", tag.value);
                xmlSerializerNewSerializer.endTag("", "Tag");
            }
        }
        xmlSerializerNewSerializer.endTag("", "TagSet");
        xmlSerializerNewSerializer.endTag("", "Tagging");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildVersioningConfiguration(VersioningConfiguration versioningConfiguration) throws XmlPullParserException, IOException {
        if (versioningConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "VersioningConfiguration");
        addElement(xmlSerializerNewSerializer, "Status", versioningConfiguration.status);
        xmlSerializerNewSerializer.endTag("", "VersioningConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildWebsiteConfiguration(WebsiteConfiguration websiteConfiguration) throws XmlPullParserException, IOException {
        if (websiteConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "WebsiteConfiguration");
        if (websiteConfiguration.indexDocument != null) {
            xmlSerializerNewSerializer.startTag("", "IndexDocument");
            String str = websiteConfiguration.indexDocument.suffix;
            if (str != null) {
                addElement(xmlSerializerNewSerializer, "Suffix", str);
            }
            xmlSerializerNewSerializer.endTag("", "IndexDocument");
        }
        if (websiteConfiguration.errorDocument != null) {
            xmlSerializerNewSerializer.startTag("", "ErrorDocument");
            String str2 = websiteConfiguration.errorDocument.key;
            if (str2 != null) {
                addElement(xmlSerializerNewSerializer, "Key", str2);
            }
            xmlSerializerNewSerializer.endTag("", "ErrorDocument");
        }
        if (websiteConfiguration.redirectAllRequestTo != null) {
            xmlSerializerNewSerializer.startTag("", "RedirectAllRequestTo");
            String str3 = websiteConfiguration.redirectAllRequestTo.protocol;
            if (str3 != null) {
                addElement(xmlSerializerNewSerializer, "Protocol", str3);
            }
            xmlSerializerNewSerializer.endTag("", "RedirectAllRequestTo");
        }
        List<WebsiteConfiguration.RoutingRule> list = websiteConfiguration.routingRules;
        if (list != null && list.size() > 0) {
            xmlSerializerNewSerializer.startTag("", "RoutingRules");
            for (WebsiteConfiguration.RoutingRule routingRule : websiteConfiguration.routingRules) {
                xmlSerializerNewSerializer.startTag("", "RoutingRule");
                if (routingRule.contidion != null) {
                    xmlSerializerNewSerializer.startTag("", "Condition");
                    int i10 = routingRule.contidion.httpErrorCodeReturnedEquals;
                    if (i10 != -1) {
                        addElement(xmlSerializerNewSerializer, "HttpErrorCodeReturnedEquals", String.valueOf(i10));
                    }
                    String str4 = routingRule.contidion.keyPrefixEquals;
                    if (str4 != null) {
                        addElement(xmlSerializerNewSerializer, "KeyPrefixEquals", str4);
                    }
                    xmlSerializerNewSerializer.endTag("", "Condition");
                }
                if (routingRule.redirect != null) {
                    xmlSerializerNewSerializer.startTag("", "Redirect");
                    String str5 = routingRule.redirect.protocol;
                    if (str5 != null) {
                        addElement(xmlSerializerNewSerializer, "Protocol", str5);
                    }
                    String str6 = routingRule.redirect.replaceKeyPrefixWith;
                    if (str6 != null) {
                        addElement(xmlSerializerNewSerializer, "ReplaceKeyPrefixWith", str6);
                    }
                    String str7 = routingRule.redirect.replaceKeyWith;
                    if (str7 != null) {
                        addElement(xmlSerializerNewSerializer, "ReplaceKeyWith", str7);
                    }
                    xmlSerializerNewSerializer.endTag("", "Redirect");
                }
                xmlSerializerNewSerializer.endTag("", "RoutingRule");
            }
            xmlSerializerNewSerializer.endTag("", "RoutingRules");
        }
        xmlSerializerNewSerializer.endTag("", "WebsiteConfiguration");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    private static String removeXMLHeader(String str) {
        return (str == null || !str.startsWith("<?xml")) ? str : str.substring(str.indexOf("?>") + 2);
    }
}
