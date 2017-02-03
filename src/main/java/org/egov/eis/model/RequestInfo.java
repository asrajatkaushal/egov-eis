package org.egov.eis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestInfo {
	@JsonProperty("api_id")
	private String apiId = null;

	@JsonProperty("ver")
	private String ver = null;

	@JsonProperty("ts")
	private String ts = null;

	@JsonProperty("action")
	private String action = null;

	@JsonProperty("did")
	private String did = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("msg_id")
	private String msgId = null;

	@JsonProperty("requester_id")
	private String requesterId = null;

	@JsonProperty("auth_token")
	private String authToken = null;

	public RequestInfo apiId(String apiId) {
		this.apiId = apiId;
		return this;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public RequestInfo ver(String ver) {
		this.ver = ver;
		return this;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public RequestInfo ts(String ts) {
		this.ts = ts;
		return this;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public RequestInfo action(String action) {
		this.action = action;
		return this;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public RequestInfo did(String did) {
		this.did = did;
		return this;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public RequestInfo key(String key) {
		this.key = key;
		return this;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public RequestInfo msgId(String msgId) {
		this.msgId = msgId;
		return this;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public RequestInfo requesterId(String requesterId) {
		this.requesterId = requesterId;
		return this;
	}

	public String getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(String requesterId) {
		this.requesterId = requesterId;
	}

	public RequestInfo authToken(String authToken) {
		this.authToken = authToken;
		return this;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((apiId == null) ? 0 : apiId.hashCode());
		result = prime * result + ((authToken == null) ? 0 : authToken.hashCode());
		result = prime * result + ((did == null) ? 0 : did.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((msgId == null) ? 0 : msgId.hashCode());
		result = prime * result + ((requesterId == null) ? 0 : requesterId.hashCode());
		result = prime * result + ((ts == null) ? 0 : ts.hashCode());
		result = prime * result + ((ver == null) ? 0 : ver.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RequestInfo))
			return false;
		RequestInfo other = (RequestInfo) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (apiId == null) {
			if (other.apiId != null)
				return false;
		} else if (!apiId.equals(other.apiId))
			return false;
		if (authToken == null) {
			if (other.authToken != null)
				return false;
		} else if (!authToken.equals(other.authToken))
			return false;
		if (did == null) {
			if (other.did != null)
				return false;
		} else if (!did.equals(other.did))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (msgId == null) {
			if (other.msgId != null)
				return false;
		} else if (!msgId.equals(other.msgId))
			return false;
		if (requesterId == null) {
			if (other.requesterId != null)
				return false;
		} else if (!requesterId.equals(other.requesterId))
			return false;
		if (ts == null) {
			if (other.ts != null)
				return false;
		} else if (!ts.equals(other.ts))
			return false;
		if (ver == null) {
			if (other.ver != null)
				return false;
		} else if (!ver.equals(other.ver))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RequestInfo [apiId=" + apiId + ", ver=" + ver + ", ts=" + ts + ", action=" + action + ", did=" + did
				+ ", key=" + key + ", msgId=" + msgId + ", requesterId=" + requesterId + ", authToken=" + authToken
				+ "]";
	}
}
