package splunk.com.jmeter.config.splunk;

import org.apache.commons.lang3.StringUtils;
import org.apache.jmeter.visualizers.backend.BackendListenerContext; 

/**
 * Configuration for splunk.
 * 
 * @author Miguel Da Paixao
 *
 */

public class SplunkConfig {
    
    /**
	 * Default retention policy name.
	 */
	public static final String DEFAULT_RETENTION_POLICY = "autogen";

	/**
	 * Default http scheme name.
	 */
    public static final String DEFAULT_HTTP_SCHEME = "https";
    
    public static final String DEFAULT_PORT = "8088";
    /**
	 * Config key for index.
	 */
	public static final String KEY_SPLUNK_INDEX = "splunkIndex";

	/**
	 * Config key for sourceType.
	 */
	public static final String KEY_SPLUNK_SOURCETYPE = "splunkSourceType";

	/**
	 * Config key for token.
	 */
	public static final String KEY_SPLUNK_TOKEN = "splunkToken";

	/**
	 * Config key for port.
	 */
	public static final String KEY_SPLUNK_PORT = "splunkPort";

	/**
	 * Config key for host.
	 */
	public static final String KEY_SPLUNK_HOST = "splunkHost";

	/**
	 * Config key for retention policy name.
	 */
	public static final String KEY_RETENTION_POLICY = "retentionPolicy";
	
	/**
	 * Config key for http scheme.
	 */
    public static final String KEY_HTTP_SCHEME = "splunkHTTPScheme";
    
    
private String splunkHost;
private String splunkIndex;
private String splunkSourceType;
private String splunkToken;
private String splunkPort;
private String retentionPolicy;
private String splunkHTTPScheme;


public SplunkConfig(BackendListenerContext context){
    String splunkHost = context.getParameter(KEY_SPLUNK_HOST);
    if (StringUtils.isEmpty(splunkHost)) {
        throw new IllegalArgumentException(KEY_SPLUNK_HOST + "must not be empty!");
    }
    setSplunkHost(splunkHost);

    String splunkPort = context.getParameter(KEY_SPLUNK_PORT,DEFAULT_PORT);
    setSplunkPort(splunkPort);

    String splunkIndex = context.getParameter(KEY_SPLUNK_INDEX);
    if (StringUtils.isEmpty(splunkIndex)) {
        throw new IllegalArgumentException(KEY_SPLUNK_INDEX + "must not be empty!");
    }
    setSplunkIndex(splunkIndex);

    String splunkToken = context.getParameter(KEY_SPLUNK_TOKEN);
    if (StringUtils.isEmpty(splunkToken)) {
        throw new IllegalArgumentException(KEY_SPLUNK_TOKEN + "must not be empty!");
    }
    setSplunkToken(splunkToken);

    String splunkSourceType = context.getParameter(KEY_SPLUNK_SOURCETYPE);
    if (StringUtils.isEmpty(splunkSourceType)) {
        throw new IllegalArgumentException(KEY_SPLUNK_SOURCETYPE + "must not be empty!");
    }
    setSplunkSourceType(splunkSourceType);

    String RetentionPolicy = context.getParameter(KEY_RETENTION_POLICY, DEFAULT_RETENTION_POLICY);
		if (StringUtils.isEmpty(retentionPolicy)) {
			retentionPolicy = DEFAULT_RETENTION_POLICY;
		}
		setRetentionPolicy(retentionPolicy);
		
		String splunkHTTPScheme = context.getParameter(KEY_HTTP_SCHEME, DEFAULT_HTTP_SCHEME);
		if (StringUtils.isEmpty(splunkHTTPScheme)) {
			splunkHTTPScheme = DEFAULT_HTTP_SCHEME;
		}
		
		setSplunkHTTPScheme(splunkHTTPScheme);
}

/**
	
    /**
	 * @return splunk Host
	 */
	public String getSplunkHost() {
		return splunkHost;
	}

	/**
	 * @param splunkHost
	 *            the splunk Host to set
	 */
	public void setSplunkHost(String splunkHost) {
		this.splunkHost = splunkHost;
	}
 /**
	 * @return the splunkIndex
	 */
	public String getSplunkIndex() {
		return splunkIndex;
	}

	/**
	 * @param splunkIndex
	 *            the splunkIndex to set
	 */
	public void setSplunkIndex(String splunkIndex) {
		this.splunkIndex = splunkIndex;
    }
    
    /**
	 * @return the splunkSourceType
	 */
	public String getSplunkSourceType() {
		return splunkSourceType;
	}

	/**
	 * @param splunkSourceType
	 *            the splunkSourceType to set
	 */
	public void setSplunkSourceType(String splunkSourceType) {
		this.splunkSourceType = splunkSourceType;
    }
    
    /**
	 * @return the splunkToken
	 */
	public String getSplunkToken() {
		return splunkToken;
	}

	/**
	 * @param splunkToken
	 *            the splunkToken to set
	 */
	public void setSplunkToken(String splunkToken) {
		this.splunkToken = splunkToken;
    }

    /**
	 * @return the splunkPort
	 */
	public String getSplunkPort() {
		return splunkPort;
	}

	/**
	 * @param splunkPort
	 *            the splunkPort to set
	 */
	public void setSplunkPort(String splunkPort) {
		this.splunkPort = splunkPort;
    }
    
    /**
	 * @return the RetentionPolicy
	 */
	public String getRetentionPolicy() {
		return retentionPolicy;
	}

	/**
	 * @param retentionPolicy
	 *            the RetentionPolicy to set
	 */
	public void setRetentionPolicy(String retentionPolicy) {
		this.retentionPolicy = retentionPolicy;
	}

	/**
	 * @param splunkHTTPScheme
	 *            the splunkHTTPScheme to set
	 */
	public void setSplunkHTTPScheme(String splunkHTTPScheme) {
		this.splunkHTTPScheme = splunkHTTPScheme;
	}
}