package net.rapidhashing.jsonbenchmarks;

import java.util.Map;

public class JsonRpcCall {
	private String jsonrpc;
	private String method;
	private int id;
	private Map<String, Object> params;

	public JsonRpcCall() {

	}

	public JsonRpcCall(String jsonrpc, String method, int id, Map<String, Object> params) {
		this.jsonrpc = jsonrpc;
		this.method = method;
		this.id = id;
		this.params = params;
	}

	public int getId() {
		return id;
	}

	public String getJsonrpc() {
		return jsonrpc;
	}

	public String getMethod() {
		return method;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
}
