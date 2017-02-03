package org.egov.eis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseInfo {
	@JsonProperty("api_id")
	private String apiId = null;

	@JsonProperty("ver")
	private String ver = null;

	@JsonProperty("ts")
	private String ts = null;

	@JsonProperty("res_msg_id")
	private String resMsgId = null;

	@JsonProperty("msg_id")
	private String msgId = null;

	@JsonProperty("status")
	private String status = null;

	public ResponseInfo(String apiId, String ver, String ts, String resMsgId, String msgId, String status) {
		this.apiId = apiId;
		this.ver = ver;
		this.ts = ts;
		this.resMsgId = resMsgId;
		this.msgId = msgId;
		this.status = status;
	}

	public ResponseInfo apiId(String apiId) {
		this.apiId = apiId;
		return this;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public ResponseInfo ver(String ver) {
		this.ver = ver;
		return this;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public ResponseInfo ts(String ts) {
		this.ts = ts;
		return this;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public ResponseInfo resMsgId(String resMsgId) {
		this.resMsgId = resMsgId;
		return this;
	}

	public String getResMsgId() {
		return resMsgId;
	}

	public void setResMsgId(String resMsgId) {
		this.resMsgId = resMsgId;
	}

	public ResponseInfo msgId(String msgId) {
		this.msgId = msgId;
		return this;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public ResponseInfo status(String status) {
		this.status = status;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apiId == null) ? 0 : apiId.hashCode());
		result = prime * result + ((msgId == null) ? 0 : msgId.hashCode());
		result = prime * result + ((resMsgId == null) ? 0 : resMsgId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		if (!(obj instanceof ResponseInfo))
			return false;
		ResponseInfo other = (ResponseInfo) obj;
		if (apiId == null) {
			if (other.apiId != null)
				return false;
		} else if (!apiId.equals(other.apiId))
			return false;
		if (msgId == null) {
			if (other.msgId != null)
				return false;
		} else if (!msgId.equals(other.msgId))
			return false;
		if (resMsgId == null) {
			if (other.resMsgId != null)
				return false;
		} else if (!resMsgId.equals(other.resMsgId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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
		return "ResponseInfo [apiId=" + apiId + ", ver=" + ver + ", ts=" + ts + ", resMsgId=" + resMsgId + ", msgId="
				+ msgId + ", status=" + status + "]";
	}
}
