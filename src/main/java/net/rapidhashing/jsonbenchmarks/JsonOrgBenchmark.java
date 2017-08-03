package net.rapidhashing.jsonbenchmarks;

import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

public class JsonOrgBenchmark {
	private static final String TEST_INPUT = "{\"jsonrpc\": \"2.0\", \"method\": \"login\", \"params\": {\"username\": \"3495843958\", \"password\": \"hunter2\", \"user-agent\": \"not-a-botnet-0.1\"}, \"id\": 1}";

	@Benchmark
	public void benchmarkDecode(Blackhole bh) {
		JSONObject decodedCall = new JSONObject(TEST_INPUT);
		JSONObject decodedParams = decodedCall.getJSONObject("params");

		bh.consume(decodedCall);
		bh.consume(decodedParams);
	}

	@Benchmark
	public void benchmarkEncode(Blackhole bh) {
		JSONObject params = new JSONObject();
		params.put("username", "3495843958");
		params.put("password", "hunter2");
		params.put("user-agent", "not-a-botnet-0.1");

		JSONObject call = new JSONObject();
		call.put("jsonrpc", "2.0");
		call.put("method", "login");
		call.put("params", params);
		call.put("id", 1);

		String str = call.toString();

		bh.consume(str);
	}
}
