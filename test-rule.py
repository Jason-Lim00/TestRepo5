if extraHeaders:
        headers.update(extraHeaders)
        conn = http.client.HTTPSConnection(host, 443,
                                           context = ssl._create_unverified_context())
requestQueryParams = "?" + params if params else ""
conn.request(method, host + url + requestQueryParams, json.dumps(data), headers)
